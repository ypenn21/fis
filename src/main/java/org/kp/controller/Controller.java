package org.kp.controller;

import org.kp.processors.Processor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@org.springframework.stereotype.Controller
public class Controller {

    private Logger logger = Logger.getLogger(Processor.class.getName());

    @RequestMapping(value = "/json/test", method = RequestMethod.GET)
    @ResponseBody
    public Map testRestApi() {
        Map mymap = new HashMap();
        mymap.put("test", "yanni-peng2");
        return mymap;
    }

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/environment/test", method = RequestMethod.GET)
    @ResponseBody
    public Map testEnvironment() {
        String test = System.getenv("test");
        logger.info("environment variable is: "+test);
        Map mymap = new HashMap();
        mymap.put("test", test);
        return mymap;
    }

    @RequestMapping("/greeting/test")
    @ResponseBody
    public Map greeting(@RequestParam(value="name", defaultValue="World") String name) {
//        String test = System.getenv("test");
//        logger.info("environment variable is: "+test);
        Map mymap = new HashMap();
        mymap.put(counter.incrementAndGet()+"", String.format(template, name));
        return mymap;
    }
}

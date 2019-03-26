package org.kp.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = "/json/test", method = RequestMethod.GET)
    @ResponseBody
    public Map testRestApi() {
        Map mymap = new HashMap();
        mymap.put("test", "yanni-peng2");
        return mymap;
    }

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Map greeting(@RequestParam(value="name", defaultValue="World") String name) {
        String test = System.getenv("test");
        Map mymap = new HashMap();
        mymap.put(counter.incrementAndGet(), String.format(template, name));
        mymap.put("test", test);
        return mymap;
    }
}

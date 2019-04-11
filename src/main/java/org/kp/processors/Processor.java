package org.kp.processors;

import java.util.logging.Logger;

import org.apache.camel.Exchange;
import org.apache.camel.ProducerTemplate;

import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class Processor implements org.apache.camel.Processor {
	
	private Logger logger = Logger.getLogger(Processor.class.getName());
	
	ProducerTemplate producer;
	
	private Boolean header;
	
	private Boolean fieldNames;
	
	private CsvSchema schema;

	
	public Processor(Boolean header, String fieldNames) throws Exception{
		return;
	}

	@Override
	public void process(Exchange arg0) throws Exception {
		logger.info("process the file yanni de2bugging x5");
		return;
	}

	public void setProducer(ProducerTemplate producer){
		this.producer = producer;
	}

	public Boolean getHeader() {
		return header;
	}

	public void setHeader(Boolean header) {
		this.header = header;
	}

	public Boolean getFieldNames() {
		return fieldNames;
	}

	public void setFieldNames(Boolean fieldNames) {
		this.fieldNames = fieldNames;
	}

	
}




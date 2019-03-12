package org.kp.utils;

import org.apache.camel.Exchange;
import org.apache.camel.PropertyInject;

public class Utils {
	
	@PropertyInject("json.array.title")
	private String strTitle;

	
	public void parseStringToJson(Exchange exchange)
	{
		String jsonStr = exchange.getIn().getBody(String.class);
		
		jsonStr = jsonStr.replaceAll("\"", "\' ");
		
		jsonStr = "{" + "'" + strTitle + "' : " + jsonStr + "}";


		exchange.getOut().setBody(jsonStr);
	}
		
	
	


}

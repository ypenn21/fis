package org.kp;
import org.apache.camel.Attachment;
import org.apache.camel.Exchange;
import org.apache.camel.InvalidPayloadException;
import org.apache.camel.Message;
import org.apache.camel.component.bean.BeanEndpoint;
import org.apache.camel.impl.DefaultExchange;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kp.processors.CSVToJson;
import org.kp.utils.Utils;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.activation.DataHandler;
import java.util.Map;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class ProcessorsTest {

    Utils utils = new Utils();

	@Test
	public void writeAsJson() {
		Message msg = new Message() {
			@Override
			public String getMessageId() {
				return null;
			}

			@Override
			public void setMessageId(String s) {

			}

			@Override
			public Exchange getExchange() {
				return null;
			}

			@Override
			public boolean isFault() {
				return false;
			}

			@Override
			public void setFault(boolean b) {

			}

			@Override
			public Object getHeader(String s) {
				return null;
			}

			@Override
			public Object getHeader(String s, Object o) {
				return null;
			}

			@Override
			public <T> T getHeader(String s, Class<T> aClass) {
				return null;
			}

			@Override
			public <T> T getHeader(String s, Object o, Class<T> aClass) {
				return null;
			}

			@Override
			public void setHeader(String s, Object o) {

			}

			@Override
			public Object removeHeader(String s) {
				return null;
			}

			@Override
			public boolean removeHeaders(String s) {
				return false;
			}

			@Override
			public boolean removeHeaders(String s, String... strings) {
				return false;
			}

			@Override
			public Map<String, Object> getHeaders() {
				return null;
			}

			@Override
			public void setHeaders(Map<String, Object> map) {

			}

			@Override
			public boolean hasHeaders() {
				return false;
			}

			@Override
			public Object getBody() {
				return "Yanni test";
			}

			@Override
			public Object getMandatoryBody() throws InvalidPayloadException {
				return null;
			}

			@Override
			public <T> T getBody(Class<T> aClass) {

				return (T) "yanni test";
			}

			@Override
			public <T> T getMandatoryBody(Class<T> aClass) throws InvalidPayloadException {
				return null;
			}

			@Override
			public void setBody(Object o) {

			}

			@Override
			public <T> void setBody(Object o, Class<T> aClass) {

			}

			@Override
			public Message copy() {
				return null;
			}

			@Override
			public void copyFrom(Message message) {

			}

			@Override
			public void copyAttachments(Message message) {

			}

			@Override
			public DataHandler getAttachment(String s) {
				return null;
			}

			@Override
			public Attachment getAttachmentObject(String s) {
				return null;
			}

			@Override
			public Set<String> getAttachmentNames() {
				return null;
			}

			@Override
			public void removeAttachment(String s) {

			}

			@Override
			public void addAttachment(String s, DataHandler dataHandler) {

			}

			@Override
			public void addAttachmentObject(String s, Attachment attachment) {

			}

			@Override
			public Map<String, DataHandler> getAttachments() {
				return null;
			}

			@Override
			public Map<String, Attachment> getAttachmentObjects() {
				return null;
			}

			@Override
			public void setAttachments(Map<String, DataHandler> map) {

			}

			@Override
			public void setAttachmentObjects(Map<String, Attachment> map) {

			}

			@Override
			public boolean hasAttachments() {
				return false;
			}

			@Override
			public String createExchangeId() {
				return null;
			}
		};

		DefaultExchange exchange = new DefaultExchange(new BeanEndpoint() );
		exchange.setIn(msg);
        utils.parseStringToJson(exchange);
	}

}
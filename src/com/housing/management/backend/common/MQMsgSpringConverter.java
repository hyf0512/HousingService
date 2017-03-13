package com.housing.management.backend.common;

import java.io.Serializable;

import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.log4j.Logger;
import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;

public class MQMsgSpringConverter implements MessageConverter {
	
	private static final Logger logger = Logger.getLogger(MQMsgSpringConverter.class);

	public Message toMessage(Object object, Session session)
			throws JMSException, MessageConversionException {
		return session.createObjectMessage((Serializable) object);
	}

	public Object fromMessage(Message message) throws JMSException,
			MessageConversionException {
		logger.info("got msg" + message.getClass());
		String data = null;

		if (message instanceof TextMessage) {
			return message;
		}

		if (message instanceof BytesMessage) {
			BytesMessage msg = (BytesMessage) message;
			byte[] buff = null;
			try {

				long length = msg.getBodyLength();

				buff = new byte[(int) length];

				msg.readBytes(buff);

				data = new String(buff, "UTF-8");
			}

			catch (Exception e){
				logger.error(e.getMessage(), e); 
			}

		}
		return (Object) data;
	}

}

package com.housing.management.backend.ws;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class WsClinetAuthHandler implements CallbackHandler {

	
	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		for (int i = 0; i < callbacks.length; i++) {
			WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
			int usage = pc.getUsage();

			if (usage == WSPasswordCallback.USERNAME_TOKEN) {
			
			} 
		}
	}
}
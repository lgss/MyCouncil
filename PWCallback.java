package uk.gov.selfserve;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.ws.security.WSPasswordCallback;

/**
 * PWCallback for the Client
 */
public class PWCallback implements CallbackHandler {

    /**
     * @see javax.security.auth.callback.CallbackHandler#handle(javax.security.auth.callback.Callback[])
     */
    public void handle(Callback[] callbacks) throws IOException,
                    UnsupportedCallbackException {
        for (int i = 0; i < callbacks.length; i++) {
            if (callbacks[i] instanceof WSPasswordCallback) {
                WSPasswordCallback pc = (WSPasswordCallback)callbacks[i];
                // set the password given a username
                if ("MyCouncil".equals(pc.getIdentifier())) 
				{
                    pc.setPassword("password");
                }
            } else {
                throw new UnsupportedCallbackException(callbacks[i], "Unrecognized Callback");
            }
        }
    }
}
package uk.gov.selfserve;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.ws.security.WSPasswordCallback;

public class PWCallback implements CallbackHandler {

    public void handle(Callback[] callbacks) throws IOException,
                    UnsupportedCallbackException {
        for (int i = 0; i < callbacks.length; i++) {
            if (callbacks[i] instanceof WSPasswordCallback) {
                WSPasswordCallback pc = (WSPasswordCallback)callbacks[i];
 				if ("PayLinkXML".equals(pc.getIdentifier()))
				{
					pc.setPassword("0nl1n£P@ym£nt$");
				}
                if ("MyCouncil".equals(pc.getIdentifier())) 
				{
                    pc.setPassword("N; 9#\"b");
                }
            } else {
                throw new UnsupportedCallbackException(callbacks[i], "Unrecognized Callback");
            }
        }
    }
}
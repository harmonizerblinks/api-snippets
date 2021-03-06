import com.twilio.Twilio;
import com.twilio.rest.messaging.v1.service.AlphaSender;

public class Example {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "your_auth_token";

    public static void main(String[] args) {
        // Initialize the client
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        String pathServiceSid = "MG2172dd2db502e20dd981ef0d67850e1a";
        String pathSid = "AIc781610ec0b3400c9e0cab8e757da937";
        AlphaSender.deleter(pathServiceSid, pathSid).delete();
    }
}

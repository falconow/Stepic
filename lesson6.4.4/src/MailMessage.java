import java.util.stream.Stream;

public class MailMessage extends AbstractSendable<String> {
    private String Message;

    public MailMessage(String From, String To, String Message) {
       super(From,To,Message);
    }
}

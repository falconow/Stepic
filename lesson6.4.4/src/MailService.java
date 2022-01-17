import javax.swing.text.AbstractDocument;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {
    Map<String, List<T>> mailBox = new MyHashMap();

    @Override
    public void accept(Sendable<T> tSendable) {
        List<T> list = mailBox.get(tSendable.getTo()) == null ? new ArrayList<>():mailBox.get(tSendable.getTo());
        list.add(tSendable.getContent());
        mailBox.put(tSendable.getTo(),list);
    }

    public Map<String, List<T>> getMailBox(){
        return mailBox;
    }

    class MyHashMap extends HashMap {
        @Override
        public Object get(Object key) {
            return super.get(key)==null ? new ArrayList<T>():super.get(key);
        }
    }
 }

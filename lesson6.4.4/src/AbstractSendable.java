import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractSendable<T> implements Sendable<T>  {

    protected final String from;
    protected final String to;
    protected final T content;


    public AbstractSendable(String from, String to, T content) {
        this.from = from;
        this.to = to;
        this.content=content;

    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public T getContent() {
        return content;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractSendable that = (AbstractSendable) o;

        if (!from.equals(that.from)) return false;
        if (!to.equals(that.to)) return false;

        return true;
    }

}
import java.util.List;
import java.util.Map;

public interface Sendable<T> {
    String getFrom();
    String getTo();
    T getContent();
}
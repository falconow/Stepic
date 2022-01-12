import java.util.Objects;

class Pair<I,S>  {
    private final I value1;
    private final S value2;

    private Pair (I value1, S value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public static <I,S> Pair<I,S> of (I value1, S value2) {
        return new Pair<>(value1,value2);
    }

    public I getFirst() {
        return value1;
    }

    public S getSecond() {
        return value2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Pair)) {
           return false;
        }

        Pair<?,?> other = (Pair<?, ?>) obj;
        return Objects.equals(value1, other.value1) && Objects.equals(value2,other.value2);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value1)+Objects.hashCode(value2);
    }
}

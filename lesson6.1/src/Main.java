import java.util.Optional;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "1");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        //System.out.println(i+" "+s);

        Pair<Integer, String> pair2 = Pair.of(1, null);
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!

        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);

        Optional t;
        BiConsumer t1;
    }

}

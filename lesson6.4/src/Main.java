import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        //Первая задача
        //System.out.println(pseudoRandomStream(13));
    }


    //Вторая задача
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> list = stream.collect(Collectors.toList());
        if (!list.isEmpty()) {
            //Optional<? extends  T> max = list.stream().max(order);
            //Optional<? extends  T> min = list.stream().min(order);
            minMaxConsumer.accept(list.stream().min(order).get(),list.stream().max(order).get());
        } else {
            minMaxConsumer.accept(null,null);
        }
    }






    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed,n-> n*n/10%1000);
    }
}

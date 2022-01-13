import com.sun.istack.internal.NotNull;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);set1.add(2);set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(0);set2.add(1);set2.add(2);
        System.out.println(symmetricDifference(set1,set2));
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> result = new HashSet<>();
        for (T i:set1) {
            if (!set2.contains(i)) result.add(i);
        }
        for (T i:set2) {
            if (!set1.contains(i)) result.add(i);
        }
        return result;
    }
}

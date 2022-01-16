import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType;

import javax.xml.stream.events.Characters;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main2 {

    public static void main(String[] args) throws IOException {
        Map<String,Integer> map = new HashMap<>();
        Reader reader = new InputStreamReader(System.in,StandardCharsets.UTF_8);
        Scanner scanner = new Scanner(reader).useDelimiter("[\\p{Space}\\p{Punct}]+");

        while (scanner.hasNext()) {
            String element = scanner.next().toLowerCase(Locale.ROOT);
            int count = map.containsKey(element) ? map.get(element)+1:1;
            map.put(element,count);
        }
        scanner.close();



        map.entrySet().stream()
                .sorted(Comparator.comparingInt(Map.Entry::getValue))
                .forEach(x->System.out.println(x));













    }
}

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main2 {
    //Задача 3
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
                .sorted((x,y) -> {
                    int result;
                    result = y.getValue() - x.getValue();
                    result = result == 0 ? x.getKey().compareTo(y.getKey()):result;
                    return result;
                })
                .limit(10)
               .forEach(x->System.out.println(x.getKey()));
    }
}

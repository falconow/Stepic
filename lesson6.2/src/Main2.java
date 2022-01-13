import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in)
                .useDelimiter(" ");
        int i=0;
        while (scanner.hasNextInt()) {
            Integer element = scanner.nextInt();
            if(i%2==1) {
                list.add(element);
            }
            i++;
        }
        scanner.close();
        Collections.reverse(list);
        StringBuilder result = new StringBuilder();
        for(Integer element: list) {
            result.append(element).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}

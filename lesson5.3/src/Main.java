import java.io.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Reader reader = new InputStreamReader(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        //Reader reader = new StringReader("-1e3\n" + "18 .111 11bbb");
        Scanner scanner = new Scanner(reader);

        double result=0;
        while (scanner.hasNext()) {
            String s = scanner.next();
            try{
                double d = Double.parseDouble(s);
                result = result + d;
            } catch (NumberFormatException ignored) {}
        }
        printWriter.printf("%6f",result);
        printWriter.flush();
        printWriter.close();
    }
}

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main_0 {

    public static void main(String[] args) throws IOException {

        //Тест вопроса
//        Writer writer = new OutputStreamWriter(System.out, StandardCharsets.US_ASCII);
//        writer.write((char) 220);
//        writer.flush();
//        writer.close();\
        System.out.println(readAsString(new ByteArrayInputStream(new byte[] {48, 49,50,51}),StandardCharsets.US_ASCII));


    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        StringBuilder result = new StringBuilder();
        int read = reader.read();
        while (read>=0) {
            result.append((char) read);
            read = reader.read();
        }
        return result.toString();
    }
}

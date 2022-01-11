import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStream inputStream2 = new ByteArrayInputStream(new byte[] {65,13,10,23,13,10,13});
        System.setIn(inputStream2);
        InputStream inputStream = System.in;
        OutputStream outputStream =System.out;

        int read = inputStream.read();
        while (read>=0) {
            int next = inputStream.read();
            if (read !=13 && next !=10) {
                System.out.println(read);
                System.out.println(next);
            } else {
                System.out.println(10);
            }
            read = inputStream.read();
        }

        //System.out.flush();
    }


    //Первая задача
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int sum=0;
        int read = inputStream.read();
        while (read>=0) {
            sum = Integer.rotateLeft(sum,1)^read;
            read=inputStream.read();
        }
        return sum;
    }

}

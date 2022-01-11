import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        InputStream inputStream2 = new ByteArrayInputStream(new byte[] {65,13,23,13,10,13});
        System.setIn(inputStream2);
        InputStream inputStream = System.in;
        OutputStream outputStream =System.out;

        int read = inputStream.read();
        while (read>=0) {
            if (read==13) {
                int read2 = inputStream.read();
                if (read==13 && read2==10) {
                    //System.out.println(10);
                    outputStream.write(10);
                } else {
                    outputStream.write(read);
                    if (read2>0) {
                        outputStream.write(read2);
                    };
                }
            } else {
                outputStream.write(read);
            }
            read = inputStream.read();
        }
        System.out.flush();
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

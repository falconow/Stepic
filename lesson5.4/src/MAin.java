import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class MAin {

    public static void main(String[] args)  {


    }

    public static Animal[] deserializeAnimalArray(byte[] data) throws IOException {
        Animal deserializedAnimal;
        InputStream inputStream = new ByteArrayInputStream(data);
        try(ObjectInputStream ois = new ObjectInputStream(inputStream)) {
            int size = ois.readInt();
            Animal[] resultAnimal = new Animal[size];
            for (int i=0;i<size;i++) {
                try {
                    deserializedAnimal = (Animal) ois.readObject();
                    resultAnimal[i] = deserializedAnimal;

                } catch (Exception e) {
                    throw new IllegalArgumentException();
                }
            }
            return resultAnimal;
         } catch (IOException e) {
            throw new IllegalArgumentException();
        }
    }


}

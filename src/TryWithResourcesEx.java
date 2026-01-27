import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class TryWithResourcesEx {

    public static void main(String[] args) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/");
            InputStream stream = new FileInputStream("/java");

            String msg = "hello World";
            byte[] bytes = msg.getBytes();
            fileOutputStream.write(bytes);

        } catch (Exception e) {

        }

    }


}

package ClassExample.java_09.bytestreamtest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharacterStreamTest {
    public static void main(String[] args) {
        // Checked Exception => Byte Stream(FileInputStream) -> Character Stream(InputStreamReader)
        // [5] InputStreamReader / OutputStreamWriter
        try (
            InputStreamReader in = new InputStreamReader(new FileInputStream("./app/src/main/java/ClassExample/java09/bytestreamtest/test.txt"));
            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("./app/src/main/java/ClassExample/java09/bytestreamtest/test-out-05.txt"))
        ) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("[5] InputStreamReader / OutputStreamWriter");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [6] FileReader / FileWriter
        try (
            FileReader in = new FileReader("./app/src/main/java/ClassExample/java09/bytestreamtest/test06.txt");
            FileWriter out = new FileWriter("./app/src/main/java/ClassExample/java09/bytestreamtest/test-out-06.txt")
            ) {
                int c;
                while ((c = in.read()) != -1) {
                    out.write(c);
            }
            System.out.println("[6] FileReader / FileWriter");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

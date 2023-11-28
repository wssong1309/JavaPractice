package ClassExample.java_09.bytestreamtest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest {
    public static void main(String[] args) {
        // [1] FileInputStream / FileOutputStream
        // Checked Exception
        FileInputStream oldIn = null;
        FileOutputStream oldOut = null;

        try {
            oldIn = new FileInputStream("./app/src/main/java/ClassExample/java09/bytestreamtest/test.txt");
            oldOut = new FileOutputStream("./app/src/main/java/ClassExample/java09/bytestreamtest/test-out-01.txt");

            int c;
            while ((c = oldIn.read()) != -1) {
                oldOut.write(c);
            }
            System.out.println("[1] FileInputStream / FileOutputStream");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oldIn != null)
                    oldIn.close();
                if (oldOut != null)
                    oldOut.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        // [2] try ~ with ~ resources
        try (
            FileInputStream in = new FileInputStream("./app/src/main/java/ClassExample/java09/bytestreamtest/test-out-01.txt");
            FileOutputStream out = new FileOutputStream("./app/src/main/java/ClassExample/java09/bytestreamtest/test-out-02.txt")
            ) {
                int c;
                while ((c = in.read()) != -1) {
                    out.write(c);
                }
                System.out.println("[2] try ~ with ~ resources");
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            
            // [3] BufferedInputStream / BufferedOutputStream
        try (
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("./app/src/main/java/ClassExample/java09/bytestreamtest/test-out-02.txt"));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("./app/src/main/java/ClassExample/java09/bytestreamtest/test-out-03.txt"))
            ) {
                int c;
                while ((c = in.read()) != -1) {
                    out.write(c);
                }
            System.out.println("[3] BufferedInputStream / BufferedOutputStream");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

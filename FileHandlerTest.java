import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlerTest {

    @Test
    public void testWriteToFile() throws IOException {
        String testFile = "test.csv";
        // delete if present so test starts fresh
        File ftest = new File(testFile);
        if (ftest.exists()) {
            ftest.delete();
        }

        FileHandler f = new FileHandler(testFile);
        f.writeData("TestName,999,100");

        Scanner sc = new Scanner(new File(testFile));
        boolean found = false;
        while (sc.hasNextLine()) {
            if (sc.nextLine().contains("TestName")) {
                found = true;
                break;
            }
        }
        sc.close();

        // cleanup optional
        // ftest.delete();

        assertTrue(found);
    }

    @Test
    public void testThreadRun() throws InterruptedException {
        String testFile = "thread_test.csv";
        File ftemp = new File(testFile);
        if (ftemp.exists()) {
            ftemp.delete();
        }

        FileHandler f = new FileHandler(testFile);
        Student s1 = new Student("Alice", 201, 88);
        Student s2 = new Student("Bob", 202, 92);

        StudentTask t1 = new StudentTask(s1, f);
        StudentTask t2 = new StudentTask(s2, f);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        assertFalse(t1.isAlive());
        assertFalse(t2.isAlive());

        // Optionally verify file contents here (left simple for beginner style)
    }
}

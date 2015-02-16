package Test_Rybin;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by eredin on 15.02.2015.
 */

public class Test1 {

                     // Чтение из файла
    @Test
    public void T1() {
        FileReader fr = null;
        try {
            fr = new FileReader("C:\\_git\\file1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
    }
    Scanner scan = new Scanner(fr);
    String string = "";
    while (scan.hasNextLine()) {
        string = scan.nextLine();
    }
    Assert.assertEquals(string, "abc123");
    }

                            // проверка на real
    @Test
    public void T2() {
        String var = "89789789.9898654";
        Assert.assertTrue(var.matches("^\\d+(\\.\\d+)"));
    }
}




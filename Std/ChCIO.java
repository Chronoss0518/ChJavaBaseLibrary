package ChJavaBaseLibrary.Std;

import java.io.*;

public class ChCIO {
    public static void Printf(String _str) {
        System.out.print(_str);
    }

    public static String Scanf() {
        String test = new String("");

        try {

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader buf = new BufferedReader(isr);
            test = buf.readLine();

        } catch (Exception e) {
            // TODO: handle exception
            return "";
        }
        return test;
    }

}
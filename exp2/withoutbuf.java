import java.io.FileInputStream;
import java.io.IOException;

public class withoutbuf {
    public static void main(String[] args) {
            long starttime=System.currentTimeMillis();

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\E 555\\Desktop\\2141013256\\exp2\\lfile.text");
            int data;
            while ((data = fis.read()) != -1) {
              //  System.out.println("data:" + data + " " + (char) data);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        long endtime=System.currentTimeMillis();
        long duration=endtime-starttime;
        System.out.println("duration without buffer "+duration+"ms");

    }
}

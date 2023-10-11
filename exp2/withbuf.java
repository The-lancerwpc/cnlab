import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
public class withbuf{
    public static void main(String[] args) {
        String filepath="C:\\Users\\E 555\\Desktop\\2141013256\\exp2\\lfile.text";
        long starttime=System.currentTimeMillis();
        try(InputStream InputStream=new BufferedInputStream(new FileInputStream(filepath))){
        // file is opened using FileInputStream and wrapped in buffered InputStream

        int bytesRead;
        byte[]buffer=new byte[1024];//read in 1kb chunks
        while(( bytesRead =InputStream.read(buffer))!=-1){ //file is traversed here
            //pross the data(e.g. write to another file)
            //returns -1 for no file
        }

    }catch(IOException e){
        e.printStackTrace();
    }
    long endtime=System.currentTimeMillis();
    long duration=endtime-starttime;
    System.out.println("duration with buffer "+duration+"ms");



    }
}

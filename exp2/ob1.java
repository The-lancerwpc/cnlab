
import java.io.FileOutputStream;
import java.io.IOException;


public class ob1 {
public static void main(String [] args){
    
  // Path path = Paths.get("C:\\Users\\E 555\\Desktop\\2141013256\\test\\src\\test\\ss.txt");
 
  try{
    //Files.writeString(path, a, StandardCharsets.UTF_16BE);
    FileOutputStream fout = new FileOutputStream("C:\\Users\\E 555\\Desktop\\2141013256\\ss.text");
     String a ="welcome to cn class";


    byte b[]=a.getBytes();//converting string to byte array
    fout.write(b);
    fout.close();
    System.out.println("success");
  }

catch(IOException e){
    System.out.println(e);


}



}
}

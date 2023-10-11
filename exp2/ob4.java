    import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ob4 {

    
   
    public static void main(String args[]) throws IOException {
    File file = new File("text.txt");
    BufferedReader br= new BufferedReader(new FileReader(file));
    String st;
    while ((st = br.readLine()) != null)
    try {
    FileWriter myWriter = new FileWriter("text2.txt");
    myWriter.write(st);
    myWriter.close();
    System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
    }
    }
    
    }  


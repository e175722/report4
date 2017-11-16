import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class report4 {
    public static void main(String[] args){
        try {
            String str = null;
            str.length();
        }catch(NullPointerException npe){
            System.out.println("NullPointerExceptionが発生しました");
            System.out.println(npe.getMessage());
        }
    }
}

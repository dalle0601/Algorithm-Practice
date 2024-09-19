import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    
    public static void main(String[] args){
        Date now = new Date();
        SimpleDateFormat newDtFormat = new SimpleDateFormat("yyyy-MM-dd");
        String nowDate = newDtFormat.format(now); 
		System.out.println(nowDate);
    }
}
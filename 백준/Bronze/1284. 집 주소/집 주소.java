import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String number = br.readLine();
            if(number.equals("0")){
                break;
            }
            
            int totalSize = 1;
            for(int i = 0; i < number.length(); i++){
                if(number.charAt(i) == '1') {
                    totalSize += 2;
                } else if (number.charAt(i) == '0') {
                    totalSize += 4;
                } else {
                    totalSize += 3;
                }
                totalSize += 1;
            }
            System.out.println(totalSize);
        }
	}
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputValue = sc.nextInt();

        int pathValue = 0;
        int tempValue = 1;
        while(true) {
            if( (6 * pathValue) + tempValue >= inputValue ){
                pathValue++;
                break;
            } else {
                tempValue = (6 * pathValue) + tempValue;
                pathValue++;
            }
        }
        System.out.println(pathValue);
    }
}

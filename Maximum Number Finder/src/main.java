
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter First Number");
        int first_num = scanner.nextInt();
        
        System.out.println("Enter Second Number");
        int second_num = scanner.nextInt();
        
        System.out.println("Enter Third Number");
        int third_num = scanner.nextInt();
        
        int biggest_num;
        
        if (first_num >= second_num && first_num >= third_num) {
            biggest_num = first_num;
        } else if (second_num >= first_num && second_num >= third_num) {
            biggest_num = second_num;
        } else {
            biggest_num = third_num;
        }
        
        System.out.println("The largest number is : " + biggest_num);
    }
}

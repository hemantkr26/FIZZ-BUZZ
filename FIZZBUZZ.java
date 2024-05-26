
/*Interview question
 * If the number is multiple of 3 , you have to print FIZZ.
 * If the number is multiple of 5 , you have to print BUZZ.
 * If the number is multiple of 3 and 5, you have to print FIZZ-BUZZ.
 * If the number doesn't multiple of those number , you have to print exact the same number.
 */
import java.util.*;

public class FIZZBUZZ {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int num = sc.nextInt();
        if (num % 15 == 0) {
            System.out.println("FIZZ-BUZZ");
        } else if (num % 3 == 0) {
            System.out.println("FIZZ");
        } else if (num % 5 == 0) {
            System.out.println("BUZZ");
        } else {
            System.out.println(num);
        }
    }
}
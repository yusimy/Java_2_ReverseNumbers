import java.util.Scanner;
public class ReverseNumbers {
    public static void main(String[] args) {
        System.out.print("Please enter number: ");
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        int ans = 0;
        while (no>0){
            int rem = no%10;
            no/=10;
            ans = (ans*10) + rem;

        }
        System.out.print(ans); // Print final answer
    }
}
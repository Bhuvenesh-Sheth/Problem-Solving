import java.util.Scanner;

public class Print_Subsets {
    public static void solve(String ip, String op) {
        if (ip.length() == 0) {
            System.out.print(op + " ");
            return;
        }

        String op1 = op;
        String op2 = op;

        op2 += ip.charAt(0);
        ip = ip.substring(1);

        solve(ip, op1);
        solve(ip, op2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input string: ");
        String ip = scanner.nextLine();
        String op = " ";

        solve(ip, op);

        scanner.close();
    }
}

import java.util.Scanner;
    public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            sc.close();
            return;
        }

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " natural numbers = " + sum);

        sc.close();
    }
}

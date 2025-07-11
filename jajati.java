import java.util.Scanner;

public class jajati {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter Second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum: " + sum);
        scanner.close();
    }
}

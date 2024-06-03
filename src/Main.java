import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число a: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Введите целое число b: ");
        int number2 = new Scanner(System.in).nextInt();
        int add = number + number2;
        int sub = number - number2;
        int mult = number * number2;
        double div = (double) number / number2;
        System.out.println("a + b = " + add);
        System.out.println("a - b = " + sub);
        System.out.println("a * b = " + mult);
        System.out.println("a / b = " + div);

    }
}
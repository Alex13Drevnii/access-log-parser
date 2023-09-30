import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число");
        int number2 = new Scanner(System.in).nextInt();

        int sum = number + number2;
        int delta = number - number2;
        int  multip = number * number2;
        double quotient = (double) number / number2;

        System.out.println("Cумма чисел:" + sum);
        System.out.println("Разность чисел:" + delta);
        System.out.println("Произведение чисел:" + multip);
        System.out.println("Деление чисел:" + quotient);
    }
}
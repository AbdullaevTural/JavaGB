import java.util.Scanner;
public class Jsfact {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Произведение чисел от 1 до заданного ");
            System.out.println("=================================================");
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();
            int sum = 1;
            for(int i = 1; i <= n; i++) {
                if (i != n) {
                System.out.print(i + "*");
                sum = sum * i;
                } 
                else {
                System.out.print(i);
                sum = sum * i;
                }
            }
            System.out.print("=" + sum);
        }
    }
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Scanner;

public class program{
   /* static public void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.print(countNumberOne(arr));
    } */
    /*System.out.print("Введите имя: ");
    Scanner str = new Scanner (System.in);
    String name = str.nextLine();
    System.out.print("Привет " + name); 
    }
    
    static public void main2(String[] args){
    System.out.print("Введите Время: ");
    Scanner str = new Scanner (System.in);
    LocalDate dateTime = LocalDate.now(ZoneId.systemDefault());
    LocalDate date
    switch (time) {
        case value:
            
            break;
    
        default:
            break;
    }

    }*/
   
    /*public static int countNumberOne(int[] arr) {
        int count = 0;
        int max = 0;
        for (int arrEl: arr){
            if (arrEl == 0){
                count = 0;
            }
            else{
                count++;
            }
            if (max <= count){
                max = count;
            }
        }
        return max;
    }*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сумма чисел от 1 до заданного ");
        System.out.println("=================================================");
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if (i != n) {
                System.out.print(i + "+");
                sum = sum + i;
            } else {
                System.out.print(i);
                sum = sum + i;
            }
        }
        System.out.print("=" + sum);
     }
    }

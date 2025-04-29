
package JavaIntensive.Informatics;
import java.util.Scanner;

public class Task294 {
    /*
    Входные данные
Даны три целых числа, каждое записано в отдельной строке.

Выходные данные
Выведите наибольшее из данных чисел
 (программа должна вывести ровно одно целое число).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int maxFromFirstTwo = Math.max(num1, num2);
        int max = Math.max(maxFromFirstTwo, num3);
        System.out.println(max);
    }
}

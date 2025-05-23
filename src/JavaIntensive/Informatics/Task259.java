
package JavaIntensive.Informatics;



import java.util.Scanner;

public class Task259 {
    /*
    В каждую крайнюю клетку квадратной доски поставили по фишке.
    Могло ли оказаться, что выставлено ровно 𝑘 фишек?
    (Например, если доска 2×2, то выставлено 4 фишки, а если 6×6 - то 20).

Входные данные
Вводится одно натуральное число 𝑘, не превосходящее 30000

Выходные данные
Программа должна вывести слово YES, если существует такой размер доски,
на который будет выставлено ровно (не больше, и не меньше) 𝑘 фишек,
в противном случае - вывести слово NO.
     */
//    ######
//    ######
//    ######
//    ######
//    ######
//    ######
    // p = 6 +6 +6+ 6
    // P - 4 = 20
    // p= a + b+ a+ b
    // (20 + 4 ) % 4 == 0


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        if (k == 1) {
            System.out.println("YES");
        } else {
            if ((k + 4) % 4 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}


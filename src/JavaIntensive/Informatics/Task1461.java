package JavaIntensive.Informatics;

import java.util.Scanner;

public class Task1461 {
    /*
    В одной компьютерной игре игрок выставляет в линию шарики разных цветов.
    Когда образуется непрерывная цепочка из трех и более шариков одного цвета, она удаляется из линии.
    Все шарики при этом сдвигаются друг к другу, и ситуация может повториться.

Напишите программу, которая по данной ситуации определяет, сколько шариков будет "уничтожено".
Естественно, непрерывных цепочек из трех и более одноцветных шаров в начальный момент может быть не более одной.

Входные данные
Сначала вводится количество шариков в цепочке (не более 1000) и цвета шариков
(от 0 до 9, каждому цвету соответствует свое целое число).

Выходные данные
Требуется вывести количество шариков, которое будет "уничтожено".

Примеры
входные данные
5 1 3 3 3 2
выходные данные
3
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int countSameColors = 1;
        int destroyed = 0;
        for (int i = n-1; i > 0; i--) {
            if(arr[i] == arr[i-1] ){
                countSameColors ++;
            }
            else {
                if(countSameColors >=3 ){
                    destroyed = countSameColors;
                    break;
                } else {
                    countSameColors = 1;
                }
            }
        }
    if(countSameColors>=3 && destroyed ==0){
        destroyed = countSameColors;
    }
        System.out.println(destroyed);
    }
}

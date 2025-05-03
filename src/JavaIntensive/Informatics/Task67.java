
import java.util.Scanner;

public class Task67 {
    /*
    Задача №67. Есть ли два элемента с одинаковыми знаками
Дан массив, состоящий из целых чисел. Напишите программу, которая определяет,
есть ли в массиве пара соседних элементов с одинаковыми знаками.

Входные данные
Сначала задано число 𝑁 — количество элементов в массиве (1≤𝑁≤10000).
Далее через пробел записаны 𝑁 чисел — элементы массива. Массив состоит из целых чисел не равных 0.

Выходные данные
Необходимо вывести слово YES, если существует пара соседних элементов с одинаковыми знаками.
В противном случае следует вывести слово NO.

Примеры
входные данные
5
1 -3 4 -2 1
выходные данные
NO
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        boolean flag = false;
        for (int i = 0; i<n-1 ; i++){
            if((arr[i] >= 0 & arr[i+1] >= 0) | (arr[i] < 0 & arr[i+1] < 0)){
                flag = true;
            }
        }
        String response = flag ? "YES" : "NO";
        System.out.println(response);
    }
}

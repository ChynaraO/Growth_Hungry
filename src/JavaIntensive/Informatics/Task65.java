package JavaIntensive.Informatics;

import java.util.Scanner;

public class Task65 {
    /*
    Дан массив, состоящий из целых чисел. Напишите программу,
    которая подсчитывает количество положительных чисел среди элементов массива.

Входные данные
Сначала задано число 𝑁 — количество элементов в массиве (1≤𝑁≤10000).
Далее через пробел записаны 𝑁 чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
Необходимо единственное число - количество положительных элементов в массиве.

Примеры
входные данные
5
1 2 3 -1 -4

выходные данные
3
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();;
        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i<n ; i++){
            if(arr[i]>0){
                count++;
            }
        }
        System.out.println(count);
    }
}

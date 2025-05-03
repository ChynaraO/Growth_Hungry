package JavaIntensive.Informatics;

import java.util.Scanner;

public class Task63 {
    /*
    Дан массив, состоящий из целых чисел. Нумерация элементов начинается с 0.
    Напишите программу, которая выведет элементы массива, номера которых четны (0, 2, 4...).

Входные данные
Сначала задано число 𝑁 — количество элементов в массиве (1≤𝑁≤100).
Далее через пробел записаны 𝑁 чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
Необходимо вывести все элементы массива с чётными номерами.

Примеры
входные данные
6
4 5 3 4 2 3
выходные данные
4 3 2
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i<n; i+=2){
            System.out.println(arr[i] + " ");
        }
    }
}

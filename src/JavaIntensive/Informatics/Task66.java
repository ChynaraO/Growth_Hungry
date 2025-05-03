package JavaIntensive.Informatics;

import java.util.Scanner;

public class Task66 {
    /*
    Дан массив, состоящий из целых чисел. Напишите программу,
     которая подсчитает количество элементов массива, больших предыдущего (элемента с предыдущим номером).

Входные данные
Сначала задано число 𝑁 — количество элементов в массиве (1≤𝑁≤10000).
 Далее через пробел записаны 𝑁 чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
Необходимо вывести единственное число - количество элементов массива, больших предыдущего.

Примеры
входные данные
5
1 2 3 4 5

выходные данные
4
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        int countOfNumGreaterThanPreviousNum = 0;
        for (int i = n-1; i>0; i--){
            if(arr[i] > arr[i-1]){
                countOfNumGreaterThanPreviousNum ++;
            }
        }
        System.out.println(countOfNumGreaterThanPreviousNum);
    }
}

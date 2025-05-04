package JavaIntensive.Informatics;

import java.util.Scanner;

public class Task70 {
    /*
    Напишите программу, которая переставляет соседние элементы массива
    (1-й элемент поменять с 2-м, 3-й с 4-м и т.д. Если элементов нечетное число,
    то последний элемент остается на своем месте).

Входные данные
Сначала задано число 𝑁 — количество элементов в массиве (1≤𝑁≤35).
Далее через пробел записаны 𝑁 чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
Необходимо вывести массив, полученный после перестановки элементов.

Примеры
входные данные
6
4 5 3 4 2 3

выходные данные
5 4 4 3 3 2
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        if(n%2==0){
            for (int i = 0; i<n; i+=2){
                System.out.print(arr[i+1] + " ");
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = 0; i<n-1; i+=2){
                System.out.print(arr[i+1] + " ");
                System.out.print(arr[i] + " ");
            }
            System.out.println(arr[n-1]);
        }
    }
}

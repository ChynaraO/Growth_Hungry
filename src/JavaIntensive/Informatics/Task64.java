package JavaIntensive.Informatics;


import java.util.Scanner;

public class Task64 {
    /*
    Дан массив, состоящий из целых чисел. Напишите программу,
     которая выводит те элементы массива, которые являются чётными числами.

Входные данные
Сначала задано число 𝑁 — количество элементов в массиве (1≤𝑁≤100).
Далее через пробел записаны 𝑁 чисел — элементы массива. Массив состоит из целых чисел.

Выходные данные
Необходимо вывести все четные элементы массива
 (то есть те элементы, которые являются четными числами).

Примеры
входные данные
5
1 2 3 4 5

выходные данные
2 4
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();;
        int [] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
            for (int i = 0; i < n; i ++) {
                if(arr[i]%2==0){
                    System.out.println(arr[i] + " ");
                }
            }

    }
}

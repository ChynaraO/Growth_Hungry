package JavaIntensive.Informatics;

import java.util.Scanner;

public class Task1457 {
    /*
    Дана последовательность натуральных чисел 1, 2, 3, ..., N (1 ≤ N ≤ 1000).
    Необходимо сначала расположить в обратном порядке часть этой последовательности
     от элемента с номером A до элемента с номером B, а затем от C до D (A < B; C < D; 1 ≤ A, B, C, D ≤ N).

Входные данные
Вводятся натуральные числа числа N, A, B, C, D.

Выходные данные
Требуется вывести полученную последовательность.

Примеры
входные данные
9 2 5 6 9
выходные данные
1 5 4 3 2 9 8 7 6
входные данные
9 3 6 5 8
выходные данные
1 2 6 5 8 7 3 4 9
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();


      reversed(arr , A-1, B-1);
      reversed(arr, C-1, D-1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void reversed(int[] arr, int l, int r){
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++; // 2 3 4 5
            r--; // 5 4 3 2
        }
    }
}

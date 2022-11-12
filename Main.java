package com.company;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
	int[] arr;
    int min = 1;
    int max = 10;
    boolean bool = true;
    arr = new int[8];
    for (int i = 0;i < 8;i++){
        arr[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    for (int i = 1;i < 8;i++){
        if (arr[i] <= arr[i - 1]){
                bool = false;
        }
    }
        for (int i = 0;i < 8;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        if (bool){
            System.out.print("Массив является строго упорядоченной последовательностью!");
        }
        else{
            System.out.print("Массив не является строго упорядоченной последовательностью!");
        }

        for(int i = 0;i < 8;i++){
            if (i % 2 == 1){
                arr[i] = 0;
            }
        }
        System.out.print("\n");

        for (int i = 0;i < 8;i++){
            System.out.print(arr[i] + " ");
        }

    }
}

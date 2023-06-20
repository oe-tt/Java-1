package Lesson_1_dz;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    // 1. генерируем случайное число от 0 до 2000
    public static int random_num (int min, int max) {
        Random random = new Random();
        int i = new Random().nextInt(max - min);
        return i;
    }

    //  2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
    public static int starsh_bit (int i) {
        int n = Integer.toBinaryString(i).length();
        return n;
    }

    //  3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
    public static int [] array1 (int i, int n) {
//        ArrayList<Integer>
        short count = 0;
        for (int k = i; k < Short.MAX_VALUE; k++){
            if (k % n == 0) {count++;}
        }
        int[] arr = new int[count];
        count = 0;
        for (int k = i; k < Short.MAX_VALUE; k++) {
            if (k % n == 0) {
                arr[count] = k;
                count ++; }
        }
        return arr;
    }

    //  4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
    public static int [] array2 (int i, int n) {
        short count = 0;
        for (int k = Short.MIN_VALUE; k < i; k++){
            if (k % n != 0) {count++;}
        }
        int[] arr = new int[count];
        count = 0;
        for (int k = Short.MIN_VALUE; k < i; k++) {
            if (k % n != 0) {
                arr[count] = k;
                count ++; }
        }
        return arr;
    }


    public static void main (String[] args) {
        int min = 0; int max = 2000;
        int i =  random_num (min, max);
        System.out.println("Случайное число: " + i);
        int n = starsh_bit (i);
        System.out.println("Номер старшего бита: " + n);

        int[] arr1 = array1 (i, n);
        System.out.println("Длина массива 1 = " + arr1.length);
        int[] arr2 = array2 (i, n);
        System.out.println("Длина массива 2 = " + arr2.length);
    }
}
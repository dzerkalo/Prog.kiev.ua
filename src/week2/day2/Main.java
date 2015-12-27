package week2.day2;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by acer on 23.12.2015.
 */
public class Main {

    public static void main(String[] args) {

        int[] a = generateArray(10, 30);
        int[] b = generateArray(10, 30);
        int[] c = generateArray(10, 30);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

        System.out.println("Summ = " + sum(a, b, c));
        System.out.println("Summ = " + sumTwo(a, b, c));

    }

    public static int[] generateArray(int from, int to) {
        Random rm = new Random();
        int[] array = new int[from + rm.nextInt(to - from)];
        for (int i = 0; i < array.length; i++) {
            array[i] = rm.nextInt(10);
        }
        return array;
    }

    public static int sum(int[] a, int[] b, int[] c) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }

        for (int i : b) {
            sum += i;
        }

        for (int i : c) {
            sum += i;
        }
        return sum;
    }

    public static int sumTwo(int[] a, int[] b, int[] c) {
        int sum = 0;

        for (int i = 0, stop = 0; stop != 7; i++) {
            try{
                sum += a[i];
            }catch (ArrayIndexOutOfBoundsException e){
                stop = stop | 1;
            }

            try{
                sum += b[i];
            }catch (ArrayIndexOutOfBoundsException e){
                stop = stop | 2;
            }

            try{
                sum += c[i];
            }catch (ArrayIndexOutOfBoundsException e){
                stop = stop | 4;
            }
        }
        return sum;
    }


}

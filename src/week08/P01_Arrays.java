package week08;

import java.util.Arrays;

public class P01_Arrays {
    public static void main(String[] args) {
        /*

          Verilen bir int array'in tum elemanlarini 2 artirip bize donduren bir method
          olusturun. Eski array'i yeni haliyle kaydedin.

        */

        int[] arr= {2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrayaIkiEkle(arr)));

    }

    public static int[] arrayaIkiEkle(int[] arr) {

        int[] yeniArr=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

              arr[i]+=2;

        }

        yeniArr=arr;

        return arr;
    }
}

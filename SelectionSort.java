package cis285Final;

public class SelectionSort {

         /* Selection Sort function */

    public static void sort( int arr[] ){

        int N = arr.length;

        int i, j = 0, pos, temp;

        for (i = 0; i < N; i++) {

            pos = i;

            for (j = i+1; j < N; j++) {

                if (arr[j] < arr[pos]) {

                    /* Swap arr[i] and arr[pos] */

                    temp = arr[j];

                    arr[j] = arr[pos];

                    arr[pos]= temp;
                }

            }

        }

      }

}

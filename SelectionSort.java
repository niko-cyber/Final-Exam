
public class SelectionSort {

         /* Selection Sort function */

    public int[] sort( int arr[] ){

        int N = arr.length;

        int i, j, temp;
        temp=arr[0];

        for (i = 0; i < N-1; i++)

        {



            for (j = i+1; j < N; j++)

            {

                if (arr[i] > arr[j])

                {

                	 temp = arr[i];

                     arr[i] = arr[j];

                     arr[j]= temp;

                }

            }





        }
return arr;
      }

}

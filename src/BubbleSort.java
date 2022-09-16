import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={3,7,5,2,9,80};

        //we are implementing bubble sort

        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length-1-i;j++){

                /*
                * here goes the secret sauce to make bubble sort interesting
                * the second loop runs less time than the first one
                * to enhance the speed we have subtracted -i in every iteration as the sorted element will
                * take the last positions
                */

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}

import java.util.Arrays;

public class DuplicateZeros {

    static void addZeros (int[] arr) {

        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] == 0) {
                //System.out.println("Found zero");
                for(int j = arr.length-1; j>i; j--) {
                    //System.out.println("arr[j] = " + arr[j]);
                    //System.out.println("arr[j-1] = " + arr[j-1]);
                    arr[j] = arr[j-1];
                }
                arr[i+1]=0;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main (String[] args) {
        int[] array = {1,0,2,3,0,4,5,0}; // output [1,0,0,2,3,0,0,4]
        addZeros(array);

    }
}

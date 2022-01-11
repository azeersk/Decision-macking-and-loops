import java.util.Arrays;

public class averageClass {
    public static void main(String[] args){
        //Calculate Average Using Arrays
        int[] arr = {12,3,4,5,78,45,62,23,-34,45,-6,-23};
        double ArraySum = 0;
        for(int i=0; i<arr.length; i++){
            ArraySum = ArraySum + arr[i];
        }
        double average = ArraySum/arr.length;
        System.out.printf("The average of the array: %.2f", average);

        //The Largest Element of an Array
        System.out.println();
        System.out.println(Arrays.stream(arr).max());

        
    }
}

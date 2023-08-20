package One_d_array;

//Reverse Array Problem

//Time And Space Complexity:O(n)
//Space Coplexity:O(1)
public class One_d1 {

    public static void main(String[] args) {

        int array[] = { 2, 4, 8, 10, 12, 14 };

        int temp = 0;

        for (int i = 0; i < array.length / 2; i++) {

            // Swap the Elements Between arra[i] And arr[n-i-1]
            temp = array[i]; // data store honar temp madhe
            array[i] = array[array.length - i - 1]; // array index 0 and last index compare

            array[array.length - i - 1] = temp; // jo compare kelela data aahe temp check honar

        }
        System.out.println("Reversal of An Array is:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

}

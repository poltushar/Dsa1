package One_d_array;

//Missing in an Array

public class One_d2 {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 4, 7, 6, 5 };
        int n = arr.length;

        // Sum of Natuaral Numbers in an Array
        int sum_Natural_Num = (n + 1) * (n + 2) / 2;
        int sum = 0;

        // sum of current elements present in array
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        int Missing_elem = 0;
        Missing_elem = sum_Natural_Num - sum;
        System.out.println("Missing Element in Array is: " + Missing_elem);

    }

}

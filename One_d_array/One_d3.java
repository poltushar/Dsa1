package One_d_array;

//Duplicate Element  in an Array
public class One_d3 {

    public static void main(String[] args) {

        int arr[] = { 2, 4, 4, 7, 6, 6, 10 };

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j])
                    System.out.println("Duplicate elements Found  is:" + arr[i]);
            }

        }

    }
}

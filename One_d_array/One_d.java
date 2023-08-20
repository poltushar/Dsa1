package One_d_array;

//this program is a palindrome array
//time complexity:O(n)
//space complexity:O(1)
public class One_d {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 2, 1 };
        int n = array.length;
        boolean flag = false; // boolean (false) according to gfg

        for (int i = 0; i < n / 2; i++) {

            if (array[i] != array[n - i - 1]) {

                flag = true; // true according to gfg
                System.out.println("not a palindromic array");
                break;
            }

        }

        if (flag == false) {
            System.out.println("palindromic Array");
        }
    }

}
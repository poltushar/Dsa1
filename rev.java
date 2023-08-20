
import java.util.Scanner;

public class rev {

    public static void main(String[] args) {

        System.out.println("Enter the Name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String name1 = " ";

        for (int i = name.length() - 1; i >= 0; i--) {

            name1 = name1 + name.charAt(i);

        }
        System.out.println(name1);
    }
}
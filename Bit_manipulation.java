import java.util.*;

public class Bit_manipulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // GET A BIT

        int n = 5; // 0101
        int pos = 1;
        int bitmask = 1 << pos; // 0010

        if ((bitmask & n) == 0) {

            System.out.println("Bit was zero");
        } else {

            System.out.println("Bit was one");
        }

        // SET A BIT
        int n1 = 5; // 0101
        int pos1 = 1;
        int bitmask1 = 1 << pos1; // 0010

        int newNumber = bitmask1 | n1; // 0111 ==> 7
        System.out.println(newNumber);

        // CLEAR A BIT
        int n2 = 5; // 0101
        int pos2 = 2;
        int bitmask2 = ~(1 << pos2); // 1011
        int newNumber2 = bitmask2 & n2; // 0001 ==> 1
        System.out.println(newNumber2);

        // UPDATE A BIT
        int opr = sc.nextInt();
        int n3 = 5; // 0101
        int pos3 = 1;
        int bitmask3 = 1 << pos3; // 0010

        if (opr == 1) {

            // Set
            int newNumber3 = bitmask3 | n3; // 0111 ==> 7
            System.out.println(newNumber3);
        } else {

            // Clear
            int newNumber3 = ~(bitmask3) & n3; // 0001 ==> 1
            System.out.println(newNumber3);
        }
        sc.close();

    }
}
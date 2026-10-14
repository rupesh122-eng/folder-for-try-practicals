import java.util.*;

public class function1 {

    public static float average(int a, int b, int c) {

        int sum = a + b + c;
        float avg = (float) sum / 3;
        return avg;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Average of 3 numbers is " + average(a, b, c));

        sc.close();

    }
}
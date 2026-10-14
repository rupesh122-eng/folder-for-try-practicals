//  Q1. Print Numbers from 5 to 1.
/*public class Recursion_1 {

    public static void printNum(int n) {

        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNum(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;
        printNum(n);
    }
}*/

//  Q2. Print Numbers from 1 to 5.
/*public class Recursion_1 {

    public static void printNum(int n) {

        if (n == 6) {
            return;
        }
        System.out.println(n);
        printNum(n + 1);
    }

    public static void main(String[] args) {

        int n = 1;
        printNum(n);
    }
}*/

//  Q3. Print the sum of first n natural numbers.
/*public class Recursion_1 {

    public static void printSum(int i, int n, int sum) {

        if (i == n) {

            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
        System.out.println(i);
    }

    public static void main(String[] args) {

        printSum(1, 5, 0);
    }
}*/

//  Q4. Print the factorial of a number n.
/*public class Recursion_1 {

    public static int calculateFact(int n) {

        if (n == 0 || n == 1) {

            return 1;
        }

        int fact = n * calculateFact(n - 1);
        return fact;
    }

    public static void main(String[] args) {

        int n = 5;
        int result = calculateFact(n);
        System.out.println(result);
    }
}

//  Q5. Print the fibonacci sequence till nth term.
/*public class Recursion_1 {

    public static void calculateFib(int a, int b, int n) {

        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        calculateFib(b, c, n - 1);

    }

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        int n = 5;
        calculateFib(a, b, n - 2);
    }
}*/

//  Q6. print x to the power of n (stack height = n).
/*public class Recursion_1 {

    public static int calculatePow(int x, int n) {

        if (n == 0) {
            return 1;
        }

        if (x == 1) {
            return 0;
        }

        int power = x * calculatePow(x, n - 1);
        return power;
    }

    public static void main(String[] args) {

        int x = 2;
        int n = 5;
        int result = calculatePow(x, n);
        System.out.println(result);

    }
}*/

// Q7. print x to the power of n (stack height = logan).
public class Recursion_1 {

    public static int printPow(int x, int n) {

        if (n == 0) {
            return 1;
        }
        if (x == 1) {
            return 0;
        }

        // if even
        if (n % 2 == 0) {
            return printPow(x, n / 2) * printPow(x, n / 2);

        } else {
            return printPow(x, n / 2) * printPow(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {

        System.out.println(printPow(2, 5));
    }
}

// Q1. Print all the permutations(all possible arrangements) of a string
/*public class Recursion_3 {

    public static void printPermutation (String str, String permutation) {

        if (str.length() == 0) {
        
            System.out.println(permutation);
            return ;
        }

        for (int i = 0; i < str.length(); i++) {

            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newString, permutation + currChar);
        }
    }
    public static void main(String[] args) {
    
        printPermutation("ABC", "");
    }
}*/

// Q2. Count total paths in a maze from (0,0) to (n,m) with only down and right moves
/*public class Recursion_3 {

    public static int countPath (int i, int j, int n, int m) {

        if (i == n || j == m) {
            
            return 0;
        }

        if (i == n - 1 && j == m -1) {
            return 1;
        }

        // move down
        int downPath = countPath(i + 1, j, n, m);

        // move right
        int rightPath = countPath(i, j + 1, n, m);

        return downPath + rightPath;
    }
    public static void main(String[] args) {
        

        int n = 4, m = 5;
        System.out.println(countPath(0, 0, n, m));
    }
}*/

// Q3. Place tiles of size 1 x m in a floor of size n x m.
/*public class Recursion_3 {

    public static int placeTiles (int n, int m) {

        if (n == m) {
            return 2;
        }

        if (n < m) {
            return 1;
        }

        // vertically
        int vertPlace = placeTiles(n - 1, m);

        // horizontally
        int horzPlace = placeTiles(n - m, m);

        return vertPlace + horzPlace;
    }
    public static void main(String[] args) {
        
        System.out.println(placeTiles(4, 2));
    }
}*/

// Q4. Find the number of ways in which you can invite n people to your party, single or in pairs.
/*public class Recursion_3 {

    public static int callGuests (int n) {

        if (n < 1) {
            return 1;
        }

        // single guest
        int way1 = callGuests(n - 1);

        // pair guest
        int way2 = (n - 1) * callGuests(n - 2);

        return way1 + way2;
    }
    public static void main(String[] args) {
        
        System.out.println(callGuests(2));
    }
}*/

// Q5. Print all subsets of a set of first n natural numbers.
import java.util.ArrayList;

public class Recursion_3 {

    public static void printSubset(ArrayList<Integer> subset) {

        for (int i = 0; i < subset.size(); i++) {

            System.out.print(subset.get(i));
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset) {

        if (n == 0) {
            printSubset(subset);
            return;
        }

        // want to be
        subset.add(n);
        findSubset(n - 1, subset);

        // not want to be
        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);
    }

    public static void main(String[] args) {

        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(3, subset);
    }
}

// Q1. Tower of Hanoi
/*public class Recursion_2 {

    public static void towerOfHanoi(int n, String src, String helper, String dest) {

        if (n == 1) {

            System.out.println("Transfer disk " + n + " form " + src + " to " + dest);
            return;
        }

        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " form " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {

        towerOfHanoi(2, "S", "H", "D");
    }
}*/

// Q2. Print a string in reverse
/*public class Recursion_2 {

    public static void printRev(String str, int idx) {

        if (idx == 0) {

            System.out.println(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        printRev(str, idx - 1);
    }

    public static void main(String[] args) {

        String str = "Rupesh";
        printRev(str, str.length() - 1);
    }
}*/

// Q3. print the first and last occurence an element in string
/*public class Recursion_2 {

    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element) {

        if (idx == str.length()) {
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == element) {

            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurance(str, idx + 1, element);
    }

    public static void main(String[] args) {

        String str = "Rupeeussh";
        findOccurance(str, 0, 'u');
        System.out.println(first);
        System.out.println(last);
    }
}*/

// Q4. check if an array is sorted (strictly increasing).
/*public class Recursion_2 {

    public static boolean isSorted(int arr[], int idx) {

        if (idx == arr.length - 1) {
            return true;
        }

        if (arr[idx] < arr[idx + 1]) {

            return isSorted(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 6 };
        System.out.println(isSorted(arr, 0));
    }
}*/

// Q5. move all X to the end of the string
/*public class Recursion_2 {

    public static void moveAllX(String str, int idx, String neWString, int count) {

        if (idx == str.length()) {

            for (int i = 0; i < count; i++) {

                neWString += 'x';

            }
            System.out.println(neWString);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == 'x') {

            count++;
            moveAllX(str, idx + 1, neWString, count);
        } else {
            neWString += currChar;
            moveAllX(str, idx + 1, neWString, count);
        }
    }

    public static void main(String[] args) {

        String str = "ruxxpxxexxsxxsh";
        moveAllX(str, 0, "", 0);
    }
}*/

// Q3. remove all duplicate form the string
/*public class Recursion_2 {

    public static boolean[] map = new boolean[26];

    public static void remvDupl(String str, int idx, String newString) {

        if (idx == str.length()) {

            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {

            remvDupl(str, idx + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            remvDupl(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {

        String str = "marriage";
        remvDupl(str, 0, "");
    }
}*/

// Q4. print all subsequences of a string
/*public class Recursion_2 {

    public static void subSeq(String str, int idx, String newString) {

        if (idx == str.length()) {

            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        // to be
        subSeq(str, idx + 1, newString + currChar);

        // not to be
        subSeq(str, idx + 1, newString);
    }

    public static void main(String[] args) {

        subSeq("abc", 0, "");
    }
}*/

// Q5. print all unique subsequences of a string.

/*import java.util.HashSet;

public class Recursion_2 {

    public static void subSeq(String str, int idx, String newString, HashSet<String> set) {

        if (idx == str.length()) {

            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);

        // to be
        subSeq(str, idx + 1, newString + currChar, set);

        // not to be
        subSeq(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {

        String str = "aaaa";
        HashSet<String> set = new HashSet<>();
        subSeq(str, 0, "", set);

    }
}*/

// Q6. print keypad combination
public class Recursion_2 {

    public static String keyPad[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printComb(String str, int idx, String combination) {

        if (idx == str.length()) {

            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);

        String mapping = keyPad[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {

            printComb(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {

        String str = "23";
        printComb(str, 0, "");
    }
}

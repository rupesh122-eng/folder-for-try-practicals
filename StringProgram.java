import java.util.*;

public class StringProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
         * String firstName = sc.next();
         * String secondName = sc.next();
         * 
         * // CONCENTATION
         * String fullName = firstName + " " + secondName;
         * System.out.println(fullName);
         * 
         * // STRING LENGTH
         * System.out.println(fullName.length());
         * 
         * // CHARACTER OF STRING
         * for (int i = 0; i < fullName.length(); i++) {
         * System.out.println(fullName.charAt(i));
         * }
         */

        // COMPARE 2 STRING

        /*
         * String name = "Rupesh";
         * String name1 = "Rupesh";
         * 
         * if (name.equals(name1)) {
         * System.out.println("Both string are equal");
         * } else {
         * System.out.println("Both string are different");
         * }
         * 
         * // DO NOT USE == to check for string equality
         * // Gives correct answer here
         * if (name == name1) {
         * System.out.println("They are the same string");
         * } else {
         * System.out.println("They are different strings");
         * }
         * 
         * // Gives incorrect answer here
         * if (new String("Tony") == new String("Tony")) {
         * System.out.println("They are the same string");
         * } else {
         * System.out.println("They are different strings");
         * }
         */

        // SUBSTRING FOR STRING
        /*
         * String name = "Rupesh Thakur";
         * System.out.println(name.substring(7));
         * System.out.println(name.substring(7, 13));
         * System.out.println(name.substring(7, name.length()));
         * 
         * // PARSEINT METHOD OD INTEGER CLASS
         * String str = "123";
         * int number = Integer.parseInt(str);
         * System.out.println(number);
         * 
         * // TOSTRING METHOD OF STRING CLASS
         * int number1 = 123;
         * String str1 = Integer.toString(number1);
         * System.out.println(str1);
         */

        // Take an array of Strings input from the user & find the cumulative (combined)
        // length of all those strings.

        /*
         * int size = sc.nextInt();
         * String array[] = new String[size];
         * int totLength = 0;
         * 
         * for (int i = 0; i < size; i++) {
         * array[i] = sc.next();
         * 
         * totLength += array[i].length();
         * }
         * System.out.println(totLength);
         */

        // Input a string from the user. Create a new string called ‘result’ in which
        // you will replace the letter ‘e’ in the original string with letter ‘i’.

        /*
         * String str = sc.next();
         * String result = "";
         * 
         * for (int i = 0; i < str.length(); i++) {
         * 
         * if (str.charAt(i) == 'e') {
         * result += "i";
         * } else {
         * result += str.charAt(i);
         * }
         * }
         * System.out.println(result);
         */

        // Input an email from the user. You have to create a username from the email by
        // deleting the part that comes after ‘@’. Display that username to the user.

        String email = sc.next();
        String username = "";

        for (int i = 0; i < email.length(); i++) {

            if (email.charAt(i) == '@') {

                break;
            } else {
                username += email.charAt(i);
            }
        }
        System.out.println(username);

        sc.close();
    }
}
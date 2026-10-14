public class String_builder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Rupesh Thakur");
        System.out.println(sb);

        // Get a character from index
        System.out.println(sb.charAt(0));

        // Set a character at index
        sb.setCharAt(2, 'j');
        System.out.println(sb);

        // Insert a character at some index
        sb.insert(0, 'R');
        System.out.println(sb);

        // Delete char at some index
        sb.delete(0, 1);
        System.out.println(sb);

        // Append a char
        sb.append(" Thakur");
        System.out.println(sb);

        // print the length of string
        System.out.println(sb.length());

        // Reverse a string ( using StringBuilder class )
        StringBuilder str = new StringBuilder("Brother");

        for (int i = 0; i < str.length() / 2; i++) {

            int front = i;
            int back = str.length() - 1 - i;

            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);

            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);
        }

        System.out.println(str);
    }
}
    import java.util.Scanner;

    public class Lab503 {
        public static int count_vowel(String message, char letter){
            int count = 0;

            for (int i = 0; i < message.length(); i++){
                char ch = Character.toUpperCase(message.charAt(i));
                if (ch == letter)
                    count++;
            }
            return count;
        }
        static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a message: ");
            String msg = sc.nextLine();

            int a = count_vowel(msg, 'A');
            int e = count_vowel(msg, 'E');
            int i = count_vowel(msg, 'I');
            int o = count_vowel(msg, 'O');
            int u = count_vowel(msg, 'U');

            System.out.println();
            System.out.println("List of vowel in \"" + msg +"\"");
            System.out.println(
                    "The letter 'A' appears " + a + " time(s)"+
                    "\nThe letter 'E' appears " + e + " time(s)"+
                    "\nThe letter 'I' appears " + i + " time(s)"+
                    "\nThe letter 'O' appears " + o + " time(s)"+
                    "\nThe letter 'U' appears " + u + " time(s)");
        }
    }

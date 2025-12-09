import java.util.Scanner;

public class Lab404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String word, message = "";
        while (true){
            System.out.print("Enter word: ");
            word = sc.nextLine();
            if (word.equalsIgnoreCase("Stop")) break;

            message += word + " ";
        }
        System.out.println(message);
    }
}
import java.util.Scanner;

public class Lab405 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String sentence;
        do {
            System.out.print("Input some sentence: ");
            sentence = sc.nextLine();

            while (!sentence.endsWith(".")) {
                System.out.print("The sentence must end with full stop point: ");
                sentence = sc.nextLine();
            }
        }while (!sentence.endsWith("."));

        sentence = sentence.trim().replace("." , "");

        System.out.println();

        while (sentence.contains(" ")){
            int spaceIndex = sentence.indexOf(" ");
            String word = sentence.substring(0,spaceIndex);
            System.out.println(word);

            sentence = sentence.substring(spaceIndex + 1).trim();  //ตัดคำเเรก
        }
        System.out.println(sentence); //เหลือ print เเค่คำสุดท้าย
    }
}

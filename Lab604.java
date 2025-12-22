import java.util.Scanner;

public class Lab604 {
    public static void display_array(int[] numbers){
        System.out.print("List of numbers in array: ");
        for (int n : numbers)
            System.out.print(n + " ");

        System.out.println();
    }
    public static int input_index(int[] numbers){
        Scanner sc = new Scanner(System.in);

        int index = 0;
        do {
            System.out.print("Enter index: ");
            index = sc.nextInt();

            while (!check_index(numbers,index)) {
                System.out.print("Invalid index!! Enter index, again: ");
                index = sc.nextInt();
            }
        }while (!check_index(numbers,index));

        return index;
    }
    public static boolean check_index(int[] numbers, int index){
        if (index >= 0 && index < numbers.length)
            return true;
        else return false;
    }
    public static void main(String[] args) {
        int[] numbers = {47,13,82,17,61,29,94,36};

        display_array(numbers);
        int index = input_index(numbers);

        System.out.println();
        System.out.println("The number at index " + index + " is " + numbers[index]);

        if (check_index(numbers,index - 1))
            System.out.println("The number before index " + index + " is " + numbers[index - 1]);
        else System.out.println("The number before index " + index + " is Out of range!!");

        if (check_index(numbers,index + 1))
            System.out.println("The number after  index " + index + " is " + numbers[index + 1]);
        else System.out.println("The number after index " + index + " is Out of range!!");
    }
}

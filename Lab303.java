import java.util.Scanner;

public class Lab303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;

        System.out.print("Enter the value for x coordinate:");
        x = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the value for y coordinate:");
        y = Integer.parseInt(sc.nextLine());

        String quadrant = "";

        if (x > 0 && y > 0) quadrant = "the First quadrant";
        if (x < 0 && y > 0) quadrant = "the Second quadrant";
        if (x < 0 && y < 0) quadrant = "the Third quadrant";
        if (x > 0 && y < 0) quadrant = "the Fourth quadrant";
        if (x == 0 && y == 0) quadrant = "the Origin";

        System.out.println("The coordinate point (" + x + "," + y + ") " + quadrant);
    }
}

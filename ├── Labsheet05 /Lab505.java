import javax.swing.*;

public class Lab505 {
    public static boolean is_palindrome(String word){
        word = word.toLowerCase();

        for (int i = 0; i < word.length() /2; i++){
            if (word.charAt(i) != word.charAt(word.length() - 1 - i))
                return false;
        }
        return true;
    }
    static void main() {
        String word = JOptionPane.showInputDialog("Enter some word:");
        is_palindrome(word);

        if (is_palindrome(word)){
            JOptionPane.showMessageDialog(null,word + " is Palindrome");
        }  else JOptionPane.showMessageDialog(null,word + " is NOT Palindrome");
    }
}

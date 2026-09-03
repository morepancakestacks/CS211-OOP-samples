import java.util.Scanner;
class CheckLetter{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);
        if((ch == 'A' && ch <= 'Z') || (ch == 'a' && ch == 'z')){
            System.out.println(ch + " is a letter.");
        }
        else {
            System.out.println(ch + " is not a letter.");
        }
        input.close();
    }
}
import java.util.Scanner;

public class TestPalindrome {
    public static void main(String[] args){
        System.out.println("Input a sentence to test whether it is a palindrome: ");
        Scanner input = new Scanner(System.in);
        String testStr = input.nextLine();
        //Letter.length() = testStr.length();

            //if(!Character.isLetter(testStr.charAt(j))){
        testStr = testStr.replaceAll("([^A-Za-z])","");
        testStr = testStr.toLowerCase();
            //}
        //}
        StringBuffer Letter = new StringBuffer(testStr);
        Letter.reverse();
        int n = 0;
        for(int j = 0;j < testStr.length();j++){
            if(testStr.charAt(j) == Letter.charAt(j)){
                n++;
            }
        }
        if(n == testStr.length())
            System.out.println("Yes, it's a palindrome.");
        else
            System.out.println("No, it's not a palindrome");
    }
}

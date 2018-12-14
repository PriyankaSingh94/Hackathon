import java.util.*;

public class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        TestClass tc = new TestClass();
        int num = Integer.parseInt(s.nextLine()); 
        for ( int j = 0; j < num; j++ )  {
            String str = s.nextLine();
            boolean isPalindrome = false;
            for (int k = 0; k < str.length(); k++) {
                String str1 = str.substring(0, k+1);
                String str2 = str.substring(k+1, str.length());
                if (str2 != str) {
                    if (tc.isPalindrome(str1+str2)) {
                        isPalindrome = true;
                        break;
                    }
                    if (tc.isPalindrome(str2+str1)) {
                        isPalindrome = true;
                        break;
                    }
                }
            }
            if (isPalindrome) {
                System.out.println("YES");
            }
            else {
               System.out.println("NO"); 
            }
        }
    }
    
    public boolean isPalindrome(String str) {
        int len = str.length();
        int count = len / 2;
        for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != str.charAt(len - i - 1)) {
                    return false;
                }   
        }
        return true;
    }
}
import java.util.*;

public class TestClass {
    int count = 0;
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        TestClass tc = new TestClass();
        String str, str1, str2, str3, str4;
        StringTokenizer st = new StringTokenizer(s.nextLine());
        int num = Integer.parseInt(st.nextToken());
        int cuts = Integer.parseInt(st.nextToken());
        str = s.nextLine();
        for (int i =0; i < num-cuts; i++) {
            str1 = str.substring(0, i+1);
            str2 = str.substring(i+1, num);
            for (int k = 0; k < str2.length(); k++) {
                str3 = str2.substring(0, k+1);
                str4 = str2.substring(k+1, str2.length());
                if (str3 != str2) {
                tc.isPalindrome(str1, tc);
                tc.isPalindrome(str3, tc);
                tc.isPalindrome(str4, tc);
                }
            }
        }
        System.out.println(tc.count);
    }
    
    public boolean isPalindrome(String str, TestClass tc) {
        int len = str.length();
        int count = len / 2;
        for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != str.charAt(len - i - 1)) {
                    return false;
                }   
        }
        tc.count++;
        return true;
    }
}
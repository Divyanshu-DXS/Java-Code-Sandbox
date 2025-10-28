package LeetCode;

public class ValidPalindrome {
    public static void main(String[] args) {
        // "A man, a plan, a canal: Panama"
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        boolean result=true;
   
        String newString= "";
        for(int i = 0 ; i<s.length();i++){
            if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='0'&&s.charAt(i)<='9')){
                newString+=s.charAt(i);
            }
        }
        int left =0;
        int right = newString.length()-1;

        System.out.println(newString);
        while(left<=right){
            if(newString.charAt(left)!=newString.charAt(right)){
                result=false;
                break;
            }
            left++;
            right--;
        }

        return result;

    }
}

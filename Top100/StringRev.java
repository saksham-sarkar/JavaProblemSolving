package Top100;

public class StringRev {
 public static void main(String args[]){
     String str = "Hello";
     String reversed = reversedreverseReursion(str);
     System.out.println(reversed);
 }

    private static String reversedreverseReursion(String str) {
     if(str==null || str.length()<=1){
         return str;
     }
     else {
         return str.charAt(str.length()-1)+reversedreverseReursion(str.substring(0,str.length()-1));
     }
    }
}

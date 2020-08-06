package Top100;

public class LengthWithoutLibrary {
    public static void main(String args[]) {
        String str = "Hello";
        System.out.println(getLengthOfString(str));
    }

    private static int getLengthOfString(String str) {
        int i=0;
        try{
            for(i=0;;i++){
                str.charAt(i);
            }
        } catch (Exception e) {

        }
        return i;
    }
}

package nyc.c4q.AndresArango;

/**
 * Created by andresarango on 8/28/16.
 */
public class ProblemFour {
    public static void main(String[] args){
        System.out.println(endsly("actually"));
    }
    public static boolean endsly(String randomString){
        int stringLength = randomString.length();
        return randomString.charAt(stringLength-1) == 'y' && randomString.charAt(stringLength-2) == 'l';
    }
}

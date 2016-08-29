package nyc.c4q.AndresArango;

/**
 * Created by andresarango on 8/28/16.
 */


//Check to see if a string has the same count of 'x's and 'o's.
//The method must return a boolean and be case insensitive.
//The string may contain any Unicode character -- not just 'x's and 'o's -- and may be of any length.

public class ProblemThree {
    public static void main(String[] args){
        System.out.println(sameXO("xooxx"));
    }
    public static boolean sameXO (String randomString){
        int countO = 0;
        int countX = 0;
        char charAtIndex = ' ';
        for(int i = 0; i < randomString.length(); i++){
            charAtIndex = randomString.charAt(i);
            if(Character.toLowerCase(charAtIndex) == 'x'){
                countX++;
            }else if(Character.toLowerCase(charAtIndex) == 'o'){
                countO++;
            }
        }
        return countO == countX;
    }
}

package nyc.c4q.AndresArango;

/**
 * Created by andresarango on 8/28/16.
 */
public class ProblemTwo {
    public static void main(String[] args){
//        System.out.println(calculateAge(1987,2016));
    }
    public static String calculateAge(int birthYear, int currentYear){
        int birthdayPassed = currentYear - birthYear;
        int birthdayComing = birthdayPassed - 1;
        return "You are either " + birthdayComing + " or " + birthdayPassed + ".";
    }
}

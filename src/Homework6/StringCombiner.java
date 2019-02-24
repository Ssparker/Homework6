package Homework6;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class StringCombiner {


    public static void main(String[] args) {
        String Casey = "Casey";
        String Wrigley = "Wrigley";
        String addTogether = Casey + " " + "&" + " " + Wrigley;

        System.out.println(addTogether);

        String currentDate = outputDate();
        System.out.println("Today is " + outputDate());

        String addTogetherTwo = togetherTwo(addTogether, currentDate);
        System.out.println(addTogetherTwo);

    }


    public static String addTogehter (String Casey, String Wrigley){
        return Casey + " " + "&" + " " + Wrigley;
    }


    public static String outputDate() {

        SimpleDateFormat format = new SimpleDateFormat( "dd MMMM yyyy");
        return format.format(Date.from(Instant.now()));

        }

    public static String togetherTwo(String addTogether, String outputDate) {
        return addTogether + " " + outputDate;

    }
}

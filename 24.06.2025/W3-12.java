import java.util.Scanner;

public class MinutesToYearsDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");
        long minutes = input.nextLong();

        long minutesInDay = 60 * 24;
        long minutesInYear = minutesInDay * 365;

      
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / minutesInDay;

  
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}

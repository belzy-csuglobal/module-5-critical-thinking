import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input;
    int temperatureSum = 0;
    final int DAYS_IN_WEEK = 7;

    // Declare ArrayLists for temperatures and weekdays.
    ArrayList<Integer> temperatures = new ArrayList<Integer>();
    ArrayList<String> weekdays = new ArrayList<String>();

    // Initialize temperatures ArrayList.
    temperatures.add(71);
    temperatures.add(89);
    temperatures.add(65);
    temperatures.add(93);
    temperatures.add(97);
    temperatures.add(88);
    temperatures.add(60);

    // Initialize weekdays ArrayList.
    weekdays.add("Sunday");
    weekdays.add("Monday");
    weekdays.add("Tuesday");
    weekdays.add("Wednesday");
    weekdays.add("Thursday");
    weekdays.add("Friday");
    weekdays.add("Saturday");

    // Prompt user for input.
    System.out.println(
      "Enter a day to view the temperature or enter \"week\" to view all temperatures and the weekly average:");
    input = scanner.next();

    // Check user input, and display results
    if (input.toLowerCase().equals("week")) {
      for (int i = 0; i < DAYS_IN_WEEK; i++) {
        // Display daily temperatures.
        System.out.printf(
          "%s: %d°\n", weekdays.get(i), temperatures.get(i));

        // Get the sum of temperatures.
        temperatureSum += temperatures.get(i);
      }

      // Display weekly average temperature
      System.out.printf("Weekly Average: %d°", temperatureSum /  7);
    } else {
      for (int i = 0; i < DAYS_IN_WEEK; i++) {
        // Check which day the user entered.
        if (input.toLowerCase().equals(weekdays.get(i).toLowerCase())) {
          // Display the temperature for the day.
          System.out.printf("%s: %d°", weekdays.get(i), temperatures.get(i));

          // Break the loop.
          i = DAYS_IN_WEEK;
        }
      }
    }
  }
}
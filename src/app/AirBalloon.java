package app;

import java.util.Scanner;

public class AirBalloon {
    private static final int MIN_HEIGHT = 120;
    private static final int MAX_HEIGHT = 355;

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter height: ");
            int height = scanner.nextInt();

            if (height < MIN_HEIGHT ) {
                System.out.println("Warning: minimum height (120m)");
            }
            else if(height > MAX_HEIGHT){
                System.out.println("Warning: exceeding maximum height (355m)");

            } else {
                System.out.println("Indicators successfully received. Height: " + height + "m.");
            }
        } catch (Exception e) {
            System.out.println("Only numbers");
        }
    }
}




package afrrica.semicolon.mp3.RainOfFuns;

import java.util.Scanner;

public class GasMileageWork {

    public static void main(String... args) {
        double distance = 0;
        double gallon = 0;
        Scanner userInput = new Scanner(System.in);
        for (int counter = 1; counter <= 5; ) {

            System.out.println("Enter Distance here:");
            distance = userInput.nextInt();
            System.out.println("Enter Gallon here:");
            gallon = userInput.nextInt();
            ++counter;
            if (distance < 0 || gallon < 0) {
                System.out.println("Negative Input");
            } else {
                System.out.println("Mile/Gallon = " + distance / gallon);
            }
        }
    }
}

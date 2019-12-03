package in.saran;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        int remainingFuel =0;
        int fuelNeeded = 0;



        try {

            File f = new File("/Users/saranjith/Desktop/adventofcode/step1/in/saran/mySanta/input.txt");

            BufferedReader b = new BufferedReader(new FileReader(f));

            String readLine = "";

            System.out.println("Reading file using Buffered Reader");

            /*
            div by 3
            round down
            subtr 2
             */
            while ((readLine = b.readLine()) != null) {
                remainingFuel = retFuel(readLine);
                fuelNeeded+=remainingFuel;
                System.out.println("remaining fuel "+remainingFuel);

                while (remainingFuel>=9) {
                    remainingFuel = retFuel(String.valueOf(remainingFuel));
                    fuelNeeded+=remainingFuel;
                    System.out.println("remaining Fuel at this line "+remainingFuel);

                }
                System.out.println("Fuel Needed "+fuelNeeded);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static int retFuel(String fuel){
        return (int) Math.floor(Double.parseDouble(fuel)/3 - 2);
    }
}

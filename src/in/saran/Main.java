/**
 * @author: saranjith
 * @date: 03-12-2019
 */

package in.saran;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        int remainingFuel =0;
        int fuelNeeded = 0;
        try {
            File f = new File("/Users/saranjith/Desktop/adventofcode/step1/in/saran/mySanta/input.txt");
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";
            while ((readLine = b.readLine()) != null) {
                remainingFuel = retFuel(readLine);
                fuelNeeded+=remainingFuel;
                while (remainingFuel>=9) {
                    remainingFuel = retFuel(String.valueOf(remainingFuel));
                    fuelNeeded+=remainingFuel;
                }
            }
            System.out.println("Fuel Needed "+fuelNeeded);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static int retFuel(String fuel){
        return (int) Math.floor(Double.parseDouble(fuel)/3 - 2);
    }
}

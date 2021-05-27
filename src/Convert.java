/*
Name - Prateek Kumar
Student Number - A00218636

Program Description - The following code displays the conversion options available to user.
System asks for the user input and convert the value into corresponding Unit of Measurement.
Any wrong input by user will prompt to input a correct value and UoM combination

*/

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) throws Exception {

        // Display conversion options available for user
        System.out.println("Following conversions are available: ");
        System.out.println("mi <=> km " + "\n" + "cm <=> in" + "\n" + "kg <=> lb" + "\n" + "g <=> oz" + "\n" + "C <=> F"
                + "\n" + "L <=> cups");
        System.out.println("Enter a value to convert: ");

        // Take User input
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        double val = 0;
        String uom;

        // Remove any empty spaces in input
        String convertedString = str.replaceAll("\\s", "").toLowerCase();

        // Split digits and string and assign the split values to array
        String[] part = convertedString.split("(?<=\\d)(?=\\D)");

        // If input is a decimal value then part array will have 3 values
        // i.e. value before decimal + value after decimal + UoM
        if (part.length == 3) {
            part[0] = part[0] + part[1];
            uom = part[2];

        } else {
            uom = part[1];
        }

        val = Double.parseDouble(part[0]);

        // Declaration for the converted value and UoM
        double b = 0;
        String convertedUoM = "";

        if (uom.equals("cup")) {
            uom = "cups";
        }

        // Use Switch case for conversion
        switch (uom) {

            case "km":
                b = val * 0.62;
                convertedUoM = "mi";
                break;

            case "mi":
                b = val * 1.61;
                convertedUoM = "km";
                break;

            case "cm":
                b = val * 0.39;
                convertedUoM = "in";
                break;

            case "in":
                b = val * 2.54;
                convertedUoM = "cm";
                break;

            case "kg":
                b = val * 2.2;
                convertedUoM = "lb";
                break;

            case "lb":
                b = val * 0.45;
                convertedUoM = "kg";
                break;

            case "g":
                b = val * 0.04;
                convertedUoM = "oz";
                break;

            case "oz":
                b = val * 28.35;
                convertedUoM = "g";
                break;

            case "l":
                b = val * 4.17;
                convertedUoM = "cups";
                break;

            case "cups":
                b = val * 0.24;
                convertedUoM = "L";
                break;

            case "c":
                b = (val * 9 / 5) + 32;
                convertedUoM = "F";
                break;

            case "f":
                b = (val - 32) * 5 / 9;
                convertedUoM = "C";
                break;

            default:
                System.out.println("Please enter a valid unit of measurement.");

        }

        if (!convertedUoM.equals("")) {
            System.out.println(str + " is equal to " + b + convertedUoM);
        }

    }
}

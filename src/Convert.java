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


        //Display conversion options available for user
        System.out.println("Following conversions are available: ");
        System.out.println("mi <=> km " + "\n"+ "cm <=> in" + "\n"+ "kg <=> lb"+"\n"+ "g <=> oz"+ "\n"+ "C <=> F");
        System.out.println("Enter a value to convert: ");
       

        //Take User input
        Scanner sc = new Scanner(System.in);    
        String str = sc.nextLine();

        //Remove any empty spaces in input
        str = str.replaceAll("\\s", "");

        //Split digits and string and assign the split values to array
        String[] part = str.split("(?<=\\d)(?=\\D)");
        String uom = part[1];


        //Convert input value string to double data type
        double val = Integer.parseInt(part[0]);
      
        //Declaration for the converted value and UoM
        double b=0.00;
        String convertedUoM="";
        
     
        //Use Switch case for conversion
        switch(uom){

            case  "km":
            b = val* 0.62;
             convertedUoM = "mi";
             break;

             case "mi":
             b = val* 1.61;
             convertedUoM = "km";
             break;

             case "cm":
             b = val* 0.39;
             convertedUoM = "in";
             break;

             case "in":
             b = val* 2.54;
             convertedUoM = "cm";
             break;

             case "kg":
             b = val* 2.2;
             convertedUoM = "lb";
             break;

             case "lb":
             b = val* 0.54;
             convertedUoM = "kg";
             break;

             case "g":
             b = val* 0.4;
             convertedUoM = "oz";
             break;

             case "oz":
             b = val* 28.35;
             convertedUoM = "g";
             break;

             case "L":
             b = val* 4.17;
             convertedUoM = "cups";
             break;

             case "cups":
             b = val* 0.24;
             convertedUoM = "L";
             break;

             case "C":
             b = (val*9/5)+32;
             convertedUoM = "F";
             break;

             case "F":
             b = (val-32)*5/9;
             convertedUoM = "C";
             break;

             
             default:
             System.out.println("Please enter a valid unit of measurement.");




        }

        
        if(!convertedUoM.equals(""))
        {
        System.out.println(str+" is equal to " +b+convertedUoM);
        }

   
    }
}

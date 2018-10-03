/*
 * Shawn Phung
 * October 3, 2018
 * To calculate the amount of money (income tax) the user owes
 */

package incometax;
    import java.util.Scanner;
/**
 *
 * @author shphu0697
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner keyedInput = new Scanner (System.in);
        // Constants and Variables Declaration
        
         int salary;
         //Income Tax Levels
         final double tax1 = 0.15;
         final double tax2 = 0.205;
         final double tax3 = 0.26;
         final double tax4 = 0.29;
         final double tax5 = 0.33;
         
         //Input and Output
        System.out.println ("Insert your annual salary");
        salary = keyedInput.nextInt ();
        
        if (salary <= 46605){
            System.out.println ("You owe $" + salary * tax1 + " for you income tax.");
        }
        else if (salary >= 46605 && salary<=93208){
        System.out.println ("You owe $" + salary * tax2 + " for you income tax.");
        }
        else if (salary >= 93208 && salary<=144489){
        System.out.println ("You owe $" + salary * tax3 + " for you income tax.");
        }
         else if (salary >= 144489 && salary<=205842){
        System.out.println ("You owe $" + salary * tax4 + " for you income tax.");
        }
         else if (salary >= 205842){
        System.out.println ("You owe $" + salary * tax5 + " for you income tax.");
        }
    
    }
    
}

/*Luke Simpson
 *Create a program that will populate the value of degrees in Centigrade, 
 * and then the program will display both the Centigrade and Fahrenheit values 
 * in this fashion: CENTIGRADE = 100 FAHRENHEIT = 212. The formula for this is F=(C*9)/5 +32.
 */

/**
 *
 * @author simpl2434
 */
public class e1b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dCentigrade;
        double dFahrenheit;
        dCentigrade = 100;
        dFahrenheit = (dCentigrade*9)/5 +32; 
        System.out.println(" Fahrenheit is " + dFahrenheit);
    }
}

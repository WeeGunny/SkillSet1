/*Luke Simpson
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simpl2434
 */
public class e1j {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double dA, dB, dC, dDisc,dXpos,dXneg;
        dA=15;
        dB=8;
        dC=-7;
        dDisc= Math.sqrt(Math.pow(dB,2)- 4*(dA*dC) );
        dXpos= (-dB + dDisc)/(2*dA);
        dXneg= (-dB - dDisc) /(2*dA);
        System.out.println("X= " + dXpos);
        System.out.println("X= " + dXneg);
        
    }
}

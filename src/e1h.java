/*Luke Simpson
 Review your math notes to find the formula for the slope of a straight line and the distance between 2 points in the Cartesian plane. 
 * Calculate the slope of any straight line by populating the coordinates of two points in the form of (x,y). 
 * Using the same points, find the distance between them.
 */

/**
 *
 * @author simpl2434
 */
public class e1h {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double dX1,dX2,dY1,dY2,dDist,dSlope,dDX,dDY;
      dX1 = 5;
      dX2 = 10;
      dY1 = 3;
      dY2 = 8;
      dDX = dX2-dX1;
      dDY = dY2-dY1;
      dSlope = dDY/dDX;
      dDist = Math.sqrt(Math.pow(dDX, 2)+(Math.pow(dDY,2)));
      
      System.out.println("This is the Slope " + dSlope);
      System.out.println("This is the Distance " + dDist);
      
      
    }
}

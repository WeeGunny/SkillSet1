/* Luke Simpson
 You will populate the coordinates of the upper left corner of a rectangle, 
 * and the lower right corner of a rectangle.

Your program will then display the area and the perimeter of the rectangle.

Use as many variables as you need in order to add clarity and efficiency to your code.
 */

/**
 *
 * @author simpl2434
 */
public class e1i {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double dX1, dX2, dY1, dY2, dArea, dPerimeter, dLength, dWidth;
       dX1=1;
       dX2=5;
       dY1=6;
       dY2=1;
       dLength = dY1-dY2;
       dWidth = dX2-dX1;
       dArea = dLength*dWidth;
       dPerimeter = 2*(dLength+dWidth);
       System.out.println("the Area is " + dArea);
       System.out.println("the Perimeter is " + dPerimeter);
       
    }
}

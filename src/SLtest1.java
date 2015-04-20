/*
 Luke Simpson
 */

public class SLtest1 {

    public static void main(String[] args) {
      double dP, dR, dT, dN, dMP, dNum,dDenom,dDR;
      dP = 10;
      dR = 20;
      dT = 30;
      dN = 40;
      dDR = dR / dN; 
      dNum = dP * dDR;
      dDenom = 1-((Math.pow (1+dDR ,-dN*dT)));
      dMP = dNum/dDenom;
      System.out.println("Your Monthly Payment is " + dMP);
      
    }
}

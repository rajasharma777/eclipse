package com.mphasis.billsystem;

public class BillCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int units=230;
      double billTopay= 0;
      if(units<100)
      {
    	  billTopay= 0;
    	  
      }
      else if (units<300)
      {
    	  billTopay=100*1.20 +(units-100)*2;
      }
      System.out.println("The electricity bill for  "+ units +"is : "+billTopay );
	}

}

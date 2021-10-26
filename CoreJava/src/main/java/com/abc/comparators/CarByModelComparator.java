package com.abc.comparators;

import java.util.Comparator;

import com.abc.dataobjects.Car;

public class CarByModelComparator implements  Comparator<Car> {

   // 0 - equal objects
  // <0  - in  order 
  // >0  -  not in the order	
	
   public int compare(Car s1,Car s2) {
	   String model1 = s1.getModel();
	   String model2 = s2.getModel();
	   
	   int comparisonValue = 0;
	   
	   if(model1 != model2) {
		   if(model1 == "toyota") {
			   comparisonValue = -1;
		   } else if(model2 == "toyota") {
			   comparisonValue = 1;
		   }
	   } 
	   
	   
	   return comparisonValue;
   }
}



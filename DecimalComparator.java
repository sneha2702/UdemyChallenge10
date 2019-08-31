/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class DecimalComparator {
   public static boolean isEqualByThreeDecimalPlaces(double first, double second)
   {
       first*=1000;
       second*=1000;
       first= (int)first;
       second=(int)second;
       if(first==second)
       {
           return true;
       }
       return false;
   }
    
}

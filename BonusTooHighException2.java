//Rachel Merendino section 12, hw 10, problem2

import java.util.*;
public class BonusTooHighException2{
   public static void main(String[] args) {
   
   Scanner scan= new Scanner(System.in);
   System.out.println("Enter the number of bonuses: ");
   int size = scan.nextInt();
   int[] execArr = new int[size];
   
   int i;
   for (i=0; i<execArr.length; i++){
      System.out.println("Enter bonus " + (i+1));
      
      int bonus = scan.nextInt();
      
      try{
      if(bonus>10000){
         throw new Exception("bonus too high");
         }
         
      else{
         execArr[i]=bonus;
      }}
      catch (Exception e){
         System.out.println(e);  
      } 
   }
   
   System.out.print("Bonuses: ");
   for (i=0; i<execArr.length; i++){
      System.out.print(execArr[i]+ " "); //prints array
   }
   
   int count=0;
   int amount=0;
   for (i=0; i<execArr.length; i++){
      if (execArr[i]>0 && execArr[i]<10000){
      count+=1;
      amount+=execArr[i];
      }
   }
   System.out.println("\nTotal number of executives with valid bonuses: " + count);
   System.out.println("Average pay of valid bonuses: " + (amount/count));
   
}}
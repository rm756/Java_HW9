//Rachel Merendino section 12 hw10 problem1

import java.util.*;
public class BonusTooHighException{
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
         break;   
      } 
   }
   System.out.print("Bonuses: ");
   for (i=0; i<execArr.length; i++){
      System.out.print(execArr[i]+ " ");//prints array
    
   }
   
}}
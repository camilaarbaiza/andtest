/*

   @author Camila Arbaiza
   CSC 201-004N
   Professor Tanes Kanchanawanchai
   Assignment 1 from 6th edition book chapter 4

   The purpose of this program is to read in three nonnegative integers from the keyboard and
   display them in increasing order

   */


import java.util.Scanner;

public class Assignment1 {

 public static void main(String [] args){


     int firstNum;     //first number entered by the user
     int secondNum;    //second number entered by the user
     int thirdNum;     //third number entered by the user

     int lowest;       // lowest number
     int middle = 0;   // middle number
     int greatest;     // greatest number

     Scanner input = new Scanner(System.in);


     System.out.println("Enter first number");
     firstNum = input.nextInt();


     System.out.println("Enter second number");
     secondNum = input.nextInt();

     System.out.println("Enter third number");
     thirdNum = input.nextInt();

     //if statement in case user enters negative numbers
     if((firstNum < 0)|| (secondNum < 0) || (thirdNum < 0)){

         System.out.println("You entered invalid negative values");
     }
     // in case user enters the same number
     else if ((firstNum == secondNum)||(firstNum == thirdNum)||(secondNum == thirdNum)){
         System.out.println("You entered the same numbers");
     }
     else{

         //conditions to determine what number is the lowest
         if((firstNum < secondNum)&&(firstNum < thirdNum))
         {
             lowest = firstNum;
         }
         else if((secondNum < firstNum)&&(secondNum < thirdNum))
         {

             lowest = secondNum;
         }
         else{
             lowest = thirdNum;
         }

         //conditions to determine what number is the greatest
         if((firstNum > secondNum)&&(firstNum > thirdNum))
         {

             greatest = firstNum;


         }
         else if ((secondNum > firstNum)&&(secondNum > thirdNum))
         {

             greatest = secondNum;
         }
         else{
             greatest = thirdNum;
         }

         //conditions to determine what number is the middle number
         if((lowest == firstNum)&&(greatest == secondNum)){

             middle = thirdNum;

         }
         else if ((lowest == firstNum)&&(greatest == thirdNum)){

             middle = secondNum;

         }
         else if((lowest == secondNum)&&(greatest == thirdNum)){

             middle = firstNum;

         }
         else if((lowest == secondNum)&&(greatest == firstNum)){

             middle = thirdNum;

         }
         else if((lowest == thirdNum)&&(greatest == firstNum)){

             middle = secondNum;

         }
         else if((lowest == thirdNum)&&(greatest == secondNum)){

             middle = firstNum;
         }


         //Print out output
         System.out.println("The numbers in increasing order are: " +lowest + " "  + middle + " " + greatest);

     }
 }

    /**
     *  The getLowest method compares the three numbers entered and gets the lowest number
     * @param one  first number
     * @param two  second number
     * @param three  third number
     * @return lowest number
     */

 public static int getLowest( int one, int two, int three){

     int low;
     if((one < two)&&(one < three))
     {
         low = one;
     }
     else if((two < one)&&(two < three))
     {

         low = two;
     }
     else{
         low = three;
     }


     return (low);
 }





}


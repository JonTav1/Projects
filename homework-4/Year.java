/*
*
* @author your name here 
* @date 2/19/2018
*
* This class represents a calendar year.
*
* It contains a method that determines if
* the year is a leap year.
*
*/


public class Year{
   
    boolean isLeapYear = false;
    private int year;
    // declare your instance variables here
    
    

    // write your constructor here

    public Year(int y){
        year = y;    
    
    }


    public boolean isLeapYear(){
        
        if (year>1582 && (year % 4) ==0 && (year % 100) != 0 || (year % 400) == 0)
            {
            isLeapYear = true;
                
            }
            return isLeapYear;
        }


        }
        // your code here 
    





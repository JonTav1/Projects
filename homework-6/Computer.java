/*****************************************
 * A template for a computer Nim player
 ****************************************/ 
import java.util.Random;

public class Computer{
    private Random marblesc = new Random();
    private int mode;
    private int choice;
    
    
    public Computer(int m){
        mode = m;
        choice = -1;
    }
    
    public void move(int marblesLeft){
        int i = marblesLeft;
        if(mode == 1){
            choice = marblesc.nextInt(i/2)+1; 
            while(choice == 0){
            choice = marblesc.nextInt(i/2)+1; 
              
            }
        
        }
        if(mode == 2){
            
            if(i == 3| i== 7| i==15| i==31| i==63 | i ==2){
                choice = marblesc.nextInt(i/2)+1;
            }
            else{
                int n = 1;
                int x = 0;

                while(x == 0){
                    choice = marblesc.nextInt(i/2)+1;
                    n = i - choice;

                    if (n == 3| n== 7| n==15| n==31| n==63){
                        x =1;
                    }

                }

            }

        }           
    }
    public int getChoice(){
        return choice;
    }
} 
    
 


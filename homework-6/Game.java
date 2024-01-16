/*****************************************
 * A template for a Nim game
 ****************************************/ 
import java.util.Random;
public class Game{
    
    private int marbles;
    private Human humanPlayer;
    private Computer computerPlayer;
    private Random randomnum = new Random();
    private int turn;
    private int d;
    
    public Game(int difficulty){

        marbles = randomnum.nextInt(91)+ 10; 
        turn = randomnum.nextInt(2);
        d = difficulty; 
    }
     
    public void play(){
        int i = turn; // to know which player goes first 0=human 1=computer
        int marblesleft = marbles;
        Human humanPlayer = new Human();
        Computer computerPlayer = new Computer(d);

        while(marblesleft > 0){
            if (i<1){
                if(marblesleft == 1){
                    i=1;
                    break;
                }
                System.out.println("There are " + marblesleft + " marbles left.");
                humanPlayer.move();
                int choiceh = humanPlayer.getChoice();
                if(choiceh <= marblesleft/2 && choiceh > 0){
                    marblesleft -= choiceh;
                    i=1; 
                    System.out.println("Humans Choice: " + choiceh);
                }
                else{
                    i=0;
                }
            }
            
            if (i>0){
                
                System.out.println("There are " + marblesleft + " marbles left.");
            if(marblesleft == 1){
                i=0;
                break;
                }
                
            computerPlayer.move(marblesleft);
            int choicec = computerPlayer.getChoice();
            marblesleft -= choicec;
            System.out.println("Computers choice: " + choicec);
            i=0;
                
            }
            
           
           
            
        }
        Winner(i);
    }
        // i value used to determine winner

        

        // your code here
    
    
    
    

    // you may wish to add more methods here
    public void Winner(int w){
        String winner;
        if(w == 0){
            winner = "Human";
        }
        else{
            winner = "Computer";
        }
        System.out.println("The Winner is " + winner);
    }


}

  



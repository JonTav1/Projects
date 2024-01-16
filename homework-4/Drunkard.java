import java.util.Random;

public class Drunkard  {
    int avenue;
    int street;
    String getLocation;
    int howFar = 0;

    public Drunkard (int x, int y){
        avenue = x;
        street = y;
    }


    public void step(){
        Random r = new Random();
        int randomnum = r.nextInt(4);

            switch(randomnum){
            
                case 0:
                    avenue += 1;
                    break;
                case 1:
                    avenue -= 1;
                    break;
                case 2:
                    street += 1;
                    break;
                case 3:
                    street -= 1;
                    break;

            }
           
            
}

    public void fastForward(int steps) {
        int s = steps;
        
        for (int i = 0; i <= s; i++){
            step();
            
        }


}

    public String getLocation(){
        String getLocation = ("Avenue " + avenue + " Street " + street);
        return getLocation;

}

    public int howFar(){
        howFar = (Math.abs(avenue)) + (Math.abs(street));
        return howFar;
}
}
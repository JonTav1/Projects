/* Following the specification in the README.md file, provide your 
 * Problem1.java class.
 */
 

 public class Problem1{

  

        public static int pow(int x, int n) {

            if(n==0) {
            return 1;
            }
            if(n==1){
            return x;
            }
            return x * pow(x, n-1);

        }
    
     public static void main (String[] args){ 
            System.out.println( pow(1, 2) );
            System.out.println( pow(3, 4) );
            System.out.println( pow(5, 6) );

}

     }







public class Zipcode{

  private String barcode;
  private String zipcode1;
  
        


        public Zipcode(Object z){

            
            
            String[] codes = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
         
            String x = String.valueOf(z);
        if(x.length()< 5){
            int k = 5 - x.length();
            String t = "";
            for(int i = 0; i < k; i++){
               t += "0"; 
            }
            t += x;
            x = t;
        }
        
        
        if(x.length() == 5){ // zipcode converter, index of "codes" array corresponds to zipcode numbers
            String[] bar = new String[6]; 
            String check;
            
            int total = 0;
            
            
            for(int i = 0; i < x.length() ; i++ ){
                
                int b = Integer.parseInt(String.valueOf(x.charAt(i)));//Integer.parseInt(x.charAt(i)) ;
                total += b;
                
            }

            int mod = total % 10;
            check = String.valueOf(mod);
            String newzip = x + check;
            
            for (int i = 0; i<newzip.length(); i++){
                
               int n = Integer.parseInt(String.valueOf(newzip.charAt(i)));

               bar[i] = codes[n];
                
            }
            
            barcode = ("|"+bar[0]+bar[1]+bar[2]+bar[3]+bar[4]+bar[5]+"|");

            }

        
        if(x.length() == 32){ // barcode converter, 
            int cond;    
            String[] zipcodea = new String[5];
            int high = 6;
            int floor = 1;
            for(int i = 0; i < 5 ; i++ ){
                int g = 0;
                
                cond = 0;
                
                String tem = x.substring(floor, high);
                
                    while(cond == 0){
                        for (int h = 0; h < codes.length; h++){
                            if(tem.equals(codes[h])){
                        
                                
                        
                                zipcodea[i]= String.valueOf(h);
                        
                       
                            }
                            
                    }
                
                        cond = 1;
                    
                    }
                floor = floor+ 5;
                high = high+ 5;


            }
            zipcode1 = (zipcodea[0]+zipcodea[1]+zipcodea[2]+zipcodea[3]+zipcodea[4]);

        }   


        }
        public String getBarcode (){
            return barcode;
        }
        public String getZIPcode (){
            return zipcode1;

        }

}
public class array {
    static int[] scores ;
    public static void main(String args[]){
       
        System.out.println("\ninside array  ") ;
       /* int [] scores = new int[4] ;
        scores[0]= 90;
        scores[1]= 80;
        scores[2]= 70;
        scores[3]= 100;*/
        scores = new int[] {90,80,70,100};

        System.out.println("\nMSE 1: " + scores[0]);
        System.out.println("\nMSE 2: " + scores[1]);
        System.out.println("\nfinal: " + scores[2]);
        System.out.println("\nproject: " + scores[3]);
    }
   
    
}

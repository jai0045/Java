import java.util.Scanner;
public class operators {

    public static void main(String args[]){

   Scanner scanner = new Scanner(System.in);
   System.out.println("you are playing a game ! press q or Q to quit the game ");
   String response = scanner.nextLine();

   if( response.equals("q")|| response.equals("Q")){

   
   System.out.println("You quit the game ");}

   else{
   System.out.println("You are playing the game");
   }




    
        
    }
    
}

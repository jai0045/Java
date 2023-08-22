import java.util.Scanner;
public class midpoint {

    public static void main(String args []){


        int i , j ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two number you want to check the mid point: ");
        i = scanner.nextInt();
        j = scanner.nextInt();

         while(++i< --j);
         {
             System.out.println("Midpoint is : " +i );
         }
         scanner.close();
        

    }
    
}

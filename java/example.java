import java.util.Scanner ;

public class example {
    public static void main(String args []){
        int num ;
        boolean isPrime ;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the number : ");
       num = scanner.nextInt();
       if (num<2) isPrime = false ;
       else isPrime = true ;
       for(int i = 2 ; i<num ;i++){
           if (num % i == 0){
               isPrime = false;
               break ;

           }
       }
       if(isPrime)
       System.out.println("Prime");
       else
       System.out.println("Not prime");
       
    scanner.close();
      

    }
}
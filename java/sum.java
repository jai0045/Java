import java.util.Scanner;
public class sum {

public static void main(String args[]){

    int n , sum = 0 ;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the numbers");
    n = scanner.nextInt();

    while (n>0){
        sum = sum + n%10 ;
        n = n/10 ;
     

    }
    System.out.println("Sum of the digits =" + sum);
    scanner.close();
}

    
}

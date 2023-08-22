import java.util.Scanner  ;
public class Oddeven {
    
    public static void main(String args[]){

    int num ;
    System.out.println("Enter the number: ");
    Scanner scanner = new Scanner(System.in);
    num = scanner.nextInt();

    if(num % 2 == 0)
    {
        System.out.println("Number is even ");
    }
    else{
        System.out.println("Number is odd ");
    }
       scanner.close();

    }
}

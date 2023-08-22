import java.util.Scanner;
public class Arithmetic {
    public static void main (String args[]){
        int a , b , add, subtract, multiply ;
        int x = 1 ;
        float divide ;
        Scanner scanner = new Scanner(System.in);
        
       while(x!=0){
        System.out.println(" Enter two numbes : ");

        a = scanner.nextInt();
        b = scanner.nextInt();
     
        add = a + b;
        subtract = a - b ;
        multiply = a*b ;
        if(a!=0){
            divide = a / b ;
            System.out.println("Divide= "+divide);
        }
        else{
            System.out.println("Division is not possible");
        }
        


        System.out.println("Sum = "+add);
        System.out.println("Difference= "+subtract);
        System.out.println("Multiplication= "+multiply);
        
        System.out.println("enter 1 if you want to continue otherwise 0");
        x = scanner.nextInt();
       }
        
        scanner.close();
    }
    
}

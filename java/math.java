import java.util.Scanner ;

public class math {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);


        double x  ;
        x = scanner.nextDouble();
        double y  ;
        y = scanner.nextDouble();


        
        double q = Math.sqrt(x);
        
        System.out.println("the square root of x is : "+ q);
        double z = Math.sqrt(y) ;
        System.out.println("the square root of y is : "+ z);

        double  i ;
        double j;
        
        System.out.println("Enter the perpendicular : ");
        i = scanner.nextDouble();
        System.out.println("Enter the base: ");
        j = scanner.nextDouble();
         
       double k = Math.sqrt((x*x) + (y*y) );

       System.out.println("The hypotenuse is: "+ k);

       scanner.close();


    }
    
}

import java.util.Scanner;
public class area {
    public static void main(String args[])
    throws java.io.IOException {
    
        char choice ;
        
        do {
          System.out.println("choose one ");
          System.out.println("1. area");
          System.out.println("2. circumference");
          
        
          choice = (char) System.in.read();
        }
        while(choice < '1' || choice > '2');
        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        
        
        switch (choice){
          case '1':
       
      System.out.println("Enter the radius of the circle: ");
      double  r = scanner.nextDouble();
      double area = (22*r*r)/7 ;
      System.out.println("Area of the circle : " +area);
      break ;
      
         case 2 :
         double c = scanner.nextDouble();
      double circumference = (2*22*c/7);
      System.out.println("Circumference of circle: "+circumference);
      
      break ;
    
        }
        scanner.close();
      }
      

    }
  

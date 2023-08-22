import java.util.Scanner;
public class examplearea {
    public static void main(String args[])
    throws java.io.IOException{
        char choice;

        do{
            System.out.println("Choose one : ");
            System.out.println (" 1. Area : ");
            System.out.println (" 2. Circum :");

            choice = (char)System.in.read();
        }
        while ( choice < '1' || choice > '2');
        System.out.println ("\n");

        Scanner sc = new Scanner(System.in);
        
    switch (choice){


        case '1' :
        System.out.println("Enter radius of circle : ");
        double r= sc.nextDouble();
        double area= 3.14*r*r;
       
    

        System.out.println(" Area of circle is :" +area);
        break;

        case '2' :
        System.out.println("Enter radius of circle : ");
        double c =sc.nextDouble();
        double circum= (2*3.14)*c ;
        
    
        System.out.println("Circumference of circle : " +circum);



    }
     sc.close();
    
}
}
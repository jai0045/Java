import java.util.Scanner;
public class inlarge {

    public static void main(String args[]){
        int a , b, c ;
        System.out.println("Enter the numbers: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if(a>=b && a>=c)
        {
            System.out.println(a +" is the greatest");

        }
        else if(b>=a && b>=c)
        {
            System.out.println(b+"is the greatest");

        }
        else{
            System.out.println(c+" is the greatest");

        }
        scanner.close();
        }

    }
    


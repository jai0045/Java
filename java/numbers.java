import java.util.Scanner;
public class numbers {
    public static void main(String args[]){
     int a ,b ,c ;
      Scanner scanner = new Scanner(System.in);
     System.out.println(" Enter value of a and b ");
     a = scanner.nextInt();
     b = scanner.nextInt();
    
     while(b!=0)
     {
         c = a+b ;
         System.out.println(c);
         a = c;
         System.out.println(b);
         b = scanner.nextInt();


     }
     scanner.close();
    }
    
}
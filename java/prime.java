import java.util.Scanner ;
public class prime {
    public static void main(String args []){

        int num ;
         int count = 0 ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = scanner.nextInt();
        for(int i = 2 ; i<num ;i++){
            if (num % i == 0){
                count++;
                break ;

            }
        }
        if(count==0)
        System.out.println("Prime");
        else
        System.out.println("Not prime");
        
     scanner.close();
    }
    
}

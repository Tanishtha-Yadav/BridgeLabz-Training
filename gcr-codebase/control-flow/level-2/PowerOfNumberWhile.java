import java.util.*;
public class PowerOfNumberWhile{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number=sc.nextInt();

        System.out.print("Enter the power: ");
        int power=sc.nextInt();

        if(number>0&&power>=0){
            int result=1;
            int counter=0;
            while(counter<power){
                result=result*number;
                counter++;
            }
            System.out.println("Result: "+result);
        } 
        else{
            System.out.println("Please enter valid positive integers");
        }
        sc.close();
    }
}

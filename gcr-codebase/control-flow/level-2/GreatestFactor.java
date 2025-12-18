import java.util.*;
public class GreatestFactor{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if(number>1){
            int greatestFactor = 1;

            for(int i=number-1;i>=1;i--){
                if(number%i==0){
					greatestFactor=i;
                    break;
                }
            }
            System.out.println("Greatest factor " +greatestFactor);
        } 
        else{
            System.out.println("Please enter an integer greater than 1");
        }
        sc.close();
    }
}

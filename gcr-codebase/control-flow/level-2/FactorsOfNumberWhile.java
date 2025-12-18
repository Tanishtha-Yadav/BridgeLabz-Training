import java.util.*;
public class FactorsOfNumberWhile{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number:");
        int number = sc.nextInt();
		
        if(number>0){
            int counter = 1;
            System.out.println("Factors of "+number+" are:");
            while(counter<=number){
                if (number%counter==0){
                    System.out.println(counter);
                }
                counter++;
            }
        } 
        else{
            System.out.println("Please enter a positive integer");
        }

        sc.close();
    }
}

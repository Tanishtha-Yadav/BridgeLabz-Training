import java.util.*;
public class YoungestAndTallest{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar","Akbar","Anthony"};
        int age[] = new int[3];
        int height[] = new int[3];

        // taking input
        for(int i=0;i<3;i++){
            System.out.println("Enter age of " +names[i]+":");
            age[i] = sc.nextInt();

            System.out.println("Enter height of "+names[i]+":");
            height[i] = sc.nextInt();
        }

        // Finding youngest and tallest
        int youngestIndex=0;
        int tallestIndex=0;

        for(int i=1;i<3;i++){
            if(age[i]<age[youngestIndex]){
                youngestIndex = i;
            }
            if(height[i]>height[tallestIndex]){
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("Youngest Friend: "+names[youngestIndex]);
        System.out.println("Tallest Friend: "+names[tallestIndex]);

        sc.close();
    }
}

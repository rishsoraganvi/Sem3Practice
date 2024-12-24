import java.util.Scanner;

public class cashCounter {
    public static void main(String[] args) {
        int i,n,q,p,j;
       
        System.out.println("Enter the number of items: ");
        Scanner scan= new Scanner(System.in);
        n=scan.nextInt();
        j=1;
        i=0;
        do { 
            
            p=0;
            q=0;
            System.out.println("Enter the quantity of the item "+j+":");
            q=scan.nextInt();
            System.out.println("Enter the price of the item "+j+":");
            p=scan.nextInt();
            i+=(p*q);
            j++;

            

        } while (j<n+1);
        System.out.println("Your total bill is: "+i);
        scan.close();
        

    }
}

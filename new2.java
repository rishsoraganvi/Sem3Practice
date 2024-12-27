import java.util.Scanner;

public class new2 {
    public static void main(String[] args) {
        Scanner rish= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size= rish.nextInt();
        int i;
        int[] array= new int [size];
        System.out.println("Enter "+size+" elements:");
        for(int j=0;j<size;j++){
            array[j]= rish.nextInt();
        }
        System.out.println("Entered array is as followed: ");
        for(i=0;i<size;i++){
            System.out.println(array[i]);
        }
        do { 
            for (i = 0;i<size;i++){
                array[i]=array[i]+5;
            }
            
        } while (i!=size);

        rish.close();

    }
    
}


import java.util.Scanner;
public class multiplyMatrices {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        //First matrix values to be taken from the user
        System.out.println("Enter the number of rows in first matrix:");
        int row1, col1;
        row1=sc.nextInt();
        System.out.println("Enter the number of columns in first matrix:");
        col1=sc.nextInt();

        System.out.println("Enter the elements of the matrix: ");
        
        int matrix1[][]=new int[row1][col1];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        sc.close();




    }


    
}

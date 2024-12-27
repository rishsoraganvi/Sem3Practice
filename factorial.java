// factorial of number using classes
import java.util.Scanner;
class Test{
    static long factorial(int n){
        long res=1;
        for(int i=2;i<=n;i++){
            res*=i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();

        System.out.println("Factorial of "+num+" is: ");
        System.out.println(factorial(num));
        sc.close();
    }
}
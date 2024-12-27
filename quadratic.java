import java.util.Scanner;

public class quadratic {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter coefficients a, b, c: ");
        
        try (Scanner sc = new Scanner (System.in)) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }
            double determinant = (b * b) - 4 *a*c;

        if (determinant > 0) {
            System.out.println("Roots are real and distinct \n");
            double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (determinant == 0) {
            System.out.println("Roots are equal and real numbers \n");
            double root1 = -b / (2 * a);
            double root2 = -b / (2 * a);
            System.out.println("The root1 is " + root1+" and root2 is "+root2);
        } else {
            System.out.println("Roots are imaginary and complex \n");
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
            System.out.println("The roots are " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");
        }
    }
}


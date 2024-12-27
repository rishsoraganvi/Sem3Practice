public class IncreDecreOpeators {
    //ONE OF THE MOST IMPORTANT TOPICS TO BE REVISED DURING INTERVIEWS
    // THERE ARE TWO TYPES IN EACH: PREFIX AND POSTFIX

    //          Increment
    //Prefix-> y=++x
    // i. Increase the value of X
    // ii. Assign the value of X to Y
    // Postfix-> y=x++
    // i. Assign the value of X to Y
    // ii. Increase the value of X
    
    //          Decrement
    //Prefix-> y=--x
    // i. Decrease the value of X
    // ii. Assign the value of X to Y
    // Postfix-> y=x--
    // i. Assign the value of X to Y
    // ii. Decrease the value of X

    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c;
        int d;
        c=++b;
        d=a++;
        c++;
        System.out.println("The value of a is:"+a);
        System.out.println("The value of b is:"+b);
        System.out.println("The value of c is:"+c);
        System.out.println("The value of d is:"+d);
        int x=2;
        x+=x++ + ++x/2;
        System.out.println("The value of x is:"+x);
        int y=2;
        y+= --y + y--+--y;
        System.out.println("The value of y is:"+y);
        

    }


    
}

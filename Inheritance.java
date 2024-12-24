// Single Inheritance

class Base{
    int a;
}
class Child extends Base{
    int b;
    Child(){
        a=10;
        b=20;
    }
    void sum(){
        System.out.println("Sum is: "+(a+b));

    }
}
class Test1{
    public static void main(String[] args) {
        Child obj=new Child();
        System.out.println("Single Inheritance ");
        obj.sum();

    }
}
/*OUTPUT:
 * Single Inheritance 
   Sum is: 30
 */




// Multilevel Inheritance 

class GrandParent{
    int a;
}
class Parent extends GrandParent{
    int b;
}
class Child2 extends Parent{
    int c;
    Child2(){
        a=10;
        b=20;
        c=30;
    }
    void sum(){
        System.out.println("Sum is: "+(a+b+c));
    }
}
class Test2{
    public static void main(String[] args) {
        Child2 obj=new Child2();
        System.out.println("Multilevel Inheritance");
        obj.sum();
    }
}
/*OUTPUT:
 * Multilevel Inheritance
   Sum is: 60
 */




//Hierachial Inheritance 

class Base1{
    int a;
}
class Derived1 extends Base1{
    int b;
    Derived1(){ //constructor of child 1 class
        a=10;
        b=20;
    }
    void sum(){
        System.out.println("Sum is "+(a+b));
    }
}
class Derived2 extends Base1{
    int c;
    Derived2(){ //constructor of child 2 class
        a=30;
        c=40;
    }
    void mul(){
        System.out.println("Product is "+(a*c));
    }
}
class Test3{
    public static void main(String[] args) {
        Derived1 obj1=new Derived1(); //object for first class (Derived 1)
        Derived2 obj2=new Derived2(); //object for second class (Derived 2)
        System.out.println("Hierachial Inheritance");
        obj1.sum(); 
        obj2.mul();
    }
}
/*OUTPUT:
 * Hierachial Inheritance
   Sum is 30
   Product is 1200
 */




//Hybrid Inheritance 

class BaseA{
    int a;
}
class BaseB extends BaseA{
    int b;
}
class BaseD extends BaseB{
    int c;
    BaseD(){
        a=10;
        b=20;
        c=30;
    }
    void sum(){
        System.out.println("Sum is "+(a+b+c));
    }
}
class BaseC extends BaseA{
    int d;
    BaseC(){
        a=40;
        d=50;
    }
    void mul(){
        System.out.println("Product is :"+(a*d));
    }
}
class Test4{
    public static void main(String[] args){
        BaseD obj1 =new BaseD();
        BaseC obj2 =new BaseC();
        System.out.println("Hybrid Inheritance");
        obj1.sum();
        obj2.mul();

    }
}
/*OUTPUT:
 * Hybrid Inheritance
   Sum is 60
   Product is :2000
 */
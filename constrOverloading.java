package Sem3Practice;
class conOver{
    String name;
    int roll;

    public conOver(){
        System.out.println("This is default constructor");
    }

    public conOver(String name,int roll){
        this.name=name;
        this.roll=roll;
    }

    public static void main(String[] args) {
        conOver s1=new conOver();
        System.out.println("Default constructor\n");
        conOver s2=new conOver("rishab",23);
        System.out.println("Parameter constructor");
        
        
        System.out.println(s2.name);
        System.out.println(s2.roll);



    }
}

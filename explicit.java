package Sem3Practice;
public class explicit {
    //target_datatype=(target_datatype)expression;(SYNTAX FOR NARROWING CONVERSION)
    public static void main(String[] args) {
    
        //double to float
        double doubleValue=9.7777777899933;
        float floatValue=(float) doubleValue; 
        //explicit cast from double to float
        System.out.println("Double to float:"+floatValue);


        //float to long 
        long longValue=(long)floatValue;
        System.out.println("float to long:"+longValue);

        //long rto int
        int intValue=(int)longValue;
        System.out.println("long to int:"+intValue);

        //int to byte
        int largeIntValue=130;
        byte byteValue=(byte) largeIntValue;
        System.out.println("int to byte:"+byteValue);
    
    }    
}

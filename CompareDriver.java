public class CompareDriver
{
    public static void main(String[] args){
     String st1 = new String ("ABCD");
     String st2 = new String ("abcd");
     
     Integer i1 = new Integer(1);
     Integer i2 = new Integer(2);
   
     
     System.out.println(Compare1.largest(st1,st2));
     System.out.println(Compare3.largest(st1,st2));
     System.out.println(Compare3.largest(i1,i2));
     System.out.println(Compare3.largest(st1,i2));
    }
}
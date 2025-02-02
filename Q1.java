public class Q1{
    public static void main(String[] args) {
      //System.out.println("hello");
        try{
            String s=null;
            System.out.println(s.length());
        }catch (NullPointerException e){
            System.out.println("nullpointerexception occurred" + e.getMessage());
        }
        finally{
            System.out.println("cleanup exception");
        }
        try{
            int[] a={2,3,4};
            System.out.println(a[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("arrayindexoutofbondexception occurred" + e.getMessage());
        }
        finally{
            System.out.println("cleanup exception");
        }
        System.out.println("program executed successfully");
        
    }
}
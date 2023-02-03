public class string7{
    public static void main(String args[]){
        String s1="utsav";
        String s2="javat";
        String s3="JAVA";
        String s4="python";
        System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same
        System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored
        System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same
    }}
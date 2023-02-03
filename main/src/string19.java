public class string19
{
    public static void main(String args[]){
        String s1="hii how are u";
        String[] words=s1.split("\\r");

        for(String w:words){
            System.out.println(w);
        }
    }
}

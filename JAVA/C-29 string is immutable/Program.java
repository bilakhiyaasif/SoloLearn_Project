public class Program {
    public static void main(String[] args) {

        String s1 = "hello";
        s1.concat("123");
        System.out.println(s1);
        /*
        OP:hello
        here error is not generated because java         
        _       compiler create another object that is,
        s1.concat("123"); 
        means 
        s1---->hello
        temp-->hello123
        so here s1 is not alter but with s1 string 123 
        _       is concat and store in temparary place on heap 
        _       memory data
        */
        s1 = s1 + "123";
        System.out.println(s1);
        //hello123

        //string builder in java

        StringBuilder sb1 = new StringBuilder();
        sb1.append("insert-1");
        sb1.append("\ninsert-2");

        System.out.println("StringBuilder is in java Mutable:");
        System.out.println(sb1);
    }
}

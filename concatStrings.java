import java.lang.FunctionalInterface;

@FunctionalInterface
interface sevenStrings {
    String merge(String a, String b, String c, String d, String e, String f, String g);
}

public class concatStrings {
    public static void main (String[] args){

        sevenStrings concat =  (a, b, c, d, e, f, g) -> (a + b + c + d + e + f + g).toUpperCase();
        String s = concat.merge("The", "lambda", "has","too", "many" ,"string", "arguments");

        System.out.println(s);
    }
}

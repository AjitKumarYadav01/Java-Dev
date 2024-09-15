package String;

public class removeWhiteSpace {
    public static void main(String[] args) {
        //remove white space from string
        String str = "  Software  Development  Engineer  ";
        String withoutSpace = str.replaceAll("\\s", "");
        str = str.trim();
        System.out.println(str);
        System.out.println(withoutSpace);
    }
}

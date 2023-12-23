import java.util.Locale;

public class Bai4 {
    public static void main(String[] args) {
        String name = "Bảo ";
        String msg = "\"Hello\n World\"";
        System.out.println(msg.length());
        System.out.println(msg.toUpperCase(Locale.ROOT));
        System.out.println(msg.indexOf("W"));
        String greeting = name + msg;
        System.out.println(greeting);

    }
}

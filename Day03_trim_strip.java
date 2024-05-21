import java.util.Arrays;

public class Day03_trim_strip {
    public static void main(String[] args) {
        String text = "Hi,      Bye     ,  hello  ";
        String[] words = text.split(",");
        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            // words[i] = words[i].trim();
            words[i] = words[i].strip();
        }

        System.out.println(Arrays.toString(words));
    }
}
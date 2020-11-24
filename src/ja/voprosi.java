package ja;
  import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

  //
public class voprosi {
    public static void main(String[] args) throws IOException {
        String country = "", language = "";
        System.out.println("1 – Немецкий язык");
        System.out.println("2 – Испанский язык");
        System.out.println("3 – Английский язык");
        System.out.println("4 – Французский язык");
        char i = (char) System.in.read();
        switch (i) {
            case '1':
                language = "de";
                country = "DE";
                break;
            case '2':
                language = "es";
                country = "ES";
                break;
            case '3':
                language = "en";
                country = "UN";
                break;
            case '4':
                language = "fr";
                country = "FR";
                break;

        }
        ResourceBundle rb = ResourceBundle.getBundle("question", new Locale(language, country));
        System.out.println(getStr(rb.getString("my.question"), rb.getString("utf16")));
        System.out.println(getStr(rb.getString("my.reply"), rb.getString("utf16")));

        System.out.println(getStr(rb.getString("my.question2"), rb.getString("utf16")));
        System.out.println(getStr(rb.getString("my.reply2"), rb.getString("utf16")));

        System.out.println(getStr(rb.getString("my.question3"), rb.getString("utf16")));
        System.out.println(getStr(rb.getString("my.reply3"), rb.getString("utf16")));

//        System.out.println(rb.getString("my.question")); // Так делать нельзя для некоторых языков, например, белорусского
//        System.out.println(rb.getString("my.reply")); // Âîñü ó ÷ûì ïûòàííå. <- вот так иначе получится
    }

    public static String getStr(String question, String utf16) throws UnsupportedEncodingException {
        if (!utf16.equals("true")) {
            return new String(question.getBytes("ISO-8859-1"), "Windows-1251");
        } else {
            return question;
        }
    }

}


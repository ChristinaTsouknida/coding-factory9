package gr.aueb.cf.cf9.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {

    public static void main(String[] args) {

        String s = "COd1ngF@ct0ry";

        Pattern pattern = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])^.{12,}$");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

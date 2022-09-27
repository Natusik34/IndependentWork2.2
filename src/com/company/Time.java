package com.company;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Time {
    public static void time(String string) {
        Pattern pattern = Pattern.compile("(2[0-3]|[0-1]\\d):[0-5]\\d");
        Matcher matcher = pattern.matcher(string);
        if(matcher.find()) {
            System.out.println(matcher.group());
        } else {
            System.out.println("Dear friend, there are 24 hours in a day, you overdid it, please come back!");
        }
    }
}
package me.vganshin.zodiac.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParser {
    static SimpleDateFormat format = new SimpleDateFormat("dd.MM");

    public static Date parse(String date) {
        try {
            return format.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException();
        }
    }
}

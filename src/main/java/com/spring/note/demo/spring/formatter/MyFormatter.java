package com.spring.note.demo.spring.formatter;

import org.springframework.format.Formatter;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.datetime.joda.JodaTimeFormatterRegistrar;

import java.text.ParseException;
import java.util.Locale;

/**
 * @author xuejunze
 * @date 2021/7/27 2:15 下午
 **/
public class MyFormatter implements Formatter<User> {
    @Override
    public User parse(String s, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(User user, Locale locale) {
        return null;
    }
}

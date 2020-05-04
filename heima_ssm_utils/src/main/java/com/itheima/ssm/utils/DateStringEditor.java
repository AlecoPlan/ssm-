package com.itheima.ssm.utils;

import org.springframework.beans.propertyeditors.PropertiesEditor;

import java.text.ParseException;
import java.util.Date;

/**
 * 日期与字符串转换
 * @author shkstart
 * @creats 2020-05-01-15:27
 */
public class DateStringEditor extends PropertiesEditor {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        try {
            Date date = DateUtils.string2Date(text, "yyyy-MM-dd HH:mm");

            super.setValue(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

package org.learning.util;

import java.time.LocalDateTime;
import java.time.Month;

public class ZodiacSign {
    public static String get(LocalDateTime date) {
        int month = date.getMonth().getValue();
        int day = date.getDayOfMonth();

        if ((month == Month.MARCH.getValue() && day >= 21) || (month == Month.APRIL.getValue() && day <= 19)) {
            return "Aries -> मेष";
        } else if ((month == Month.APRIL.getValue() && day >= 20) || (month == Month.MAY.getValue() && day <= 20)) {
            return "Taurus -> वृषभ";
        } else if ((month == Month.MAY.getValue() && day >= 21) || (month == Month.JUNE.getValue() && day <= 21)) {
            return "Gemini -> मिथुन";
        } else if ((month == Month.JUNE.getValue() && day >= 22) || (month == Month.JULY.getValue() && day <= 22)) {
            return "Cancer -> कर्क";
        } else if ((month == Month.JULY.getValue() && day >= 23) || (month == Month.AUGUST.getValue() && day <= 22)) {
            return "Leo -> सिंह";
        } else if ((month == Month.AUGUST.getValue() && day >= 23) || (month == Month.SEPTEMBER.getValue() && day <= 22)) {
            return "Virgo -> कन्या";
        } else if ((month == Month.SEPTEMBER.getValue() && day >= 23) || (month == Month.OCTOBER.getValue() && day <= 23)) {
            return "Libra -> तुला";
        } else if ((month == Month.OCTOBER.getValue() && day >= 24) || (month == Month.NOVEMBER.getValue() && day <= 21)) {
            return "Scorpio -> वृश्चिक";
        } else if ((month == Month.NOVEMBER.getValue() && day >= 22) || (month == Month.DECEMBER.getValue() && day <= 21)) {
            return "Sagittarius -> धनु";
        } else if ((month == Month.DECEMBER.getValue() && day >= 22) || (month == Month.JANUARY.getValue() && day <= 19)) {
            return "Capricorn -> मकर";
        } else if ((month == Month.JANUARY.getValue() && day >= 20) || (month == Month.FEBRUARY.getValue() && day <= 18)) {
            return "Aquarius -> कुम्भ";
        } else if ((month == Month.FEBRUARY.getValue() && day >= 19) || (month == Month.MARCH.getValue() && day <= 20)) {
            return "Pisces -> मीन";
        }

        return "Unable to find";
    }
}

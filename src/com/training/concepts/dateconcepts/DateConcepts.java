package com.training.concepts.dateconcepts;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateConcepts {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(1987, 11, 20);
        System.out.println("Date of birth :" + calendar.getTime());
        final Date votingDate = whenIsHeEligibleForVoting(calendar);
        System.out.println("Baby was born on " + calendar.getTime()
                + ", and voting eligibility date is: " + votingDate);

        // Date format
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        final String format = dateFormat.format(votingDate);
        System.out.println(format);

        DateFormat dateFormatMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(dateFormatMedium.format(votingDate));
        DateFormat dateFormatLong = DateFormat.getDateInstance(DateFormat.LONG, new Locale("jp"));
        System.out.println(dateFormatLong.format(votingDate));

        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

    }

    /**
     * a =0, b=0  return to 0
     * a=-1 b =100 return expected: 99 actual:  ?
     *
     * @param a
     * @param b
     * @return
     */
    public static BigInteger add(BigInteger a, BigInteger b) {
        return a.add(b);
    }

    private static Date whenIsHeEligibleForVoting(Calendar dateOfBirth) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfBirth.getTime());
        calendar.add(Calendar.YEAR, 18);
        return calendar.getTime();
    }

}

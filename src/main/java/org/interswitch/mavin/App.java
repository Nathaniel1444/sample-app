package org.interswitch.mavin;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UpperLowerCase ulCase = new UpperLowerCase();
        System.out.printf("%s to %s \n", "Hello World", " ",
            ulCase.wordToUpperCase("Hello World"));
        System.out.printf("%s to %s \n", "Hello World", " ",
                ulCase.wordToLowerCase("Hello World"));
        LocalDate date = LocalDate.of(2023, 8, 18);
        LocalTime time = LocalTime.of(15, 30);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println("New feature by " + "Back bone team at the time " + dateTime);
    }
}

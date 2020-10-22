package main;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class test {

	public static void main(String[] args) {
        LocalDateTime dateAndtime = LocalDateTime.now();
        LocalDate onlyDate = LocalDate.now();
        //System.out.println("Current date and time: " + dateAndtime);
        System.out.println("Current date: " + onlyDate);
    }
}
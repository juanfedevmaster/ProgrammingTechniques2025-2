/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.juanfedevmaster.regexexample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jufeq
 */
public class RegexExample {

    public static void main(String[] args) {
        String input = "1234-56789";
        String regex = "\\d{4}-\\d{4}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Valid Format");
        } else {
            System.out.println("Invalid Format");
        }

        // Example 2:
        String inputEmail = "juan.quintanag";
        String regexEmail = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";

        pattern = Pattern.compile(regexEmail);
        matcher = pattern.matcher(inputEmail);
        
        if (matcher.matches()) {
            System.out.println("Email Valid Format");
        } else {
            System.out.println("Email Invalid Format");
        }
        
        // Example 3:
        String inputCellphone = "3002223345";
        String regexCellphone = "^(3[0-9]{9})$";
        
        pattern = Pattern.compile(regexCellphone);
        matcher = pattern.matcher(inputCellphone);
        
        if (matcher.matches()) {
            System.out.println("Cellphone Valid Format");
        } else {
            System.out.println("Cellphone Invalid Format");
        }

    }
}

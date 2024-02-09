/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.regex.Pattern;

/**
 *
 * @author MCTech
 */
public class A {
    
    public static void main(String[] args) {
        String text = "0701794934";
        String regex = "07[01245678][0-9]{7}";
        
        boolean status = Pattern.compile(regex).matcher(text).matches();
        System.out.println(status);
    }
    
}

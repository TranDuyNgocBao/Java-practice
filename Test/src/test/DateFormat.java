/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author ADMIN
 */
public class DateFormat {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formatter.parse(result);
        } catch (ParseException ex) {
            System.out.println("False");
        }
    }
}

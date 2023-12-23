/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ADMIN
 */
public class Input_check {
    String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Input_check() {
        this.a = a;
    }
    
    public String input_str(){
        String a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        return a;
    }
    
    public void input_phone1(){
        boolean ch = true;
        System.out.print("=> Input your phone number (not required length): ");
        do {
            try {
                String input;

                input = input_str();

                String regex = "^0\\d+$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(input);

                if (!matcher.find()) {
                    throw new Exception();
                }
                System.out.println("Right phone number1 format: " + input);
                ch = false;
            } catch (Exception e) {
                System.out.print("Wrong format, pls try again: ");
            }
        } while (ch);
    }
    
    public void input_phone2(){
        boolean ch = true;

        System.out.println("=> Input your phone number(must be only 10 numbers)");
        System.out.print("Format number in VietNam [ex:(+84) 3798876]: ");
        do {
            try {
                String input = "(+84) ";

                System.out.print(input);
                input += input_str();

                String regex = "^\\(\\+84\\)\\s{1,}\\d{9}$";
                if (!input.matches(regex)) {
                    throw new Exception();
                }
                System.out.println("Right phone number 2 format: " + input);
                ch = false;
            } catch (Exception e) {
                System.out.println("Phone number must include only 9 numbers or right format.");
                System.out.print("Pls enter again: ");
            }
        } while (ch);
    }
    
    public void input_email(){
        boolean ch = true;
        System.out.print("=> Input your email address(ex: Bao123@email.com): ");
        do {
            try {
                String input;
                input = input_str();

                String regex = "^[a-zA-Z]+[a-zA-Z0-9]*@{1}[a-z]mail.com$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(input);

                if (!matcher.find()) {
                    throw new Exception();
                }
                System.out.println("Right email format: " + input);
                ch = false;
            } catch (Exception e) {
                System.out.print("Wrong format, pls try again: ");
            }
        } while (ch);
    }
    
    public void input_date(){
        boolean ch = true;
        System.out.print("=> Input day (dd/mm/yyyy: 02/03/2001): ");
        do{
        String input;
        input = input_str();
        
        String regex = "^\\d{2}\\/\\d{2}\\/\\d{4}$";
        
        if(input.matches(regex)){
            System.out.println("Right format: " + input);
            ch= false;
        }else{
            System.out.print("Wrong Format, pls enter again: ");
        }
        }while(ch);
    }
    
}

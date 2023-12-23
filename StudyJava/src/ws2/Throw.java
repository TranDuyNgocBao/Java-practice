/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ADMIN
 */
public class Throw {
    public static void main(String[] args) {
        boolean cont = true;
        do{
            try{
                String s ="";
                String pattern = "^SE\\d{3}$";
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the string: ");
                s = sc.nextLine();
                Pattern pt = Pattern.compile(pattern);
                Matcher matcher= pt.matcher(s);
                if(!matcher.find()){
                    throw new Exception();
                }
                System.out.println(s);
                cont = false;
            } catch(Exception e){
                System.out.println("wrong,try again");
            }
        }while(cont);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Throws {
    public String inputString() throws Exception{
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string: ");
        s = sc.nextLine();
        
        String pattern="^SE\\d{3}$";
        if(!s.matches(pattern))throw new Exception();
        return s;
    }
    
    public static void main(String[] args) {
        Throws obj = new Throws();
        boolean cont = true;
        do{
            try{
               String s = obj.inputString();
                System.out.println(s);
                cont = false;
            }catch(Exception e){
                System.out.println("Wrong");
            }
        }while(cont);
        String tmp="";
        if(tmp.isEmpty())System.out.println("yesdsf");
    }
}

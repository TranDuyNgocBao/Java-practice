/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot9;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Utils {
    public static String getString(String str){ // static nghĩa là quyền quản lý thuộc về Class chứ không phải object
        String result = "";
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do{
            System.out.print(str);
            String tmp = sc.nextLine();
            if(!tmp.isEmpty()){
                result = tmp;
                check = false;
            }
        }while(check);
        return result;
    }
    
    public static String updateString(String oldValue, String str){
        String result = oldValue;
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        String tmp = sc.nextLine();
        if(!tmp.isEmpty()){
            result = tmp;
        }
        return result;
    }
}

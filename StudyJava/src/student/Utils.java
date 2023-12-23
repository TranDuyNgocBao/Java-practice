/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Utils {

    public static String getStr() {
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        return result;
    }

    public static String getCourse() {
        Scanner sc = new Scanner(System.in);
        String result = "";
        boolean check = true;
        do {
            try {
                result = sc.nextLine();
                String regex1 = "^Java*";
                String regex2 = "^.Net*";
                String regex3 = "^C\\/C\\+\\+*";
                if (result.matches(regex1) || result.matches(regex2) || result.matches(regex3)) {
                    check = false;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Wrong course, try again: ");
            }
        } while (check);
        return result;
    }
}

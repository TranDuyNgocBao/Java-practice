/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Array {
    public static void main(String[] args) {
//        int[] arr = {};
//        for(int i =0; i<10; i++){
//            arr[i] = i;
//        }
        
        List<Integer> brr = new ArrayList<>();
        brr.add(3);
        brr.add(2);
        brr.add(1);
        Collections.sort(brr);
        System.out.println(brr);
        String s = "1abc";
        s.length();
        System.out.println();
        int a = (int) 'a';
        System.out.println(a);
    }
}

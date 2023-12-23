/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class In_arr {
    int a[];
    int n = 0;

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public In_arr() {
        this.a = a;
        this.n = n;
    }
    
    public int input_num(){
        Scanner sc = new Scanner(System.in);
        int n;
        n = Integer.parseInt(sc.nextLine());
        return n;
    }
    
    public void in_arr(){
        System.out.print("Enter length: ");
        n = input_num();
        if(a == null){
            a = new int[n];
        }
        System.out.println("Enter elements: ");
        for(int i = 0; i <n; i++){
            System.out.print("Element " + (i+1) +": ");
            a[i]=input_num();
        }
        
    }
    
    public void BB_sort(){
        for(int i = 0; i<n; i++)
            for(int j = 0; j < n - i -1; j++){
                if(a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
    }
    
    public void out_arr(){
        System.out.print("Array: [ ");
        for(int i = 0 ; i<n; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println("}");
    }
}

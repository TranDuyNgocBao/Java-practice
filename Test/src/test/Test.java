/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Test {
    
    int a[];
    int n;

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

    public Test() {
        this.a = a;
    }

    public Test(int[] a, int n) {
        this.a = a;
        this.n = n;
    }

    public Test(int n) {
        this.n = n;
    }
    
    public void enterLength(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length ");
        n = sc.nextInt();
    }
    
    public void enterElement(){
        Scanner ac = new Scanner(System.in);
        if( a == null){
            a = new int[n];
        }
        for(int i=0; i<n; i++){
            System.out.print("Enrer["+ (i+1) + "]+" );
            a[i]= ac.nextInt();
        }
    }
    
    public void displayArray(){
        System.out.print("Array: [");
        for(int i =0; i<n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.print("]");
    }
    
    public int smallestElement(){
        int smallest = a[0];
        for(int i=1; i<n; i++){
            if(smallest > a[i]){
                smallest = a[i];
            }
        }
        return smallest;
    } 
    
    public double averageArray(){
        double S=0;
        for(int x : a )S+=x;
        return (S/n);
    }
    
    public void bubblesort(){
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){
                if(a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }
}

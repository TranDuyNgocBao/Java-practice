/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjava;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class CvTNum {
    int n;
    String a="";

    public int getN() {
        return n;
    }

    public String getA() {
        return a;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setA(String a) {
        this.a = a;
    }

    public CvTNum() {
        this.n = n;
    }

    public CvTNum(String a) {
        this.a = a;
    }
    
    public void input_integer(){
        System.out.print("Input n = ");
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
    }
    
    public void cvt_dec_bin(){
        int m = n;
        while(m!=0){
            int r;
            r= m%2;
            m = m/2;
            a=Integer.toString(r)+a;
        }
    }
    
    public void output_str(){
        System.out.println("Decimal "+ n + " to Binary: "+ a);
    }
}

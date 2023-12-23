/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author ADMIN
 */
public class Bubble_sort {
    public static void main(String[] args) {
        In_arr obj = new In_arr();
        obj.in_arr();
        obj.BB_sort(); // Sắp xêp theo bubble sort từ BÉ đến Lớn
        System.out.println("Array after Bubble sort:");
        obj.out_arr();
    }
}

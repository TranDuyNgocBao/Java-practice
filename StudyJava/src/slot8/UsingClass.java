/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot8;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class UsingClass {
    public static void main(String[] args) {
        ClassA classA = new ClassA("blue"); // Nếu chưa có hàm khởi tạo bên Class A thì hệ thống tự tạo con nếu có rồi thì bắt buộc dùng cái đã khai báo
        classA.setColor("Blue");
        classA.getColor();
        
        ClassB classB = new ClassB();
        classB.calculateValue("Blue");
        classB.color = "blue";
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        // Cach 1
//        if(num > 10){
//           classB.setNumber(0); 
//        }
        
        //Cach 2
        classB.setNumber(num);
    }
}

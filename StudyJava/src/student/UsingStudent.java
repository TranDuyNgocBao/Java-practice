/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author ADMIN
 */
public class UsingStudent {
    public static void main(String[] args) {
        StudentManagement obj = new StudentManagement();
        Student ob = new Course();
        ob.input();
        obj.mymap.put(ob.getId(), ob.getName());
        System.out.println(obj.mymap);
    }
}

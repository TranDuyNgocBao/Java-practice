/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_and_abstract;

/**
 *
 * @author ADMIN
 */
//public class Circle implements Shape{
//
//    @Override
//    public void draw() {
//        System.out.println("Circle " + color + " draw");
//    }
//    
//}

public class Circle extends ShapeAbstract{

    @Override
    public void draw() {
        System.out.println("Circle " + super.getColor() + " draw");
    }
    
}

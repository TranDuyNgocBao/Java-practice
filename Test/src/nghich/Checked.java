/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nghich;

/**
 *
 * @author ADMIN
 */

class Base{
    public void Base(){
        System.out.println("Base");
    }
    void outi(){}
}

class BB extends Base{
    public void BB(){
        System.out.println("BB");
    }
    void outi(){System.out.println("BB");
    }
}

public class Checked extends Base{
    public static void main(String[] args) {
        Base d = new BB();
        d.outi();
    }
}




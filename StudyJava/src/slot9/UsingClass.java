/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot9;

/**
 *
 * @author ADMIN
 */
public class UsingClass {
    public static void main(String[] args) {
        Candidate cd = new Candidate();
        System.out.println("Information");
        System.out.println(cd.toString());
        
        cd.createCandidate();
        System.out.println("Information");
        System.out.println(cd.toString());
        
        cd.updateCandidate();
        System.out.println("Information");
        System.out.println(cd.toString());
        
        Experience exp = new Experience();
        exp.createCandidate();
        System.out.println("exp Information");
        System.out.println(exp.toString());
    }
}

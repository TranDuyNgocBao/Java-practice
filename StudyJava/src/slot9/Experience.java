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
public class Experience extends Candidate{
    private int expYear;
    private String proSkill;
    
    public Experience() {
    }

    public Experience(int expYear, String proSkill, String id, String fName, String lName, String birthday, String address, String phone, String email) {
        super(id, fName, lName, birthday, address, phone, email);
        this.expYear = expYear;
        this.proSkill = proSkill;
    }

    @Override
    protected void createCandidate() {
        super.createCandidate();
        this.expYear = Integer.parseInt(Utils.getString("Experience Year: "));
        this.proSkill = Utils.getString("Professional Skill: ");
    }
    
    public String toString(){
        return super.toString() + "," + this.expYear + "," + this.proSkill;
    }
    
}

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
public class Candidate {
    protected String id;
    protected String fName;
    protected String lName;
    protected String birthday;
    protected String address;
    protected String phone;
    protected String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Candidate(String id, String fName, String lName, String birthday, String address, String phone, String email) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Candidate() {
    }

    
    protected void createCandidate(){
        System.out.println("Create Candidate");
        this.id = Utils.getString("ID: ");
        this.fName = Utils.getString("First Name: ");
        this.lName = Utils.getString("Last Name: ");
        this.birthday = Utils.getString("Birthday: ");
        this.address = Utils.getString("Address: ");
        this.phone = Utils.getString("Phone: ");
        this.email = Utils.getString("Email: ");

    }
    
    protected void updateCandidate(){
        System.out.println("Update Candidate");
        this.id = Utils.updateString(this.id, "New ID: ");
        this.fName = Utils.updateString(this.fName, "New fName: ");
        this.lName = Utils.updateString(this.lName, "New lName: ");
        this.birthday = Utils.updateString(this.birthday, "New birthday: ");
        this.address = Utils.updateString(this.address, "New address: ");
        this.phone = Utils.updateString(this.phone, "New phone: ");
        this.email = Utils.updateString(this.email, "New email: ");
    }

    @Override
    public String toString() {
         return(this.id + "," + this.fName + "," + this.lName + "," + this.birthday + "," + this.address + "," + this.phone + "," + this.email);
        
    }
    
    protected void deleteCandidate(){
    }
}

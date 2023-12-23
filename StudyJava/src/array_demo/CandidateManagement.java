/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_demo;

/**
 *
 * @author ADMIN
 */
public class CandidateManagement {
    private Candidate [] candidateList;
    private int currentIndex;
    public static final int MAX = 100;

    public CandidateManagement() {
        this.candidateList = new Candidate[MAX];
        currentIndex = 0; 
    }

    public CandidateManagement(Candidate[] candidateList, int currentIndex) {
        this.candidateList = candidateList;
        this.currentIndex = currentIndex;
    }

    public Candidate[] getCandidateList() {
        return candidateList;
    }

    public void setCandidateList(Candidate[] candidateList) {
        this.candidateList = candidateList;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }
    
    public boolean add(Candidate cand){
        boolean result = false;
        if(this.candidateList != null && currentIndex<MAX){
            this.candidateList[currentIndex++]=cand;
            result = true;
        }
        return result;
    }
    
    public Candidate findCandidateByID(String id){
        Candidate result = null;
        for (int i=0; i<currentIndex; i++) {
            if(candidateList[i].getId().equals(id)){
                result = candidateList[i];
                break;
            }
        }
        return result;
    }
    
    public void display(){
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(candidateList[i].toString());
        }
    }
    
    public boolean update(int index){
        boolean result = false;
        if(index >=0 && index<currentIndex){
            candidateList[index].updating();
            result = true;
        }
        return result;
    }
    
    public boolean remove(int index){
        boolean result = false;
        if(index >=0 && index<currentIndex){
            for (int i = index; i < currentIndex-1; i++) {
                candidateList[i]=candidateList[i+1];
            }
            currentIndex--;
            result = true;
        }
        return result;
    }
    
    public void displayByFresher(){
        for (int i = 0; i < currentIndex; i++) {
            if(candidateList[i] instanceof Fresher){
                System.out.println(candidateList[i].toString());
            }
        }
    }
    
    public void displayByExperience(){
        for (int i = 0; i < currentIndex; i++) {
            if(candidateList[i] instanceof Experience){
                System.out.println(candidateList[i].toString());
            }
        }
    }
    
    public void sort(){
        for (int i = 0; i < currentIndex-1; i++) {
            for (int j = i; j < currentIndex; j++) {
                if(candidateList[j].getId().compareTo(candidateList[i].getId())>0){
                    Candidate tmp = candidateList[i];
                    candidateList[i]=candidateList[j];
                    candidateList[j]=tmp;
                }
            }
        }
    }
}

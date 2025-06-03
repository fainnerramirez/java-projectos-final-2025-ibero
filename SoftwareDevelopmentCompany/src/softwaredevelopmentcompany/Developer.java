/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwaredevelopmentcompany;

/**
 *
 * @author framir02
 */
public class Developer {
     private String name;
    private String email;
    private int identifier;
    
    public Developer() {}
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setIndentifier(int identifier){
        this.identifier = identifier;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public int getIdentifier(){
        return this.identifier;
    }
}

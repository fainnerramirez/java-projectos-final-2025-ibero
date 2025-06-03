package softwaredevelopmentcompany;

/**
 *
 * @author Fainner Ramirez [framir28@estudiante.ibero.edu.co]
 */
public class Director {
    private String name;
    private String email;
    private int identifier;
    
    public Director() {}
    
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


package ecommercestore;

/**
 *
 * @author Fainner Ramirez [framir28@estudiante.ibero.edu.co]
 */
public class Product {
    private String name;
    private double price;
    
    public Product() {}
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getPrice(){
        return this.price;
    }
}

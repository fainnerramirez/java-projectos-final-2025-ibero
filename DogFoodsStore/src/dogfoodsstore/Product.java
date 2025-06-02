package dogfoodsstore;

/**
 *
 * @author Fainner Ramirez [framir28@estudiante.ibero.edu.co]
 */

public class Product {
    private String productName;
    private double price;
    private int stock;
    private float sizeSack;
    
    public Product() {}
    
    public void setName(String name){
        this.productName = name;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setStock(int stock){
        this.stock = stock;
    }
    
    public void setSizeSack(float size){
        this.sizeSack = size;
    }
    
    public String getName(){
        return this.productName;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public int getStock(){
        return this.stock;
    }
    
    public float getSizeSack(){
        return this.sizeSack;
    }
}

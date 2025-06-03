package ecommercestore;

import java.util.ArrayList;

/**
 *
 * @author Fainner Ramirez [framir28@estudiante.ibero.edu.co]
 */
public class Store {
    private ArrayList<Product> products;
    private ArrayList<Product> carShopping;
    
    public Store() {
        this.products = new ArrayList<Product>();
        this.carShopping = new ArrayList<Product>();
    }
    
    public void ShowProducts(){
        int i = 1;
        for(var prod: this.products){
            System.out.println("producto # " + i++);
            System.out.println("Nombre: " + prod.getName());
            System.out.println("Precio: " + prod.getPrice());
            System.out.println("-------------------------------");
        }
    }
    
    public void showCarShopping(){
        for(var car: this.carShopping){
            System.out.println("Nombre del producto: " + car.getName());
            System.out.println("---------------------------------------");
        }
    }
    
    public void addToCarShopping(Product product){
        this.carShopping.add(product);
    }
}

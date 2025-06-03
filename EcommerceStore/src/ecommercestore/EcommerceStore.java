package ecommercestore;

import java.util.Scanner;

/**
 *
 * @author Fainner Ramirez [framir28@estudiante.ibero.edu.co]
 */
public class EcommerceStore {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        var store = new Store();

        System.out.println("\n MENU DE ECOMMERCE");
        System.out.println("1. Ver productos");
        System.out.println("2. Agregar producto al carrito");
        System.out.println("3. Ver carrito");
        System.out.println("4. Salir");
        System.out.println("Selecciona una opcion: ");
        int option = input.nextInt();
        input.nextLine();
        
        do{
            
            switch(option){
                case 1: 
                    store.ShowProducts();
                    break;
                    
                case 2: 
                    System.out.println("Ingrese el nombre del producto: ");
                    String nameProduct = input.nextLine();
                    System.out.println("Ingrese el precio del producto");
                    double priceProduct = input.nextDouble();
                    
                    var product = new Product();
                    
                    product.setName(nameProduct);
                    product.setPrice(priceProduct);
                 
                    store.addToCarShopping(product);
                    
                    break;
                case 3: 
                    store.showCarShopping();
                    break;
                    
                default: 
                    System.out.println("Opción no válida!");
                    break;
            }
            
        }while(option != 4);
    }
}

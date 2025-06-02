package dogfoodsstore;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fainner Ramirez [framir28@estudiante.ibero.edu.co]
 */
public class DogFoodsStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        var listProducts = new ArrayList<Product>();
        int option = 0;
        
        do {
            
            System.out.println("1. Registrar una nueva purina");
            System.out.println("2. Listar todos los productos");
            System.out.println("3. Total de ventas");
            System.out.println("4. Buscar producto por nombre");
            System.out.println("5. Actualizar stock de un producto");
            System.out.println("6. Salir del sistema");
            option = input.nextInt();
            input.nextLine();
            
            switch(option){
                case 1: 
                    
                    String name = "";
                    System.out.println("Ingrese el nombre del producto: ");
                    name = input.nextLine();
                    
                    double price = 0;
                    System.out.println("Ingrese el precio del producto");
                    price = input.nextDouble();
                    
                    int stock = 0;
                    System.out.println("Ingrese el stock del producto");
                    stock = input.nextInt();
                    
                    float size = 0f;
                    System.out.println("Ingrese el tamaño del saco del producto (Kgs)");
                    size = input.nextFloat();
                    
                    var product = new Product();
                    
                    product.setName(name);
                    product.setPrice(price);
                    product.setStock(stock);
                    product.setSizeSack(size);
                    
                    listProducts.add(product);
                    
                    break;
                    
                case 2: 
                    int i = 0;
                    for(var p:listProducts) {
                        System.out.println("Producto #" + ++i);
                        System.out.println("Nombre: " + p.getName());
                        System.out.println("Precio: " + p.getPrice());
                        System.out.println("Stock: " + p.getStock());
                        System.out.println("Tamaño del saco: " + p.getSizeSack());
                    }
                    
                    break;
                    
                case 3: 
                    double totalVentas = listProducts.stream().mapToDouble(Product::getPrice).sum();
                    System.out.println("El total de ventas actual es: " + totalVentas);
                    break;
                
                case 4:
                   
                    System.out.println("Ingrese el nombre del producto: ");
                    final String nameProduct = input.nextLine();
                    
                    var productFind = listProducts.stream().filter(pro -> pro.getName().equalsIgnoreCase(nameProduct)).findFirst().get();
                    
                    System.out.println("=========== Producto encontrado =======");
                    
                    System.out.println("Nombre: " + productFind.getName());
                    System.out.println("Precio: " + productFind.getPrice());
                    System.out.println("Stock: " + productFind.getStock());
                    System.out.println("Tamaño del saco: " + productFind.getSizeSack());
                    
                    break;
                    
                case 5: 
                    
                    System.out.println("Ingrese el producto a actualizar el stock");
                    final String productName = input.nextLine();
                    var productFind2 = listProducts.stream().filter(pro -> pro.getName().equalsIgnoreCase(productName)).findFirst().get();
                    
                    if(productFind2 != null) {
                        System.out.println("Ingrese el número de Stock a actualizar: ");
                        int newStock = input.nextInt();
                        productFind2.setStock(newStock);
                        System.out.println("El producto " + productFind2.getName() + " Ha sido actualizado!");
                    }
                    else {
                        System.out.println("El producto " + productName + " No ha sido encontrado!");
                    }
                    
                    break;
            }
        
        } while(option != 6);
    }
}

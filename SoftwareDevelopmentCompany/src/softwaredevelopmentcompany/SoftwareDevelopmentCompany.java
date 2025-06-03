package softwaredevelopmentcompany;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fainner Ramirez [framir28@estudiante.ibero.edu.co]
 */
public class SoftwareDevelopmentCompany {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        var listDirectors = new ArrayList<Director>();
        var listDevelopers = new ArrayList<Developer>();
        var listTesters = new ArrayList<Tester>();
        int option = 0;

        do {

            System.out.println("1. Registrar Director");
            System.out.println("2. Registrar Developer");
            System.out.println("3. Registrar un Tester");
            System.out.println("4. Salir del sistema");
            option = input.nextInt();

            input.nextLine();

            switch (option) {
                case 1:

                    System.out.println("Ingrese el nombre del director: ");
                    String name = input.nextLine();
                    System.out.println("Ingrese el correo del director: ");
                    String email = input.nextLine();
                    System.out.println("Ingrese el # de indetificación del director: ");
                    int identifier = input.nextInt();

                    var director = new Director();

                    director.setName(name);
                    director.setEmail(email);
                    director.setIndentifier(identifier);

                    listDirectors.add(director);

                    break;

                case 2:

                    System.out.println("Ingrese el nombre del developer: ");
                    String nameDev = input.nextLine();
                    System.out.println("Ingrese el correo del developer: ");
                    String emailDev = input.nextLine();
                    System.out.println("Ingrese el # de indetificación del developer: ");
                    int identifierDev = input.nextInt();

                    var developer = new Developer();

                    developer.setName(nameDev);
                    developer.setEmail(emailDev);
                    developer.setIndentifier(identifierDev);

                    listDevelopers.add(developer);

                    break;

                case 3:

                    System.out.println("Ingrese el nombre del tester: ");
                    String nameTester = input.nextLine();
                    System.out.println("Ingrese el correo del tester: ");
                    String emailTester = input.nextLine();
                    System.out.println("Ingrese el # de indetificación del tester: ");
                    int identifierTester = input.nextInt();

                    var tester = new Tester();

                    tester.setName(nameTester);
                    tester.setEmail(emailTester);
                    tester.setIndentifier(identifierTester);

                    listTesters.add(tester);

                    break;
                    
                case 4: 
                    
                    System.out.println("========== DIRECTORS =============");
                    int i = 1;
                    
                    for(var dir: listDirectors) {
                        System.out.println("------------Director # " + (i++) + "---------------");
                        System.out.println("Nombre: " + dir.getName());
                        System.out.println("Email: " + dir.getEmail());
                        System.out.println("Identificador: " + dir.getIdentifier());
                        System.out.println("-------------------------------");
                    }
                    
                    
                    System.out.println("========== DEVELOPERS =============");
                    int j = 1;
                    
                    for(var dev: listDevelopers) {
                        System.out.println("------------Developer # " + (j++) + "---------------");
                        System.out.println("Nombre: " + dev.getName());
                        System.out.println("Email: " + dev.getEmail());
                        System.out.println("Identificador: " + dev.getIdentifier());
                        System.out.println("-------------------------------");
                    }
                    
                    System.out.println("========== TESTERS =============");
                    int k = 1;
                    
                    for(var test: listTesters) {
                        System.out.println("------------ Testers # " + (k++) + "---------------");
                        System.out.println("Nombre: " + test.getName());
                        System.out.println("Email: " + test.getEmail());
                        System.out.println("Identificador: " + test.getIdentifier());
                        System.out.println("-------------------------------");
                    }
                    
                    break;

                default:
                    System.out.println("La Opción no es válida!");
                    break;
            }

        } while (option != 4);
    }

}

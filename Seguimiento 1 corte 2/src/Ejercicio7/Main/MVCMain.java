package Ejercicio7.Main;

import Ejercicio7.Controller.ClientController;
import Ejercicio7.Controller.EmployeeController;
import Ejercicio7.Controller.ProductController;
import Ejercicio7.Modelo.Client;
import Ejercicio7.Modelo.Employee;
import Ejercicio7.Modelo.Product;
import Ejercicio7.View.ClientView;
import Ejercicio7.View.EmployeeView;
import Ejercicio7.View.ProductView;

public class MVCMain {
    public static void main(String[] args) {

        Employee model = retriveEmployeeFromDatabase();

        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        controller.setEmployeeName("Zelda");
        System.out.println("--------(=^･ｪ･^=)---------");
        System.out.println("\nEmployee Details after updating... ");
        System.out.println(" ");

        controller.updateView();


        Client modelC = retriveClientFromDataBase();

        ClientView viewC = new ClientView();

        ClientController controllerC = new ClientController(modelC,viewC);

        controllerC.updateViewC();

        controllerC.setClientName("Lexa");
        System.out.println("--------(=^･ｪ･^=)---------");
        System.out.println("\nClient Details after updating... ");
        System.out.println(" ");

        controllerC.updateViewC();


        Product modelP = retriveProductFromDataBase();

        ProductView viewP = new ProductView();

        ProductController controllerP = new ProductController(modelP,viewP);

        controllerP.updateViewP();

        controllerP.setProductPrice(1000000000);
        System.out.println("--------(=^･ｪ･^=)---------");
        System.out.println("\nProduct Details after updating... ");
        System.out.println(" ");

        controllerP.updateViewP();


    }

    private static Employee retriveEmployeeFromDatabase(){
        Employee Employee = new Employee();
        Employee.setName("Ann");
        Employee.setId("11");
        Employee.setDepartment("Salesforce");
        return Employee;
    }

    private static Client retriveClientFromDataBase(){
        Client client = new Client();
        client.setClientName("Dolores");
        client.setClientId("∞");
        client.setClientPhone("10101");
        return client;
    }

    private static Product retriveProductFromDataBase(){
        Product product = new Product();
        product.setProductName("Droid Premium");
        product.setProductId("101");
        product.setProductPrice(10000000);
        return product;
    }
}


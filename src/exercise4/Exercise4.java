package exercise4;

import exercise4.controllers.ControllerCustomer;
import exercise4.controllers.ControllerOrder;
import exercise4.controllers.ControllerPayment;
import exercise4.controllers.ControllerProduct;
import exercise4.models.BusinessCustomer;
import exercise4.models.Customer;
import exercise4.models.Order;
import exercise4.models.Product;
import exercise4.models.enums.ConditionIVA;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/*
Un corralón nos pide un módulo de ventas para los productos que ofrece. Al ser
venta por catálogo los productos se solicitan por un código alfanumérico. Todos en el
proceso de venta conocen este código. Del producto nos interesa almacenar el
nombre, la marca, el precio unitario y el stock actual.
El corralón debería poder agregar productos a su catálogo, poder listarlos,
eliminarlos y devolver la información de un producto a partir de un código
alfanumérico.
Este corralón tiene una lista de clientes ordenada según el orden de carga. Los
clientes si bien tienen un código que los identifica como tal, el vendedor siempre les
pregunta el nombre. Nos comenta el dueño que al ingresar un nuevo cliente,
además de pedirle el nombre, apellido, fecha de nacimiento, teléfono y DNI le
consulta si representa a una empresa o es un consumidor final, por más que los
almacene todos juntos. Al cliente tipo empresa, le pide el cuit y la condición frente al
IVA. Al consumidor final no le solicita ningún dato adicional más.
El medio de pago del cliente tipo empresa es con tarjeta mientras que el consumidor
final es siempre con efectivo. La empresa tiene un 10% de descuento mientras que
el consumidor final un 15% (estos porcentajes son siempre fijos).

Se solicita dar de alta al menos 4 clientes y 10 productos, generar varios pedidos (de
los pedidos nos interesa saber la fecha en la que se hizo y qué cliente lo realizó).
 */
/*
Extras:
Realizar los métodos
- calcularTotalBruto -> total de los productos (tener en cuenta precio unitario
y cantidad pedida)
- asignarPago -> se asigna un medio de pago según el cliente
- calcularTotalNeto -> calcular el total del pedido teniendo en cuenta los
descuentos
- cobrar -> pasa el pedido a un estado en el cual no se puede invocar al
método asignarPago
 */
public class Exercise4 {

    public static void main(String[] args) {

        ControllerProduct controllerProduct = new ControllerProduct();
        ControllerCustomer controllerCustomer = new ControllerCustomer();
        ControllerOrder controllerOrder = new ControllerOrder();

        Customer customer1 = new Customer(1, "Juan", "Perez", "22/08/1995", "155464646", "39865485", true);
        Customer customer2 = new BusinessCustomer(2, "Jose", "Mendez", "19/02/1998", "155363346", "39123456", false,
                "20-39123456-7", ConditionIVA.IVA_RESPONSABLE_NO_INSCRIPTO, "2333366932143236");
        Customer customer3 = new BusinessCustomer(3, "Sebastian", "Perez", "03/01/1985", "155477746", "39654321", false,
                "20-39123456-7", ConditionIVA.IVA_RESPONSABLE_INSCRIPTO, "2333366932143236");
        Customer customer4 = new Customer(4, "Alejandro", "Lococo", "18/06/1996", "155488846", "39852147", true);

        controllerCustomer.addCustomer(customer1);
        controllerCustomer.addCustomer(customer2);
        controllerCustomer.addCustomer(customer3);
        controllerCustomer.addCustomer(customer4);

        Product product1 = new Product();
        product1.setCode("1");
        product1.setName("Cemento");
        product1.setTrademark("Loma negra");
        product1.setPrice(700.0);
        product1.setStockActual(30);
        controllerProduct.add(product1);

        Product product2 = new Product();
        product2.setCode("2");
        product2.setName("Cal");
        product2.setTrademark("Loma negra");
        product2.setPrice(500.0);
        product2.setStockActual(60);
        controllerProduct.add(product2);

        Product product3 = new Product();
        product3.setCode("3");
        product3.setName("Martillo");
        product3.setTrademark("Stanley");
        product3.setPrice(200.0);
        product3.setStockActual(10);
        controllerProduct.add(product3);

        Product product4 = new Product("1", "Tenaza", "Stanley", 100.0, 15);
        controllerProduct.add(product4);

        Product product5 = new Product("2", "Tornillo", "Tonillin", 5.0, 250);
        controllerProduct.add(product5);

        Product product6 = new Product("3", "Pala Ancha", "Bosch", 600.0, 15);
        controllerProduct.add(product6);

        Product product7 = new Product("4", "Bolsa de arena", "El Hornero", 300.0, 25);
        controllerProduct.add(product7);

        Product product8 = new Product("5", "Pala de punta", "Bosch", 750.0, 18);
        controllerProduct.add(product8);

        Product product9 = new Product("6", "Clavos", "clavin", 2.0, 700);
        controllerProduct.add(product9);

        Product product10 = new Product("7", "Ladrillo comun", "ladrillin", 20.0, 300);
        controllerProduct.add(product10);

        List<Product> products1 = new ArrayList<>();
        products1.add(product1);
        products1.add(product2);

        List<Product> products2 = new ArrayList<>();
        products2.add(product5);

        List<Product> products3 = new ArrayList<>();
        products3.add(product5);
        products3.add(product10);
        products3.add(product2);

        List<Product> products4 = new ArrayList<>();
        products4.add(product1);
        products4.add(product4);
        products4.add(product3);

        List<Product> products5 = new ArrayList<>();
        products5.add(product7);
        products5.add(product6);
        products5.add(product9);

        Order order1 = new Order(1L, products1, customer3, LocalDateTime.now());
        controllerOrder.addOrder(order1);

        Order order2 = new Order(2L, products2, customer1, LocalDateTime.now());
        controllerOrder.addOrder(order2);

        Order order3 = new Order(3L, products3, customer4, LocalDateTime.now());
        controllerOrder.addOrder(order3);

        Order order4 = new Order(4L, products4, customer1, LocalDateTime.now());
        controllerOrder.addOrder(order4);

        Order order5 = new Order(5L, products5, customer3, LocalDateTime.now());
        controllerOrder.addOrder(order5);

        Order order6 = new Order(6L, products1, customer4, LocalDateTime.now());
        controllerOrder.addOrder(order6);

        Order order7 = new Order(7L, products4, customer2, LocalDateTime.now());
        controllerOrder.addOrder(order7);

        System.out.println(controllerCustomer.showCustomers());
        System.out.println("-------------------------------------");
        System.out.println(controllerProduct.showProducts());

        ControllerPayment controllerPayment = new ControllerPayment();

        System.out.println("Total bruto pedido 6: " +
                controllerPayment.totalBruto(order6));
        System.out.println("Total pedido 6 cosumidor final: " +
                controllerPayment.customerFinal(controllerPayment.totalBruto(order6)));

        System.out.println("Total bruto pedido 5: " +
                controllerPayment.totalBruto(order5));
        System.out.println("Total pedido 5 cliente empresa: " +
                controllerPayment.customerBusiness(controllerPayment.totalBruto(order5)));

        if (controllerPayment.cobrarPedido(order5, customer3,
                controllerPayment.customerBusiness(controllerPayment.totalBruto(order5)))) {
            System.out.println("Pagado con exito");
        } else {
            System.out.println("Hubo un error en el pago");
        }
    }
}

package exercise4.models;

/*
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
 */
public class Customer {

    private Integer code;
    private String name;
    private String surname;
    private String birthday;
    private String phone;
    private String dni;
    private Boolean isConsumerFinal;

    public Customer(Integer code, String name, String surname, String birthday, String phone, String dni, Boolean isConsumerFinal) {
        this.code = code;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.phone = phone;
        this.dni = dni;
        this.isConsumerFinal = isConsumerFinal;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Boolean getConsumerFinal() {
        return isConsumerFinal;
    }

    public void setConsumerFinal(Boolean consumerFinal) {
        isConsumerFinal = consumerFinal;
    }

    @Override
    public String toString() {
        return "\nCliente= " +
                "\ncodigo:" + code +
                "\nnombre:" + name +
                "\napellido:" + surname +
                "\nfecha de nacimiento:" + birthday +
                "\ntelefono:" + phone +
                "\ndni:" + dni +
                "\nconsumidor final:" + isConsumerFinal;
    }
}

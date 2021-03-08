package exercise4.models;

public class Product {

    private String code;
    private String name;
    private String trademark;
    private Double price;
    private Integer stockActual;

    public Product() {
    }

    public Product(String code, String name, String trademark, Double price, Integer stockActual) {
        this.code = code;
        this.name = name;
        this.trademark = trademark;
        this.price = price;
        this.stockActual = stockActual;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStockActual() {
        return stockActual;
    }

    public void setStockActual(Integer stockActual) {
        this.stockActual = stockActual;
    }


    @Override
    public String toString() {
        return "Producto:" +
                "\ncodigo: " + code +
                "\nnombre: " + name +
                "\nmarca: " + trademark +
                "\nprecio: " + price +
                "\nstock actual: " + stockActual;
    }
}

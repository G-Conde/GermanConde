public class Product {
    protected Integer stock;
    protected String name;
    protected Double price;

    public Product(Integer stock, String name, Double price){
        this.stock=stock;
        this.name=name;
        this.price=price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}

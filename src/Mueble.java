public class Mueble extends Product implements Descuento{
    private String type;
    private Integer weels;
    private Double height;
    private Double large;
    public Mueble (String type, Integer stock, String name, Double price, Integer weels) {
        super(stock, name, price);
        this.type=type;
        this.weels=weels;
    }
    public Mueble(String type,Integer stock, String name, Double price, Double height, Double large) {
        super(stock, name, price);
        this.height = height;
        this.large = large;
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getWeels() {
        return weels;
    }

    public void setWeels(Integer weels) {
        this.weels = weels;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getLarge() {
        return large;
    }

    public void setLarge(Double large) {
        this.large = large;
    }
    @Override
    public String toString(){
        return ("Tipo de mueble="+type+"  Nombre="+name+"  Stock="+stock+"  Price="+ price);
    }

    @Override
    public Double especialPrice(Double porcent) {
        price = (getPrice()*porcent)/100.0;
        return price;
    }
}


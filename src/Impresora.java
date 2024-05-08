public class Impresora extends Informatico implements Descuento{
    private Integer copyPerMin=15;
    public Integer getCopyPerMin() {
        return copyPerMin;
    }
    public void setCopyPerMin(Integer copyPerMin) {
        this.copyPerMin = copyPerMin;
    }
    public Impresora(Integer stock, String name,Double price){
        super(stock,name,price);
    }
    @Override
    public String toString(){
        return ("Fabricante= "+builder+ "Nombre= "+name +" Stock= "+stock+" Price= "+price);
    }
    @Override
    public Double especialPrice(Double porcent) {
        price = (price*porcent)/100.0;
        return price;
    }

}

public class Notebook extends Informatico{
    private Double memoryGb;

    public Notebook(Integer stock, String name, Double price, Double memoryGb) {
        super(stock, name, price);
        this.memoryGb = memoryGb;
    }

    public Double getMemoryGb() {
        return memoryGb;
    }

    public void setMemoryGb(Double memoryGb) {
        this.memoryGb = memoryGb;
    }
    @Override
    public String toString(){
        return ("Fabricante= "+builder+ "Nombre= "+name +" Stock= "+stock+" Price= "+price);
    }
}

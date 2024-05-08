import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Mueble m1 = new Mueble("silla", 15, "Madonna", 152.0, 5);
        System.out.println(m1.toString());
        Notebook n1 = new Notebook(45, "Compact 6", 4523.3, 4.5);
        System.out.println(n1.toString());
        Impresora i4 = new Impresora(14, "WhiteCraft", 4567.0);
        Mueble m2 = new Mueble("escritorio", 78, "cilantro", 456.2, 40.5, 50.50);

        ArrayList<Product> p = new ArrayList<>();
        p.add(m1);
        p.add(m2);
        p.add(n1);
        p.add(i4);

        for (Product product : p) {
            if (product instanceof Mueble) {
                System.out.println("Pertenece a los muebles");
            } else {
                System.out.println("Es un informatico");
            }
        }

        System.out.println(i4.especialPrice(0.10).toString());


    }
}
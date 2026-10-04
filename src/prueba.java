
public class prueba {
     public static void main(String[] args) {

        //Crear las 3 instancias
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        Tv tv3 = new Tv();

        // Asignar valores diferentes
        tv1.brand = "Samsung";
        tv1.inches = 55;
        tv1.volume = 20;
        
        tv2.brand = "LG";
        tv2.inches = 43;
        tv2.volume = 10;

        tv3.brand = "Sony";
        tv3.inches = 65;
        tv3.volume = 30;

        // Llamar los métodos
        tv1.turnOn();
        tv1.volumeUp();
        tv1.volumeDown();
        tv1.turnOff();
        System.out.println("========================");
        
        tv2.turnOn();
        tv2.volumeUp();
        tv2.volumeDown();
        tv2.turnOff();
        System.out.println("========================");
        
        tv3.turnOn();
        tv3.volumeUp();
        tv3.volumeDown();
        tv3.turnOff();
        System.out.println("========================");
     }
     
}

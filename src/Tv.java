
  public class Tv {

    // Atributos 
    String brand;
    int inches;
    boolean on;
    int volume;

    // Comandos
    void turnOn() {
        on = true;
        System.out.println("The television is turning on.");
        System.out.println("brand: " + brand);
        System.out.println("inches: " + inches);
    }

    void volumeUp() {
        volume++;
        System.out.println("Turning up the volume");
        System.out.println("volume: " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("Turning down the volume");
        System.out.println("volume: " + volume);
    }

    void turnOff() {
        on = false;
        System.out.println("The television is turning off");
    }
}     

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Car c = new Car();
    c.make = "Toyota";
    c.model="Prius";
    c.year = 2025;

    //call method
    c.startEngine();
    }
}
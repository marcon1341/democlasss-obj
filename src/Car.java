public class Car {
    String make;
    String model;
    int year;
    int speed = 10;
    int fuel = 100;

    //start engine method
    public void startEngine(){
        System.out.println(make +" "+model +" " + year + " Is Starting...");
    }

    //drive method
    public void drive(){
        if(fuel > 10){
            speed += 20;
            fuel -= 10;
            System.out.println("Driving At " + speed + " Km/h: " + "Fuel:"+ fuel + "%");
        }else {
            System.out.println("Not enough fuel to drive");
        }

    }
    //stop method
    public void stop(){
        speed = 0;
        System.out.println("The car stopped.");
    }
    //refuel method
    public void refuel(){
        fuel = 100;
        System.out.println("Car refueled. Fuel: " + fuel + " %");
    }
}

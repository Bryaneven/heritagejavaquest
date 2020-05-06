package heritage;

public class Hangar {
    public static void main(String[] args) {
        Car car1 = new Car("clio",6);
        Boat boat1 = new Boat("Titanic",1555);
        System.out.println(car1.doStuff()+"\n"+
        boat1.doStuff());
    }
}

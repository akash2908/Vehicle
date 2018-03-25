import java.util.*;
class vehicle{
    private String vehicle_model;
    private int reg_no;
    private int top_speed;
    private int fuel_capacity;
    private int fuel_consumption;
    vehicle(String a, int b, int c, int d, int e){
        vehicle_model = a;
        reg_no = b;
        top_speed = c;
        fuel_capacity = d;
        fuel_consumption = e;
    }

    public void setVehicle_model(String a){
        this.vehicle_model = a;
    }
    public void setReg_no(int b){
        reg_no = b;
    }
    public void setTop_speed(int c){
        top_speed = c;
    }
    public void setFuel_cpacity(int d){
        this.fuel_capacity = d;
    }
    public void setFuel_consumption(int e){
        this.fuel_consumption = e;
    }

    public String getvehicle_model(){
        return vehicle_model;
    }
    public int getReg_no(){
        return reg_no;
    }
    public int getTop_speed(){
        return top_speed;
    }
    public int getFuel_cpacity(){
        return fuel_capacity;
    }
    public int getFuel_consumption(){
        return fuel_consumption;
    }

    int fuel_needed(int distance){
        return distance*fuel_consumption;
    }
    int distance_covered(int time){

        return time*top_speed;
    }

    public void display(){
        System.out.println("Vehicle model is "+vehicle_model);
        System.out.println("Registration no is "+reg_no);
        System.out.println("Top speed is "+top_speed);
        System.out.println("Fuel capacity is "+fuel_capacity);
        System.out.println("Fuel Consumption is "+fuel_consumption);
    }
}

class truck extends vehicle{
    private int cargo_weight;
    truck(String a, int b, int c, int d, int e, int f) {
        super(a, b, c, d, e);
        cargo_weight = f;
    }
    public void setCargo_weight(int f){
        this.cargo_weight = f;
    }
    public int getCargo_weight(){
        return cargo_weight;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Cargo weight limit " + cargo_weight);
    }
}

class bus extends vehicle{
    private int passengers;
    bus(String a, int b, int c, int d, int e, int g) {
        super(a, b, c, d, e);
        passengers = g;
    }
    public void setPassengers(int g){
        this.passengers = g;
    }
    public int getPassengers(){
        return passengers;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Maximum Passenger are " + passengers);
    }
}

public class lab7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Model NO");
        String a = in.nextLine();
        System.out.println("Enter Registration No");
        int b = in.nextInt();
        System.out.println("Enter top Speed");
        int c = in.nextInt();
        System.out.println("Enter Fuel Capacity");
        int d = in.nextInt();
        System.out.println("Enter Fuel Consumption");
        int e = in.nextInt();
        System.out.println("Enter Weight of Cargo");
        int f = in.nextInt();
        System.out.println("Enter Max Passengers");
        int g = in.nextInt();
        truck x = new truck(a, b, c, d, e, f);
        bus y = new bus(a, b, c, d, e, g);
        System.out.println("Fuel Needed: " + x.fuel_needed(20));
        System.out.println("Distance Covered: " + x.distance_covered(10));
        x.display();
        System.out.println("Fuel Needed: " + y.fuel_needed(22));
        System.out.println("Distance Covered: " + y.distance_covered(11));
        y.display();
    }
}

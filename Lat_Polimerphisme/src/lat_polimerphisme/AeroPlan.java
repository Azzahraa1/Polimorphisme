
package lat_polimerphisme;

public class AeroPlan extends Vehicle {
@Override
public void walk(){
    System.out.println("Aeroplan flying");
}
    public static void main(String[] args) {
        AeroPlan garuda =  new AeroPlan();
        garuda.fungtion();
        garuda.fuel();
        garuda.walk();
    }
    
}


package lat_polimorphisme;
class parent{
    int x = 5;
    public void info(){
        System.out.println("ini class parent");
    }
}
class child extends parent{
    int x = 10;
    public void info(){
        System.out.println("ini class child");
    }
}
        
public class Lat_polimorphisme {

    public static void main(String[] args) {
       child tes = new child() ;
       System.out.println("nilai x : "+ tes.x);
       tes.info();
    }
    
}

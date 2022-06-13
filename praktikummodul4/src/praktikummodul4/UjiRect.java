
package praktikummodul4;

public class UjiRect {

    public static void main(String[] args) {
        Rect nilai1 = new Rect (1,1,4,4);
        Rect nilai2 = new Rect (2,3,5,6);
        
        System.out.println("<"+nilai2.x1 +","+nilai2.y1+">"+"is inside the union");
        System.out.println(nilai1 + "intersect"+ nilai2 + "="+ nilai1.intersection(nilai2));
            }
    
}

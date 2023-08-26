import java.util.Set;
import java.util.Scanner;
class MY{
   private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int i) {
        id = i;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}
class CIRCLE{
    private int rad;
    private int area;
    private int perimeter;
    public void setArea(int area) {
        this.area = area;
    }
    public int getArea() {
        return area;
    }
    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }
    public int getPerimeter() {
        return perimeter;
    }
    public void setRad(int rad) {
        this.rad = rad;
    }
    public int getRad() {
        return rad;
    }
}
public class GT{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MY NES = new MY();
        NES.setName("MANAV");
        NES.setId(99);
        System.out.println(NES.getName());
      CIRCLE calc = new CIRCLE();
      calc.setArea(98);
      calc.setPerimeter(99);
      calc.setRad(89);
      System.out.println(calc.getArea());
      System.out.println(calc.getPerimeter());
      System.out.println(calc.getRad());
    }
}

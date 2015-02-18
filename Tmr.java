
public class Tmr
{
  public static void main(String args[]) 
  { 
    Bird b1 = new Bird("B1");
    Bird b2 = new Bird("B2");
    b1.sing();
    b2.sing();
  }
}

class Bird{
    private String name;
    public Bird(String _name){
      name = _name;
    }
    public void sing(){
      System.out.println(name + " is singing ");
    }
}
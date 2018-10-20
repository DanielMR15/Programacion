public class Dog{
  //properties or attributes
  public String color;
  public String eyeColor;
  public Double height;
  public Double length;
  public Double weight;

  //methods o behaviors
  public String sit(){
    return "Estoy sentado";
    //System.out.println("estoy sentado");
  }

  public void bark(){
    System.out.println("wauff wauff wauff");
  }

  public void layDown(String name){
    System.out.println(name + "estoy recostado");
  }

  public void eat(){
    System.out.println("i am eating");
  }

  public void sleep(){
    System.out.println("ZZZZZZZZZZzzzzzzzzzzzzzz");
  }
}

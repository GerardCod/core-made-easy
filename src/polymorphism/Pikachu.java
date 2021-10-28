package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Pikachu extends Pokemon {

  private List<String> attacks;

  public Pikachu(String name, String type, int healthPoints) {
    super(name, type, healthPoints);
    this.attacks = new ArrayList<>();
  }

  @Override
  public void eat() {
     System.out.println("I'm eating");   
  }

  @Override
  public void fight() {
    System.out.println("I'm fighting");    
  }
  
}

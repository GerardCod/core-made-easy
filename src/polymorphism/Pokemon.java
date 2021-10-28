package polymorphism;

public abstract class Pokemon {
  protected String name;
  protected String type;
  protected int healthPoints;

  public Pokemon(String name, String type, int healthPoints) {
    this.name = name;
    this.type = type;
    this.healthPoints = healthPoints;
  }

  public abstract void eat();
  public abstract void fight();
}

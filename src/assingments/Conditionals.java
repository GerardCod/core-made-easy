package assingments;

public class Conditionals {
  public static void main(String[] args) {
    float maths = Float.parseFloat(args[0]);
    float physics = Float.parseFloat(args[1]);
    float chemistry = Float.parseFloat(args[2]);
    int x = 19;

    labeledBlock: {
      System.out.println("Begins the block");

      if (x >= 20) {
        break labeledBlock;
      }

      System.out.println("Ends the block");
    }


    if (maths <= 35 || physics <= 35 || chemistry <= 35) {
      System.out.println("Failure, you have to resolve this problem with your grades");
    } else {
      float avg = (maths + physics + chemistry) / 3;
      
      if (avg <= 59) {
        System.out.println("Your grade is: C");
      } else if (avg <= 69) {
        System.out.println("Your grade is: B");
      } else {
        System.out.println("Your grade is: A");
      }
    }
  }
}

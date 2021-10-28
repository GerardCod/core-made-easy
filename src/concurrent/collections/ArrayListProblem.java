package concurrent.collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblem extends Thread {
  private static CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<>();

  @Override
  public void run() {
    try {
      Thread.sleep(2000);
      courses.add("Kubernetes");
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public static void main(String[] args) throws InterruptedException {
    ArrayListProblem problem = new ArrayListProblem();
    problem.start();

    courses.add("Java");
    courses.add("Python");
    courses.add("AWS");
    courses.add("Docker");

    Iterator<String> iterator = courses.iterator();
    while(iterator.hasNext()) {
      Thread.sleep(1000);
      String course = iterator.next();
      System.out.println(course);
      if (course.equals("Docker")) {
        courses.remove("Docker");
      }
    }

    System.out.println(courses);
  }
}

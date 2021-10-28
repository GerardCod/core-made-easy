package concurrent.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread {
  private static ConcurrentHashMap<String, String> courses = new ConcurrentHashMap<>();

  @Override
  public void run() {
    try {
      Thread.sleep(2000);
      courses.put("Kubernetes", "4.8");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) throws InterruptedException {
    ArrayListProblem problem = new ArrayListProblem();
    problem.start();

    courses.put("Java", "5.0");
    courses.put("Python", "4.8");
    courses.put("AWS", "4.7");
    courses.put("Docker", "4.7");

    Iterator<String> iterator = courses.keySet().iterator();
    while(iterator.hasNext()) {
      Thread.sleep(1000);
      String course = iterator.next();
      System.out.println(courses.get(course));
      if (course.equals("Docker")) {
        courses.remove("Docker");
      }
    }

    System.out.println(courses);
  }
}

package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    try {
      Class<?> className = Class.forName(Calculator.class.getName());
      System.out.println(className.getName());

      Constructor<?>[] constructors = className.getConstructors();
      System.out.println(Arrays.toString(constructors));
      System.out.println(Arrays.toString(className.getMethods()));

      System.out.println();
      System.out.println("Default constructor");
      Constructor<?> constructor = className.getConstructor(null);
      System.out.println(constructor.newInstance(null));
      
      System.out.println();
      System.out.println("Parametrized constructor");
      Constructor<?> paramConstructor = className.getConstructor(double.class, double.class);
      System.out.println(paramConstructor.newInstance(10, 20));
      
      Object obj = paramConstructor.newInstance(10, 20);
      Method getter = className.getMethod("getNumOne", null);
      System.out.println(getter.invoke(obj, null));
      
      Method setter = className.getMethod("setNumOne", double.class);
      System.out.println(setter.invoke(obj, 8));
      System.out.println(getter.invoke(obj, null));

      Method sumMethod = className.getMethod("sum", double.class, double.class);
      System.out.println(sumMethod.invoke(obj, 48, 2));

      Field numOne = className.getDeclaredField("numOne");
      numOne.setAccessible(true);
      numOne.set(obj, 18);
      System.out.println(numOne.getDouble(obj));

      Annotation[] annotations = className.getAnnotations();
      System.out.println(Arrays.toString(annotations));

      MyAnnotation myAnnotation = (MyAnnotation) annotations[0];
      System.out.println(myAnnotation.valueOne());
      System.out.println(myAnnotation.valueTwo());
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (SecurityException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } catch (NoSuchFieldException e) {
      e.printStackTrace();
    }
  }
}
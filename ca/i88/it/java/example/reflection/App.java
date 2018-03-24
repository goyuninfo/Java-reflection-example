package ca.i88.it.java.example.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {
		Object i88ca = Class.forName("ca.i88.it.java.example.reflection.I88ca").getDeclaredConstructor().newInstance();
		Method m = i88ca.getClass().getDeclaredMethod("helloworld", new Class<?>[0]);
		m.invoke(i88ca);
		m.invoke(i88ca, (Object[])null);
		m = i88ca.getClass().getDeclaredMethod("helloworld", new Class<?>[] { String.class });

		m.invoke(i88ca, new Object[] { "it.i88.ca" });
	}
}

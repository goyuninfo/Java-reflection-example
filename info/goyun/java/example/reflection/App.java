package info.goyun.java.example.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {
		Object goyuninfo = Class.forName("info.goyun.java.example.reflection.GoyunInfo").getDeclaredConstructor().newInstance();
		Method m = goyuninfo.getClass().getDeclaredMethod("helloworld", new Class<?>[0]);
		m.invoke(goyuninfo);
		m.invoke(goyuninfo, (Object[])null);
		m = goyuninfo.getClass().getDeclaredMethod("helloworld", new Class<?>[] { String.class });

		m.invoke(goyuninfo, new Object[] { "www.goyun.info" });
	}
}

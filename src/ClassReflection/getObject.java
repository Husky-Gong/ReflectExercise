package ClassReflection;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class getObject {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class<?> clz = ArrayList.class;
		Object obj = clz.getConstructor().newInstance();
		System.out.println(obj instanceof ArrayList);
	}
}

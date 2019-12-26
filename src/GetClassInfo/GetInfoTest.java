package GetClassInfo;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class GetInfoTest {
	public static <E> void main(String[] args) throws Exception{
		// get class methods
		
		/*
		 * 1. 'class name'.class;
		 * Class<?> clz = ArrayList.class;
		 */
		
		/*
		 * 2. object.getClass();
		 * List<E> list = new ArrayList<>();
		 * Class<?> clz = list.getClass();
		 */
		
		/*
		 * 3. Class.forName("package+class name");
		 * Class<?> clz = Class.forName("java.util.ArrayList");
		 */
		Class<?> clz = ArrayList.class;
		
		// get package name
		Package pck = clz.getPackage();
		String pckName = pck.getName();
		System.out.println(pckName);
		
		// get modifiers name
		int mod = clz.getModifiers();
		String modName = Modifier.toString(mod);
		System.out.println(modName);
		
		// get name of "package+class name"
		System.out.println(clz.getName());
		
		// get class name
		System.out.println(clz.getSimpleName());
		
		// check whether is an Interface?
		System.out.println(clz.isInterface());
		
		// get parent class
		System.out.println(clz.getSuperclass());
		
		// get Interface info
		System.out.println(clz.getInterfaces());
		
	}
}

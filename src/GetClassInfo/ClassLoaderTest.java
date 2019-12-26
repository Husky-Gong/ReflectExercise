package GetClassInfo;

public class ClassLoaderTest {
	public static void main(String[] args) {
		ClassLoader cL = ClassLoaderTest.class.getClassLoader();
		System.out.println(cL);
		
		ClassLoader cL2 = cL.getParent();
		System.out.println(cL2);
		
		ClassLoader cL3 = cL2.getParent();
		System.out.println(cL3);
		/*
		 * The Java run-time has the following built-in class loaders:
		 * 
		 * Bootstrap class loader: 
		 * 		The virtual machine's built-in class loader typically represented as null, 
		 * 		and does not have a parent.
		 * 
		 * Platform class loader: 
		 * 		To allow for upgrading/overriding of modules defined to the platform class loader, 
		 * 		and where upgraded modules read modules defined to class loaders other than the platform class loader and its ancestors, 
		 * 		then the platform class loader may have to delegate to other class loaders, the application class loader for example. 
		 * 		In other words, 
		 * 		classes in named modules defined to class loaders other than the platform class loader 
		 * 		and its ancestors may be visible to the platform class loader.
		 * 
		 * System class loader: 
		 * 		It is also known as application class loader and is distinct from the platform class loader. 
		 * 		The system class loader is typically used to define classes on the application class path, 
		 * 		module path, and JDK-specific tools. 
		 * 		The platform class loader is a parent or an ancestor of the system class loader 
		 * 		that all platform classes are visible to it.
		 */
	}
}

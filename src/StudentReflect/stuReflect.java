package StudentReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class stuReflect {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//1. get student class
		Class<?> stuClass = Student.class;
		
		//2. initialize an arraylist to store different constructor parameters
		List<Class<?>[]> paramList = new ArrayList<>();
		
		//3. loop constructors and get one constructor's parameters type
		Constructor<?>[] constructors = stuClass.getConstructors();
		
		for(Constructor<?> cons:constructors) {
			Class<?>[] parameters = cons.getParameterTypes();
			if(parameters.length == 0) {
				System.out.println("one constructor without parameters");
				
			}
			else{
				System.out.println("New constructor parameters name:");
				for(Class<?> param:parameters) {
				System.out.println(param.getTypeName());
				}
			}	
			paramList.add(parameters);
		}
		
		System.out.println(paramList);
		
		//4. choose one parameter type and apply to the constructor we will use
		Constructor<?> stuConstructor0 = stuClass.getDeclaredConstructor(paramList.get(0));
		Constructor<?> stuConstructor = stuClass.getDeclaredConstructor(paramList.get(1));
		
		//5. initialize the constructor
		Object stuObj0 = stuConstructor0.newInstance();
		Object stuObj = stuConstructor.newInstance("zexi",19,true);
		
		//6. check whether stuObj is an object of Student class
		System.out.println(stuObj0 instanceof Student);
		System.out.println(stuObj0+"\n");
		
		System.out.print(stuObj instanceof Student);
		System.out.println();
		System.out.println(stuObj);
	}
}

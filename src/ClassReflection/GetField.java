package ClassReflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;



public class GetField {
	public static void main(String[] args) {
		Class<?> clz = ArrayList.class;
		Field[] fields = clz.getDeclaredFields();
		for(Field field:fields) {
			// field type
			Class<?> typeClass = field.getType();
			String typeName = typeClass.getSimpleName();
			
			
			
			// field name
			String fieldName = field.getName();
			
			//field modifier(修饰名)
			String modifierName = Modifier.toString(field.getModifiers());
			
			// System.out.println(modifierName);
			System.out.println("\n"  +  modifierName+" "+" "+typeName+" "+fieldName);
			
			
		}
	}
}

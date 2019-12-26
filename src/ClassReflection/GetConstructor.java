package ClassReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;

public class GetConstructor {
	public static void main(String[] args) {
		Class<?> clz = ArrayList.class;
		Constructor<?>[] constructors = clz.getConstructors();
		for(Constructor<?> constructor:constructors) {
			//1. get constructor's modifier
			int mod = constructor.getModifiers();
			String consModifier = Modifier.toString(mod);
			
			//2. get constructor's name
			String consName = constructor.getName();
			
			//3. get constructor's parameters
			Parameter[] parameters = constructor.getParameters();
			StringBuilder sb = new StringBuilder(30);
			for(Parameter param:parameters) {
				// 1. get parameter's type
				Class<?> paramType = param.getType();
				String paramTypeName = paramType.getName();
				
				// 2. get parameter's name
				String paramName = param.getName();
				
				sb.append(paramTypeName).append(" ").append(paramName).append(",");
			}
			
			
			if(parameters.length == 0) System.out.println(consModifier+" "+consName+"()");
			else {
				int length = sb.toString().length();
				String allParams = sb.toString().substring(0, length-1);
				System.out.println(consModifier+" "+consName+"("+allParams+")");
			}
			
		}
	}
}

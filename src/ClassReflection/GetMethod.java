package ClassReflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;

public class GetMethod {
	public static void main(String[] args) {
		Class<?> clz = ArrayList.class;
		Method[] methods = clz.getDeclaredMethods();
		for(Method method:methods) {
			//1. get method modifier
			int mod = method.getModifiers();
			String methodModifier = Modifier.toString(mod);
			
			//2. get method type
			Class<?> returnType = method.getReturnType();
			String methodType = returnType.getSimpleName();
			
			//3. get method name
			String methodName = method.getName();
			
			
			Parameter[] parameters = method.getParameters();
			StringBuilder sb = new StringBuilder(30);
			
			for(Parameter param:parameters) {
				
				//1. get param type
				Class<?> paramType = param.getType();
				String paramTypeName = paramType.getSimpleName();
				
				//2. get param name
				String paramName = param.getName();
				
				sb.append(paramTypeName).append(" ").append(paramName).append(",");
			}
			int length = sb.toString().length();
			
			// get rid of the last comma
			String allParams;
			if(length != 0) allParams = sb.toString().substring(0, length-1);
			else {
				allParams = sb.toString();
			}
			
			
			if(!methodModifier.equals("")) System.out.println(methodModifier+" "+methodType+" "+methodName+" ("+allParams+")");
			else System.out.println(methodType+" "+methodName+" ("+allParams+")");
		}
	}
}

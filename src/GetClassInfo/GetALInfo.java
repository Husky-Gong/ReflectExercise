package GetClassInfo;

import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class GetALInfo {
	public static void main(String[] args) {
		Class<?> clz = ArrayList.class;
		
		// 1. get modifier
		int mod = clz.getModifiers();
		String modName = Modifier.toString(mod);
		
		// 2. check whether it is an interface?
		String subName1;
		if(clz.isInterface()) subName1 = "interface";
		else subName1 = "class";
		
		// 3. get class name
		String splName = clz.getSimpleName();
		
		// 4. get super class name
		Class<?> supClass = clz.getSuperclass();
		String supClzName = supClass.getSimpleName();
		
		// 5. get interfaces name
		StringBuilder sb = new StringBuilder(30);
		Class<?> interfaces[] = clz.getInterfaces();
		for(Class<?> interFace : interfaces) {
			String interFaceName = interFace.getSimpleName();
			sb.append(",").append(interFaceName);
		}
		
		
		
		System.out.println(modName+" "+subName1+" "+splName+" extends "+supClzName+ " implements "+ sb.toString());
	}
}	

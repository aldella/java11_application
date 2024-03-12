package creational.abstractfactory;

import java.lang.reflect.InvocationTargetException;

//Factory 추상클래스 : 추상체를 만드는 공장(Factory)를 만드는 역할을 하는 추상클래스

public abstract class Factory {
	public static Factory getFactory(String classname) { //
		Factory factory = null;
		try {
			factory = (Factory) Class.forName(classname).getDeclaredConstructor().newInstance();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스"+classname+"이 발견되지 않았습니다");
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException  e) {
			e.printStackTrace();
		}
		
		return factory;
		
	}
	
	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);
}

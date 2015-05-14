package lesson150428.reflection;

public class ClassExample {
	public static void main(final String[] args) {
		A a = new A();
		Class class1 = A.class;
		Class class2 = a.getClass();

		inspect(a);
		inspect("hello");
	}

	private static void inspect(final Object object) {
		Class clazz = object.getClass();

		for (Class cl : clazz.getInterfaces()) {
			System.out.println(cl);
		}

		for (Class cl : clazz.getClasses()) {
			System.out.println(cl);
		}

		System.out.println(clazz.getSuperclass());
		System.out.println(clazz.getInterfaces());
		System.out.println(clazz.getInterfaces());
		System.out.println("--------------------------");
		try {
			Object someObject = clazz.newInstance();
			System.out.println(someObject.getClass().getName());
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(clazz.getName());
	}
}

package lesson150316;

public class UseD {

<<<<<<< HEAD
	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		D d = D.create(50, 50);
		System.out.println(d.getX() + " " + d.getY());
		/*
		 * D d2 = D.create(20, 50); System.out.println(d2._x + " " + d2._y);
		 */
		// D d3 = new D(100, 500); закрыта возможность создания приватным
		// консрутктором
		// System.out.println(d3._x + " " + d._y);
	}

=======
	public static void main(final String[] args) {
		
		D d = D.create(50, 50);
		
//		System.out.println(d._x + "," + d._y);
		
		D d2 = D.create(30, 40);
		
		System.out.println(d2);
		
//		D d3 = new D(100,200);
		
	}
	
>>>>>>> remotes/zaal/master
}

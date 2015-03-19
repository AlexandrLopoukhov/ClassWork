package lesson150317.pets;

public class Cat extends Friend {

	@Override
	public void wash() {
		wearGloves();
		super.wash();
	}
<<<<<<< HEAD
=======

	private void wearGloves() {
		System.out.println("Wearing gloves before washing cat");
	}
	
	
>>>>>>> remotes/zaal/master

	private void wearGloves() {
		System.out.println("Wear glovew before washing cat");

	}
}

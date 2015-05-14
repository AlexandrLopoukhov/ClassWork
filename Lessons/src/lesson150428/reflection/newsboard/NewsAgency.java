package lesson150428.reflection.newsboard;

<<<<<<< HEAD
import java.util.*;

public class NewsAgency {
	private static List<NewsMaker> _newsMakers = new ArrayList<>();
	private static Queue<String> _newsMakerNames = new ArrayDeque<String>();

	public static void main(final String[] args) throws InterruptedException {
		// _newsMakerNames.add("Zhirinovsky");
		// _newsMakerNames.add("Kiselev");

		new Thread(new Runnable() {

			@Override
			public void run() {
				Scanner scanner = new Scanner(System.in);
				while (scanner.hasNextLine()) {
					String newsMakerName = scanner.nextLine();
					_newsMakerNames.add(newsMakerName);
				}
			}
		}).start();
		while (true) {
			System.out.println("---------------------");
			refreshNewsMakerList();
			publishNews();
			Thread.sleep(3000);
		}
	}

	private static void refreshNewsMakerList() {
		while (!_newsMakerNames.isEmpty()) {
			String name = _newsMakerNames.remove();
			name = NewsAgency.class.getPackage().getName() + "." + name;
			try {
				Class<?> newsMakerClass = Class.forName(name);
				try {
					NewsMaker newsMaker = (NewsMaker) newsMakerClass
							.newInstance();
					_newsMakers.add(newsMaker);
				} catch (InstantiationException | IllegalAccessException
						| ClassCastException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void publishNews() {
		for (NewsMaker newsMaker : _newsMakers) {
			String news = newsMaker.getFreshNews();
			System.out.println(newsMaker + " says " + news);
		}
	}
=======
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class NewsAgency {

	private static List<NewsMaker> _newsMakers = new ArrayList<NewsMaker>();
	private static Queue<String> _newsMakerNames = new ArrayDeque<String>();

	public static void main(final String[] args) {
		
//		_newsMakerNames.add("Zhirinovsky");
//		_newsMakerNames.add("Kiselev");
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				Scanner scanner = new Scanner(System.in);
				while (scanner.hasNextLine()) {
					String newsMakerName = scanner.nextLine();
					_newsMakerNames.add(newsMakerName);
				}
				scanner.close();
			}
		}).start();

		while (true) {
			System.out.println("---");
			refreshNewsMakerList();
			publishNews();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	private static void refreshNewsMakerList() {
		while (!_newsMakerNames.isEmpty()) {
			String name = _newsMakerNames.remove();
			name = NewsAgency.class.getPackage().getName() + "." + name;
			try {
				Class<?> newsMakerClass = Class.forName(name);
				try {
					NewsMaker newsMaker = (NewsMaker) newsMakerClass.newInstance();
					_newsMakers.add(newsMaker);
				} catch (ClassCastException | InstantiationException | IllegalAccessException e) {
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	private static void publishNews() {
		for (NewsMaker newsMaker : _newsMakers) {
			String news = newsMaker.getFreshNews();
			System.out.println(newsMaker + " says: " + news);
		}
	}

>>>>>>> refs/remotes/zaal/master
}

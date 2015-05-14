package lesson150427.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapsExamples {
<<<<<<< HEAD
	public static void main(final String[] args) {
		// Map<String, String> addresses = new HashMap<String, String>();
		Map<String, String> addresses = new LinkedHashMap<String, String>();

		addresses.put("Petrov", "Moscov");
		addresses.put("Sidorov", "SaintP");
		addresses.put("Ivanov", "Saratov");
		addresses.put("Ivanova", "New York");
		addresses.put("Zdanova", "Vladivastock");

		for (Map.Entry<String, String> pair : addresses.entrySet()) {
			System.out.println(pair.getKey() + " " + pair.getValue());
		}

		for (String string : addresses.keySet()) {
			System.out.println(string);
		}

		System.out.println(addresses.values());
	}
=======
	
	public static void main(final String[] args) {
		
//		Map<String, String> addresses = new HashMap<>();
		Map<String, String> addresses = new LinkedHashMap<>();
		
		addresses.put("Petrov", "Moscow");
		addresses.put("Sidorov", "St.Pete");
		addresses.put("Ivanov", "Saratov");
		addresses.put("Petrova", "New-York");
		addresses.put("Zhdanova", "Valdivostok");
		addresses.put("Petrov", "Novosibirsk");
		
		System.out.println(addresses.get("Petrova"));
		
		for (Map.Entry<String, String> addressEntry: addresses.entrySet()) {
			System.out.println("key " + addressEntry.getKey());
			System.out.println("value " + addressEntry.getValue());
		}
		
		for (String surname : addresses.keySet()) {
			System.out.println(surname);
		}
		
		System.out.println(addresses.values());
		
	}

>>>>>>> refs/remotes/zaal/master
}

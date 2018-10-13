package ydp.fa.programs;

import java.util.concurrent.ConcurrentHashMap;

public class CHMImpl {
	
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> m = new ConcurrentHashMap<>();
		m.put("Prav", 101);
		m.put("Kum", 102);
		m.putIfAbsent("Ya", 103);
		m.remove("Prav",105);
		m.replace("Prav", 101,100);
		System.out.println(m);
		m.forEach((String s, Integer i) -> System.out.println(s+"-->"+i));
		m.entrySet().stream().forEach(e -> System.out.println(e.getKey() + "***" +e.getValue()));
	}

}
package com.Exercise21HashMap.app;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {

	public static void main(String[] args) {
		
		HashMap<Integer, String> mihash = new HashMap<Integer, String>();
		mihash.put(1, "Ari");
		mihash.put(2, "Cristina");
		mihash.put(3, "Manuel");
		for(int i = 0; i<=mihash.size(); i++) {
			if(mihash.containsKey(i)) {
				System.out.println(mihash.get(i));
			}
		}
		
		for(Map.Entry<Integer, String> mimap:mihash.entrySet()) {
			System.out.println(String.format("The key is: %d, value: %s", mimap.getKey(), mimap.getValue()));
		}

	}

}

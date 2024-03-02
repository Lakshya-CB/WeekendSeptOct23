package Lec_Heap_HM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HM_Demo {
	public static void main(String[] args) {
//	HashMap<Key , Value>
		HashMap<String, Integer> HM = new HashMap<>();
		HM.put("A", 10); // O(1)
		HM.put("1B", 13);
		HM.put("dC", 11);
		HM.put("cD", 5);
		HM.put("AE", 9);
		HM.put("8B", 90); // update!!
		HM.put("C", null);
		
		System.out.println(HM);
		System.out.println(HM.get("Caca")); //O(1)
		System.out.println(HM.containsKey("a")); //O(1)
		
		HM.remove("C");// O(1)
		System.out.println(HM);
	//===============
		Set<String> Keys = HM.keySet();
//		System.out.println(Keys);
//		ArrayList<String> AL = new ArrayList<>(HM.keySet());
		for(String K : HM.keySet()) {
			System.out.println(K+"-"+HM.get(K));
		}

	}
}

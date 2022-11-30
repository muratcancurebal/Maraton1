package Soru2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TekrarEdenSayi {

	public static void main(String[] args) {
		
		int[] sayiDizisi = {9, 7, 5, 3, 7, 7, 18, 25, 2, 0, 7};
		Map<Integer,Integer> m = new HashMap<>();
		Arrays.stream(sayiDizisi).forEach(val ->{
			if(m.containsKey(val)) m.put(val, m.get(val)+1);
			else m.put(val, 1);});
			m.forEach((t, u) -> System.out.println(String.format("%s : %s defa tekrarlandi",t,u)));
		
			
		}
	}

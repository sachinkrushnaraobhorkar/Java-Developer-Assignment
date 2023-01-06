package Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Quastion_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**/
		Map<String, Integer> hm = new HashMap<>();
		hm.put("13", 10);
		hm.put("13-c", 15);
		hm.put("342-R", 10);
		hm.put("146-Q", 10);
		hm.put("27", 15);
		hm.put("29-A", 12);
		hm.put("215-U", 12);
		hm.put("27-E1", 15);
		hm.put("13J", 12);
		hm.put("SBS-D34G", 10);

		Map<Integer, List<String>> groupedData = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			int fare = entry.getValue();
			String route = entry.getKey();
			if (!groupedData.containsKey(fare)) {
				groupedData.put(fare, new ArrayList<>());
			}
			groupedData.get(fare).add(route);
		}

		 for (Map.Entry<Integer, List<String>> entry : groupedData.entrySet()) { 
		      System.out.println(entry.getKey() + " " + entry.getValue());
		    }

	}

}






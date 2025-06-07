package kadai_021;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		HashMap<String, String> fruitDict = Dictionary_Chapter21.makeFruitMap();
		
		ArrayList<String> fruitList = new ArrayList<String>();
		
		fruitList.add("apple");
		fruitList.add("banana");
		fruitList.add("grape");
		fruitList.add("orange");
		
		for (String f : fruitList) {
			boolean flag = false;
			String val = "";
			
			for (HashMap.Entry<String, String> e : fruitDict.entrySet()) {
				if (f.equals(e.getKey())) {
					flag = true;
					val = e.getValue();
					break;
				}
				continue;
			}
			
			if (flag) {
				System.out.println(f + "の意味は" + val);
			} else {
				System.out.println(f + "は辞書に存在しません");
			}
			
		}
		
	}

}

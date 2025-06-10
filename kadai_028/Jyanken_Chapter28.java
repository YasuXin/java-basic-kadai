package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	private HashMap<String, String> jyankenMap = new HashMap<>();
	
	public Jyanken_Chapter28() {
		this.jyankenMap.put("r", "グー");
		this.jyankenMap.put("s", "チョキ");
		this.jyankenMap.put("p", "パー");
	}
	
	public String getMyChoice() {
		String hand;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		
		while (true) {
			if (scanner.hasNextLine()) {
				
				hand = scanner.nextLine();
				
				if (jyankenMap.containsKey(hand)) {
					scanner.close();
					break;
				} else {
					System.out.println("「r」か「s」か「p」で入力してください");
					System.out.print(">> ");
				}
			}
		}
		
		return hand;
	}
	
	public String getRandom() {
		int rand = (int)Math.floor(Math.random() * 3);
		String hand = switch(rand) {
			case 0 -> "r";
			case 1 -> "s";
			case 2 -> "p";
			default -> "";
		};
		
		return hand;
	}
	
	public void playGame() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String myChoice = getMyChoice();
		String random = getRandom();
		System.out.println("自分の手は" + jyankenMap.get(myChoice) + ",対戦相手の手は" + jyankenMap.get(random));
		
		if (myChoice.equals(random)) {
			System.out.println("あいこです");
		} else if ( (myChoice.equals("r") && random.equals("s")) || 
				(myChoice.equals("s") && random.equals("p")) ||
				(myChoice.equals("p") && random.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else if ( (myChoice.equals("r") && random.equals("p")) || 
				(myChoice.equals("s") && random.equals("r")) ||
				(myChoice.equals("p") && random.equals("s"))) {
			System.out.println("自分の負けです");
		} else {
			System.out.println("エラーにより判定できませんでした");
		}
	}
}

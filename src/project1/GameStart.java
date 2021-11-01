package project1;

import java.util.*;

public class GameStart {

	Scanner in = new Scanner(System.in);
	Guide gd = new Guide();
	
	boolean start(boolean a) {
		boolean b = true;
		gd.strat();
		String start = in.next();
	
		if (start.equals("s")) {
			System.out.println("캐릭터를생성합니다.");
			System.out.println("꼭 힌트를 사용해서 클리어하세요.");
			System.out.println("그렇지 않으면 게임 못 이깁니다.");
		}else {
			b=false;
		}
		
		
		return b;
	}
}

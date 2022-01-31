 package project1;

import java.util.*;

public class GameMain {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		List<MonsterDTO> mList = new ArrayList<>();

		List<ChterDTO> cList = new ArrayList<>();

		GameService gs = new GameService();
		Guide gd = new Guide();
		GameStart gt = new GameStart();
		
		boolean b = true;

		if (gt.start(b)) {

			cList = gs.chCreate(cList);
			mList = gs.mCreate(mList);
			gs.chStatus(cList);
			boolean run = true;

			int mon = (int) (Math.random() * 10) + 1;

			while (run) {
				System.out.println("1:내정보||2:돌아다니기||3:힌트");
				System.out.print("선택>");
				int st = in.nextInt();

				switch (st) {

				case 1:
					gs.chStatus(cList);
					break;
				case 2:
					boolean adv = true;
					gd.adventure();
					while (adv) {

						int sel = in.nextInt();
						if (sel == mon) {
							int rpg = 0;
							rpg = gs.fight(rpg, mList, cList);
							if(rpg==0) {
							run = false;
							break;
							}else if(rpg==1) {
							sel = 3;
							break;
							}
						} else if (sel == 11) {
							gs.chDrop(cList);
							gd.adventure();
						} else if (sel == 8) {
							gd.trap();
							adv = false;
							run = false;
						} else if (sel > 11) {
							gd.getOut();
							adv = false;
							run = false;
						} else if (sel == 3) {
							System.out.println("마을로 돌아갑니다.");
							adv = false;
						} else if (sel != mon) {
							System.out.println("계속 돌아다니자");

						}
					}
					break;
				case 3:
					System.out.println("힌트:+1");
					break;

				}
			}
		}else {
			gd.strat2();
		}
	}
}



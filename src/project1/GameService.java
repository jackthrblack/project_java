package project1;

import java.util.*;

public class GameService {

	Scanner in = new Scanner(System.in);
	
	Guide gd = new Guide();

	List<ChterDTO> chCreate(List<ChterDTO> cList) {

		System.out.print("id를입력하세요:");
		String id = in.next();
		int hp = 150;
		int att = 20;
		int dep = 3;
		int potion = 0;

		ChterDTO ch = new ChterDTO(id, hp, att, dep, potion);
		cList.add(ch);

		return cList;
	}

	List<MonsterDTO> mCreate(List<MonsterDTO> mList) {

		String name = "고등어대가리";
		int hp = 200;
		int att = 50;
		int dep = 1;
		MonsterDTO m = new MonsterDTO(name, hp, att, dep);

		mList.add(m);

		return mList;
	}

	void chStatus(List<ChterDTO> cList) {
		for (ChterDTO a : cList) {
			System.out.println(a);
		}
	}

	List<ChterDTO> chDrop(List<ChterDTO> cList) {

		gd.drop();

		System.out.println("\n");

		int potion = 2;
		if(cList.get(0).getPotion()==0) {
			cList.get(0).setPotion(cList.get(0).getPotion()+potion);
			System.out.println("현재물약:" + cList.get(0).getPotion());
		}else {
			cList.get(0).setPotion(2);
			System.out.println("포션의 최대 갯수는 2개입니다.");
			System.out.println("현재물약:" + cList.get(0).getPotion());
		}
		
		int dokdoShrimp = 40;
		if(cList.get(0).getAtt()==20) {
			cList.get(0).setAtt(cList.get(0).getAtt()+dokdoShrimp);
			System.out.println("현재공격력:" + cList.get(0).getAtt());
		}else {
			cList.get(0).setAtt(60);
			System.out.println("최대 공격력은 60입니다.");
			System.out.println("현재공격력:" + cList.get(0).getAtt());
		}
		return cList;
	}

	List<ChterDTO> fight(List<MonsterDTO> mList, List<ChterDTO> cList) {
		
		gd.figth();
		int sel2 = in.nextInt();

		boolean abc = true;
		
		while(abc) {
		switch (sel2) {

		case 1:

			boolean figth = true;
			while (figth) {
				System.out.println("1.공격||2.회복||3.도망가기");
				int figth2 = in.nextInt();
				if (figth2 == 1) {

					int chHp = 0;
					int mHp = 0;

					chHp = cList.get(0).setHp(cList.get(0).getHp() - (mList.get(0).getAtt() - cList.get(0).getDep()));
					cList.get(0).setHp(chHp);
					if (cList.get(0).setHp(chHp) <= 0) { // 주인공 체력 -가 안나오게끔
						cList.get(0).setHp(0);
					}
					System.out.println(cList.get(0).getId() + "의Hp:" + cList.get(0).getHp());

					mHp = mList.get(0).setHp(mList.get(0).getHp() - (cList.get(0).getAtt() - mList.get(0).getDep()));
					mList.get(0).setHp(mHp);
					if (mList.get(0).setHp(mHp) <= 0) { // 주인공 체력 -가 안나오게끔
						mList.get(0).setHp(0);
					}
					System.out.println(mList.get(0).getName() + "의Hp:" + mList.get(0).getHp());

					if (mList.get(0).getHp() <= 0) {
						gd.mEnd();
						figth = false;

					} else if (cList.get(0).getHp() <= 0) {
						gd.cEnd();
						figth = false;
					}
				} else if (figth2 == 2) {
					int chHpp = 0;
					int potion = 0;

					if (cList.get(0).getPotion() <= 0) {
						System.out.println("포션이 없습니다.");
					} else if (cList.get(0).getHp() < 150) {
						chHpp = cList.get(0).setHp(cList.get(0).getHp() + 50);
						cList.get(0).setHp(chHpp);
						potion = cList.get(0).setPotion(cList.get(0).getPotion() - 1);
						cList.get(0).setPotion(potion);
						if (cList.get(0).setHp(chHpp) >= 150) {
							System.out.println("체력이 +50회복됐습니다.");
							System.out.println("최대체력을 넘을 수 없습니다.");
							cList.get(0).setHp(150);
						}
					}
					System.out.println("현재체력:" + cList.get(0).getHp());
					System.out.println("현재포션:" + cList.get(0).getPotion());

				}else if(figth2==3){
					abc = false;
					break;
				}

			}
			break;
		
		case 2:
			System.out.println(mList.get(0).toString());
			figth = false;
			abc = false;
			}
		}
		return cList;

	}

	public int fight(int rpg, List<MonsterDTO> mList, List<ChterDTO> cList) {
		gd.figth();
		boolean select = true;
		int select2 = in.nextInt();

		
		while(select) {
			
		switch (select2) {

		case 1:

			boolean figth = true;
			while (figth) {
				System.out.println("1.공격||2.회복||3.도망가기");
				int figth2 = in.nextInt();
				if (figth2 == 1) {

					int chHp = 0;
					int mHp = 0;

					chHp = cList.get(0).setHp(cList.get(0).getHp() - (mList.get(0).getAtt() - cList.get(0).getDep()));
					cList.get(0).setHp(chHp);
					if (cList.get(0).setHp(chHp) <= 0) { // 주인공 체력 -가 안나오게끔
						cList.get(0).setHp(0);
					}
					System.out.println(cList.get(0).getId() + "의Hp:" + cList.get(0).getHp());

					mHp = mList.get(0).setHp(mList.get(0).getHp() - (cList.get(0).getAtt() - mList.get(0).getDep()));
					mList.get(0).setHp(mHp);
					if (mList.get(0).setHp(mHp) <= 0) { // 주인공 체력 -가 안나오게끔
						mList.get(0).setHp(0);
					}
					System.out.println(mList.get(0).getName() + "의Hp:" + mList.get(0).getHp());

					if (mList.get(0).getHp() <= 0) {
						gd.mEnd();
						figth = false;
						select = false;
					} else if (cList.get(0).getHp() <= 0) {
						gd.cEnd();
						figth = false;
						select = false;
					}
				} else if (figth2 == 2) {
					int chHpp = 0;
					int potion = 0;

					if (cList.get(0).getPotion() <= 0) {
						System.out.println("포션이 없습니다.");
					} else if (cList.get(0).getHp() < 150) {
						chHpp = cList.get(0).setHp(cList.get(0).getHp() + 50);
						cList.get(0).setHp(chHpp);
						potion = cList.get(0).setPotion(cList.get(0).getPotion() - 1);
						cList.get(0).setPotion(potion);
						if (cList.get(0).setHp(chHpp) >= 150) {
							System.out.println("체력이 +50회복됐습니다.");
							System.out.println("최대체력을 넘을 수 없습니다.");
							cList.get(0).setHp(150);
						}
					}
					System.out.println("현재체력:" + cList.get(0).getHp());
					System.out.println("현재포션:" + cList.get(0).getPotion());

				}else if(figth2==3){
					select = false;
					return 1;
					
				}

			}
			break;
		
		case 2:
			System.out.println(mList.get(0).toString());
			select2=1;
			}
		}
		return 0;

	}
		

}

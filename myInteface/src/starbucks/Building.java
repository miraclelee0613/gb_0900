package starbucks;

public class Building {
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		Starbucks jamsil = new Starbucks();
		Test t = (n1, n2) -> n1 + n2;
		Form f = new Form() {
			
			@Override
			public void sell(String menu) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public String[] getMenu() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		Form f2 = new Form() {
			
			@Override
			public void sell(String menu) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public String[] getMenu() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		f.sell(null);
		t.add(0, 0);
		gangnam.register(new Form() {

			@Override
			public void sell(String menu) {
//				String[] arMenu = getMenu();
//				for (int i = 0; i < arMenu.length; i++) {
//					if(arMenu[i].equals(menu)) {
//						System.out.println(menu + "�Ǹ� �Ϸ�");
//					}
//				}
				String[] arMenu = getMenu();
				for (int i = 0; i < arMenu.length; i++) {
					if (arMenu[i].equals(menu)) {
						System.out.println(menu + "�Ǹ� �Ϸ�Ǿ����ϴ�.");
					}
				}
				
			}

			@Override
			public String[] getMenu() {
				String[] arMenu = {
						"��"
				};
				return arMenu;
			}
		});
		System.out.println("===========");
		
		jamsil.register(new FormAdapter() {
			@Override
			public String[] getMenu() {
				String[] arMenu = {
						"�Ƹ޸�ī��",
						"ī���",
						"ī��� �����ƶ�"
				};
				return arMenu;
			}

		});
		
		
		
//		for (int i = 0; i < jamsil.getArMenu().length; i++) {
//			System.out.println(i + 1 + ". " + jamsil.getArMenu()[i]);
//		}
//		
//		for (int i = 0; i < gangnam.getArMenu().length; i++) {
//			System.out.println(i + 1 + ". " + gangnam.getArMenu()[i]);
//		}
		
	}
}

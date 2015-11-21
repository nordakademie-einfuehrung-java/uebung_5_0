
public class ZufallZahlen {

	public static void main(String[] args) {

		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int a;
		
	for (int i = 1; i <= 50; i++) {
		
		a = Zufall.getZufallInt(1, 6);
		
		switch (a) {
			case 1: one++;
					break;
			case 2: two++;
					break;
			case 3: three++;
					break;
			case 4: four++;
					break;
			case 5: five++;
					break;
			case 6: six++;
					break;
		}
				
	}
	
	System.out.println("1: " + one);
	System.out.println("2: " + two);
	System.out.println("3: " + three);
	System.out.println("4: " + four);
	System.out.println("5: " + five);
	System.out.println("6: " + six);
	

	}

}

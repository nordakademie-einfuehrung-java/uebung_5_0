
public class Wuerfel {

	public static void main(String[] args) {

		int wuerfel;
		int zaehler1 = 0;
		int zaehler2 = 0;
		int zaehler3 = 0;
		int zaehler4 = 0;
		int zaehler5 = 0;
		int zaehler6 = 0;

		for (int i = 1; i <= 50; i = i + 1) {
			wuerfel = Zufall.getZufallInt(1, 6);

			switch (wuerfel) {
			case 1:
				zaehler1 = zaehler1 + 1;
				break;
			case 2:
				zaehler2 = zaehler2 + 1;
				break;
			case 3:
				zaehler3 = zaehler3 + 1;
				break;
			case 4:
				zaehler4 = zaehler4 + 1;
				break;
			case 5:
				zaehler5 = zaehler5 + 1;
				break;
			case 6:
				zaehler6 = zaehler6 + 1;
				break;
			}
		}
		System.out.println("Die Zahl 1 wurde " + zaehler1 + " mal gewuerfelt!");
		System.out.println("Die Zahl 2 wurde " + zaehler2 + " mal gewuerfelt!");
		System.out.println("Die Zahl 3 wurde " + zaehler3 + " mal gewuerfelt!");
		System.out.println("Die Zahl 4 wurde " + zaehler4 + " mal gewuerfelt!");
		System.out.println("Die Zahl 5 wurde " + zaehler5 + " mal gewuerfelt!");
		System.out.println("Die Zahl 6 wurde " + zaehler6 + " mal gewuerfelt!");

	}

}

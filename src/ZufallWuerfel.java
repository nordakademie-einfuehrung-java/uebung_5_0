
public class ZufallWuerfel {

	public static void main(String[] args) {
		int zahl1 = 0;
		int zahl2 = 0;
		int zahl3 = 0;
		int zahl4 = 0;
		int zahl5 = 0;
		int zahl6 = 0;
		
		for (int i = 1; i <= 50; i = i +1)
		{
			int wurf = Zufall.getZufallInt(1, 6);
			
			switch (wurf){
			case 1: zahl1 = zahl1 + 1; break;
			case 2: zahl2 = zahl2 + 1; break;
			case 3: zahl3 = zahl3 + 1; break;
			case 4: zahl4 = zahl4 + 1; break;
			case 5: zahl5 = zahl5 + 1; break;
			case 6: zahl6 = zahl6 + 1; break;
			}
		}
		
		System.out.println("Zahl 1 gew�rfelt: " + zahl1);
		System.out.println("Zahl 2 gew�rfelt: " + zahl2);
		System.out.println("Zahl 3 gew�rfelt: " + zahl3);
		System.out.println("Zahl 4 gew�rfelt: " + zahl4);
		System.out.println("Zahl 5 gew�rfelt: " + zahl5);
		System.out.println("Zahl 6 gew�rfelt: " + zahl6);

	}

}

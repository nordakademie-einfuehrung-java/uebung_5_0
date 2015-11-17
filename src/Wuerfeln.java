public class Wuerfeln {

	public static void main(String[] args) {
		
		
		// Variante ohne Array
		int a = 0; // a=1
		int b = 0; // a=2
		int c = 0; // a=3
		int d = 0; // a=4
		int e = 0; // a=5
		int f = 0; // a=6

		for (int zaehler = 0; zaehler < 50; zaehler = zaehler + 1) {
			int wurf = Zufall.getZufallInt(1, 6);
			// System.out.println(zaehler + " = " + wurf);

			switch (wurf) {
			case 1:a++; break;
			case 2:b++; break;
			case 3:c++; break;
			case 4:d++; break;
			case 5:e++; break;
			case 6:f++; break;
			default:
			}
		}
		System.out.println("Ausgabe ohne Array");
		System.out.println("1:" + a);
		System.out.println("2:" + b);
		System.out.println("3:" + c);
		System.out.println("4:" + d);
		System.out.println("5:" + e);
		System.out.println("6:" + f);
		
		System.out.println("");
		 
		
		
		
		// Variante mit Array
		
		// Array 	0,1,2,3,4,5
		// Würfel	1,2,3,4,5,6 	versetzt, daher immer einen zurück / vor rechnen
		
		 int[] augenArray = new int[6];
		  
		 for (int zaehler = 0; zaehler < 50; zaehler = zaehler + 1) { int wurf
		 = Zufall.getZufallInt(1, 6);
		  
		 /*	Schleife gibt Zahl zwischen 1 und 6 aus= wurf, folgende Zeile 
		 *	ermittelt Position (0 bis 5) in Array und zählt die Position einen hoch
		 */
		 augenArray[wurf - 1]++; }
		 
		 
		 //Es wird jede Arrayposition (0-5) abgefragt und dann einzeln ausgegeben
		 System.out.println("Ausgabe mit Array");
		 
		 for (int i = 0; i < augenArray.length; i++) 
		 { System.out.println((i + 1) + ": " + augenArray[i]);
		  
		  }
		 
	}

}


public class Zufallswürfel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int random;
		
		int würfel [] = new int [6];
		
		
		for ( int i = 1; i <= 50; i++){
			random = Zufall.getZufallInt(1, 6);
			
			würfel[random-1] = würfel[random-1] + 1;
			
		}
		System.out.println("Eins: " +würfel[0]);
		System.out.println("Zwei: " +würfel[1]);
		System.out.println("Drei: " +würfel[2]);
		System.out.println("Vier: " +würfel[3]);
		System.out.println("Fünf: " +würfel[4]);
		System.out.println("Sechs: " +würfel[5]);
		

	}

}

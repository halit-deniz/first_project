package halit;

public class dızıler {

	public static void main(String[] args) {
		int [][] tablo = new int [][] {
			{1,2,4},
			{3,1,4}
			
		};
		for(int i=0; i<tablo.length; i++) {
			for(int j=0; j<tablo[i].length; j++) {
				System.out.print(tablo[i][j] + " ");			
			}
			System.out.println();
		}
		System.out.println("==============="); 
for(int[] sutun : tablo) {
	for(int value : sutun) {
		System.out.print(value + " ");
	}
		System.out.println();
	}
}
	}


package view;
import controller.modulos;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		modulos mod = new modulos();
		int vt[] = new int[5];
		vt[0]=8;vt[1]=4;vt[2]=3;vt[3]=6;vt[4]=1;
		int quant = mod.pares(vt, 4);
		System.out.println(quant);
		

	}

}

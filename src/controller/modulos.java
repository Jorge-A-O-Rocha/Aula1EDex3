package controller;

public class modulos {
	
	public modulos() {
		super();
	}
	
	public int pares(int [] vet, int tamanho) {
		 if (tamanho < 0 ){
		 return 0;
		 } else {
		 if(vet[tamanho]%2 == 0) {
			 return 1 + pares(vet,tamanho-1);
		 }
		 	return pares(vet, tamanho-1);
		 }
	 }

}

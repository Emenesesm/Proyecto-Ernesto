package Ernesto;

public class ProyectoEMM {

	public static void main(String[] args) {
		int numMayor = 0;
		int numMenor = 0;
		int[] numero = new int[100];
		for (int x = 0; x < numero.length; x++) {

			numero[x] = (int) (Math.random() * 100);
			System.out.println(numero[x]);

		}
		for (int valor : numero) {
			if (numMayor < valor) {
				numMayor = valor;
			}
		}
		System.out.println("El numero mayor es " + numMayor);
	}

}

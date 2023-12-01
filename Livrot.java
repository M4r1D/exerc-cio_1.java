package exer_1;

public class Livrot {
	public static void main(String[]args) {
		livro l1 = new livro();
		
		l1.titulo ="Sangue Frio";
		l1.autor = "Robert Bryndza";
		l1.numPaginas = 307;
		
		System.out.println(l1.Imprimir());
	}
}

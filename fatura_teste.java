package exer_1;

public class fatura_teste {
	public static void main(String[]args) {
		fatura f1 = new fatura();
		
		f1.numero = "12";
		f1.descricao ="mouse pad";
		f1.qtd = 2;
		f1.preco = 8.00;
		f1.totalfatura = 2*8;
		
		System.out.println(f1.Imprimir());
		
	}
}

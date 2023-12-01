package exer_1;

public class fatura {
	String numero;
	String descricao;
	int qtd;
	double preco;
	double totalfatura;
	
	fatura(){
	}
	fatura(String numero){
		this.numero = numero;
	}
	fatura(String numero, String descricao){
		this.numero = numero;
		this.descricao = descricao;
	}
	fatura(String numero, String descricao, int qtd){
		this.numero = numero;
		this.descricao = descricao;
		this.qtd = qtd;
	}
	fatura(String numero, String descricao, int qtd, double preco){
		this.numero = numero;
		this.descricao = descricao;
		this.qtd = qtd;
		this.preco = preco;
	}
	fatura(String numero, String descricao, int qtd, double preco, double totalfatura){
		this.numero = numero;
		this.descricao = descricao;
		this.qtd = qtd;
		this.preco = preco;
		this.totalfatura = totalfatura;
	}
	//get
	public String Getnumero() {
		return numero;
	}
	public String Getdescricao() {
		return descricao;
	}
	public int Getqtd() {
		return qtd;
	}
	public double Getpreco() {
		return preco;
	}
	
	public double Gettotalfatura(double totalfatura) {
		return preco*qtd;
	}
	//set
	public void Setnumero(String numero) {
		this.numero = numero;
	}
	public void Setdescricao(String descricao) {
		this.descricao = descricao;
	}
	public void Setqtd(int qtd) {
		this.qtd = qtd;
	}
	public void Setpreco(double preco) {
		this.preco = preco;
	}
	public void Settotalfatura(double totalfatura) {
		this.totalfatura = totalfatura;
	}
	
	public String Imprimir() {
		return "Nuúmero:"+ numero
				+ "\nDescrição:" + descricao
				+ "\nQuantidade:" + qtd
				+ "\nPreço:" + preco
				+ "\nValor total:" + totalfatura;
	}
	
}

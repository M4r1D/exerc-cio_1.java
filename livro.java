package exer_1;

public class livro {
	String titulo;
	String autor;
	int numPaginas;
	
	livro(){
	}
	
	livro(String titulo){
		this.titulo = titulo;
	}
	livro(String titulo, String autor){
		this.titulo = titulo;
		this.autor = autor;
	}
	livro(String titulo, String autor, int numPaginas){
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
	public String Imprimir() {
		return "Titulo:" + titulo 
			 + "\nAutor:" + autor 
			 + "\nnumPaginas:" + numPaginas;
	}
}

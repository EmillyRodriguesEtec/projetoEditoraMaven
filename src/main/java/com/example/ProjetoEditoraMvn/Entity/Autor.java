package com.example.ProjetoEditoraMvn.Entity;

public class Autor {

	private String nomeAutor;
	private String cnttAutor;
	private String cpfAutor;
	private int codLivro;
	
	public void escreveLivro() {
		
	}
	
	public static void main(String args[]) {
		Autor autor = new Autor();
		autor.setNomeAutor("Anne");
		autor.setCnttAutor("11992853957");
		autor.setCpfAutor("67839475080");
		autor.setCodLivro(284004);
		System.out.println(autor.getNomeAutor() + "\n" + autor.getCnttAutor() + "\n" + autor.getCpfAutor() + "\n" + autor.getCodLivro());
	}
	
	
}

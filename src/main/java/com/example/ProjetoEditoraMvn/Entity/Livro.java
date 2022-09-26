package com.example.ProjetoEditoraMvn.Entity;

public class Livro {

	private String nomeLivro;
	private String generoLivro;
	private String descricaoLivro;
	private String qntddLivro;
	private String idiomaLivro;
	private int codLivro;
	private String cpfRevisor;
	private String cnpjEditora;
	private String cpfAutor;
	private int nmrTipoLivro;
	
	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setNomeLivro("Relatos de Anne Frank");
		livro.setGeneroLivro("Autobiografia");
		livro.setDescricaoLivro("Essa autobiografia contém relatos sobre a vida da autora, desde suas maiores dificuldades até sua grande ascenção em sua carreira literária");
		livro.setQntddLivro("680");
		livro.setIdiomaLivro("Português - Brasil");
		livro.setCodLivro(284004);
		livro.setCpfRevisor("20744805424");
		livro.setCnpjEditora("10398547569684");
		livro.setCpfAutor("67839475080");
		livro.setNmrTipoLivro(453414);
		System.out.println(livro.getNomeLivro() + "\n" + livro.getGeneroLivro() + "\n" + livro.getDescricaoLivro() + "\n" + livro.getQntddLivro() + "\n" + livro.getIdiomaLivro() + "\n" + livro.getCodLivro() + "\n" + livro.getCpfRevisor() + "\n" + livro.getCnpjEditora() + "\n" + livro.getCpfAutor() + "\n" + livro.getNmrTipoLivro());
	}

	
}

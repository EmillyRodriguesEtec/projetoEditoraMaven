package com.example.ProjetoEditoraMvn.Entity;

public class Editora {

	private String nomeEditora;
	private String localEditora;
	private String ieEditora;
	private String cnpjEditora;
	private String cnpjFornecedor;
	
	//corrigir o relacionamento das classes - se tem uma classe, coloca o tipo dela, n string e etc
	//data pode colocar localdatetime
	
	public void editarLivro()
	{
		
	}
	public void receberLivro() {
		
	}
	
	public void solicitarMovimentacao() {
		
	}
	
	public static void main(String[] args) {
		Editora editora = new Editora();
		editora.setNomeEditora("Panini");
		editora.setLocalEditora("Avenida da esperança, número 359, Jardim Bela Vista- São Paulo");
		editora.setIeEditora("759273957495");
		editora.setCnpjEditora("10398547569684");
		editora.setCnpjFornecedor("10238243748938");
		System.out.println(editora.getNomeEditora() + "\n" + editora.getLocalEditora() + "\n" + editora.getIeEditora() + "\n" + editora.getCnpjEditora() + "\n" + editora.getCnpjFornecedor());
	}
	
	
}

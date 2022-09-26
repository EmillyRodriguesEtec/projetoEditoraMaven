package com.example.ProjetoEditoraMvn.Entity;

public class Revisor {

	private String nomeRevisor;
	private String cnttRevisor;
	private String cpfRevisor;
	
	public void revisarLivro() {
		
	}

	public static void main(String[] args) {
		Revisor revisor = new Revisor();
		revisor.setNomeRevisor("Juliana");
		revisor.setCnttRevisor("11992478564");
		revisor.setCpfRevisor("20744805424");
		System.out.println(revisor.getNomeRevisor() + "\n" + revisor.getCnttRevisor() + "\n" + revisor.getCpfRevisor());
	}
	
	
}

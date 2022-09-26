package com.example.ProjetoEditoraMvn.Entity;
import TipoLivroEnum;

public class TipoLivro {

	private double precoUnitTipoLivro;
	private int nmrTipoLivro;
	private TipoLivroEnum tipoLivro;
	
	public static void main(String[] args) {
		TipoLivro tipoLivro = new TipoLivro();
		tipoLivro.setPrecoUnitTipoLivro(59.90);
		tipoLivro.setNmrTipoLivro(453414);
		tipoLivro.setTipoLivro(TipoLivroEnum.IMPRESSO);
		System.out.println(tipoLivro.getPrecoUnitTipoLivro() + "\n" + tipoLivro.getNmrTipoLivro() + "\n" + tipoLivro.getTipoLivro());
	}
	
}

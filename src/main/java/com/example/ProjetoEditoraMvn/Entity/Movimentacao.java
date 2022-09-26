package com.example.ProjetoEditoraMvn.Entity;
import com.example.ProjetoEditoraMvn.Enums.FormaPagamentoEnum;

public class Movimentacao {

	private int nmrMov;
	private String dataMov;
	private FormaPagamentoEnum formaPagamento;
	private String cnpjEditora;
	private int codNF;
	
	public void gerarNotaFiscal() {
		
	}
	
	public static void main(String[] args) {
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setNmrMov(793024);
		movimentacao.setDataMov("16-oct-2009");
		movimentacao.setFormaPagamento(FormaPagamentoEnum.BOLETO);
		movimentacao.setCnpjEditora("10398547569684");
		movimentacao.setCodNF(204732);
		System.out.println(movimentacao.getNmrMov() + "\n" + movimentacao.getDataMov() + "\n" + movimentacao.getFormaPagamento() + "\n" + movimentacao.getCnpjEditora() + "\n" + movimentacao.getCodNF());
		
	}

	
}

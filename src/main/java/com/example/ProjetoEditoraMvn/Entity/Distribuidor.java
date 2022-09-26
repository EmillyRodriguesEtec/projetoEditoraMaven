package com.example.ProjetoEditoraMvn.Entity;

public class Distribuidor {

	private String cnpjDistribuidor;
	private String localDistribuidor;
	private String nomeDistribuidor;
	private String cnttDistribuidor;
	private String cnpjEditora;
	
	public void distribuirLivros() {
		
	}
	
	public static void main(String args[]) {
		Distribuidor distribuidor = new Distribuidor();
		distribuidor.setCnpjDistribuidor("47304745682953");
		distribuidor.setLocalDistribuidor("Avenida São Cristóvão, número 236, parque da graça, São Paulo");
		distribuidor.setNomeDistribuidor("Distribuidora Folha Nova");
		distribuidor.setCnttDistribuidor("11908107921");
		distribuidor.setCnpjEditora("10398547569684");
		System.out.println(distribuidor.getCnpjDistribuidor() + "\n" + distribuidor.getLocalDistribuidor() + "\n" + distribuidor.getNomeDistribuidor() + "\n" + distribuidor.getCnttDistribuidor() + "\n" + distribuidor.getCnpjEditora());
	}
	
	
}

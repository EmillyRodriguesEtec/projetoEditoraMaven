package com.example.ProjetoEditoraMvn.Entity;

public class Fornecedor {

	private String cnpjFornecedor;
	private String localFornecedor;
	private String rzSocialFornecedor;
	private String cnpjEditora;
	
	public void fornecerMateriais() {
		
	}

	public static void main(String[] args) {
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setCnpjFornecedor("10238243748938");
		fornecedor.setLocalFornecedor("Avenida Josefina de Almeida, número 702, Jardim Menezes, São Paulo");
		fornecedor.setRzSocialFornecedor("Fornecedora Dois Irmãos");
		fornecedor.setCnpjEditora("10398547569684");
		System.out.println(fornecedor.getCnpjFornecedor() + "\n" + fornecedor.getLocalFornecedor() + "\n" + fornecedor.getRzSocialFornecedor() + "\n" + fornecedor.getCnpjEditora());
	}
	
	
}

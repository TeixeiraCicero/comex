package br.com.comex.main;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ClienteEstado;

public class MainCliente {

	public static void main(String[] args) {//id,nome,cpf,telefone,rua,numero,complemento,bairro,cidade,estado

		Cliente cli1 = new Cliente("Craudio", "01234567891", "41999875078","RUA XV", "5812", null, "centro", "curitiba",ClienteEstado.PR);//funcional
		
		System.out.println(cli1.toString());
	}
}
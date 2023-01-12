package principal;

import java.util.Scanner;

import entities.Funcionario;
import repositories.FuncionarioRepository;

public class Program {

	public static void main(String[] args) {

		System.out.println("\n***CADASTRO DE FUNCIONARIO***\n");

		Scanner scanner = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();

		System.out.print("Entre com o id do funcionário.....: ");
		funcionario.setIdFuncionario(Integer.parseInt(scanner.nextLine()));

		System.out.print("Entre com o nome do funcionário...: ");
		funcionario.setNome(scanner.nextLine());

		System.out.print("Entre com a matrícula ............: ");
		funcionario.setMatricula(scanner.nextLine());

		System.out.print("Entre com o CPF...................: ");
		funcionario.setCpf(scanner.nextLine());

		try {
			FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
			funcionarioRepository.exportar(funcionario);

			System.out.println("\nDADOS DO FUNCIONÁRIO: ");
			System.out.println("\tID........: " + funcionario.getIdFuncionario());
			System.out.println("\tNOME......: " + funcionario.getNome());
			System.out.println("\tMATRICULA.: " + funcionario.getMatricula());
			System.out.println("\tCPF.......: " + funcionario.getCpf());
			
			System.out.println("\nFUNCIONARIO CADASTRADO COM SUCESSO!");
			
		} catch (Exception e) {
			System.out.println("\nFALHA AO CADASTRAR FUNCIONÁRIO!");
			e.printStackTrace();

		}

	}

}

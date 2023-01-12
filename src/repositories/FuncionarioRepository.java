package repositories;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import entities.Funcionario;

public class FuncionarioRepository {
	public void exportar(Funcionario funcionario)throws Exception {
	PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("c:\\temp\\funcionario.txt"),true));
	
	printWriter.write("\nDADOS DO FUNCIONARIO:");
	printWriter.write("\nID.........:" + funcionario.getIdFuncionario());
	printWriter.write("\nNOME.......:" +funcionario.getNome());
	printWriter.write("\nMATRICULA..:" +funcionario.getMatricula());
	printWriter.write("\nCPF........:\n" +funcionario.getCpf());
	
	printWriter.flush();
	printWriter.close();
		
	}

}

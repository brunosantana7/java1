package pacote;

import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import classe.Aluno;
import classe.Disciplina;

public class PrimeiraClasse {
	
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for (int qtd=1; qtd<=2; qtd++) {
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno("Maria");
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
		
		aluno1.setNome(nome);
		
		for (int pos = 1; pos <=2; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(notaDisciplina);
			disciplina.setNota(Float.parseFloat(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		
		if (escolha == 0) {
			
			int continuarRemover = 0;
			int posicao = 1;
			
			while (continuarRemover == 0){
			
			String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1,2,3 ou 4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
			posicao++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar removendo ?");
			}
		}
		
		
		alunos.add(aluno1);
		
		}
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
			System.out.println(aluno.mediaNota());
			System.out.println("___________________________");
		}
		

		
		
	}

}

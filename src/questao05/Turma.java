package questao05;

import java.util.List;

public class Turma {

/////////////atributos//////////////////////
	private String cod;
	private Integer turno;
	private Integer sala;
	private List <Aluno>alunos;
	
//////////////construtor////////////////////////////////////////////////////////////////////
	public Turma(String cod, Integer turno, Integer sala, List<Aluno> alunos) {
		super();
		this.cod = cod;
		this.turno = turno;
		this.sala = sala;
		this.alunos = alunos;
	}
	

	
}

package classesAbstratas;

public class Programador extends Funcionario {
	
	public void aumentaSalario() {
		this.salario += salario*0.2;
		
	}
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "Programador nome = " + nome + ", salario = " + salario + ".";
	}
	
	

}

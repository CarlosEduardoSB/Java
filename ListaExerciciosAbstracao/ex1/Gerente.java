package classesAbstratas;

public class Gerente extends Funcionario {
	
	public void aumentaSalario() {
		this.salario += salario*0.1;
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
		return "Gerente nome = " + nome + ", salario = " + salario + ".";
	}

	
}

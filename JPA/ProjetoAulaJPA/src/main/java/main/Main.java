package main;

import dao.ComputadorDAO;
import entidade.Computador;

public class Main {
  
	public static void main(String[] args) {
		
		Computador c1 = new Computador();
		c1.setMarca("Lenovo");
		c1.setModelo("g400s");
		c1.setQtdMemoria("4GB");
		
		ComputadorDAO.salvar(c1);
	}
	
	
}

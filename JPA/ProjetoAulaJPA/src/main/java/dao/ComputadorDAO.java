package dao;

import javax.persistence.EntityManager;
import entidade.Computador;
import util.JpaUtil;


public class ComputadorDAO {

	public static void salvar(Computador c) {
		EntityManager em  =  JpaUtil.criarEntityManager(); // - cria o gerenciador de entidades
		em.getTransaction().begin(); // - inicia a transação 
		em.persist(c); 
		em.getTransaction().commit();
		em.close();
	}
	
	public static Computador acharPorId (Integer id) {
		EntityManager em  = JpaUtil.criarEntityManager();
		Computador c = em.find(Computador.class, id);
		em.close();
		return c;
	}
	
	public static void atualizar(Computador c) {
		EntityManager em  =  JpaUtil.criarEntityManager();
		em.getTransaction().begin(); 
		em.merge(c); 
		em.getTransaction().commit();
		em.close();
	}
	
	public static void deletar(Computador c) {
		EntityManager em  =  JpaUtil.criarEntityManager();
		em.getTransaction().begin(); 
		em.remove(c); 
		em.getTransaction().commit();
		em.close();
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.modelo;

/**
 *
 * @author Daniel
 */
import java.util.List;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MateriaDAO {
    
    
     //Atributo privado para conectarse con la base de datos
    private SessionFactory sessionFactory;
    
    /**
     * Inicializa la sesión para conectarse con la base de datos
     * @param sessionFactory 
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
    public void guardar(Materia materia) {
    
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
         
           session.persist(materia);
           
           tx.commit();
        }
        catch (Exception e) {
           if (tx!=null){ 
               tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
           session.close();
        }
    
    }
    
    
    
    
    public Materia getMateria(long id) {
        Materia mat = null;
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
           mat = (Materia)session.get(Nivel.class, id);
           tx.commit();
        }
        catch (Exception e) {
           if (tx!=null){ 
               tx.rollback();
           }
           e.printStackTrace(); 
        }finally {
           session.close();
        }
        return mat;
    }
    
    
    
    
    
    
    public List<Materia> obtenerListaMateria() {
        
            
           
             List<Materia> result = null;
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String hql = " from Materia";
            Query query = session.createQuery(hql);
            result = (List<Materia>)query.list();
            tx.commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return result;
}
    
    
    
     public List<Materia>getMateriasPorNivel(Long idnivel){
        List<Materia> materias = null;
        Session session = sessionFactory.openSession();
        Transaction tx =null;
        try{
            tx = session.beginTransaction();
   // String hql = " from Materia m join m.nivel n where n.idNivel = :id";
            String hql = "from Materia m where m.nivel.idNivel = :id";
            Query query = session.createQuery(hql);
            query.setParameter("id", idnivel);
            materias = (List<Materia>)query.list();
            tx.commit();
        }
        catch(Exception e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally{
            session.close();
        }
        
        return materias;
            
            
    }
    
    
}

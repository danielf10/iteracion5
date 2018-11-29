/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.modelo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Query;

/**
 *
 * @author Daniel
 */
public class PedirClaseDAO {
    
     private SessionFactory sessionFactory;
    
    /**
     * Inicializa la sesión para conectarse con la base de datos
     * @param sessionFactory 
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
}
    
    
    
    /**
     * Método que guarda un usuario en la base de datos
     * @param pedirClase
     */
    public void guardar(PedirClase pedirClase) {
    
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
         
           session.persist(pedirClase);
           
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
    
   
    
    
    /**
     * Método que elimina a un usuario de la base de datos
     * @param pedirClase
     */
    public void eliminar(PedirClase pedirClase) {
    
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
         
           session.delete(pedirClase);
           
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
    
    
    
     public PedirClase getPedirClase(long idPedirClase) {
        PedirClase clase = null;
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
           clase = (PedirClase)session.get(PedirClase.class, idPedirClase);
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
        return clase;
    }
     
     
     
     
      public List<PedirClase>getPedirClasesPorClase(Long idclase){
        List<PedirClase> clases = null;
        Session session = sessionFactory.openSession();
        Transaction tx =null;
        try{
            tx = session.beginTransaction();
   // String hql = " from Materia m join m.nivel n where n.idNivel = :id";
            String hql = "from PedirClase pc where pc.clase.idclase = :id";
            Query query = session.createQuery(hql);
            query.setParameter("id", idclase);
            clases = (List<PedirClase>)query.list();
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
        
        return clases;
            
            
    }
      
      
       public List<PedirClase>getPedirClasesPorAlumno(Long idalumno){
        List<PedirClase> clases = null;
        Session session = sessionFactory.openSession();
        Transaction tx =null;
        try{
            tx = session.beginTransaction();
   String hql = " from PedirClase pc join m.alumno a join a.usuario u where u.idPersona = :id";
           // String hql = "from PedirClase pc where pc.alumno  = :id";
            Query query = session.createQuery(hql);
            query.setParameter("id", idalumno);
            clases = (List<PedirClase>)query.list();
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
        
        return clases;
            
            
    } 
    
    
    
    
    
    
    
    
    
}

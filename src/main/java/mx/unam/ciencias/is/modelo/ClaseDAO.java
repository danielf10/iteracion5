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
public class ClaseDAO {
    
     private SessionFactory sessionFactory;
    
    /**
     * Inicializa la sesión para conectarse con la base de datos
     * @param sessionFactory 
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
}
    
    
     public void guardar(Clase clase) {
    
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
         
           session.persist(clase);
           
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
     
     
      public Clase getClase(long id) {
        Clase clase = null;
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
           tx = session.beginTransaction();
           clase = (Clase)session.get(Clase.class, id);
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
      
      
      
      
      
       public List<Clase> obtenerListaClase() {
        
            
           
             List<Clase> result = null;
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String hql = " from Session";
            Query query = session.createQuery(hql);
            result = (List<Clase>)query.list();
            tx.commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return result;
}
       
       
       
        public List<Clase>getClasesPorMateria(Long idmateria){
        List<Clase> clases = null;
        Session session = sessionFactory.openSession();
        Transaction tx =null;
        try{
            tx = session.beginTransaction();
   // String hql = " from Materia m join m.nivel n where n.idNivel = :id";
            String hql = "from Clase c where c.materia.idmateria = :id";
            Query query = session.createQuery(hql);
            query.setParameter("id", idmateria);
            clases = (List<Clase>)query.list();
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
        
        
        //metodo que da una clase por id de una materia 
      public Clase getClaseM(Long idclase ) {
       Clase clase = null;
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String hql = "from Clase c where c.materia.idmateria = :id";
            Query query = session.createQuery(hql);
            query.setParameter("id", idclase);
            clase = (Clase)query.uniqueResult();
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
    
    
}

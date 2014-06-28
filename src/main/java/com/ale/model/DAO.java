/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ale.model;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 *
 * @author T107
 */
public class DAO {
    
    private static final ThreadLocal t1= new ThreadLocal();
    private static final SessionFactory sessionFactory  =new Configuration()
            .configure("hibernate.cfg.xml").buildSessionFactory();

    public DAO() {
    }
    
    private static Session getSession(){
        Session session=(Session) DAO.t1.get();
        if(session ==null){
            session=sessionFactory.openSession();
            DAO.t1.set(session);
        }
    return session;
    }
    protected void begin(){
        getSession().beginTransaction();
    }
    protected void commit(){
        getSession().getTransaction().commit();
    }
    protected  void rollback(){
        try{
            getSession().getTransaction().rollback();
            getSession().close();
        }catch(HibernateException e){}
        DAO.t1.set(null);
        
    }
    public static void close(){
        getSession().close();
        DAO.t1.set(null);
              
    }
            
}

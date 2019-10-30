/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author HP
 */
public class UserDao {
    SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
    
   public boolean login(String userName,String password){
   boolean rasult=false;
   Session sess=sessionFactory.openSession();
   Query query=sess.createQuery("From User u where u.userName=:userName AND u.password=:password");
   query.setParameter("userName", userName);
   query.setParameter("password", password);
   List<User> users=query.list();
   for(User u:users){
   return true;
   }
   sess.close();
   return false;
   }
   public void signUp(User u){
   
  Session sess=sessionFactory.openSession();
  
       Transaction tran=sess.beginTransaction();
       sess.save(u);
       tran.commit();
       sess.close();
  
   }
}

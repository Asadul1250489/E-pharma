/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Category;
import entity.Product;
import entity.SubCategory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;


/**
 *
 * @author HP
 */
public class AddDao {
    SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
  public boolean addCategory(Category cat){
     try{Session session=sessionFactory.openSession();
     
     session.beginTransaction();
     session.save(cat);
     session.getTransaction().commit();
     session.close();
     return  true;
     }
     catch(Exception ex){
 return false;
  }
      
}
   public boolean addSubCategory(SubCategory subcat){
     try{Session session=sessionFactory.openSession();
     
     session.beginTransaction();
     session.save(subcat);
     session.getTransaction().commit();
     session.close();
     return  true;
     }
     catch(Exception ex){
 return false;
  }
}
    public boolean addProduct(Product product){
     try{Session session=sessionFactory.openSession();
     
     session.beginTransaction();
     session.save(product);
     session.getTransaction().commit();
     session.close();
     return  true;
     }
     catch(Exception ex){
 return false;
  }
}
}
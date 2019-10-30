/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Category;
import entity.Product;
import entity.SubCategory;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;


/**
 *
 * @author HP
 */
public class ListDao {

    SessionFactory sessionFactory=HibernateUtil.getSessionFactory();

    public List catList() {
        Session sess = sessionFactory.openSession();

        List<Category> cList = sess.createQuery("SELECT a1.catName FROM Category a1 ")
                .list();
        cList.toString();
        sess.close();
        return cList;
    }

    public List subcatList(String name) {
        Session sess = sessionFactory.openSession();

        List<SubCategory> cList = sess.createQuery("SELECT a1.subCatName FROM SubCategory a1"
                + " WHERE a1.category.catId"
                + " IN (SELECT a.catId FROM Category a "
                + "where lower(a.catName) = '"
                + name.toLowerCase() + "')")
                .list();
        cList.toString();
        sess.close();
        return cList;
    }

    public List<Category> catListByName(String name) {

        try {

            Session sess = sessionFactory.openSession();
            List<Category> cList
                    = sess.createQuery("SELECT a1 FROM Category a1"
                            + " WHERE lower(catName) = '" + name.toLowerCase() + "'")
                            .list();
            cList.toString();
            sess.close();
            return cList;
        } catch (Exception e) {

        }
        return null;
    }

    public List<SubCategory> subcatListByName(String name) {

        try {

            Session sess = sessionFactory.openSession();
            List<SubCategory> cList
                    = sess.createQuery("SELECT a1 FROM SubCategory a1"
                            + " WHERE lower(subCatName) = '" + name.toLowerCase() + "'")
                            .list();
            cList.toString();
            sess.close();
            return cList;
        } catch (Exception e) {

        }
        return null;
    }

    public List allProductList() {
        Session sess=sessionFactory.openSession();

        List<Product> cList = sess.createQuery("SELECT a1 FROM Product a1 ")
                .list();
        cList.toString();
        sess.close();
        return cList;
    }

}

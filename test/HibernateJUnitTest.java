/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import LoveWishDAO.User;
import LoveWishWS.utils.HibernateUtil;
import java.util.Date;
import org.hibernate.Session;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Armando
 */
public class HibernateJUnitTest {
    
    public HibernateJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
        Session session = HibernateUtil.getSessionFactory().openSession(); 
        session.beginTransaction();

        User student = new User("Armando","Evangelista","f@a.com","password","M",new Date(),"arma","Milano");

        session.save(student);
        session.getTransaction().commit();

        System.out.println("Great! user was saved");         
     }
}

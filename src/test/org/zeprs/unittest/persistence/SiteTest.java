package org.zeprs.unittest.persistence;

import org.cidrz.webapp.dynasite.dao.FlowDAO;
import org.zeprs.unittest.ZeprsTest;

import javax.servlet.ServletException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Dave Peckham
 * Date: Mar 29, 2004
 * Time: 3:55:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class SiteTest extends ZeprsTest {

    private String listName = "Sites";
    private String name = "Site";
    private String className = "org.cidrz.webapp.dynasite.valueobject.Site";
    private String dao = "org.cidrz.webapp.dynasite.dao.SiteDAO";
    private Class[] argClazz = new Class[]{Long.class};
    private Object[] args = new Object[]{new Long("1")};



    public void testOne() {

        Long id = new Long("1");
        Class clazz = null;
        try {
            clazz = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Object object = null;
        try {
            object = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        Class daoClazz = null;
        try {
            daoClazz = Class.forName(dao);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Method m = null;
        try {
            m = daoClazz.getDeclaredMethod("getOne",argClazz);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        try {
            //object = FlowDAO.getOne(id);
            object =  m.invoke(object, args);
        }  catch (IllegalAccessException e) {
            e.printStackTrace();
            fail("Failed to get " + name);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            fail("Failed to get " + name);
        }
        assertNotNull(name + " was null", object);
    }

     public void testList() {

        Class daoClazz = null;
        try {
            daoClazz = Class.forName(dao);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        List list = null;
        Method m = null;
        try {
            m = daoClazz.getDeclaredMethod("getAll", new Class[]{});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            list = (List) m.invoke(null, new Object[]{});
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            fail("Failed to get list of " + listName);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            fail("Failed to get list of " + listName);
        }
        assertNotNull(listName + " list was null", list);
    }

     public void testListOrder() {

        Class daoClazz = null;
        try {
            daoClazz = Class.forName(dao);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        List list = null;
        Method m = null;
        try {
            m = daoClazz.getDeclaredMethod("getAll", new Class[]{String.class});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            list = (List) m.invoke(list, new Object[]{new String("name")});
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            fail("Failed to get list of " + listName);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            fail("Failed to get list of " + listName);
        }
        assertNotNull(listName + " list was null", list);
    }
}

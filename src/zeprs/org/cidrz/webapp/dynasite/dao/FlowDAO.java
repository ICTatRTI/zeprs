/*
 *    Copyright 2003, 2004, 2005, 2006 Research Triangle Institute
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 */

package org.cidrz.webapp.dynasite.dao;

import org.cidrz.webapp.dynasite.utils.DatabaseUtils;
import org.cidrz.webapp.dynasite.valueobject.Flow;
import org.cidrz.webapp.dynasite.exception.ObjectNotFoundException;

import javax.servlet.ServletException;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:ckelley@rti.org">Chris Kelley</a>
 *         Date: Jul 4, 2005
 *         Time: 9:22:16 AM
 */
public class FlowDAO {

    /**
     * Returns one record
     *
     * @param conn
     * @param id
     * @return
     * @throws java.sql.SQLException
     * @throws javax.servlet.ServletException
     */
    public static Flow getOne(Connection conn, Long id) throws SQLException, ServletException, ObjectNotFoundException {
        Flow item = null;
        String sql;
        ArrayList values;
        sql = "select id, name, flow_order AS flowOrder from admin.flow where id=?";
        values = new ArrayList();
        values.add(id);
        item = (Flow) DatabaseUtils.getBean(conn, Flow.class, sql, values);
        return item;
    }

    /**
     * @return List of objects
     * @throws SQLException
     * @throws ServletException
     * @param conn
     */
    public static List getAll(Connection conn) throws SQLException, ServletException {

        List list = new ArrayList();
        ArrayList values = new ArrayList();
        values = new ArrayList();
        String sql = "select id, name, flow_order AS flowOrder from admin.flow";
        list = DatabaseUtils.getList(conn, Flow.class, sql, values);
        return list;
    }

}

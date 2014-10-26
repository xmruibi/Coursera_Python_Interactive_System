/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import DBreader.DBO;
import entity.UserInfo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author birui
 */
public class UserBean {

    private ResultSet rs = null;

    public String checkPwd(String username, String password) {
        String sql = "select password from userinfo where username = '"+username+"'";
        DBO dbo = new DBO();
        dbo.open();
        try {
            rs = dbo.executeQuery(sql);
        
        if(rs.next()){
            if(rs.getString(1).equals(password))
                return "successful";
            else
                return "Wrong password!";
        }else
            return "No such user exist!!";
        } catch (SQLException ex) {
            return null;
        }finally {
            dbo.close();
        }
    }

    public List<UserInfo> getChatRecord(String username) {
        String sql = "select email,fname,lname from userinfo where username = '" + username + "'";
        DBO dbo = new DBO();
        dbo.open();
        List<UserInfo> record = new ArrayList<UserInfo>();
        try {
            rs = dbo.executeQuery(sql);
            while (rs.next()) {
                UserInfo info = new UserInfo();
                info.setEmail(rs.getString(1));
                info.setFName(rs.getString(2));
                info.setLName(rs.getString(3));
                record.add(info);
            }

            return record;
        } catch (Exception e) {
            return null;
        } finally {
            dbo.close();
        }
    }

}

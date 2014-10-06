/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSTest;

import bean.UserBean;
import entity.UserInfo;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author birui
 */
@WebService(serviceName = "FirstWebService")
public class FirstWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Authen")
    public String Authen(@WebParam(name = "Username") String Username, @WebParam(name = "Password") String Password) {
        UserBean ub = new UserBean();
        String checkResult= ub.checkPwd(Username, Password);
        return checkResult;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getInfo")
    public List<UserInfo> getInfo(@WebParam(name = "Username") String Username) {
        UserBean ub = new UserBean();
        List<UserInfo> userInfo= ub.getChatRecord(Username);
        return userInfo;
    }
    
    

    
    
}

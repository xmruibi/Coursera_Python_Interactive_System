
package wstest;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FirstWebService", targetNamespace = "http://WSTest/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FirstWebService {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://WSTest/", className = "wstest.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://WSTest/", className = "wstest.HelloResponse")
    @Action(input = "http://WSTest/FirstWebService/helloRequest", output = "http://WSTest/FirstWebService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param username
     * @return
     *     returns java.util.List<wstest.UserInfo>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInfo", targetNamespace = "http://WSTest/", className = "wstest.GetInfo")
    @ResponseWrapper(localName = "getInfoResponse", targetNamespace = "http://WSTest/", className = "wstest.GetInfoResponse")
    @Action(input = "http://WSTest/FirstWebService/getInfoRequest", output = "http://WSTest/FirstWebService/getInfoResponse")
    public List<UserInfo> getInfo(
        @WebParam(name = "Username", targetNamespace = "")
        String username);

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Authen")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Authen", targetNamespace = "http://WSTest/", className = "wstest.Authen")
    @ResponseWrapper(localName = "AuthenResponse", targetNamespace = "http://WSTest/", className = "wstest.AuthenResponse")
    @Action(input = "http://WSTest/FirstWebService/AuthenRequest", output = "http://WSTest/FirstWebService/AuthenResponse")
    public String authen(
        @WebParam(name = "Username", targetNamespace = "")
        String username,
        @WebParam(name = "Password", targetNamespace = "")
        String password);

}
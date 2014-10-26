
package wstest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wstest package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AuthenResponse_QNAME = new QName("http://WSTest/", "AuthenResponse");
    private final static QName _Hello_QNAME = new QName("http://WSTest/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://WSTest/", "helloResponse");
    private final static QName _GetInfo_QNAME = new QName("http://WSTest/", "getInfo");
    private final static QName _Authen_QNAME = new QName("http://WSTest/", "Authen");
    private final static QName _GetInfoResponse_QNAME = new QName("http://WSTest/", "getInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wstest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetInfoResponse }
     * 
     */
    public GetInfoResponse createGetInfoResponse() {
        return new GetInfoResponse();
    }

    /**
     * Create an instance of {@link Authen }
     * 
     */
    public Authen createAuthen() {
        return new Authen();
    }

    /**
     * Create an instance of {@link GetInfo }
     * 
     */
    public GetInfo createGetInfo() {
        return new GetInfo();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link AuthenResponse }
     * 
     */
    public AuthenResponse createAuthenResponse() {
        return new AuthenResponse();
    }

    /**
     * Create an instance of {@link UserInfo }
     * 
     */
    public UserInfo createUserInfo() {
        return new UserInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTest/", name = "AuthenResponse")
    public JAXBElement<AuthenResponse> createAuthenResponse(AuthenResponse value) {
        return new JAXBElement<AuthenResponse>(_AuthenResponse_QNAME, AuthenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTest/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTest/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTest/", name = "getInfo")
    public JAXBElement<GetInfo> createGetInfo(GetInfo value) {
        return new JAXBElement<GetInfo>(_GetInfo_QNAME, GetInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTest/", name = "Authen")
    public JAXBElement<Authen> createAuthen(Authen value) {
        return new JAXBElement<Authen>(_Authen_QNAME, Authen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSTest/", name = "getInfoResponse")
    public JAXBElement<GetInfoResponse> createGetInfoResponse(GetInfoResponse value) {
        return new JAXBElement<GetInfoResponse>(_GetInfoResponse_QNAME, GetInfoResponse.class, null, value);
    }

}

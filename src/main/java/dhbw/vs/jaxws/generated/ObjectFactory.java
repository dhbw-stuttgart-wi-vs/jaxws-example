
package dhbw.vs.jaxws.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dhbw.vs.jaxws.generated package. 
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

    private final static QName _DemoMethodResponse_QNAME = new QName("http://dhbw.de/vs/jaxws/", "demoMethodResponse");
    private final static QName _DemoMethodParameters_QNAME = new QName("http://dhbw.de/vs/jaxws/", "demoMethodParameters");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dhbw.vs.jaxws.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dhbw.de/vs/jaxws/", name = "demoMethodResponse")
    public JAXBElement<String> createDemoMethodResponse(String value) {
        return new JAXBElement<String>(_DemoMethodResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dhbw.de/vs/jaxws/", name = "demoMethodParameters")
    public JAXBElement<String> createDemoMethodParameters(String value) {
        return new JAXBElement<String>(_DemoMethodParameters_QNAME, String.class, null, value);
    }

}

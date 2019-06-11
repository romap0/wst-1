
package wst.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ShopService", targetNamespace = "http://wst.com", wsdlLocation = "http://localhost:8080/app/ShopService?wsdl")
public class ShopService
    extends Service
{

    private final static URL SHOPSERVICE_WSDL_LOCATION;
    private final static WebServiceException SHOPSERVICE_EXCEPTION;
    private final static QName SHOPSERVICE_QNAME = new QName("http://wst.com", "ShopService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/app/ShopService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SHOPSERVICE_WSDL_LOCATION = url;
        SHOPSERVICE_EXCEPTION = e;
    }

    public ShopService() {
        super(__getWsdlLocation(), SHOPSERVICE_QNAME);
    }

    public ShopService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SHOPSERVICE_QNAME, features);
    }

    public ShopService(URL wsdlLocation) {
        super(wsdlLocation, SHOPSERVICE_QNAME);
    }

    public ShopService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SHOPSERVICE_QNAME, features);
    }

    public ShopService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ShopService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ShopWebService
     */
    @WebEndpoint(name = "ShopWebServicePort")
    public ShopWebService getShopWebServicePort() {
        return super.getPort(new QName("http://wst.com", "ShopWebServicePort"), ShopWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ShopWebService
     */
    @WebEndpoint(name = "ShopWebServicePort")
    public ShopWebService getShopWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://wst.com", "ShopWebServicePort"), ShopWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SHOPSERVICE_EXCEPTION!= null) {
            throw SHOPSERVICE_EXCEPTION;
        }
        return SHOPSERVICE_WSDL_LOCATION;
    }

}

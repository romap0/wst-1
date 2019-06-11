
package wst.generated;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ShopWebService", targetNamespace = "http://wst.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ShopWebService {


    /**
     * 
     * @return
     *     returns java.util.List<wst.generated.Shop>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getShops", targetNamespace = "http://wst.com", className = "wst.generated.GetShops")
    @ResponseWrapper(localName = "getShopsResponse", targetNamespace = "http://wst.com", className = "wst.generated.GetShopsResponse")
    public List<Shop> getShops();

    /**
     * 
     * @return
     *     returns java.util.List<wst.generated.Shop>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://wst.com", className = "wst.generated.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://wst.com", className = "wst.generated.FindAllResponse")
    public List<Shop> findAll();

    /**
     * 
     * @param address
     * @param city
     * @param name
     * @param isActive
     * @param type
     * @return
     *     returns java.util.List<wst.generated.Shop>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "filter", targetNamespace = "http://wst.com", className = "wst.generated.Filter")
    @ResponseWrapper(localName = "filterResponse", targetNamespace = "http://wst.com", className = "wst.generated.FilterResponse")
    public List<Shop> filter(
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "city", targetNamespace = "")
        String city,
        @WebParam(name = "address", targetNamespace = "")
        String address,
        @WebParam(name = "isActive", targetNamespace = "")
        Boolean isActive,
        @WebParam(name = "type", targetNamespace = "")
        String type);

}
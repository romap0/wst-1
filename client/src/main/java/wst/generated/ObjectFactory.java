
package wst.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wst.generated package. 
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

    private final static QName _GetShops_QNAME = new QName("http://wst.com", "getShops");
    private final static QName _Filter_QNAME = new QName("http://wst.com", "filter");
    private final static QName _FindAll_QNAME = new QName("http://wst.com", "findAll");
    private final static QName _GetShopsResponse_QNAME = new QName("http://wst.com", "getShopsResponse");
    private final static QName _FilterResponse_QNAME = new QName("http://wst.com", "filterResponse");
    private final static QName _FindAllResponse_QNAME = new QName("http://wst.com", "findAllResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wst.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Filter }
     * 
     */
    public Filter createFilter() {
        return new Filter();
    }

    /**
     * Create an instance of {@link GetShops }
     * 
     */
    public GetShops createGetShops() {
        return new GetShops();
    }

    /**
     * Create an instance of {@link GetShopsResponse }
     * 
     */
    public GetShopsResponse createGetShopsResponse() {
        return new GetShopsResponse();
    }

    /**
     * Create an instance of {@link FilterResponse }
     * 
     */
    public FilterResponse createFilterResponse() {
        return new FilterResponse();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link Shop }
     * 
     */
    public Shop createShop() {
        return new Shop();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShops }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wst.com", name = "getShops")
    public JAXBElement<GetShops> createGetShops(GetShops value) {
        return new JAXBElement<GetShops>(_GetShops_QNAME, GetShops.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wst.com", name = "filter")
    public JAXBElement<Filter> createFilter(Filter value) {
        return new JAXBElement<Filter>(_Filter_QNAME, Filter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wst.com", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShopsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wst.com", name = "getShopsResponse")
    public JAXBElement<GetShopsResponse> createGetShopsResponse(GetShopsResponse value) {
        return new JAXBElement<GetShopsResponse>(_GetShopsResponse_QNAME, GetShopsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wst.com", name = "filterResponse")
    public JAXBElement<FilterResponse> createFilterResponse(FilterResponse value) {
        return new JAXBElement<FilterResponse>(_FilterResponse_QNAME, FilterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wst.com", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

}

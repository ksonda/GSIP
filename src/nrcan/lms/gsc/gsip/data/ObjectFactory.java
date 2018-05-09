

package nrcan.lms.gsc.gsip.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nrcan.lms.gsc.gsip.data package. 
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

    private final static QName _Data_QNAME = new QName("urn:x-gsip:1.0", "data");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nrcan.lms.gsc.gsip.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MatchType }
     * 
     */
    public MatchType createMatchType() {
        return new MatchType();
    }

    /**
     * Create an instance of {@link DataType }
     * 
     */
    public DataType createDataType() {
        return new DataType();
    }

    /**
     * Create an instance of {@link MatchType.MimeType }
     * 
     */
    public MatchType.MimeType createMatchTypeMimeType() {
        return new MatchType.MimeType();
    }

    /**
     * Create an instance of {@link MatchType.Source }
     * 
     */
    public MatchType.Source createMatchTypeSource() {
        return new MatchType.Source();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:x-gsip:1.0", name = "data")
    public JAXBElement<DataType> createData(DataType value) {
        return new JAXBElement<DataType>(_Data_QNAME, DataType.class, null, value);
    }

}

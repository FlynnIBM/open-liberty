//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.20 at 10:40:55 AM CDT 
//


package org.apache.cxf.configuration.security;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.cxf.configuration.security package. 
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

    private final static QName _Authorization_QNAME = new QName("http://cxf.apache.org/configuration/security", "authorization");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.cxf.configuration.security
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FiltersType }
     * 
     */
    public FiltersType createFiltersType() {
        return new FiltersType();
    }

    /**
     * Create an instance of {@link TLSServerParametersType }
     * 
     */
    public TLSServerParametersType createTLSServerParametersType() {
        return new TLSServerParametersType();
    }

    /**
     * Create an instance of {@link SecureRandomParameters }
     * 
     */
    public SecureRandomParameters createSecureRandomParameters() {
        return new SecureRandomParameters();
    }

    /**
     * Create an instance of {@link TrustManagersType }
     * 
     */
    public TrustManagersType createTrustManagersType() {
        return new TrustManagersType();
    }

    /**
     * Create an instance of {@link CertificateConstraintsType }
     * 
     */
    public CertificateConstraintsType createCertificateConstraintsType() {
        return new CertificateConstraintsType();
    }

    /**
     * Create an instance of {@link AuthorizationPolicy }
     * 
     */
    public AuthorizationPolicy createAuthorizationPolicy() {
        return new AuthorizationPolicy();
    }

    /**
     * Create an instance of {@link CipherSuites }
     * 
     */
    public CipherSuites createCipherSuites() {
        return new CipherSuites();
    }

    /**
     * Create an instance of {@link ClientAuthentication }
     * 
     */
    public ClientAuthentication createClientAuthentication() {
        return new ClientAuthentication();
    }

    /**
     * Create an instance of {@link CertStoreType }
     * 
     */
    public CertStoreType createCertStoreType() {
        return new CertStoreType();
    }

    /**
     * Create an instance of {@link DNConstraintsType }
     * 
     */
    public DNConstraintsType createDNConstraintsType() {
        return new DNConstraintsType();
    }

    /**
     * Create an instance of {@link TLSClientParametersType }
     * 
     */
    public TLSClientParametersType createTLSClientParametersType() {
        return new TLSClientParametersType();
    }

    /**
     * Create an instance of {@link ProxyAuthorizationPolicy }
     * 
     */
    public ProxyAuthorizationPolicy createProxyAuthorizationPolicy() {
        return new ProxyAuthorizationPolicy();
    }

    /**
     * Create an instance of {@link KeyManagersType }
     * 
     */
    public KeyManagersType createKeyManagersType() {
        return new KeyManagersType();
    }

    /**
     * Create an instance of {@link KeyStoreType }
     * 
     */
    public KeyStoreType createKeyStoreType() {
        return new KeyStoreType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.apache.org/configuration/security", name = "authorization")
    public JAXBElement<AuthorizationPolicy> createAuthorization(AuthorizationPolicy value) {
        return new JAXBElement<AuthorizationPolicy>(_Authorization_QNAME, AuthorizationPolicy.class, null, value);
    }

}

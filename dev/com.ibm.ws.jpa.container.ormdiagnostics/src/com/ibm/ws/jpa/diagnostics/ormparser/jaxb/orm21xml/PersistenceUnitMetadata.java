/*******************************************************************************
 * Copyright (c) 2011, 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.04.12 at 04:14:13 PM CDT
//

package com.ibm.ws.jpa.diagnostics.ormparser.jaxb.orm21xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.ibm.ws.jpa.diagnostics.ormparser.entitymapping.IPersistenceUnitDefaults;
import com.ibm.ws.jpa.diagnostics.ormparser.entitymapping.IPersistenceUnitMetadata;

/**
 *
 *
 * Metadata that applies to the persistence unit and not just to
 * the mapping file in which it is contained.
 *
 * If the xml-mapping-metadata-complete element is specified,
 * the complete set of mapping metadata for the persistence unit
 * is contained in the XML mapping files for the persistence unit.
 *
 *
 *
 * <p>Java class for persistence-unit-metadata complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="persistence-unit-metadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xml-mapping-metadata-complete" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}emptyType" minOccurs="0"/>
 *         &lt;element name="persistence-unit-defaults" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}persistence-unit-defaults" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistence-unit-metadata", propOrder = {
                                                           "description",
                                                           "xmlMappingMetadataComplete",
                                                           "persistenceUnitDefaults"
})
public class PersistenceUnitMetadata implements IPersistenceUnitMetadata {

    protected String description;
    @XmlElement(name = "xml-mapping-metadata-complete")
    protected EmptyType xmlMappingMetadataComplete;
    @XmlElement(name = "persistence-unit-defaults")
    protected PersistenceUnitDefaults persistenceUnitDefaults;

    /**
     * Gets the value of the description property.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *            allowed object is
     *            {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the xmlMappingMetadataComplete property.
     *
     * @return
     *         possible object is
     *         {@link EmptyType }
     *
     */
    public EmptyType getXmlMappingMetadataComplete() {
        return xmlMappingMetadataComplete;
    }

    /**
     * Sets the value of the xmlMappingMetadataComplete property.
     *
     * @param value
     *            allowed object is
     *            {@link EmptyType }
     *
     */
    public void setXmlMappingMetadataComplete(EmptyType value) {
        this.xmlMappingMetadataComplete = value;
    }

    /**
     * Gets the value of the persistenceUnitDefaults property.
     *
     * @return
     *         possible object is
     *         {@link PersistenceUnitDefaults }
     *
     */
    public PersistenceUnitDefaults getPersistenceUnitDefaults() {
        return persistenceUnitDefaults;
    }

    /**
     * Sets the value of the persistenceUnitDefaults property.
     *
     * @param value
     *            allowed object is
     *            {@link PersistenceUnitDefaults }
     *
     */
    public void setPersistenceUnitDefaults(PersistenceUnitDefaults value) {
        this.persistenceUnitDefaults = value;
    }

    @Override
    public boolean isXmlMappingMetadataComplete() {
        return (this.getXmlMappingMetadataComplete() != null);
    }

    @Override
    public IPersistenceUnitDefaults getIPersistenceUnitDefaults() {
        return (IPersistenceUnitDefaults) this.getPersistenceUnitDefaults();
    }
}

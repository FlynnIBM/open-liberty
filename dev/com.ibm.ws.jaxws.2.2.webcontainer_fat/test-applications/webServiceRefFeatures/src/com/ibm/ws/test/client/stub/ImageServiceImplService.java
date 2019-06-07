/*******************************************************************************
 * Copyright (c) 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.test.client.stub;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2012-09-04T15:11:57.281+08:00
 * Generated source version: 2.6.2
 *
 */
@WebServiceClient(name = "ImageServiceImplService",
                  wsdlLocation = "image.wsdl",
                  targetNamespace = "http://jaxws.service/")
public class ImageServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://jaxws.service/", "ImageServiceImplService");
    public final static QName ImageServiceImplPort = new QName("http://jaxws.service/", "ImageServiceImplPort");
    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = ImageServiceImplService.class.getResource(".");
            url = new URL(baseUrl, "image.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ImageServiceImplService.class.getName()).log(java.util.logging.Level.INFO,
                                                                                            "Can not initialize the default wsdl from {0}", "wsdl.xml");
        }
        WSDL_LOCATION = url;
    }

    public ImageServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ImageServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ImageServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     *
     * @return
     *         returns ImageService
     */
    @WebEndpoint(name = "ImageServiceImplPort")
    public ImageService getImageServiceImplPort() {
        return super.getPort(ImageServiceImplPort, ImageService.class);
    }

    /**
     *
     * @param features
     *                     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy. Supported features not in the <code>features</code> parameter will have their
     *                     default
     *                     values.
     * @return
     *         returns ImageService
     */
    @WebEndpoint(name = "ImageServiceImplPort")
    public ImageService getImageServiceImplPort(WebServiceFeature... features) {
        return super.getPort(ImageServiceImplPort, ImageService.class, features);
    }

}

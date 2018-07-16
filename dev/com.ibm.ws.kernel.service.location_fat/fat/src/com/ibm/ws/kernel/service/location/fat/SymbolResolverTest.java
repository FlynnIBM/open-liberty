/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.kernel.service.location.fat;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ibm.websphere.simplicity.ShrinkHelper;

import componenttest.annotation.Server;
import componenttest.custom.junit.runner.FATRunner;
import componenttest.topology.impl.LibertyServer;

@RunWith(FATRunner.class)
public class SymbolResolverTest {

    public final static String APP_NAME = "myTestApp";

    @Server("ENVResolverTestServer")

    public static LibertyServer server;

    /**
     * Creates myTestApp.war in ENVResolverTestServer and starts server
     *
     * @throws Exception
     */
    @BeforeClass
    public static void setUp() throws Exception {
        ShrinkHelper.defaultApp(server, APP_NAME, "");
        server.startServer();
    }

    /**
     * Stops ENVResolverTestServer
     *
     * @throws Exception
     */
    @AfterClass
    public static void tearDown() throws Exception {
        server.stopServer();
    }

    /**
     * Confirm that the example Artifactory dependency was download and is available on the classpath
     *
     * @throws Exception
     */
    @Test
    public void verifyArtifactoryDependency() throws Exception {
        org.apache.commons.logging.Log.class.getName();
    }

    /**
     * See of URL is reachable by sending GET request to server, checking response code is 200 (OK) and
     * confirming that the string "Hello World!" is present on the response StringBuffer
     *
     * @throws Exception
     */
    @Test
    public void verifyMyTestAppIsOnline() throws Exception {
        HttpURLConnection con = null;
        BufferedReader in = null;
        try {
            String urlStr = "http://" + server.getHostname() + ":" + server.getHttpDefaultPort() + "/" + APP_NAME;
            URL url = new URL(urlStr);
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            System.out.println("Sending GET request to " + urlStr);
            assertEquals(200, con.getResponseCode());

            in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine = "";
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            assert (response.indexOf("Hello World!") != -1);
            System.out.println("GET request success, MyTestApp is online");
        } finally {
            if (in != null) {
                in.close();
            }
            if (con != null) {
                con.disconnect();
            }
        }
    }
}
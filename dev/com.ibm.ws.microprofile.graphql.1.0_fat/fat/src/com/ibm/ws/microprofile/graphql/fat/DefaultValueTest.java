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
package com.ibm.ws.microprofile.graphql.fat;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.ibm.websphere.simplicity.ShrinkHelper;

import componenttest.annotation.Server;
import componenttest.annotation.TestServlet;
import componenttest.custom.junit.runner.FATRunner;
import componenttest.topology.impl.LibertyServer;
import componenttest.topology.utils.FATServletClient;
import mpGraphQL10.defaultvalue.DefaultValueTestServlet;

@RunWith(FATRunner.class)
public class DefaultValueTest extends FATServletClient {

    private static final String SERVER = "mpGraphQL10.defaultvalue";
    private static final String APP_NAME = "defaultvalueApp";

    @Server(SERVER)
    @TestServlet(servlet = DefaultValueTestServlet.class, contextRoot = APP_NAME)
    public static LibertyServer server;

    @BeforeClass
    public static void setUp() throws Exception {
        ShrinkHelper.defaultDropinApp(server, APP_NAME, "mpGraphQL10.defaultvalue");
        server.startServer();
    }

    @AfterClass
    public static void afterClass() throws Exception {
        server.dumpServer("deprecation");
        server.stopServer();
    }
}

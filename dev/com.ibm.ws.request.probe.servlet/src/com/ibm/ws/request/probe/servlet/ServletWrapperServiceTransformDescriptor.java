/*******************************************************************************
 * Copyright (c) 2014, 2016 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.request.probe.servlet;

import com.ibm.wsspi.request.probe.bci.RequestProbeTransformDescriptor;


public class ServletWrapperServiceTransformDescriptor implements RequestProbeTransformDescriptor {

    private static final String classToInstrument = "com/ibm/ws/webcontainer/servlet/ServletWrapper";
    private static final String methodToInstrument = "service";
    private static final String descOfMethod = "(Ljavax/servlet/ServletRequest;Ljavax/servlet/ServletResponse;Lcom/ibm/ws/webcontainer/webapp/WebAppServletInvocationEvent;)V";
    private static final String requestProbeType = "websphere.servlet.service";
	
	@Override
	public String getClassName() {
		return classToInstrument;
	}

	@Override
	public String getMethodName() {
		return methodToInstrument;
	}

	@Override
	public String getMethodDesc() {
		return descOfMethod;
	}

	@Override
	public String getEventType() {
		return requestProbeType;
	}
	
	@Override
	public boolean isCounter() {
		return false;
	}

	@Override
	public Object getContextInfo(final Object instanceOfThisClass, final Object methodArgs) {
		return new ServletContextInfoHelper( instanceOfThisClass,  methodArgs);
	}
}

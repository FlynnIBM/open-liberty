/*******************************************************************************
 * Copyright (c) 2015, 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.ejbcontainer.remote.fat.mix.sf.ejb;

/**
 * Local interface for Container Managed Transaction Stateful
 * Session bean.
 **/
public interface AltCMTStatefulRemote {
    public void txDefault();

    public void txRequired();

    public void txNotSupported();

    public void txRequiresNew();

    public void txSupports();

    public void txNever();

    public void txMandatory();
}
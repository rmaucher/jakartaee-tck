/*
 * Copyright (c) 2007, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

/*
 * $Id$
 */

package com.sun.ts.tests.ejb.ee.sec.bmp.common;

import javax.ejb.EJBHome;
import javax.ejb.CreateException;
import java.rmi.RemoteException;
import java.util.Properties;
import javax.ejb.FinderException;

public interface TestHome extends EJBHome {
  public Test create(Properties p, boolean newTable, int cofID, String cofName,
      float cofPrice) throws RemoteException, CreateException;

  public Test findByPrimaryKey(Integer key)
      throws RemoteException, FinderException;

  public Test findTheBean(Properties p, Integer key)
      throws RemoteException, FinderException;

}

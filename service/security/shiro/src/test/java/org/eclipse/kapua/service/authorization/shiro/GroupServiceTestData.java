/*******************************************************************************
 * Copyright (c) 2011, 2017 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.authorization.shiro;

import javax.inject.Singleton;

import org.eclipse.kapua.model.id.KapuaId;
import org.eclipse.kapua.service.authorization.group.Group;
import org.eclipse.kapua.service.authorization.group.GroupCreator;
import org.eclipse.kapua.service.authorization.group.GroupListResult;

@Singleton
public class GroupServiceTestData {

    Group group;
    Group groupSecond;
    GroupCreator groupCreator;
    GroupListResult groupList;
    KapuaId groupId;

    public void clearData() {
        group = null;
        groupSecond = null;
        groupCreator = null;
        groupList = null;
        groupId = null;
    }
}

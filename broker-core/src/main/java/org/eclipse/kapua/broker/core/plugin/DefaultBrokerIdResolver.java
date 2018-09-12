/*******************************************************************************
 * Copyright (c) 2017 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.broker.core.plugin;

import org.apache.activemq.broker.BrokerFilter;

/**
 * Lookup from the broker filter
 *
 * @since 1.0
 */
public class DefaultBrokerIdResolver implements BrokerIdResolver {

    @Override
    public String getBrokerId(BrokerFilter brokerFilter) {
        return brokerFilter.getBrokerId().getValue();
    }
}
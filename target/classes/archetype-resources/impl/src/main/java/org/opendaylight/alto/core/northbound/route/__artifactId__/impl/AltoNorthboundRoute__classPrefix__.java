/*
 * Copyright (c) 2015 Yale University and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.alto.core.northbound.route.${artifactId}.impl;

import org.opendaylight.controller.sal.binding.api.BindingAwareProvider;
import org.opendaylight.alto.core.northbound.api.AltoNorthboundRoute;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ProviderContext;
import org.opendaylight.alto.core.northbound.api.AltoNorthboundRouter;

public class AltoNorthboundRoute${classPrefix} implements BindingAwareProvider, AutoCloseable, AltoNorthboundRoute {



    @Override
    public void onSessionInitiated(ProviderContext session) {

    }

    public void register(AltoNorthboundRouter router) {
        //TODO
        //need to add router like following sentence
//        private AltoNorthboundRouter m_router = null;
//        m_router = router;
//        m_router.addRoute("costmap", new AltoNorthboundRoute${classPrefix}());

    }

    @Override
    public void close() {

    }


}

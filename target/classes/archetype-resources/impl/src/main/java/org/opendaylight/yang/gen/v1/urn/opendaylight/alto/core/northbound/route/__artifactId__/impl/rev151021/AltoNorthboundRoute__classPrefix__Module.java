package org.opendaylight.yang.gen.v1.urn.opendaylight.alto.core.northbound.route.${artifactId}.impl.rev151021;

import org.opendaylight.alto.core.northbound.route.${artifactId}.impl.AltoNorthboundRoute${classPrefix};

public class AltoNorthboundRoute${classPrefix}Module extends org.opendaylight.yang.gen.v1.urn.opendaylight.alto.core.northbound.route.${artifactId}.impl.rev151021.AbstractAltoNorthboundRoute${classPrefix}Module {
    public AltoNorthboundRoute${classPrefix}Module(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public AltoNorthboundRoute${classPrefix}Module(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.yang.gen.v1.urn.opendaylight.alto.core.northbound.route.${artifactId}.impl.rev151021.AltoNorthboundRoute${classPrefix}Module oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void customValidation() {
        // add custom validation form module attributes here.
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        AltoNorthboundRoute${classPrefix} ${artifactId} = new AltoNorthboundRoute${classPrefix}();
        getBrokerDependency().registerProvider(${artifactId});
        ${artifactId}.register(getAltoNorthboundRouterDependency());
        return ${artifactId};
    }

}

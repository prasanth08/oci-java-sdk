/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming;

import com.oracle.bmc.Service;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;

import javax.annotation.Nonnull;

public class StreamAsyncClientBuilder
        extends AbstractStreamBasedClientBuilder<StreamAsyncClientBuilder, StreamAsyncClient> {
    public StreamAsyncClientBuilder(Service service) {
        super(service);
    }

    @Override
    public StreamAsyncClient build(
            @Nonnull AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        if (authenticationDetailsProvider == null) {
            throw new NullPointerException(
                    "authenticationDetailsProvider is marked non-null but is null");
        }

        String cryptoEndpoint = getEndpoint();

        return new StreamAsyncClient(
                authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                requestSignerFactory,
                additionalClientConfigurators,
                cryptoEndpoint);
    }
}

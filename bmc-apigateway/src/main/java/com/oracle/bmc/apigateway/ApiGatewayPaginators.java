/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway;

import com.oracle.bmc.apigateway.requests.*;
import com.oracle.bmc.apigateway.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ApiGateway where multiple pages of data may be fetched. Two styles of
 * iteration are supported:
 *
 * <ul>
 *   <li>Iterating over the Response objects returned by the list operation. These are referred to
 *       as ResponseIterators, and the methods are suffixed with ResponseIterator. For example:
 *       <i>listUsersResponseIterator</i>
 *   <li>Iterating over the resources/records being listed. These are referred to as
 *       RecordIterators, and the methods are suffixed with RecordIterator. For example:
 *       <i>listUsersRecordIterator</i>
 * </ul>
 *
 * These iterables abstract away the need to write code to manually handle pagination via looping
 * and using the page tokens. They will automatically fetch more data from the service when
 * required.
 *
 * <p>As an example, if we were using the ListUsers operation in IdentityService, then the {@link
 * java.lang.Iterable} returned by calling a ResponseIterator method would iterate over the
 * ListUsersResponse objects returned by each ListUsers call, whereas the {@link java.lang.Iterable}
 * returned by calling a RecordIterator method would iterate over the User records and we don't have
 * to deal with ListUsersResponse objects at all. In either case, pagination will be automatically
 * handled so we can iterate until there are no more responses or no more resources/records
 * available.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
public class ApiGatewayPaginators {
    private final ApiGateway client;

    public ApiGatewayPaginators(ApiGateway client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listApis
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListApisResponse> listApisResponseIterator(final ListApisRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListApisRequest.builder().copy(request),
                ListApisResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listApis);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.apigateway.model.ApiSummary} objects contained in responses from the listApis
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.apigateway.model.ApiSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.apigateway.model.ApiSummary> listApisRecordIterator(
            final ListApisRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListApisRequest.builder().copy(request),
                ListApisResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listApis,
                response -> response.getApiCollection().getItems());
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listCertificates operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListCertificatesResponse> listCertificatesResponseIterator(
            final ListCertificatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListCertificatesRequest.builder().copy(request),
                ListCertificatesResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listCertificates);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.apigateway.model.CertificateSummary} objects contained in responses from the
     * listCertificates operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.apigateway.model.CertificateSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.apigateway.model.CertificateSummary>
            listCertificatesRecordIterator(final ListCertificatesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListCertificatesRequest.builder().copy(request),
                ListCertificatesResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listCertificates,
                response -> response.getCertificateCollection().getItems());
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSdkLanguageTypes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSdkLanguageTypesResponse> listSdkLanguageTypesResponseIterator(
            final ListSdkLanguageTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListSdkLanguageTypesRequest.builder().copy(request),
                ListSdkLanguageTypesResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listSdkLanguageTypes);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.apigateway.model.SdkLanguageTypeSummary} objects contained in responses from
     * the listSdkLanguageTypes operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.apigateway.model.SdkLanguageTypeSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.apigateway.model.SdkLanguageTypeSummary>
            listSdkLanguageTypesRecordIterator(final ListSdkLanguageTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListSdkLanguageTypesRequest.builder().copy(request),
                ListSdkLanguageTypesResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listSdkLanguageTypes,
                response -> response.getSdkLanguageTypeCollection().getItems());
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSdks
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSdksResponse> listSdksResponseIterator(final ListSdksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListSdksRequest.builder().copy(request),
                ListSdksResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listSdks);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.apigateway.model.SdkSummary} objects contained in responses from the listSdks
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.apigateway.model.SdkSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.apigateway.model.SdkSummary> listSdksRecordIterator(
            final ListSdksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListSdksRequest.builder().copy(request),
                ListSdksResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listSdks,
                response -> response.getSdkCollection().getItems());
    }
}

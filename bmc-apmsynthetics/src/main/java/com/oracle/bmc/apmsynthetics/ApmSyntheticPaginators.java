/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics;

import com.oracle.bmc.apmsynthetics.requests.*;
import com.oracle.bmc.apmsynthetics.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ApmSynthetic where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ApmSyntheticPaginators {
    private final ApmSynthetic client;

    public ApmSyntheticPaginators(ApmSynthetic client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listDedicatedVantagePoints operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListDedicatedVantagePointsResponse> listDedicatedVantagePointsResponseIterator(
            final ListDedicatedVantagePointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListDedicatedVantagePointsRequest.builder().copy(request),
                ListDedicatedVantagePointsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listDedicatedVantagePoints);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.apmsynthetics.model.DedicatedVantagePointSummary} objects contained in
     * responses from the listDedicatedVantagePoints operation. This iterable will fetch more data
     * from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.apmsynthetics.model.DedicatedVantagePointSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.apmsynthetics.model.DedicatedVantagePointSummary>
            listDedicatedVantagePointsRecordIterator(
                    final ListDedicatedVantagePointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListDedicatedVantagePointsRequest.builder().copy(request),
                ListDedicatedVantagePointsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listDedicatedVantagePoints,
                response -> response.getDedicatedVantagePointCollection().getItems());
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMonitors
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMonitorsResponse> listMonitorsResponseIterator(
            final ListMonitorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListMonitorsRequest.builder().copy(request),
                ListMonitorsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listMonitors);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.apmsynthetics.model.MonitorSummary} objects contained in responses from the
     * listMonitors operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.apmsynthetics.model.MonitorSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.apmsynthetics.model.MonitorSummary> listMonitorsRecordIterator(
            final ListMonitorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListMonitorsRequest.builder().copy(request),
                ListMonitorsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listMonitors,
                response -> response.getMonitorCollection().getItems());
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listPublicVantagePoints operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListPublicVantagePointsResponse> listPublicVantagePointsResponseIterator(
            final ListPublicVantagePointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListPublicVantagePointsRequest.builder().copy(request),
                ListPublicVantagePointsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listPublicVantagePoints);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.apmsynthetics.model.PublicVantagePointSummary} objects contained in responses
     * from the listPublicVantagePoints operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.apmsynthetics.model.PublicVantagePointSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.apmsynthetics.model.PublicVantagePointSummary>
            listPublicVantagePointsRecordIterator(final ListPublicVantagePointsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListPublicVantagePointsRequest.builder().copy(request),
                ListPublicVantagePointsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listPublicVantagePoints,
                response -> response.getPublicVantagePointCollection().getItems());
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listScripts
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListScriptsResponse> listScriptsResponseIterator(
            final ListScriptsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListScriptsRequest.builder().copy(request),
                ListScriptsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listScripts);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.apmsynthetics.model.ScriptSummary} objects contained in responses from the
     * listScripts operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.apmsynthetics.model.ScriptSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.apmsynthetics.model.ScriptSummary> listScriptsRecordIterator(
            final ListScriptsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListScriptsRequest.builder().copy(request),
                ListScriptsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listScripts,
                response -> response.getScriptCollection().getItems());
    }
}

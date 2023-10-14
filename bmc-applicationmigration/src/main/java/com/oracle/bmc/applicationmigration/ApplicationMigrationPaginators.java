/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration;

import com.oracle.bmc.applicationmigration.requests.*;
import com.oracle.bmc.applicationmigration.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ApplicationMigration where multiple pages of data may be fetched. Two
 * styles of iteration are supported:
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
public class ApplicationMigrationPaginators {
    private final ApplicationMigration client;

    public ApplicationMigrationPaginators(ApplicationMigration client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listMigrations
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListMigrationsResponse> listMigrationsResponseIterator(
            final ListMigrationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListMigrationsRequest.builder().copy(request),
                ListMigrationsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listMigrations);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.applicationmigration.model.MigrationSummary} objects contained in responses
     * from the listMigrations operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.applicationmigration.model.MigrationSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.applicationmigration.model.MigrationSummary>
            listMigrationsRecordIterator(final ListMigrationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListMigrationsRequest.builder().copy(request),
                ListMigrationsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listMigrations,
                ListMigrationsResponse::getItems);
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listSourceApplications operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSourceApplicationsResponse> listSourceApplicationsResponseIterator(
            final ListSourceApplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListSourceApplicationsRequest.builder().copy(request),
                ListSourceApplicationsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listSourceApplications);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.applicationmigration.model.SourceApplicationSummary} objects contained in
     * responses from the listSourceApplications operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.applicationmigration.model.SourceApplicationSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.applicationmigration.model.SourceApplicationSummary>
            listSourceApplicationsRecordIterator(final ListSourceApplicationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListSourceApplicationsRequest.builder().copy(request),
                ListSourceApplicationsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listSourceApplications,
                ListSourceApplicationsResponse::getItems);
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listSources
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListSourcesResponse> listSourcesResponseIterator(
            final ListSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListSourcesRequest.builder().copy(request),
                ListSourcesResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listSources);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.applicationmigration.model.SourceSummary} objects contained in responses from
     * the listSources operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.applicationmigration.model.SourceSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.applicationmigration.model.SourceSummary>
            listSourcesRecordIterator(final ListSourcesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListSourcesRequest.builder().copy(request),
                ListSourcesResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listSources,
                ListSourcesResponse::getItems);
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkRequestErrorsResponse> listWorkRequestErrorsResponseIterator(
            final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListWorkRequestErrorsRequest.builder().copy(request),
                ListWorkRequestErrorsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listWorkRequestErrors);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.applicationmigration.model.WorkRequestError} objects contained in responses
     * from the listWorkRequestErrors operation. This iterable will fetch more data from the server
     * as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.applicationmigration.model.WorkRequestError} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.applicationmigration.model.WorkRequestError>
            listWorkRequestErrorsRecordIterator(final ListWorkRequestErrorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListWorkRequestErrorsRequest.builder().copy(request),
                ListWorkRequestErrorsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listWorkRequestErrors,
                ListWorkRequestErrorsResponse::getItems);
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkRequestLogsResponse> listWorkRequestLogsResponseIterator(
            final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListWorkRequestLogsRequest.builder().copy(request),
                ListWorkRequestLogsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listWorkRequestLogs);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.applicationmigration.model.WorkRequestLogEntry} objects contained in responses
     * from the listWorkRequestLogs operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.applicationmigration.model.WorkRequestLogEntry} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.applicationmigration.model.WorkRequestLogEntry>
            listWorkRequestLogsRecordIterator(final ListWorkRequestLogsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListWorkRequestLogsRequest.builder().copy(request),
                ListWorkRequestLogsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listWorkRequestLogs,
                ListWorkRequestLogsResponse::getItems);
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListWorkRequestsResponse> listWorkRequestsResponseIterator(
            final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListWorkRequestsRequest.builder().copy(request),
                ListWorkRequestsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listWorkRequests);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.applicationmigration.model.WorkRequestSummary} objects contained in responses
     * from the listWorkRequests operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.applicationmigration.model.WorkRequestSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.applicationmigration.model.WorkRequestSummary>
            listWorkRequestsRecordIterator(final ListWorkRequestsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListWorkRequestsRequest.builder().copy(request),
                ListWorkRequestsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listWorkRequests,
                ListWorkRequestsResponse::getItems);
    }
}

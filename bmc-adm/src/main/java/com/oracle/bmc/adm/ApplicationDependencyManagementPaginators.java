/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm;

import com.oracle.bmc.adm.requests.*;
import com.oracle.bmc.adm.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ApplicationDependencyManagement where multiple pages of data may be
 * fetched. Two styles of iteration are supported:
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
public class ApplicationDependencyManagementPaginators {
    private final ApplicationDependencyManagement client;

    public ApplicationDependencyManagementPaginators(ApplicationDependencyManagement client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listApplicationDependencyVulnerabilities operation. This iterable will fetch more data from
     * the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListApplicationDependencyVulnerabilitiesResponse>
            listApplicationDependencyVulnerabilitiesResponseIterator(
                    final ListApplicationDependencyVulnerabilitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListApplicationDependencyVulnerabilitiesRequest.builder()
                        .copy(request),
                ListApplicationDependencyVulnerabilitiesResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listApplicationDependencyVulnerabilities);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.adm.model.ApplicationDependencyVulnerabilitySummary} objects contained in
     * responses from the listApplicationDependencyVulnerabilities operation. This iterable will
     * fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.adm.model.ApplicationDependencyVulnerabilitySummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.adm.model.ApplicationDependencyVulnerabilitySummary>
            listApplicationDependencyVulnerabilitiesRecordIterator(
                    final ListApplicationDependencyVulnerabilitiesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListApplicationDependencyVulnerabilitiesRequest.builder()
                        .copy(request),
                ListApplicationDependencyVulnerabilitiesResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listApplicationDependencyVulnerabilities,
                response -> response.getApplicationDependencyVulnerabilityCollection()
                        .getItems());
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listKnowledgeBases operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListKnowledgeBasesResponse> listKnowledgeBasesResponseIterator(
            final ListKnowledgeBasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListKnowledgeBasesRequest.builder().copy(request),
                response -> response.getOpcNextPage(),
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listKnowledgeBases);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.adm.model.KnowledgeBaseSummary} objects contained in responses from the
     * listKnowledgeBases operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.adm.model.KnowledgeBaseSummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.adm.model.KnowledgeBaseSummary> listKnowledgeBasesRecordIterator(
            final ListKnowledgeBasesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListKnowledgeBasesRequest.builder().copy(request),
                response -> response.getOpcNextPage(),
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listKnowledgeBases,
                response -> response.getKnowledgeBaseCollection().getItems());
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listVulnerabilityAudits operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListVulnerabilityAuditsResponse> listVulnerabilityAuditsResponseIterator(
            final ListVulnerabilityAuditsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListVulnerabilityAuditsRequest.builder().copy(request),
                ListVulnerabilityAuditsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listVulnerabilityAudits);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.adm.model.VulnerabilityAuditSummary} objects contained in responses from the
     * listVulnerabilityAudits operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.adm.model.VulnerabilityAuditSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.adm.model.VulnerabilityAuditSummary>
            listVulnerabilityAuditsRecordIterator(final ListVulnerabilityAuditsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListVulnerabilityAuditsRequest.builder().copy(request),
                ListVulnerabilityAuditsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listVulnerabilityAudits,
                response -> response.getVulnerabilityAuditCollection().getItems());
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
     * com.oracle.bmc.adm.model.WorkRequestError} objects contained in responses from the
     * listWorkRequestErrors operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.adm.model.WorkRequestError} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.adm.model.WorkRequestError> listWorkRequestErrorsRecordIterator(
            final ListWorkRequestErrorsRequest request) {
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
                response -> response.getWorkRequestErrorCollection().getItems());
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
     * com.oracle.bmc.adm.model.WorkRequestLogEntry} objects contained in responses from the
     * listWorkRequestLogs operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.adm.model.WorkRequestLogEntry} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.adm.model.WorkRequestLogEntry> listWorkRequestLogsRecordIterator(
            final ListWorkRequestLogsRequest request) {
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
                response -> response.getWorkRequestLogEntryCollection().getItems());
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
     * com.oracle.bmc.adm.model.WorkRequestSummary} objects contained in responses from the
     * listWorkRequests operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.adm.model.WorkRequestSummary} objects contained in responses received from
     *     the service.
     */
    public Iterable<com.oracle.bmc.adm.model.WorkRequestSummary> listWorkRequestsRecordIterator(
            final ListWorkRequestsRequest request) {
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
                response -> response.getWorkRequestSummaryCollection().getItems());
    }
}

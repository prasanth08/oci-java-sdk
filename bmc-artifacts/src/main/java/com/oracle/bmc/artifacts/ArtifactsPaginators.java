/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts;

import com.oracle.bmc.artifacts.requests.*;
import com.oracle.bmc.artifacts.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Artifacts where multiple pages of data may be fetched. Two styles of
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ArtifactsPaginators {
    private final Artifacts client;

    public ArtifactsPaginators(Artifacts client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listContainerImageSignatures operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListContainerImageSignaturesResponse>
            listContainerImageSignaturesResponseIterator(
                    final ListContainerImageSignaturesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListContainerImageSignaturesRequest.builder().copy(request),
                ListContainerImageSignaturesResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listContainerImageSignatures);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.artifacts.model.ContainerImageSignatureSummary} objects contained in responses
     * from the listContainerImageSignatures operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.artifacts.model.ContainerImageSignatureSummary} objects contained in
     *     responses received from the service.
     */
    public Iterable<com.oracle.bmc.artifacts.model.ContainerImageSignatureSummary>
            listContainerImageSignaturesRecordIterator(
                    final ListContainerImageSignaturesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListContainerImageSignaturesRequest.builder().copy(request),
                ListContainerImageSignaturesResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listContainerImageSignatures,
                response -> response.getContainerImageSignatureCollection().getItems());
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listContainerImages operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListContainerImagesResponse> listContainerImagesResponseIterator(
            final ListContainerImagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListContainerImagesRequest.builder().copy(request),
                ListContainerImagesResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listContainerImages);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.artifacts.model.ContainerImageSummary} objects contained in responses from the
     * listContainerImages operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.artifacts.model.ContainerImageSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.artifacts.model.ContainerImageSummary>
            listContainerImagesRecordIterator(final ListContainerImagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListContainerImagesRequest.builder().copy(request),
                ListContainerImagesResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listContainerImages,
                response -> response.getContainerImageCollection().getItems());
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listContainerRepositories operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListContainerRepositoriesResponse> listContainerRepositoriesResponseIterator(
            final ListContainerRepositoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListContainerRepositoriesRequest.builder().copy(request),
                ListContainerRepositoriesResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listContainerRepositories);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.artifacts.model.ContainerRepositorySummary} objects contained in responses
     * from the listContainerRepositories operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.artifacts.model.ContainerRepositorySummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.artifacts.model.ContainerRepositorySummary>
            listContainerRepositoriesRecordIterator(
                    final ListContainerRepositoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListContainerRepositoriesRequest.builder().copy(request),
                ListContainerRepositoriesResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listContainerRepositories,
                response -> response.getContainerRepositoryCollection().getItems());
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listGenericArtifacts operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListGenericArtifactsResponse> listGenericArtifactsResponseIterator(
            final ListGenericArtifactsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListGenericArtifactsRequest.builder().copy(request),
                ListGenericArtifactsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listGenericArtifacts);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.artifacts.model.GenericArtifactSummary} objects contained in responses from
     * the listGenericArtifacts operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.artifacts.model.GenericArtifactSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.artifacts.model.GenericArtifactSummary>
            listGenericArtifactsRecordIterator(final ListGenericArtifactsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListGenericArtifactsRequest.builder().copy(request),
                ListGenericArtifactsResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listGenericArtifacts,
                response -> response.getGenericArtifactCollection().getItems());
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listRepositories operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListRepositoriesResponse> listRepositoriesResponseIterator(
            final ListRepositoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<>(
                () -> ListRepositoriesRequest.builder().copy(request),
                ListRepositoriesResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listRepositories);
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.artifacts.model.RepositorySummary} objects contained in responses from the
     * listRepositories operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.artifacts.model.RepositorySummary} objects contained in responses received
     *     from the service.
     */
    public Iterable<com.oracle.bmc.artifacts.model.RepositorySummary>
            listRepositoriesRecordIterator(final ListRepositoriesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<>(
                () -> ListRepositoriesRequest.builder().copy(request),
                ListRepositoriesResponse::getOpcNextPage,
                input -> {
                    if (input.getNextPageToken() == null) {
                        return input.getRequestBuilder().build();
                    } else {
                        return input.getRequestBuilder()
                                .page(input.getNextPageToken().orElse(null))
                                .build();
                    }
                },
                client::listRepositories,
                response -> response.getRepositoryCollection().getItems());
    }
}

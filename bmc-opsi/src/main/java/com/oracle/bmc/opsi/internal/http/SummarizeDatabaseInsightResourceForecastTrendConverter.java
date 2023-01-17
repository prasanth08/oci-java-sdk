/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.opsi.model.*;
import com.oracle.bmc.opsi.requests.*;
import com.oracle.bmc.opsi.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class SummarizeDatabaseInsightResourceForecastTrendConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(
                    SummarizeDatabaseInsightResourceForecastTrendConverter.class);

    public static com.oracle.bmc.opsi.requests.SummarizeDatabaseInsightResourceForecastTrendRequest
            interceptRequest(
                    com.oracle.bmc.opsi.requests
                                    .SummarizeDatabaseInsightResourceForecastTrendRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.opsi.requests.SummarizeDatabaseInsightResourceForecastTrendRequest
                    request) {
        Validate.notNull(request, "request instance is required");
        Validate.notNull(request.getCompartmentId(), "compartmentId is required");
        Validate.notNull(request.getResourceMetric(), "resourceMetric is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20200630")
                        .path("databaseInsights")
                        .path("resourceForecastTrend");

        target =
                target.queryParam(
                        "compartmentId",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getCompartmentId()));

        target =
                target.queryParam(
                        "resourceMetric",
                        com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                request.getResourceMetric()));

        if (request.getAnalysisTimeInterval() != null) {
            target =
                    target.queryParam(
                            "analysisTimeInterval",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getAnalysisTimeInterval()));
        }

        if (request.getTimeIntervalStart() != null) {
            target =
                    target.queryParam(
                            "timeIntervalStart",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTimeIntervalStart()));
        }

        if (request.getTimeIntervalEnd() != null) {
            target =
                    target.queryParam(
                            "timeIntervalEnd",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTimeIntervalEnd()));
        }

        if (request.getDatabaseType() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "databaseType",
                            request.getDatabaseType(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getDatabaseId() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "databaseId",
                            request.getDatabaseId(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getId() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "id",
                            request.getId(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getExadataInsightId() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "exadataInsightId",
                            request.getExadataInsightId(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getCdbName() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "cdbName",
                            request.getCdbName(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getStatistic() != null) {
            target =
                    target.queryParam(
                            "statistic",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getStatistic().getValue()));
        }

        if (request.getForecastDays() != null) {
            target =
                    target.queryParam(
                            "forecastDays",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getForecastDays()));
        }

        if (request.getForecastModel() != null) {
            target =
                    target.queryParam(
                            "forecastModel",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getForecastModel().getValue()));
        }

        if (request.getUtilizationLevel() != null) {
            target =
                    target.queryParam(
                            "utilizationLevel",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getUtilizationLevel().getValue()));
        }

        if (request.getConfidence() != null) {
            target =
                    target.queryParam(
                            "confidence",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getConfidence()));
        }

        if (request.getPage() != null) {
            target =
                    target.queryParam(
                            "page",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getPage()));
        }

        if (request.getHostName() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "hostName",
                            request.getHostName(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getTablespaceName() != null) {
            target =
                    target.queryParam(
                            "tablespaceName",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getTablespaceName()));
        }

        if (request.getIsDatabaseInstanceLevelMetrics() != null) {
            target =
                    target.queryParam(
                            "isDatabaseInstanceLevelMetrics",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getIsDatabaseInstanceLevelMetrics()));
        }

        if (request.getDefinedTagEquals() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "definedTagEquals",
                            request.getDefinedTagEquals(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getFreeformTagEquals() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "freeformTagEquals",
                            request.getFreeformTagEquals(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getDefinedTagExists() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "definedTagExists",
                            request.getDefinedTagExists(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getFreeformTagExists() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "freeformTagExists",
                            request.getFreeformTagExists(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        if (request.getCompartmentIdInSubtree() != null) {
            target =
                    target.queryParam(
                            "compartmentIdInSubtree",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getCompartmentIdInSubtree()));
        }

        if (request.getVmclusterName() != null) {
            target =
                    com.oracle.bmc.util.internal.HttpUtils.encodeCollectionFormatQueryParam(
                            target,
                            "vmclusterName",
                            request.getVmclusterName(),
                            com.oracle.bmc.util.internal.CollectionFormatType.Multi);
        }

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.opsi.responses
                            .SummarizeDatabaseInsightResourceForecastTrendResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.opsi.responses
                            .SummarizeDatabaseInsightResourceForecastTrendResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.opsi.responses
                                .SummarizeDatabaseInsightResourceForecastTrendResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.opsi.responses
                                        .SummarizeDatabaseInsightResourceForecastTrendResponse>() {
                            @Override
                            public com.oracle.bmc.opsi.responses
                                            .SummarizeDatabaseInsightResourceForecastTrendResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.opsi.responses.SummarizeDatabaseInsightResourceForecastTrendResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.opsi.model
                                                                .SummarizeDatabaseInsightResourceForecastTrendAggregation>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.opsi.model
                                                                    .SummarizeDatabaseInsightResourceForecastTrendAggregation
                                                            .class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    com.oracle.bmc.opsi.model
                                                                    .SummarizeDatabaseInsightResourceForecastTrendAggregation
                                                            .class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.opsi.model
                                                        .SummarizeDatabaseInsightResourceForecastTrendAggregation>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.opsi.responses
                                                .SummarizeDatabaseInsightResourceForecastTrendResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.opsi.responses
                                                        .SummarizeDatabaseInsightResourceForecastTrendResponse
                                                        .builder()
                                                        .__httpStatusCode__(rawResponse.getStatus())
                                                        .headers(headers);

                                builder.summarizeDatabaseInsightResourceForecastTrendAggregation(
                                        response.getItem());

                                java.util.Optional<java.util.List<String>> opcRequestIdHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                java.util.Optional<java.util.List<String>> opcNextPageHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(
                                                headers, "opc-next-page");
                                if (opcNextPageHeader.isPresent()) {
                                    builder.opcNextPage(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-next-page",
                                                    opcNextPageHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.opsi.responses
                                                .SummarizeDatabaseInsightResourceForecastTrendResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}

/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.requests;

import com.oracle.bmc.dataflow.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataflow/ListStatementsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListStatementsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
public class ListStatementsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The unique ID for the run */
    private String runId;

    /** The unique ID for the run */
    public String getRunId() {
        return runId;
    }
    /** The LifecycleState of the statement. */
    private com.oracle.bmc.dataflow.model.StatementLifecycleState lifecycleState;

    /** The LifecycleState of the statement. */
    public com.oracle.bmc.dataflow.model.StatementLifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** The field used to sort the results. Multiple fields are not supported. */
    private SortBy sortBy;

    /** The field used to sort the results. Multiple fields are not supported. */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    /** The field used to sort the results. Multiple fields are not supported. */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The ordering of results in ascending or descending order. */
    private SortOrder sortOrder;

    /** The ordering of results in ascending or descending order. */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    /** The ordering of results in ascending or descending order. */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /** The maximum number of results to return in a paginated {@code List} call. */
    private Integer limit;

    /** The maximum number of results to return in a paginated {@code List} call. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The value of the {@code opc-next-page} or {@code opc-prev-page} response header from the last
     * {@code List} call to sent back to server for getting the next page of results.
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} or {@code opc-prev-page} response header from the last
     * {@code List} call to sent back to server for getting the next page of results.
     */
    public String getPage() {
        return page;
    }
    /**
     * Unique identifier for the request. If provided, the returned request ID will include this
     * value. Otherwise, a random request ID will be generated by the service.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If provided, the returned request ID will include this
     * value. Otherwise, a random request ID will be generated by the service.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListStatementsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The unique ID for the run */
        private String runId = null;

        /**
         * The unique ID for the run
         *
         * @param runId the value to set
         * @return this builder instance
         */
        public Builder runId(String runId) {
            this.runId = runId;
            return this;
        }

        /** The LifecycleState of the statement. */
        private com.oracle.bmc.dataflow.model.StatementLifecycleState lifecycleState = null;

        /**
         * The LifecycleState of the statement.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.dataflow.model.StatementLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** The field used to sort the results. Multiple fields are not supported. */
        private SortBy sortBy = null;

        /**
         * The field used to sort the results. Multiple fields are not supported.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The ordering of results in ascending or descending order. */
        private SortOrder sortOrder = null;

        /**
         * The ordering of results in ascending or descending order.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** The maximum number of results to return in a paginated {@code List} call. */
        private Integer limit = null;

        /**
         * The maximum number of results to return in a paginated {@code List} call.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} or {@code opc-prev-page} response header from the
         * last {@code List} call to sent back to server for getting the next page of results.
         */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} or {@code opc-prev-page} response header from the
         * last {@code List} call to sent back to server for getting the next page of results.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Unique identifier for the request. If provided, the returned request ID will include this
         * value. Otherwise, a random request ID will be generated by the service.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If provided, the returned request ID will include this
         * value. Otherwise, a random request ID will be generated by the service.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(ListStatementsRequest o) {
            runId(o.getRunId());
            lifecycleState(o.getLifecycleState());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListStatementsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListStatementsRequest
         */
        public ListStatementsRequest build() {
            ListStatementsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListStatementsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListStatementsRequest
         */
        public ListStatementsRequest buildWithoutInvocationCallback() {
            ListStatementsRequest request = new ListStatementsRequest();
            request.runId = runId;
            request.lifecycleState = lifecycleState;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListStatementsRequest(runId, lifecycleState, sortBy, sortOrder, limit, page,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .runId(runId)
                .lifecycleState(lifecycleState)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",runId=").append(String.valueOf(this.runId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListStatementsRequest)) {
            return false;
        }

        ListStatementsRequest other = (ListStatementsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.runId, other.runId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.runId == null ? 43 : this.runId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

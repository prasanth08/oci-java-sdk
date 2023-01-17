/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.requests;

import com.oracle.bmc.dataflow.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataflow/ListRunsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListRunsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
public class ListRunsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the compartment. */
    private String compartmentId;

    /** The OCID of the compartment. */
    public String getCompartmentId() {
        return compartmentId;
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
    /** The ID of the application. */
    private String applicationId;

    /** The ID of the application. */
    public String getApplicationId() {
        return applicationId;
    }
    /** The OCID of the user who created the resource. */
    private String ownerPrincipalId;

    /** The OCID of the user who created the resource. */
    public String getOwnerPrincipalId() {
        return ownerPrincipalId;
    }
    /** The displayName prefix. */
    private String displayNameStartsWith;

    /** The displayName prefix. */
    public String getDisplayNameStartsWith() {
        return displayNameStartsWith;
    }
    /** The LifecycleState of the run. */
    private com.oracle.bmc.dataflow.model.RunLifecycleState lifecycleState;

    /** The LifecycleState of the run. */
    public com.oracle.bmc.dataflow.model.RunLifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** The epoch time that the resource was created. */
    private java.util.Date timeCreatedGreaterThan;

    /** The epoch time that the resource was created. */
    public java.util.Date getTimeCreatedGreaterThan() {
        return timeCreatedGreaterThan;
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
    /** The field used to sort the results. Multiple fields are not supported. */
    private SortBy sortBy;

    /** The field used to sort the results. Multiple fields are not supported. */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
        Language("language"),
        RunDurationInMilliseconds("runDurationInMilliseconds"),
        LifecycleState("lifecycleState"),
        TotalOCpu("totalOCpu"),
        DataReadInBytes("dataReadInBytes"),
        DataWrittenInBytes("dataWrittenInBytes"),
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
    /** The query parameter for the Spark application name. */
    private String displayName;

    /** The query parameter for the Spark application name. */
    public String getDisplayName() {
        return displayName;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<ListRunsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the compartment. */
        private String compartmentId = null;

        /**
         * The OCID of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
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

        /** The ID of the application. */
        private String applicationId = null;

        /**
         * The ID of the application.
         *
         * @param applicationId the value to set
         * @return this builder instance
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /** The OCID of the user who created the resource. */
        private String ownerPrincipalId = null;

        /**
         * The OCID of the user who created the resource.
         *
         * @param ownerPrincipalId the value to set
         * @return this builder instance
         */
        public Builder ownerPrincipalId(String ownerPrincipalId) {
            this.ownerPrincipalId = ownerPrincipalId;
            return this;
        }

        /** The displayName prefix. */
        private String displayNameStartsWith = null;

        /**
         * The displayName prefix.
         *
         * @param displayNameStartsWith the value to set
         * @return this builder instance
         */
        public Builder displayNameStartsWith(String displayNameStartsWith) {
            this.displayNameStartsWith = displayNameStartsWith;
            return this;
        }

        /** The LifecycleState of the run. */
        private com.oracle.bmc.dataflow.model.RunLifecycleState lifecycleState = null;

        /**
         * The LifecycleState of the run.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.dataflow.model.RunLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** The epoch time that the resource was created. */
        private java.util.Date timeCreatedGreaterThan = null;

        /**
         * The epoch time that the resource was created.
         *
         * @param timeCreatedGreaterThan the value to set
         * @return this builder instance
         */
        public Builder timeCreatedGreaterThan(java.util.Date timeCreatedGreaterThan) {
            this.timeCreatedGreaterThan = timeCreatedGreaterThan;
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

        /** The query parameter for the Spark application name. */
        private String displayName = null;

        /**
         * The query parameter for the Spark application name.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
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
        public Builder copy(ListRunsRequest o) {
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            applicationId(o.getApplicationId());
            ownerPrincipalId(o.getOwnerPrincipalId());
            displayNameStartsWith(o.getDisplayNameStartsWith());
            lifecycleState(o.getLifecycleState());
            timeCreatedGreaterThan(o.getTimeCreatedGreaterThan());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            displayName(o.getDisplayName());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListRunsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListRunsRequest
         */
        public ListRunsRequest build() {
            ListRunsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListRunsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListRunsRequest
         */
        public ListRunsRequest buildWithoutInvocationCallback() {
            ListRunsRequest request = new ListRunsRequest();
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.applicationId = applicationId;
            request.ownerPrincipalId = ownerPrincipalId;
            request.displayNameStartsWith = displayNameStartsWith;
            request.lifecycleState = lifecycleState;
            request.timeCreatedGreaterThan = timeCreatedGreaterThan;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.displayName = displayName;
            return request;
            // new ListRunsRequest(compartmentId, opcRequestId, applicationId, ownerPrincipalId,
            // displayNameStartsWith, lifecycleState, timeCreatedGreaterThan, limit, page, sortBy,
            // sortOrder, displayName);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .opcRequestId(opcRequestId)
                .applicationId(applicationId)
                .ownerPrincipalId(ownerPrincipalId)
                .displayNameStartsWith(displayNameStartsWith)
                .lifecycleState(lifecycleState)
                .timeCreatedGreaterThan(timeCreatedGreaterThan)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .displayName(displayName);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",applicationId=").append(String.valueOf(this.applicationId));
        sb.append(",ownerPrincipalId=").append(String.valueOf(this.ownerPrincipalId));
        sb.append(",displayNameStartsWith=").append(String.valueOf(this.displayNameStartsWith));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",timeCreatedGreaterThan=").append(String.valueOf(this.timeCreatedGreaterThan));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListRunsRequest)) {
            return false;
        }

        ListRunsRequest other = (ListRunsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.applicationId, other.applicationId)
                && java.util.Objects.equals(this.ownerPrincipalId, other.ownerPrincipalId)
                && java.util.Objects.equals(this.displayNameStartsWith, other.displayNameStartsWith)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.timeCreatedGreaterThan, other.timeCreatedGreaterThan)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.displayName, other.displayName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationId == null ? 43 : this.applicationId.hashCode());
        result =
                (result * PRIME)
                        + (this.ownerPrincipalId == null ? 43 : this.ownerPrincipalId.hashCode());
        result =
                (result * PRIME)
                        + (this.displayNameStartsWith == null
                                ? 43
                                : this.displayNameStartsWith.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedGreaterThan == null
                                ? 43
                                : this.timeCreatedGreaterThan.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        return result;
    }
}

/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/ListDeploymentsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListDeploymentsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class ListDeploymentsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ID of the parent pipeline.
     */
    private String deployPipelineId;

    /**
     * The ID of the parent pipeline.
     */
    public String getDeployPipelineId() {
        return deployPipelineId;
    }
    /**
     * Unique identifier or OCID for listing a single resource by ID.
     */
    private String id;

    /**
     * Unique identifier or OCID for listing a single resource by ID.
     */
    public String getId() {
        return id;
    }
    /**
     * The OCID of the compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * The OCID of the compartment in which to list resources.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * unique project identifier
     */
    private String projectId;

    /**
     * unique project identifier
     */
    public String getProjectId() {
        return projectId;
    }
    /**
     * A filter to return only Deployments that matches the given lifecycleState.
     */
    private com.oracle.bmc.devops.model.Deployment.LifecycleState lifecycleState;

    /**
     * A filter to return only Deployments that matches the given lifecycleState.
     */
    public com.oracle.bmc.devops.model.Deployment.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter to return only resources that match the entire display name given.
     */
    private String displayName;

    /**
     * A filter to return only resources that match the entire display name given.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The maximum number of items to return.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use. Use either ascending or descending.
     */
    private com.oracle.bmc.devops.model.SortOrder sortOrder;

    /**
     * The sort order to use. Use either ascending or descending.
     */
    public com.oracle.bmc.devops.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for time created is descending. Default order for display name is ascending. If no value is specified, then the default time created value is considered.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for time created is descending. Default order for display name is ascending. If no value is specified, then the default time created value is considered.
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
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

    /**
     * The field to sort by. Only one sort order may be provided. Default order for time created is descending. Default order for display name is ascending. If no value is specified, then the default time created value is considered.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Search for DevOps resources that were created before a specific date. Specifying this parameter corresponding to {@code timeCreatedLessThan} parameter will retrieve all assessments created before the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     */
    private java.util.Date timeCreatedLessThan;

    /**
     * Search for DevOps resources that were created before a specific date. Specifying this parameter corresponding to {@code timeCreatedLessThan} parameter will retrieve all assessments created before the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     */
    public java.util.Date getTimeCreatedLessThan() {
        return timeCreatedLessThan;
    }
    /**
     * Search for DevOps resources that were created after a specific date. Specifying this parameter corresponding to {@code timeCreatedGreaterThanOrEqualTo} parameter will retrieve all security assessments created after the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     */
    private java.util.Date timeCreatedGreaterThanOrEqualTo;

    /**
     * Search for DevOps resources that were created after a specific date. Specifying this parameter corresponding to {@code timeCreatedGreaterThanOrEqualTo} parameter will retrieve all security assessments created after the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     */
    public java.util.Date getTimeCreatedGreaterThanOrEqualTo() {
        return timeCreatedGreaterThanOrEqualTo;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDeploymentsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The ID of the parent pipeline.
         */
        private String deployPipelineId = null;

        /**
         * The ID of the parent pipeline.
         * @param deployPipelineId the value to set
         * @return this builder instance
         */
        public Builder deployPipelineId(String deployPipelineId) {
            this.deployPipelineId = deployPipelineId;
            return this;
        }

        /**
         * Unique identifier or OCID for listing a single resource by ID.
         */
        private String id = null;

        /**
         * Unique identifier or OCID for listing a single resource by ID.
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * The OCID of the compartment in which to list resources.
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment in which to list resources.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * unique project identifier
         */
        private String projectId = null;

        /**
         * unique project identifier
         * @param projectId the value to set
         * @return this builder instance
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * A filter to return only Deployments that matches the given lifecycleState.
         */
        private com.oracle.bmc.devops.model.Deployment.LifecycleState lifecycleState = null;

        /**
         * A filter to return only Deployments that matches the given lifecycleState.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.devops.model.Deployment.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * A filter to return only resources that match the entire display name given.
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The maximum number of items to return.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to use. Use either ascending or descending.
         */
        private com.oracle.bmc.devops.model.SortOrder sortOrder = null;

        /**
         * The sort order to use. Use either ascending or descending.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.devops.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for time created is descending. Default order for display name is ascending. If no value is specified, then the default time created value is considered.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for time created is descending. Default order for display name is ascending. If no value is specified, then the default time created value is considered.
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Search for DevOps resources that were created before a specific date. Specifying this parameter corresponding to {@code timeCreatedLessThan} parameter will retrieve all assessments created before the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         */
        private java.util.Date timeCreatedLessThan = null;

        /**
         * Search for DevOps resources that were created before a specific date. Specifying this parameter corresponding to {@code timeCreatedLessThan} parameter will retrieve all assessments created before the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         * @param timeCreatedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeCreatedLessThan(java.util.Date timeCreatedLessThan) {
            this.timeCreatedLessThan = timeCreatedLessThan;
            return this;
        }

        /**
         * Search for DevOps resources that were created after a specific date. Specifying this parameter corresponding to {@code timeCreatedGreaterThanOrEqualTo} parameter will retrieve all security assessments created after the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         */
        private java.util.Date timeCreatedGreaterThanOrEqualTo = null;

        /**
         * Search for DevOps resources that were created after a specific date. Specifying this parameter corresponding to {@code timeCreatedGreaterThanOrEqualTo} parameter will retrieve all security assessments created after the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         * @param timeCreatedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeCreatedGreaterThanOrEqualTo(
                java.util.Date timeCreatedGreaterThanOrEqualTo) {
            this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
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
         * @return this builder instance
         */
        public Builder copy(ListDeploymentsRequest o) {
            deployPipelineId(o.getDeployPipelineId());
            id(o.getId());
            compartmentId(o.getCompartmentId());
            projectId(o.getProjectId());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            timeCreatedLessThan(o.getTimeCreatedLessThan());
            timeCreatedGreaterThanOrEqualTo(o.getTimeCreatedGreaterThanOrEqualTo());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDeploymentsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListDeploymentsRequest
         */
        public ListDeploymentsRequest build() {
            ListDeploymentsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDeploymentsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDeploymentsRequest
         */
        public ListDeploymentsRequest buildWithoutInvocationCallback() {
            ListDeploymentsRequest request = new ListDeploymentsRequest();
            request.deployPipelineId = deployPipelineId;
            request.id = id;
            request.compartmentId = compartmentId;
            request.projectId = projectId;
            request.lifecycleState = lifecycleState;
            request.displayName = displayName;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            request.timeCreatedLessThan = timeCreatedLessThan;
            request.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            return request;
            // new ListDeploymentsRequest(deployPipelineId, id, compartmentId, projectId, lifecycleState, displayName, limit, page, sortOrder, sortBy, opcRequestId, timeCreatedLessThan, timeCreatedGreaterThanOrEqualTo);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .deployPipelineId(deployPipelineId)
                .id(id)
                .compartmentId(compartmentId)
                .projectId(projectId)
                .lifecycleState(lifecycleState)
                .displayName(displayName)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId)
                .timeCreatedLessThan(timeCreatedLessThan)
                .timeCreatedGreaterThanOrEqualTo(timeCreatedGreaterThanOrEqualTo);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",deployPipelineId=").append(String.valueOf(this.deployPipelineId));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",projectId=").append(String.valueOf(this.projectId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",timeCreatedLessThan=").append(String.valueOf(this.timeCreatedLessThan));
        sb.append(",timeCreatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeCreatedGreaterThanOrEqualTo));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDeploymentsRequest)) {
            return false;
        }

        ListDeploymentsRequest other = (ListDeploymentsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.deployPipelineId, other.deployPipelineId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.timeCreatedLessThan, other.timeCreatedLessThan)
                && java.util.Objects.equals(
                        this.timeCreatedGreaterThanOrEqualTo,
                        other.timeCreatedGreaterThanOrEqualTo);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.deployPipelineId == null ? 43 : this.deployPipelineId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedLessThan == null
                                ? 43
                                : this.timeCreatedLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeCreatedGreaterThanOrEqualTo.hashCode());
        return result;
    }
}

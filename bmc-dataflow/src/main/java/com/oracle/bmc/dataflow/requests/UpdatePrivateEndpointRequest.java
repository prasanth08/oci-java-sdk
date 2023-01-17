/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.requests;

import com.oracle.bmc.dataflow.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataflow/UpdatePrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdatePrivateEndpointRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
public class UpdatePrivateEndpointRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dataflow.model.UpdatePrivateEndpointDetails> {

    /**
     * Details for updating a private endpoint.
     *
     */
    private com.oracle.bmc.dataflow.model.UpdatePrivateEndpointDetails updatePrivateEndpointDetails;

    /**
     * Details for updating a private endpoint.
     *
     */
    public com.oracle.bmc.dataflow.model.UpdatePrivateEndpointDetails
            getUpdatePrivateEndpointDetails() {
        return updatePrivateEndpointDetails;
    }
    /**
     * The unique ID for a private endpoint.
     *
     */
    private String privateEndpointId;

    /**
     * The unique ID for a private endpoint.
     *
     */
    public String getPrivateEndpointId() {
        return privateEndpointId;
    }
    /**
     * Unique identifier for the request. If provided, the returned request ID will include this value.
     * Otherwise, a random request ID will be generated by the service.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If provided, the returned request ID will include this value.
     * Otherwise, a random request ID will be generated by the service.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource,
     * set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource,
     * set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dataflow.model.UpdatePrivateEndpointDetails getBody$() {
        return updatePrivateEndpointDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdatePrivateEndpointRequest,
                    com.oracle.bmc.dataflow.model.UpdatePrivateEndpointDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Details for updating a private endpoint.
         *
         */
        private com.oracle.bmc.dataflow.model.UpdatePrivateEndpointDetails
                updatePrivateEndpointDetails = null;

        /**
         * Details for updating a private endpoint.
         *
         * @param updatePrivateEndpointDetails the value to set
         * @return this builder instance
         */
        public Builder updatePrivateEndpointDetails(
                com.oracle.bmc.dataflow.model.UpdatePrivateEndpointDetails
                        updatePrivateEndpointDetails) {
            this.updatePrivateEndpointDetails = updatePrivateEndpointDetails;
            return this;
        }

        /**
         * The unique ID for a private endpoint.
         *
         */
        private String privateEndpointId = null;

        /**
         * The unique ID for a private endpoint.
         *
         * @param privateEndpointId the value to set
         * @return this builder instance
         */
        public Builder privateEndpointId(String privateEndpointId) {
            this.privateEndpointId = privateEndpointId;
            return this;
        }

        /**
         * Unique identifier for the request. If provided, the returned request ID will include this value.
         * Otherwise, a random request ID will be generated by the service.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If provided, the returned request ID will include this value.
         * Otherwise, a random request ID will be generated by the service.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource,
         * set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource,
         * set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdatePrivateEndpointRequest o) {
            updatePrivateEndpointDetails(o.getUpdatePrivateEndpointDetails());
            privateEndpointId(o.getPrivateEndpointId());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdatePrivateEndpointRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdatePrivateEndpointRequest
         */
        public UpdatePrivateEndpointRequest build() {
            UpdatePrivateEndpointRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.dataflow.model.UpdatePrivateEndpointDetails body) {
            updatePrivateEndpointDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdatePrivateEndpointRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdatePrivateEndpointRequest
         */
        public UpdatePrivateEndpointRequest buildWithoutInvocationCallback() {
            UpdatePrivateEndpointRequest request = new UpdatePrivateEndpointRequest();
            request.updatePrivateEndpointDetails = updatePrivateEndpointDetails;
            request.privateEndpointId = privateEndpointId;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdatePrivateEndpointRequest(updatePrivateEndpointDetails, privateEndpointId, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .updatePrivateEndpointDetails(updatePrivateEndpointDetails)
                .privateEndpointId(privateEndpointId)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",updatePrivateEndpointDetails=")
                .append(String.valueOf(this.updatePrivateEndpointDetails));
        sb.append(",privateEndpointId=").append(String.valueOf(this.privateEndpointId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePrivateEndpointRequest)) {
            return false;
        }

        UpdatePrivateEndpointRequest other = (UpdatePrivateEndpointRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.updatePrivateEndpointDetails, other.updatePrivateEndpointDetails)
                && java.util.Objects.equals(this.privateEndpointId, other.privateEndpointId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.updatePrivateEndpointDetails == null
                                ? 43
                                : this.updatePrivateEndpointDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointId == null ? 43 : this.privateEndpointId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}

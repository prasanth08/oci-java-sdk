/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateOnPremConnectorExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateOnPremConnectorRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class UpdateOnPremConnectorRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.UpdateOnPremConnectorDetails> {

    /**
     * The OCID of the on-premises connector.
     */
    private String onPremConnectorId;

    /**
     * The OCID of the on-premises connector.
     */
    public String getOnPremConnectorId() {
        return onPremConnectorId;
    }
    /**
     * The details used to update a on-premises connector.
     */
    private com.oracle.bmc.datasafe.model.UpdateOnPremConnectorDetails updateOnPremConnectorDetails;

    /**
     * The details used to update a on-premises connector.
     */
    public com.oracle.bmc.datasafe.model.UpdateOnPremConnectorDetails
            getUpdateOnPremConnectorDetails() {
        return updateOnPremConnectorDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the if-match parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the if-match parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datasafe.model.UpdateOnPremConnectorDetails getBody$() {
        return updateOnPremConnectorDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateOnPremConnectorRequest,
                    com.oracle.bmc.datasafe.model.UpdateOnPremConnectorDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the on-premises connector.
         */
        private String onPremConnectorId = null;

        /**
         * The OCID of the on-premises connector.
         * @param onPremConnectorId the value to set
         * @return this builder instance
         */
        public Builder onPremConnectorId(String onPremConnectorId) {
            this.onPremConnectorId = onPremConnectorId;
            return this;
        }

        /**
         * The details used to update a on-premises connector.
         */
        private com.oracle.bmc.datasafe.model.UpdateOnPremConnectorDetails
                updateOnPremConnectorDetails = null;

        /**
         * The details used to update a on-premises connector.
         * @param updateOnPremConnectorDetails the value to set
         * @return this builder instance
         */
        public Builder updateOnPremConnectorDetails(
                com.oracle.bmc.datasafe.model.UpdateOnPremConnectorDetails
                        updateOnPremConnectorDetails) {
            this.updateOnPremConnectorDetails = updateOnPremConnectorDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the if-match parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the if-match parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique identifier for the request.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(UpdateOnPremConnectorRequest o) {
            onPremConnectorId(o.getOnPremConnectorId());
            updateOnPremConnectorDetails(o.getUpdateOnPremConnectorDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateOnPremConnectorRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateOnPremConnectorRequest
         */
        public UpdateOnPremConnectorRequest build() {
            UpdateOnPremConnectorRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datasafe.model.UpdateOnPremConnectorDetails body) {
            updateOnPremConnectorDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateOnPremConnectorRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateOnPremConnectorRequest
         */
        public UpdateOnPremConnectorRequest buildWithoutInvocationCallback() {
            UpdateOnPremConnectorRequest request = new UpdateOnPremConnectorRequest();
            request.onPremConnectorId = onPremConnectorId;
            request.updateOnPremConnectorDetails = updateOnPremConnectorDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateOnPremConnectorRequest(onPremConnectorId, updateOnPremConnectorDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .onPremConnectorId(onPremConnectorId)
                .updateOnPremConnectorDetails(updateOnPremConnectorDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
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
        sb.append(",onPremConnectorId=").append(String.valueOf(this.onPremConnectorId));
        sb.append(",updateOnPremConnectorDetails=")
                .append(String.valueOf(this.updateOnPremConnectorDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOnPremConnectorRequest)) {
            return false;
        }

        UpdateOnPremConnectorRequest other = (UpdateOnPremConnectorRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.onPremConnectorId, other.onPremConnectorId)
                && java.util.Objects.equals(
                        this.updateOnPremConnectorDetails, other.updateOnPremConnectorDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.onPremConnectorId == null ? 43 : this.onPremConnectorId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateOnPremConnectorDetails == null
                                ? 43
                                : this.updateOnPremConnectorDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

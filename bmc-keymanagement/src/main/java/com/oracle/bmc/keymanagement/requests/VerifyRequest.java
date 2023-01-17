/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.requests;

import com.oracle.bmc.keymanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/VerifyExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use VerifyRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public class VerifyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.keymanagement.model.VerifyDataDetails> {

    /**
     * VerifyDataDetails
     */
    private com.oracle.bmc.keymanagement.model.VerifyDataDetails verifyDataDetails;

    /**
     * VerifyDataDetails
     */
    public com.oracle.bmc.keymanagement.model.VerifyDataDetails getVerifyDataDetails() {
        return verifyDataDetails;
    }
    /**
     * Unique identifier for the request. If provided, the returned request ID
     * will include this value. Otherwise, a random request ID will be
     * generated by the service.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If provided, the returned request ID
     * will include this value. Otherwise, a random request ID will be
     * generated by the service.
     *
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
    public com.oracle.bmc.keymanagement.model.VerifyDataDetails getBody$() {
        return verifyDataDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    VerifyRequest, com.oracle.bmc.keymanagement.model.VerifyDataDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * VerifyDataDetails
         */
        private com.oracle.bmc.keymanagement.model.VerifyDataDetails verifyDataDetails = null;

        /**
         * VerifyDataDetails
         * @param verifyDataDetails the value to set
         * @return this builder instance
         */
        public Builder verifyDataDetails(
                com.oracle.bmc.keymanagement.model.VerifyDataDetails verifyDataDetails) {
            this.verifyDataDetails = verifyDataDetails;
            return this;
        }

        /**
         * Unique identifier for the request. If provided, the returned request ID
         * will include this value. Otherwise, a random request ID will be
         * generated by the service.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If provided, the returned request ID
         * will include this value. Otherwise, a random request ID will be
         * generated by the service.
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
        public Builder copy(VerifyRequest o) {
            verifyDataDetails(o.getVerifyDataDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of VerifyRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of VerifyRequest
         */
        public VerifyRequest build() {
            VerifyRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.keymanagement.model.VerifyDataDetails body) {
            verifyDataDetails(body);
            return this;
        }

        /**
         * Build the instance of VerifyRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of VerifyRequest
         */
        public VerifyRequest buildWithoutInvocationCallback() {
            VerifyRequest request = new VerifyRequest();
            request.verifyDataDetails = verifyDataDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new VerifyRequest(verifyDataDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().verifyDataDetails(verifyDataDetails).opcRequestId(opcRequestId);
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
        sb.append(",verifyDataDetails=").append(String.valueOf(this.verifyDataDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VerifyRequest)) {
            return false;
        }

        VerifyRequest other = (VerifyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.verifyDataDetails, other.verifyDataDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.verifyDataDetails == null ? 43 : this.verifyDataDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

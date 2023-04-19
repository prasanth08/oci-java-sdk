/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/CreateSdmMaskingPolicyDifferenceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateSdmMaskingPolicyDifferenceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class CreateSdmMaskingPolicyDifferenceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.CreateSdmMaskingPolicyDifferenceDetails> {

    /**
     * The details used to create a SDM masking policy difference resource
     */
    private com.oracle.bmc.datasafe.model.CreateSdmMaskingPolicyDifferenceDetails
            createSdmMaskingPolicyDifferenceDetails;

    /**
     * The details used to create a SDM masking policy difference resource
     */
    public com.oracle.bmc.datasafe.model.CreateSdmMaskingPolicyDifferenceDetails
            getCreateSdmMaskingPolicyDifferenceDetails() {
        return createSdmMaskingPolicyDifferenceDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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
    public com.oracle.bmc.datasafe.model.CreateSdmMaskingPolicyDifferenceDetails getBody$() {
        return createSdmMaskingPolicyDifferenceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateSdmMaskingPolicyDifferenceRequest,
                    com.oracle.bmc.datasafe.model.CreateSdmMaskingPolicyDifferenceDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The details used to create a SDM masking policy difference resource
         */
        private com.oracle.bmc.datasafe.model.CreateSdmMaskingPolicyDifferenceDetails
                createSdmMaskingPolicyDifferenceDetails = null;

        /**
         * The details used to create a SDM masking policy difference resource
         * @param createSdmMaskingPolicyDifferenceDetails the value to set
         * @return this builder instance
         */
        public Builder createSdmMaskingPolicyDifferenceDetails(
                com.oracle.bmc.datasafe.model.CreateSdmMaskingPolicyDifferenceDetails
                        createSdmMaskingPolicyDifferenceDetails) {
            this.createSdmMaskingPolicyDifferenceDetails = createSdmMaskingPolicyDifferenceDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(CreateSdmMaskingPolicyDifferenceRequest o) {
            createSdmMaskingPolicyDifferenceDetails(o.getCreateSdmMaskingPolicyDifferenceDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateSdmMaskingPolicyDifferenceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateSdmMaskingPolicyDifferenceRequest
         */
        public CreateSdmMaskingPolicyDifferenceRequest build() {
            CreateSdmMaskingPolicyDifferenceRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.datasafe.model.CreateSdmMaskingPolicyDifferenceDetails body) {
            createSdmMaskingPolicyDifferenceDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateSdmMaskingPolicyDifferenceRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateSdmMaskingPolicyDifferenceRequest
         */
        public CreateSdmMaskingPolicyDifferenceRequest buildWithoutInvocationCallback() {
            CreateSdmMaskingPolicyDifferenceRequest request =
                    new CreateSdmMaskingPolicyDifferenceRequest();
            request.createSdmMaskingPolicyDifferenceDetails =
                    createSdmMaskingPolicyDifferenceDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateSdmMaskingPolicyDifferenceRequest(createSdmMaskingPolicyDifferenceDetails, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createSdmMaskingPolicyDifferenceDetails(createSdmMaskingPolicyDifferenceDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",createSdmMaskingPolicyDifferenceDetails=")
                .append(String.valueOf(this.createSdmMaskingPolicyDifferenceDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSdmMaskingPolicyDifferenceRequest)) {
            return false;
        }

        CreateSdmMaskingPolicyDifferenceRequest other = (CreateSdmMaskingPolicyDifferenceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createSdmMaskingPolicyDifferenceDetails,
                        other.createSdmMaskingPolicyDifferenceDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createSdmMaskingPolicyDifferenceDetails == null
                                ? 43
                                : this.createSdmMaskingPolicyDifferenceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
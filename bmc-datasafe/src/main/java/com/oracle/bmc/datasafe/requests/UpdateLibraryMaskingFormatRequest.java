/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateLibraryMaskingFormatExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateLibraryMaskingFormatRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class UpdateLibraryMaskingFormatRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.UpdateLibraryMaskingFormatDetails> {

    /**
     * The OCID of the library masking format.
     */
    private String libraryMaskingFormatId;

    /**
     * The OCID of the library masking format.
     */
    public String getLibraryMaskingFormatId() {
        return libraryMaskingFormatId;
    }
    /**
     * Details to update a library masking format.
     */
    private com.oracle.bmc.datasafe.model.UpdateLibraryMaskingFormatDetails
            updateLibraryMaskingFormatDetails;

    /**
     * Details to update a library masking format.
     */
    public com.oracle.bmc.datasafe.model.UpdateLibraryMaskingFormatDetails
            getUpdateLibraryMaskingFormatDetails() {
        return updateLibraryMaskingFormatDetails;
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
    public com.oracle.bmc.datasafe.model.UpdateLibraryMaskingFormatDetails getBody$() {
        return updateLibraryMaskingFormatDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateLibraryMaskingFormatRequest,
                    com.oracle.bmc.datasafe.model.UpdateLibraryMaskingFormatDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the library masking format.
         */
        private String libraryMaskingFormatId = null;

        /**
         * The OCID of the library masking format.
         * @param libraryMaskingFormatId the value to set
         * @return this builder instance
         */
        public Builder libraryMaskingFormatId(String libraryMaskingFormatId) {
            this.libraryMaskingFormatId = libraryMaskingFormatId;
            return this;
        }

        /**
         * Details to update a library masking format.
         */
        private com.oracle.bmc.datasafe.model.UpdateLibraryMaskingFormatDetails
                updateLibraryMaskingFormatDetails = null;

        /**
         * Details to update a library masking format.
         * @param updateLibraryMaskingFormatDetails the value to set
         * @return this builder instance
         */
        public Builder updateLibraryMaskingFormatDetails(
                com.oracle.bmc.datasafe.model.UpdateLibraryMaskingFormatDetails
                        updateLibraryMaskingFormatDetails) {
            this.updateLibraryMaskingFormatDetails = updateLibraryMaskingFormatDetails;
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
        public Builder copy(UpdateLibraryMaskingFormatRequest o) {
            libraryMaskingFormatId(o.getLibraryMaskingFormatId());
            updateLibraryMaskingFormatDetails(o.getUpdateLibraryMaskingFormatDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateLibraryMaskingFormatRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateLibraryMaskingFormatRequest
         */
        public UpdateLibraryMaskingFormatRequest build() {
            UpdateLibraryMaskingFormatRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datasafe.model.UpdateLibraryMaskingFormatDetails body) {
            updateLibraryMaskingFormatDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateLibraryMaskingFormatRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateLibraryMaskingFormatRequest
         */
        public UpdateLibraryMaskingFormatRequest buildWithoutInvocationCallback() {
            UpdateLibraryMaskingFormatRequest request = new UpdateLibraryMaskingFormatRequest();
            request.libraryMaskingFormatId = libraryMaskingFormatId;
            request.updateLibraryMaskingFormatDetails = updateLibraryMaskingFormatDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateLibraryMaskingFormatRequest(libraryMaskingFormatId, updateLibraryMaskingFormatDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .libraryMaskingFormatId(libraryMaskingFormatId)
                .updateLibraryMaskingFormatDetails(updateLibraryMaskingFormatDetails)
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
        sb.append(",libraryMaskingFormatId=").append(String.valueOf(this.libraryMaskingFormatId));
        sb.append(",updateLibraryMaskingFormatDetails=")
                .append(String.valueOf(this.updateLibraryMaskingFormatDetails));
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
        if (!(o instanceof UpdateLibraryMaskingFormatRequest)) {
            return false;
        }

        UpdateLibraryMaskingFormatRequest other = (UpdateLibraryMaskingFormatRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.libraryMaskingFormatId, other.libraryMaskingFormatId)
                && java.util.Objects.equals(
                        this.updateLibraryMaskingFormatDetails,
                        other.updateLibraryMaskingFormatDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.libraryMaskingFormatId == null
                                ? 43
                                : this.libraryMaskingFormatId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateLibraryMaskingFormatDetails == null
                                ? 43
                                : this.updateLibraryMaskingFormatDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.requests;

import com.oracle.bmc.fusionapps.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GetScheduledActivityExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetScheduledActivityRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
public class GetScheduledActivityRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** unique FusionEnvironment identifier */
    private String fusionEnvironmentId;

    /** unique FusionEnvironment identifier */
    public String getFusionEnvironmentId() {
        return fusionEnvironmentId;
    }
    /** Unique ScheduledActivity identifier. */
    private String scheduledActivityId;

    /** Unique ScheduledActivity identifier. */
    public String getScheduledActivityId() {
        return scheduledActivityId;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetScheduledActivityRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** unique FusionEnvironment identifier */
        private String fusionEnvironmentId = null;

        /**
         * unique FusionEnvironment identifier
         *
         * @param fusionEnvironmentId the value to set
         * @return this builder instance
         */
        public Builder fusionEnvironmentId(String fusionEnvironmentId) {
            this.fusionEnvironmentId = fusionEnvironmentId;
            return this;
        }

        /** Unique ScheduledActivity identifier. */
        private String scheduledActivityId = null;

        /**
         * Unique ScheduledActivity identifier.
         *
         * @param scheduledActivityId the value to set
         * @return this builder instance
         */
        public Builder scheduledActivityId(String scheduledActivityId) {
            this.scheduledActivityId = scheduledActivityId;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(GetScheduledActivityRequest o) {
            fusionEnvironmentId(o.getFusionEnvironmentId());
            scheduledActivityId(o.getScheduledActivityId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetScheduledActivityRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetScheduledActivityRequest
         */
        public GetScheduledActivityRequest build() {
            GetScheduledActivityRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetScheduledActivityRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetScheduledActivityRequest
         */
        public GetScheduledActivityRequest buildWithoutInvocationCallback() {
            GetScheduledActivityRequest request = new GetScheduledActivityRequest();
            request.fusionEnvironmentId = fusionEnvironmentId;
            request.scheduledActivityId = scheduledActivityId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetScheduledActivityRequest(fusionEnvironmentId, scheduledActivityId,
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
                .fusionEnvironmentId(fusionEnvironmentId)
                .scheduledActivityId(scheduledActivityId)
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
        sb.append(",fusionEnvironmentId=").append(String.valueOf(this.fusionEnvironmentId));
        sb.append(",scheduledActivityId=").append(String.valueOf(this.scheduledActivityId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetScheduledActivityRequest)) {
            return false;
        }

        GetScheduledActivityRequest other = (GetScheduledActivityRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fusionEnvironmentId, other.fusionEnvironmentId)
                && java.util.Objects.equals(this.scheduledActivityId, other.scheduledActivityId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.fusionEnvironmentId == null
                                ? 43
                                : this.fusionEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledActivityId == null
                                ? 43
                                : this.scheduledActivityId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

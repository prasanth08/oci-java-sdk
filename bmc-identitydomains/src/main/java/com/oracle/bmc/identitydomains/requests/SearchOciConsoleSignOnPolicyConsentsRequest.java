/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.requests;

import com.oracle.bmc.identitydomains.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/SearchOciConsoleSignOnPolicyConsentsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * SearchOciConsoleSignOnPolicyConsentsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
public class SearchOciConsoleSignOnPolicyConsentsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.identitydomains.model.OciConsoleSignOnPolicyConsentSearchRequest> {

    /**
     * The Authorization field value consists of credentials containing the authentication
     * information of the user agent for the realm of the resource being requested.
     */
    private String authorization;

    /**
     * The Authorization field value consists of credentials containing the authentication
     * information of the user agent for the realm of the resource being requested.
     */
    public String getAuthorization() {
        return authorization;
    }
    /**
     * An endpoint-specific schema version number to use in the Request. Allowed version values are
     * Earliest Version or Latest Version as specified in each REST API endpoint description, or any
     * sequential number inbetween. All schema attributes/body parameters are a part of version 1.
     * After version 1, any attributes added or deprecated will be tagged with the version that they
     * were added to or deprecated in. If no version is provided, the latest schema version is
     * returned.
     */
    private String resourceTypeSchemaVersion;

    /**
     * An endpoint-specific schema version number to use in the Request. Allowed version values are
     * Earliest Version or Latest Version as specified in each REST API endpoint description, or any
     * sequential number inbetween. All schema attributes/body parameters are a part of version 1.
     * After version 1, any attributes added or deprecated will be tagged with the version that they
     * were added to or deprecated in. If no version is provided, the latest schema version is
     * returned.
     */
    public String getResourceTypeSchemaVersion() {
        return resourceTypeSchemaVersion;
    }
    /** Parameters for searching OciConsoleSignOnPolicyConsents */
    private com.oracle.bmc.identitydomains.model.OciConsoleSignOnPolicyConsentSearchRequest
            ociConsoleSignOnPolicyConsentSearchRequest;

    /** Parameters for searching OciConsoleSignOnPolicyConsents */
    public com.oracle.bmc.identitydomains.model.OciConsoleSignOnPolicyConsentSearchRequest
            getOciConsoleSignOnPolicyConsentSearchRequest() {
        return ociConsoleSignOnPolicyConsentSearchRequest;
    }
    /**
     * A token you supply to uniquely identify the request and provide idempotency if the request is
     * retried. Idempotency tokens expire after 24 hours.
     */
    private String opcRetryToken;

    /**
     * A token you supply to uniquely identify the request and provide idempotency if the request is
     * retried. Idempotency tokens expire after 24 hours.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /** The value of the {@code opc-next-page} response header from the previous 'List' call. */
    private String page;

    /** The value of the {@code opc-next-page} response header from the previous 'List' call. */
    public String getPage() {
        return page;
    }
    /** The maximum number of items to return in a paginated 'List' call. */
    private Integer limit;

    /** The maximum number of items to return in a paginated 'List' call. */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.identitydomains.model.OciConsoleSignOnPolicyConsentSearchRequest
            getBody$() {
        return ociConsoleSignOnPolicyConsentSearchRequest;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SearchOciConsoleSignOnPolicyConsentsRequest,
                    com.oracle.bmc.identitydomains.model
                            .OciConsoleSignOnPolicyConsentSearchRequest> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Authorization field value consists of credentials containing the authentication
         * information of the user agent for the realm of the resource being requested.
         */
        private String authorization = null;

        /**
         * The Authorization field value consists of credentials containing the authentication
         * information of the user agent for the realm of the resource being requested.
         *
         * @param authorization the value to set
         * @return this builder instance
         */
        public Builder authorization(String authorization) {
            this.authorization = authorization;
            return this;
        }

        /**
         * An endpoint-specific schema version number to use in the Request. Allowed version values
         * are Earliest Version or Latest Version as specified in each REST API endpoint
         * description, or any sequential number inbetween. All schema attributes/body parameters
         * are a part of version 1. After version 1, any attributes added or deprecated will be
         * tagged with the version that they were added to or deprecated in. If no version is
         * provided, the latest schema version is returned.
         */
        private String resourceTypeSchemaVersion = null;

        /**
         * An endpoint-specific schema version number to use in the Request. Allowed version values
         * are Earliest Version or Latest Version as specified in each REST API endpoint
         * description, or any sequential number inbetween. All schema attributes/body parameters
         * are a part of version 1. After version 1, any attributes added or deprecated will be
         * tagged with the version that they were added to or deprecated in. If no version is
         * provided, the latest schema version is returned.
         *
         * @param resourceTypeSchemaVersion the value to set
         * @return this builder instance
         */
        public Builder resourceTypeSchemaVersion(String resourceTypeSchemaVersion) {
            this.resourceTypeSchemaVersion = resourceTypeSchemaVersion;
            return this;
        }

        /** Parameters for searching OciConsoleSignOnPolicyConsents */
        private com.oracle.bmc.identitydomains.model.OciConsoleSignOnPolicyConsentSearchRequest
                ociConsoleSignOnPolicyConsentSearchRequest = null;

        /**
         * Parameters for searching OciConsoleSignOnPolicyConsents
         *
         * @param ociConsoleSignOnPolicyConsentSearchRequest the value to set
         * @return this builder instance
         */
        public Builder ociConsoleSignOnPolicyConsentSearchRequest(
                com.oracle.bmc.identitydomains.model.OciConsoleSignOnPolicyConsentSearchRequest
                        ociConsoleSignOnPolicyConsentSearchRequest) {
            this.ociConsoleSignOnPolicyConsentSearchRequest =
                    ociConsoleSignOnPolicyConsentSearchRequest;
            return this;
        }

        /**
         * A token you supply to uniquely identify the request and provide idempotency if the
         * request is retried. Idempotency tokens expire after 24 hours.
         */
        private String opcRetryToken = null;

        /**
         * A token you supply to uniquely identify the request and provide idempotency if the
         * request is retried. Idempotency tokens expire after 24 hours.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /** The value of the {@code opc-next-page} response header from the previous 'List' call. */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the previous 'List' call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The maximum number of items to return in a paginated 'List' call. */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated 'List' call.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
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
        public Builder copy(SearchOciConsoleSignOnPolicyConsentsRequest o) {
            authorization(o.getAuthorization());
            resourceTypeSchemaVersion(o.getResourceTypeSchemaVersion());
            ociConsoleSignOnPolicyConsentSearchRequest(
                    o.getOciConsoleSignOnPolicyConsentSearchRequest());
            opcRetryToken(o.getOpcRetryToken());
            page(o.getPage());
            limit(o.getLimit());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SearchOciConsoleSignOnPolicyConsentsRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SearchOciConsoleSignOnPolicyConsentsRequest
         */
        public SearchOciConsoleSignOnPolicyConsentsRequest build() {
            SearchOciConsoleSignOnPolicyConsentsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.identitydomains.model.OciConsoleSignOnPolicyConsentSearchRequest
                        body) {
            ociConsoleSignOnPolicyConsentSearchRequest(body);
            return this;
        }

        /**
         * Build the instance of SearchOciConsoleSignOnPolicyConsentsRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SearchOciConsoleSignOnPolicyConsentsRequest
         */
        public SearchOciConsoleSignOnPolicyConsentsRequest buildWithoutInvocationCallback() {
            SearchOciConsoleSignOnPolicyConsentsRequest request =
                    new SearchOciConsoleSignOnPolicyConsentsRequest();
            request.authorization = authorization;
            request.resourceTypeSchemaVersion = resourceTypeSchemaVersion;
            request.ociConsoleSignOnPolicyConsentSearchRequest =
                    ociConsoleSignOnPolicyConsentSearchRequest;
            request.opcRetryToken = opcRetryToken;
            request.page = page;
            request.limit = limit;
            return request;
            // new SearchOciConsoleSignOnPolicyConsentsRequest(authorization,
            // resourceTypeSchemaVersion, ociConsoleSignOnPolicyConsentSearchRequest, opcRetryToken,
            // page, limit);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .authorization(authorization)
                .resourceTypeSchemaVersion(resourceTypeSchemaVersion)
                .ociConsoleSignOnPolicyConsentSearchRequest(
                        ociConsoleSignOnPolicyConsentSearchRequest)
                .opcRetryToken(opcRetryToken)
                .page(page)
                .limit(limit);
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
        sb.append(",authorization=").append(String.valueOf(this.authorization));
        sb.append(",resourceTypeSchemaVersion=")
                .append(String.valueOf(this.resourceTypeSchemaVersion));
        sb.append(",ociConsoleSignOnPolicyConsentSearchRequest=")
                .append(String.valueOf(this.ociConsoleSignOnPolicyConsentSearchRequest));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchOciConsoleSignOnPolicyConsentsRequest)) {
            return false;
        }

        SearchOciConsoleSignOnPolicyConsentsRequest other =
                (SearchOciConsoleSignOnPolicyConsentsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.authorization, other.authorization)
                && java.util.Objects.equals(
                        this.resourceTypeSchemaVersion, other.resourceTypeSchemaVersion)
                && java.util.Objects.equals(
                        this.ociConsoleSignOnPolicyConsentSearchRequest,
                        other.ociConsoleSignOnPolicyConsentSearchRequest)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.authorization == null ? 43 : this.authorization.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTypeSchemaVersion == null
                                ? 43
                                : this.resourceTypeSchemaVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.ociConsoleSignOnPolicyConsentSearchRequest == null
                                ? 43
                                : this.ociConsoleSignOnPolicyConsentSearchRequest.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        return result;
    }
}

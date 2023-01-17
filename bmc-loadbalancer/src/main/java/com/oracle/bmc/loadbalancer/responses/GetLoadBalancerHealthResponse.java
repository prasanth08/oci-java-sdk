/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.responses;

import com.oracle.bmc.loadbalancer.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
public class GetLoadBalancerHealthResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Reflects the current version of the load balancer and the resources it contains.
     * The value only changes when the load balancer or an associated resource is created,
     * updated, or delete
     * <p>
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String eTag;

    /**
     * Reflects the current version of the load balancer and the resources it contains.
     * The value only changes when the load balancer or an associated resource is created,
     * updated, or delete
     * <p>
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getETag() {
        return eTag;
    }

    /**
     * The returned LoadBalancerHealth instance.
     */
    private com.oracle.bmc.loadbalancer.model.LoadBalancerHealth loadBalancerHealth;

    /**
     * The returned LoadBalancerHealth instance.
     * @return the value
     */
    public com.oracle.bmc.loadbalancer.model.LoadBalancerHealth getLoadBalancerHealth() {
        return loadBalancerHealth;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "eTag",
        "loadBalancerHealth"
    })
    private GetLoadBalancerHealthResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String eTag,
            com.oracle.bmc.loadbalancer.model.LoadBalancerHealth loadBalancerHealth) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.eTag = eTag;
        this.loadBalancerHealth = loadBalancerHealth;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private javax.ws.rs.core.MultivaluedMap<String, String> headers;

        public Builder headers(javax.ws.rs.core.MultivaluedMap<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Reflects the current version of the load balancer and the resources it contains.
         * The value only changes when the load balancer or an associated resource is created,
         * updated, or delete
         * <p>
         * For optimistic concurrency control. See {@code if-match}.
         *
         */
        private String eTag;

        /**
         * Reflects the current version of the load balancer and the resources it contains.
         * The value only changes when the load balancer or an associated resource is created,
         * updated, or delete
         * <p>
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param eTag the value to set
         * @return this builder
         */
        public Builder eTag(String eTag) {
            this.eTag = eTag;
            return this;
        }

        /**
         * The returned LoadBalancerHealth instance.
         */
        private com.oracle.bmc.loadbalancer.model.LoadBalancerHealth loadBalancerHealth;

        /**
         * The returned LoadBalancerHealth instance.
         * @param loadBalancerHealth the value to set
         * @return this builder
         */
        public Builder loadBalancerHealth(
                com.oracle.bmc.loadbalancer.model.LoadBalancerHealth loadBalancerHealth) {
            this.loadBalancerHealth = loadBalancerHealth;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetLoadBalancerHealthResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            eTag(o.getETag());
            loadBalancerHealth(o.getLoadBalancerHealth());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetLoadBalancerHealthResponse build() {
            return new GetLoadBalancerHealthResponse(
                    __httpStatusCode__, headers, opcRequestId, eTag, loadBalancerHealth);
        }
    }

    /**
     * Return a new builder for this response object.
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",eTag=").append(String.valueOf(eTag));
        sb.append(",loadBalancerHealth=").append(String.valueOf(loadBalancerHealth));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetLoadBalancerHealthResponse)) {
            return false;
        }

        GetLoadBalancerHealthResponse other = (GetLoadBalancerHealthResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.eTag, other.eTag)
                && java.util.Objects.equals(this.loadBalancerHealth, other.loadBalancerHealth);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.eTag == null ? 43 : this.eTag.hashCode());
        result =
                (result * PRIME)
                        + (this.loadBalancerHealth == null
                                ? 43
                                : this.loadBalancerHealth.hashCode());
        return result;
    }
}

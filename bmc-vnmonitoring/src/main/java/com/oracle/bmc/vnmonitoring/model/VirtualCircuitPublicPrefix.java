/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * A public IP prefix and its details. With a public virtual circuit, the customer
 * specifies the customer-owned public IP prefixes to advertise across the connection.
 * For more information, see [FastConnect Overview](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VirtualCircuitPublicPrefix.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VirtualCircuitPublicPrefix {
    @Deprecated
    @java.beans.ConstructorProperties({"cidrBlock", "verificationState"})
    public VirtualCircuitPublicPrefix(String cidrBlock, VerificationState verificationState) {
        super();
        this.cidrBlock = cidrBlock;
        this.verificationState = verificationState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Publix IP prefix (CIDR) that the customer specified.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        /**
         * Publix IP prefix (CIDR) that the customer specified.
         * @param cidrBlock the value to set
         * @return this builder
         **/
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            this.__explicitlySet__.add("cidrBlock");
            return this;
        }
        /**
         * Oracle must verify that the customer owns the public IP prefix before traffic
         * for that prefix can flow across the virtual circuit. Verification can take a
         * few business days. {@code IN_PROGRESS} means Oracle is verifying the prefix. {@code COMPLETED}
         * means verification succeeded. {@code FAILED} means verification failed and traffic for
         * this prefix will not flow across the connection.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("verificationState")
        private VerificationState verificationState;

        /**
         * Oracle must verify that the customer owns the public IP prefix before traffic
         * for that prefix can flow across the virtual circuit. Verification can take a
         * few business days. {@code IN_PROGRESS} means Oracle is verifying the prefix. {@code COMPLETED}
         * means verification succeeded. {@code FAILED} means verification failed and traffic for
         * this prefix will not flow across the connection.
         *
         * @param verificationState the value to set
         * @return this builder
         **/
        public Builder verificationState(VerificationState verificationState) {
            this.verificationState = verificationState;
            this.__explicitlySet__.add("verificationState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VirtualCircuitPublicPrefix build() {
            VirtualCircuitPublicPrefix __instance__ =
                    new VirtualCircuitPublicPrefix(cidrBlock, verificationState);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualCircuitPublicPrefix o) {
            Builder copiedBuilder =
                    cidrBlock(o.getCidrBlock()).verificationState(o.getVerificationState());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Publix IP prefix (CIDR) that the customer specified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    private final String cidrBlock;

    /**
     * Publix IP prefix (CIDR) that the customer specified.
     * @return the value
     **/
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * Oracle must verify that the customer owns the public IP prefix before traffic
     * for that prefix can flow across the virtual circuit. Verification can take a
     * few business days. {@code IN_PROGRESS} means Oracle is verifying the prefix. {@code COMPLETED}
     * means verification succeeded. {@code FAILED} means verification failed and traffic for
     * this prefix will not flow across the connection.
     *
     **/
    public enum VerificationState {
        InProgress("IN_PROGRESS"),
        Completed("COMPLETED"),
        Failed("FAILED"),
        ;

        private final String value;
        private static java.util.Map<String, VerificationState> map;

        static {
            map = new java.util.HashMap<>();
            for (VerificationState v : VerificationState.values()) {
                map.put(v.getValue(), v);
            }
        }

        VerificationState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static VerificationState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid VerificationState: " + key);
        }
    };
    /**
     * Oracle must verify that the customer owns the public IP prefix before traffic
     * for that prefix can flow across the virtual circuit. Verification can take a
     * few business days. {@code IN_PROGRESS} means Oracle is verifying the prefix. {@code COMPLETED}
     * means verification succeeded. {@code FAILED} means verification failed and traffic for
     * this prefix will not flow across the connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verificationState")
    private final VerificationState verificationState;

    /**
     * Oracle must verify that the customer owns the public IP prefix before traffic
     * for that prefix can flow across the virtual circuit. Verification can take a
     * few business days. {@code IN_PROGRESS} means Oracle is verifying the prefix. {@code COMPLETED}
     * means verification succeeded. {@code FAILED} means verification failed and traffic for
     * this prefix will not flow across the connection.
     *
     * @return the value
     **/
    public VerificationState getVerificationState() {
        return verificationState;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VirtualCircuitPublicPrefix(");
        sb.append("cidrBlock=").append(String.valueOf(this.cidrBlock));
        sb.append(", verificationState=").append(String.valueOf(this.verificationState));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VirtualCircuitPublicPrefix)) {
            return false;
        }

        VirtualCircuitPublicPrefix other = (VirtualCircuitPublicPrefix) o;
        return java.util.Objects.equals(this.cidrBlock, other.cidrBlock)
                && java.util.Objects.equals(this.verificationState, other.verificationState)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cidrBlock == null ? 43 : this.cidrBlock.hashCode());
        result =
                (result * PRIME)
                        + (this.verificationState == null ? 43 : this.verificationState.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
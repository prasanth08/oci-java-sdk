/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The details for updating a connection of the type {@code BITBUCKET_SERVER_ACCESS_TOKEN}.
 * This type corresponds to a connection in Bitbucket that is authenticated with a personal access token.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateBitbucketServerAccessTokenConnectionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateBitbucketServerAccessTokenConnectionDetails
        extends UpdateConnectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * OCID of personal access token saved in secret store
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
        private String accessToken;

        /**
         * OCID of personal access token saved in secret store
         * @param accessToken the value to set
         * @return this builder
         **/
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            this.__explicitlySet__.add("accessToken");
            return this;
        }
        /**
         * The Base URL of the hosted BitbucketServer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("baseUrl")
        private String baseUrl;

        /**
         * The Base URL of the hosted BitbucketServer.
         * @param baseUrl the value to set
         * @return this builder
         **/
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            this.__explicitlySet__.add("baseUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tlsVerifyConfig")
        private TlsVerifyConfig tlsVerifyConfig;

        public Builder tlsVerifyConfig(TlsVerifyConfig tlsVerifyConfig) {
            this.tlsVerifyConfig = tlsVerifyConfig;
            this.__explicitlySet__.add("tlsVerifyConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBitbucketServerAccessTokenConnectionDetails build() {
            UpdateBitbucketServerAccessTokenConnectionDetails __instance__ =
                    new UpdateBitbucketServerAccessTokenConnectionDetails(
                            description,
                            displayName,
                            freeformTags,
                            definedTags,
                            accessToken,
                            baseUrl,
                            tlsVerifyConfig);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBitbucketServerAccessTokenConnectionDetails o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .accessToken(o.getAccessToken())
                            .baseUrl(o.getBaseUrl())
                            .tlsVerifyConfig(o.getTlsVerifyConfig());

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

    @Deprecated
    public UpdateBitbucketServerAccessTokenConnectionDetails(
            String description,
            String displayName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String accessToken,
            String baseUrl,
            TlsVerifyConfig tlsVerifyConfig) {
        super(description, displayName, freeformTags, definedTags);
        this.accessToken = accessToken;
        this.baseUrl = baseUrl;
        this.tlsVerifyConfig = tlsVerifyConfig;
    }

    /**
     * OCID of personal access token saved in secret store
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
    private final String accessToken;

    /**
     * OCID of personal access token saved in secret store
     * @return the value
     **/
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * The Base URL of the hosted BitbucketServer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baseUrl")
    private final String baseUrl;

    /**
     * The Base URL of the hosted BitbucketServer.
     * @return the value
     **/
    public String getBaseUrl() {
        return baseUrl;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tlsVerifyConfig")
    private final TlsVerifyConfig tlsVerifyConfig;

    public TlsVerifyConfig getTlsVerifyConfig() {
        return tlsVerifyConfig;
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
        sb.append("UpdateBitbucketServerAccessTokenConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", accessToken=").append(String.valueOf(this.accessToken));
        sb.append(", baseUrl=").append(String.valueOf(this.baseUrl));
        sb.append(", tlsVerifyConfig=").append(String.valueOf(this.tlsVerifyConfig));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateBitbucketServerAccessTokenConnectionDetails)) {
            return false;
        }

        UpdateBitbucketServerAccessTokenConnectionDetails other =
                (UpdateBitbucketServerAccessTokenConnectionDetails) o;
        return java.util.Objects.equals(this.accessToken, other.accessToken)
                && java.util.Objects.equals(this.baseUrl, other.baseUrl)
                && java.util.Objects.equals(this.tlsVerifyConfig, other.tlsVerifyConfig)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.accessToken == null ? 43 : this.accessToken.hashCode());
        result = (result * PRIME) + (this.baseUrl == null ? 43 : this.baseUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.tlsVerifyConfig == null ? 43 : this.tlsVerifyConfig.hashCode());
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
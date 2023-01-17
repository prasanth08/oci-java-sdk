/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * (For tenancies that support identity domains) Properties for a region where a replica for the identity domain exists.
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
    builder = ReplicatedRegionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ReplicatedRegionDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"region", "url", "state"})
    public ReplicatedRegionDetails(String region, String url, State state) {
        super();
        this.region = region;
        this.url = url;
        this.state = state;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A REPLICATION_ENABLED region, e.g. us-ashburn-1.
         * See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
         * for the full list of supported region names.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * A REPLICATION_ENABLED region, e.g. us-ashburn-1.
         * See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
         * for the full list of supported region names.
         *
         * @param region the value to set
         * @return this builder
         **/
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * Region-agnostic identity domain URL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * Region-agnostic identity domain URL.
         * @param url the value to set
         * @return this builder
         **/
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /**
         * The IDCS-replicated region state.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private State state;

        /**
         * The IDCS-replicated region state.
         *
         * @param state the value to set
         * @return this builder
         **/
        public Builder state(State state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplicatedRegionDetails build() {
            ReplicatedRegionDetails model =
                    new ReplicatedRegionDetails(this.region, this.url, this.state);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplicatedRegionDetails model) {
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            return this;
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
     * A REPLICATION_ENABLED region, e.g. us-ashburn-1.
     * See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
     * for the full list of supported region names.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * A REPLICATION_ENABLED region, e.g. us-ashburn-1.
     * See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
     * for the full list of supported region names.
     *
     * @return the value
     **/
    public String getRegion() {
        return region;
    }

    /**
     * Region-agnostic identity domain URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * Region-agnostic identity domain URL.
     * @return the value
     **/
    public String getUrl() {
        return url;
    }

    /**
     * The IDCS-replicated region state.
     *
     **/
    public enum State {
        EnablingReplication("ENABLING_REPLICATION"),
        ReplicationEnabled("REPLICATION_ENABLED"),
        DisablingReplication("DISABLING_REPLICATION"),
        ReplicationDisabled("REPLICATION_DISABLED"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(State.class);

        private final String value;
        private static java.util.Map<String, State> map;

        static {
            map = new java.util.HashMap<>();
            for (State v : State.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        State(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static State create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'State', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The IDCS-replicated region state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

    /**
     * The IDCS-replicated region state.
     *
     * @return the value
     **/
    public State getState() {
        return state;
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
        sb.append("ReplicatedRegionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("region=").append(String.valueOf(this.region));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReplicatedRegionDetails)) {
            return false;
        }

        ReplicatedRegionDetails other = (ReplicatedRegionDetails) o;
        return java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.state, other.state)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

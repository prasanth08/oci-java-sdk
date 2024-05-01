/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to disable a Database Management feature for an external non-container
 * database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DisableExternalNonContainerDatabaseManagementFeatureDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DisableExternalNonContainerDatabaseManagementFeatureDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"feature"})
    public DisableExternalNonContainerDatabaseManagementFeatureDetails(
            DbManagementFeature feature) {
        super();
        this.feature = feature;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the Database Management feature. */
        @com.fasterxml.jackson.annotation.JsonProperty("feature")
        private DbManagementFeature feature;

        /**
         * The name of the Database Management feature.
         *
         * @param feature the value to set
         * @return this builder
         */
        public Builder feature(DbManagementFeature feature) {
            this.feature = feature;
            this.__explicitlySet__.add("feature");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DisableExternalNonContainerDatabaseManagementFeatureDetails build() {
            DisableExternalNonContainerDatabaseManagementFeatureDetails model =
                    new DisableExternalNonContainerDatabaseManagementFeatureDetails(this.feature);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DisableExternalNonContainerDatabaseManagementFeatureDetails model) {
            if (model.wasPropertyExplicitlySet("feature")) {
                this.feature(model.getFeature());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The name of the Database Management feature. */
    @com.fasterxml.jackson.annotation.JsonProperty("feature")
    private final DbManagementFeature feature;

    /**
     * The name of the Database Management feature.
     *
     * @return the value
     */
    public DbManagementFeature getFeature() {
        return feature;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DisableExternalNonContainerDatabaseManagementFeatureDetails(");
        sb.append("super=").append(super.toString());
        sb.append("feature=").append(String.valueOf(this.feature));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DisableExternalNonContainerDatabaseManagementFeatureDetails)) {
            return false;
        }

        DisableExternalNonContainerDatabaseManagementFeatureDetails other =
                (DisableExternalNonContainerDatabaseManagementFeatureDetails) o;
        return java.util.Objects.equals(this.feature, other.feature) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.feature == null ? 43 : this.feature.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
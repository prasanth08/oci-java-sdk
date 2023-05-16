/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * The identity properties of a table, if any. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Identity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Identity extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"columnName", "isAlways", "isNull"})
    public Identity(String columnName, Boolean isAlways, Boolean isNull) {
        super();
        this.columnName = columnName;
        this.isAlways = isAlways;
        this.isNull = isNull;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the identity column. */
        @com.fasterxml.jackson.annotation.JsonProperty("columnName")
        private String columnName;

        /**
         * The name of the identity column.
         *
         * @param columnName the value to set
         * @return this builder
         */
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            this.__explicitlySet__.add("columnName");
            return this;
        }
        /** True if the identity value is GENERATED ALWAYS. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAlways")
        private Boolean isAlways;

        /**
         * True if the identity value is GENERATED ALWAYS.
         *
         * @param isAlways the value to set
         * @return this builder
         */
        public Builder isAlways(Boolean isAlways) {
            this.isAlways = isAlways;
            this.__explicitlySet__.add("isAlways");
            return this;
        }
        /** True if the identity value is GENERATED BY DEFAULT ON NULL. */
        @com.fasterxml.jackson.annotation.JsonProperty("isNull")
        private Boolean isNull;

        /**
         * True if the identity value is GENERATED BY DEFAULT ON NULL.
         *
         * @param isNull the value to set
         * @return this builder
         */
        public Builder isNull(Boolean isNull) {
            this.isNull = isNull;
            this.__explicitlySet__.add("isNull");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Identity build() {
            Identity model = new Identity(this.columnName, this.isAlways, this.isNull);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Identity model) {
            if (model.wasPropertyExplicitlySet("columnName")) {
                this.columnName(model.getColumnName());
            }
            if (model.wasPropertyExplicitlySet("isAlways")) {
                this.isAlways(model.getIsAlways());
            }
            if (model.wasPropertyExplicitlySet("isNull")) {
                this.isNull(model.getIsNull());
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

    /** The name of the identity column. */
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    private final String columnName;

    /**
     * The name of the identity column.
     *
     * @return the value
     */
    public String getColumnName() {
        return columnName;
    }

    /** True if the identity value is GENERATED ALWAYS. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAlways")
    private final Boolean isAlways;

    /**
     * True if the identity value is GENERATED ALWAYS.
     *
     * @return the value
     */
    public Boolean getIsAlways() {
        return isAlways;
    }

    /** True if the identity value is GENERATED BY DEFAULT ON NULL. */
    @com.fasterxml.jackson.annotation.JsonProperty("isNull")
    private final Boolean isNull;

    /**
     * True if the identity value is GENERATED BY DEFAULT ON NULL.
     *
     * @return the value
     */
    public Boolean getIsNull() {
        return isNull;
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
        sb.append("Identity(");
        sb.append("super=").append(super.toString());
        sb.append("columnName=").append(String.valueOf(this.columnName));
        sb.append(", isAlways=").append(String.valueOf(this.isAlways));
        sb.append(", isNull=").append(String.valueOf(this.isNull));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Identity)) {
            return false;
        }

        Identity other = (Identity) o;
        return java.util.Objects.equals(this.columnName, other.columnName)
                && java.util.Objects.equals(this.isAlways, other.isAlways)
                && java.util.Objects.equals(this.isNull, other.isNull)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.columnName == null ? 43 : this.columnName.hashCode());
        result = (result * PRIME) + (this.isAlways == null ? 43 : this.isAlways.hashCode());
        result = (result * PRIME) + (this.isNull == null ? 43 : this.isNull.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

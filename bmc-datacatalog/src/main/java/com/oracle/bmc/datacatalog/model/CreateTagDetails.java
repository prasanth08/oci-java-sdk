/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Properties used in tag create operations.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateTagDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateTagDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "termKey"})
    public CreateTagDetails(String name, String termKey) {
        super();
        this.name = name;
        this.termKey = termKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the tag in the case of a free form tag.
         * When linking to a glossary term, this field is not specified.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the tag in the case of a free form tag.
         * When linking to a glossary term, this field is not specified.
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Unique key of the related term or null in the case of a free form tag.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("termKey")
        private String termKey;

        /**
         * Unique key of the related term or null in the case of a free form tag.
         * @param termKey the value to set
         * @return this builder
         **/
        public Builder termKey(String termKey) {
            this.termKey = termKey;
            this.__explicitlySet__.add("termKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateTagDetails build() {
            CreateTagDetails model = new CreateTagDetails(this.name, this.termKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateTagDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("termKey")) {
                this.termKey(model.getTermKey());
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
     * The name of the tag in the case of a free form tag.
     * When linking to a glossary term, this field is not specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the tag in the case of a free form tag.
     * When linking to a glossary term, this field is not specified.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Unique key of the related term or null in the case of a free form tag.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termKey")
    private final String termKey;

    /**
     * Unique key of the related term or null in the case of a free form tag.
     * @return the value
     **/
    public String getTermKey() {
        return termKey;
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
        sb.append("CreateTagDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", termKey=").append(String.valueOf(this.termKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTagDetails)) {
            return false;
        }

        CreateTagDetails other = (CreateTagDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.termKey, other.termKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.termKey == null ? 43 : this.termKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

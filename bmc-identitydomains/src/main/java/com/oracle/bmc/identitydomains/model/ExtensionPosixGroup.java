/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * POSIX Group extension
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExtensionPosixGroup.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExtensionPosixGroup extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"gidNumber"})
    public ExtensionPosixGroup(Integer gidNumber) {
        super();
        this.gidNumber = gidNumber;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Integer uniquely identifying a group in a POSIX administrative domain
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: request
         *  - type: integer
         *  - uniqueness: server
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gidNumber")
        private Integer gidNumber;

        /**
         * Integer uniquely identifying a group in a POSIX administrative domain
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: request
         *  - type: integer
         *  - uniqueness: server
         * @param gidNumber the value to set
         * @return this builder
         **/
        public Builder gidNumber(Integer gidNumber) {
            this.gidNumber = gidNumber;
            this.__explicitlySet__.add("gidNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionPosixGroup build() {
            ExtensionPosixGroup model = new ExtensionPosixGroup(this.gidNumber);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionPosixGroup model) {
            if (model.wasPropertyExplicitlySet("gidNumber")) {
                this.gidNumber(model.getGidNumber());
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
     * Integer uniquely identifying a group in a POSIX administrative domain
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: request
     *  - type: integer
     *  - uniqueness: server
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gidNumber")
    private final Integer gidNumber;

    /**
     * Integer uniquely identifying a group in a POSIX administrative domain
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: request
     *  - type: integer
     *  - uniqueness: server
     * @return the value
     **/
    public Integer getGidNumber() {
        return gidNumber;
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
        sb.append("ExtensionPosixGroup(");
        sb.append("super=").append(super.toString());
        sb.append("gidNumber=").append(String.valueOf(this.gidNumber));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionPosixGroup)) {
            return false;
        }

        ExtensionPosixGroup other = (ExtensionPosixGroup) o;
        return java.util.Objects.equals(this.gidNumber, other.gidNumber) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.gidNumber == null ? 43 : this.gidNumber.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

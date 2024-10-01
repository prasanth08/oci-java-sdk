/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.securityattribute.model;

/**
 * A security attribute definition that belongs to a specific security attribute namespace. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240815")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SecurityAttributeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SecurityAttributeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "securityAttributeNamespaceId",
        "securityAttributeNamespaceName",
        "id",
        "name",
        "description",
        "type",
        "isRetired",
        "lifecycleState",
        "timeCreated"
    })
    public SecurityAttributeSummary(
            String compartmentId,
            String securityAttributeNamespaceId,
            String securityAttributeNamespaceName,
            String id,
            String name,
            String description,
            String type,
            Boolean isRetired,
            SecurityAttribute.LifecycleState lifecycleState,
            java.util.Date timeCreated) {
        super();
        this.compartmentId = compartmentId;
        this.securityAttributeNamespaceId = securityAttributeNamespaceId;
        this.securityAttributeNamespaceName = securityAttributeNamespaceName;
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.isRetired = isRetired;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment that contains the security attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the security attribute.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The OCID of the namespace that contains the security attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributeNamespaceId")
        private String securityAttributeNamespaceId;

        /**
         * The OCID of the namespace that contains the security attribute.
         *
         * @param securityAttributeNamespaceId the value to set
         * @return this builder
         */
        public Builder securityAttributeNamespaceId(String securityAttributeNamespaceId) {
            this.securityAttributeNamespaceId = securityAttributeNamespaceId;
            this.__explicitlySet__.add("securityAttributeNamespaceId");
            return this;
        }
        /** The name of the security attribute namespace that contains the security attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributeNamespaceName")
        private String securityAttributeNamespaceName;

        /**
         * The name of the security attribute namespace that contains the security attribute.
         *
         * @param securityAttributeNamespaceName the value to set
         * @return this builder
         */
        public Builder securityAttributeNamespaceName(String securityAttributeNamespaceName) {
            this.securityAttributeNamespaceName = securityAttributeNamespaceName;
            this.__explicitlySet__.add("securityAttributeNamespaceName");
            return this;
        }
        /** The OCID of the security attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the security attribute.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The name assigned to the security attribute during creation. This is the security
         * attribute. The name must be unique within the security attribute namespace and cannot be
         * changed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name assigned to the security attribute during creation. This is the security
         * attribute. The name must be unique within the security attribute namespace and cannot be
         * changed.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The description you assign to the security attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description you assign to the security attribute.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The data type of the security attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * The data type of the security attribute.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Whether the security attribute is retired. See [Managing Security
         * Attributes](https://docs.cloud.oracle.com/Content/zero-trust-packet-routing/managing-security-attributes.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRetired")
        private Boolean isRetired;

        /**
         * Whether the security attribute is retired. See [Managing Security
         * Attributes](https://docs.cloud.oracle.com/Content/zero-trust-packet-routing/managing-security-attributes.htm).
         *
         * @param isRetired the value to set
         * @return this builder
         */
        public Builder isRetired(Boolean isRetired) {
            this.isRetired = isRetired;
            this.__explicitlySet__.add("isRetired");
            return this;
        }
        /**
         * The security attribute's current state. After creating a security attribute, make sure
         * its {@code lifecycleState} is ACTIVE before using it. After retiring a security
         * attribute, make sure its {@code lifecycleState} is INACTIVE before using it. If you
         * delete a security attribute, you cannot delete another security attribute until the
         * deleted security attribute's {@code lifecycleState} changes from DELETING to DELETED.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private SecurityAttribute.LifecycleState lifecycleState;

        /**
         * The security attribute's current state. After creating a security attribute, make sure
         * its {@code lifecycleState} is ACTIVE before using it. After retiring a security
         * attribute, make sure its {@code lifecycleState} is INACTIVE before using it. If you
         * delete a security attribute, you cannot delete another security attribute until the
         * deleted security attribute's {@code lifecycleState} changes from DELETING to DELETED.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(SecurityAttribute.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Date and time the security attribute was created, in the format defined by RFC3339.
         * Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time the security attribute was created, in the format defined by RFC3339.
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityAttributeSummary build() {
            SecurityAttributeSummary model =
                    new SecurityAttributeSummary(
                            this.compartmentId,
                            this.securityAttributeNamespaceId,
                            this.securityAttributeNamespaceName,
                            this.id,
                            this.name,
                            this.description,
                            this.type,
                            this.isRetired,
                            this.lifecycleState,
                            this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityAttributeSummary model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("securityAttributeNamespaceId")) {
                this.securityAttributeNamespaceId(model.getSecurityAttributeNamespaceId());
            }
            if (model.wasPropertyExplicitlySet("securityAttributeNamespaceName")) {
                this.securityAttributeNamespaceName(model.getSecurityAttributeNamespaceName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("isRetired")) {
                this.isRetired(model.getIsRetired());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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

    /** The OCID of the compartment that contains the security attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the security attribute.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The OCID of the namespace that contains the security attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributeNamespaceId")
    private final String securityAttributeNamespaceId;

    /**
     * The OCID of the namespace that contains the security attribute.
     *
     * @return the value
     */
    public String getSecurityAttributeNamespaceId() {
        return securityAttributeNamespaceId;
    }

    /** The name of the security attribute namespace that contains the security attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributeNamespaceName")
    private final String securityAttributeNamespaceName;

    /**
     * The name of the security attribute namespace that contains the security attribute.
     *
     * @return the value
     */
    public String getSecurityAttributeNamespaceName() {
        return securityAttributeNamespaceName;
    }

    /** The OCID of the security attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the security attribute.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The name assigned to the security attribute during creation. This is the security attribute.
     * The name must be unique within the security attribute namespace and cannot be changed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name assigned to the security attribute during creation. This is the security attribute.
     * The name must be unique within the security attribute namespace and cannot be changed.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The description you assign to the security attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description you assign to the security attribute.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The data type of the security attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The data type of the security attribute.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /**
     * Whether the security attribute is retired. See [Managing Security
     * Attributes](https://docs.cloud.oracle.com/Content/zero-trust-packet-routing/managing-security-attributes.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRetired")
    private final Boolean isRetired;

    /**
     * Whether the security attribute is retired. See [Managing Security
     * Attributes](https://docs.cloud.oracle.com/Content/zero-trust-packet-routing/managing-security-attributes.htm).
     *
     * @return the value
     */
    public Boolean getIsRetired() {
        return isRetired;
    }

    /**
     * The security attribute's current state. After creating a security attribute, make sure its
     * {@code lifecycleState} is ACTIVE before using it. After retiring a security attribute, make
     * sure its {@code lifecycleState} is INACTIVE before using it. If you delete a security
     * attribute, you cannot delete another security attribute until the deleted security
     * attribute's {@code lifecycleState} changes from DELETING to DELETED.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final SecurityAttribute.LifecycleState lifecycleState;

    /**
     * The security attribute's current state. After creating a security attribute, make sure its
     * {@code lifecycleState} is ACTIVE before using it. After retiring a security attribute, make
     * sure its {@code lifecycleState} is INACTIVE before using it. If you delete a security
     * attribute, you cannot delete another security attribute until the deleted security
     * attribute's {@code lifecycleState} changes from DELETING to DELETED.
     *
     * @return the value
     */
    public SecurityAttribute.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Date and time the security attribute was created, in the format defined by RFC3339. Example:
     * {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time the security attribute was created, in the format defined by RFC3339. Example:
     * {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("SecurityAttributeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", securityAttributeNamespaceId=")
                .append(String.valueOf(this.securityAttributeNamespaceId));
        sb.append(", securityAttributeNamespaceName=")
                .append(String.valueOf(this.securityAttributeNamespaceName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", isRetired=").append(String.valueOf(this.isRetired));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecurityAttributeSummary)) {
            return false;
        }

        SecurityAttributeSummary other = (SecurityAttributeSummary) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.securityAttributeNamespaceId, other.securityAttributeNamespaceId)
                && java.util.Objects.equals(
                        this.securityAttributeNamespaceName, other.securityAttributeNamespaceName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.isRetired, other.isRetired)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributeNamespaceId == null
                                ? 43
                                : this.securityAttributeNamespaceId.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributeNamespaceName == null
                                ? 43
                                : this.securityAttributeNamespaceName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.isRetired == null ? 43 : this.isRetired.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details of the association.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Association.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Association extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "timeCreated",
        "lifecycleState",
        "certificatesResourceId",
        "associatedResourceId",
        "compartmentId",
        "associationType"
    })
    public Association(
            String id,
            String name,
            java.util.Date timeCreated,
            AssociationLifecycleState lifecycleState,
            String certificatesResourceId,
            String associatedResourceId,
            String compartmentId,
            AssociationType associationType) {
        super();
        this.id = id;
        this.name = name;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.certificatesResourceId = certificatesResourceId;
        this.associatedResourceId = associatedResourceId;
        this.compartmentId = compartmentId;
        this.associationType = associationType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the association.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the association.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A user-friendly name generated by the service for the association, expressed in a format that follows the pattern: [certificatesResourceEntityType]-[associatedResourceEntityType]-UUID.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A user-friendly name generated by the service for the association, expressed in a format that follows the pattern: [certificatesResourceEntityType]-[associatedResourceEntityType]-UUID.
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
         * A property indicating when the association was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2019-04-03T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * A property indicating when the association was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2019-04-03T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The current lifecycle state of the association.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AssociationLifecycleState lifecycleState;

        /**
         * The current lifecycle state of the association.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(AssociationLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The OCID of the certificate-related resource associated with another Oracle Cloud Infrastructure resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificatesResourceId")
        private String certificatesResourceId;

        /**
         * The OCID of the certificate-related resource associated with another Oracle Cloud Infrastructure resource.
         * @param certificatesResourceId the value to set
         * @return this builder
         **/
        public Builder certificatesResourceId(String certificatesResourceId) {
            this.certificatesResourceId = certificatesResourceId;
            this.__explicitlySet__.add("certificatesResourceId");
            return this;
        }
        /**
         * The OCID of the associated resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("associatedResourceId")
        private String associatedResourceId;

        /**
         * The OCID of the associated resource.
         * @param associatedResourceId the value to set
         * @return this builder
         **/
        public Builder associatedResourceId(String associatedResourceId) {
            this.associatedResourceId = associatedResourceId;
            this.__explicitlySet__.add("associatedResourceId");
            return this;
        }
        /**
         * The compartment OCID of the association, which is strongly tied to the compartment OCID of the certificate-related resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment OCID of the association, which is strongly tied to the compartment OCID of the certificate-related resource.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Type of the association.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("associationType")
        private AssociationType associationType;

        /**
         * Type of the association.
         * @param associationType the value to set
         * @return this builder
         **/
        public Builder associationType(AssociationType associationType) {
            this.associationType = associationType;
            this.__explicitlySet__.add("associationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Association build() {
            Association model =
                    new Association(
                            this.id,
                            this.name,
                            this.timeCreated,
                            this.lifecycleState,
                            this.certificatesResourceId,
                            this.associatedResourceId,
                            this.compartmentId,
                            this.associationType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Association model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("certificatesResourceId")) {
                this.certificatesResourceId(model.getCertificatesResourceId());
            }
            if (model.wasPropertyExplicitlySet("associatedResourceId")) {
                this.associatedResourceId(model.getAssociatedResourceId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("associationType")) {
                this.associationType(model.getAssociationType());
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
     * The OCID of the association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the association.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * A user-friendly name generated by the service for the association, expressed in a format that follows the pattern: [certificatesResourceEntityType]-[associatedResourceEntityType]-UUID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A user-friendly name generated by the service for the association, expressed in a format that follows the pattern: [certificatesResourceEntityType]-[associatedResourceEntityType]-UUID.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * A property indicating when the association was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * A property indicating when the association was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The current lifecycle state of the association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AssociationLifecycleState lifecycleState;

    /**
     * The current lifecycle state of the association.
     * @return the value
     **/
    public AssociationLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The OCID of the certificate-related resource associated with another Oracle Cloud Infrastructure resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificatesResourceId")
    private final String certificatesResourceId;

    /**
     * The OCID of the certificate-related resource associated with another Oracle Cloud Infrastructure resource.
     * @return the value
     **/
    public String getCertificatesResourceId() {
        return certificatesResourceId;
    }

    /**
     * The OCID of the associated resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associatedResourceId")
    private final String associatedResourceId;

    /**
     * The OCID of the associated resource.
     * @return the value
     **/
    public String getAssociatedResourceId() {
        return associatedResourceId;
    }

    /**
     * The compartment OCID of the association, which is strongly tied to the compartment OCID of the certificate-related resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment OCID of the association, which is strongly tied to the compartment OCID of the certificate-related resource.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Type of the association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associationType")
    private final AssociationType associationType;

    /**
     * Type of the association.
     * @return the value
     **/
    public AssociationType getAssociationType() {
        return associationType;
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
        sb.append("Association(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", certificatesResourceId=").append(String.valueOf(this.certificatesResourceId));
        sb.append(", associatedResourceId=").append(String.valueOf(this.associatedResourceId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", associationType=").append(String.valueOf(this.associationType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Association)) {
            return false;
        }

        Association other = (Association) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.certificatesResourceId, other.certificatesResourceId)
                && java.util.Objects.equals(this.associatedResourceId, other.associatedResourceId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.associationType, other.associationType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.certificatesResourceId == null
                                ? 43
                                : this.certificatesResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedResourceId == null
                                ? 43
                                : this.associatedResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.associationType == null ? 43 : this.associationType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

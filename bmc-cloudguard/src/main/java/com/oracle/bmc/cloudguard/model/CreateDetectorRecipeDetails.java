/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Create of Detector recipe.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDetectorRecipeDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDetectorRecipeDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "detector",
        "sourceDetectorRecipeId",
        "compartmentId",
        "detectorRules",
        "freeformTags",
        "definedTags"
    })
    public CreateDetectorRecipeDetails(
            String displayName,
            String description,
            DetectorEnum detector,
            String sourceDetectorRecipeId,
            String compartmentId,
            java.util.List<UpdateDetectorRecipeDetectorRule> detectorRules,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.detector = detector;
        this.sourceDetectorRecipeId = sourceDetectorRecipeId;
        this.compartmentId = compartmentId;
        this.detectorRules = detectorRules;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Detector recipe display name.
         * <p>
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Detector recipe display name.
         * <p>
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Detector recipe description.
         * <p>
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detector recipe description.
         * <p>
         * Avoid entering confidential information.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * detector for the rule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("detector")
        private DetectorEnum detector;

        /**
         * detector for the rule
         * @param detector the value to set
         * @return this builder
         **/
        public Builder detector(DetectorEnum detector) {
            this.detector = detector;
            this.__explicitlySet__.add("detector");
            return this;
        }
        /**
         * The id of the source detector recipe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDetectorRecipeId")
        private String sourceDetectorRecipeId;

        /**
         * The id of the source detector recipe.
         * @param sourceDetectorRecipeId the value to set
         * @return this builder
         **/
        public Builder sourceDetectorRecipeId(String sourceDetectorRecipeId) {
            this.sourceDetectorRecipeId = sourceDetectorRecipeId;
            this.__explicitlySet__.add("sourceDetectorRecipeId");
            return this;
        }
        /**
         * Compartment Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Detector Rules to override from source detector recipe
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("detectorRules")
        private java.util.List<UpdateDetectorRecipeDetectorRule> detectorRules;

        /**
         * Detector Rules to override from source detector recipe
         * @param detectorRules the value to set
         * @return this builder
         **/
        public Builder detectorRules(
                java.util.List<UpdateDetectorRecipeDetectorRule> detectorRules) {
            this.detectorRules = detectorRules;
            this.__explicitlySet__.add("detectorRules");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         * <p>
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         * <p>
         * Avoid entering confidential information.
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDetectorRecipeDetails build() {
            CreateDetectorRecipeDetails model =
                    new CreateDetectorRecipeDetails(
                            this.displayName,
                            this.description,
                            this.detector,
                            this.sourceDetectorRecipeId,
                            this.compartmentId,
                            this.detectorRules,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDetectorRecipeDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("detector")) {
                this.detector(model.getDetector());
            }
            if (model.wasPropertyExplicitlySet("sourceDetectorRecipeId")) {
                this.sourceDetectorRecipeId(model.getSourceDetectorRecipeId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("detectorRules")) {
                this.detectorRules(model.getDetectorRules());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * Detector recipe display name.
     * <p>
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Detector recipe display name.
     * <p>
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Detector recipe description.
     * <p>
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detector recipe description.
     * <p>
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * detector for the rule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detector")
    private final DetectorEnum detector;

    /**
     * detector for the rule
     * @return the value
     **/
    public DetectorEnum getDetector() {
        return detector;
    }

    /**
     * The id of the source detector recipe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDetectorRecipeId")
    private final String sourceDetectorRecipeId;

    /**
     * The id of the source detector recipe.
     * @return the value
     **/
    public String getSourceDetectorRecipeId() {
        return sourceDetectorRecipeId;
    }

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Detector Rules to override from source detector recipe
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detectorRules")
    private final java.util.List<UpdateDetectorRecipeDetectorRule> detectorRules;

    /**
     * Detector Rules to override from source detector recipe
     * @return the value
     **/
    public java.util.List<UpdateDetectorRecipeDetectorRule> getDetectorRules() {
        return detectorRules;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     * <p>
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     * <p>
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateDetectorRecipeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", detector=").append(String.valueOf(this.detector));
        sb.append(", sourceDetectorRecipeId=").append(String.valueOf(this.sourceDetectorRecipeId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", detectorRules=").append(String.valueOf(this.detectorRules));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDetectorRecipeDetails)) {
            return false;
        }

        CreateDetectorRecipeDetails other = (CreateDetectorRecipeDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.detector, other.detector)
                && java.util.Objects.equals(
                        this.sourceDetectorRecipeId, other.sourceDetectorRecipeId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.detectorRules, other.detectorRules)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.detector == null ? 43 : this.detector.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDetectorRecipeId == null
                                ? 43
                                : this.sourceDetectorRecipeId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.detectorRules == null ? 43 : this.detectorRules.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

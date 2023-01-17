/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.model;

/**
 * The object used to update announcement email preferences.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateAnnouncementsPreferencesDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateAnnouncementsPreferencesDetails
        extends BaseCreateAnnouncementsPreferencesDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isUnsubscribed")
        private Boolean isUnsubscribed;

        public Builder isUnsubscribed(Boolean isUnsubscribed) {
            this.isUnsubscribed = isUnsubscribed;
            this.__explicitlySet__.add("isUnsubscribed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("preferenceType")
        private PreferenceType preferenceType;

        public Builder preferenceType(PreferenceType preferenceType) {
            this.preferenceType = preferenceType;
            this.__explicitlySet__.add("preferenceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("preferredTimeZone")
        private String preferredTimeZone;

        public Builder preferredTimeZone(String preferredTimeZone) {
            this.preferredTimeZone = preferredTimeZone;
            this.__explicitlySet__.add("preferredTimeZone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAnnouncementsPreferencesDetails build() {
            UpdateAnnouncementsPreferencesDetails model =
                    new UpdateAnnouncementsPreferencesDetails(
                            this.isUnsubscribed,
                            this.compartmentId,
                            this.preferenceType,
                            this.preferredTimeZone);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAnnouncementsPreferencesDetails model) {
            if (model.wasPropertyExplicitlySet("isUnsubscribed")) {
                this.isUnsubscribed(model.getIsUnsubscribed());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("preferenceType")) {
                this.preferenceType(model.getPreferenceType());
            }
            if (model.wasPropertyExplicitlySet("preferredTimeZone")) {
                this.preferredTimeZone(model.getPreferredTimeZone());
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

    @Deprecated
    public UpdateAnnouncementsPreferencesDetails(
            Boolean isUnsubscribed,
            String compartmentId,
            PreferenceType preferenceType,
            String preferredTimeZone) {
        super(isUnsubscribed, compartmentId, preferenceType, preferredTimeZone);
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
        sb.append("UpdateAnnouncementsPreferencesDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAnnouncementsPreferencesDetails)) {
            return false;
        }

        UpdateAnnouncementsPreferencesDetails other = (UpdateAnnouncementsPreferencesDetails) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }
}

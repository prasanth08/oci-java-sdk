/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * List of recommendation categories
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AddmDbRecommendationCategoryCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AddmDbRecommendationCategoryCollection
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"databaseDetailsItems", "items"})
    public AddmDbRecommendationCategoryCollection(
            java.util.List<DatabaseDetails> databaseDetailsItems,
            java.util.List<AddmDbRecommendationCategorySummary> items) {
        super();
        this.databaseDetailsItems = databaseDetailsItems;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of database details data
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseDetailsItems")
        private java.util.List<DatabaseDetails> databaseDetailsItems;

        /**
         * List of database details data
         * @param databaseDetailsItems the value to set
         * @return this builder
         **/
        public Builder databaseDetailsItems(java.util.List<DatabaseDetails> databaseDetailsItems) {
            this.databaseDetailsItems = databaseDetailsItems;
            this.__explicitlySet__.add("databaseDetailsItems");
            return this;
        }
        /**
         * List of recommendation categories
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<AddmDbRecommendationCategorySummary> items;

        /**
         * List of recommendation categories
         * @param items the value to set
         * @return this builder
         **/
        public Builder items(java.util.List<AddmDbRecommendationCategorySummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddmDbRecommendationCategoryCollection build() {
            AddmDbRecommendationCategoryCollection model =
                    new AddmDbRecommendationCategoryCollection(
                            this.databaseDetailsItems, this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddmDbRecommendationCategoryCollection model) {
            if (model.wasPropertyExplicitlySet("databaseDetailsItems")) {
                this.databaseDetailsItems(model.getDatabaseDetailsItems());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
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
     * List of database details data
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseDetailsItems")
    private final java.util.List<DatabaseDetails> databaseDetailsItems;

    /**
     * List of database details data
     * @return the value
     **/
    public java.util.List<DatabaseDetails> getDatabaseDetailsItems() {
        return databaseDetailsItems;
    }

    /**
     * List of recommendation categories
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<AddmDbRecommendationCategorySummary> items;

    /**
     * List of recommendation categories
     * @return the value
     **/
    public java.util.List<AddmDbRecommendationCategorySummary> getItems() {
        return items;
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
        sb.append("AddmDbRecommendationCategoryCollection(");
        sb.append("super=").append(super.toString());
        sb.append("databaseDetailsItems=").append(String.valueOf(this.databaseDetailsItems));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddmDbRecommendationCategoryCollection)) {
            return false;
        }

        AddmDbRecommendationCategoryCollection other = (AddmDbRecommendationCategoryCollection) o;
        return java.util.Objects.equals(this.databaseDetailsItems, other.databaseDetailsItems)
                && java.util.Objects.equals(this.items, other.items)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.databaseDetailsItems == null
                                ? 43
                                : this.databaseDetailsItems.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
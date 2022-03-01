/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The data preview request payload.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDataPreviewDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateDataPreviewDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("readOperationConfig")
        private ReadOperationConfig readOperationConfig;

        public Builder readOperationConfig(ReadOperationConfig readOperationConfig) {
            this.readOperationConfig = readOperationConfig;
            this.__explicitlySet__.add("readOperationConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataAsset")
        private DataAsset dataAsset;

        public Builder dataAsset(DataAsset dataAsset) {
            this.dataAsset = dataAsset;
            this.__explicitlySet__.add("dataAsset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connection")
        private Connection connection;

        public Builder connection(Connection connection) {
            this.connection = connection;
            this.__explicitlySet__.add("connection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private Schema schema;

        public Builder schema(Schema schema) {
            this.schema = schema;
            this.__explicitlySet__.add("schema");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataEntity")
        private DataEntity dataEntity;

        public Builder dataEntity(DataEntity dataEntity) {
            this.dataEntity = dataEntity;
            this.__explicitlySet__.add("dataEntity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDataPreviewDetails build() {
            CreateDataPreviewDetails __instance__ =
                    new CreateDataPreviewDetails(
                            readOperationConfig, dataAsset, connection, schema, dataEntity);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDataPreviewDetails o) {
            Builder copiedBuilder =
                    readOperationConfig(o.getReadOperationConfig())
                            .dataAsset(o.getDataAsset())
                            .connection(o.getConnection())
                            .schema(o.getSchema())
                            .dataEntity(o.getDataEntity());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @com.fasterxml.jackson.annotation.JsonProperty("readOperationConfig")
    ReadOperationConfig readOperationConfig;

    @com.fasterxml.jackson.annotation.JsonProperty("dataAsset")
    DataAsset dataAsset;

    @com.fasterxml.jackson.annotation.JsonProperty("connection")
    Connection connection;

    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    Schema schema;

    @com.fasterxml.jackson.annotation.JsonProperty("dataEntity")
    DataEntity dataEntity;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
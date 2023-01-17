/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Update details for a Bitbucket Cloud configuration source.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateBitbucketCloudConfigSourceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configSourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateBitbucketCloudConfigSourceDetails extends UpdateConfigSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("workingDirectory")
        private String workingDirectory;

        public Builder workingDirectory(String workingDirectory) {
            this.workingDirectory = workingDirectory;
            this.__explicitlySet__.add("workingDirectory");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Bitbucket Cloud configuration source.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configurationSourceProviderId")
        private String configurationSourceProviderId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Bitbucket Cloud configuration source.
         *
         * @param configurationSourceProviderId the value to set
         * @return this builder
         **/
        public Builder configurationSourceProviderId(String configurationSourceProviderId) {
            this.configurationSourceProviderId = configurationSourceProviderId;
            this.__explicitlySet__.add("configurationSourceProviderId");
            return this;
        }
        /**
         * The URL of the Bitbucket Cloud repository for the configuration source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
        private String repositoryUrl;

        /**
         * The URL of the Bitbucket Cloud repository for the configuration source.
         * @param repositoryUrl the value to set
         * @return this builder
         **/
        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            this.__explicitlySet__.add("repositoryUrl");
            return this;
        }
        /**
         * The name of the branch in the Bitbucket Cloud repository for the configuration source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("branchName")
        private String branchName;

        /**
         * The name of the branch in the Bitbucket Cloud repository for the configuration source.
         * @param branchName the value to set
         * @return this builder
         **/
        public Builder branchName(String branchName) {
            this.branchName = branchName;
            this.__explicitlySet__.add("branchName");
            return this;
        }
        /**
         * The id of the workspace in Bitbucket Cloud for the configuration source
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workspaceId")
        private String workspaceId;

        /**
         * The id of the workspace in Bitbucket Cloud for the configuration source
         * @param workspaceId the value to set
         * @return this builder
         **/
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            this.__explicitlySet__.add("workspaceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBitbucketCloudConfigSourceDetails build() {
            UpdateBitbucketCloudConfigSourceDetails model =
                    new UpdateBitbucketCloudConfigSourceDetails(
                            this.workingDirectory,
                            this.configurationSourceProviderId,
                            this.repositoryUrl,
                            this.branchName,
                            this.workspaceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBitbucketCloudConfigSourceDetails model) {
            if (model.wasPropertyExplicitlySet("workingDirectory")) {
                this.workingDirectory(model.getWorkingDirectory());
            }
            if (model.wasPropertyExplicitlySet("configurationSourceProviderId")) {
                this.configurationSourceProviderId(model.getConfigurationSourceProviderId());
            }
            if (model.wasPropertyExplicitlySet("repositoryUrl")) {
                this.repositoryUrl(model.getRepositoryUrl());
            }
            if (model.wasPropertyExplicitlySet("branchName")) {
                this.branchName(model.getBranchName());
            }
            if (model.wasPropertyExplicitlySet("workspaceId")) {
                this.workspaceId(model.getWorkspaceId());
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
    public UpdateBitbucketCloudConfigSourceDetails(
            String workingDirectory,
            String configurationSourceProviderId,
            String repositoryUrl,
            String branchName,
            String workspaceId) {
        super(workingDirectory);
        this.configurationSourceProviderId = configurationSourceProviderId;
        this.repositoryUrl = repositoryUrl;
        this.branchName = branchName;
        this.workspaceId = workspaceId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Bitbucket Cloud configuration source.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configurationSourceProviderId")
    private final String configurationSourceProviderId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Bitbucket Cloud configuration source.
     *
     * @return the value
     **/
    public String getConfigurationSourceProviderId() {
        return configurationSourceProviderId;
    }

    /**
     * The URL of the Bitbucket Cloud repository for the configuration source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
    private final String repositoryUrl;

    /**
     * The URL of the Bitbucket Cloud repository for the configuration source.
     * @return the value
     **/
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    /**
     * The name of the branch in the Bitbucket Cloud repository for the configuration source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("branchName")
    private final String branchName;

    /**
     * The name of the branch in the Bitbucket Cloud repository for the configuration source.
     * @return the value
     **/
    public String getBranchName() {
        return branchName;
    }

    /**
     * The id of the workspace in Bitbucket Cloud for the configuration source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceId")
    private final String workspaceId;

    /**
     * The id of the workspace in Bitbucket Cloud for the configuration source
     * @return the value
     **/
    public String getWorkspaceId() {
        return workspaceId;
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
        sb.append("UpdateBitbucketCloudConfigSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", configurationSourceProviderId=")
                .append(String.valueOf(this.configurationSourceProviderId));
        sb.append(", repositoryUrl=").append(String.valueOf(this.repositoryUrl));
        sb.append(", branchName=").append(String.valueOf(this.branchName));
        sb.append(", workspaceId=").append(String.valueOf(this.workspaceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateBitbucketCloudConfigSourceDetails)) {
            return false;
        }

        UpdateBitbucketCloudConfigSourceDetails other = (UpdateBitbucketCloudConfigSourceDetails) o;
        return java.util.Objects.equals(
                        this.configurationSourceProviderId, other.configurationSourceProviderId)
                && java.util.Objects.equals(this.repositoryUrl, other.repositoryUrl)
                && java.util.Objects.equals(this.branchName, other.branchName)
                && java.util.Objects.equals(this.workspaceId, other.workspaceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.configurationSourceProviderId == null
                                ? 43
                                : this.configurationSourceProviderId.hashCode());
        result =
                (result * PRIME)
                        + (this.repositoryUrl == null ? 43 : this.repositoryUrl.hashCode());
        result = (result * PRIME) + (this.branchName == null ? 43 : this.branchName.hashCode());
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        return result;
    }
}

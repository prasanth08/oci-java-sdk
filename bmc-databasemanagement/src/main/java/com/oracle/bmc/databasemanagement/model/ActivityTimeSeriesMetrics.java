/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The response object representing activityMetric details for a specific Managed Database at a
 * particular time. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ActivityTimeSeriesMetrics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ActivityTimeSeriesMetrics
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timestamp",
        "cpuTime",
        "waitTime",
        "userIoTime",
        "cpuCount",
        "cluster"
    })
    public ActivityTimeSeriesMetrics(
            java.util.Date timestamp,
            MetricDataPoint cpuTime,
            MetricDataPoint waitTime,
            MetricDataPoint userIoTime,
            MetricDataPoint cpuCount,
            MetricDataPoint cluster) {
        super();
        this.timestamp = timestamp;
        this.cpuTime = cpuTime;
        this.waitTime = waitTime;
        this.userIoTime = userIoTime;
        this.cpuCount = cpuCount;
        this.cluster = cluster;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The date and time the activity metric was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The date and time the activity metric was created.
         *
         * @param timestamp the value to set
         * @return this builder
         */
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuTime")
        private MetricDataPoint cpuTime;

        public Builder cpuTime(MetricDataPoint cpuTime) {
            this.cpuTime = cpuTime;
            this.__explicitlySet__.add("cpuTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("waitTime")
        private MetricDataPoint waitTime;

        public Builder waitTime(MetricDataPoint waitTime) {
            this.waitTime = waitTime;
            this.__explicitlySet__.add("waitTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userIoTime")
        private MetricDataPoint userIoTime;

        public Builder userIoTime(MetricDataPoint userIoTime) {
            this.userIoTime = userIoTime;
            this.__explicitlySet__.add("userIoTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
        private MetricDataPoint cpuCount;

        public Builder cpuCount(MetricDataPoint cpuCount) {
            this.cpuCount = cpuCount;
            this.__explicitlySet__.add("cpuCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cluster")
        private MetricDataPoint cluster;

        public Builder cluster(MetricDataPoint cluster) {
            this.cluster = cluster;
            this.__explicitlySet__.add("cluster");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ActivityTimeSeriesMetrics build() {
            ActivityTimeSeriesMetrics model =
                    new ActivityTimeSeriesMetrics(
                            this.timestamp,
                            this.cpuTime,
                            this.waitTime,
                            this.userIoTime,
                            this.cpuCount,
                            this.cluster);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActivityTimeSeriesMetrics model) {
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("cpuTime")) {
                this.cpuTime(model.getCpuTime());
            }
            if (model.wasPropertyExplicitlySet("waitTime")) {
                this.waitTime(model.getWaitTime());
            }
            if (model.wasPropertyExplicitlySet("userIoTime")) {
                this.userIoTime(model.getUserIoTime());
            }
            if (model.wasPropertyExplicitlySet("cpuCount")) {
                this.cpuCount(model.getCpuCount());
            }
            if (model.wasPropertyExplicitlySet("cluster")) {
                this.cluster(model.getCluster());
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

    /** The date and time the activity metric was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The date and time the activity metric was created.
     *
     * @return the value
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cpuTime")
    private final MetricDataPoint cpuTime;

    public MetricDataPoint getCpuTime() {
        return cpuTime;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("waitTime")
    private final MetricDataPoint waitTime;

    public MetricDataPoint getWaitTime() {
        return waitTime;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("userIoTime")
    private final MetricDataPoint userIoTime;

    public MetricDataPoint getUserIoTime() {
        return userIoTime;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
    private final MetricDataPoint cpuCount;

    public MetricDataPoint getCpuCount() {
        return cpuCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cluster")
    private final MetricDataPoint cluster;

    public MetricDataPoint getCluster() {
        return cluster;
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
        sb.append("ActivityTimeSeriesMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", cpuTime=").append(String.valueOf(this.cpuTime));
        sb.append(", waitTime=").append(String.valueOf(this.waitTime));
        sb.append(", userIoTime=").append(String.valueOf(this.userIoTime));
        sb.append(", cpuCount=").append(String.valueOf(this.cpuCount));
        sb.append(", cluster=").append(String.valueOf(this.cluster));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActivityTimeSeriesMetrics)) {
            return false;
        }

        ActivityTimeSeriesMetrics other = (ActivityTimeSeriesMetrics) o;
        return java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.cpuTime, other.cpuTime)
                && java.util.Objects.equals(this.waitTime, other.waitTime)
                && java.util.Objects.equals(this.userIoTime, other.userIoTime)
                && java.util.Objects.equals(this.cpuCount, other.cpuCount)
                && java.util.Objects.equals(this.cluster, other.cluster)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.cpuTime == null ? 43 : this.cpuTime.hashCode());
        result = (result * PRIME) + (this.waitTime == null ? 43 : this.waitTime.hashCode());
        result = (result * PRIME) + (this.userIoTime == null ? 43 : this.userIoTime.hashCode());
        result = (result * PRIME) + (this.cpuCount == null ? 43 : this.cpuCount.hashCode());
        result = (result * PRIME) + (this.cluster == null ? 43 : this.cluster.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Represents the metadata of a Java Message Service Connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = JavaMessageServiceConnection.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JavaMessageServiceConnection extends Connection {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ingressIps")
        private java.util.List<IngressIpDetails> ingressIps;

        public Builder ingressIps(java.util.List<IngressIpDetails> ingressIps) {
            this.ingressIps = ingressIps;
            this.__explicitlySet__.add("ingressIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /** The Java Message Service technology type. */
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private TechnologyType technologyType;

        /**
         * The Java Message Service technology type.
         *
         * @param technologyType the value to set
         * @return this builder
         */
        public Builder technologyType(TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /**
         * If set to true, Java Naming and Directory Interface (JNDI) properties should be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldUseJndi")
        private Boolean shouldUseJndi;

        /**
         * If set to true, Java Naming and Directory Interface (JNDI) properties should be provided.
         *
         * @param shouldUseJndi the value to set
         * @return this builder
         */
        public Builder shouldUseJndi(Boolean shouldUseJndi) {
            this.shouldUseJndi = shouldUseJndi;
            this.__explicitlySet__.add("shouldUseJndi");
            return this;
        }
        /** The Connection Factory can be looked up using this name. e.g.: 'ConnectionFactory' */
        @com.fasterxml.jackson.annotation.JsonProperty("jndiConnectionFactory")
        private String jndiConnectionFactory;

        /**
         * The Connection Factory can be looked up using this name. e.g.: 'ConnectionFactory'
         *
         * @param jndiConnectionFactory the value to set
         * @return this builder
         */
        public Builder jndiConnectionFactory(String jndiConnectionFactory) {
            this.jndiConnectionFactory = jndiConnectionFactory;
            this.__explicitlySet__.add("jndiConnectionFactory");
            return this;
        }
        /**
         * The URL that Java Message Service will use to contact the JNDI provider. e.g.:
         * 'tcp://myjms.host.domain:61616?jms.prefetchPolicy.all=1000'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jndiProviderUrl")
        private String jndiProviderUrl;

        /**
         * The URL that Java Message Service will use to contact the JNDI provider. e.g.:
         * 'tcp://myjms.host.domain:61616?jms.prefetchPolicy.all=1000'
         *
         * @param jndiProviderUrl the value to set
         * @return this builder
         */
        public Builder jndiProviderUrl(String jndiProviderUrl) {
            this.jndiProviderUrl = jndiProviderUrl;
            this.__explicitlySet__.add("jndiProviderUrl");
            return this;
        }
        /**
         * The implementation of javax.naming.spi.InitialContextFactory interface that the client
         * uses to obtain initial naming context. e.g.:
         * 'org.apache.activemq.jndi.ActiveMQInitialContextFactory'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jndiInitialContextFactory")
        private String jndiInitialContextFactory;

        /**
         * The implementation of javax.naming.spi.InitialContextFactory interface that the client
         * uses to obtain initial naming context. e.g.:
         * 'org.apache.activemq.jndi.ActiveMQInitialContextFactory'
         *
         * @param jndiInitialContextFactory the value to set
         * @return this builder
         */
        public Builder jndiInitialContextFactory(String jndiInitialContextFactory) {
            this.jndiInitialContextFactory = jndiInitialContextFactory;
            this.__explicitlySet__.add("jndiInitialContextFactory");
            return this;
        }
        /** Specifies the identity of the principal (user) to be authenticated. e.g.: 'admin2' */
        @com.fasterxml.jackson.annotation.JsonProperty("jndiSecurityPrincipal")
        private String jndiSecurityPrincipal;

        /**
         * Specifies the identity of the principal (user) to be authenticated. e.g.: 'admin2'
         *
         * @param jndiSecurityPrincipal the value to set
         * @return this builder
         */
        public Builder jndiSecurityPrincipal(String jndiSecurityPrincipal) {
            this.jndiSecurityPrincipal = jndiSecurityPrincipal;
            this.__explicitlySet__.add("jndiSecurityPrincipal");
            return this;
        }
        /**
         * Connectin URL of the Java Message Service, specifying the protocol, host, and port. e.g.:
         * 'mq://myjms.host.domain:7676'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionUrl")
        private String connectionUrl;

        /**
         * Connectin URL of the Java Message Service, specifying the protocol, host, and port. e.g.:
         * 'mq://myjms.host.domain:7676'
         *
         * @param connectionUrl the value to set
         * @return this builder
         */
        public Builder connectionUrl(String connectionUrl) {
            this.connectionUrl = connectionUrl;
            this.__explicitlySet__.add("connectionUrl");
            return this;
        }
        /**
         * The of Java class implementing javax.jms.ConnectionFactory interface supplied by the Java
         * Message Service provider. e.g.: 'com.stc.jmsjca.core.JConnectionFactoryXA'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionFactory")
        private String connectionFactory;

        /**
         * The of Java class implementing javax.jms.ConnectionFactory interface supplied by the Java
         * Message Service provider. e.g.: 'com.stc.jmsjca.core.JConnectionFactoryXA'
         *
         * @param connectionFactory the value to set
         * @return this builder
         */
        public Builder connectionFactory(String connectionFactory) {
            this.connectionFactory = connectionFactory;
            this.__explicitlySet__.add("connectionFactory");
            return this;
        }
        /**
         * The username Oracle GoldenGate uses to connect to the Java Message Service. This username
         * must already exist and be available by the Java Message Service to be connected to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username Oracle GoldenGate uses to connect to the Java Message Service. This username
         * must already exist and be available by the Java Message Service to be connected to.
         *
         * @param username the value to set
         * @return this builder
         */
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /**
         * The private IP address of the connection's endpoint in the customer's VCN, typically a
         * database endpoint or a big data endpoint (e.g. Kafka bootstrap server). In case the
         * privateIp is provided, the subnetId must also be provided. In case the privateIp (and the
         * subnetId) is not provided it is assumed the datasource is publicly accessible. In case
         * the connection is accessible only privately, the lack of privateIp will result in not
         * being able to access the connection.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
        private String privateIp;

        /**
         * The private IP address of the connection's endpoint in the customer's VCN, typically a
         * database endpoint or a big data endpoint (e.g. Kafka bootstrap server). In case the
         * privateIp is provided, the subnetId must also be provided. In case the privateIp (and the
         * subnetId) is not provided it is assumed the datasource is publicly accessible. In case
         * the connection is accessible only privately, the lack of privateIp will result in not
         * being able to access the connection.
         *
         * @param privateIp the value to set
         * @return this builder
         */
        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            this.__explicitlySet__.add("privateIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JavaMessageServiceConnection build() {
            JavaMessageServiceConnection model =
                    new JavaMessageServiceConnection(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.vaultId,
                            this.keyId,
                            this.subnetId,
                            this.ingressIps,
                            this.nsgIds,
                            this.technologyType,
                            this.shouldUseJndi,
                            this.jndiConnectionFactory,
                            this.jndiProviderUrl,
                            this.jndiInitialContextFactory,
                            this.jndiSecurityPrincipal,
                            this.connectionUrl,
                            this.connectionFactory,
                            this.username,
                            this.privateIp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JavaMessageServiceConnection model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("ingressIps")) {
                this.ingressIps(model.getIngressIps());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("technologyType")) {
                this.technologyType(model.getTechnologyType());
            }
            if (model.wasPropertyExplicitlySet("shouldUseJndi")) {
                this.shouldUseJndi(model.getShouldUseJndi());
            }
            if (model.wasPropertyExplicitlySet("jndiConnectionFactory")) {
                this.jndiConnectionFactory(model.getJndiConnectionFactory());
            }
            if (model.wasPropertyExplicitlySet("jndiProviderUrl")) {
                this.jndiProviderUrl(model.getJndiProviderUrl());
            }
            if (model.wasPropertyExplicitlySet("jndiInitialContextFactory")) {
                this.jndiInitialContextFactory(model.getJndiInitialContextFactory());
            }
            if (model.wasPropertyExplicitlySet("jndiSecurityPrincipal")) {
                this.jndiSecurityPrincipal(model.getJndiSecurityPrincipal());
            }
            if (model.wasPropertyExplicitlySet("connectionUrl")) {
                this.connectionUrl(model.getConnectionUrl());
            }
            if (model.wasPropertyExplicitlySet("connectionFactory")) {
                this.connectionFactory(model.getConnectionFactory());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("privateIp")) {
                this.privateIp(model.getPrivateIp());
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

    @Deprecated
    public JavaMessageServiceConnection(
            String id,
            String displayName,
            String description,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String vaultId,
            String keyId,
            String subnetId,
            java.util.List<IngressIpDetails> ingressIps,
            java.util.List<String> nsgIds,
            TechnologyType technologyType,
            Boolean shouldUseJndi,
            String jndiConnectionFactory,
            String jndiProviderUrl,
            String jndiInitialContextFactory,
            String jndiSecurityPrincipal,
            String connectionUrl,
            String connectionFactory,
            String username,
            String privateIp) {
        super(
                id,
                displayName,
                description,
                compartmentId,
                freeformTags,
                definedTags,
                systemTags,
                lifecycleState,
                lifecycleDetails,
                timeCreated,
                timeUpdated,
                vaultId,
                keyId,
                subnetId,
                ingressIps,
                nsgIds);
        this.technologyType = technologyType;
        this.shouldUseJndi = shouldUseJndi;
        this.jndiConnectionFactory = jndiConnectionFactory;
        this.jndiProviderUrl = jndiProviderUrl;
        this.jndiInitialContextFactory = jndiInitialContextFactory;
        this.jndiSecurityPrincipal = jndiSecurityPrincipal;
        this.connectionUrl = connectionUrl;
        this.connectionFactory = connectionFactory;
        this.username = username;
        this.privateIp = privateIp;
    }

    /** The Java Message Service technology type. */
    public enum TechnologyType implements com.oracle.bmc.http.internal.BmcEnum {
        OracleWeblogicJms("ORACLE_WEBLOGIC_JMS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TechnologyType.class);

        private final String value;
        private static java.util.Map<String, TechnologyType> map;

        static {
            map = new java.util.HashMap<>();
            for (TechnologyType v : TechnologyType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TechnologyType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TechnologyType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TechnologyType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The Java Message Service technology type. */
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final TechnologyType technologyType;

    /**
     * The Java Message Service technology type.
     *
     * @return the value
     */
    public TechnologyType getTechnologyType() {
        return technologyType;
    }

    /** If set to true, Java Naming and Directory Interface (JNDI) properties should be provided. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldUseJndi")
    private final Boolean shouldUseJndi;

    /**
     * If set to true, Java Naming and Directory Interface (JNDI) properties should be provided.
     *
     * @return the value
     */
    public Boolean getShouldUseJndi() {
        return shouldUseJndi;
    }

    /** The Connection Factory can be looked up using this name. e.g.: 'ConnectionFactory' */
    @com.fasterxml.jackson.annotation.JsonProperty("jndiConnectionFactory")
    private final String jndiConnectionFactory;

    /**
     * The Connection Factory can be looked up using this name. e.g.: 'ConnectionFactory'
     *
     * @return the value
     */
    public String getJndiConnectionFactory() {
        return jndiConnectionFactory;
    }

    /**
     * The URL that Java Message Service will use to contact the JNDI provider. e.g.:
     * 'tcp://myjms.host.domain:61616?jms.prefetchPolicy.all=1000'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jndiProviderUrl")
    private final String jndiProviderUrl;

    /**
     * The URL that Java Message Service will use to contact the JNDI provider. e.g.:
     * 'tcp://myjms.host.domain:61616?jms.prefetchPolicy.all=1000'
     *
     * @return the value
     */
    public String getJndiProviderUrl() {
        return jndiProviderUrl;
    }

    /**
     * The implementation of javax.naming.spi.InitialContextFactory interface that the client uses
     * to obtain initial naming context. e.g.:
     * 'org.apache.activemq.jndi.ActiveMQInitialContextFactory'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jndiInitialContextFactory")
    private final String jndiInitialContextFactory;

    /**
     * The implementation of javax.naming.spi.InitialContextFactory interface that the client uses
     * to obtain initial naming context. e.g.:
     * 'org.apache.activemq.jndi.ActiveMQInitialContextFactory'
     *
     * @return the value
     */
    public String getJndiInitialContextFactory() {
        return jndiInitialContextFactory;
    }

    /** Specifies the identity of the principal (user) to be authenticated. e.g.: 'admin2' */
    @com.fasterxml.jackson.annotation.JsonProperty("jndiSecurityPrincipal")
    private final String jndiSecurityPrincipal;

    /**
     * Specifies the identity of the principal (user) to be authenticated. e.g.: 'admin2'
     *
     * @return the value
     */
    public String getJndiSecurityPrincipal() {
        return jndiSecurityPrincipal;
    }

    /**
     * Connectin URL of the Java Message Service, specifying the protocol, host, and port. e.g.:
     * 'mq://myjms.host.domain:7676'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionUrl")
    private final String connectionUrl;

    /**
     * Connectin URL of the Java Message Service, specifying the protocol, host, and port. e.g.:
     * 'mq://myjms.host.domain:7676'
     *
     * @return the value
     */
    public String getConnectionUrl() {
        return connectionUrl;
    }

    /**
     * The of Java class implementing javax.jms.ConnectionFactory interface supplied by the Java
     * Message Service provider. e.g.: 'com.stc.jmsjca.core.JConnectionFactoryXA'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionFactory")
    private final String connectionFactory;

    /**
     * The of Java class implementing javax.jms.ConnectionFactory interface supplied by the Java
     * Message Service provider. e.g.: 'com.stc.jmsjca.core.JConnectionFactoryXA'
     *
     * @return the value
     */
    public String getConnectionFactory() {
        return connectionFactory;
    }

    /**
     * The username Oracle GoldenGate uses to connect to the Java Message Service. This username
     * must already exist and be available by the Java Message Service to be connected to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username Oracle GoldenGate uses to connect to the Java Message Service. This username
     * must already exist and be available by the Java Message Service to be connected to.
     *
     * @return the value
     */
    public String getUsername() {
        return username;
    }

    /**
     * The private IP address of the connection's endpoint in the customer's VCN, typically a
     * database endpoint or a big data endpoint (e.g. Kafka bootstrap server). In case the privateIp
     * is provided, the subnetId must also be provided. In case the privateIp (and the subnetId) is
     * not provided it is assumed the datasource is publicly accessible. In case the connection is
     * accessible only privately, the lack of privateIp will result in not being able to access the
     * connection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
    private final String privateIp;

    /**
     * The private IP address of the connection's endpoint in the customer's VCN, typically a
     * database endpoint or a big data endpoint (e.g. Kafka bootstrap server). In case the privateIp
     * is provided, the subnetId must also be provided. In case the privateIp (and the subnetId) is
     * not provided it is assumed the datasource is publicly accessible. In case the connection is
     * accessible only privately, the lack of privateIp will result in not being able to access the
     * connection.
     *
     * @return the value
     */
    public String getPrivateIp() {
        return privateIp;
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
        sb.append("JavaMessageServiceConnection(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", shouldUseJndi=").append(String.valueOf(this.shouldUseJndi));
        sb.append(", jndiConnectionFactory=").append(String.valueOf(this.jndiConnectionFactory));
        sb.append(", jndiProviderUrl=").append(String.valueOf(this.jndiProviderUrl));
        sb.append(", jndiInitialContextFactory=")
                .append(String.valueOf(this.jndiInitialContextFactory));
        sb.append(", jndiSecurityPrincipal=").append(String.valueOf(this.jndiSecurityPrincipal));
        sb.append(", connectionUrl=").append(String.valueOf(this.connectionUrl));
        sb.append(", connectionFactory=").append(String.valueOf(this.connectionFactory));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", privateIp=").append(String.valueOf(this.privateIp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JavaMessageServiceConnection)) {
            return false;
        }

        JavaMessageServiceConnection other = (JavaMessageServiceConnection) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.shouldUseJndi, other.shouldUseJndi)
                && java.util.Objects.equals(this.jndiConnectionFactory, other.jndiConnectionFactory)
                && java.util.Objects.equals(this.jndiProviderUrl, other.jndiProviderUrl)
                && java.util.Objects.equals(
                        this.jndiInitialContextFactory, other.jndiInitialContextFactory)
                && java.util.Objects.equals(this.jndiSecurityPrincipal, other.jndiSecurityPrincipal)
                && java.util.Objects.equals(this.connectionUrl, other.connectionUrl)
                && java.util.Objects.equals(this.connectionFactory, other.connectionFactory)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.privateIp, other.privateIp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.technologyType == null ? 43 : this.technologyType.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldUseJndi == null ? 43 : this.shouldUseJndi.hashCode());
        result =
                (result * PRIME)
                        + (this.jndiConnectionFactory == null
                                ? 43
                                : this.jndiConnectionFactory.hashCode());
        result =
                (result * PRIME)
                        + (this.jndiProviderUrl == null ? 43 : this.jndiProviderUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.jndiInitialContextFactory == null
                                ? 43
                                : this.jndiInitialContextFactory.hashCode());
        result =
                (result * PRIME)
                        + (this.jndiSecurityPrincipal == null
                                ? 43
                                : this.jndiSecurityPrincipal.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionUrl == null ? 43 : this.connectionUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionFactory == null ? 43 : this.connectionFactory.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.privateIp == null ? 43 : this.privateIp.hashCode());
        return result;
    }
}

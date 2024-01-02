// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DevicePostureIntegrationConfig {
    /**
     * @return The Access client ID to be used as the `Cf-Access-Client-ID` header when making a request to the `api_url`.
     * 
     */
    private @Nullable String accessClientId;
    /**
     * @return The Access client secret to be used as the `Cf-Access-Client-Secret` header when making a request to the `api_url`.
     * 
     */
    private @Nullable String accessClientSecret;
    /**
     * @return The third-party API&#39;s URL.
     * 
     */
    private @Nullable String apiUrl;
    /**
     * @return The third-party authorization API URL.
     * 
     */
    private @Nullable String authUrl;
    /**
     * @return The client identifier for authenticating API calls.
     * 
     */
    private @Nullable String clientId;
    /**
     * @return The client key for authenticating API calls.
     * 
     */
    private @Nullable String clientKey;
    /**
     * @return The client secret for authenticating API calls.
     * 
     */
    private @Nullable String clientSecret;
    /**
     * @return The customer identifier for authenticating API calls.
     * 
     */
    private @Nullable String customerId;

    private DevicePostureIntegrationConfig() {}
    /**
     * @return The Access client ID to be used as the `Cf-Access-Client-ID` header when making a request to the `api_url`.
     * 
     */
    public Optional<String> accessClientId() {
        return Optional.ofNullable(this.accessClientId);
    }
    /**
     * @return The Access client secret to be used as the `Cf-Access-Client-Secret` header when making a request to the `api_url`.
     * 
     */
    public Optional<String> accessClientSecret() {
        return Optional.ofNullable(this.accessClientSecret);
    }
    /**
     * @return The third-party API&#39;s URL.
     * 
     */
    public Optional<String> apiUrl() {
        return Optional.ofNullable(this.apiUrl);
    }
    /**
     * @return The third-party authorization API URL.
     * 
     */
    public Optional<String> authUrl() {
        return Optional.ofNullable(this.authUrl);
    }
    /**
     * @return The client identifier for authenticating API calls.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return The client key for authenticating API calls.
     * 
     */
    public Optional<String> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }
    /**
     * @return The client secret for authenticating API calls.
     * 
     */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * @return The customer identifier for authenticating API calls.
     * 
     */
    public Optional<String> customerId() {
        return Optional.ofNullable(this.customerId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePostureIntegrationConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessClientId;
        private @Nullable String accessClientSecret;
        private @Nullable String apiUrl;
        private @Nullable String authUrl;
        private @Nullable String clientId;
        private @Nullable String clientKey;
        private @Nullable String clientSecret;
        private @Nullable String customerId;
        public Builder() {}
        public Builder(DevicePostureIntegrationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessClientId = defaults.accessClientId;
    	      this.accessClientSecret = defaults.accessClientSecret;
    	      this.apiUrl = defaults.apiUrl;
    	      this.authUrl = defaults.authUrl;
    	      this.clientId = defaults.clientId;
    	      this.clientKey = defaults.clientKey;
    	      this.clientSecret = defaults.clientSecret;
    	      this.customerId = defaults.customerId;
        }

        @CustomType.Setter
        public Builder accessClientId(@Nullable String accessClientId) {

            this.accessClientId = accessClientId;
            return this;
        }
        @CustomType.Setter
        public Builder accessClientSecret(@Nullable String accessClientSecret) {

            this.accessClientSecret = accessClientSecret;
            return this;
        }
        @CustomType.Setter
        public Builder apiUrl(@Nullable String apiUrl) {

            this.apiUrl = apiUrl;
            return this;
        }
        @CustomType.Setter
        public Builder authUrl(@Nullable String authUrl) {

            this.authUrl = authUrl;
            return this;
        }
        @CustomType.Setter
        public Builder clientId(@Nullable String clientId) {

            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder clientKey(@Nullable String clientKey) {

            this.clientKey = clientKey;
            return this;
        }
        @CustomType.Setter
        public Builder clientSecret(@Nullable String clientSecret) {

            this.clientSecret = clientSecret;
            return this;
        }
        @CustomType.Setter
        public Builder customerId(@Nullable String customerId) {

            this.customerId = customerId;
            return this;
        }
        public DevicePostureIntegrationConfig build() {
            final var _resultValue = new DevicePostureIntegrationConfig();
            _resultValue.accessClientId = accessClientId;
            _resultValue.accessClientSecret = accessClientSecret;
            _resultValue.apiUrl = apiUrl;
            _resultValue.authUrl = authUrl;
            _resultValue.clientId = clientId;
            _resultValue.clientKey = clientKey;
            _resultValue.clientSecret = clientSecret;
            _resultValue.customerId = customerId;
            return _resultValue;
        }
    }
}

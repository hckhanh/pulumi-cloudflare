// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.AccessApplicationSaasAppCustomAttribute;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessApplicationSaasApp {
    /**
     * @return The URL where this applications tile redirects users
     * 
     */
    private @Nullable String appLauncherUrl;
    private @Nullable String authType;
    /**
     * @return The application client id
     * 
     */
    private @Nullable String clientId;
    /**
     * @return The application client secret, only returned on initial apply
     * 
     */
    private @Nullable String clientSecret;
    /**
     * @return The service provider&#39;s endpoint that is responsible for receiving and parsing a SAML assertion.
     * 
     */
    private @Nullable String consumerServiceUrl;
    /**
     * @return Custom attribute mapped from IDPs.
     * 
     */
    private @Nullable List<AccessApplicationSaasAppCustomAttribute> customAttributes;
    /**
     * @return The relay state used if not provided by the identity provider.
     * 
     */
    private @Nullable String defaultRelayState;
    /**
     * @return The OIDC flows supported by this application
     * 
     */
    private @Nullable List<String> grantTypes;
    /**
     * @return A regex to filter Cloudflare groups returned in ID token and userinfo endpoint
     * 
     */
    private @Nullable String groupFilterRegex;
    /**
     * @return The unique identifier for the SaaS application.
     * 
     */
    private @Nullable String idpEntityId;
    /**
     * @return The format of the name identifier sent to the SaaS application. Defaults to `email`.
     * 
     */
    private @Nullable String nameIdFormat;
    /**
     * @return A [JSONata](https://jsonata.org/) expression that transforms an application&#39;s user identities into a NameID value for its SAML assertion. This expression should evaluate to a singular string. The output of this expression can override the `name_id_format` setting.
     * 
     */
    private @Nullable String nameIdTransformJsonata;
    /**
     * @return The public certificate that will be used to verify identities.
     * 
     */
    private @Nullable String publicKey;
    /**
     * @return The permitted URL&#39;s for Cloudflare to return Authorization codes and Access/ID tokens
     * 
     */
    private @Nullable List<String> redirectUris;
    /**
     * @return Define the user information shared with access
     * 
     */
    private @Nullable List<String> scopes;
    /**
     * @return A globally unique name for an identity or service provider.
     * 
     */
    private @Nullable String spEntityId;
    /**
     * @return The endpoint where the SaaS application will send login requests.
     * 
     */
    private @Nullable String ssoEndpoint;

    private AccessApplicationSaasApp() {}
    /**
     * @return The URL where this applications tile redirects users
     * 
     */
    public Optional<String> appLauncherUrl() {
        return Optional.ofNullable(this.appLauncherUrl);
    }
    public Optional<String> authType() {
        return Optional.ofNullable(this.authType);
    }
    /**
     * @return The application client id
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return The application client secret, only returned on initial apply
     * 
     */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * @return The service provider&#39;s endpoint that is responsible for receiving and parsing a SAML assertion.
     * 
     */
    public Optional<String> consumerServiceUrl() {
        return Optional.ofNullable(this.consumerServiceUrl);
    }
    /**
     * @return Custom attribute mapped from IDPs.
     * 
     */
    public List<AccessApplicationSaasAppCustomAttribute> customAttributes() {
        return this.customAttributes == null ? List.of() : this.customAttributes;
    }
    /**
     * @return The relay state used if not provided by the identity provider.
     * 
     */
    public Optional<String> defaultRelayState() {
        return Optional.ofNullable(this.defaultRelayState);
    }
    /**
     * @return The OIDC flows supported by this application
     * 
     */
    public List<String> grantTypes() {
        return this.grantTypes == null ? List.of() : this.grantTypes;
    }
    /**
     * @return A regex to filter Cloudflare groups returned in ID token and userinfo endpoint
     * 
     */
    public Optional<String> groupFilterRegex() {
        return Optional.ofNullable(this.groupFilterRegex);
    }
    /**
     * @return The unique identifier for the SaaS application.
     * 
     */
    public Optional<String> idpEntityId() {
        return Optional.ofNullable(this.idpEntityId);
    }
    /**
     * @return The format of the name identifier sent to the SaaS application. Defaults to `email`.
     * 
     */
    public Optional<String> nameIdFormat() {
        return Optional.ofNullable(this.nameIdFormat);
    }
    /**
     * @return A [JSONata](https://jsonata.org/) expression that transforms an application&#39;s user identities into a NameID value for its SAML assertion. This expression should evaluate to a singular string. The output of this expression can override the `name_id_format` setting.
     * 
     */
    public Optional<String> nameIdTransformJsonata() {
        return Optional.ofNullable(this.nameIdTransformJsonata);
    }
    /**
     * @return The public certificate that will be used to verify identities.
     * 
     */
    public Optional<String> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }
    /**
     * @return The permitted URL&#39;s for Cloudflare to return Authorization codes and Access/ID tokens
     * 
     */
    public List<String> redirectUris() {
        return this.redirectUris == null ? List.of() : this.redirectUris;
    }
    /**
     * @return Define the user information shared with access
     * 
     */
    public List<String> scopes() {
        return this.scopes == null ? List.of() : this.scopes;
    }
    /**
     * @return A globally unique name for an identity or service provider.
     * 
     */
    public Optional<String> spEntityId() {
        return Optional.ofNullable(this.spEntityId);
    }
    /**
     * @return The endpoint where the SaaS application will send login requests.
     * 
     */
    public Optional<String> ssoEndpoint() {
        return Optional.ofNullable(this.ssoEndpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessApplicationSaasApp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String appLauncherUrl;
        private @Nullable String authType;
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        private @Nullable String consumerServiceUrl;
        private @Nullable List<AccessApplicationSaasAppCustomAttribute> customAttributes;
        private @Nullable String defaultRelayState;
        private @Nullable List<String> grantTypes;
        private @Nullable String groupFilterRegex;
        private @Nullable String idpEntityId;
        private @Nullable String nameIdFormat;
        private @Nullable String nameIdTransformJsonata;
        private @Nullable String publicKey;
        private @Nullable List<String> redirectUris;
        private @Nullable List<String> scopes;
        private @Nullable String spEntityId;
        private @Nullable String ssoEndpoint;
        public Builder() {}
        public Builder(AccessApplicationSaasApp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appLauncherUrl = defaults.appLauncherUrl;
    	      this.authType = defaults.authType;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.consumerServiceUrl = defaults.consumerServiceUrl;
    	      this.customAttributes = defaults.customAttributes;
    	      this.defaultRelayState = defaults.defaultRelayState;
    	      this.grantTypes = defaults.grantTypes;
    	      this.groupFilterRegex = defaults.groupFilterRegex;
    	      this.idpEntityId = defaults.idpEntityId;
    	      this.nameIdFormat = defaults.nameIdFormat;
    	      this.nameIdTransformJsonata = defaults.nameIdTransformJsonata;
    	      this.publicKey = defaults.publicKey;
    	      this.redirectUris = defaults.redirectUris;
    	      this.scopes = defaults.scopes;
    	      this.spEntityId = defaults.spEntityId;
    	      this.ssoEndpoint = defaults.ssoEndpoint;
        }

        @CustomType.Setter
        public Builder appLauncherUrl(@Nullable String appLauncherUrl) {

            this.appLauncherUrl = appLauncherUrl;
            return this;
        }
        @CustomType.Setter
        public Builder authType(@Nullable String authType) {

            this.authType = authType;
            return this;
        }
        @CustomType.Setter
        public Builder clientId(@Nullable String clientId) {

            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder clientSecret(@Nullable String clientSecret) {

            this.clientSecret = clientSecret;
            return this;
        }
        @CustomType.Setter
        public Builder consumerServiceUrl(@Nullable String consumerServiceUrl) {

            this.consumerServiceUrl = consumerServiceUrl;
            return this;
        }
        @CustomType.Setter
        public Builder customAttributes(@Nullable List<AccessApplicationSaasAppCustomAttribute> customAttributes) {

            this.customAttributes = customAttributes;
            return this;
        }
        public Builder customAttributes(AccessApplicationSaasAppCustomAttribute... customAttributes) {
            return customAttributes(List.of(customAttributes));
        }
        @CustomType.Setter
        public Builder defaultRelayState(@Nullable String defaultRelayState) {

            this.defaultRelayState = defaultRelayState;
            return this;
        }
        @CustomType.Setter
        public Builder grantTypes(@Nullable List<String> grantTypes) {

            this.grantTypes = grantTypes;
            return this;
        }
        public Builder grantTypes(String... grantTypes) {
            return grantTypes(List.of(grantTypes));
        }
        @CustomType.Setter
        public Builder groupFilterRegex(@Nullable String groupFilterRegex) {

            this.groupFilterRegex = groupFilterRegex;
            return this;
        }
        @CustomType.Setter
        public Builder idpEntityId(@Nullable String idpEntityId) {

            this.idpEntityId = idpEntityId;
            return this;
        }
        @CustomType.Setter
        public Builder nameIdFormat(@Nullable String nameIdFormat) {

            this.nameIdFormat = nameIdFormat;
            return this;
        }
        @CustomType.Setter
        public Builder nameIdTransformJsonata(@Nullable String nameIdTransformJsonata) {

            this.nameIdTransformJsonata = nameIdTransformJsonata;
            return this;
        }
        @CustomType.Setter
        public Builder publicKey(@Nullable String publicKey) {

            this.publicKey = publicKey;
            return this;
        }
        @CustomType.Setter
        public Builder redirectUris(@Nullable List<String> redirectUris) {

            this.redirectUris = redirectUris;
            return this;
        }
        public Builder redirectUris(String... redirectUris) {
            return redirectUris(List.of(redirectUris));
        }
        @CustomType.Setter
        public Builder scopes(@Nullable List<String> scopes) {

            this.scopes = scopes;
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }
        @CustomType.Setter
        public Builder spEntityId(@Nullable String spEntityId) {

            this.spEntityId = spEntityId;
            return this;
        }
        @CustomType.Setter
        public Builder ssoEndpoint(@Nullable String ssoEndpoint) {

            this.ssoEndpoint = ssoEndpoint;
            return this;
        }
        public AccessApplicationSaasApp build() {
            final var _resultValue = new AccessApplicationSaasApp();
            _resultValue.appLauncherUrl = appLauncherUrl;
            _resultValue.authType = authType;
            _resultValue.clientId = clientId;
            _resultValue.clientSecret = clientSecret;
            _resultValue.consumerServiceUrl = consumerServiceUrl;
            _resultValue.customAttributes = customAttributes;
            _resultValue.defaultRelayState = defaultRelayState;
            _resultValue.grantTypes = grantTypes;
            _resultValue.groupFilterRegex = groupFilterRegex;
            _resultValue.idpEntityId = idpEntityId;
            _resultValue.nameIdFormat = nameIdFormat;
            _resultValue.nameIdTransformJsonata = nameIdTransformJsonata;
            _resultValue.publicKey = publicKey;
            _resultValue.redirectUris = redirectUris;
            _resultValue.scopes = scopes;
            _resultValue.spEntityId = spEntityId;
            _resultValue.ssoEndpoint = ssoEndpoint;
            return _resultValue;
        }
    }
}

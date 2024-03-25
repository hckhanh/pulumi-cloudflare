// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.AccessApplicationSaasAppCustomAttributeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessApplicationSaasAppArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessApplicationSaasAppArgs Empty = new AccessApplicationSaasAppArgs();

    /**
     * The URL where this applications tile redirects users.
     * 
     */
    @Import(name="appLauncherUrl")
    private @Nullable Output<String> appLauncherUrl;

    /**
     * @return The URL where this applications tile redirects users.
     * 
     */
    public Optional<Output<String>> appLauncherUrl() {
        return Optional.ofNullable(this.appLauncherUrl);
    }

    @Import(name="authType")
    private @Nullable Output<String> authType;

    public Optional<Output<String>> authType() {
        return Optional.ofNullable(this.authType);
    }

    /**
     * The application client id.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The application client id.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The application client secret, only returned on initial apply.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    /**
     * @return The application client secret, only returned on initial apply.
     * 
     */
    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * The service provider&#39;s endpoint that is responsible for receiving and parsing a SAML assertion.
     * 
     */
    @Import(name="consumerServiceUrl")
    private @Nullable Output<String> consumerServiceUrl;

    /**
     * @return The service provider&#39;s endpoint that is responsible for receiving and parsing a SAML assertion.
     * 
     */
    public Optional<Output<String>> consumerServiceUrl() {
        return Optional.ofNullable(this.consumerServiceUrl);
    }

    /**
     * Custom attribute mapped from IDPs.
     * 
     */
    @Import(name="customAttributes")
    private @Nullable Output<List<AccessApplicationSaasAppCustomAttributeArgs>> customAttributes;

    /**
     * @return Custom attribute mapped from IDPs.
     * 
     */
    public Optional<Output<List<AccessApplicationSaasAppCustomAttributeArgs>>> customAttributes() {
        return Optional.ofNullable(this.customAttributes);
    }

    /**
     * The relay state used if not provided by the identity provider.
     * 
     */
    @Import(name="defaultRelayState")
    private @Nullable Output<String> defaultRelayState;

    /**
     * @return The relay state used if not provided by the identity provider.
     * 
     */
    public Optional<Output<String>> defaultRelayState() {
        return Optional.ofNullable(this.defaultRelayState);
    }

    /**
     * The OIDC flows supported by this application.
     * 
     */
    @Import(name="grantTypes")
    private @Nullable Output<List<String>> grantTypes;

    /**
     * @return The OIDC flows supported by this application.
     * 
     */
    public Optional<Output<List<String>>> grantTypes() {
        return Optional.ofNullable(this.grantTypes);
    }

    /**
     * A regex to filter Cloudflare groups returned in ID token and userinfo endpoint.
     * 
     */
    @Import(name="groupFilterRegex")
    private @Nullable Output<String> groupFilterRegex;

    /**
     * @return A regex to filter Cloudflare groups returned in ID token and userinfo endpoint.
     * 
     */
    public Optional<Output<String>> groupFilterRegex() {
        return Optional.ofNullable(this.groupFilterRegex);
    }

    /**
     * The unique identifier for the SaaS application.
     * 
     */
    @Import(name="idpEntityId")
    private @Nullable Output<String> idpEntityId;

    /**
     * @return The unique identifier for the SaaS application.
     * 
     */
    public Optional<Output<String>> idpEntityId() {
        return Optional.ofNullable(this.idpEntityId);
    }

    /**
     * The format of the name identifier sent to the SaaS application.
     * 
     */
    @Import(name="nameIdFormat")
    private @Nullable Output<String> nameIdFormat;

    /**
     * @return The format of the name identifier sent to the SaaS application.
     * 
     */
    public Optional<Output<String>> nameIdFormat() {
        return Optional.ofNullable(this.nameIdFormat);
    }

    /**
     * A [JSONata](https://jsonata.org/) expression that transforms an application&#39;s user identities into a NameID value for its SAML assertion. This expression should evaluate to a singular string. The output of this expression can override the `name_id_format` setting.
     * 
     */
    @Import(name="nameIdTransformJsonata")
    private @Nullable Output<String> nameIdTransformJsonata;

    /**
     * @return A [JSONata](https://jsonata.org/) expression that transforms an application&#39;s user identities into a NameID value for its SAML assertion. This expression should evaluate to a singular string. The output of this expression can override the `name_id_format` setting.
     * 
     */
    public Optional<Output<String>> nameIdTransformJsonata() {
        return Optional.ofNullable(this.nameIdTransformJsonata);
    }

    /**
     * The public certificate that will be used to verify identities.
     * 
     */
    @Import(name="publicKey")
    private @Nullable Output<String> publicKey;

    /**
     * @return The public certificate that will be used to verify identities.
     * 
     */
    public Optional<Output<String>> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }

    /**
     * The permitted URL&#39;s for Cloudflare to return Authorization codes and Access/ID tokens.
     * 
     */
    @Import(name="redirectUris")
    private @Nullable Output<List<String>> redirectUris;

    /**
     * @return The permitted URL&#39;s for Cloudflare to return Authorization codes and Access/ID tokens.
     * 
     */
    public Optional<Output<List<String>>> redirectUris() {
        return Optional.ofNullable(this.redirectUris);
    }

    /**
     * Define the user information shared with access.
     * 
     */
    @Import(name="scopes")
    private @Nullable Output<List<String>> scopes;

    /**
     * @return Define the user information shared with access.
     * 
     */
    public Optional<Output<List<String>>> scopes() {
        return Optional.ofNullable(this.scopes);
    }

    /**
     * A globally unique name for an identity or service provider.
     * 
     */
    @Import(name="spEntityId")
    private @Nullable Output<String> spEntityId;

    /**
     * @return A globally unique name for an identity or service provider.
     * 
     */
    public Optional<Output<String>> spEntityId() {
        return Optional.ofNullable(this.spEntityId);
    }

    /**
     * The endpoint where the SaaS application will send login requests.
     * 
     */
    @Import(name="ssoEndpoint")
    private @Nullable Output<String> ssoEndpoint;

    /**
     * @return The endpoint where the SaaS application will send login requests.
     * 
     */
    public Optional<Output<String>> ssoEndpoint() {
        return Optional.ofNullable(this.ssoEndpoint);
    }

    private AccessApplicationSaasAppArgs() {}

    private AccessApplicationSaasAppArgs(AccessApplicationSaasAppArgs $) {
        this.appLauncherUrl = $.appLauncherUrl;
        this.authType = $.authType;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.consumerServiceUrl = $.consumerServiceUrl;
        this.customAttributes = $.customAttributes;
        this.defaultRelayState = $.defaultRelayState;
        this.grantTypes = $.grantTypes;
        this.groupFilterRegex = $.groupFilterRegex;
        this.idpEntityId = $.idpEntityId;
        this.nameIdFormat = $.nameIdFormat;
        this.nameIdTransformJsonata = $.nameIdTransformJsonata;
        this.publicKey = $.publicKey;
        this.redirectUris = $.redirectUris;
        this.scopes = $.scopes;
        this.spEntityId = $.spEntityId;
        this.ssoEndpoint = $.ssoEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessApplicationSaasAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessApplicationSaasAppArgs $;

        public Builder() {
            $ = new AccessApplicationSaasAppArgs();
        }

        public Builder(AccessApplicationSaasAppArgs defaults) {
            $ = new AccessApplicationSaasAppArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appLauncherUrl The URL where this applications tile redirects users.
         * 
         * @return builder
         * 
         */
        public Builder appLauncherUrl(@Nullable Output<String> appLauncherUrl) {
            $.appLauncherUrl = appLauncherUrl;
            return this;
        }

        /**
         * @param appLauncherUrl The URL where this applications tile redirects users.
         * 
         * @return builder
         * 
         */
        public Builder appLauncherUrl(String appLauncherUrl) {
            return appLauncherUrl(Output.of(appLauncherUrl));
        }

        public Builder authType(@Nullable Output<String> authType) {
            $.authType = authType;
            return this;
        }

        public Builder authType(String authType) {
            return authType(Output.of(authType));
        }

        /**
         * @param clientId The application client id.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The application client id.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The application client secret, only returned on initial apply.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The application client secret, only returned on initial apply.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param consumerServiceUrl The service provider&#39;s endpoint that is responsible for receiving and parsing a SAML assertion.
         * 
         * @return builder
         * 
         */
        public Builder consumerServiceUrl(@Nullable Output<String> consumerServiceUrl) {
            $.consumerServiceUrl = consumerServiceUrl;
            return this;
        }

        /**
         * @param consumerServiceUrl The service provider&#39;s endpoint that is responsible for receiving and parsing a SAML assertion.
         * 
         * @return builder
         * 
         */
        public Builder consumerServiceUrl(String consumerServiceUrl) {
            return consumerServiceUrl(Output.of(consumerServiceUrl));
        }

        /**
         * @param customAttributes Custom attribute mapped from IDPs.
         * 
         * @return builder
         * 
         */
        public Builder customAttributes(@Nullable Output<List<AccessApplicationSaasAppCustomAttributeArgs>> customAttributes) {
            $.customAttributes = customAttributes;
            return this;
        }

        /**
         * @param customAttributes Custom attribute mapped from IDPs.
         * 
         * @return builder
         * 
         */
        public Builder customAttributes(List<AccessApplicationSaasAppCustomAttributeArgs> customAttributes) {
            return customAttributes(Output.of(customAttributes));
        }

        /**
         * @param customAttributes Custom attribute mapped from IDPs.
         * 
         * @return builder
         * 
         */
        public Builder customAttributes(AccessApplicationSaasAppCustomAttributeArgs... customAttributes) {
            return customAttributes(List.of(customAttributes));
        }

        /**
         * @param defaultRelayState The relay state used if not provided by the identity provider.
         * 
         * @return builder
         * 
         */
        public Builder defaultRelayState(@Nullable Output<String> defaultRelayState) {
            $.defaultRelayState = defaultRelayState;
            return this;
        }

        /**
         * @param defaultRelayState The relay state used if not provided by the identity provider.
         * 
         * @return builder
         * 
         */
        public Builder defaultRelayState(String defaultRelayState) {
            return defaultRelayState(Output.of(defaultRelayState));
        }

        /**
         * @param grantTypes The OIDC flows supported by this application.
         * 
         * @return builder
         * 
         */
        public Builder grantTypes(@Nullable Output<List<String>> grantTypes) {
            $.grantTypes = grantTypes;
            return this;
        }

        /**
         * @param grantTypes The OIDC flows supported by this application.
         * 
         * @return builder
         * 
         */
        public Builder grantTypes(List<String> grantTypes) {
            return grantTypes(Output.of(grantTypes));
        }

        /**
         * @param grantTypes The OIDC flows supported by this application.
         * 
         * @return builder
         * 
         */
        public Builder grantTypes(String... grantTypes) {
            return grantTypes(List.of(grantTypes));
        }

        /**
         * @param groupFilterRegex A regex to filter Cloudflare groups returned in ID token and userinfo endpoint.
         * 
         * @return builder
         * 
         */
        public Builder groupFilterRegex(@Nullable Output<String> groupFilterRegex) {
            $.groupFilterRegex = groupFilterRegex;
            return this;
        }

        /**
         * @param groupFilterRegex A regex to filter Cloudflare groups returned in ID token and userinfo endpoint.
         * 
         * @return builder
         * 
         */
        public Builder groupFilterRegex(String groupFilterRegex) {
            return groupFilterRegex(Output.of(groupFilterRegex));
        }

        /**
         * @param idpEntityId The unique identifier for the SaaS application.
         * 
         * @return builder
         * 
         */
        public Builder idpEntityId(@Nullable Output<String> idpEntityId) {
            $.idpEntityId = idpEntityId;
            return this;
        }

        /**
         * @param idpEntityId The unique identifier for the SaaS application.
         * 
         * @return builder
         * 
         */
        public Builder idpEntityId(String idpEntityId) {
            return idpEntityId(Output.of(idpEntityId));
        }

        /**
         * @param nameIdFormat The format of the name identifier sent to the SaaS application.
         * 
         * @return builder
         * 
         */
        public Builder nameIdFormat(@Nullable Output<String> nameIdFormat) {
            $.nameIdFormat = nameIdFormat;
            return this;
        }

        /**
         * @param nameIdFormat The format of the name identifier sent to the SaaS application.
         * 
         * @return builder
         * 
         */
        public Builder nameIdFormat(String nameIdFormat) {
            return nameIdFormat(Output.of(nameIdFormat));
        }

        /**
         * @param nameIdTransformJsonata A [JSONata](https://jsonata.org/) expression that transforms an application&#39;s user identities into a NameID value for its SAML assertion. This expression should evaluate to a singular string. The output of this expression can override the `name_id_format` setting.
         * 
         * @return builder
         * 
         */
        public Builder nameIdTransformJsonata(@Nullable Output<String> nameIdTransformJsonata) {
            $.nameIdTransformJsonata = nameIdTransformJsonata;
            return this;
        }

        /**
         * @param nameIdTransformJsonata A [JSONata](https://jsonata.org/) expression that transforms an application&#39;s user identities into a NameID value for its SAML assertion. This expression should evaluate to a singular string. The output of this expression can override the `name_id_format` setting.
         * 
         * @return builder
         * 
         */
        public Builder nameIdTransformJsonata(String nameIdTransformJsonata) {
            return nameIdTransformJsonata(Output.of(nameIdTransformJsonata));
        }

        /**
         * @param publicKey The public certificate that will be used to verify identities.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(@Nullable Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        /**
         * @param publicKey The public certificate that will be used to verify identities.
         * 
         * @return builder
         * 
         */
        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        /**
         * @param redirectUris The permitted URL&#39;s for Cloudflare to return Authorization codes and Access/ID tokens.
         * 
         * @return builder
         * 
         */
        public Builder redirectUris(@Nullable Output<List<String>> redirectUris) {
            $.redirectUris = redirectUris;
            return this;
        }

        /**
         * @param redirectUris The permitted URL&#39;s for Cloudflare to return Authorization codes and Access/ID tokens.
         * 
         * @return builder
         * 
         */
        public Builder redirectUris(List<String> redirectUris) {
            return redirectUris(Output.of(redirectUris));
        }

        /**
         * @param redirectUris The permitted URL&#39;s for Cloudflare to return Authorization codes and Access/ID tokens.
         * 
         * @return builder
         * 
         */
        public Builder redirectUris(String... redirectUris) {
            return redirectUris(List.of(redirectUris));
        }

        /**
         * @param scopes Define the user information shared with access.
         * 
         * @return builder
         * 
         */
        public Builder scopes(@Nullable Output<List<String>> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes Define the user information shared with access.
         * 
         * @return builder
         * 
         */
        public Builder scopes(List<String> scopes) {
            return scopes(Output.of(scopes));
        }

        /**
         * @param scopes Define the user information shared with access.
         * 
         * @return builder
         * 
         */
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }

        /**
         * @param spEntityId A globally unique name for an identity or service provider.
         * 
         * @return builder
         * 
         */
        public Builder spEntityId(@Nullable Output<String> spEntityId) {
            $.spEntityId = spEntityId;
            return this;
        }

        /**
         * @param spEntityId A globally unique name for an identity or service provider.
         * 
         * @return builder
         * 
         */
        public Builder spEntityId(String spEntityId) {
            return spEntityId(Output.of(spEntityId));
        }

        /**
         * @param ssoEndpoint The endpoint where the SaaS application will send login requests.
         * 
         * @return builder
         * 
         */
        public Builder ssoEndpoint(@Nullable Output<String> ssoEndpoint) {
            $.ssoEndpoint = ssoEndpoint;
            return this;
        }

        /**
         * @param ssoEndpoint The endpoint where the SaaS application will send login requests.
         * 
         * @return builder
         * 
         */
        public Builder ssoEndpoint(String ssoEndpoint) {
            return ssoEndpoint(Output.of(ssoEndpoint));
        }

        public AccessApplicationSaasAppArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessIdentityProviderConfig {
    private @Nullable String apiToken;
    private @Nullable String appsDomain;
    private @Nullable List<String> attributes;
    private @Nullable String authUrl;
    private @Nullable String centrifyAccount;
    private @Nullable String centrifyAppId;
    private @Nullable String certsUrl;
    private @Nullable List<String> claims;
    private @Nullable String clientId;
    private @Nullable String clientSecret;
    private @Nullable String directoryId;
    private @Nullable String emailAttributeName;
    private @Nullable String idpPublicCert;
    private @Nullable String issuerUrl;
    private @Nullable String oktaAccount;
    private @Nullable String oneloginAccount;
    private @Nullable Boolean pkceEnabled;
    private @Nullable String redirectUrl;
    private @Nullable List<String> scopes;
    private @Nullable Boolean signRequest;
    private @Nullable String ssoTargetUrl;
    private @Nullable Boolean supportGroups;
    private @Nullable String tokenUrl;

    private AccessIdentityProviderConfig() {}
    public Optional<String> apiToken() {
        return Optional.ofNullable(this.apiToken);
    }
    public Optional<String> appsDomain() {
        return Optional.ofNullable(this.appsDomain);
    }
    public List<String> attributes() {
        return this.attributes == null ? List.of() : this.attributes;
    }
    public Optional<String> authUrl() {
        return Optional.ofNullable(this.authUrl);
    }
    public Optional<String> centrifyAccount() {
        return Optional.ofNullable(this.centrifyAccount);
    }
    public Optional<String> centrifyAppId() {
        return Optional.ofNullable(this.centrifyAppId);
    }
    public Optional<String> certsUrl() {
        return Optional.ofNullable(this.certsUrl);
    }
    public List<String> claims() {
        return this.claims == null ? List.of() : this.claims;
    }
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    public Optional<String> directoryId() {
        return Optional.ofNullable(this.directoryId);
    }
    public Optional<String> emailAttributeName() {
        return Optional.ofNullable(this.emailAttributeName);
    }
    public Optional<String> idpPublicCert() {
        return Optional.ofNullable(this.idpPublicCert);
    }
    public Optional<String> issuerUrl() {
        return Optional.ofNullable(this.issuerUrl);
    }
    public Optional<String> oktaAccount() {
        return Optional.ofNullable(this.oktaAccount);
    }
    public Optional<String> oneloginAccount() {
        return Optional.ofNullable(this.oneloginAccount);
    }
    public Optional<Boolean> pkceEnabled() {
        return Optional.ofNullable(this.pkceEnabled);
    }
    public Optional<String> redirectUrl() {
        return Optional.ofNullable(this.redirectUrl);
    }
    public List<String> scopes() {
        return this.scopes == null ? List.of() : this.scopes;
    }
    public Optional<Boolean> signRequest() {
        return Optional.ofNullable(this.signRequest);
    }
    public Optional<String> ssoTargetUrl() {
        return Optional.ofNullable(this.ssoTargetUrl);
    }
    public Optional<Boolean> supportGroups() {
        return Optional.ofNullable(this.supportGroups);
    }
    public Optional<String> tokenUrl() {
        return Optional.ofNullable(this.tokenUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessIdentityProviderConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiToken;
        private @Nullable String appsDomain;
        private @Nullable List<String> attributes;
        private @Nullable String authUrl;
        private @Nullable String centrifyAccount;
        private @Nullable String centrifyAppId;
        private @Nullable String certsUrl;
        private @Nullable List<String> claims;
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        private @Nullable String directoryId;
        private @Nullable String emailAttributeName;
        private @Nullable String idpPublicCert;
        private @Nullable String issuerUrl;
        private @Nullable String oktaAccount;
        private @Nullable String oneloginAccount;
        private @Nullable Boolean pkceEnabled;
        private @Nullable String redirectUrl;
        private @Nullable List<String> scopes;
        private @Nullable Boolean signRequest;
        private @Nullable String ssoTargetUrl;
        private @Nullable Boolean supportGroups;
        private @Nullable String tokenUrl;
        public Builder() {}
        public Builder(AccessIdentityProviderConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiToken = defaults.apiToken;
    	      this.appsDomain = defaults.appsDomain;
    	      this.attributes = defaults.attributes;
    	      this.authUrl = defaults.authUrl;
    	      this.centrifyAccount = defaults.centrifyAccount;
    	      this.centrifyAppId = defaults.centrifyAppId;
    	      this.certsUrl = defaults.certsUrl;
    	      this.claims = defaults.claims;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.directoryId = defaults.directoryId;
    	      this.emailAttributeName = defaults.emailAttributeName;
    	      this.idpPublicCert = defaults.idpPublicCert;
    	      this.issuerUrl = defaults.issuerUrl;
    	      this.oktaAccount = defaults.oktaAccount;
    	      this.oneloginAccount = defaults.oneloginAccount;
    	      this.pkceEnabled = defaults.pkceEnabled;
    	      this.redirectUrl = defaults.redirectUrl;
    	      this.scopes = defaults.scopes;
    	      this.signRequest = defaults.signRequest;
    	      this.ssoTargetUrl = defaults.ssoTargetUrl;
    	      this.supportGroups = defaults.supportGroups;
    	      this.tokenUrl = defaults.tokenUrl;
        }

        @CustomType.Setter
        public Builder apiToken(@Nullable String apiToken) {
            this.apiToken = apiToken;
            return this;
        }
        @CustomType.Setter
        public Builder appsDomain(@Nullable String appsDomain) {
            this.appsDomain = appsDomain;
            return this;
        }
        @CustomType.Setter
        public Builder attributes(@Nullable List<String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public Builder attributes(String... attributes) {
            return attributes(List.of(attributes));
        }
        @CustomType.Setter
        public Builder authUrl(@Nullable String authUrl) {
            this.authUrl = authUrl;
            return this;
        }
        @CustomType.Setter
        public Builder centrifyAccount(@Nullable String centrifyAccount) {
            this.centrifyAccount = centrifyAccount;
            return this;
        }
        @CustomType.Setter
        public Builder centrifyAppId(@Nullable String centrifyAppId) {
            this.centrifyAppId = centrifyAppId;
            return this;
        }
        @CustomType.Setter
        public Builder certsUrl(@Nullable String certsUrl) {
            this.certsUrl = certsUrl;
            return this;
        }
        @CustomType.Setter
        public Builder claims(@Nullable List<String> claims) {
            this.claims = claims;
            return this;
        }
        public Builder claims(String... claims) {
            return claims(List.of(claims));
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
        public Builder directoryId(@Nullable String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        @CustomType.Setter
        public Builder emailAttributeName(@Nullable String emailAttributeName) {
            this.emailAttributeName = emailAttributeName;
            return this;
        }
        @CustomType.Setter
        public Builder idpPublicCert(@Nullable String idpPublicCert) {
            this.idpPublicCert = idpPublicCert;
            return this;
        }
        @CustomType.Setter
        public Builder issuerUrl(@Nullable String issuerUrl) {
            this.issuerUrl = issuerUrl;
            return this;
        }
        @CustomType.Setter
        public Builder oktaAccount(@Nullable String oktaAccount) {
            this.oktaAccount = oktaAccount;
            return this;
        }
        @CustomType.Setter
        public Builder oneloginAccount(@Nullable String oneloginAccount) {
            this.oneloginAccount = oneloginAccount;
            return this;
        }
        @CustomType.Setter
        public Builder pkceEnabled(@Nullable Boolean pkceEnabled) {
            this.pkceEnabled = pkceEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder redirectUrl(@Nullable String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
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
        public Builder signRequest(@Nullable Boolean signRequest) {
            this.signRequest = signRequest;
            return this;
        }
        @CustomType.Setter
        public Builder ssoTargetUrl(@Nullable String ssoTargetUrl) {
            this.ssoTargetUrl = ssoTargetUrl;
            return this;
        }
        @CustomType.Setter
        public Builder supportGroups(@Nullable Boolean supportGroups) {
            this.supportGroups = supportGroups;
            return this;
        }
        @CustomType.Setter
        public Builder tokenUrl(@Nullable String tokenUrl) {
            this.tokenUrl = tokenUrl;
            return this;
        }
        public AccessIdentityProviderConfig build() {
            final var o = new AccessIdentityProviderConfig();
            o.apiToken = apiToken;
            o.appsDomain = appsDomain;
            o.attributes = attributes;
            o.authUrl = authUrl;
            o.centrifyAccount = centrifyAccount;
            o.centrifyAppId = centrifyAppId;
            o.certsUrl = certsUrl;
            o.claims = claims;
            o.clientId = clientId;
            o.clientSecret = clientSecret;
            o.directoryId = directoryId;
            o.emailAttributeName = emailAttributeName;
            o.idpPublicCert = idpPublicCert;
            o.issuerUrl = issuerUrl;
            o.oktaAccount = oktaAccount;
            o.oneloginAccount = oneloginAccount;
            o.pkceEnabled = pkceEnabled;
            o.redirectUrl = redirectUrl;
            o.scopes = scopes;
            o.signRequest = signRequest;
            o.ssoTargetUrl = ssoTargetUrl;
            o.supportGroups = supportGroups;
            o.tokenUrl = tokenUrl;
            return o;
        }
    }
}

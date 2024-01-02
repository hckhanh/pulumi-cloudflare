// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParametersAutominify;
import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParametersBrowserTtl;
import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParametersCacheKey;
import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParametersEdgeTtl;
import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParametersFromList;
import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParametersFromValue;
import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParametersHeader;
import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParametersMatchedData;
import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParametersOrigin;
import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParametersOverrides;
import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParametersResponse;
import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParametersServeStale;
import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParametersSni;
import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParametersUri;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRulesetsRulesetRuleActionParameters {
    private @Nullable List<Integer> additionalCacheablePorts;
    private @Nullable Boolean automaticHttpsRewrites;
    private @Nullable List<GetRulesetsRulesetRuleActionParametersAutominify> autominifies;
    private @Nullable Boolean bic;
    private @Nullable GetRulesetsRulesetRuleActionParametersBrowserTtl browserTtl;
    private @Nullable Boolean cache;
    private @Nullable GetRulesetsRulesetRuleActionParametersCacheKey cacheKey;
    private @Nullable String content;
    private @Nullable String contentType;
    private @Nullable List<String> cookieFields;
    private @Nullable Boolean disableApps;
    private @Nullable Boolean disableRailgun;
    private @Nullable Boolean disableZaraz;
    private @Nullable GetRulesetsRulesetRuleActionParametersEdgeTtl edgeTtl;
    private @Nullable Boolean emailObfuscation;
    private @Nullable GetRulesetsRulesetRuleActionParametersFromList fromList;
    private @Nullable GetRulesetsRulesetRuleActionParametersFromValue fromValue;
    private @Nullable List<GetRulesetsRulesetRuleActionParametersHeader> headers;
    private @Nullable String hostHeader;
    private @Nullable Boolean hotlinkProtection;
    /**
     * @return The ID of the Ruleset to target.
     * 
     */
    private @Nullable String id;
    private @Nullable Integer increment;
    private @Nullable GetRulesetsRulesetRuleActionParametersMatchedData matchedData;
    private @Nullable Boolean mirage;
    private @Nullable Boolean opportunisticEncryption;
    private @Nullable GetRulesetsRulesetRuleActionParametersOrigin origin;
    private @Nullable Boolean originCacheControl;
    private @Nullable Boolean originErrorPagePassthru;
    private @Nullable GetRulesetsRulesetRuleActionParametersOverrides overrides;
    private @Nullable List<String> phases;
    private @Nullable String polish;
    private @Nullable List<String> products;
    private @Nullable Integer readTimeout;
    private @Nullable List<String> requestFields;
    private @Nullable Boolean respectStrongEtags;
    private @Nullable List<String> responseFields;
    private @Nullable List<GetRulesetsRulesetRuleActionParametersResponse> responses;
    private @Nullable Boolean rocketLoader;
    private @Nullable Map<String,String> rules;
    private @Nullable String ruleset;
    private @Nullable List<String> rulesets;
    private @Nullable String securityLevel;
    private @Nullable GetRulesetsRulesetRuleActionParametersServeStale serveStale;
    private @Nullable Boolean serverSideExcludes;
    private @Nullable GetRulesetsRulesetRuleActionParametersSni sni;
    private @Nullable String ssl;
    private @Nullable Integer statusCode;
    private @Nullable Boolean sxg;
    private @Nullable GetRulesetsRulesetRuleActionParametersUri uri;
    /**
     * @return Version of the ruleset to filter on.
     * 
     */
    private String version;

    private GetRulesetsRulesetRuleActionParameters() {}
    public List<Integer> additionalCacheablePorts() {
        return this.additionalCacheablePorts == null ? List.of() : this.additionalCacheablePorts;
    }
    public Optional<Boolean> automaticHttpsRewrites() {
        return Optional.ofNullable(this.automaticHttpsRewrites);
    }
    public List<GetRulesetsRulesetRuleActionParametersAutominify> autominifies() {
        return this.autominifies == null ? List.of() : this.autominifies;
    }
    public Optional<Boolean> bic() {
        return Optional.ofNullable(this.bic);
    }
    public Optional<GetRulesetsRulesetRuleActionParametersBrowserTtl> browserTtl() {
        return Optional.ofNullable(this.browserTtl);
    }
    public Optional<Boolean> cache() {
        return Optional.ofNullable(this.cache);
    }
    public Optional<GetRulesetsRulesetRuleActionParametersCacheKey> cacheKey() {
        return Optional.ofNullable(this.cacheKey);
    }
    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }
    public List<String> cookieFields() {
        return this.cookieFields == null ? List.of() : this.cookieFields;
    }
    public Optional<Boolean> disableApps() {
        return Optional.ofNullable(this.disableApps);
    }
    public Optional<Boolean> disableRailgun() {
        return Optional.ofNullable(this.disableRailgun);
    }
    public Optional<Boolean> disableZaraz() {
        return Optional.ofNullable(this.disableZaraz);
    }
    public Optional<GetRulesetsRulesetRuleActionParametersEdgeTtl> edgeTtl() {
        return Optional.ofNullable(this.edgeTtl);
    }
    public Optional<Boolean> emailObfuscation() {
        return Optional.ofNullable(this.emailObfuscation);
    }
    public Optional<GetRulesetsRulesetRuleActionParametersFromList> fromList() {
        return Optional.ofNullable(this.fromList);
    }
    public Optional<GetRulesetsRulesetRuleActionParametersFromValue> fromValue() {
        return Optional.ofNullable(this.fromValue);
    }
    public List<GetRulesetsRulesetRuleActionParametersHeader> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    public Optional<String> hostHeader() {
        return Optional.ofNullable(this.hostHeader);
    }
    public Optional<Boolean> hotlinkProtection() {
        return Optional.ofNullable(this.hotlinkProtection);
    }
    /**
     * @return The ID of the Ruleset to target.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<Integer> increment() {
        return Optional.ofNullable(this.increment);
    }
    public Optional<GetRulesetsRulesetRuleActionParametersMatchedData> matchedData() {
        return Optional.ofNullable(this.matchedData);
    }
    public Optional<Boolean> mirage() {
        return Optional.ofNullable(this.mirage);
    }
    public Optional<Boolean> opportunisticEncryption() {
        return Optional.ofNullable(this.opportunisticEncryption);
    }
    public Optional<GetRulesetsRulesetRuleActionParametersOrigin> origin() {
        return Optional.ofNullable(this.origin);
    }
    public Optional<Boolean> originCacheControl() {
        return Optional.ofNullable(this.originCacheControl);
    }
    public Optional<Boolean> originErrorPagePassthru() {
        return Optional.ofNullable(this.originErrorPagePassthru);
    }
    public Optional<GetRulesetsRulesetRuleActionParametersOverrides> overrides() {
        return Optional.ofNullable(this.overrides);
    }
    public List<String> phases() {
        return this.phases == null ? List.of() : this.phases;
    }
    public Optional<String> polish() {
        return Optional.ofNullable(this.polish);
    }
    public List<String> products() {
        return this.products == null ? List.of() : this.products;
    }
    public Optional<Integer> readTimeout() {
        return Optional.ofNullable(this.readTimeout);
    }
    public List<String> requestFields() {
        return this.requestFields == null ? List.of() : this.requestFields;
    }
    public Optional<Boolean> respectStrongEtags() {
        return Optional.ofNullable(this.respectStrongEtags);
    }
    public List<String> responseFields() {
        return this.responseFields == null ? List.of() : this.responseFields;
    }
    public List<GetRulesetsRulesetRuleActionParametersResponse> responses() {
        return this.responses == null ? List.of() : this.responses;
    }
    public Optional<Boolean> rocketLoader() {
        return Optional.ofNullable(this.rocketLoader);
    }
    public Map<String,String> rules() {
        return this.rules == null ? Map.of() : this.rules;
    }
    public Optional<String> ruleset() {
        return Optional.ofNullable(this.ruleset);
    }
    public List<String> rulesets() {
        return this.rulesets == null ? List.of() : this.rulesets;
    }
    public Optional<String> securityLevel() {
        return Optional.ofNullable(this.securityLevel);
    }
    public Optional<GetRulesetsRulesetRuleActionParametersServeStale> serveStale() {
        return Optional.ofNullable(this.serveStale);
    }
    public Optional<Boolean> serverSideExcludes() {
        return Optional.ofNullable(this.serverSideExcludes);
    }
    public Optional<GetRulesetsRulesetRuleActionParametersSni> sni() {
        return Optional.ofNullable(this.sni);
    }
    public Optional<String> ssl() {
        return Optional.ofNullable(this.ssl);
    }
    public Optional<Integer> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }
    public Optional<Boolean> sxg() {
        return Optional.ofNullable(this.sxg);
    }
    public Optional<GetRulesetsRulesetRuleActionParametersUri> uri() {
        return Optional.ofNullable(this.uri);
    }
    /**
     * @return Version of the ruleset to filter on.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesetsRulesetRuleActionParameters defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<Integer> additionalCacheablePorts;
        private @Nullable Boolean automaticHttpsRewrites;
        private @Nullable List<GetRulesetsRulesetRuleActionParametersAutominify> autominifies;
        private @Nullable Boolean bic;
        private @Nullable GetRulesetsRulesetRuleActionParametersBrowserTtl browserTtl;
        private @Nullable Boolean cache;
        private @Nullable GetRulesetsRulesetRuleActionParametersCacheKey cacheKey;
        private @Nullable String content;
        private @Nullable String contentType;
        private @Nullable List<String> cookieFields;
        private @Nullable Boolean disableApps;
        private @Nullable Boolean disableRailgun;
        private @Nullable Boolean disableZaraz;
        private @Nullable GetRulesetsRulesetRuleActionParametersEdgeTtl edgeTtl;
        private @Nullable Boolean emailObfuscation;
        private @Nullable GetRulesetsRulesetRuleActionParametersFromList fromList;
        private @Nullable GetRulesetsRulesetRuleActionParametersFromValue fromValue;
        private @Nullable List<GetRulesetsRulesetRuleActionParametersHeader> headers;
        private @Nullable String hostHeader;
        private @Nullable Boolean hotlinkProtection;
        private @Nullable String id;
        private @Nullable Integer increment;
        private @Nullable GetRulesetsRulesetRuleActionParametersMatchedData matchedData;
        private @Nullable Boolean mirage;
        private @Nullable Boolean opportunisticEncryption;
        private @Nullable GetRulesetsRulesetRuleActionParametersOrigin origin;
        private @Nullable Boolean originCacheControl;
        private @Nullable Boolean originErrorPagePassthru;
        private @Nullable GetRulesetsRulesetRuleActionParametersOverrides overrides;
        private @Nullable List<String> phases;
        private @Nullable String polish;
        private @Nullable List<String> products;
        private @Nullable Integer readTimeout;
        private @Nullable List<String> requestFields;
        private @Nullable Boolean respectStrongEtags;
        private @Nullable List<String> responseFields;
        private @Nullable List<GetRulesetsRulesetRuleActionParametersResponse> responses;
        private @Nullable Boolean rocketLoader;
        private @Nullable Map<String,String> rules;
        private @Nullable String ruleset;
        private @Nullable List<String> rulesets;
        private @Nullable String securityLevel;
        private @Nullable GetRulesetsRulesetRuleActionParametersServeStale serveStale;
        private @Nullable Boolean serverSideExcludes;
        private @Nullable GetRulesetsRulesetRuleActionParametersSni sni;
        private @Nullable String ssl;
        private @Nullable Integer statusCode;
        private @Nullable Boolean sxg;
        private @Nullable GetRulesetsRulesetRuleActionParametersUri uri;
        private String version;
        public Builder() {}
        public Builder(GetRulesetsRulesetRuleActionParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalCacheablePorts = defaults.additionalCacheablePorts;
    	      this.automaticHttpsRewrites = defaults.automaticHttpsRewrites;
    	      this.autominifies = defaults.autominifies;
    	      this.bic = defaults.bic;
    	      this.browserTtl = defaults.browserTtl;
    	      this.cache = defaults.cache;
    	      this.cacheKey = defaults.cacheKey;
    	      this.content = defaults.content;
    	      this.contentType = defaults.contentType;
    	      this.cookieFields = defaults.cookieFields;
    	      this.disableApps = defaults.disableApps;
    	      this.disableRailgun = defaults.disableRailgun;
    	      this.disableZaraz = defaults.disableZaraz;
    	      this.edgeTtl = defaults.edgeTtl;
    	      this.emailObfuscation = defaults.emailObfuscation;
    	      this.fromList = defaults.fromList;
    	      this.fromValue = defaults.fromValue;
    	      this.headers = defaults.headers;
    	      this.hostHeader = defaults.hostHeader;
    	      this.hotlinkProtection = defaults.hotlinkProtection;
    	      this.id = defaults.id;
    	      this.increment = defaults.increment;
    	      this.matchedData = defaults.matchedData;
    	      this.mirage = defaults.mirage;
    	      this.opportunisticEncryption = defaults.opportunisticEncryption;
    	      this.origin = defaults.origin;
    	      this.originCacheControl = defaults.originCacheControl;
    	      this.originErrorPagePassthru = defaults.originErrorPagePassthru;
    	      this.overrides = defaults.overrides;
    	      this.phases = defaults.phases;
    	      this.polish = defaults.polish;
    	      this.products = defaults.products;
    	      this.readTimeout = defaults.readTimeout;
    	      this.requestFields = defaults.requestFields;
    	      this.respectStrongEtags = defaults.respectStrongEtags;
    	      this.responseFields = defaults.responseFields;
    	      this.responses = defaults.responses;
    	      this.rocketLoader = defaults.rocketLoader;
    	      this.rules = defaults.rules;
    	      this.ruleset = defaults.ruleset;
    	      this.rulesets = defaults.rulesets;
    	      this.securityLevel = defaults.securityLevel;
    	      this.serveStale = defaults.serveStale;
    	      this.serverSideExcludes = defaults.serverSideExcludes;
    	      this.sni = defaults.sni;
    	      this.ssl = defaults.ssl;
    	      this.statusCode = defaults.statusCode;
    	      this.sxg = defaults.sxg;
    	      this.uri = defaults.uri;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder additionalCacheablePorts(@Nullable List<Integer> additionalCacheablePorts) {

            this.additionalCacheablePorts = additionalCacheablePorts;
            return this;
        }
        public Builder additionalCacheablePorts(Integer... additionalCacheablePorts) {
            return additionalCacheablePorts(List.of(additionalCacheablePorts));
        }
        @CustomType.Setter
        public Builder automaticHttpsRewrites(@Nullable Boolean automaticHttpsRewrites) {

            this.automaticHttpsRewrites = automaticHttpsRewrites;
            return this;
        }
        @CustomType.Setter
        public Builder autominifies(@Nullable List<GetRulesetsRulesetRuleActionParametersAutominify> autominifies) {

            this.autominifies = autominifies;
            return this;
        }
        public Builder autominifies(GetRulesetsRulesetRuleActionParametersAutominify... autominifies) {
            return autominifies(List.of(autominifies));
        }
        @CustomType.Setter
        public Builder bic(@Nullable Boolean bic) {

            this.bic = bic;
            return this;
        }
        @CustomType.Setter
        public Builder browserTtl(@Nullable GetRulesetsRulesetRuleActionParametersBrowserTtl browserTtl) {

            this.browserTtl = browserTtl;
            return this;
        }
        @CustomType.Setter
        public Builder cache(@Nullable Boolean cache) {

            this.cache = cache;
            return this;
        }
        @CustomType.Setter
        public Builder cacheKey(@Nullable GetRulesetsRulesetRuleActionParametersCacheKey cacheKey) {

            this.cacheKey = cacheKey;
            return this;
        }
        @CustomType.Setter
        public Builder content(@Nullable String content) {

            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder contentType(@Nullable String contentType) {

            this.contentType = contentType;
            return this;
        }
        @CustomType.Setter
        public Builder cookieFields(@Nullable List<String> cookieFields) {

            this.cookieFields = cookieFields;
            return this;
        }
        public Builder cookieFields(String... cookieFields) {
            return cookieFields(List.of(cookieFields));
        }
        @CustomType.Setter
        public Builder disableApps(@Nullable Boolean disableApps) {

            this.disableApps = disableApps;
            return this;
        }
        @CustomType.Setter
        public Builder disableRailgun(@Nullable Boolean disableRailgun) {

            this.disableRailgun = disableRailgun;
            return this;
        }
        @CustomType.Setter
        public Builder disableZaraz(@Nullable Boolean disableZaraz) {

            this.disableZaraz = disableZaraz;
            return this;
        }
        @CustomType.Setter
        public Builder edgeTtl(@Nullable GetRulesetsRulesetRuleActionParametersEdgeTtl edgeTtl) {

            this.edgeTtl = edgeTtl;
            return this;
        }
        @CustomType.Setter
        public Builder emailObfuscation(@Nullable Boolean emailObfuscation) {

            this.emailObfuscation = emailObfuscation;
            return this;
        }
        @CustomType.Setter
        public Builder fromList(@Nullable GetRulesetsRulesetRuleActionParametersFromList fromList) {

            this.fromList = fromList;
            return this;
        }
        @CustomType.Setter
        public Builder fromValue(@Nullable GetRulesetsRulesetRuleActionParametersFromValue fromValue) {

            this.fromValue = fromValue;
            return this;
        }
        @CustomType.Setter
        public Builder headers(@Nullable List<GetRulesetsRulesetRuleActionParametersHeader> headers) {

            this.headers = headers;
            return this;
        }
        public Builder headers(GetRulesetsRulesetRuleActionParametersHeader... headers) {
            return headers(List.of(headers));
        }
        @CustomType.Setter
        public Builder hostHeader(@Nullable String hostHeader) {

            this.hostHeader = hostHeader;
            return this;
        }
        @CustomType.Setter
        public Builder hotlinkProtection(@Nullable Boolean hotlinkProtection) {

            this.hotlinkProtection = hotlinkProtection;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder increment(@Nullable Integer increment) {

            this.increment = increment;
            return this;
        }
        @CustomType.Setter
        public Builder matchedData(@Nullable GetRulesetsRulesetRuleActionParametersMatchedData matchedData) {

            this.matchedData = matchedData;
            return this;
        }
        @CustomType.Setter
        public Builder mirage(@Nullable Boolean mirage) {

            this.mirage = mirage;
            return this;
        }
        @CustomType.Setter
        public Builder opportunisticEncryption(@Nullable Boolean opportunisticEncryption) {

            this.opportunisticEncryption = opportunisticEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder origin(@Nullable GetRulesetsRulesetRuleActionParametersOrigin origin) {

            this.origin = origin;
            return this;
        }
        @CustomType.Setter
        public Builder originCacheControl(@Nullable Boolean originCacheControl) {

            this.originCacheControl = originCacheControl;
            return this;
        }
        @CustomType.Setter
        public Builder originErrorPagePassthru(@Nullable Boolean originErrorPagePassthru) {

            this.originErrorPagePassthru = originErrorPagePassthru;
            return this;
        }
        @CustomType.Setter
        public Builder overrides(@Nullable GetRulesetsRulesetRuleActionParametersOverrides overrides) {

            this.overrides = overrides;
            return this;
        }
        @CustomType.Setter
        public Builder phases(@Nullable List<String> phases) {

            this.phases = phases;
            return this;
        }
        public Builder phases(String... phases) {
            return phases(List.of(phases));
        }
        @CustomType.Setter
        public Builder polish(@Nullable String polish) {

            this.polish = polish;
            return this;
        }
        @CustomType.Setter
        public Builder products(@Nullable List<String> products) {

            this.products = products;
            return this;
        }
        public Builder products(String... products) {
            return products(List.of(products));
        }
        @CustomType.Setter
        public Builder readTimeout(@Nullable Integer readTimeout) {

            this.readTimeout = readTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder requestFields(@Nullable List<String> requestFields) {

            this.requestFields = requestFields;
            return this;
        }
        public Builder requestFields(String... requestFields) {
            return requestFields(List.of(requestFields));
        }
        @CustomType.Setter
        public Builder respectStrongEtags(@Nullable Boolean respectStrongEtags) {

            this.respectStrongEtags = respectStrongEtags;
            return this;
        }
        @CustomType.Setter
        public Builder responseFields(@Nullable List<String> responseFields) {

            this.responseFields = responseFields;
            return this;
        }
        public Builder responseFields(String... responseFields) {
            return responseFields(List.of(responseFields));
        }
        @CustomType.Setter
        public Builder responses(@Nullable List<GetRulesetsRulesetRuleActionParametersResponse> responses) {

            this.responses = responses;
            return this;
        }
        public Builder responses(GetRulesetsRulesetRuleActionParametersResponse... responses) {
            return responses(List.of(responses));
        }
        @CustomType.Setter
        public Builder rocketLoader(@Nullable Boolean rocketLoader) {

            this.rocketLoader = rocketLoader;
            return this;
        }
        @CustomType.Setter
        public Builder rules(@Nullable Map<String,String> rules) {

            this.rules = rules;
            return this;
        }
        @CustomType.Setter
        public Builder ruleset(@Nullable String ruleset) {

            this.ruleset = ruleset;
            return this;
        }
        @CustomType.Setter
        public Builder rulesets(@Nullable List<String> rulesets) {

            this.rulesets = rulesets;
            return this;
        }
        public Builder rulesets(String... rulesets) {
            return rulesets(List.of(rulesets));
        }
        @CustomType.Setter
        public Builder securityLevel(@Nullable String securityLevel) {

            this.securityLevel = securityLevel;
            return this;
        }
        @CustomType.Setter
        public Builder serveStale(@Nullable GetRulesetsRulesetRuleActionParametersServeStale serveStale) {

            this.serveStale = serveStale;
            return this;
        }
        @CustomType.Setter
        public Builder serverSideExcludes(@Nullable Boolean serverSideExcludes) {

            this.serverSideExcludes = serverSideExcludes;
            return this;
        }
        @CustomType.Setter
        public Builder sni(@Nullable GetRulesetsRulesetRuleActionParametersSni sni) {

            this.sni = sni;
            return this;
        }
        @CustomType.Setter
        public Builder ssl(@Nullable String ssl) {

            this.ssl = ssl;
            return this;
        }
        @CustomType.Setter
        public Builder statusCode(@Nullable Integer statusCode) {

            this.statusCode = statusCode;
            return this;
        }
        @CustomType.Setter
        public Builder sxg(@Nullable Boolean sxg) {

            this.sxg = sxg;
            return this;
        }
        @CustomType.Setter
        public Builder uri(@Nullable GetRulesetsRulesetRuleActionParametersUri uri) {

            this.uri = uri;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetRulesetsRulesetRuleActionParameters", "version");
            }
            this.version = version;
            return this;
        }
        public GetRulesetsRulesetRuleActionParameters build() {
            final var _resultValue = new GetRulesetsRulesetRuleActionParameters();
            _resultValue.additionalCacheablePorts = additionalCacheablePorts;
            _resultValue.automaticHttpsRewrites = automaticHttpsRewrites;
            _resultValue.autominifies = autominifies;
            _resultValue.bic = bic;
            _resultValue.browserTtl = browserTtl;
            _resultValue.cache = cache;
            _resultValue.cacheKey = cacheKey;
            _resultValue.content = content;
            _resultValue.contentType = contentType;
            _resultValue.cookieFields = cookieFields;
            _resultValue.disableApps = disableApps;
            _resultValue.disableRailgun = disableRailgun;
            _resultValue.disableZaraz = disableZaraz;
            _resultValue.edgeTtl = edgeTtl;
            _resultValue.emailObfuscation = emailObfuscation;
            _resultValue.fromList = fromList;
            _resultValue.fromValue = fromValue;
            _resultValue.headers = headers;
            _resultValue.hostHeader = hostHeader;
            _resultValue.hotlinkProtection = hotlinkProtection;
            _resultValue.id = id;
            _resultValue.increment = increment;
            _resultValue.matchedData = matchedData;
            _resultValue.mirage = mirage;
            _resultValue.opportunisticEncryption = opportunisticEncryption;
            _resultValue.origin = origin;
            _resultValue.originCacheControl = originCacheControl;
            _resultValue.originErrorPagePassthru = originErrorPagePassthru;
            _resultValue.overrides = overrides;
            _resultValue.phases = phases;
            _resultValue.polish = polish;
            _resultValue.products = products;
            _resultValue.readTimeout = readTimeout;
            _resultValue.requestFields = requestFields;
            _resultValue.respectStrongEtags = respectStrongEtags;
            _resultValue.responseFields = responseFields;
            _resultValue.responses = responses;
            _resultValue.rocketLoader = rocketLoader;
            _resultValue.rules = rules;
            _resultValue.ruleset = ruleset;
            _resultValue.rulesets = rulesets;
            _resultValue.securityLevel = securityLevel;
            _resultValue.serveStale = serveStale;
            _resultValue.serverSideExcludes = serverSideExcludes;
            _resultValue.sni = sni;
            _resultValue.ssl = ssl;
            _resultValue.statusCode = statusCode;
            _resultValue.sxg = sxg;
            _resultValue.uri = uri;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}

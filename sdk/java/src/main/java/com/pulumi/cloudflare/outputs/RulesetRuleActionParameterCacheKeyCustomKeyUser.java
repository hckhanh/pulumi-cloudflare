// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class RulesetRuleActionParameterCacheKeyCustomKeyUser {
    private Boolean deviceType;
    private Boolean geo;
    private Boolean lang;

    private RulesetRuleActionParameterCacheKeyCustomKeyUser() {}
    public Boolean deviceType() {
        return this.deviceType;
    }
    public Boolean geo() {
        return this.geo;
    }
    public Boolean lang() {
        return this.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActionParameterCacheKeyCustomKeyUser defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean deviceType;
        private Boolean geo;
        private Boolean lang;
        public Builder() {}
        public Builder(RulesetRuleActionParameterCacheKeyCustomKeyUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceType = defaults.deviceType;
    	      this.geo = defaults.geo;
    	      this.lang = defaults.lang;
        }

        @CustomType.Setter
        public Builder deviceType(Boolean deviceType) {
            this.deviceType = Objects.requireNonNull(deviceType);
            return this;
        }
        @CustomType.Setter
        public Builder geo(Boolean geo) {
            this.geo = Objects.requireNonNull(geo);
            return this;
        }
        @CustomType.Setter
        public Builder lang(Boolean lang) {
            this.lang = Objects.requireNonNull(lang);
            return this;
        }
        public RulesetRuleActionParameterCacheKeyCustomKeyUser build() {
            final var o = new RulesetRuleActionParameterCacheKeyCustomKeyUser();
            o.deviceType = deviceType;
            o.geo = geo;
            o.lang = lang;
            return o;
        }
    }
}

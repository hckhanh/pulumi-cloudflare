// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleActionParametersOverridesCategory {
    /**
     * @return Action to perform in the ruleset rule. Available values: `block`, `challenge`, `compress_response`, `ddos_dynamic`, `ddos_mitigation`, `execute`, `force_connection_close`, `js_challenge`, `log`, `log_custom_field`, `managed_challenge`, `redirect`, `rewrite`, `route`, `score`, `serve_error`, `set_cache_settings`, `set_config`, `skip`.
     * 
     */
    private @Nullable String action;
    /**
     * @return Tag name to apply the ruleset rule override to.
     * 
     */
    private @Nullable String category;
    /**
     * @return Defines if the current tag-level override enables or disables the ruleset rules with the specified tag.
     * 
     */
    private @Nullable Boolean enabled;

    private RulesetRuleActionParametersOverridesCategory() {}
    /**
     * @return Action to perform in the ruleset rule. Available values: `block`, `challenge`, `compress_response`, `ddos_dynamic`, `ddos_mitigation`, `execute`, `force_connection_close`, `js_challenge`, `log`, `log_custom_field`, `managed_challenge`, `redirect`, `rewrite`, `route`, `score`, `serve_error`, `set_cache_settings`, `set_config`, `skip`.
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return Tag name to apply the ruleset rule override to.
     * 
     */
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }
    /**
     * @return Defines if the current tag-level override enables or disables the ruleset rules with the specified tag.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActionParametersOverridesCategory defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String action;
        private @Nullable String category;
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(RulesetRuleActionParametersOverridesCategory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.category = defaults.category;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder category(@Nullable String category) {
            this.category = category;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public RulesetRuleActionParametersOverridesCategory build() {
            final var o = new RulesetRuleActionParametersOverridesCategory();
            o.action = action;
            o.category = category;
            o.enabled = enabled;
            return o;
        }
    }
}

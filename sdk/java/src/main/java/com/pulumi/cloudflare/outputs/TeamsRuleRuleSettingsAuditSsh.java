// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class TeamsRuleRuleSettingsAuditSsh {
    private Boolean commandLogging;

    private TeamsRuleRuleSettingsAuditSsh() {}
    public Boolean commandLogging() {
        return this.commandLogging;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeamsRuleRuleSettingsAuditSsh defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean commandLogging;
        public Builder() {}
        public Builder(TeamsRuleRuleSettingsAuditSsh defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandLogging = defaults.commandLogging;
        }

        @CustomType.Setter
        public Builder commandLogging(Boolean commandLogging) {
            this.commandLogging = Objects.requireNonNull(commandLogging);
            return this;
        }
        public TeamsRuleRuleSettingsAuditSsh build() {
            final var o = new TeamsRuleRuleSettingsAuditSsh();
            o.commandLogging = commandLogging;
            return o;
        }
    }
}

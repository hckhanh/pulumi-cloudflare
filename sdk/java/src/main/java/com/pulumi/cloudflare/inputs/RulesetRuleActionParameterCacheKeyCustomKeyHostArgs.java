// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class RulesetRuleActionParameterCacheKeyCustomKeyHostArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParameterCacheKeyCustomKeyHostArgs Empty = new RulesetRuleActionParameterCacheKeyCustomKeyHostArgs();

    @Import(name="resolved", required=true)
    private Output<Boolean> resolved;

    public Output<Boolean> resolved() {
        return this.resolved;
    }

    private RulesetRuleActionParameterCacheKeyCustomKeyHostArgs() {}

    private RulesetRuleActionParameterCacheKeyCustomKeyHostArgs(RulesetRuleActionParameterCacheKeyCustomKeyHostArgs $) {
        this.resolved = $.resolved;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParameterCacheKeyCustomKeyHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParameterCacheKeyCustomKeyHostArgs $;

        public Builder() {
            $ = new RulesetRuleActionParameterCacheKeyCustomKeyHostArgs();
        }

        public Builder(RulesetRuleActionParameterCacheKeyCustomKeyHostArgs defaults) {
            $ = new RulesetRuleActionParameterCacheKeyCustomKeyHostArgs(Objects.requireNonNull(defaults));
        }

        public Builder resolved(Output<Boolean> resolved) {
            $.resolved = resolved;
            return this;
        }

        public Builder resolved(Boolean resolved) {
            return resolved(Output.of(resolved));
        }

        public RulesetRuleActionParameterCacheKeyCustomKeyHostArgs build() {
            $.resolved = Objects.requireNonNull($.resolved, "expected parameter 'resolved' to be non-null");
            return $;
        }
    }

}

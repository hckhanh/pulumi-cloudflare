// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RulesetRuleActionParameterMatchedDataArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParameterMatchedDataArgs Empty = new RulesetRuleActionParameterMatchedDataArgs();

    @Import(name="publicKey", required=true)
    private Output<String> publicKey;

    public Output<String> publicKey() {
        return this.publicKey;
    }

    private RulesetRuleActionParameterMatchedDataArgs() {}

    private RulesetRuleActionParameterMatchedDataArgs(RulesetRuleActionParameterMatchedDataArgs $) {
        this.publicKey = $.publicKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParameterMatchedDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParameterMatchedDataArgs $;

        public Builder() {
            $ = new RulesetRuleActionParameterMatchedDataArgs();
        }

        public Builder(RulesetRuleActionParameterMatchedDataArgs defaults) {
            $ = new RulesetRuleActionParameterMatchedDataArgs(Objects.requireNonNull(defaults));
        }

        public Builder publicKey(Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        public RulesetRuleActionParameterMatchedDataArgs build() {
            $.publicKey = Objects.requireNonNull($.publicKey, "expected parameter 'publicKey' to be non-null");
            return $;
        }
    }

}

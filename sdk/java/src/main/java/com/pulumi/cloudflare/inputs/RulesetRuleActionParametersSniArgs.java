// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleActionParametersSniArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersSniArgs Empty = new RulesetRuleActionParametersSniArgs();

    /**
     * Status code edge TTL value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Status code edge TTL value.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private RulesetRuleActionParametersSniArgs() {}

    private RulesetRuleActionParametersSniArgs(RulesetRuleActionParametersSniArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersSniArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersSniArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersSniArgs();
        }

        public Builder(RulesetRuleActionParametersSniArgs defaults) {
            $ = new RulesetRuleActionParametersSniArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param value Status code edge TTL value.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Status code edge TTL value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public RulesetRuleActionParametersSniArgs build() {
            return $;
        }
    }

}

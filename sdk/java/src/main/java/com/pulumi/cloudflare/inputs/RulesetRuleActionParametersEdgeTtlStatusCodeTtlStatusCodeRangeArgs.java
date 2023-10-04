// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRangeArgs Empty = new RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRangeArgs();

    /**
     * From status code.
     * 
     */
    @Import(name="from")
    private @Nullable Output<Integer> from;

    /**
     * @return From status code.
     * 
     */
    public Optional<Output<Integer>> from() {
        return Optional.ofNullable(this.from);
    }

    /**
     * To status code.
     * 
     */
    @Import(name="to")
    private @Nullable Output<Integer> to;

    /**
     * @return To status code.
     * 
     */
    public Optional<Output<Integer>> to() {
        return Optional.ofNullable(this.to);
    }

    private RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRangeArgs() {}

    private RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRangeArgs(RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRangeArgs $) {
        this.from = $.from;
        this.to = $.to;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRangeArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRangeArgs();
        }

        public Builder(RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRangeArgs defaults) {
            $ = new RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param from From status code.
         * 
         * @return builder
         * 
         */
        public Builder from(@Nullable Output<Integer> from) {
            $.from = from;
            return this;
        }

        /**
         * @param from From status code.
         * 
         * @return builder
         * 
         */
        public Builder from(Integer from) {
            return from(Output.of(from));
        }

        /**
         * @param to To status code.
         * 
         * @return builder
         * 
         */
        public Builder to(@Nullable Output<Integer> to) {
            $.to = to;
            return this;
        }

        /**
         * @param to To status code.
         * 
         * @return builder
         * 
         */
        public Builder to(Integer to) {
            return to(Output.of(to));
        }

        public RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRangeArgs build() {
            return $;
        }
    }

}

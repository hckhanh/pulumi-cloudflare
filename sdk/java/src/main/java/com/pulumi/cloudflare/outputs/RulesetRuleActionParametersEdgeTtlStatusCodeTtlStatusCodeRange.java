// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRange {
    /**
     * @return From status code.
     * 
     */
    private @Nullable Integer from;
    /**
     * @return To status code.
     * 
     */
    private @Nullable Integer to;

    private RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRange() {}
    /**
     * @return From status code.
     * 
     */
    public Optional<Integer> from() {
        return Optional.ofNullable(this.from);
    }
    /**
     * @return To status code.
     * 
     */
    public Optional<Integer> to() {
        return Optional.ofNullable(this.to);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer from;
        private @Nullable Integer to;
        public Builder() {}
        public Builder(RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.to = defaults.to;
        }

        @CustomType.Setter
        public Builder from(@Nullable Integer from) {
            this.from = from;
            return this;
        }
        @CustomType.Setter
        public Builder to(@Nullable Integer to) {
            this.to = to;
            return this;
        }
        public RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRange build() {
            final var o = new RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRange();
            o.from = from;
            o.to = to;
            return o;
        }
    }
}

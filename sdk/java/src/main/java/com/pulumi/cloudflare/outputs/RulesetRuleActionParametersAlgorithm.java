// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RulesetRuleActionParametersAlgorithm {
    /**
     * @return Name of the compression algorithm to use. Available values: `gzip`, `brotli`, `auto`, `default`, `none`
     * 
     */
    private String name;

    private RulesetRuleActionParametersAlgorithm() {}
    /**
     * @return Name of the compression algorithm to use. Available values: `gzip`, `brotli`, `auto`, `default`, `none`
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActionParametersAlgorithm defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        public Builder() {}
        public Builder(RulesetRuleActionParametersAlgorithm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("RulesetRuleActionParametersAlgorithm", "name");
            }
            this.name = name;
            return this;
        }
        public RulesetRuleActionParametersAlgorithm build() {
            final var _resultValue = new RulesetRuleActionParametersAlgorithm();
            _resultValue.name = name;
            return _resultValue;
        }
    }
}

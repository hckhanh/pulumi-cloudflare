// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RulesetRuleActionParameterHeader {
    private String expression;
    /**
     * @return Name of the ruleset.
     * 
     */
    private String name;
    private String operation;
    private String value;

    private RulesetRuleActionParameterHeader() {}
    public String expression() {
        return this.expression;
    }
    /**
     * @return Name of the ruleset.
     * 
     */
    public String name() {
        return this.name;
    }
    public String operation() {
        return this.operation;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActionParameterHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String expression;
        private String name;
        private String operation;
        private String value;
        public Builder() {}
        public Builder(RulesetRuleActionParameterHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.name = defaults.name;
    	      this.operation = defaults.operation;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder operation(String operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public RulesetRuleActionParameterHeader build() {
            final var o = new RulesetRuleActionParameterHeader();
            o.expression = expression;
            o.name = name;
            o.operation = operation;
            o.value = value;
            return o;
        }
    }
}

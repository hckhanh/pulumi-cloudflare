// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleActionParametersHeader {
    /**
     * @return Use a value dynamically determined by the Firewall Rules expression language based on Wireshark display filters. Refer to the [Firewall Rules language](https://developers.cloudflare.com/firewall/cf-firewall-language) documentation for all available fields, operators, and functions.
     * 
     */
    private @Nullable String expression;
    /**
     * @return Name of the compression algorithm to use. Available values: `gzip`, `brotli`, `auto`, `default`, `none`
     * 
     */
    private @Nullable String name;
    /**
     * @return Action to perform on the HTTP request header. Available values: `remove`, `set`, `add`.
     * 
     */
    private @Nullable String operation;
    /**
     * @return Status code edge TTL value.
     * 
     */
    private @Nullable String value;

    private RulesetRuleActionParametersHeader() {}
    /**
     * @return Use a value dynamically determined by the Firewall Rules expression language based on Wireshark display filters. Refer to the [Firewall Rules language](https://developers.cloudflare.com/firewall/cf-firewall-language) documentation for all available fields, operators, and functions.
     * 
     */
    public Optional<String> expression() {
        return Optional.ofNullable(this.expression);
    }
    /**
     * @return Name of the compression algorithm to use. Available values: `gzip`, `brotli`, `auto`, `default`, `none`
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Action to perform on the HTTP request header. Available values: `remove`, `set`, `add`.
     * 
     */
    public Optional<String> operation() {
        return Optional.ofNullable(this.operation);
    }
    /**
     * @return Status code edge TTL value.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActionParametersHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String expression;
        private @Nullable String name;
        private @Nullable String operation;
        private @Nullable String value;
        public Builder() {}
        public Builder(RulesetRuleActionParametersHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.name = defaults.name;
    	      this.operation = defaults.operation;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder expression(@Nullable String expression) {
            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder operation(@Nullable String operation) {
            this.operation = operation;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public RulesetRuleActionParametersHeader build() {
            final var o = new RulesetRuleActionParametersHeader();
            o.expression = expression;
            o.name = name;
            o.operation = operation;
            o.value = value;
            return o;
        }
    }
}

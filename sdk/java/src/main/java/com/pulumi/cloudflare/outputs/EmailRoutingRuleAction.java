// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class EmailRoutingRuleAction {
    /**
     * @return Type of supported action. Available values: `forward`, `worker`, `drop`.
     * 
     */
    private String type;
    /**
     * @return An array with items in the following form. Only required when `type` is `forward` or `worker`.
     * 
     */
    private @Nullable List<String> values;

    private EmailRoutingRuleAction() {}
    /**
     * @return Type of supported action. Available values: `forward`, `worker`, `drop`.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return An array with items in the following form. Only required when `type` is `forward` or `worker`.
     * 
     */
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailRoutingRuleAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String type;
        private @Nullable List<String> values;
        public Builder() {}
        public Builder(EmailRoutingRuleAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("EmailRoutingRuleAction", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder values(@Nullable List<String> values) {

            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public EmailRoutingRuleAction build() {
            final var _resultValue = new EmailRoutingRuleAction();
            _resultValue.type = type;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}

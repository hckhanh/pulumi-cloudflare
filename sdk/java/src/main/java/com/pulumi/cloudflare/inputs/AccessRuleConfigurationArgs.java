// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AccessRuleConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessRuleConfigurationArgs Empty = new AccessRuleConfigurationArgs();

    /**
     * The request property to target. Available values: `ip`, `ip6`, `ip_range`, `asn`, `country`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="target", required=true)
    private Output<String> target;

    /**
     * @return The request property to target. Available values: `ip`, `ip6`, `ip_range`, `asn`, `country`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> target() {
        return this.target;
    }

    /**
     * The value to target. Depends on target&#39;s type. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value to target. Depends on target&#39;s type. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private AccessRuleConfigurationArgs() {}

    private AccessRuleConfigurationArgs(AccessRuleConfigurationArgs $) {
        this.target = $.target;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessRuleConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessRuleConfigurationArgs $;

        public Builder() {
            $ = new AccessRuleConfigurationArgs();
        }

        public Builder(AccessRuleConfigurationArgs defaults) {
            $ = new AccessRuleConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param target The request property to target. Available values: `ip`, `ip6`, `ip_range`, `asn`, `country`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder target(Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The request property to target. Available values: `ip`, `ip6`, `ip_range`, `asn`, `country`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        /**
         * @param value The value to target. Depends on target&#39;s type. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value to target. Depends on target&#39;s type. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public AccessRuleConfigurationArgs build() {
            if ($.target == null) {
                throw new MissingRequiredPropertyException("AccessRuleConfigurationArgs", "target");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("AccessRuleConfigurationArgs", "value");
            }
            return $;
        }
    }

}

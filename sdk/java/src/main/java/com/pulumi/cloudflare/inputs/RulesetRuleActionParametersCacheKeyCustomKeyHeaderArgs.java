// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs Empty = new RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs();

    /**
     * List of cookies to check for presence in the custom key.
     * 
     */
    @Import(name="checkPresences")
    private @Nullable Output<List<String>> checkPresences;

    /**
     * @return List of cookies to check for presence in the custom key.
     * 
     */
    public Optional<Output<List<String>>> checkPresences() {
        return Optional.ofNullable(this.checkPresences);
    }

    /**
     * Exclude the origin header from the custom key.
     * 
     */
    @Import(name="excludeOrigin")
    private @Nullable Output<Boolean> excludeOrigin;

    /**
     * @return Exclude the origin header from the custom key.
     * 
     */
    public Optional<Output<Boolean>> excludeOrigin() {
        return Optional.ofNullable(this.excludeOrigin);
    }

    /**
     * List of cookies to include in the custom key.
     * 
     */
    @Import(name="includes")
    private @Nullable Output<List<String>> includes;

    /**
     * @return List of cookies to include in the custom key.
     * 
     */
    public Optional<Output<List<String>>> includes() {
        return Optional.ofNullable(this.includes);
    }

    private RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs() {}

    private RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs(RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs $) {
        this.checkPresences = $.checkPresences;
        this.excludeOrigin = $.excludeOrigin;
        this.includes = $.includes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs $;

        public Builder() {
            $ = new RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs();
        }

        public Builder(RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs defaults) {
            $ = new RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param checkPresences List of cookies to check for presence in the custom key.
         * 
         * @return builder
         * 
         */
        public Builder checkPresences(@Nullable Output<List<String>> checkPresences) {
            $.checkPresences = checkPresences;
            return this;
        }

        /**
         * @param checkPresences List of cookies to check for presence in the custom key.
         * 
         * @return builder
         * 
         */
        public Builder checkPresences(List<String> checkPresences) {
            return checkPresences(Output.of(checkPresences));
        }

        /**
         * @param checkPresences List of cookies to check for presence in the custom key.
         * 
         * @return builder
         * 
         */
        public Builder checkPresences(String... checkPresences) {
            return checkPresences(List.of(checkPresences));
        }

        /**
         * @param excludeOrigin Exclude the origin header from the custom key.
         * 
         * @return builder
         * 
         */
        public Builder excludeOrigin(@Nullable Output<Boolean> excludeOrigin) {
            $.excludeOrigin = excludeOrigin;
            return this;
        }

        /**
         * @param excludeOrigin Exclude the origin header from the custom key.
         * 
         * @return builder
         * 
         */
        public Builder excludeOrigin(Boolean excludeOrigin) {
            return excludeOrigin(Output.of(excludeOrigin));
        }

        /**
         * @param includes List of cookies to include in the custom key.
         * 
         * @return builder
         * 
         */
        public Builder includes(@Nullable Output<List<String>> includes) {
            $.includes = includes;
            return this;
        }

        /**
         * @param includes List of cookies to include in the custom key.
         * 
         * @return builder
         * 
         */
        public Builder includes(List<String> includes) {
            return includes(Output.of(includes));
        }

        /**
         * @param includes List of cookies to include in the custom key.
         * 
         * @return builder
         * 
         */
        public Builder includes(String... includes) {
            return includes(List.of(includes));
        }

        public RulesetRuleActionParametersCacheKeyCustomKeyHeaderArgs build() {
            return $;
        }
    }

}

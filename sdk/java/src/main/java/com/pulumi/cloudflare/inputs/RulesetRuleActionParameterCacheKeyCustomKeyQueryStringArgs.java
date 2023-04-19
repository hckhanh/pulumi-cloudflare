// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RulesetRuleActionParameterCacheKeyCustomKeyQueryStringArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParameterCacheKeyCustomKeyQueryStringArgs Empty = new RulesetRuleActionParameterCacheKeyCustomKeyQueryStringArgs();

    @Import(name="excludes", required=true)
    private Output<List<String>> excludes;

    public Output<List<String>> excludes() {
        return this.excludes;
    }

    @Import(name="includes", required=true)
    private Output<List<String>> includes;

    public Output<List<String>> includes() {
        return this.includes;
    }

    private RulesetRuleActionParameterCacheKeyCustomKeyQueryStringArgs() {}

    private RulesetRuleActionParameterCacheKeyCustomKeyQueryStringArgs(RulesetRuleActionParameterCacheKeyCustomKeyQueryStringArgs $) {
        this.excludes = $.excludes;
        this.includes = $.includes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParameterCacheKeyCustomKeyQueryStringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParameterCacheKeyCustomKeyQueryStringArgs $;

        public Builder() {
            $ = new RulesetRuleActionParameterCacheKeyCustomKeyQueryStringArgs();
        }

        public Builder(RulesetRuleActionParameterCacheKeyCustomKeyQueryStringArgs defaults) {
            $ = new RulesetRuleActionParameterCacheKeyCustomKeyQueryStringArgs(Objects.requireNonNull(defaults));
        }

        public Builder excludes(Output<List<String>> excludes) {
            $.excludes = excludes;
            return this;
        }

        public Builder excludes(List<String> excludes) {
            return excludes(Output.of(excludes));
        }

        public Builder excludes(String... excludes) {
            return excludes(List.of(excludes));
        }

        public Builder includes(Output<List<String>> includes) {
            $.includes = includes;
            return this;
        }

        public Builder includes(List<String> includes) {
            return includes(Output.of(includes));
        }

        public Builder includes(String... includes) {
            return includes(List.of(includes));
        }

        public RulesetRuleActionParameterCacheKeyCustomKeyQueryStringArgs build() {
            $.excludes = Objects.requireNonNull($.excludes, "expected parameter 'excludes' to be non-null");
            $.includes = Objects.requireNonNull($.includes, "expected parameter 'includes' to be non-null");
            return $;
        }
    }

}

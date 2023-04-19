// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.RulesetRuleActionParameterOverrideCategoryArgs;
import com.pulumi.cloudflare.inputs.RulesetRuleActionParameterOverrideRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RulesetRuleActionParameterOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleActionParameterOverrideArgs Empty = new RulesetRuleActionParameterOverrideArgs();

    @Import(name="action", required=true)
    private Output<String> action;

    public Output<String> action() {
        return this.action;
    }

    @Import(name="categories", required=true)
    private Output<List<RulesetRuleActionParameterOverrideCategoryArgs>> categories;

    public Output<List<RulesetRuleActionParameterOverrideCategoryArgs>> categories() {
        return this.categories;
    }

    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * List of rules to apply to the ruleset.
     * 
     */
    @Import(name="rules", required=true)
    private Output<List<RulesetRuleActionParameterOverrideRuleArgs>> rules;

    /**
     * @return List of rules to apply to the ruleset.
     * 
     */
    public Output<List<RulesetRuleActionParameterOverrideRuleArgs>> rules() {
        return this.rules;
    }

    @Import(name="sensitivityLevel", required=true)
    private Output<String> sensitivityLevel;

    public Output<String> sensitivityLevel() {
        return this.sensitivityLevel;
    }

    private RulesetRuleActionParameterOverrideArgs() {}

    private RulesetRuleActionParameterOverrideArgs(RulesetRuleActionParameterOverrideArgs $) {
        this.action = $.action;
        this.categories = $.categories;
        this.enabled = $.enabled;
        this.rules = $.rules;
        this.sensitivityLevel = $.sensitivityLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleActionParameterOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleActionParameterOverrideArgs $;

        public Builder() {
            $ = new RulesetRuleActionParameterOverrideArgs();
        }

        public Builder(RulesetRuleActionParameterOverrideArgs defaults) {
            $ = new RulesetRuleActionParameterOverrideArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        public Builder action(String action) {
            return action(Output.of(action));
        }

        public Builder categories(Output<List<RulesetRuleActionParameterOverrideCategoryArgs>> categories) {
            $.categories = categories;
            return this;
        }

        public Builder categories(List<RulesetRuleActionParameterOverrideCategoryArgs> categories) {
            return categories(Output.of(categories));
        }

        public Builder categories(RulesetRuleActionParameterOverrideCategoryArgs... categories) {
            return categories(List.of(categories));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param rules List of rules to apply to the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder rules(Output<List<RulesetRuleActionParameterOverrideRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules List of rules to apply to the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<RulesetRuleActionParameterOverrideRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules List of rules to apply to the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder rules(RulesetRuleActionParameterOverrideRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public Builder sensitivityLevel(Output<String> sensitivityLevel) {
            $.sensitivityLevel = sensitivityLevel;
            return this;
        }

        public Builder sensitivityLevel(String sensitivityLevel) {
            return sensitivityLevel(Output.of(sensitivityLevel));
        }

        public RulesetRuleActionParameterOverrideArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.categories = Objects.requireNonNull($.categories, "expected parameter 'categories' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            $.sensitivityLevel = Objects.requireNonNull($.sensitivityLevel, "expected parameter 'sensitivityLevel' to be non-null");
            return $;
        }
    }

}

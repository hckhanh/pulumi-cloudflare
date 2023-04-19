// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.RulesetRuleActionParameterArgs;
import com.pulumi.cloudflare.inputs.RulesetRuleExposedCredentialCheckArgs;
import com.pulumi.cloudflare.inputs.RulesetRuleLoggingArgs;
import com.pulumi.cloudflare.inputs.RulesetRuleRatelimitArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleArgs Empty = new RulesetRuleArgs();

    /**
     * Action to perform in the ruleset rule. Available values: `allow`, `block`, `challenge`, `ddos_dynamic`, `execute`, `force_connection_close`, `js_challenge`, `log`, `log_custom_field`, `managed_challenge`, `redirect`, `rewrite`, `route`, `score`, `set_cache_settings`, `set_config`, `serve_error`, `skip`.
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return Action to perform in the ruleset rule. Available values: `allow`, `block`, `challenge`, `ddos_dynamic`, `execute`, `force_connection_close`, `js_challenge`, `log`, `log_custom_field`, `managed_challenge`, `redirect`, `rewrite`, `route`, `score`, `set_cache_settings`, `set_config`, `serve_error`, `skip`.
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * List of parameters that configure the behavior of the ruleset rule action.
     * 
     */
    @Import(name="actionParameters", required=true)
    private Output<List<RulesetRuleActionParameterArgs>> actionParameters;

    /**
     * @return List of parameters that configure the behavior of the ruleset rule action.
     * 
     */
    public Output<List<RulesetRuleActionParameterArgs>> actionParameters() {
        return this.actionParameters;
    }

    /**
     * Brief summary of the ruleset rule and its intended use.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Brief summary of the ruleset rule and its intended use.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether the rule is active.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether the rule is active.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * List of parameters that configure exposed credential checks.
     * 
     */
    @Import(name="exposedCredentialChecks", required=true)
    private Output<List<RulesetRuleExposedCredentialCheckArgs>> exposedCredentialChecks;

    /**
     * @return List of parameters that configure exposed credential checks.
     * 
     */
    public Output<List<RulesetRuleExposedCredentialCheckArgs>> exposedCredentialChecks() {
        return this.exposedCredentialChecks;
    }

    /**
     * Criteria for an HTTP request to trigger the ruleset rule action. Uses the Firewall Rules expression language based on Wireshark display filters. Refer to the [Firewall Rules language](https://developers.cloudflare.com/firewall/cf-firewall-language) documentation for all available fields, operators, and functions.
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return Criteria for an HTTP request to trigger the ruleset rule action. Uses the Firewall Rules expression language based on Wireshark display filters. Refer to the [Firewall Rules language](https://developers.cloudflare.com/firewall/cf-firewall-language) documentation for all available fields, operators, and functions.
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }

    /**
     * Unique rule identifier.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Unique rule identifier.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The most recent update to this rule.
     * 
     */
    @Import(name="lastUpdated")
    private @Nullable Output<String> lastUpdated;

    /**
     * @return The most recent update to this rule.
     * 
     */
    public Optional<Output<String>> lastUpdated() {
        return Optional.ofNullable(this.lastUpdated);
    }

    /**
     * List parameters to configure how the rule generates logs.
     * 
     */
    @Import(name="loggings", required=true)
    private Output<List<RulesetRuleLoggingArgs>> loggings;

    /**
     * @return List parameters to configure how the rule generates logs.
     * 
     */
    public Output<List<RulesetRuleLoggingArgs>> loggings() {
        return this.loggings;
    }

    /**
     * List of parameters that configure HTTP rate limiting behaviour.
     * 
     */
    @Import(name="ratelimits", required=true)
    private Output<List<RulesetRuleRatelimitArgs>> ratelimits;

    /**
     * @return List of parameters that configure HTTP rate limiting behaviour.
     * 
     */
    public Output<List<RulesetRuleRatelimitArgs>> ratelimits() {
        return this.ratelimits;
    }

    /**
     * Rule reference.
     * 
     */
    @Import(name="ref")
    private @Nullable Output<String> ref;

    /**
     * @return Rule reference.
     * 
     */
    public Optional<Output<String>> ref() {
        return Optional.ofNullable(this.ref);
    }

    /**
     * Version of the ruleset to deploy.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Version of the ruleset to deploy.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private RulesetRuleArgs() {}

    private RulesetRuleArgs(RulesetRuleArgs $) {
        this.action = $.action;
        this.actionParameters = $.actionParameters;
        this.description = $.description;
        this.enabled = $.enabled;
        this.exposedCredentialChecks = $.exposedCredentialChecks;
        this.expression = $.expression;
        this.id = $.id;
        this.lastUpdated = $.lastUpdated;
        this.loggings = $.loggings;
        this.ratelimits = $.ratelimits;
        this.ref = $.ref;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleArgs $;

        public Builder() {
            $ = new RulesetRuleArgs();
        }

        public Builder(RulesetRuleArgs defaults) {
            $ = new RulesetRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Action to perform in the ruleset rule. Available values: `allow`, `block`, `challenge`, `ddos_dynamic`, `execute`, `force_connection_close`, `js_challenge`, `log`, `log_custom_field`, `managed_challenge`, `redirect`, `rewrite`, `route`, `score`, `set_cache_settings`, `set_config`, `serve_error`, `skip`.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Action to perform in the ruleset rule. Available values: `allow`, `block`, `challenge`, `ddos_dynamic`, `execute`, `force_connection_close`, `js_challenge`, `log`, `log_custom_field`, `managed_challenge`, `redirect`, `rewrite`, `route`, `score`, `set_cache_settings`, `set_config`, `serve_error`, `skip`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param actionParameters List of parameters that configure the behavior of the ruleset rule action.
         * 
         * @return builder
         * 
         */
        public Builder actionParameters(Output<List<RulesetRuleActionParameterArgs>> actionParameters) {
            $.actionParameters = actionParameters;
            return this;
        }

        /**
         * @param actionParameters List of parameters that configure the behavior of the ruleset rule action.
         * 
         * @return builder
         * 
         */
        public Builder actionParameters(List<RulesetRuleActionParameterArgs> actionParameters) {
            return actionParameters(Output.of(actionParameters));
        }

        /**
         * @param actionParameters List of parameters that configure the behavior of the ruleset rule action.
         * 
         * @return builder
         * 
         */
        public Builder actionParameters(RulesetRuleActionParameterArgs... actionParameters) {
            return actionParameters(List.of(actionParameters));
        }

        /**
         * @param description Brief summary of the ruleset rule and its intended use.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Brief summary of the ruleset rule and its intended use.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Whether the rule is active.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the rule is active.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param exposedCredentialChecks List of parameters that configure exposed credential checks.
         * 
         * @return builder
         * 
         */
        public Builder exposedCredentialChecks(Output<List<RulesetRuleExposedCredentialCheckArgs>> exposedCredentialChecks) {
            $.exposedCredentialChecks = exposedCredentialChecks;
            return this;
        }

        /**
         * @param exposedCredentialChecks List of parameters that configure exposed credential checks.
         * 
         * @return builder
         * 
         */
        public Builder exposedCredentialChecks(List<RulesetRuleExposedCredentialCheckArgs> exposedCredentialChecks) {
            return exposedCredentialChecks(Output.of(exposedCredentialChecks));
        }

        /**
         * @param exposedCredentialChecks List of parameters that configure exposed credential checks.
         * 
         * @return builder
         * 
         */
        public Builder exposedCredentialChecks(RulesetRuleExposedCredentialCheckArgs... exposedCredentialChecks) {
            return exposedCredentialChecks(List.of(exposedCredentialChecks));
        }

        /**
         * @param expression Criteria for an HTTP request to trigger the ruleset rule action. Uses the Firewall Rules expression language based on Wireshark display filters. Refer to the [Firewall Rules language](https://developers.cloudflare.com/firewall/cf-firewall-language) documentation for all available fields, operators, and functions.
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression Criteria for an HTTP request to trigger the ruleset rule action. Uses the Firewall Rules expression language based on Wireshark display filters. Refer to the [Firewall Rules language](https://developers.cloudflare.com/firewall/cf-firewall-language) documentation for all available fields, operators, and functions.
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param id Unique rule identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Unique rule identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param lastUpdated The most recent update to this rule.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdated(@Nullable Output<String> lastUpdated) {
            $.lastUpdated = lastUpdated;
            return this;
        }

        /**
         * @param lastUpdated The most recent update to this rule.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdated(String lastUpdated) {
            return lastUpdated(Output.of(lastUpdated));
        }

        /**
         * @param loggings List parameters to configure how the rule generates logs.
         * 
         * @return builder
         * 
         */
        public Builder loggings(Output<List<RulesetRuleLoggingArgs>> loggings) {
            $.loggings = loggings;
            return this;
        }

        /**
         * @param loggings List parameters to configure how the rule generates logs.
         * 
         * @return builder
         * 
         */
        public Builder loggings(List<RulesetRuleLoggingArgs> loggings) {
            return loggings(Output.of(loggings));
        }

        /**
         * @param loggings List parameters to configure how the rule generates logs.
         * 
         * @return builder
         * 
         */
        public Builder loggings(RulesetRuleLoggingArgs... loggings) {
            return loggings(List.of(loggings));
        }

        /**
         * @param ratelimits List of parameters that configure HTTP rate limiting behaviour.
         * 
         * @return builder
         * 
         */
        public Builder ratelimits(Output<List<RulesetRuleRatelimitArgs>> ratelimits) {
            $.ratelimits = ratelimits;
            return this;
        }

        /**
         * @param ratelimits List of parameters that configure HTTP rate limiting behaviour.
         * 
         * @return builder
         * 
         */
        public Builder ratelimits(List<RulesetRuleRatelimitArgs> ratelimits) {
            return ratelimits(Output.of(ratelimits));
        }

        /**
         * @param ratelimits List of parameters that configure HTTP rate limiting behaviour.
         * 
         * @return builder
         * 
         */
        public Builder ratelimits(RulesetRuleRatelimitArgs... ratelimits) {
            return ratelimits(List.of(ratelimits));
        }

        /**
         * @param ref Rule reference.
         * 
         * @return builder
         * 
         */
        public Builder ref(@Nullable Output<String> ref) {
            $.ref = ref;
            return this;
        }

        /**
         * @param ref Rule reference.
         * 
         * @return builder
         * 
         */
        public Builder ref(String ref) {
            return ref(Output.of(ref));
        }

        /**
         * @param version Version of the ruleset to deploy.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Version of the ruleset to deploy.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public RulesetRuleArgs build() {
            $.actionParameters = Objects.requireNonNull($.actionParameters, "expected parameter 'actionParameters' to be non-null");
            $.exposedCredentialChecks = Objects.requireNonNull($.exposedCredentialChecks, "expected parameter 'exposedCredentialChecks' to be non-null");
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            $.loggings = Objects.requireNonNull($.loggings, "expected parameter 'loggings' to be non-null");
            $.ratelimits = Objects.requireNonNull($.ratelimits, "expected parameter 'ratelimits' to be non-null");
            return $;
        }
    }

}

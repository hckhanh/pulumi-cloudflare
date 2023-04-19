// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RulesetRuleExposedCredentialCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetRuleExposedCredentialCheckArgs Empty = new RulesetRuleExposedCredentialCheckArgs();

    @Import(name="passwordExpression", required=true)
    private Output<String> passwordExpression;

    public Output<String> passwordExpression() {
        return this.passwordExpression;
    }

    @Import(name="usernameExpression", required=true)
    private Output<String> usernameExpression;

    public Output<String> usernameExpression() {
        return this.usernameExpression;
    }

    private RulesetRuleExposedCredentialCheckArgs() {}

    private RulesetRuleExposedCredentialCheckArgs(RulesetRuleExposedCredentialCheckArgs $) {
        this.passwordExpression = $.passwordExpression;
        this.usernameExpression = $.usernameExpression;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetRuleExposedCredentialCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetRuleExposedCredentialCheckArgs $;

        public Builder() {
            $ = new RulesetRuleExposedCredentialCheckArgs();
        }

        public Builder(RulesetRuleExposedCredentialCheckArgs defaults) {
            $ = new RulesetRuleExposedCredentialCheckArgs(Objects.requireNonNull(defaults));
        }

        public Builder passwordExpression(Output<String> passwordExpression) {
            $.passwordExpression = passwordExpression;
            return this;
        }

        public Builder passwordExpression(String passwordExpression) {
            return passwordExpression(Output.of(passwordExpression));
        }

        public Builder usernameExpression(Output<String> usernameExpression) {
            $.usernameExpression = usernameExpression;
            return this;
        }

        public Builder usernameExpression(String usernameExpression) {
            return usernameExpression(Output.of(usernameExpression));
        }

        public RulesetRuleExposedCredentialCheckArgs build() {
            $.passwordExpression = Objects.requireNonNull($.passwordExpression, "expected parameter 'passwordExpression' to be non-null");
            $.usernameExpression = Objects.requireNonNull($.usernameExpression, "expected parameter 'usernameExpression' to be non-null");
            return $;
        }
    }

}

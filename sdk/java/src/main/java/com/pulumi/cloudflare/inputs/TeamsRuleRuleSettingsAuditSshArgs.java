// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;


public final class TeamsRuleRuleSettingsAuditSshArgs extends com.pulumi.resources.ResourceArgs {

    public static final TeamsRuleRuleSettingsAuditSshArgs Empty = new TeamsRuleRuleSettingsAuditSshArgs();

    /**
     * Log all SSH commands.
     * 
     */
    @Import(name="commandLogging", required=true)
    private Output<Boolean> commandLogging;

    /**
     * @return Log all SSH commands.
     * 
     */
    public Output<Boolean> commandLogging() {
        return this.commandLogging;
    }

    private TeamsRuleRuleSettingsAuditSshArgs() {}

    private TeamsRuleRuleSettingsAuditSshArgs(TeamsRuleRuleSettingsAuditSshArgs $) {
        this.commandLogging = $.commandLogging;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamsRuleRuleSettingsAuditSshArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamsRuleRuleSettingsAuditSshArgs $;

        public Builder() {
            $ = new TeamsRuleRuleSettingsAuditSshArgs();
        }

        public Builder(TeamsRuleRuleSettingsAuditSshArgs defaults) {
            $ = new TeamsRuleRuleSettingsAuditSshArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param commandLogging Log all SSH commands.
         * 
         * @return builder
         * 
         */
        public Builder commandLogging(Output<Boolean> commandLogging) {
            $.commandLogging = commandLogging;
            return this;
        }

        /**
         * @param commandLogging Log all SSH commands.
         * 
         * @return builder
         * 
         */
        public Builder commandLogging(Boolean commandLogging) {
            return commandLogging(Output.of(commandLogging));
        }

        public TeamsRuleRuleSettingsAuditSshArgs build() {
            if ($.commandLogging == null) {
                throw new MissingRequiredPropertyException("TeamsRuleRuleSettingsAuditSshArgs", "commandLogging");
            }
            return $;
        }
    }

}

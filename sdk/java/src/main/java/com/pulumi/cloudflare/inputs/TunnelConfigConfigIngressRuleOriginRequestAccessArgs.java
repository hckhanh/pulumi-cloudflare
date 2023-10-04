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


public final class TunnelConfigConfigIngressRuleOriginRequestAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final TunnelConfigConfigIngressRuleOriginRequestAccessArgs Empty = new TunnelConfigConfigIngressRuleOriginRequestAccessArgs();

    /**
     * Audience tags of the access rule.
     * 
     */
    @Import(name="audTags")
    private @Nullable Output<List<String>> audTags;

    /**
     * @return Audience tags of the access rule.
     * 
     */
    public Optional<Output<List<String>>> audTags() {
        return Optional.ofNullable(this.audTags);
    }

    /**
     * Whether the access rule is required.
     * 
     */
    @Import(name="required")
    private @Nullable Output<Boolean> required;

    /**
     * @return Whether the access rule is required.
     * 
     */
    public Optional<Output<Boolean>> required() {
        return Optional.ofNullable(this.required);
    }

    /**
     * Name of the team to which the access rule applies.
     * 
     */
    @Import(name="teamName")
    private @Nullable Output<String> teamName;

    /**
     * @return Name of the team to which the access rule applies.
     * 
     */
    public Optional<Output<String>> teamName() {
        return Optional.ofNullable(this.teamName);
    }

    private TunnelConfigConfigIngressRuleOriginRequestAccessArgs() {}

    private TunnelConfigConfigIngressRuleOriginRequestAccessArgs(TunnelConfigConfigIngressRuleOriginRequestAccessArgs $) {
        this.audTags = $.audTags;
        this.required = $.required;
        this.teamName = $.teamName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TunnelConfigConfigIngressRuleOriginRequestAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TunnelConfigConfigIngressRuleOriginRequestAccessArgs $;

        public Builder() {
            $ = new TunnelConfigConfigIngressRuleOriginRequestAccessArgs();
        }

        public Builder(TunnelConfigConfigIngressRuleOriginRequestAccessArgs defaults) {
            $ = new TunnelConfigConfigIngressRuleOriginRequestAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audTags Audience tags of the access rule.
         * 
         * @return builder
         * 
         */
        public Builder audTags(@Nullable Output<List<String>> audTags) {
            $.audTags = audTags;
            return this;
        }

        /**
         * @param audTags Audience tags of the access rule.
         * 
         * @return builder
         * 
         */
        public Builder audTags(List<String> audTags) {
            return audTags(Output.of(audTags));
        }

        /**
         * @param audTags Audience tags of the access rule.
         * 
         * @return builder
         * 
         */
        public Builder audTags(String... audTags) {
            return audTags(List.of(audTags));
        }

        /**
         * @param required Whether the access rule is required.
         * 
         * @return builder
         * 
         */
        public Builder required(@Nullable Output<Boolean> required) {
            $.required = required;
            return this;
        }

        /**
         * @param required Whether the access rule is required.
         * 
         * @return builder
         * 
         */
        public Builder required(Boolean required) {
            return required(Output.of(required));
        }

        /**
         * @param teamName Name of the team to which the access rule applies.
         * 
         * @return builder
         * 
         */
        public Builder teamName(@Nullable Output<String> teamName) {
            $.teamName = teamName;
            return this;
        }

        /**
         * @param teamName Name of the team to which the access rule applies.
         * 
         * @return builder
         * 
         */
        public Builder teamName(String teamName) {
            return teamName(Output.of(teamName));
        }

        public TunnelConfigConfigIngressRuleOriginRequestAccessArgs build() {
            return $;
        }
    }

}

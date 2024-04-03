// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TeamsRuleRuleSettingsEgressArgs extends com.pulumi.resources.ResourceArgs {

    public static final TeamsRuleRuleSettingsEgressArgs Empty = new TeamsRuleRuleSettingsEgressArgs();

    /**
     * IPv4 resolvers.
     * 
     */
    @Import(name="ipv4", required=true)
    private Output<String> ipv4;

    /**
     * @return IPv4 resolvers.
     * 
     */
    public Output<String> ipv4() {
        return this.ipv4;
    }

    /**
     * The IPv4 address to be used for egress in the event of an error egressing with the primary IPv4. Can be &#39;0.0.0.0&#39; to indicate local egreass via Warp IPs.
     * 
     */
    @Import(name="ipv4Fallback")
    private @Nullable Output<String> ipv4Fallback;

    /**
     * @return The IPv4 address to be used for egress in the event of an error egressing with the primary IPv4. Can be &#39;0.0.0.0&#39; to indicate local egreass via Warp IPs.
     * 
     */
    public Optional<Output<String>> ipv4Fallback() {
        return Optional.ofNullable(this.ipv4Fallback);
    }

    /**
     * IPv6 resolvers.
     * 
     */
    @Import(name="ipv6", required=true)
    private Output<String> ipv6;

    /**
     * @return IPv6 resolvers.
     * 
     */
    public Output<String> ipv6() {
        return this.ipv6;
    }

    private TeamsRuleRuleSettingsEgressArgs() {}

    private TeamsRuleRuleSettingsEgressArgs(TeamsRuleRuleSettingsEgressArgs $) {
        this.ipv4 = $.ipv4;
        this.ipv4Fallback = $.ipv4Fallback;
        this.ipv6 = $.ipv6;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamsRuleRuleSettingsEgressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamsRuleRuleSettingsEgressArgs $;

        public Builder() {
            $ = new TeamsRuleRuleSettingsEgressArgs();
        }

        public Builder(TeamsRuleRuleSettingsEgressArgs defaults) {
            $ = new TeamsRuleRuleSettingsEgressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipv4 IPv4 resolvers.
         * 
         * @return builder
         * 
         */
        public Builder ipv4(Output<String> ipv4) {
            $.ipv4 = ipv4;
            return this;
        }

        /**
         * @param ipv4 IPv4 resolvers.
         * 
         * @return builder
         * 
         */
        public Builder ipv4(String ipv4) {
            return ipv4(Output.of(ipv4));
        }

        /**
         * @param ipv4Fallback The IPv4 address to be used for egress in the event of an error egressing with the primary IPv4. Can be &#39;0.0.0.0&#39; to indicate local egreass via Warp IPs.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Fallback(@Nullable Output<String> ipv4Fallback) {
            $.ipv4Fallback = ipv4Fallback;
            return this;
        }

        /**
         * @param ipv4Fallback The IPv4 address to be used for egress in the event of an error egressing with the primary IPv4. Can be &#39;0.0.0.0&#39; to indicate local egreass via Warp IPs.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Fallback(String ipv4Fallback) {
            return ipv4Fallback(Output.of(ipv4Fallback));
        }

        /**
         * @param ipv6 IPv6 resolvers.
         * 
         * @return builder
         * 
         */
        public Builder ipv6(Output<String> ipv6) {
            $.ipv6 = ipv6;
            return this;
        }

        /**
         * @param ipv6 IPv6 resolvers.
         * 
         * @return builder
         * 
         */
        public Builder ipv6(String ipv6) {
            return ipv6(Output.of(ipv6));
        }

        public TeamsRuleRuleSettingsEgressArgs build() {
            if ($.ipv4 == null) {
                throw new MissingRequiredPropertyException("TeamsRuleRuleSettingsEgressArgs", "ipv4");
            }
            if ($.ipv6 == null) {
                throw new MissingRequiredPropertyException("TeamsRuleRuleSettingsEgressArgs", "ipv6");
            }
            return $;
        }
    }

}

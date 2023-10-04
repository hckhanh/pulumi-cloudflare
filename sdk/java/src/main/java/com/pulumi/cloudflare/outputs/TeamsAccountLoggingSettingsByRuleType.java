// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.TeamsAccountLoggingSettingsByRuleTypeDns;
import com.pulumi.cloudflare.outputs.TeamsAccountLoggingSettingsByRuleTypeHttp;
import com.pulumi.cloudflare.outputs.TeamsAccountLoggingSettingsByRuleTypeL4;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class TeamsAccountLoggingSettingsByRuleType {
    /**
     * @return Logging configuration for DNS requests.
     * 
     */
    private TeamsAccountLoggingSettingsByRuleTypeDns dns;
    /**
     * @return Logging configuration for HTTP requests.
     * 
     */
    private TeamsAccountLoggingSettingsByRuleTypeHttp http;
    /**
     * @return Logging configuration for layer 4 requests.
     * 
     */
    private TeamsAccountLoggingSettingsByRuleTypeL4 l4;

    private TeamsAccountLoggingSettingsByRuleType() {}
    /**
     * @return Logging configuration for DNS requests.
     * 
     */
    public TeamsAccountLoggingSettingsByRuleTypeDns dns() {
        return this.dns;
    }
    /**
     * @return Logging configuration for HTTP requests.
     * 
     */
    public TeamsAccountLoggingSettingsByRuleTypeHttp http() {
        return this.http;
    }
    /**
     * @return Logging configuration for layer 4 requests.
     * 
     */
    public TeamsAccountLoggingSettingsByRuleTypeL4 l4() {
        return this.l4;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeamsAccountLoggingSettingsByRuleType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private TeamsAccountLoggingSettingsByRuleTypeDns dns;
        private TeamsAccountLoggingSettingsByRuleTypeHttp http;
        private TeamsAccountLoggingSettingsByRuleTypeL4 l4;
        public Builder() {}
        public Builder(TeamsAccountLoggingSettingsByRuleType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dns = defaults.dns;
    	      this.http = defaults.http;
    	      this.l4 = defaults.l4;
        }

        @CustomType.Setter
        public Builder dns(TeamsAccountLoggingSettingsByRuleTypeDns dns) {
            this.dns = Objects.requireNonNull(dns);
            return this;
        }
        @CustomType.Setter
        public Builder http(TeamsAccountLoggingSettingsByRuleTypeHttp http) {
            this.http = Objects.requireNonNull(http);
            return this;
        }
        @CustomType.Setter
        public Builder l4(TeamsAccountLoggingSettingsByRuleTypeL4 l4) {
            this.l4 = Objects.requireNonNull(l4);
            return this;
        }
        public TeamsAccountLoggingSettingsByRuleType build() {
            final var o = new TeamsAccountLoggingSettingsByRuleType();
            o.dns = dns;
            o.http = http;
            o.l4 = l4;
            return o;
        }
    }
}

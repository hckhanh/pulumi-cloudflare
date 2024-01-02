// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class LoadBalancerRuleOverrideCountryPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerRuleOverrideCountryPoolArgs Empty = new LoadBalancerRuleOverrideCountryPoolArgs();

    /**
     * A country code which can be determined with the Load Balancing Regions API described [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api/). Multiple entries should not be specified with the same country.
     * 
     */
    @Import(name="country", required=true)
    private Output<String> country;

    /**
     * @return A country code which can be determined with the Load Balancing Regions API described [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api/). Multiple entries should not be specified with the same country.
     * 
     */
    public Output<String> country() {
        return this.country;
    }

    /**
     * A list of pool IDs in failover priority to use in the given country.
     * 
     */
    @Import(name="poolIds", required=true)
    private Output<List<String>> poolIds;

    /**
     * @return A list of pool IDs in failover priority to use in the given country.
     * 
     */
    public Output<List<String>> poolIds() {
        return this.poolIds;
    }

    private LoadBalancerRuleOverrideCountryPoolArgs() {}

    private LoadBalancerRuleOverrideCountryPoolArgs(LoadBalancerRuleOverrideCountryPoolArgs $) {
        this.country = $.country;
        this.poolIds = $.poolIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerRuleOverrideCountryPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerRuleOverrideCountryPoolArgs $;

        public Builder() {
            $ = new LoadBalancerRuleOverrideCountryPoolArgs();
        }

        public Builder(LoadBalancerRuleOverrideCountryPoolArgs defaults) {
            $ = new LoadBalancerRuleOverrideCountryPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param country A country code which can be determined with the Load Balancing Regions API described [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api/). Multiple entries should not be specified with the same country.
         * 
         * @return builder
         * 
         */
        public Builder country(Output<String> country) {
            $.country = country;
            return this;
        }

        /**
         * @param country A country code which can be determined with the Load Balancing Regions API described [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api/). Multiple entries should not be specified with the same country.
         * 
         * @return builder
         * 
         */
        public Builder country(String country) {
            return country(Output.of(country));
        }

        /**
         * @param poolIds A list of pool IDs in failover priority to use in the given country.
         * 
         * @return builder
         * 
         */
        public Builder poolIds(Output<List<String>> poolIds) {
            $.poolIds = poolIds;
            return this;
        }

        /**
         * @param poolIds A list of pool IDs in failover priority to use in the given country.
         * 
         * @return builder
         * 
         */
        public Builder poolIds(List<String> poolIds) {
            return poolIds(Output.of(poolIds));
        }

        /**
         * @param poolIds A list of pool IDs in failover priority to use in the given country.
         * 
         * @return builder
         * 
         */
        public Builder poolIds(String... poolIds) {
            return poolIds(List.of(poolIds));
        }

        public LoadBalancerRuleOverrideCountryPoolArgs build() {
            if ($.country == null) {
                throw new MissingRequiredPropertyException("LoadBalancerRuleOverrideCountryPoolArgs", "country");
            }
            if ($.poolIds == null) {
                throw new MissingRequiredPropertyException("LoadBalancerRuleOverrideCountryPoolArgs", "poolIds");
            }
            return $;
        }
    }

}

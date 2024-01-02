// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class LoadBalancerRuleOverrideRegionPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerRuleOverrideRegionPoolArgs Empty = new LoadBalancerRuleOverrideRegionPoolArgs();

    /**
     * A list of pool IDs in failover priority to use in the given region.
     * 
     */
    @Import(name="poolIds", required=true)
    private Output<List<String>> poolIds;

    /**
     * @return A list of pool IDs in failover priority to use in the given region.
     * 
     */
    public Output<List<String>> poolIds() {
        return this.poolIds;
    }

    /**
     * A region code which must be in the list defined [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api/#list-of-load-balancer-regions). Multiple entries should not be specified with the same region.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return A region code which must be in the list defined [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api/#list-of-load-balancer-regions). Multiple entries should not be specified with the same region.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    private LoadBalancerRuleOverrideRegionPoolArgs() {}

    private LoadBalancerRuleOverrideRegionPoolArgs(LoadBalancerRuleOverrideRegionPoolArgs $) {
        this.poolIds = $.poolIds;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerRuleOverrideRegionPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerRuleOverrideRegionPoolArgs $;

        public Builder() {
            $ = new LoadBalancerRuleOverrideRegionPoolArgs();
        }

        public Builder(LoadBalancerRuleOverrideRegionPoolArgs defaults) {
            $ = new LoadBalancerRuleOverrideRegionPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param poolIds A list of pool IDs in failover priority to use in the given region.
         * 
         * @return builder
         * 
         */
        public Builder poolIds(Output<List<String>> poolIds) {
            $.poolIds = poolIds;
            return this;
        }

        /**
         * @param poolIds A list of pool IDs in failover priority to use in the given region.
         * 
         * @return builder
         * 
         */
        public Builder poolIds(List<String> poolIds) {
            return poolIds(Output.of(poolIds));
        }

        /**
         * @param poolIds A list of pool IDs in failover priority to use in the given region.
         * 
         * @return builder
         * 
         */
        public Builder poolIds(String... poolIds) {
            return poolIds(List.of(poolIds));
        }

        /**
         * @param region A region code which must be in the list defined [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api/#list-of-load-balancer-regions). Multiple entries should not be specified with the same region.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region A region code which must be in the list defined [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api/#list-of-load-balancer-regions). Multiple entries should not be specified with the same region.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public LoadBalancerRuleOverrideRegionPoolArgs build() {
            if ($.poolIds == null) {
                throw new MissingRequiredPropertyException("LoadBalancerRuleOverrideRegionPoolArgs", "poolIds");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("LoadBalancerRuleOverrideRegionPoolArgs", "region");
            }
            return $;
        }
    }

}

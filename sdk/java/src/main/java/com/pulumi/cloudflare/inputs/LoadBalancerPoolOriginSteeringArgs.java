// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerPoolOriginSteeringArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerPoolOriginSteeringArgs Empty = new LoadBalancerPoolOriginSteeringArgs();

    /**
     * Origin steering policy to be used. Available values: ``,`hash`,`random`. Defaults to`random`.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return Origin steering policy to be used. Available values: ``,`hash`,`random`. Defaults to`random`.
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    private LoadBalancerPoolOriginSteeringArgs() {}

    private LoadBalancerPoolOriginSteeringArgs(LoadBalancerPoolOriginSteeringArgs $) {
        this.policy = $.policy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerPoolOriginSteeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerPoolOriginSteeringArgs $;

        public Builder() {
            $ = new LoadBalancerPoolOriginSteeringArgs();
        }

        public Builder(LoadBalancerPoolOriginSteeringArgs defaults) {
            $ = new LoadBalancerPoolOriginSteeringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policy Origin steering policy to be used. Available values: ``,`hash`,`random`. Defaults to`random`.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy Origin steering policy to be used. Available values: ``,`hash`,`random`. Defaults to`random`.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public LoadBalancerPoolOriginSteeringArgs build() {
            return $;
        }
    }

}

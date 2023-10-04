// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsProductionPlacementArgs;
import com.pulumi.cloudflare.inputs.PagesProjectDeploymentConfigsProductionServiceBindingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PagesProjectDeploymentConfigsProductionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PagesProjectDeploymentConfigsProductionArgs Empty = new PagesProjectDeploymentConfigsProductionArgs();

    /**
     * Use latest compatibility date for Pages Functions. Defaults to `false`.
     * 
     */
    @Import(name="alwaysUseLatestCompatibilityDate")
    private @Nullable Output<Boolean> alwaysUseLatestCompatibilityDate;

    /**
     * @return Use latest compatibility date for Pages Functions. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> alwaysUseLatestCompatibilityDate() {
        return Optional.ofNullable(this.alwaysUseLatestCompatibilityDate);
    }

    /**
     * Compatibility date used for Pages Functions.
     * 
     */
    @Import(name="compatibilityDate")
    private @Nullable Output<String> compatibilityDate;

    /**
     * @return Compatibility date used for Pages Functions.
     * 
     */
    public Optional<Output<String>> compatibilityDate() {
        return Optional.ofNullable(this.compatibilityDate);
    }

    /**
     * Compatibility flags used for Pages Functions.
     * 
     */
    @Import(name="compatibilityFlags")
    private @Nullable Output<List<String>> compatibilityFlags;

    /**
     * @return Compatibility flags used for Pages Functions.
     * 
     */
    public Optional<Output<List<String>>> compatibilityFlags() {
        return Optional.ofNullable(this.compatibilityFlags);
    }

    /**
     * D1 Databases used for Pages Functions. Defaults to `map[]`.
     * 
     */
    @Import(name="d1Databases")
    private @Nullable Output<Map<String,Object>> d1Databases;

    /**
     * @return D1 Databases used for Pages Functions. Defaults to `map[]`.
     * 
     */
    public Optional<Output<Map<String,Object>>> d1Databases() {
        return Optional.ofNullable(this.d1Databases);
    }

    /**
     * Durable Object namespaces used for Pages Functions. Defaults to `map[]`.
     * 
     */
    @Import(name="durableObjectNamespaces")
    private @Nullable Output<Map<String,Object>> durableObjectNamespaces;

    /**
     * @return Durable Object namespaces used for Pages Functions. Defaults to `map[]`.
     * 
     */
    public Optional<Output<Map<String,Object>>> durableObjectNamespaces() {
        return Optional.ofNullable(this.durableObjectNamespaces);
    }

    /**
     * Environment variables for Pages Functions. Defaults to `map[]`.
     * 
     */
    @Import(name="environmentVariables")
    private @Nullable Output<Map<String,Object>> environmentVariables;

    /**
     * @return Environment variables for Pages Functions. Defaults to `map[]`.
     * 
     */
    public Optional<Output<Map<String,Object>>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    /**
     * Fail open used for Pages Functions. Defaults to `false`.
     * 
     */
    @Import(name="failOpen")
    private @Nullable Output<Boolean> failOpen;

    /**
     * @return Fail open used for Pages Functions. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> failOpen() {
        return Optional.ofNullable(this.failOpen);
    }

    /**
     * KV namespaces used for Pages Functions. Defaults to `map[]`.
     * 
     */
    @Import(name="kvNamespaces")
    private @Nullable Output<Map<String,Object>> kvNamespaces;

    /**
     * @return KV namespaces used for Pages Functions. Defaults to `map[]`.
     * 
     */
    public Optional<Output<Map<String,Object>>> kvNamespaces() {
        return Optional.ofNullable(this.kvNamespaces);
    }

    /**
     * Configuration for placement in the Cloudflare Pages project.
     * 
     */
    @Import(name="placement")
    private @Nullable Output<PagesProjectDeploymentConfigsProductionPlacementArgs> placement;

    /**
     * @return Configuration for placement in the Cloudflare Pages project.
     * 
     */
    public Optional<Output<PagesProjectDeploymentConfigsProductionPlacementArgs>> placement() {
        return Optional.ofNullable(this.placement);
    }

    /**
     * R2 Buckets used for Pages Functions. Defaults to `map[]`.
     * 
     */
    @Import(name="r2Buckets")
    private @Nullable Output<Map<String,Object>> r2Buckets;

    /**
     * @return R2 Buckets used for Pages Functions. Defaults to `map[]`.
     * 
     */
    public Optional<Output<Map<String,Object>>> r2Buckets() {
        return Optional.ofNullable(this.r2Buckets);
    }

    /**
     * Encrypted environment variables for Pages Functions. Defaults to `map[]`.
     * 
     */
    @Import(name="secrets")
    private @Nullable Output<Map<String,Object>> secrets;

    /**
     * @return Encrypted environment variables for Pages Functions. Defaults to `map[]`.
     * 
     */
    public Optional<Output<Map<String,Object>>> secrets() {
        return Optional.ofNullable(this.secrets);
    }

    /**
     * Services used for Pages Functions.
     * 
     */
    @Import(name="serviceBindings")
    private @Nullable Output<List<PagesProjectDeploymentConfigsProductionServiceBindingArgs>> serviceBindings;

    /**
     * @return Services used for Pages Functions.
     * 
     */
    public Optional<Output<List<PagesProjectDeploymentConfigsProductionServiceBindingArgs>>> serviceBindings() {
        return Optional.ofNullable(this.serviceBindings);
    }

    /**
     * Usage model used for Pages Functions. Defaults to `bundled`.
     * 
     */
    @Import(name="usageModel")
    private @Nullable Output<String> usageModel;

    /**
     * @return Usage model used for Pages Functions. Defaults to `bundled`.
     * 
     */
    public Optional<Output<String>> usageModel() {
        return Optional.ofNullable(this.usageModel);
    }

    private PagesProjectDeploymentConfigsProductionArgs() {}

    private PagesProjectDeploymentConfigsProductionArgs(PagesProjectDeploymentConfigsProductionArgs $) {
        this.alwaysUseLatestCompatibilityDate = $.alwaysUseLatestCompatibilityDate;
        this.compatibilityDate = $.compatibilityDate;
        this.compatibilityFlags = $.compatibilityFlags;
        this.d1Databases = $.d1Databases;
        this.durableObjectNamespaces = $.durableObjectNamespaces;
        this.environmentVariables = $.environmentVariables;
        this.failOpen = $.failOpen;
        this.kvNamespaces = $.kvNamespaces;
        this.placement = $.placement;
        this.r2Buckets = $.r2Buckets;
        this.secrets = $.secrets;
        this.serviceBindings = $.serviceBindings;
        this.usageModel = $.usageModel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PagesProjectDeploymentConfigsProductionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PagesProjectDeploymentConfigsProductionArgs $;

        public Builder() {
            $ = new PagesProjectDeploymentConfigsProductionArgs();
        }

        public Builder(PagesProjectDeploymentConfigsProductionArgs defaults) {
            $ = new PagesProjectDeploymentConfigsProductionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alwaysUseLatestCompatibilityDate Use latest compatibility date for Pages Functions. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder alwaysUseLatestCompatibilityDate(@Nullable Output<Boolean> alwaysUseLatestCompatibilityDate) {
            $.alwaysUseLatestCompatibilityDate = alwaysUseLatestCompatibilityDate;
            return this;
        }

        /**
         * @param alwaysUseLatestCompatibilityDate Use latest compatibility date for Pages Functions. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder alwaysUseLatestCompatibilityDate(Boolean alwaysUseLatestCompatibilityDate) {
            return alwaysUseLatestCompatibilityDate(Output.of(alwaysUseLatestCompatibilityDate));
        }

        /**
         * @param compatibilityDate Compatibility date used for Pages Functions.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityDate(@Nullable Output<String> compatibilityDate) {
            $.compatibilityDate = compatibilityDate;
            return this;
        }

        /**
         * @param compatibilityDate Compatibility date used for Pages Functions.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityDate(String compatibilityDate) {
            return compatibilityDate(Output.of(compatibilityDate));
        }

        /**
         * @param compatibilityFlags Compatibility flags used for Pages Functions.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityFlags(@Nullable Output<List<String>> compatibilityFlags) {
            $.compatibilityFlags = compatibilityFlags;
            return this;
        }

        /**
         * @param compatibilityFlags Compatibility flags used for Pages Functions.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityFlags(List<String> compatibilityFlags) {
            return compatibilityFlags(Output.of(compatibilityFlags));
        }

        /**
         * @param compatibilityFlags Compatibility flags used for Pages Functions.
         * 
         * @return builder
         * 
         */
        public Builder compatibilityFlags(String... compatibilityFlags) {
            return compatibilityFlags(List.of(compatibilityFlags));
        }

        /**
         * @param d1Databases D1 Databases used for Pages Functions. Defaults to `map[]`.
         * 
         * @return builder
         * 
         */
        public Builder d1Databases(@Nullable Output<Map<String,Object>> d1Databases) {
            $.d1Databases = d1Databases;
            return this;
        }

        /**
         * @param d1Databases D1 Databases used for Pages Functions. Defaults to `map[]`.
         * 
         * @return builder
         * 
         */
        public Builder d1Databases(Map<String,Object> d1Databases) {
            return d1Databases(Output.of(d1Databases));
        }

        /**
         * @param durableObjectNamespaces Durable Object namespaces used for Pages Functions. Defaults to `map[]`.
         * 
         * @return builder
         * 
         */
        public Builder durableObjectNamespaces(@Nullable Output<Map<String,Object>> durableObjectNamespaces) {
            $.durableObjectNamespaces = durableObjectNamespaces;
            return this;
        }

        /**
         * @param durableObjectNamespaces Durable Object namespaces used for Pages Functions. Defaults to `map[]`.
         * 
         * @return builder
         * 
         */
        public Builder durableObjectNamespaces(Map<String,Object> durableObjectNamespaces) {
            return durableObjectNamespaces(Output.of(durableObjectNamespaces));
        }

        /**
         * @param environmentVariables Environment variables for Pages Functions. Defaults to `map[]`.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(@Nullable Output<Map<String,Object>> environmentVariables) {
            $.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * @param environmentVariables Environment variables for Pages Functions. Defaults to `map[]`.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(Map<String,Object> environmentVariables) {
            return environmentVariables(Output.of(environmentVariables));
        }

        /**
         * @param failOpen Fail open used for Pages Functions. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder failOpen(@Nullable Output<Boolean> failOpen) {
            $.failOpen = failOpen;
            return this;
        }

        /**
         * @param failOpen Fail open used for Pages Functions. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder failOpen(Boolean failOpen) {
            return failOpen(Output.of(failOpen));
        }

        /**
         * @param kvNamespaces KV namespaces used for Pages Functions. Defaults to `map[]`.
         * 
         * @return builder
         * 
         */
        public Builder kvNamespaces(@Nullable Output<Map<String,Object>> kvNamespaces) {
            $.kvNamespaces = kvNamespaces;
            return this;
        }

        /**
         * @param kvNamespaces KV namespaces used for Pages Functions. Defaults to `map[]`.
         * 
         * @return builder
         * 
         */
        public Builder kvNamespaces(Map<String,Object> kvNamespaces) {
            return kvNamespaces(Output.of(kvNamespaces));
        }

        /**
         * @param placement Configuration for placement in the Cloudflare Pages project.
         * 
         * @return builder
         * 
         */
        public Builder placement(@Nullable Output<PagesProjectDeploymentConfigsProductionPlacementArgs> placement) {
            $.placement = placement;
            return this;
        }

        /**
         * @param placement Configuration for placement in the Cloudflare Pages project.
         * 
         * @return builder
         * 
         */
        public Builder placement(PagesProjectDeploymentConfigsProductionPlacementArgs placement) {
            return placement(Output.of(placement));
        }

        /**
         * @param r2Buckets R2 Buckets used for Pages Functions. Defaults to `map[]`.
         * 
         * @return builder
         * 
         */
        public Builder r2Buckets(@Nullable Output<Map<String,Object>> r2Buckets) {
            $.r2Buckets = r2Buckets;
            return this;
        }

        /**
         * @param r2Buckets R2 Buckets used for Pages Functions. Defaults to `map[]`.
         * 
         * @return builder
         * 
         */
        public Builder r2Buckets(Map<String,Object> r2Buckets) {
            return r2Buckets(Output.of(r2Buckets));
        }

        /**
         * @param secrets Encrypted environment variables for Pages Functions. Defaults to `map[]`.
         * 
         * @return builder
         * 
         */
        public Builder secrets(@Nullable Output<Map<String,Object>> secrets) {
            $.secrets = secrets;
            return this;
        }

        /**
         * @param secrets Encrypted environment variables for Pages Functions. Defaults to `map[]`.
         * 
         * @return builder
         * 
         */
        public Builder secrets(Map<String,Object> secrets) {
            return secrets(Output.of(secrets));
        }

        /**
         * @param serviceBindings Services used for Pages Functions.
         * 
         * @return builder
         * 
         */
        public Builder serviceBindings(@Nullable Output<List<PagesProjectDeploymentConfigsProductionServiceBindingArgs>> serviceBindings) {
            $.serviceBindings = serviceBindings;
            return this;
        }

        /**
         * @param serviceBindings Services used for Pages Functions.
         * 
         * @return builder
         * 
         */
        public Builder serviceBindings(List<PagesProjectDeploymentConfigsProductionServiceBindingArgs> serviceBindings) {
            return serviceBindings(Output.of(serviceBindings));
        }

        /**
         * @param serviceBindings Services used for Pages Functions.
         * 
         * @return builder
         * 
         */
        public Builder serviceBindings(PagesProjectDeploymentConfigsProductionServiceBindingArgs... serviceBindings) {
            return serviceBindings(List.of(serviceBindings));
        }

        /**
         * @param usageModel Usage model used for Pages Functions. Defaults to `bundled`.
         * 
         * @return builder
         * 
         */
        public Builder usageModel(@Nullable Output<String> usageModel) {
            $.usageModel = usageModel;
            return this;
        }

        /**
         * @param usageModel Usage model used for Pages Functions. Defaults to `bundled`.
         * 
         * @return builder
         * 
         */
        public Builder usageModel(String usageModel) {
            return usageModel(Output.of(usageModel));
        }

        public PagesProjectDeploymentConfigsProductionArgs build() {
            return $;
        }
    }

}

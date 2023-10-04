// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.LoadBalancerPoolLoadSheddingArgs;
import com.pulumi.cloudflare.inputs.LoadBalancerPoolOriginArgs;
import com.pulumi.cloudflare.inputs.LoadBalancerPoolOriginSteeringArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerPoolState extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerPoolState Empty = new LoadBalancerPoolState();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api).
     * 
     */
    @Import(name="checkRegions")
    private @Nullable Output<List<String>> checkRegions;

    /**
     * @return A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api).
     * 
     */
    public Optional<Output<List<String>>> checkRegions() {
        return Optional.ofNullable(this.checkRegions);
    }

    /**
     * The RFC3339 timestamp of when the load balancer was created.
     * 
     */
    @Import(name="createdOn")
    private @Nullable Output<String> createdOn;

    /**
     * @return The RFC3339 timestamp of when the load balancer was created.
     * 
     */
    public Optional<Output<String>> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }

    /**
     * Free text description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Free text description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether this origin is enabled. Disabled origins will not receive traffic and are excluded from health checks. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether this origin is enabled. Disabled origins will not receive traffic and are excluded from health checks. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The latitude this pool is physically located at; used for proximity steering.
     * 
     */
    @Import(name="latitude")
    private @Nullable Output<Double> latitude;

    /**
     * @return The latitude this pool is physically located at; used for proximity steering.
     * 
     */
    public Optional<Output<Double>> latitude() {
        return Optional.ofNullable(this.latitude);
    }

    /**
     * Setting for controlling load shedding for this pool.
     * 
     */
    @Import(name="loadSheddings")
    private @Nullable Output<List<LoadBalancerPoolLoadSheddingArgs>> loadSheddings;

    /**
     * @return Setting for controlling load shedding for this pool.
     * 
     */
    public Optional<Output<List<LoadBalancerPoolLoadSheddingArgs>>> loadSheddings() {
        return Optional.ofNullable(this.loadSheddings);
    }

    /**
     * The longitude this pool is physically located at; used for proximity steering.
     * 
     */
    @Import(name="longitude")
    private @Nullable Output<Double> longitude;

    /**
     * @return The longitude this pool is physically located at; used for proximity steering.
     * 
     */
    public Optional<Output<Double>> longitude() {
        return Optional.ofNullable(this.longitude);
    }

    /**
     * The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Defaults to `1`.
     * 
     */
    @Import(name="minimumOrigins")
    private @Nullable Output<Integer> minimumOrigins;

    /**
     * @return The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Defaults to `1`.
     * 
     */
    public Optional<Output<Integer>> minimumOrigins() {
        return Optional.ofNullable(this.minimumOrigins);
    }

    /**
     * The RFC3339 timestamp of when the load balancer was last modified.
     * 
     */
    @Import(name="modifiedOn")
    private @Nullable Output<String> modifiedOn;

    /**
     * @return The RFC3339 timestamp of when the load balancer was last modified.
     * 
     */
    public Optional<Output<String>> modifiedOn() {
        return Optional.ofNullable(this.modifiedOn);
    }

    /**
     * The ID of the Monitor to use for health checking origins within this pool.
     * 
     */
    @Import(name="monitor")
    private @Nullable Output<String> monitor;

    /**
     * @return The ID of the Monitor to use for health checking origins within this pool.
     * 
     */
    public Optional<Output<String>> monitor() {
        return Optional.ofNullable(this.monitor);
    }

    /**
     * A human-identifiable name for the origin.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A human-identifiable name for the origin.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The email address to send health status notifications to. This can be an individual mailbox or a mailing list. Multiple emails can be supplied as a comma delimited list.
     * 
     */
    @Import(name="notificationEmail")
    private @Nullable Output<String> notificationEmail;

    /**
     * @return The email address to send health status notifications to. This can be an individual mailbox or a mailing list. Multiple emails can be supplied as a comma delimited list.
     * 
     */
    public Optional<Output<String>> notificationEmail() {
        return Optional.ofNullable(this.notificationEmail);
    }

    /**
     * Set an origin steering policy to control origin selection within a pool.
     * 
     */
    @Import(name="originSteerings")
    private @Nullable Output<List<LoadBalancerPoolOriginSteeringArgs>> originSteerings;

    /**
     * @return Set an origin steering policy to control origin selection within a pool.
     * 
     */
    public Optional<Output<List<LoadBalancerPoolOriginSteeringArgs>>> originSteerings() {
        return Optional.ofNullable(this.originSteerings);
    }

    /**
     * The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy.
     * 
     */
    @Import(name="origins")
    private @Nullable Output<List<LoadBalancerPoolOriginArgs>> origins;

    /**
     * @return The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy.
     * 
     */
    public Optional<Output<List<LoadBalancerPoolOriginArgs>>> origins() {
        return Optional.ofNullable(this.origins);
    }

    private LoadBalancerPoolState() {}

    private LoadBalancerPoolState(LoadBalancerPoolState $) {
        this.accountId = $.accountId;
        this.checkRegions = $.checkRegions;
        this.createdOn = $.createdOn;
        this.description = $.description;
        this.enabled = $.enabled;
        this.latitude = $.latitude;
        this.loadSheddings = $.loadSheddings;
        this.longitude = $.longitude;
        this.minimumOrigins = $.minimumOrigins;
        this.modifiedOn = $.modifiedOn;
        this.monitor = $.monitor;
        this.name = $.name;
        this.notificationEmail = $.notificationEmail;
        this.originSteerings = $.originSteerings;
        this.origins = $.origins;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerPoolState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerPoolState $;

        public Builder() {
            $ = new LoadBalancerPoolState();
        }

        public Builder(LoadBalancerPoolState defaults) {
            $ = new LoadBalancerPoolState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param checkRegions A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api).
         * 
         * @return builder
         * 
         */
        public Builder checkRegions(@Nullable Output<List<String>> checkRegions) {
            $.checkRegions = checkRegions;
            return this;
        }

        /**
         * @param checkRegions A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api).
         * 
         * @return builder
         * 
         */
        public Builder checkRegions(List<String> checkRegions) {
            return checkRegions(Output.of(checkRegions));
        }

        /**
         * @param checkRegions A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api).
         * 
         * @return builder
         * 
         */
        public Builder checkRegions(String... checkRegions) {
            return checkRegions(List.of(checkRegions));
        }

        /**
         * @param createdOn The RFC3339 timestamp of when the load balancer was created.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(@Nullable Output<String> createdOn) {
            $.createdOn = createdOn;
            return this;
        }

        /**
         * @param createdOn The RFC3339 timestamp of when the load balancer was created.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(String createdOn) {
            return createdOn(Output.of(createdOn));
        }

        /**
         * @param description Free text description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Free text description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Whether this origin is enabled. Disabled origins will not receive traffic and are excluded from health checks. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether this origin is enabled. Disabled origins will not receive traffic and are excluded from health checks. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param latitude The latitude this pool is physically located at; used for proximity steering.
         * 
         * @return builder
         * 
         */
        public Builder latitude(@Nullable Output<Double> latitude) {
            $.latitude = latitude;
            return this;
        }

        /**
         * @param latitude The latitude this pool is physically located at; used for proximity steering.
         * 
         * @return builder
         * 
         */
        public Builder latitude(Double latitude) {
            return latitude(Output.of(latitude));
        }

        /**
         * @param loadSheddings Setting for controlling load shedding for this pool.
         * 
         * @return builder
         * 
         */
        public Builder loadSheddings(@Nullable Output<List<LoadBalancerPoolLoadSheddingArgs>> loadSheddings) {
            $.loadSheddings = loadSheddings;
            return this;
        }

        /**
         * @param loadSheddings Setting for controlling load shedding for this pool.
         * 
         * @return builder
         * 
         */
        public Builder loadSheddings(List<LoadBalancerPoolLoadSheddingArgs> loadSheddings) {
            return loadSheddings(Output.of(loadSheddings));
        }

        /**
         * @param loadSheddings Setting for controlling load shedding for this pool.
         * 
         * @return builder
         * 
         */
        public Builder loadSheddings(LoadBalancerPoolLoadSheddingArgs... loadSheddings) {
            return loadSheddings(List.of(loadSheddings));
        }

        /**
         * @param longitude The longitude this pool is physically located at; used for proximity steering.
         * 
         * @return builder
         * 
         */
        public Builder longitude(@Nullable Output<Double> longitude) {
            $.longitude = longitude;
            return this;
        }

        /**
         * @param longitude The longitude this pool is physically located at; used for proximity steering.
         * 
         * @return builder
         * 
         */
        public Builder longitude(Double longitude) {
            return longitude(Output.of(longitude));
        }

        /**
         * @param minimumOrigins The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder minimumOrigins(@Nullable Output<Integer> minimumOrigins) {
            $.minimumOrigins = minimumOrigins;
            return this;
        }

        /**
         * @param minimumOrigins The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder minimumOrigins(Integer minimumOrigins) {
            return minimumOrigins(Output.of(minimumOrigins));
        }

        /**
         * @param modifiedOn The RFC3339 timestamp of when the load balancer was last modified.
         * 
         * @return builder
         * 
         */
        public Builder modifiedOn(@Nullable Output<String> modifiedOn) {
            $.modifiedOn = modifiedOn;
            return this;
        }

        /**
         * @param modifiedOn The RFC3339 timestamp of when the load balancer was last modified.
         * 
         * @return builder
         * 
         */
        public Builder modifiedOn(String modifiedOn) {
            return modifiedOn(Output.of(modifiedOn));
        }

        /**
         * @param monitor The ID of the Monitor to use for health checking origins within this pool.
         * 
         * @return builder
         * 
         */
        public Builder monitor(@Nullable Output<String> monitor) {
            $.monitor = monitor;
            return this;
        }

        /**
         * @param monitor The ID of the Monitor to use for health checking origins within this pool.
         * 
         * @return builder
         * 
         */
        public Builder monitor(String monitor) {
            return monitor(Output.of(monitor));
        }

        /**
         * @param name A human-identifiable name for the origin.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A human-identifiable name for the origin.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notificationEmail The email address to send health status notifications to. This can be an individual mailbox or a mailing list. Multiple emails can be supplied as a comma delimited list.
         * 
         * @return builder
         * 
         */
        public Builder notificationEmail(@Nullable Output<String> notificationEmail) {
            $.notificationEmail = notificationEmail;
            return this;
        }

        /**
         * @param notificationEmail The email address to send health status notifications to. This can be an individual mailbox or a mailing list. Multiple emails can be supplied as a comma delimited list.
         * 
         * @return builder
         * 
         */
        public Builder notificationEmail(String notificationEmail) {
            return notificationEmail(Output.of(notificationEmail));
        }

        /**
         * @param originSteerings Set an origin steering policy to control origin selection within a pool.
         * 
         * @return builder
         * 
         */
        public Builder originSteerings(@Nullable Output<List<LoadBalancerPoolOriginSteeringArgs>> originSteerings) {
            $.originSteerings = originSteerings;
            return this;
        }

        /**
         * @param originSteerings Set an origin steering policy to control origin selection within a pool.
         * 
         * @return builder
         * 
         */
        public Builder originSteerings(List<LoadBalancerPoolOriginSteeringArgs> originSteerings) {
            return originSteerings(Output.of(originSteerings));
        }

        /**
         * @param originSteerings Set an origin steering policy to control origin selection within a pool.
         * 
         * @return builder
         * 
         */
        public Builder originSteerings(LoadBalancerPoolOriginSteeringArgs... originSteerings) {
            return originSteerings(List.of(originSteerings));
        }

        /**
         * @param origins The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy.
         * 
         * @return builder
         * 
         */
        public Builder origins(@Nullable Output<List<LoadBalancerPoolOriginArgs>> origins) {
            $.origins = origins;
            return this;
        }

        /**
         * @param origins The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy.
         * 
         * @return builder
         * 
         */
        public Builder origins(List<LoadBalancerPoolOriginArgs> origins) {
            return origins(Output.of(origins));
        }

        /**
         * @param origins The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy.
         * 
         * @return builder
         * 
         */
        public Builder origins(LoadBalancerPoolOriginArgs... origins) {
            return origins(List.of(origins));
        }

        public LoadBalancerPoolState build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class DevicePolicyCertificatesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DevicePolicyCertificatesArgs Empty = new DevicePolicyCertificatesArgs();

    /**
     * `true` if certificate generation is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return `true` if certificate generation is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The zone identifier to target for the resource.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private DevicePolicyCertificatesArgs() {}

    private DevicePolicyCertificatesArgs(DevicePolicyCertificatesArgs $) {
        this.enabled = $.enabled;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DevicePolicyCertificatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DevicePolicyCertificatesArgs $;

        public Builder() {
            $ = new DevicePolicyCertificatesArgs();
        }

        public Builder(DevicePolicyCertificatesArgs defaults) {
            $ = new DevicePolicyCertificatesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled `true` if certificate generation is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled `true` if certificate generation is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public DevicePolicyCertificatesArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.ApiShieldAuthIdCharacteristicArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiShieldArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiShieldArgs Empty = new ApiShieldArgs();

    /**
     * Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
     * 
     */
    @Import(name="authIdCharacteristics")
    private @Nullable Output<List<ApiShieldAuthIdCharacteristicArgs>> authIdCharacteristics;

    /**
     * @return Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
     * 
     */
    public Optional<Output<List<ApiShieldAuthIdCharacteristicArgs>>> authIdCharacteristics() {
        return Optional.ofNullable(this.authIdCharacteristics);
    }

    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private ApiShieldArgs() {}

    private ApiShieldArgs(ApiShieldArgs $) {
        this.authIdCharacteristics = $.authIdCharacteristics;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiShieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiShieldArgs $;

        public Builder() {
            $ = new ApiShieldArgs();
        }

        public Builder(ApiShieldArgs defaults) {
            $ = new ApiShieldArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authIdCharacteristics Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
         * 
         * @return builder
         * 
         */
        public Builder authIdCharacteristics(@Nullable Output<List<ApiShieldAuthIdCharacteristicArgs>> authIdCharacteristics) {
            $.authIdCharacteristics = authIdCharacteristics;
            return this;
        }

        /**
         * @param authIdCharacteristics Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
         * 
         * @return builder
         * 
         */
        public Builder authIdCharacteristics(List<ApiShieldAuthIdCharacteristicArgs> authIdCharacteristics) {
            return authIdCharacteristics(Output.of(authIdCharacteristics));
        }

        /**
         * @param authIdCharacteristics Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
         * 
         * @return builder
         * 
         */
        public Builder authIdCharacteristics(ApiShieldAuthIdCharacteristicArgs... authIdCharacteristics) {
            return authIdCharacteristics(List.of(authIdCharacteristics));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public ApiShieldArgs build() {
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("ApiShieldArgs", "zoneId");
            }
            return $;
        }
    }

}

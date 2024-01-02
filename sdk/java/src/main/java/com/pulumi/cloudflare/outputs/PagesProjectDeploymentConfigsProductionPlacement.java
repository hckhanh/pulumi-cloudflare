// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PagesProjectDeploymentConfigsProductionPlacement {
    /**
     * @return Placement Mode for the Pages Function.
     * 
     */
    private @Nullable String mode;

    private PagesProjectDeploymentConfigsProductionPlacement() {}
    /**
     * @return Placement Mode for the Pages Function.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PagesProjectDeploymentConfigsProductionPlacement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String mode;
        public Builder() {}
        public Builder(PagesProjectDeploymentConfigsProductionPlacement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        @CustomType.Setter
        public Builder mode(@Nullable String mode) {

            this.mode = mode;
            return this;
        }
        public PagesProjectDeploymentConfigsProductionPlacement build() {
            final var _resultValue = new PagesProjectDeploymentConfigsProductionPlacement();
            _resultValue.mode = mode;
            return _resultValue;
        }
    }
}

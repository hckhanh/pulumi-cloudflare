// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SpectrumApplicationOriginDns {
    /**
     * @return Fully qualified domain name of the origin.
     * 
     */
    private String name;

    private SpectrumApplicationOriginDns() {}
    /**
     * @return Fully qualified domain name of the origin.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpectrumApplicationOriginDns defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        public Builder() {}
        public Builder(SpectrumApplicationOriginDns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("SpectrumApplicationOriginDns", "name");
            }
            this.name = name;
            return this;
        }
        public SpectrumApplicationOriginDns build() {
            final var _resultValue = new SpectrumApplicationOriginDns();
            _resultValue.name = name;
            return _resultValue;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZoneSettingsOverrideSettingsSecurityHeader {
    private @Nullable Boolean enabled;
    private @Nullable Boolean includeSubdomains;
    private @Nullable Integer maxAge;
    private @Nullable Boolean nosniff;
    private @Nullable Boolean preload;

    private ZoneSettingsOverrideSettingsSecurityHeader() {}
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Boolean> includeSubdomains() {
        return Optional.ofNullable(this.includeSubdomains);
    }
    public Optional<Integer> maxAge() {
        return Optional.ofNullable(this.maxAge);
    }
    public Optional<Boolean> nosniff() {
        return Optional.ofNullable(this.nosniff);
    }
    public Optional<Boolean> preload() {
        return Optional.ofNullable(this.preload);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZoneSettingsOverrideSettingsSecurityHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Boolean includeSubdomains;
        private @Nullable Integer maxAge;
        private @Nullable Boolean nosniff;
        private @Nullable Boolean preload;
        public Builder() {}
        public Builder(ZoneSettingsOverrideSettingsSecurityHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.includeSubdomains = defaults.includeSubdomains;
    	      this.maxAge = defaults.maxAge;
    	      this.nosniff = defaults.nosniff;
    	      this.preload = defaults.preload;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder includeSubdomains(@Nullable Boolean includeSubdomains) {
            this.includeSubdomains = includeSubdomains;
            return this;
        }
        @CustomType.Setter
        public Builder maxAge(@Nullable Integer maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        @CustomType.Setter
        public Builder nosniff(@Nullable Boolean nosniff) {
            this.nosniff = nosniff;
            return this;
        }
        @CustomType.Setter
        public Builder preload(@Nullable Boolean preload) {
            this.preload = preload;
            return this;
        }
        public ZoneSettingsOverrideSettingsSecurityHeader build() {
            final var o = new ZoneSettingsOverrideSettingsSecurityHeader();
            o.enabled = enabled;
            o.includeSubdomains = includeSubdomains;
            o.maxAge = maxAge;
            o.nosniff = nosniff;
            o.preload = preload;
            return o;
        }
    }
}

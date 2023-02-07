// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomSslCustomSslOptions {
    /**
     * @return Method of building intermediate certificate chain. A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it. Available values: `ubiquitous`, `optimal`, `force`.
     * 
     */
    private @Nullable String bundleMethod;
    /**
     * @return Certificate certificate and the intermediate(s).
     * 
     */
    private @Nullable String certificate;
    /**
     * @return Specifies the region where your private key can be held locally. Available values: `us`, `eu`, `highest_security`.
     * 
     */
    private @Nullable String geoRestrictions;
    /**
     * @return Certificate&#39;s private key.
     * 
     */
    private @Nullable String privateKey;
    /**
     * @return Whether to enable support for legacy clients which do not include SNI in the TLS handshake. Available values: `legacy_custom`, `sni_custom`.
     * 
     */
    private @Nullable String type;

    private CustomSslCustomSslOptions() {}
    /**
     * @return Method of building intermediate certificate chain. A ubiquitous bundle has the highest probability of being verified everywhere, even by clients using outdated or unusual trust stores. An optimal bundle uses the shortest chain and newest intermediates. And the force bundle verifies the chain, but does not otherwise modify it. Available values: `ubiquitous`, `optimal`, `force`.
     * 
     */
    public Optional<String> bundleMethod() {
        return Optional.ofNullable(this.bundleMethod);
    }
    /**
     * @return Certificate certificate and the intermediate(s).
     * 
     */
    public Optional<String> certificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * @return Specifies the region where your private key can be held locally. Available values: `us`, `eu`, `highest_security`.
     * 
     */
    public Optional<String> geoRestrictions() {
        return Optional.ofNullable(this.geoRestrictions);
    }
    /**
     * @return Certificate&#39;s private key.
     * 
     */
    public Optional<String> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }
    /**
     * @return Whether to enable support for legacy clients which do not include SNI in the TLS handshake. Available values: `legacy_custom`, `sni_custom`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomSslCustomSslOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bundleMethod;
        private @Nullable String certificate;
        private @Nullable String geoRestrictions;
        private @Nullable String privateKey;
        private @Nullable String type;
        public Builder() {}
        public Builder(CustomSslCustomSslOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundleMethod = defaults.bundleMethod;
    	      this.certificate = defaults.certificate;
    	      this.geoRestrictions = defaults.geoRestrictions;
    	      this.privateKey = defaults.privateKey;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder bundleMethod(@Nullable String bundleMethod) {
            this.bundleMethod = bundleMethod;
            return this;
        }
        @CustomType.Setter
        public Builder certificate(@Nullable String certificate) {
            this.certificate = certificate;
            return this;
        }
        @CustomType.Setter
        public Builder geoRestrictions(@Nullable String geoRestrictions) {
            this.geoRestrictions = geoRestrictions;
            return this;
        }
        @CustomType.Setter
        public Builder privateKey(@Nullable String privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public CustomSslCustomSslOptions build() {
            final var o = new CustomSslCustomSslOptions();
            o.bundleMethod = bundleMethod;
            o.certificate = certificate;
            o.geoRestrictions = geoRestrictions;
            o.privateKey = privateKey;
            o.type = type;
            return o;
        }
    }
}

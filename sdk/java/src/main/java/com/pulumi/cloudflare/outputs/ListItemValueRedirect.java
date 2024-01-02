// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListItemValueRedirect {
    /**
     * @return Whether the redirect also matches subdomains of the source url. Available values: `disabled`, `enabled`.
     * 
     */
    private @Nullable String includeSubdomains;
    /**
     * @return Whether to preserve the path suffix when doing subpath matching. Available values: `disabled`, `enabled`.
     * 
     */
    private @Nullable String preservePathSuffix;
    /**
     * @return Whether the redirect target url should keep the query string of the request&#39;s url. Available values: `disabled`, `enabled`.
     * 
     */
    private @Nullable String preserveQueryString;
    /**
     * @return The source url of the redirect.
     * 
     */
    private String sourceUrl;
    /**
     * @return The status code to be used when redirecting a request.
     * 
     */
    private @Nullable Integer statusCode;
    /**
     * @return Whether the redirect also matches subpaths of the source url. Available values: `disabled`, `enabled`.
     * 
     */
    private @Nullable String subpathMatching;
    /**
     * @return The target url of the redirect.
     * 
     */
    private String targetUrl;

    private ListItemValueRedirect() {}
    /**
     * @return Whether the redirect also matches subdomains of the source url. Available values: `disabled`, `enabled`.
     * 
     */
    public Optional<String> includeSubdomains() {
        return Optional.ofNullable(this.includeSubdomains);
    }
    /**
     * @return Whether to preserve the path suffix when doing subpath matching. Available values: `disabled`, `enabled`.
     * 
     */
    public Optional<String> preservePathSuffix() {
        return Optional.ofNullable(this.preservePathSuffix);
    }
    /**
     * @return Whether the redirect target url should keep the query string of the request&#39;s url. Available values: `disabled`, `enabled`.
     * 
     */
    public Optional<String> preserveQueryString() {
        return Optional.ofNullable(this.preserveQueryString);
    }
    /**
     * @return The source url of the redirect.
     * 
     */
    public String sourceUrl() {
        return this.sourceUrl;
    }
    /**
     * @return The status code to be used when redirecting a request.
     * 
     */
    public Optional<Integer> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }
    /**
     * @return Whether the redirect also matches subpaths of the source url. Available values: `disabled`, `enabled`.
     * 
     */
    public Optional<String> subpathMatching() {
        return Optional.ofNullable(this.subpathMatching);
    }
    /**
     * @return The target url of the redirect.
     * 
     */
    public String targetUrl() {
        return this.targetUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListItemValueRedirect defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String includeSubdomains;
        private @Nullable String preservePathSuffix;
        private @Nullable String preserveQueryString;
        private String sourceUrl;
        private @Nullable Integer statusCode;
        private @Nullable String subpathMatching;
        private String targetUrl;
        public Builder() {}
        public Builder(ListItemValueRedirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeSubdomains = defaults.includeSubdomains;
    	      this.preservePathSuffix = defaults.preservePathSuffix;
    	      this.preserveQueryString = defaults.preserveQueryString;
    	      this.sourceUrl = defaults.sourceUrl;
    	      this.statusCode = defaults.statusCode;
    	      this.subpathMatching = defaults.subpathMatching;
    	      this.targetUrl = defaults.targetUrl;
        }

        @CustomType.Setter
        public Builder includeSubdomains(@Nullable String includeSubdomains) {

            this.includeSubdomains = includeSubdomains;
            return this;
        }
        @CustomType.Setter
        public Builder preservePathSuffix(@Nullable String preservePathSuffix) {

            this.preservePathSuffix = preservePathSuffix;
            return this;
        }
        @CustomType.Setter
        public Builder preserveQueryString(@Nullable String preserveQueryString) {

            this.preserveQueryString = preserveQueryString;
            return this;
        }
        @CustomType.Setter
        public Builder sourceUrl(String sourceUrl) {
            if (sourceUrl == null) {
              throw new MissingRequiredPropertyException("ListItemValueRedirect", "sourceUrl");
            }
            this.sourceUrl = sourceUrl;
            return this;
        }
        @CustomType.Setter
        public Builder statusCode(@Nullable Integer statusCode) {

            this.statusCode = statusCode;
            return this;
        }
        @CustomType.Setter
        public Builder subpathMatching(@Nullable String subpathMatching) {

            this.subpathMatching = subpathMatching;
            return this;
        }
        @CustomType.Setter
        public Builder targetUrl(String targetUrl) {
            if (targetUrl == null) {
              throw new MissingRequiredPropertyException("ListItemValueRedirect", "targetUrl");
            }
            this.targetUrl = targetUrl;
            return this;
        }
        public ListItemValueRedirect build() {
            final var _resultValue = new ListItemValueRedirect();
            _resultValue.includeSubdomains = includeSubdomains;
            _resultValue.preservePathSuffix = preservePathSuffix;
            _resultValue.preserveQueryString = preserveQueryString;
            _resultValue.sourceUrl = sourceUrl;
            _resultValue.statusCode = statusCode;
            _resultValue.subpathMatching = subpathMatching;
            _resultValue.targetUrl = targetUrl;
            return _resultValue;
        }
    }
}

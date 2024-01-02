// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleActionParametersCacheKeyCustomKeyHeader {
    /**
     * @return List of cookies to check for presence in the custom key.
     * 
     */
    private @Nullable List<String> checkPresences;
    /**
     * @return Exclude the origin header from the custom key.
     * 
     */
    private @Nullable Boolean excludeOrigin;
    /**
     * @return List of cookies to include in the custom key.
     * 
     */
    private @Nullable List<String> includes;

    private RulesetRuleActionParametersCacheKeyCustomKeyHeader() {}
    /**
     * @return List of cookies to check for presence in the custom key.
     * 
     */
    public List<String> checkPresences() {
        return this.checkPresences == null ? List.of() : this.checkPresences;
    }
    /**
     * @return Exclude the origin header from the custom key.
     * 
     */
    public Optional<Boolean> excludeOrigin() {
        return Optional.ofNullable(this.excludeOrigin);
    }
    /**
     * @return List of cookies to include in the custom key.
     * 
     */
    public List<String> includes() {
        return this.includes == null ? List.of() : this.includes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActionParametersCacheKeyCustomKeyHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> checkPresences;
        private @Nullable Boolean excludeOrigin;
        private @Nullable List<String> includes;
        public Builder() {}
        public Builder(RulesetRuleActionParametersCacheKeyCustomKeyHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkPresences = defaults.checkPresences;
    	      this.excludeOrigin = defaults.excludeOrigin;
    	      this.includes = defaults.includes;
        }

        @CustomType.Setter
        public Builder checkPresences(@Nullable List<String> checkPresences) {

            this.checkPresences = checkPresences;
            return this;
        }
        public Builder checkPresences(String... checkPresences) {
            return checkPresences(List.of(checkPresences));
        }
        @CustomType.Setter
        public Builder excludeOrigin(@Nullable Boolean excludeOrigin) {

            this.excludeOrigin = excludeOrigin;
            return this;
        }
        @CustomType.Setter
        public Builder includes(@Nullable List<String> includes) {

            this.includes = includes;
            return this;
        }
        public Builder includes(String... includes) {
            return includes(List.of(includes));
        }
        public RulesetRuleActionParametersCacheKeyCustomKeyHeader build() {
            final var _resultValue = new RulesetRuleActionParametersCacheKeyCustomKeyHeader();
            _resultValue.checkPresences = checkPresences;
            _resultValue.excludeOrigin = excludeOrigin;
            _resultValue.includes = includes;
            return _resultValue;
        }
    }
}

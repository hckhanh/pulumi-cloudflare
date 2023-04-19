// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RulesetRuleRatelimit {
    private List<String> characteristics;
    private String countingExpression;
    private Integer mitigationTimeout;
    private Integer period;
    private Integer requestsPerPeriod;
    private Boolean requestsToOrigin;
    private Integer scorePerPeriod;
    private String scoreResponseHeaderName;

    private RulesetRuleRatelimit() {}
    public List<String> characteristics() {
        return this.characteristics;
    }
    public String countingExpression() {
        return this.countingExpression;
    }
    public Integer mitigationTimeout() {
        return this.mitigationTimeout;
    }
    public Integer period() {
        return this.period;
    }
    public Integer requestsPerPeriod() {
        return this.requestsPerPeriod;
    }
    public Boolean requestsToOrigin() {
        return this.requestsToOrigin;
    }
    public Integer scorePerPeriod() {
        return this.scorePerPeriod;
    }
    public String scoreResponseHeaderName() {
        return this.scoreResponseHeaderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleRatelimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> characteristics;
        private String countingExpression;
        private Integer mitigationTimeout;
        private Integer period;
        private Integer requestsPerPeriod;
        private Boolean requestsToOrigin;
        private Integer scorePerPeriod;
        private String scoreResponseHeaderName;
        public Builder() {}
        public Builder(RulesetRuleRatelimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.characteristics = defaults.characteristics;
    	      this.countingExpression = defaults.countingExpression;
    	      this.mitigationTimeout = defaults.mitigationTimeout;
    	      this.period = defaults.period;
    	      this.requestsPerPeriod = defaults.requestsPerPeriod;
    	      this.requestsToOrigin = defaults.requestsToOrigin;
    	      this.scorePerPeriod = defaults.scorePerPeriod;
    	      this.scoreResponseHeaderName = defaults.scoreResponseHeaderName;
        }

        @CustomType.Setter
        public Builder characteristics(List<String> characteristics) {
            this.characteristics = Objects.requireNonNull(characteristics);
            return this;
        }
        public Builder characteristics(String... characteristics) {
            return characteristics(List.of(characteristics));
        }
        @CustomType.Setter
        public Builder countingExpression(String countingExpression) {
            this.countingExpression = Objects.requireNonNull(countingExpression);
            return this;
        }
        @CustomType.Setter
        public Builder mitigationTimeout(Integer mitigationTimeout) {
            this.mitigationTimeout = Objects.requireNonNull(mitigationTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder period(Integer period) {
            this.period = Objects.requireNonNull(period);
            return this;
        }
        @CustomType.Setter
        public Builder requestsPerPeriod(Integer requestsPerPeriod) {
            this.requestsPerPeriod = Objects.requireNonNull(requestsPerPeriod);
            return this;
        }
        @CustomType.Setter
        public Builder requestsToOrigin(Boolean requestsToOrigin) {
            this.requestsToOrigin = Objects.requireNonNull(requestsToOrigin);
            return this;
        }
        @CustomType.Setter
        public Builder scorePerPeriod(Integer scorePerPeriod) {
            this.scorePerPeriod = Objects.requireNonNull(scorePerPeriod);
            return this;
        }
        @CustomType.Setter
        public Builder scoreResponseHeaderName(String scoreResponseHeaderName) {
            this.scoreResponseHeaderName = Objects.requireNonNull(scoreResponseHeaderName);
            return this;
        }
        public RulesetRuleRatelimit build() {
            final var o = new RulesetRuleRatelimit();
            o.characteristics = characteristics;
            o.countingExpression = countingExpression;
            o.mitigationTimeout = mitigationTimeout;
            o.period = period;
            o.requestsPerPeriod = requestsPerPeriod;
            o.requestsToOrigin = requestsToOrigin;
            o.scorePerPeriod = scorePerPeriod;
            o.scoreResponseHeaderName = scoreResponseHeaderName;
            return o;
        }
    }
}

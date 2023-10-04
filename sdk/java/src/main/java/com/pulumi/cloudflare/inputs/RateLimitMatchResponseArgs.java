// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RateLimitMatchResponseArgs extends com.pulumi.resources.ResourceArgs {

    public static final RateLimitMatchResponseArgs Empty = new RateLimitMatchResponseArgs();

    /**
     * List of HTTP headers maps to match the origin response on.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<Map<String,String>>> headers;

    /**
     * @return List of HTTP headers maps to match the origin response on.
     * 
     */
    public Optional<Output<List<Map<String,String>>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * Only count traffic that has come from your origin servers. If true, cached items that Cloudflare serve will not count towards rate limiting.
     * 
     */
    @Import(name="originTraffic")
    private @Nullable Output<Boolean> originTraffic;

    /**
     * @return Only count traffic that has come from your origin servers. If true, cached items that Cloudflare serve will not count towards rate limiting.
     * 
     */
    public Optional<Output<Boolean>> originTraffic() {
        return Optional.ofNullable(this.originTraffic);
    }

    /**
     * HTTP Status codes, can be one, many or indicate all by not providing this value.
     * 
     */
    @Import(name="statuses")
    private @Nullable Output<List<Integer>> statuses;

    /**
     * @return HTTP Status codes, can be one, many or indicate all by not providing this value.
     * 
     */
    public Optional<Output<List<Integer>>> statuses() {
        return Optional.ofNullable(this.statuses);
    }

    private RateLimitMatchResponseArgs() {}

    private RateLimitMatchResponseArgs(RateLimitMatchResponseArgs $) {
        this.headers = $.headers;
        this.originTraffic = $.originTraffic;
        this.statuses = $.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RateLimitMatchResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RateLimitMatchResponseArgs $;

        public Builder() {
            $ = new RateLimitMatchResponseArgs();
        }

        public Builder(RateLimitMatchResponseArgs defaults) {
            $ = new RateLimitMatchResponseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headers List of HTTP headers maps to match the origin response on.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<List<Map<String,String>>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers List of HTTP headers maps to match the origin response on.
         * 
         * @return builder
         * 
         */
        public Builder headers(List<Map<String,String>> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param headers List of HTTP headers maps to match the origin response on.
         * 
         * @return builder
         * 
         */
        public Builder headers(Map<String,String>... headers) {
            return headers(List.of(headers));
        }

        /**
         * @param originTraffic Only count traffic that has come from your origin servers. If true, cached items that Cloudflare serve will not count towards rate limiting.
         * 
         * @return builder
         * 
         */
        public Builder originTraffic(@Nullable Output<Boolean> originTraffic) {
            $.originTraffic = originTraffic;
            return this;
        }

        /**
         * @param originTraffic Only count traffic that has come from your origin servers. If true, cached items that Cloudflare serve will not count towards rate limiting.
         * 
         * @return builder
         * 
         */
        public Builder originTraffic(Boolean originTraffic) {
            return originTraffic(Output.of(originTraffic));
        }

        /**
         * @param statuses HTTP Status codes, can be one, many or indicate all by not providing this value.
         * 
         * @return builder
         * 
         */
        public Builder statuses(@Nullable Output<List<Integer>> statuses) {
            $.statuses = statuses;
            return this;
        }

        /**
         * @param statuses HTTP Status codes, can be one, many or indicate all by not providing this value.
         * 
         * @return builder
         * 
         */
        public Builder statuses(List<Integer> statuses) {
            return statuses(Output.of(statuses));
        }

        /**
         * @param statuses HTTP Status codes, can be one, many or indicate all by not providing this value.
         * 
         * @return builder
         * 
         */
        public Builder statuses(Integer... statuses) {
            return statuses(List.of(statuses));
        }

        public RateLimitMatchResponseArgs build() {
            return $;
        }
    }

}

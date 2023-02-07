// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * Configure API client to always use a specific account. Alternatively, can be configured using the
     * `CLOUDFLARE_ACCOUNT_ID` environment variable.
     * 
     * @deprecated
     * Use resource specific `account_id` attributes instead.
     * 
     */
    @Deprecated /* Use resource specific `account_id` attributes instead. */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Configure API client to always use a specific account. Alternatively, can be configured using the
     * `CLOUDFLARE_ACCOUNT_ID` environment variable.
     * 
     * @deprecated
     * Use resource specific `account_id` attributes instead.
     * 
     */
    @Deprecated /* Use resource specific `account_id` attributes instead. */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
     * environment variable.
     * 
     */
    @Import(name="apiBasePath")
    private @Nullable Output<String> apiBasePath;

    /**
     * @return Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
     * environment variable.
     * 
     */
    public Optional<Output<String>> apiBasePath() {
        return Optional.ofNullable(this.apiBasePath);
    }

    /**
     * Whether to print logs from the API client (using the default log library logger). Alternatively, can be configured using
     * the `CLOUDFLARE_API_CLIENT_LOGGING` environment variable.
     * 
     */
    @Import(name="apiClientLogging", json=true)
    private @Nullable Output<Boolean> apiClientLogging;

    /**
     * @return Whether to print logs from the API client (using the default log library logger). Alternatively, can be configured using
     * the `CLOUDFLARE_API_CLIENT_LOGGING` environment variable.
     * 
     */
    public Optional<Output<Boolean>> apiClientLogging() {
        return Optional.ofNullable(this.apiClientLogging);
    }

    /**
     * Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
     * environment variable.
     * 
     */
    @Import(name="apiHostname")
    private @Nullable Output<String> apiHostname;

    /**
     * @return Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
     * environment variable.
     * 
     */
    public Optional<Output<String>> apiHostname() {
        return Optional.ofNullable(this.apiHostname);
    }

    /**
     * The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
     * keys are [now considered legacy by Cloudflare](https://developers.cloudflare.com/api/keys/#limitations), API tokens
     * should be used instead. Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
     * 
     */
    @Import(name="apiKey")
    private @Nullable Output<String> apiKey;

    /**
     * @return The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
     * keys are [now considered legacy by Cloudflare](https://developers.cloudflare.com/api/keys/#limitations), API tokens
     * should be used instead. Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
     * 
     */
    public Optional<Output<String>> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }

    /**
     * The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
     * Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
     * 
     */
    @Import(name="apiToken")
    private @Nullable Output<String> apiToken;

    /**
     * @return The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
     * Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
     * 
     */
    public Optional<Output<String>> apiToken() {
        return Optional.ofNullable(this.apiToken);
    }

    /**
     * A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
     * `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable. Must provide only one of `api_key`, `api_token`,
     * `api_user_service_key`.
     * 
     */
    @Import(name="apiUserServiceKey")
    private @Nullable Output<String> apiUserServiceKey;

    /**
     * @return A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
     * `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable. Must provide only one of `api_key`, `api_token`,
     * `api_user_service_key`.
     * 
     */
    public Optional<Output<String>> apiUserServiceKey() {
        return Optional.ofNullable(this.apiUserServiceKey);
    }

    /**
     * A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
     * variable. Required when using `api_key`. Conflicts with `api_token`.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
     * variable. Required when using `api_key`. Conflicts with `api_token`.
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * Maximum backoff period in seconds after failed API calls. Alternatively, can be configured using the
     * `CLOUDFLARE_MAX_BACKOFF` environment variable.
     * 
     */
    @Import(name="maxBackoff", json=true)
    private @Nullable Output<Integer> maxBackoff;

    /**
     * @return Maximum backoff period in seconds after failed API calls. Alternatively, can be configured using the
     * `CLOUDFLARE_MAX_BACKOFF` environment variable.
     * 
     */
    public Optional<Output<Integer>> maxBackoff() {
        return Optional.ofNullable(this.maxBackoff);
    }

    /**
     * Minimum backoff period in seconds after failed API calls. Alternatively, can be configured using the
     * `CLOUDFLARE_MIN_BACKOFF` environment variable.
     * 
     */
    @Import(name="minBackoff", json=true)
    private @Nullable Output<Integer> minBackoff;

    /**
     * @return Minimum backoff period in seconds after failed API calls. Alternatively, can be configured using the
     * `CLOUDFLARE_MIN_BACKOFF` environment variable.
     * 
     */
    public Optional<Output<Integer>> minBackoff() {
        return Optional.ofNullable(this.minBackoff);
    }

    /**
     * Maximum number of retries to perform when an API request fails. Alternatively, can be configured using the
     * `CLOUDFLARE_RETRIES` environment variable.
     * 
     */
    @Import(name="retries", json=true)
    private @Nullable Output<Integer> retries;

    /**
     * @return Maximum number of retries to perform when an API request fails. Alternatively, can be configured using the
     * `CLOUDFLARE_RETRIES` environment variable.
     * 
     */
    public Optional<Output<Integer>> retries() {
        return Optional.ofNullable(this.retries);
    }

    /**
     * RPS limit to apply when making calls to the API. Alternatively, can be configured using the `CLOUDFLARE_RPS` environment
     * variable.
     * 
     */
    @Import(name="rps", json=true)
    private @Nullable Output<Integer> rps;

    /**
     * @return RPS limit to apply when making calls to the API. Alternatively, can be configured using the `CLOUDFLARE_RPS` environment
     * variable.
     * 
     */
    public Optional<Output<Integer>> rps() {
        return Optional.ofNullable(this.rps);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.accountId = $.accountId;
        this.apiBasePath = $.apiBasePath;
        this.apiClientLogging = $.apiClientLogging;
        this.apiHostname = $.apiHostname;
        this.apiKey = $.apiKey;
        this.apiToken = $.apiToken;
        this.apiUserServiceKey = $.apiUserServiceKey;
        this.email = $.email;
        this.maxBackoff = $.maxBackoff;
        this.minBackoff = $.minBackoff;
        this.retries = $.retries;
        this.rps = $.rps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Configure API client to always use a specific account. Alternatively, can be configured using the
         * `CLOUDFLARE_ACCOUNT_ID` environment variable.
         * 
         * @return builder
         * 
         * @deprecated
         * Use resource specific `account_id` attributes instead.
         * 
         */
        @Deprecated /* Use resource specific `account_id` attributes instead. */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Configure API client to always use a specific account. Alternatively, can be configured using the
         * `CLOUDFLARE_ACCOUNT_ID` environment variable.
         * 
         * @return builder
         * 
         * @deprecated
         * Use resource specific `account_id` attributes instead.
         * 
         */
        @Deprecated /* Use resource specific `account_id` attributes instead. */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param apiBasePath Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
         * environment variable.
         * 
         * @return builder
         * 
         */
        public Builder apiBasePath(@Nullable Output<String> apiBasePath) {
            $.apiBasePath = apiBasePath;
            return this;
        }

        /**
         * @param apiBasePath Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
         * environment variable.
         * 
         * @return builder
         * 
         */
        public Builder apiBasePath(String apiBasePath) {
            return apiBasePath(Output.of(apiBasePath));
        }

        /**
         * @param apiClientLogging Whether to print logs from the API client (using the default log library logger). Alternatively, can be configured using
         * the `CLOUDFLARE_API_CLIENT_LOGGING` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder apiClientLogging(@Nullable Output<Boolean> apiClientLogging) {
            $.apiClientLogging = apiClientLogging;
            return this;
        }

        /**
         * @param apiClientLogging Whether to print logs from the API client (using the default log library logger). Alternatively, can be configured using
         * the `CLOUDFLARE_API_CLIENT_LOGGING` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder apiClientLogging(Boolean apiClientLogging) {
            return apiClientLogging(Output.of(apiClientLogging));
        }

        /**
         * @param apiHostname Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
         * environment variable.
         * 
         * @return builder
         * 
         */
        public Builder apiHostname(@Nullable Output<String> apiHostname) {
            $.apiHostname = apiHostname;
            return this;
        }

        /**
         * @param apiHostname Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
         * environment variable.
         * 
         * @return builder
         * 
         */
        public Builder apiHostname(String apiHostname) {
            return apiHostname(Output.of(apiHostname));
        }

        /**
         * @param apiKey The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
         * keys are [now considered legacy by Cloudflare](https://developers.cloudflare.com/api/keys/#limitations), API tokens
         * should be used instead. Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(@Nullable Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
         * keys are [now considered legacy by Cloudflare](https://developers.cloudflare.com/api/keys/#limitations), API tokens
         * should be used instead. Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        /**
         * @param apiToken The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
         * Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
         * 
         * @return builder
         * 
         */
        public Builder apiToken(@Nullable Output<String> apiToken) {
            $.apiToken = apiToken;
            return this;
        }

        /**
         * @param apiToken The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
         * Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
         * 
         * @return builder
         * 
         */
        public Builder apiToken(String apiToken) {
            return apiToken(Output.of(apiToken));
        }

        /**
         * @param apiUserServiceKey A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
         * `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable. Must provide only one of `api_key`, `api_token`,
         * `api_user_service_key`.
         * 
         * @return builder
         * 
         */
        public Builder apiUserServiceKey(@Nullable Output<String> apiUserServiceKey) {
            $.apiUserServiceKey = apiUserServiceKey;
            return this;
        }

        /**
         * @param apiUserServiceKey A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
         * `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable. Must provide only one of `api_key`, `api_token`,
         * `api_user_service_key`.
         * 
         * @return builder
         * 
         */
        public Builder apiUserServiceKey(String apiUserServiceKey) {
            return apiUserServiceKey(Output.of(apiUserServiceKey));
        }

        /**
         * @param email A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
         * variable. Required when using `api_key`. Conflicts with `api_token`.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
         * variable. Required when using `api_key`. Conflicts with `api_token`.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param maxBackoff Maximum backoff period in seconds after failed API calls. Alternatively, can be configured using the
         * `CLOUDFLARE_MAX_BACKOFF` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder maxBackoff(@Nullable Output<Integer> maxBackoff) {
            $.maxBackoff = maxBackoff;
            return this;
        }

        /**
         * @param maxBackoff Maximum backoff period in seconds after failed API calls. Alternatively, can be configured using the
         * `CLOUDFLARE_MAX_BACKOFF` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder maxBackoff(Integer maxBackoff) {
            return maxBackoff(Output.of(maxBackoff));
        }

        /**
         * @param minBackoff Minimum backoff period in seconds after failed API calls. Alternatively, can be configured using the
         * `CLOUDFLARE_MIN_BACKOFF` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder minBackoff(@Nullable Output<Integer> minBackoff) {
            $.minBackoff = minBackoff;
            return this;
        }

        /**
         * @param minBackoff Minimum backoff period in seconds after failed API calls. Alternatively, can be configured using the
         * `CLOUDFLARE_MIN_BACKOFF` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder minBackoff(Integer minBackoff) {
            return minBackoff(Output.of(minBackoff));
        }

        /**
         * @param retries Maximum number of retries to perform when an API request fails. Alternatively, can be configured using the
         * `CLOUDFLARE_RETRIES` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder retries(@Nullable Output<Integer> retries) {
            $.retries = retries;
            return this;
        }

        /**
         * @param retries Maximum number of retries to perform when an API request fails. Alternatively, can be configured using the
         * `CLOUDFLARE_RETRIES` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder retries(Integer retries) {
            return retries(Output.of(retries));
        }

        /**
         * @param rps RPS limit to apply when making calls to the API. Alternatively, can be configured using the `CLOUDFLARE_RPS` environment
         * variable.
         * 
         * @return builder
         * 
         */
        public Builder rps(@Nullable Output<Integer> rps) {
            $.rps = rps;
            return this;
        }

        /**
         * @param rps RPS limit to apply when making calls to the API. Alternatively, can be configured using the `CLOUDFLARE_RPS` environment
         * variable.
         * 
         * @return builder
         * 
         */
        public Builder rps(Integer rps) {
            return rps(Output.of(rps));
        }

        public ProviderArgs build() {
            $.apiClientLogging = Codegen.booleanProp("apiClientLogging").output().arg($.apiClientLogging).env("CLOUDFLARE_API_CLIENT_LOGGING").def(false).getNullable();
            $.maxBackoff = Codegen.integerProp("maxBackoff").output().arg($.maxBackoff).env("CLOUDFLARE_MAX_BACKOFF").def(30).getNullable();
            $.minBackoff = Codegen.integerProp("minBackoff").output().arg($.minBackoff).env("CLOUDFLARE_MIN_BACKOFF").def(1).getNullable();
            $.retries = Codegen.integerProp("retries").output().arg($.retries).env("CLOUDFLARE_RETRIES").def(3).getNullable();
            $.rps = Codegen.integerProp("rps").output().arg($.rps).env("CLOUDFLARE_RPS").def(4).getNullable();
            return $;
        }
    }

}

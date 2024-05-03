// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.ProviderArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The provider type for the cloudflare package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 * 
 */
@ResourceType(type="pulumi:providers:cloudflare")
public class Provider extends com.pulumi.resources.ProviderResource {
    /**
     * Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
     * environment variable.
     * 
     */
    @Export(name="apiBasePath", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> apiBasePath;

    /**
     * @return Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
     * environment variable.
     * 
     */
    public Output<Optional<String>> apiBasePath() {
        return Codegen.optional(this.apiBasePath);
    }
    /**
     * Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
     * environment variable.
     * 
     */
    @Export(name="apiHostname", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> apiHostname;

    /**
     * @return Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
     * environment variable.
     * 
     */
    public Output<Optional<String>> apiHostname() {
        return Codegen.optional(this.apiHostname);
    }
    /**
     * The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
     * keys are [now considered legacy by
     * Cloudflare](https://developers.cloudflare.com/fundamentals/api/get-started/keys/#limitations), API tokens should be used
     * instead. Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
     * 
     */
    @Export(name="apiKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> apiKey;

    /**
     * @return The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
     * keys are [now considered legacy by
     * Cloudflare](https://developers.cloudflare.com/fundamentals/api/get-started/keys/#limitations), API tokens should be used
     * instead. Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
     * 
     */
    public Output<Optional<String>> apiKey() {
        return Codegen.optional(this.apiKey);
    }
    /**
     * The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
     * Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
     * 
     */
    @Export(name="apiToken", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> apiToken;

    /**
     * @return The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
     * Must provide only one of `api_key`, `api_token`, `api_user_service_key`.
     * 
     */
    public Output<Optional<String>> apiToken() {
        return Codegen.optional(this.apiToken);
    }
    /**
     * A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
     * `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable. Must provide only one of `api_key`, `api_token`,
     * `api_user_service_key`.
     * 
     */
    @Export(name="apiUserServiceKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> apiUserServiceKey;

    /**
     * @return A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
     * `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable. Must provide only one of `api_key`, `api_token`,
     * `api_user_service_key`.
     * 
     */
    public Output<Optional<String>> apiUserServiceKey() {
        return Codegen.optional(this.apiUserServiceKey);
    }
    /**
     * A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
     * variable. Required when using `api_key`. Conflicts with `api_token`.
     * 
     */
    @Export(name="email", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> email;

    /**
     * @return A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
     * variable. Required when using `api_key`. Conflicts with `api_token`.
     * 
     */
    public Output<Optional<String>> email() {
        return Codegen.optional(this.email);
    }
    @Export(name="userAgentOperatorSuffix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userAgentOperatorSuffix;

    public Output<Optional<String>> userAgentOperatorSuffix() {
        return Codegen.optional(this.userAgentOperatorSuffix);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(String name, @Nullable ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(String name, @Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare", name, args == null ? ProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}

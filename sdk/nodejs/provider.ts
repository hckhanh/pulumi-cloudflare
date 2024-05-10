// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The provider type for the cloudflare package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 */
export class Provider extends pulumi.ProviderResource {
    /** @internal */
    public static readonly __pulumiType = 'cloudflare';

    /**
     * Returns true if the given object is an instance of Provider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Provider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === "pulumi:providers:" + Provider.__pulumiType;
    }

    /**
     * Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
     * environment variable.
     */
    public readonly apiBasePath!: pulumi.Output<string | undefined>;
    /**
     * Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
     * environment variable.
     */
    public readonly apiHostname!: pulumi.Output<string | undefined>;
    /**
     * The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
     * keys are [now considered legacy by
     * Cloudflare](https://developers.cloudflare.com/fundamentals/api/get-started/keys/#limitations), API tokens should be used
     * instead. Must provide only one of `apiKey`, `apiToken`, `apiUserServiceKey`.
     */
    public readonly apiKey!: pulumi.Output<string | undefined>;
    /**
     * The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
     * Must provide only one of `apiKey`, `apiToken`, `apiUserServiceKey`.
     */
    public readonly apiToken!: pulumi.Output<string | undefined>;
    /**
     * A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
     * `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable. Must provide only one of `apiKey`, `apiToken`,
     * `apiUserServiceKey`.
     */
    public readonly apiUserServiceKey!: pulumi.Output<string | undefined>;
    /**
     * A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
     * variable. Required when using `apiKey`. Conflicts with `apiToken`.
     */
    public readonly email!: pulumi.Output<string | undefined>;
    public readonly userAgentOperatorSuffix!: pulumi.Output<string | undefined>;

    /**
     * Create a Provider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProviderArgs, opts?: pulumi.ResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        {
            resourceInputs["apiBasePath"] = args ? args.apiBasePath : undefined;
            resourceInputs["apiClientLogging"] = pulumi.output((args ? args.apiClientLogging : undefined) ?? (utilities.getEnvBoolean("CLOUDFLARE_API_CLIENT_LOGGING") || false)).apply(JSON.stringify);
            resourceInputs["apiHostname"] = args ? args.apiHostname : undefined;
            resourceInputs["apiKey"] = args ? args.apiKey : undefined;
            resourceInputs["apiToken"] = args ? args.apiToken : undefined;
            resourceInputs["apiUserServiceKey"] = args ? args.apiUserServiceKey : undefined;
            resourceInputs["email"] = args ? args.email : undefined;
            resourceInputs["maxBackoff"] = pulumi.output((args ? args.maxBackoff : undefined) ?? (utilities.getEnvNumber("CLOUDFLARE_MAX_BACKOFF") || 30)).apply(JSON.stringify);
            resourceInputs["minBackoff"] = pulumi.output((args ? args.minBackoff : undefined) ?? (utilities.getEnvNumber("CLOUDFLARE_MIN_BACKOFF") || 1)).apply(JSON.stringify);
            resourceInputs["retries"] = pulumi.output((args ? args.retries : undefined) ?? (utilities.getEnvNumber("CLOUDFLARE_RETRIES") || 3)).apply(JSON.stringify);
            resourceInputs["rps"] = pulumi.output((args ? args.rps : undefined) ?? (utilities.getEnvNumber("CLOUDFLARE_RPS") || 4)).apply(JSON.stringify);
            resourceInputs["userAgentOperatorSuffix"] = args ? args.userAgentOperatorSuffix : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Provider.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * The set of arguments for constructing a Provider resource.
 */
export interface ProviderArgs {
    /**
     * Configure the base path used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_BASE_PATH`
     * environment variable.
     */
    apiBasePath?: pulumi.Input<string>;
    /**
     * Whether to print logs from the API client (using the default log library logger). Alternatively, can be configured using
     * the `CLOUDFLARE_API_CLIENT_LOGGING` environment variable.
     */
    apiClientLogging?: pulumi.Input<boolean>;
    /**
     * Configure the hostname used by the API client. Alternatively, can be configured using the `CLOUDFLARE_API_HOSTNAME`
     * environment variable.
     */
    apiHostname?: pulumi.Input<string>;
    /**
     * The API key for operations. Alternatively, can be configured using the `CLOUDFLARE_API_KEY` environment variable. API
     * keys are [now considered legacy by
     * Cloudflare](https://developers.cloudflare.com/fundamentals/api/get-started/keys/#limitations), API tokens should be used
     * instead. Must provide only one of `apiKey`, `apiToken`, `apiUserServiceKey`.
     */
    apiKey?: pulumi.Input<string>;
    /**
     * The API Token for operations. Alternatively, can be configured using the `CLOUDFLARE_API_TOKEN` environment variable.
     * Must provide only one of `apiKey`, `apiToken`, `apiUserServiceKey`.
     */
    apiToken?: pulumi.Input<string>;
    /**
     * A special Cloudflare API key good for a restricted set of endpoints. Alternatively, can be configured using the
     * `CLOUDFLARE_API_USER_SERVICE_KEY` environment variable. Must provide only one of `apiKey`, `apiToken`,
     * `apiUserServiceKey`.
     */
    apiUserServiceKey?: pulumi.Input<string>;
    /**
     * A registered Cloudflare email address. Alternatively, can be configured using the `CLOUDFLARE_EMAIL` environment
     * variable. Required when using `apiKey`. Conflicts with `apiToken`.
     */
    email?: pulumi.Input<string>;
    /**
     * Maximum backoff period in seconds after failed API calls. Alternatively, can be configured using the
     * `CLOUDFLARE_MAX_BACKOFF` environment variable.
     */
    maxBackoff?: pulumi.Input<number>;
    /**
     * Minimum backoff period in seconds after failed API calls. Alternatively, can be configured using the
     * `CLOUDFLARE_MIN_BACKOFF` environment variable.
     */
    minBackoff?: pulumi.Input<number>;
    /**
     * Maximum number of retries to perform when an API request fails. Alternatively, can be configured using the
     * `CLOUDFLARE_RETRIES` environment variable.
     */
    retries?: pulumi.Input<number>;
    /**
     * RPS limit to apply when making calls to the API. Alternatively, can be configured using the `CLOUDFLARE_RPS` environment
     * variable.
     */
    rps?: pulumi.Input<number>;
    userAgentOperatorSuffix?: pulumi.Input<string>;
}

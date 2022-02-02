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
        return obj['__pulumiType'] === Provider.__pulumiType;
    }

    /**
     * Configure API client to always use that account
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * Configure the base path used by the API client
     */
    public readonly apiBasePath!: pulumi.Output<string | undefined>;
    /**
     * Configure the hostname used by the API client
     */
    public readonly apiHostname!: pulumi.Output<string | undefined>;
    /**
     * The API key for operations.
     */
    public readonly apiKey!: pulumi.Output<string | undefined>;
    /**
     * The API Token for operations.
     */
    public readonly apiToken!: pulumi.Output<string | undefined>;
    /**
     * A special Cloudflare API key good for a restricted set of endpoints
     */
    public readonly apiUserServiceKey!: pulumi.Output<string | undefined>;
    /**
     * A registered Cloudflare email address
     */
    public readonly email!: pulumi.Output<string | undefined>;

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
            resourceInputs["accountId"] = args ? args.accountId : undefined;
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
     * Configure API client to always use that account
     */
    accountId?: pulumi.Input<string>;
    /**
     * Configure the base path used by the API client
     */
    apiBasePath?: pulumi.Input<string>;
    /**
     * Whether to print logs from the API client (using the default log library logger)
     */
    apiClientLogging?: pulumi.Input<boolean>;
    /**
     * Configure the hostname used by the API client
     */
    apiHostname?: pulumi.Input<string>;
    /**
     * The API key for operations.
     */
    apiKey?: pulumi.Input<string>;
    /**
     * The API Token for operations.
     */
    apiToken?: pulumi.Input<string>;
    /**
     * A special Cloudflare API key good for a restricted set of endpoints
     */
    apiUserServiceKey?: pulumi.Input<string>;
    /**
     * A registered Cloudflare email address
     */
    email?: pulumi.Input<string>;
    /**
     * Maximum backoff period in seconds after failed API calls
     */
    maxBackoff?: pulumi.Input<number>;
    /**
     * Minimum backoff period in seconds after failed API calls
     */
    minBackoff?: pulumi.Input<number>;
    /**
     * Maximum number of retries to perform when an API request fails
     */
    retries?: pulumi.Input<number>;
    /**
     * RPS limit to apply when making calls to the API
     */
    rps?: pulumi.Input<number>;
}

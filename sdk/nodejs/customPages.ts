// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a resource which manages Cloudflare custom error pages.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.CustomPages("example", {
 *     state: "customized",
 *     type: "basic_challenge",
 *     url: "https://example.com/challenge.html",
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/customPages:CustomPages example <resource_level>/<resource_id>/<custom_page_type>
 * ```
 */
export class CustomPages extends pulumi.CustomResource {
    /**
     * Get an existing CustomPages resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CustomPagesState, opts?: pulumi.CustomResourceOptions): CustomPages {
        return new CustomPages(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/customPages:CustomPages';

    /**
     * Returns true if the given object is an instance of CustomPages.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CustomPages {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CustomPages.__pulumiType;
    }

    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * Managed state of the custom page. Available values: `default`, `customized`.
     */
    public readonly state!: pulumi.Output<string | undefined>;
    /**
     * The type of custom page you wish to update. Available values: `basicChallenge`, `wafChallenge`, `wafBlock`, `ratelimitBlock`, `countryChallenge`, `ipBlock`, `underAttack`, `500Errors`, `1000Errors`, `managedChallenge`.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * URL of where the custom page source is located.
     */
    public readonly url!: pulumi.Output<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    public readonly zoneId!: pulumi.Output<string | undefined>;

    /**
     * Create a CustomPages resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CustomPagesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CustomPagesArgs | CustomPagesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CustomPagesState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as CustomPagesArgs | undefined;
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            if ((!args || args.url === undefined) && !opts.urn) {
                throw new Error("Missing required property 'url'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["state"] = args ? args.state : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["url"] = args ? args.url : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CustomPages.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CustomPages resources.
 */
export interface CustomPagesState {
    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Managed state of the custom page. Available values: `default`, `customized`.
     */
    state?: pulumi.Input<string>;
    /**
     * The type of custom page you wish to update. Available values: `basicChallenge`, `wafChallenge`, `wafBlock`, `ratelimitBlock`, `countryChallenge`, `ipBlock`, `underAttack`, `500Errors`, `1000Errors`, `managedChallenge`.
     */
    type?: pulumi.Input<string>;
    /**
     * URL of where the custom page source is located.
     */
    url?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CustomPages resource.
 */
export interface CustomPagesArgs {
    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Managed state of the custom page. Available values: `default`, `customized`.
     */
    state?: pulumi.Input<string>;
    /**
     * The type of custom page you wish to update. Available values: `basicChallenge`, `wafChallenge`, `wafBlock`, `ratelimitBlock`, `countryChallenge`, `ipBlock`, `underAttack`, `500Errors`, `1000Errors`, `managedChallenge`.
     */
    type: pulumi.Input<string>;
    /**
     * URL of where the custom page source is located.
     */
    url: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}

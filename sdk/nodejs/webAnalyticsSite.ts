// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Web Analytics Site resource.
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/webAnalyticsSite:WebAnalyticsSite example <account_id>/<site_tag>
 * ```
 */
export class WebAnalyticsSite extends pulumi.CustomResource {
    /**
     * Get an existing WebAnalyticsSite resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WebAnalyticsSiteState, opts?: pulumi.CustomResourceOptions): WebAnalyticsSite {
        return new WebAnalyticsSite(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/webAnalyticsSite:WebAnalyticsSite';

    /**
     * Returns true if the given object is an instance of WebAnalyticsSite.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WebAnalyticsSite {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WebAnalyticsSite.__pulumiType;
    }

    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Whether Cloudflare will automatically inject the JavaScript snippet for orange-clouded sites. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly autoInstall!: pulumi.Output<boolean>;
    /**
     * The hostname to use for gray-clouded sites. Must provide only one of `zoneTag`. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly host!: pulumi.Output<string | undefined>;
    /**
     * The ID for the ruleset associated to this Web Analytics Site.
     */
    public /*out*/ readonly rulesetId!: pulumi.Output<string>;
    /**
     * The Web Analytics site tag.
     */
    public /*out*/ readonly siteTag!: pulumi.Output<string>;
    /**
     * The token for the Web Analytics site.
     */
    public /*out*/ readonly siteToken!: pulumi.Output<string>;
    /**
     * The encoded JS snippet to add to your site's HTML page if autoInstall is false.
     */
    public /*out*/ readonly snippet!: pulumi.Output<string>;
    /**
     * The zone identifier for orange-clouded sites. Must provide only one of `host`. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly zoneTag!: pulumi.Output<string | undefined>;

    /**
     * Create a WebAnalyticsSite resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WebAnalyticsSiteArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WebAnalyticsSiteArgs | WebAnalyticsSiteState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WebAnalyticsSiteState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["autoInstall"] = state ? state.autoInstall : undefined;
            resourceInputs["host"] = state ? state.host : undefined;
            resourceInputs["rulesetId"] = state ? state.rulesetId : undefined;
            resourceInputs["siteTag"] = state ? state.siteTag : undefined;
            resourceInputs["siteToken"] = state ? state.siteToken : undefined;
            resourceInputs["snippet"] = state ? state.snippet : undefined;
            resourceInputs["zoneTag"] = state ? state.zoneTag : undefined;
        } else {
            const args = argsOrState as WebAnalyticsSiteArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.autoInstall === undefined) && !opts.urn) {
                throw new Error("Missing required property 'autoInstall'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["autoInstall"] = args ? args.autoInstall : undefined;
            resourceInputs["host"] = args ? args.host : undefined;
            resourceInputs["zoneTag"] = args ? args.zoneTag : undefined;
            resourceInputs["rulesetId"] = undefined /*out*/;
            resourceInputs["siteTag"] = undefined /*out*/;
            resourceInputs["siteToken"] = undefined /*out*/;
            resourceInputs["snippet"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["siteToken", "snippet"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(WebAnalyticsSite.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WebAnalyticsSite resources.
 */
export interface WebAnalyticsSiteState {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId?: pulumi.Input<string>;
    /**
     * Whether Cloudflare will automatically inject the JavaScript snippet for orange-clouded sites. **Modifying this attribute will force creation of a new resource.**
     */
    autoInstall?: pulumi.Input<boolean>;
    /**
     * The hostname to use for gray-clouded sites. Must provide only one of `zoneTag`. **Modifying this attribute will force creation of a new resource.**
     */
    host?: pulumi.Input<string>;
    /**
     * The ID for the ruleset associated to this Web Analytics Site.
     */
    rulesetId?: pulumi.Input<string>;
    /**
     * The Web Analytics site tag.
     */
    siteTag?: pulumi.Input<string>;
    /**
     * The token for the Web Analytics site.
     */
    siteToken?: pulumi.Input<string>;
    /**
     * The encoded JS snippet to add to your site's HTML page if autoInstall is false.
     */
    snippet?: pulumi.Input<string>;
    /**
     * The zone identifier for orange-clouded sites. Must provide only one of `host`. **Modifying this attribute will force creation of a new resource.**
     */
    zoneTag?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WebAnalyticsSite resource.
 */
export interface WebAnalyticsSiteArgs {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId: pulumi.Input<string>;
    /**
     * Whether Cloudflare will automatically inject the JavaScript snippet for orange-clouded sites. **Modifying this attribute will force creation of a new resource.**
     */
    autoInstall: pulumi.Input<boolean>;
    /**
     * The hostname to use for gray-clouded sites. Must provide only one of `zoneTag`. **Modifying this attribute will force creation of a new resource.**
     */
    host?: pulumi.Input<string>;
    /**
     * The zone identifier for orange-clouded sites. Must provide only one of `host`. **Modifying this attribute will force creation of a new resource.**
     */
    zoneTag?: pulumi.Input<string>;
}

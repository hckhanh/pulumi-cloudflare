// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * The [Cloudflare Ruleset Engine](https://developers.cloudflare.com/firewall/cf-rulesets)
 * allows you to create and deploy rules and rulesets.
 *
 * The engine syntax, inspired by the Wireshark Display Filter language, is the
 * same syntax used in custom Firewall Rules. Cloudflare uses the Ruleset Engine
 * in different products, allowing you to configure several products using the same
 * basic syntax.
 *
 * ## Import
 *
 * Import an account scoped Ruleset configuration.
 *
 * ```sh
 * $ pulumi import cloudflare:index/ruleset:Ruleset example account/<account_id>/<ruleset_id>
 * ```
 *
 * Import a zone scoped Ruleset configuration.
 *
 * ```sh
 * $ pulumi import cloudflare:index/ruleset:Ruleset example zone/<zone_id>/<ruleset_id>
 * ```
 */
export class Ruleset extends pulumi.CustomResource {
    /**
     * Get an existing Ruleset resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RulesetState, opts?: pulumi.CustomResourceOptions): Ruleset {
        return new Ruleset(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/ruleset:Ruleset';

    /**
     * Returns true if the given object is an instance of Ruleset.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Ruleset {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Ruleset.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * Brief summary of the ruleset rule and its intended use.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `zone`.
     */
    public readonly kind!: pulumi.Output<string>;
    /**
     * Name of the compression algorithm to use. Available values: `gzip`, `brotli`, `auto`, `default`, `none`
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Point in the request/response lifecycle where the ruleset will be created. Available values: `ddosL4`, `ddosL7`, `httpConfigSettings`, `httpCustomErrors`, `httpLogCustomFields`, `httpRatelimit`, `httpRequestCacheSettings`, `httpRequestDynamicRedirect`, `httpRequestFirewallCustom`, `httpRequestFirewallManaged`, `httpRequestLateTransform`, `httpRequestOrigin`, `httpRequestRedirect`, `httpRequestSanitize`, `httpRequestSbfm`, `httpRequestTransform`, `httpResponseCompression`, `httpResponseFirewallManaged`, `httpResponseHeadersTransform`, `magicTransit`.
     */
    public readonly phase!: pulumi.Output<string>;
    /**
     * List of rule-based overrides.
     */
    public readonly rules!: pulumi.Output<outputs.RulesetRule[] | undefined>;
    /**
     * The zone identifier to target for the resource.
     */
    public readonly zoneId!: pulumi.Output<string | undefined>;

    /**
     * Create a Ruleset resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RulesetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RulesetArgs | RulesetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RulesetState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["kind"] = state ? state.kind : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["phase"] = state ? state.phase : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as RulesetArgs | undefined;
            if ((!args || args.kind === undefined) && !opts.urn) {
                throw new Error("Missing required property 'kind'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.phase === undefined) && !opts.urn) {
                throw new Error("Missing required property 'phase'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["kind"] = args ? args.kind : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["phase"] = args ? args.phase : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Ruleset.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Ruleset resources.
 */
export interface RulesetState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Brief summary of the ruleset rule and its intended use.
     */
    description?: pulumi.Input<string>;
    /**
     * Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `zone`.
     */
    kind?: pulumi.Input<string>;
    /**
     * Name of the compression algorithm to use. Available values: `gzip`, `brotli`, `auto`, `default`, `none`
     */
    name?: pulumi.Input<string>;
    /**
     * Point in the request/response lifecycle where the ruleset will be created. Available values: `ddosL4`, `ddosL7`, `httpConfigSettings`, `httpCustomErrors`, `httpLogCustomFields`, `httpRatelimit`, `httpRequestCacheSettings`, `httpRequestDynamicRedirect`, `httpRequestFirewallCustom`, `httpRequestFirewallManaged`, `httpRequestLateTransform`, `httpRequestOrigin`, `httpRequestRedirect`, `httpRequestSanitize`, `httpRequestSbfm`, `httpRequestTransform`, `httpResponseCompression`, `httpResponseFirewallManaged`, `httpResponseHeadersTransform`, `magicTransit`.
     */
    phase?: pulumi.Input<string>;
    /**
     * List of rule-based overrides.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.RulesetRule>[]>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Ruleset resource.
 */
export interface RulesetArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Brief summary of the ruleset rule and its intended use.
     */
    description?: pulumi.Input<string>;
    /**
     * Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `zone`.
     */
    kind: pulumi.Input<string>;
    /**
     * Name of the compression algorithm to use. Available values: `gzip`, `brotli`, `auto`, `default`, `none`
     */
    name: pulumi.Input<string>;
    /**
     * Point in the request/response lifecycle where the ruleset will be created. Available values: `ddosL4`, `ddosL7`, `httpConfigSettings`, `httpCustomErrors`, `httpLogCustomFields`, `httpRatelimit`, `httpRequestCacheSettings`, `httpRequestDynamicRedirect`, `httpRequestFirewallCustom`, `httpRequestFirewallManaged`, `httpRequestLateTransform`, `httpRequestOrigin`, `httpRequestRedirect`, `httpRequestSanitize`, `httpRequestSbfm`, `httpRequestTransform`, `httpResponseCompression`, `httpResponseFirewallManaged`, `httpResponseHeadersTransform`, `magicTransit`.
     */
    phase: pulumi.Input<string>;
    /**
     * List of rule-based overrides.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.RulesetRule>[]>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId?: pulumi.Input<string>;
}

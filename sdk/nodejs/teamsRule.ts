// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Teams rule resource. Teams rules comprise secure web gateway policies.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const rule1 = new cloudflare.TeamsRule("rule1", {
 *     accountId: "1d5fdc9e88c8a8c4518b068cd94331fe",
 *     action: "l4_override",
 *     description: "desc",
 *     filters: ["l4"],
 *     name: "office",
 *     precedence: 1,
 *     ruleSettings: {
 *         blockPageEnabled: false,
 *         blockPageReason: "access not permitted",
 *         l4override: {
 *             ip: "192.0.2.1",
 *             port: 1234,
 *         },
 *     },
 *     traffic: "any(dns.domains[*] == \"com.example\")",
 * });
 * ```
 *
 * ## Import
 *
 * Teams Rules can be imported using a composite ID formed of account ID and teams rule ID.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/teamsRule:TeamsRule rule1 cb029e245cfdd66dc8d2e570d5dd3322/d41d8cd98f00b204e9800998ecf8427e
 * ```
 */
export class TeamsRule extends pulumi.CustomResource {
    /**
     * Get an existing TeamsRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TeamsRuleState, opts?: pulumi.CustomResourceOptions): TeamsRule {
        return new TeamsRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/teamsRule:TeamsRule';

    /**
     * Returns true if the given object is an instance of TeamsRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TeamsRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TeamsRule.__pulumiType;
    }

    /**
     * The account to which the teams rule should be added.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The action executed by matched teams rule.
     */
    public readonly action!: pulumi.Output<string>;
    /**
     * The description of the teams rule.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The wirefilter expression to be used for devicePosture check matching.
     */
    public readonly devicePosture!: pulumi.Output<string | undefined>;
    /**
     * Indicator of rule enablement.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The protocol or layer to evaluate the traffic and identity expressions.
     */
    public readonly filters!: pulumi.Output<string[] | undefined>;
    /**
     * The wirefilter expression to be used for identity matching.
     */
    public readonly identity!: pulumi.Output<string | undefined>;
    /**
     * The name of the teams rule.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The evaluation precedence of the teams rule.
     */
    public readonly precedence!: pulumi.Output<number>;
    /**
     * Additional rule settings.
     */
    public readonly ruleSettings!: pulumi.Output<outputs.TeamsRuleRuleSettings | undefined>;
    /**
     * The wirefilter expression to be used for traffic matching.
     */
    public readonly traffic!: pulumi.Output<string | undefined>;
    public /*out*/ readonly version!: pulumi.Output<number>;

    /**
     * Create a TeamsRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TeamsRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TeamsRuleArgs | TeamsRuleState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TeamsRuleState | undefined;
            inputs["accountId"] = state ? state.accountId : undefined;
            inputs["action"] = state ? state.action : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["devicePosture"] = state ? state.devicePosture : undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["filters"] = state ? state.filters : undefined;
            inputs["identity"] = state ? state.identity : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["precedence"] = state ? state.precedence : undefined;
            inputs["ruleSettings"] = state ? state.ruleSettings : undefined;
            inputs["traffic"] = state ? state.traffic : undefined;
            inputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as TeamsRuleArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.action === undefined) && !opts.urn) {
                throw new Error("Missing required property 'action'");
            }
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.precedence === undefined) && !opts.urn) {
                throw new Error("Missing required property 'precedence'");
            }
            inputs["accountId"] = args ? args.accountId : undefined;
            inputs["action"] = args ? args.action : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["devicePosture"] = args ? args.devicePosture : undefined;
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["filters"] = args ? args.filters : undefined;
            inputs["identity"] = args ? args.identity : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["precedence"] = args ? args.precedence : undefined;
            inputs["ruleSettings"] = args ? args.ruleSettings : undefined;
            inputs["traffic"] = args ? args.traffic : undefined;
            inputs["version"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(TeamsRule.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TeamsRule resources.
 */
export interface TeamsRuleState {
    /**
     * The account to which the teams rule should be added.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The action executed by matched teams rule.
     */
    action?: pulumi.Input<string>;
    /**
     * The description of the teams rule.
     */
    description?: pulumi.Input<string>;
    /**
     * The wirefilter expression to be used for devicePosture check matching.
     */
    devicePosture?: pulumi.Input<string>;
    /**
     * Indicator of rule enablement.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The protocol or layer to evaluate the traffic and identity expressions.
     */
    filters?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The wirefilter expression to be used for identity matching.
     */
    identity?: pulumi.Input<string>;
    /**
     * The name of the teams rule.
     */
    name?: pulumi.Input<string>;
    /**
     * The evaluation precedence of the teams rule.
     */
    precedence?: pulumi.Input<number>;
    /**
     * Additional rule settings.
     */
    ruleSettings?: pulumi.Input<inputs.TeamsRuleRuleSettings>;
    /**
     * The wirefilter expression to be used for traffic matching.
     */
    traffic?: pulumi.Input<string>;
    version?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a TeamsRule resource.
 */
export interface TeamsRuleArgs {
    /**
     * The account to which the teams rule should be added.
     */
    accountId: pulumi.Input<string>;
    /**
     * The action executed by matched teams rule.
     */
    action: pulumi.Input<string>;
    /**
     * The description of the teams rule.
     */
    description: pulumi.Input<string>;
    /**
     * The wirefilter expression to be used for devicePosture check matching.
     */
    devicePosture?: pulumi.Input<string>;
    /**
     * Indicator of rule enablement.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The protocol or layer to evaluate the traffic and identity expressions.
     */
    filters?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The wirefilter expression to be used for identity matching.
     */
    identity?: pulumi.Input<string>;
    /**
     * The name of the teams rule.
     */
    name: pulumi.Input<string>;
    /**
     * The evaluation precedence of the teams rule.
     */
    precedence: pulumi.Input<number>;
    /**
     * Additional rule settings.
     */
    ruleSettings?: pulumi.Input<inputs.TeamsRuleRuleSettings>;
    /**
     * The wirefilter expression to be used for traffic matching.
     */
    traffic?: pulumi.Input<string>;
}

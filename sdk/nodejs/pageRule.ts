// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare page rule resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Add a page rule to the domain
 * const foobar = new cloudflare.PageRule("foobar", {
 *     zoneId: _var.cloudflare_zone_id,
 *     target: `sub.${_var.cloudflare_zone}/page`,
 *     priority: 1,
 *     actions: {
 *         ssl: "flexible",
 *         emailObfuscation: "on",
 *         minifies: [{
 *             html: "off",
 *             css: "on",
 *             js: "on",
 *         }],
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Page rules can be imported using a composite ID formed of zone ID and page rule ID, e.g.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/pageRule:PageRule default d41d8cd98f00b204e9800998ecf8427e/ch8374ftwdghsif43
 * ```
 */
export class PageRule extends pulumi.CustomResource {
    /**
     * Get an existing PageRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PageRuleState, opts?: pulumi.CustomResourceOptions): PageRule {
        return new PageRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/pageRule:PageRule';

    /**
     * Returns true if the given object is an instance of PageRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PageRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PageRule.__pulumiType;
    }

    /**
     * The actions taken by the page rule, options given below.
     */
    public readonly actions!: pulumi.Output<outputs.PageRuleActions>;
    /**
     * The priority of the page rule among others for this target, the higher the number the higher the priority as per [API documentation](https://api.cloudflare.com/#page-rules-for-a-zone-create-page-rule).
     */
    public readonly priority!: pulumi.Output<number | undefined>;
    /**
     * Whether the page rule is active or disabled.
     */
    public readonly status!: pulumi.Output<string | undefined>;
    /**
     * The URL pattern to target with the page rule.
     */
    public readonly target!: pulumi.Output<string>;
    /**
     * The DNS zone ID to which the page rule should be added.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a PageRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PageRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PageRuleArgs | PageRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PageRuleState | undefined;
            resourceInputs["actions"] = state ? state.actions : undefined;
            resourceInputs["priority"] = state ? state.priority : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["target"] = state ? state.target : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as PageRuleArgs | undefined;
            if ((!args || args.actions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'actions'");
            }
            if ((!args || args.target === undefined) && !opts.urn) {
                throw new Error("Missing required property 'target'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["actions"] = args ? args.actions : undefined;
            resourceInputs["priority"] = args ? args.priority : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["target"] = args ? args.target : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PageRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PageRule resources.
 */
export interface PageRuleState {
    /**
     * The actions taken by the page rule, options given below.
     */
    actions?: pulumi.Input<inputs.PageRuleActions>;
    /**
     * The priority of the page rule among others for this target, the higher the number the higher the priority as per [API documentation](https://api.cloudflare.com/#page-rules-for-a-zone-create-page-rule).
     */
    priority?: pulumi.Input<number>;
    /**
     * Whether the page rule is active or disabled.
     */
    status?: pulumi.Input<string>;
    /**
     * The URL pattern to target with the page rule.
     */
    target?: pulumi.Input<string>;
    /**
     * The DNS zone ID to which the page rule should be added.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PageRule resource.
 */
export interface PageRuleArgs {
    /**
     * The actions taken by the page rule, options given below.
     */
    actions: pulumi.Input<inputs.PageRuleActions>;
    /**
     * The priority of the page rule among others for this target, the higher the number the higher the priority as per [API documentation](https://api.cloudflare.com/#page-rules-for-a-zone-create-page-rule).
     */
    priority?: pulumi.Input<number>;
    /**
     * Whether the page rule is active or disabled.
     */
    status?: pulumi.Input<string>;
    /**
     * The URL pattern to target with the page rule.
     */
    target: pulumi.Input<string>;
    /**
     * The DNS zone ID to which the page rule should be added.
     */
    zoneId: pulumi.Input<string>;
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Access Group resource. Access Groups are used
 * in conjunction with Access Policies to restrict access to a
 * particular resource based on group membership.
 *
 * > It's required that an `accountId` or `zoneId` is provided and in
 *    most cases using either is fine. However, if you're using a scoped
 *    access token, you must provide the argument that matches the token's
 *    scope. For example, an access token that is scoped to the "example.com"
 *    zone needs to use the `zoneId` argument.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Allowing access to `test@example.com` email address only
 * const exampleAccessGroup = new cloudflare.AccessGroup("exampleAccessGroup", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "staging group",
 *     includes: [{
 *         emails: ["test@example.com"],
 *     }],
 * });
 * // Allowing `test@example.com` to access but only when coming from a
 * // specific IP.
 * const exampleIndex_accessGroupAccessGroup = new cloudflare.AccessGroup("exampleIndex/accessGroupAccessGroup", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "staging group",
 *     includes: [{
 *         emails: ["test@example.com"],
 *     }],
 *     requires: [{
 *         ips: [_var.office_ip],
 *     }],
 * });
 * // Allow members of an Azure Group. The ID is the group UUID (id) in Azure.
 * const exampleCloudflareIndex_accessGroupAccessGroup = new cloudflare.AccessGroup("exampleCloudflareIndex/accessGroupAccessGroup", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "test_group",
 *     includes: [{
 *         azures: [{
 *             identityProviderId: "ca298b82-93b5-41bf-bc2d-10493f09b761",
 *             ids: ["86773093-5feb-48dd-814b-7ccd3676ff50"],
 *         }],
 *     }],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/accessGroup:AccessGroup example <account_id>/<group_id>
 * ```
 */
export class AccessGroup extends pulumi.CustomResource {
    /**
     * Get an existing AccessGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessGroupState, opts?: pulumi.CustomResourceOptions): AccessGroup {
        return new AccessGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/accessGroup:AccessGroup';

    /**
     * Returns true if the given object is an instance of AccessGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessGroup.__pulumiType;
    }

    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    public readonly excludes!: pulumi.Output<outputs.AccessGroupExclude[] | undefined>;
    public readonly includes!: pulumi.Output<outputs.AccessGroupInclude[]>;
    public readonly name!: pulumi.Output<string>;
    public readonly requires!: pulumi.Output<outputs.AccessGroupRequire[] | undefined>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a AccessGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessGroupArgs | AccessGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessGroupState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["excludes"] = state ? state.excludes : undefined;
            resourceInputs["includes"] = state ? state.includes : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["requires"] = state ? state.requires : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as AccessGroupArgs | undefined;
            if ((!args || args.includes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'includes'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["excludes"] = args ? args.excludes : undefined;
            resourceInputs["includes"] = args ? args.includes : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["requires"] = args ? args.requires : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccessGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessGroup resources.
 */
export interface AccessGroupState {
    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
     */
    accountId?: pulumi.Input<string>;
    excludes?: pulumi.Input<pulumi.Input<inputs.AccessGroupExclude>[]>;
    includes?: pulumi.Input<pulumi.Input<inputs.AccessGroupInclude>[]>;
    name?: pulumi.Input<string>;
    requires?: pulumi.Input<pulumi.Input<inputs.AccessGroupRequire>[]>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessGroup resource.
 */
export interface AccessGroupArgs {
    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
     */
    accountId?: pulumi.Input<string>;
    excludes?: pulumi.Input<pulumi.Input<inputs.AccessGroupExclude>[]>;
    includes: pulumi.Input<pulumi.Input<inputs.AccessGroupInclude>[]>;
    name: pulumi.Input<string>;
    requires?: pulumi.Input<pulumi.Input<inputs.AccessGroupRequire>[]>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}

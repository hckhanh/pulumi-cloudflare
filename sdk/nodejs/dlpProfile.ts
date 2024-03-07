// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare DLP Profile resource. Data Loss Prevention profiles
 * are a set of entries that can be matched in HTTP bodies or files.
 * They are referenced in Zero Trust Gateway rules.
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/dlpProfile:DlpProfile example <account_id>/<dlp_profile_id>
 * ```
 */
export class DlpProfile extends pulumi.CustomResource {
    /**
     * Get an existing DlpProfile resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DlpProfileState, opts?: pulumi.CustomResourceOptions): DlpProfile {
        return new DlpProfile(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/dlpProfile:DlpProfile';

    /**
     * Returns true if the given object is an instance of DlpProfile.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DlpProfile {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DlpProfile.__pulumiType;
    }

    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Related DLP policies will trigger when the match count exceeds the number set.
     */
    public readonly allowedMatchCount!: pulumi.Output<number>;
    /**
     * Brief summary of the profile and its intended use.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * List of entries to apply to the profile.
     */
    public readonly entries!: pulumi.Output<outputs.DlpProfileEntry[]>;
    /**
     * Name of the entry to deploy.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a DlpProfile resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DlpProfileArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DlpProfileArgs | DlpProfileState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DlpProfileState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["allowedMatchCount"] = state ? state.allowedMatchCount : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["entries"] = state ? state.entries : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as DlpProfileArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.allowedMatchCount === undefined) && !opts.urn) {
                throw new Error("Missing required property 'allowedMatchCount'");
            }
            if ((!args || args.entries === undefined) && !opts.urn) {
                throw new Error("Missing required property 'entries'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["allowedMatchCount"] = args ? args.allowedMatchCount : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["entries"] = args ? args.entries : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DlpProfile.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DlpProfile resources.
 */
export interface DlpProfileState {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId?: pulumi.Input<string>;
    /**
     * Related DLP policies will trigger when the match count exceeds the number set.
     */
    allowedMatchCount?: pulumi.Input<number>;
    /**
     * Brief summary of the profile and its intended use.
     */
    description?: pulumi.Input<string>;
    /**
     * List of entries to apply to the profile.
     */
    entries?: pulumi.Input<pulumi.Input<inputs.DlpProfileEntry>[]>;
    /**
     * Name of the entry to deploy.
     */
    name?: pulumi.Input<string>;
    /**
     * The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DlpProfile resource.
 */
export interface DlpProfileArgs {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId: pulumi.Input<string>;
    /**
     * Related DLP policies will trigger when the match count exceeds the number set.
     */
    allowedMatchCount: pulumi.Input<number>;
    /**
     * Brief summary of the profile and its intended use.
     */
    description?: pulumi.Input<string>;
    /**
     * List of entries to apply to the profile.
     */
    entries: pulumi.Input<pulumi.Input<inputs.DlpProfileEntry>[]>;
    /**
     * Name of the entry to deploy.
     */
    name: pulumi.Input<string>;
    /**
     * The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
     */
    type: pulumi.Input<string>;
}

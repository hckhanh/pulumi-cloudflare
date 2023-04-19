// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/list:List example <account_id>/<list_id>
 * ```
 */
export class List extends pulumi.CustomResource {
    /**
     * Get an existing List resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ListState, opts?: pulumi.CustomResourceOptions): List {
        return new List(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/list:List';

    /**
     * Returns true if the given object is an instance of List.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is List {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === List.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * An optional description of the list.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    public readonly items!: pulumi.Output<outputs.ListItem[] | undefined>;
    /**
     * The type of items the list will contain. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly kind!: pulumi.Output<string>;
    /**
     * The name of the list. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a List resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ListArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ListArgs | ListState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ListState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["items"] = state ? state.items : undefined;
            resourceInputs["kind"] = state ? state.kind : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as ListArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.kind === undefined) && !opts.urn) {
                throw new Error("Missing required property 'kind'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["items"] = args ? args.items : undefined;
            resourceInputs["kind"] = args ? args.kind : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(List.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering List resources.
 */
export interface ListState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * An optional description of the list.
     */
    description?: pulumi.Input<string>;
    items?: pulumi.Input<pulumi.Input<inputs.ListItem>[]>;
    /**
     * The type of items the list will contain. **Modifying this attribute will force creation of a new resource.**
     */
    kind?: pulumi.Input<string>;
    /**
     * The name of the list. **Modifying this attribute will force creation of a new resource.**
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a List resource.
 */
export interface ListArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * An optional description of the list.
     */
    description?: pulumi.Input<string>;
    items?: pulumi.Input<pulumi.Input<inputs.ListItem>[]>;
    /**
     * The type of items the list will contain. **Modifying this attribute will force creation of a new resource.**
     */
    kind: pulumi.Input<string>;
    /**
     * The name of the list. **Modifying this attribute will force creation of a new resource.**
     */
    name: pulumi.Input<string>;
}

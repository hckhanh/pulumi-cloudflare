// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The [D1 Database](https://developers.cloudflare.com/d1/) resource allows you to manage Cloudflare D1 databases.
 *
 * !> When a D1 Database is replaced all the data is lost. Please ensure you have a backup of your data before replacing a D1 Database.
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/d1Database:D1Database example <account id>/<database id>
 * ```
 */
export class D1Database extends pulumi.CustomResource {
    /**
     * Get an existing D1Database resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: D1DatabaseState, opts?: pulumi.CustomResourceOptions): D1Database {
        return new D1Database(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/d1Database:D1Database';

    /**
     * Returns true if the given object is an instance of D1Database.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is D1Database {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === D1Database.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The name of the D1 Database.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The backend version of the database.
     */
    public /*out*/ readonly version!: pulumi.Output<string>;

    /**
     * Create a D1Database resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: D1DatabaseArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: D1DatabaseArgs | D1DatabaseState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as D1DatabaseState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as D1DatabaseArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(D1Database.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering D1Database resources.
 */
export interface D1DatabaseState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The name of the D1 Database.
     */
    name?: pulumi.Input<string>;
    /**
     * The backend version of the database.
     */
    version?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a D1Database resource.
 */
export interface D1DatabaseArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * The name of the D1 Database.
     */
    name: pulumi.Input<string>;
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.R2Bucket("example", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     location: "enam",
 *     name: "terraform-bucket",
 * });
 * ```
 *
 * > Available location values can be found in the [R2 documentation](https://developers.cloudflare.com/r2/buckets/data-location/#available-hints).
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/r2Bucket:R2Bucket default <account id>/<bucket name>
 * ```
 */
export class R2Bucket extends pulumi.CustomResource {
    /**
     * Get an existing R2Bucket resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: R2BucketState, opts?: pulumi.CustomResourceOptions): R2Bucket {
        return new R2Bucket(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/r2Bucket:R2Bucket';

    /**
     * Returns true if the given object is an instance of R2Bucket.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is R2Bucket {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === R2Bucket.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The location hint of the R2 bucket.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The name of the R2 bucket.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a R2Bucket resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: R2BucketArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: R2BucketArgs | R2BucketState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as R2BucketState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as R2BucketArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(R2Bucket.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering R2Bucket resources.
 */
export interface R2BucketState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The location hint of the R2 bucket.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the R2 bucket.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a R2Bucket resource.
 */
export interface R2BucketArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * The location hint of the R2 bucket.
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the R2 bucket.
     */
    name: pulumi.Input<string>;
}

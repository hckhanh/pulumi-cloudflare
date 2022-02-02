// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Workers KV Namespace
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.WorkersKvNamespace("example", {
 *     title: "test-namespace",
 * });
 * ```
 *
 * ## Import
 *
 * Workers KV Namespace settings can be imported using it's ID
 *
 * ```sh
 *  $ pulumi import cloudflare:index/workersKvNamespace:WorkersKvNamespace example beaeb6716c9443eaa4deef11763ccca6
 * ```
 *
 *  where- `beaeb6716c9443eaa4deef11763ccca6` is the ID of the namespace
 */
export class WorkersKvNamespace extends pulumi.CustomResource {
    /**
     * Get an existing WorkersKvNamespace resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkersKvNamespaceState, opts?: pulumi.CustomResourceOptions): WorkersKvNamespace {
        return new WorkersKvNamespace(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/workersKvNamespace:WorkersKvNamespace';

    /**
     * Returns true if the given object is an instance of WorkersKvNamespace.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkersKvNamespace {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkersKvNamespace.__pulumiType;
    }

    /**
     * The name of the namespace you wish to create.
     */
    public readonly title!: pulumi.Output<string>;

    /**
     * Create a WorkersKvNamespace resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkersKvNamespaceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkersKvNamespaceArgs | WorkersKvNamespaceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkersKvNamespaceState | undefined;
            resourceInputs["title"] = state ? state.title : undefined;
        } else {
            const args = argsOrState as WorkersKvNamespaceArgs | undefined;
            if ((!args || args.title === undefined) && !opts.urn) {
                throw new Error("Missing required property 'title'");
            }
            resourceInputs["title"] = args ? args.title : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WorkersKvNamespace.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkersKvNamespace resources.
 */
export interface WorkersKvNamespaceState {
    /**
     * The name of the namespace you wish to create.
     */
    title?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WorkersKvNamespace resource.
 */
export interface WorkersKvNamespaceArgs {
    /**
     * The name of the namespace you wish to create.
     */
    title: pulumi.Input<string>;
}

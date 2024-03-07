// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare worker route resource. A route will also require a `cloudflare.WorkerScript`.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const myScript = new cloudflare.WorkerScript("myScript", {});
 * // see "cloudflare_worker_script" documentation ...
 * // Runs the specified worker script for all URLs that match `example.com/*`
 * const myRoute = new cloudflare.WorkerRoute("myRoute", {
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     pattern: "example.com/*",
 *     scriptName: myScript.name,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/workerRoute:WorkerRoute example <zone_id>/<route_id>
 * ```
 */
export class WorkerRoute extends pulumi.CustomResource {
    /**
     * Get an existing WorkerRoute resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkerRouteState, opts?: pulumi.CustomResourceOptions): WorkerRoute {
        return new WorkerRoute(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/workerRoute:WorkerRoute';

    /**
     * Returns true if the given object is an instance of WorkerRoute.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkerRoute {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkerRoute.__pulumiType;
    }

    /**
     * The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
     */
    public readonly pattern!: pulumi.Output<string>;
    /**
     * Worker script name to invoke for requests that match the route pattern.
     */
    public readonly scriptName!: pulumi.Output<string | undefined>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a WorkerRoute resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkerRouteArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkerRouteArgs | WorkerRouteState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkerRouteState | undefined;
            resourceInputs["pattern"] = state ? state.pattern : undefined;
            resourceInputs["scriptName"] = state ? state.scriptName : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as WorkerRouteArgs | undefined;
            if ((!args || args.pattern === undefined) && !opts.urn) {
                throw new Error("Missing required property 'pattern'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["pattern"] = args ? args.pattern : undefined;
            resourceInputs["scriptName"] = args ? args.scriptName : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WorkerRoute.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkerRoute resources.
 */
export interface WorkerRouteState {
    /**
     * The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
     */
    pattern?: pulumi.Input<string>;
    /**
     * Worker script name to invoke for requests that match the route pattern.
     */
    scriptName?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WorkerRoute resource.
 */
export interface WorkerRouteArgs {
    /**
     * The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
     */
    pattern: pulumi.Input<string>;
    /**
     * Worker script name to invoke for requests that match the route pattern.
     */
    scriptName?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId: pulumi.Input<string>;
}

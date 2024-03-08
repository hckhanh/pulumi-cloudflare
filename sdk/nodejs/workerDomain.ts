// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Creates a Worker Custom Domain.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.WorkerDomain("example", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     hostname: "subdomain.example.com",
 *     service: "my-service",
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/workerDomain:WorkerDomain example <account_id>/<worker_domain_id>
 * ```
 */
export class WorkerDomain extends pulumi.CustomResource {
    /**
     * Get an existing WorkerDomain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkerDomainState, opts?: pulumi.CustomResourceOptions): WorkerDomain {
        return new WorkerDomain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/workerDomain:WorkerDomain';

    /**
     * Returns true if the given object is an instance of WorkerDomain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkerDomain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkerDomain.__pulumiType;
    }

    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The name of the Worker environment. Defaults to `production`.
     */
    public readonly environment!: pulumi.Output<string | undefined>;
    /**
     * Hostname of the Worker Domain.
     */
    public readonly hostname!: pulumi.Output<string>;
    /**
     * Name of worker script to attach the domain to.
     */
    public readonly service!: pulumi.Output<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a WorkerDomain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkerDomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkerDomainArgs | WorkerDomainState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkerDomainState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["environment"] = state ? state.environment : undefined;
            resourceInputs["hostname"] = state ? state.hostname : undefined;
            resourceInputs["service"] = state ? state.service : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as WorkerDomainArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.hostname === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostname'");
            }
            if ((!args || args.service === undefined) && !opts.urn) {
                throw new Error("Missing required property 'service'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["environment"] = args ? args.environment : undefined;
            resourceInputs["hostname"] = args ? args.hostname : undefined;
            resourceInputs["service"] = args ? args.service : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WorkerDomain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkerDomain resources.
 */
export interface WorkerDomainState {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId?: pulumi.Input<string>;
    /**
     * The name of the Worker environment. Defaults to `production`.
     */
    environment?: pulumi.Input<string>;
    /**
     * Hostname of the Worker Domain.
     */
    hostname?: pulumi.Input<string>;
    /**
     * Name of worker script to attach the domain to.
     */
    service?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WorkerDomain resource.
 */
export interface WorkerDomainArgs {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId: pulumi.Input<string>;
    /**
     * The name of the Worker environment. Defaults to `production`.
     */
    environment?: pulumi.Input<string>;
    /**
     * Hostname of the Worker Domain.
     */
    hostname: pulumi.Input<string>;
    /**
     * Name of worker script to attach the domain to.
     */
    service: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId: pulumi.Input<string>;
}

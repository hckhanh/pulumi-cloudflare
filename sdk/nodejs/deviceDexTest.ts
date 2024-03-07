// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Device Dex Test resource. Device Dex Tests allow for building location-aware device settings policies.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.DeviceDexTest("example", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     data: {
 *         host: "https://example.com/home",
 *         kind: "http",
 *         method: "GET",
 *     },
 *     description: "Send a HTTP GET request to the home endpoint every half hour.",
 *     enabled: true,
 *     interval: "0h30m0s",
 *     name: "GET homepage",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/deviceDexTest:DeviceDexTest example <account_id>/<device_dex_test_id>
 * ```
 */
export class DeviceDexTest extends pulumi.CustomResource {
    /**
     * Get an existing DeviceDexTest resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DeviceDexTestState, opts?: pulumi.CustomResourceOptions): DeviceDexTest {
        return new DeviceDexTest(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/deviceDexTest:DeviceDexTest';

    /**
     * Returns true if the given object is an instance of DeviceDexTest.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DeviceDexTest {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DeviceDexTest.__pulumiType;
    }

    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Timestamp of when the Dex Test was created.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * The configuration object which contains the details for the WARP client to conduct the test.
     */
    public readonly data!: pulumi.Output<outputs.DeviceDexTestData>;
    /**
     * Additional details about the test.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Determines whether or not the test is active.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * How often the test will run.
     */
    public readonly interval!: pulumi.Output<string>;
    /**
     * The name of the Device Dex Test. Must be unique.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Timestamp of when the Dex Test was last updated.
     */
    public /*out*/ readonly updated!: pulumi.Output<string>;

    /**
     * Create a DeviceDexTest resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DeviceDexTestArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DeviceDexTestArgs | DeviceDexTestState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DeviceDexTestState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["data"] = state ? state.data : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["interval"] = state ? state.interval : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["updated"] = state ? state.updated : undefined;
        } else {
            const args = argsOrState as DeviceDexTestArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.data === undefined) && !opts.urn) {
                throw new Error("Missing required property 'data'");
            }
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.interval === undefined) && !opts.urn) {
                throw new Error("Missing required property 'interval'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["data"] = args ? args.data : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["interval"] = args ? args.interval : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["created"] = undefined /*out*/;
            resourceInputs["updated"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DeviceDexTest.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DeviceDexTest resources.
 */
export interface DeviceDexTestState {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId?: pulumi.Input<string>;
    /**
     * Timestamp of when the Dex Test was created.
     */
    created?: pulumi.Input<string>;
    /**
     * The configuration object which contains the details for the WARP client to conduct the test.
     */
    data?: pulumi.Input<inputs.DeviceDexTestData>;
    /**
     * Additional details about the test.
     */
    description?: pulumi.Input<string>;
    /**
     * Determines whether or not the test is active.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * How often the test will run.
     */
    interval?: pulumi.Input<string>;
    /**
     * The name of the Device Dex Test. Must be unique.
     */
    name?: pulumi.Input<string>;
    /**
     * Timestamp of when the Dex Test was last updated.
     */
    updated?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DeviceDexTest resource.
 */
export interface DeviceDexTestArgs {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId: pulumi.Input<string>;
    /**
     * The configuration object which contains the details for the WARP client to conduct the test.
     */
    data: pulumi.Input<inputs.DeviceDexTestData>;
    /**
     * Additional details about the test.
     */
    description: pulumi.Input<string>;
    /**
     * Determines whether or not the test is active.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * How often the test will run.
     */
    interval: pulumi.Input<string>;
    /**
     * The name of the Device Dex Test. Must be unique.
     */
    name: pulumi.Input<string>;
}

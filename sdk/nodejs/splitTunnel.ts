// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Split Tunnel resource. Split tunnels are used to either
 * include or exclude lists of routes from the WARP client's tunnel.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Excluding *.example.com from WARP routes
 * const exampleSplitTunnelExclude = new cloudflare.SplitTunnel("exampleSplitTunnelExclude", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     mode: "exclude",
 *     tunnels: [{
 *         host: "*.example.com",
 *         description: "example domain",
 *     }],
 * });
 * // Including *.example.com in WARP routes
 * const exampleSplitTunnelIncludeSplitTunnel = new cloudflare.SplitTunnel("exampleSplitTunnelIncludeSplitTunnel", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     mode: "include",
 *     tunnels: [{
 *         host: "*.example.com",
 *         description: "example domain",
 *     }],
 * });
 * // Create a device policy
 * const developerWarpPolicy = new cloudflare.DeviceSettingsPolicy("developerWarpPolicy", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "Developers",
 *     precedence: 10,
 *     match: "any(identity.groups.name[*] in {\"Developers\"})",
 *     switchLocked: true,
 * });
 * // Excluding *.example.com from WARP routes for a particular device policy
 * const exampleDeviceSettingsPolicySplitTunnelExclude = new cloudflare.SplitTunnel("exampleDeviceSettingsPolicySplitTunnelExclude", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     policyId: developerWarpPolicy.id,
 *     mode: "exclude",
 *     tunnels: [{
 *         host: "*.example.com",
 *         description: "example domain",
 *     }],
 * });
 * // Including *.example.com in WARP routes for a particular device policy
 * const exampleSplitTunnelIncludeIndex_splitTunnelSplitTunnel = new cloudflare.SplitTunnel("exampleSplitTunnelIncludeIndex/splitTunnelSplitTunnel", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     policyId: cloudflare_device_policy.developer_warp_policy.id,
 *     mode: "include",
 *     tunnels: [{
 *         host: "*.example.com",
 *         description: "example domain",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Split Tunnels for default device policies must use "default" as the policy ID.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/splitTunnel:SplitTunnel example <account_id>/<policy_id>/<mode>
 * ```
 */
export class SplitTunnel extends pulumi.CustomResource {
    /**
     * Get an existing SplitTunnel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SplitTunnelState, opts?: pulumi.CustomResourceOptions): SplitTunnel {
        return new SplitTunnel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/splitTunnel:SplitTunnel';

    /**
     * Returns true if the given object is an instance of SplitTunnel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SplitTunnel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SplitTunnel.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The mode of the split tunnel policy. Available values: `include`, `exclude`.
     */
    public readonly mode!: pulumi.Output<string>;
    /**
     * The settings policy for which to configure this split tunnel policy.
     */
    public readonly policyId!: pulumi.Output<string | undefined>;
    /**
     * The value of the tunnel attributes.
     */
    public readonly tunnels!: pulumi.Output<outputs.SplitTunnelTunnel[]>;

    /**
     * Create a SplitTunnel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SplitTunnelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SplitTunnelArgs | SplitTunnelState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SplitTunnelState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["mode"] = state ? state.mode : undefined;
            resourceInputs["policyId"] = state ? state.policyId : undefined;
            resourceInputs["tunnels"] = state ? state.tunnels : undefined;
        } else {
            const args = argsOrState as SplitTunnelArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.mode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'mode'");
            }
            if ((!args || args.tunnels === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tunnels'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["mode"] = args ? args.mode : undefined;
            resourceInputs["policyId"] = args ? args.policyId : undefined;
            resourceInputs["tunnels"] = args ? args.tunnels : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SplitTunnel.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SplitTunnel resources.
 */
export interface SplitTunnelState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The mode of the split tunnel policy. Available values: `include`, `exclude`.
     */
    mode?: pulumi.Input<string>;
    /**
     * The settings policy for which to configure this split tunnel policy.
     */
    policyId?: pulumi.Input<string>;
    /**
     * The value of the tunnel attributes.
     */
    tunnels?: pulumi.Input<pulumi.Input<inputs.SplitTunnelTunnel>[]>;
}

/**
 * The set of arguments for constructing a SplitTunnel resource.
 */
export interface SplitTunnelArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * The mode of the split tunnel policy. Available values: `include`, `exclude`.
     */
    mode: pulumi.Input<string>;
    /**
     * The settings policy for which to configure this split tunnel policy.
     */
    policyId?: pulumi.Input<string>;
    /**
     * The value of the tunnel attributes.
     */
    tunnels: pulumi.Input<pulumi.Input<inputs.SplitTunnelTunnel>[]>;
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides the ability to manage IP addresses that can be used by DNS records when
 * they are proxied through Cloudflare.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.AddressMap("example", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     defaultSni: "*.example.com",
 *     description: "My address map",
 *     enabled: true,
 *     ips: [
 *         {
 *             ip: "192.0.2.1",
 *         },
 *         {
 *             ip: "203.0.113.1",
 *         },
 *     ],
 *     memberships: [
 *         {
 *             identifier: "92f17202ed8bd63d69a66b86a49a8f6b",
 *             kind: "account",
 *         },
 *         {
 *             identifier: "023e105f4ecef8ad9ca31a8372d0c353",
 *             kind: "zone",
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/addressMap:AddressMap example <account_id>/<address_map_id>
 * ```
 */
export class AddressMap extends pulumi.CustomResource {
    /**
     * Get an existing AddressMap resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AddressMapState, opts?: pulumi.CustomResourceOptions): AddressMap {
        return new AddressMap(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/addressMap:AddressMap';

    /**
     * Returns true if the given object is an instance of AddressMap.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AddressMap {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AddressMap.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Controls whether the membership can be deleted via the API or not.
     */
    public /*out*/ readonly canDelete!: pulumi.Output<boolean>;
    /**
     * If set to false, then the IPs on the Address Map cannot be modified via the API. This is true for Cloudflare-managed maps.
     */
    public /*out*/ readonly canModifyIps!: pulumi.Output<boolean>;
    /**
     * If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
     */
    public readonly defaultSni!: pulumi.Output<string | undefined>;
    /**
     * Description of the address map.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Whether the Address Map is enabled or not.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * The set of IPs on the Address Map.
     */
    public readonly ips!: pulumi.Output<outputs.AddressMapIp[] | undefined>;
    /**
     * Zones and Accounts which will be assigned IPs on this Address Map.
     */
    public readonly memberships!: pulumi.Output<outputs.AddressMapMembership[] | undefined>;

    /**
     * Create a AddressMap resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AddressMapArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AddressMapArgs | AddressMapState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AddressMapState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["canDelete"] = state ? state.canDelete : undefined;
            resourceInputs["canModifyIps"] = state ? state.canModifyIps : undefined;
            resourceInputs["defaultSni"] = state ? state.defaultSni : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["ips"] = state ? state.ips : undefined;
            resourceInputs["memberships"] = state ? state.memberships : undefined;
        } else {
            const args = argsOrState as AddressMapArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["defaultSni"] = args ? args.defaultSni : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["ips"] = args ? args.ips : undefined;
            resourceInputs["memberships"] = args ? args.memberships : undefined;
            resourceInputs["canDelete"] = undefined /*out*/;
            resourceInputs["canModifyIps"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AddressMap.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AddressMap resources.
 */
export interface AddressMapState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Controls whether the membership can be deleted via the API or not.
     */
    canDelete?: pulumi.Input<boolean>;
    /**
     * If set to false, then the IPs on the Address Map cannot be modified via the API. This is true for Cloudflare-managed maps.
     */
    canModifyIps?: pulumi.Input<boolean>;
    /**
     * If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
     */
    defaultSni?: pulumi.Input<string>;
    /**
     * Description of the address map.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the Address Map is enabled or not.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The set of IPs on the Address Map.
     */
    ips?: pulumi.Input<pulumi.Input<inputs.AddressMapIp>[]>;
    /**
     * Zones and Accounts which will be assigned IPs on this Address Map.
     */
    memberships?: pulumi.Input<pulumi.Input<inputs.AddressMapMembership>[]>;
}

/**
 * The set of arguments for constructing a AddressMap resource.
 */
export interface AddressMapArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * If you have legacy TLS clients which do not send the TLS server name indicator, then you can specify one default SNI on the map.
     */
    defaultSni?: pulumi.Input<string>;
    /**
     * Description of the address map.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether the Address Map is enabled or not.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * The set of IPs on the Address Map.
     */
    ips?: pulumi.Input<pulumi.Input<inputs.AddressMapIp>[]>;
    /**
     * Zones and Accounts which will be assigned IPs on this Address Map.
     */
    memberships?: pulumi.Input<pulumi.Input<inputs.AddressMapMembership>[]>;
}

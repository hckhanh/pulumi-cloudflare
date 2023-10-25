// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Tunnel exposes applications running on your local web server on any
 * network with an internet connection without manually adding DNS
 * records or configuring a firewall or router.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.Tunnel("example", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "my-tunnel",
 *     secret: "AQIDBAUGBwgBAgMEBQYHCAECAwQFBgcIAQIDBAUGBwg=",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/tunnel:Tunnel example <account_id>/<tunnel_id>
 * ```
 */
export class Tunnel extends pulumi.CustomResource {
    /**
     * Get an existing Tunnel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TunnelState, opts?: pulumi.CustomResourceOptions): Tunnel {
        return new Tunnel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/tunnel:Tunnel';

    /**
     * Returns true if the given object is an instance of Tunnel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Tunnel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Tunnel.__pulumiType;
    }

    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Usable CNAME for accessing the Tunnel.
     */
    public /*out*/ readonly cname!: pulumi.Output<string>;
    /**
     * Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard or using tunnel*config, tunnel*route or tunnel*virtual*network resources. Available values: `local`, `cloudflare`. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly configSrc!: pulumi.Output<string | undefined>;
    /**
     * A user-friendly name chosen when the tunnel is created. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly secret!: pulumi.Output<string>;
    /**
     * Token used by a connector to authenticate and run the tunnel.
     */
    public /*out*/ readonly tunnelToken!: pulumi.Output<string>;

    /**
     * Create a Tunnel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TunnelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TunnelArgs | TunnelState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TunnelState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["cname"] = state ? state.cname : undefined;
            resourceInputs["configSrc"] = state ? state.configSrc : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["secret"] = state ? state.secret : undefined;
            resourceInputs["tunnelToken"] = state ? state.tunnelToken : undefined;
        } else {
            const args = argsOrState as TunnelArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.secret === undefined) && !opts.urn) {
                throw new Error("Missing required property 'secret'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["configSrc"] = args ? args.configSrc : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["secret"] = args?.secret ? pulumi.secret(args.secret) : undefined;
            resourceInputs["cname"] = undefined /*out*/;
            resourceInputs["tunnelToken"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["secret", "tunnelToken"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Tunnel.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Tunnel resources.
 */
export interface TunnelState {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId?: pulumi.Input<string>;
    /**
     * Usable CNAME for accessing the Tunnel.
     */
    cname?: pulumi.Input<string>;
    /**
     * Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard or using tunnel*config, tunnel*route or tunnel*virtual*network resources. Available values: `local`, `cloudflare`. **Modifying this attribute will force creation of a new resource.**
     */
    configSrc?: pulumi.Input<string>;
    /**
     * A user-friendly name chosen when the tunnel is created. **Modifying this attribute will force creation of a new resource.**
     */
    name?: pulumi.Input<string>;
    /**
     * 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password. **Modifying this attribute will force creation of a new resource.**
     */
    secret?: pulumi.Input<string>;
    /**
     * Token used by a connector to authenticate and run the tunnel.
     */
    tunnelToken?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Tunnel resource.
 */
export interface TunnelArgs {
    /**
     * The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    accountId: pulumi.Input<string>;
    /**
     * Indicates if this is a locally or remotely configured tunnel. If `local`, manage the tunnel using a YAML file on the origin machine. If `cloudflare`, manage the tunnel on the Zero Trust dashboard or using tunnel*config, tunnel*route or tunnel*virtual*network resources. Available values: `local`, `cloudflare`. **Modifying this attribute will force creation of a new resource.**
     */
    configSrc?: pulumi.Input<string>;
    /**
     * A user-friendly name chosen when the tunnel is created. **Modifying this attribute will force creation of a new resource.**
     */
    name: pulumi.Input<string>;
    /**
     * 32 or more bytes, encoded as a base64 string. The Create Argo Tunnel endpoint sets this as the tunnel's password. Anyone wishing to run the tunnel needs this password. **Modifying this attribute will force creation of a new resource.**
     */
    secret: pulumi.Input<string>;
}

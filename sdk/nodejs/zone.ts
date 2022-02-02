// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * Zone resource can be imported using a zone ID, e.g.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/zone:Zone example d41d8cd98f00b204e9800998ecf8427e
 * ```
 *
 *  where* `d41d8cd98f00b204e9800998ecf8427e` - zone ID, as returned from [API](https://api.cloudflare.com/#zone-list-zones)
 */
export class Zone extends pulumi.CustomResource {
    /**
     * Get an existing Zone resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZoneState, opts?: pulumi.CustomResourceOptions): Zone {
        return new Zone(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/zone:Zone';

    /**
     * Returns true if the given object is an instance of Zone.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Zone {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Zone.__pulumiType;
    }

    /**
     * Boolean of whether to scan for DNS records on creation. Ignored after zone is created. Default: false.
     */
    public readonly jumpStart!: pulumi.Output<boolean | undefined>;
    public /*out*/ readonly meta!: pulumi.Output<{[key: string]: boolean}>;
    /**
     * Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
     */
    public /*out*/ readonly nameServers!: pulumi.Output<string[]>;
    /**
     * Boolean of whether this zone is paused (traffic bypasses Cloudflare). Default: false.
     */
    public readonly paused!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the commercial plan to apply to the zone, can be updated once the zone is created; one of `free`, `pro`, `business`, `enterprise`.
     */
    public readonly plan!: pulumi.Output<string>;
    /**
     * Status of the zone. Valid values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Valid values: `full`, `partial`. Default is `full`.
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * List of Vanity Nameservers (if set).
     * * `meta.wildcard_proxiable` - Indicates whether wildcard DNS records can receive Cloudflare security and performance features.
     * * `meta.phishing_detected` - Indicates if URLs on the zone have been identified as hosting phishing content.
     */
    public /*out*/ readonly vanityNameServers!: pulumi.Output<string[]>;
    /**
     * Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
     */
    public /*out*/ readonly verificationKey!: pulumi.Output<string>;
    /**
     * The DNS zone name which will be added.
     */
    public readonly zone!: pulumi.Output<string>;

    /**
     * Create a Zone resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ZoneArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ZoneArgs | ZoneState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ZoneState | undefined;
            resourceInputs["jumpStart"] = state ? state.jumpStart : undefined;
            resourceInputs["meta"] = state ? state.meta : undefined;
            resourceInputs["nameServers"] = state ? state.nameServers : undefined;
            resourceInputs["paused"] = state ? state.paused : undefined;
            resourceInputs["plan"] = state ? state.plan : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["vanityNameServers"] = state ? state.vanityNameServers : undefined;
            resourceInputs["verificationKey"] = state ? state.verificationKey : undefined;
            resourceInputs["zone"] = state ? state.zone : undefined;
        } else {
            const args = argsOrState as ZoneArgs | undefined;
            if ((!args || args.zone === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zone'");
            }
            resourceInputs["jumpStart"] = args ? args.jumpStart : undefined;
            resourceInputs["paused"] = args ? args.paused : undefined;
            resourceInputs["plan"] = args ? args.plan : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["zone"] = args ? args.zone : undefined;
            resourceInputs["meta"] = undefined /*out*/;
            resourceInputs["nameServers"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["vanityNameServers"] = undefined /*out*/;
            resourceInputs["verificationKey"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Zone.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Zone resources.
 */
export interface ZoneState {
    /**
     * Boolean of whether to scan for DNS records on creation. Ignored after zone is created. Default: false.
     */
    jumpStart?: pulumi.Input<boolean>;
    meta?: pulumi.Input<{[key: string]: pulumi.Input<boolean>}>;
    /**
     * Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
     */
    nameServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Boolean of whether this zone is paused (traffic bypasses Cloudflare). Default: false.
     */
    paused?: pulumi.Input<boolean>;
    /**
     * The name of the commercial plan to apply to the zone, can be updated once the zone is created; one of `free`, `pro`, `business`, `enterprise`.
     */
    plan?: pulumi.Input<string>;
    /**
     * Status of the zone. Valid values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
     */
    status?: pulumi.Input<string>;
    /**
     * A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Valid values: `full`, `partial`. Default is `full`.
     */
    type?: pulumi.Input<string>;
    /**
     * List of Vanity Nameservers (if set).
     * * `meta.wildcard_proxiable` - Indicates whether wildcard DNS records can receive Cloudflare security and performance features.
     * * `meta.phishing_detected` - Indicates if URLs on the zone have been identified as hosting phishing content.
     */
    vanityNameServers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
     */
    verificationKey?: pulumi.Input<string>;
    /**
     * The DNS zone name which will be added.
     */
    zone?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Zone resource.
 */
export interface ZoneArgs {
    /**
     * Boolean of whether to scan for DNS records on creation. Ignored after zone is created. Default: false.
     */
    jumpStart?: pulumi.Input<boolean>;
    /**
     * Boolean of whether this zone is paused (traffic bypasses Cloudflare). Default: false.
     */
    paused?: pulumi.Input<boolean>;
    /**
     * The name of the commercial plan to apply to the zone, can be updated once the zone is created; one of `free`, `pro`, `business`, `enterprise`.
     */
    plan?: pulumi.Input<string>;
    /**
     * A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Valid values: `full`, `partial`. Default is `full`.
     */
    type?: pulumi.Input<string>;
    /**
     * The DNS zone name which will be added.
     */
    zone: pulumi.Input<string>;
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare custom SSL resource.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.CustomSsl("example", {
 *     customSslOptions: {
 *         bundleMethod: "ubiquitous",
 *         certificate: "-----INSERT CERTIFICATE-----",
 *         geoRestrictions: "us",
 *         privateKey: "-----INSERT PRIVATE KEY-----",
 *         type: "legacy_custom",
 *     },
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/customSsl:CustomSsl example <zone_id>/<certificate_id>
 * ```
 */
export class CustomSsl extends pulumi.CustomResource {
    /**
     * Get an existing CustomSsl resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CustomSslState, opts?: pulumi.CustomResourceOptions): CustomSsl {
        return new CustomSsl(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/customSsl:CustomSsl';

    /**
     * Returns true if the given object is an instance of CustomSsl.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CustomSsl {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CustomSsl.__pulumiType;
    }

    /**
     * The certificate associated parameters. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly customSslOptions!: pulumi.Output<outputs.CustomSslCustomSslOptions | undefined>;
    public readonly customSslPriorities!: pulumi.Output<outputs.CustomSslCustomSslPriority[] | undefined>;
    public /*out*/ readonly expiresOn!: pulumi.Output<string>;
    public /*out*/ readonly hosts!: pulumi.Output<string[]>;
    public /*out*/ readonly issuer!: pulumi.Output<string>;
    public /*out*/ readonly modifiedOn!: pulumi.Output<string>;
    public /*out*/ readonly priority!: pulumi.Output<number>;
    public /*out*/ readonly signature!: pulumi.Output<string>;
    public /*out*/ readonly status!: pulumi.Output<string>;
    public /*out*/ readonly uploadedOn!: pulumi.Output<string>;
    /**
     * The zone identifier to target for the resource.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a CustomSsl resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CustomSslArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CustomSslArgs | CustomSslState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CustomSslState | undefined;
            resourceInputs["customSslOptions"] = state ? state.customSslOptions : undefined;
            resourceInputs["customSslPriorities"] = state ? state.customSslPriorities : undefined;
            resourceInputs["expiresOn"] = state ? state.expiresOn : undefined;
            resourceInputs["hosts"] = state ? state.hosts : undefined;
            resourceInputs["issuer"] = state ? state.issuer : undefined;
            resourceInputs["modifiedOn"] = state ? state.modifiedOn : undefined;
            resourceInputs["priority"] = state ? state.priority : undefined;
            resourceInputs["signature"] = state ? state.signature : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["uploadedOn"] = state ? state.uploadedOn : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as CustomSslArgs | undefined;
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["customSslOptions"] = args ? args.customSslOptions : undefined;
            resourceInputs["customSslPriorities"] = args ? args.customSslPriorities : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["expiresOn"] = undefined /*out*/;
            resourceInputs["hosts"] = undefined /*out*/;
            resourceInputs["issuer"] = undefined /*out*/;
            resourceInputs["modifiedOn"] = undefined /*out*/;
            resourceInputs["priority"] = undefined /*out*/;
            resourceInputs["signature"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["uploadedOn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CustomSsl.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CustomSsl resources.
 */
export interface CustomSslState {
    /**
     * The certificate associated parameters. **Modifying this attribute will force creation of a new resource.**
     */
    customSslOptions?: pulumi.Input<inputs.CustomSslCustomSslOptions>;
    customSslPriorities?: pulumi.Input<pulumi.Input<inputs.CustomSslCustomSslPriority>[]>;
    expiresOn?: pulumi.Input<string>;
    hosts?: pulumi.Input<pulumi.Input<string>[]>;
    issuer?: pulumi.Input<string>;
    modifiedOn?: pulumi.Input<string>;
    priority?: pulumi.Input<number>;
    signature?: pulumi.Input<string>;
    status?: pulumi.Input<string>;
    uploadedOn?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CustomSsl resource.
 */
export interface CustomSslArgs {
    /**
     * The certificate associated parameters. **Modifying this attribute will force creation of a new resource.**
     */
    customSslOptions?: pulumi.Input<inputs.CustomSslCustomSslOptions>;
    customSslPriorities?: pulumi.Input<pulumi.Input<inputs.CustomSslCustomSslPriority>[]>;
    /**
     * The zone identifier to target for the resource.
     */
    zoneId: pulumi.Input<string>;
}

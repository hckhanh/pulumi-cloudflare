// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare custom ssl resource.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const config = new pulumi.Config();
 * const cloudflareZoneId = config.get("cloudflareZoneId") || "1d5fdc9e88c8a8c4518b068cd94331fe";
 *
 * // Add a custom ssl certificate to the domain
 * const foossl = new cloudflare.CustomSsl("foossl", {
 *     customSslOptions: {
 *         bundle_method: "ubiquitous",
 *         certificate: "-----INSERT CERTIFICATE-----",
 *         geo_restrictions: "us",
 *         private_key: "-----INSERT PRIVATE KEY-----",
 *         type: "legacyCustom",
 *     },
 *     zoneId: cloudflareZoneId,
 * });
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
     * The certificate, private key and associated optional parameters, such as bundle_method, geo_restrictions, and type.
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
     * The DNS zone id to the custom ssl cert should be added.
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
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as CustomSslState | undefined;
            inputs["customSslOptions"] = state ? state.customSslOptions : undefined;
            inputs["customSslPriorities"] = state ? state.customSslPriorities : undefined;
            inputs["expiresOn"] = state ? state.expiresOn : undefined;
            inputs["hosts"] = state ? state.hosts : undefined;
            inputs["issuer"] = state ? state.issuer : undefined;
            inputs["modifiedOn"] = state ? state.modifiedOn : undefined;
            inputs["priority"] = state ? state.priority : undefined;
            inputs["signature"] = state ? state.signature : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["uploadedOn"] = state ? state.uploadedOn : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as CustomSslArgs | undefined;
            if (!args || args.zoneId === undefined) {
                throw new Error("Missing required property 'zoneId'");
            }
            inputs["customSslOptions"] = args ? args.customSslOptions : undefined;
            inputs["customSslPriorities"] = args ? args.customSslPriorities : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
            inputs["expiresOn"] = undefined /*out*/;
            inputs["hosts"] = undefined /*out*/;
            inputs["issuer"] = undefined /*out*/;
            inputs["modifiedOn"] = undefined /*out*/;
            inputs["priority"] = undefined /*out*/;
            inputs["signature"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
            inputs["uploadedOn"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(CustomSsl.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CustomSsl resources.
 */
export interface CustomSslState {
    /**
     * The certificate, private key and associated optional parameters, such as bundle_method, geo_restrictions, and type.
     */
    readonly customSslOptions?: pulumi.Input<inputs.CustomSslCustomSslOptions>;
    readonly customSslPriorities?: pulumi.Input<pulumi.Input<inputs.CustomSslCustomSslPriority>[]>;
    readonly expiresOn?: pulumi.Input<string>;
    readonly hosts?: pulumi.Input<pulumi.Input<string>[]>;
    readonly issuer?: pulumi.Input<string>;
    readonly modifiedOn?: pulumi.Input<string>;
    readonly priority?: pulumi.Input<number>;
    readonly signature?: pulumi.Input<string>;
    readonly status?: pulumi.Input<string>;
    readonly uploadedOn?: pulumi.Input<string>;
    /**
     * The DNS zone id to the custom ssl cert should be added.
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CustomSsl resource.
 */
export interface CustomSslArgs {
    /**
     * The certificate, private key and associated optional parameters, such as bundle_method, geo_restrictions, and type.
     */
    readonly customSslOptions?: pulumi.Input<inputs.CustomSslCustomSslOptions>;
    readonly customSslPriorities?: pulumi.Input<pulumi.Input<inputs.CustomSslCustomSslPriority>[]>;
    /**
     * The DNS zone id to the custom ssl cert should be added.
     */
    readonly zoneId: pulumi.Input<string>;
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Cloudflare Access can replace traditional SSH key models with
 * short-lived certificates issued to your users based on the token
 * generated by their Access login.
 *
 * > It's required that an `accountId` or `zoneId` is provided and in
 *    most cases using either is fine. However, if you're using a scoped
 *    access token, you must provide the argument that matches the token's
 *    scope. For example, an access token that is scoped to the "example.com"
 *    zone needs to use the `zoneId` argument.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // account level
 * const example = new cloudflare.AccessCaCertificate("example", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     applicationId: "6cd6cea3-3ef2-4542-9aea-85a0bbcd5414",
 * });
 * // zone level
 * const anotherExample = new cloudflare.AccessCaCertificate("anotherExample", {
 *     applicationId: "fe2be0ff-7f13-4350-8c8e-a9b9795fe3c2",
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Account level CA certificate import.
 *
 * ```sh
 * $ pulumi import cloudflare:index/accessCaCertificate:AccessCaCertificate example account/<account_id>/<application_id>
 * ```
 *
 * Zone level CA certificate import.
 *
 * ```sh
 * $ pulumi import cloudflare:index/accessCaCertificate:AccessCaCertificate example account/<zone_id>/<application_id>
 * ```
 */
export class AccessCaCertificate extends pulumi.CustomResource {
    /**
     * Get an existing AccessCaCertificate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessCaCertificateState, opts?: pulumi.CustomResourceOptions): AccessCaCertificate {
        return new AccessCaCertificate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/accessCaCertificate:AccessCaCertificate';

    /**
     * Returns true if the given object is an instance of AccessCaCertificate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessCaCertificate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessCaCertificate.__pulumiType;
    }

    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The Access Application ID to associate with the CA certificate.
     */
    public readonly applicationId!: pulumi.Output<string>;
    /**
     * Application Audience (AUD) Tag of the CA certificate.
     */
    public /*out*/ readonly aud!: pulumi.Output<string>;
    /**
     * Cryptographic public key of the generated CA certificate.
     */
    public /*out*/ readonly publicKey!: pulumi.Output<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a AccessCaCertificate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessCaCertificateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessCaCertificateArgs | AccessCaCertificateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessCaCertificateState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["applicationId"] = state ? state.applicationId : undefined;
            resourceInputs["aud"] = state ? state.aud : undefined;
            resourceInputs["publicKey"] = state ? state.publicKey : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as AccessCaCertificateArgs | undefined;
            if ((!args || args.applicationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'applicationId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["applicationId"] = args ? args.applicationId : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["aud"] = undefined /*out*/;
            resourceInputs["publicKey"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccessCaCertificate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessCaCertificate resources.
 */
export interface AccessCaCertificateState {
    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The Access Application ID to associate with the CA certificate.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * Application Audience (AUD) Tag of the CA certificate.
     */
    aud?: pulumi.Input<string>;
    /**
     * Cryptographic public key of the generated CA certificate.
     */
    publicKey?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessCaCertificate resource.
 */
export interface AccessCaCertificateArgs {
    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The Access Application ID to associate with the CA certificate.
     */
    applicationId: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}

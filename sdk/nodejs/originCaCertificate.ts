// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Origin CA certificate used to protect traffic to your origin without involving a third party Certificate Authority.
 *
 * **This resource requires you use your Origin CA Key as the `apiUserServiceKey`, in conjunction with an `apiToken` or `email` and `apiKey`.**
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 * import * as tls from "@pulumi/tls";
 *
 * // Create a CSR and generate a CA certificate
 * const examplePrivateKey = new tls.PrivateKey("examplePrivateKey", {algorithm: "RSA"});
 * const exampleCertRequest = new tls.CertRequest("exampleCertRequest", {
 *     keyAlgorithm: examplePrivateKey.algorithm,
 *     privateKeyPem: examplePrivateKey.privateKeyPem,
 *     subjects: [{
 *         commonName: "",
 *         organization: "Terraform Test",
 *     }],
 * });
 * const exampleOriginCaCertificate = new cloudflare.OriginCaCertificate("exampleOriginCaCertificate", {
 *     csr: exampleCertRequest.certRequestPem,
 *     hostnames: ["example.com"],
 *     requestType: "origin-rsa",
 *     requestedValidity: 7,
 * });
 * ```
 *
 * ## Import
 *
 * Origin CA certificate resource can be imported using an ID, e.g.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/originCaCertificate:OriginCaCertificate example 276266538771611802607153687288146423901027769273
 * ```
 */
export class OriginCaCertificate extends pulumi.CustomResource {
    /**
     * Get an existing OriginCaCertificate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OriginCaCertificateState, opts?: pulumi.CustomResourceOptions): OriginCaCertificate {
        return new OriginCaCertificate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/originCaCertificate:OriginCaCertificate';

    /**
     * Returns true if the given object is an instance of OriginCaCertificate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OriginCaCertificate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OriginCaCertificate.__pulumiType;
    }

    /**
     * The Origin CA certificate
     */
    public /*out*/ readonly certificate!: pulumi.Output<string>;
    /**
     * The Certificate Signing Request. Must be newline-encoded.
     */
    public readonly csr!: pulumi.Output<string | undefined>;
    /**
     * The datetime when the certificate will expire.
     */
    public /*out*/ readonly expiresOn!: pulumi.Output<string>;
    /**
     * An array of hostnames or wildcard names bound to the certificate.
     */
    public readonly hostnames!: pulumi.Output<string[]>;
    /**
     * The signature type desired on the certificate.
     */
    public readonly requestType!: pulumi.Output<string>;
    /**
     * The number of days for which the certificate should be valid.
     */
    public readonly requestedValidity!: pulumi.Output<number>;

    /**
     * Create a OriginCaCertificate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OriginCaCertificateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OriginCaCertificateArgs | OriginCaCertificateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OriginCaCertificateState | undefined;
            resourceInputs["certificate"] = state ? state.certificate : undefined;
            resourceInputs["csr"] = state ? state.csr : undefined;
            resourceInputs["expiresOn"] = state ? state.expiresOn : undefined;
            resourceInputs["hostnames"] = state ? state.hostnames : undefined;
            resourceInputs["requestType"] = state ? state.requestType : undefined;
            resourceInputs["requestedValidity"] = state ? state.requestedValidity : undefined;
        } else {
            const args = argsOrState as OriginCaCertificateArgs | undefined;
            if ((!args || args.hostnames === undefined) && !opts.urn) {
                throw new Error("Missing required property 'hostnames'");
            }
            if ((!args || args.requestType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'requestType'");
            }
            resourceInputs["csr"] = args ? args.csr : undefined;
            resourceInputs["hostnames"] = args ? args.hostnames : undefined;
            resourceInputs["requestType"] = args ? args.requestType : undefined;
            resourceInputs["requestedValidity"] = args ? args.requestedValidity : undefined;
            resourceInputs["certificate"] = undefined /*out*/;
            resourceInputs["expiresOn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OriginCaCertificate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OriginCaCertificate resources.
 */
export interface OriginCaCertificateState {
    /**
     * The Origin CA certificate
     */
    certificate?: pulumi.Input<string>;
    /**
     * The Certificate Signing Request. Must be newline-encoded.
     */
    csr?: pulumi.Input<string>;
    /**
     * The datetime when the certificate will expire.
     */
    expiresOn?: pulumi.Input<string>;
    /**
     * An array of hostnames or wildcard names bound to the certificate.
     */
    hostnames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The signature type desired on the certificate.
     */
    requestType?: pulumi.Input<string>;
    /**
     * The number of days for which the certificate should be valid.
     */
    requestedValidity?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a OriginCaCertificate resource.
 */
export interface OriginCaCertificateArgs {
    /**
     * The Certificate Signing Request. Must be newline-encoded.
     */
    csr?: pulumi.Input<string>;
    /**
     * An array of hostnames or wildcard names bound to the certificate.
     */
    hostnames: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The signature type desired on the certificate.
     */
    requestType: pulumi.Input<string>;
    /**
     * The number of days for which the certificate should be valid.
     */
    requestedValidity?: pulumi.Input<number>;
}

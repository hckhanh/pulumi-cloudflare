// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// Provides a Cloudflare mTLS certificate resource. These certificates may be used with mTLS enabled Cloudflare services.
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/mtlsCertificate:MtlsCertificate example &lt;account_id&gt;/&lt;mtls_certificate_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/mtlsCertificate:MtlsCertificate")]
    public partial class MtlsCertificate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Whether this is a CA or leaf certificate. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("ca")]
        public Output<bool> Ca { get; private set; } = null!;

        /// <summary>
        /// Certificate you intend to use with mTLS-enabled services. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("certificates")]
        public Output<string> Certificates { get; private set; } = null!;

        /// <summary>
        /// **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("expiresOn")]
        public Output<string> ExpiresOn { get; private set; } = null!;

        /// <summary>
        /// **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("issuer")]
        public Output<string> Issuer { get; private set; } = null!;

        /// <summary>
        /// Optional unique name for the certificate. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("name")]
        public Output<string?> Name { get; private set; } = null!;

        /// <summary>
        /// The certificate's private key. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("privateKey")]
        public Output<string?> PrivateKey { get; private set; } = null!;

        /// <summary>
        /// **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("serialNumber")]
        public Output<string> SerialNumber { get; private set; } = null!;

        /// <summary>
        /// **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("signature")]
        public Output<string> Signature { get; private set; } = null!;

        /// <summary>
        /// **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("uploadedOn")]
        public Output<string> UploadedOn { get; private set; } = null!;


        /// <summary>
        /// Create a MtlsCertificate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MtlsCertificate(string name, MtlsCertificateArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/mtlsCertificate:MtlsCertificate", name, args ?? new MtlsCertificateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MtlsCertificate(string name, Input<string> id, MtlsCertificateState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/mtlsCertificate:MtlsCertificate", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing MtlsCertificate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MtlsCertificate Get(string name, Input<string> id, MtlsCertificateState? state = null, CustomResourceOptions? options = null)
        {
            return new MtlsCertificate(name, id, state, options);
        }
    }

    public sealed class MtlsCertificateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Whether this is a CA or leaf certificate. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("ca", required: true)]
        public Input<bool> Ca { get; set; } = null!;

        /// <summary>
        /// Certificate you intend to use with mTLS-enabled services. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("certificates", required: true)]
        public Input<string> Certificates { get; set; } = null!;

        /// <summary>
        /// Optional unique name for the certificate. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The certificate's private key. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("privateKey")]
        public Input<string>? PrivateKey { get; set; }

        public MtlsCertificateArgs()
        {
        }
        public static new MtlsCertificateArgs Empty => new MtlsCertificateArgs();
    }

    public sealed class MtlsCertificateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Whether this is a CA or leaf certificate. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("ca")]
        public Input<bool>? Ca { get; set; }

        /// <summary>
        /// Certificate you intend to use with mTLS-enabled services. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("certificates")]
        public Input<string>? Certificates { get; set; }

        /// <summary>
        /// **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("expiresOn")]
        public Input<string>? ExpiresOn { get; set; }

        /// <summary>
        /// **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("issuer")]
        public Input<string>? Issuer { get; set; }

        /// <summary>
        /// Optional unique name for the certificate. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The certificate's private key. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("privateKey")]
        public Input<string>? PrivateKey { get; set; }

        /// <summary>
        /// **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("serialNumber")]
        public Input<string>? SerialNumber { get; set; }

        /// <summary>
        /// **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("signature")]
        public Input<string>? Signature { get; set; }

        /// <summary>
        /// **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("uploadedOn")]
        public Input<string>? UploadedOn { get; set; }

        public MtlsCertificateState()
        {
        }
        public static new MtlsCertificateState Empty => new MtlsCertificateState();
    }
}

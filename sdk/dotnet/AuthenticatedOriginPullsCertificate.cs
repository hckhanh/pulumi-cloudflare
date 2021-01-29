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
    /// Provides a Cloudflare Authenticated Origin Pulls certificate resource. An uploaded client certificate is required to use Per-Zone or Per-Hostname Authenticated Origin Pulls.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Per-Zone Authenticated Origin Pulls certificate
    ///         var myPerZoneAopCert = new Cloudflare.AuthenticatedOriginPullsCertificate("myPerZoneAopCert", new Cloudflare.AuthenticatedOriginPullsCertificateArgs
    ///         {
    ///             Certificate = "-----INSERT CERTIFICATE-----",
    ///             PrivateKey = "-----INSERT PRIVATE KEY-----",
    ///             Type = "per-zone",
    ///             ZoneId = @var.Cloudflare_zone_id,
    ///         });
    ///         // Per-Hostname Authenticated Origin Pulls certificate
    ///         var myPerHostnameAopCert = new Cloudflare.AuthenticatedOriginPullsCertificate("myPerHostnameAopCert", new Cloudflare.AuthenticatedOriginPullsCertificateArgs
    ///         {
    ///             Certificate = "-----INSERT CERTIFICATE-----",
    ///             PrivateKey = "-----INSERT PRIVATE KEY-----",
    ///             Type = "per-hostname",
    ///             ZoneId = @var.Cloudflare_zone_id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Authenticated Origin Pull certificates can be imported using a composite ID formed of the zone ID, the form of Authenticated Origin Pulls, and the certificate ID, e.g. # Import Per-Zone Authenticated Origin Pull certificate
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate 2458ce5a-0c35-4c7f-82c7-8e9487d3ff60 023e105f4ecef8ad9ca31a8372d0c353/per-zone/2458ce5a-0c35-4c7f-82c7-8e9487d3ff60
    /// ```
    /// 
    /// # Import Per-Hostname Authenticated Origin Pull certificate
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate 2458ce5a-0c35-4c7f-82c7-8e9487d3ff60 023e105f4ecef8ad9ca31a8372d0c353/per-hostname/2458ce5a-0c35-4c7f-82c7-8e9487d3ff60
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate")]
    public partial class AuthenticatedOriginPullsCertificate : Pulumi.CustomResource
    {
        /// <summary>
        /// The public client certificate.
        /// </summary>
        [Output("certificate")]
        public Output<string> Certificate { get; private set; } = null!;

        [Output("expiresOn")]
        public Output<string> ExpiresOn { get; private set; } = null!;

        [Output("issuer")]
        public Output<string> Issuer { get; private set; } = null!;

        /// <summary>
        /// The private key of the client certificate.
        /// </summary>
        [Output("privateKey")]
        public Output<string> PrivateKey { get; private set; } = null!;

        [Output("serialNumber")]
        public Output<string> SerialNumber { get; private set; } = null!;

        [Output("signature")]
        public Output<string> Signature { get; private set; } = null!;

        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The form of Authenticated Origin Pulls to upload the certificate to.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        [Output("uploadedOn")]
        public Output<string> UploadedOn { get; private set; } = null!;

        /// <summary>
        /// The zone ID to upload the certificate to.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a AuthenticatedOriginPullsCertificate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AuthenticatedOriginPullsCertificate(string name, AuthenticatedOriginPullsCertificateArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate", name, args ?? new AuthenticatedOriginPullsCertificateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AuthenticatedOriginPullsCertificate(string name, Input<string> id, AuthenticatedOriginPullsCertificateState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AuthenticatedOriginPullsCertificate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AuthenticatedOriginPullsCertificate Get(string name, Input<string> id, AuthenticatedOriginPullsCertificateState? state = null, CustomResourceOptions? options = null)
        {
            return new AuthenticatedOriginPullsCertificate(name, id, state, options);
        }
    }

    public sealed class AuthenticatedOriginPullsCertificateArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The public client certificate.
        /// </summary>
        [Input("certificate", required: true)]
        public Input<string> Certificate { get; set; } = null!;

        /// <summary>
        /// The private key of the client certificate.
        /// </summary>
        [Input("privateKey", required: true)]
        public Input<string> PrivateKey { get; set; } = null!;

        /// <summary>
        /// The form of Authenticated Origin Pulls to upload the certificate to.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// The zone ID to upload the certificate to.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public AuthenticatedOriginPullsCertificateArgs()
        {
        }
    }

    public sealed class AuthenticatedOriginPullsCertificateState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The public client certificate.
        /// </summary>
        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        [Input("expiresOn")]
        public Input<string>? ExpiresOn { get; set; }

        [Input("issuer")]
        public Input<string>? Issuer { get; set; }

        /// <summary>
        /// The private key of the client certificate.
        /// </summary>
        [Input("privateKey")]
        public Input<string>? PrivateKey { get; set; }

        [Input("serialNumber")]
        public Input<string>? SerialNumber { get; set; }

        [Input("signature")]
        public Input<string>? Signature { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The form of Authenticated Origin Pulls to upload the certificate to.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("uploadedOn")]
        public Input<string>? UploadedOn { get; set; }

        /// <summary>
        /// The zone ID to upload the certificate to.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AuthenticatedOriginPullsCertificateState()
        {
        }
    }
}

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
    /// Provides a Cloudflare Authenticated Origin Pulls resource. A `cloudflare.AuthenticatedOriginPulls`
    /// resource is required to use Per-Zone or Per-Hostname Authenticated
    /// Origin Pulls.
    /// 
    /// ## Import
    /// 
    /// global
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls example &lt;zone_id&gt;
    /// ```
    /// 
    ///  per zone
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls example &lt;zone_id&gt;/&lt;certificate_id&gt;
    /// ```
    /// 
    ///  per hostname
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls example &lt;zone_id&gt;/&lt;certificate_id&gt;/&lt;hostname&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls")]
    public partial class AuthenticatedOriginPulls : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
        /// </summary>
        [Output("authenticatedOriginPullsCertificate")]
        public Output<string?> AuthenticatedOriginPullsCertificate { get; private set; } = null!;

        /// <summary>
        /// Whether to enable Authenticated Origin Pulls on the given zone or hostname.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
        /// </summary>
        [Output("hostname")]
        public Output<string?> Hostname { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a AuthenticatedOriginPulls resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AuthenticatedOriginPulls(string name, AuthenticatedOriginPullsArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls", name, args ?? new AuthenticatedOriginPullsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AuthenticatedOriginPulls(string name, Input<string> id, AuthenticatedOriginPullsState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AuthenticatedOriginPulls resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AuthenticatedOriginPulls Get(string name, Input<string> id, AuthenticatedOriginPullsState? state = null, CustomResourceOptions? options = null)
        {
            return new AuthenticatedOriginPulls(name, id, state, options);
        }
    }

    public sealed class AuthenticatedOriginPullsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
        /// </summary>
        [Input("authenticatedOriginPullsCertificate")]
        public Input<string>? AuthenticatedOriginPullsCertificate { get; set; }

        /// <summary>
        /// Whether to enable Authenticated Origin Pulls on the given zone or hostname.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public AuthenticatedOriginPullsArgs()
        {
        }
        public static new AuthenticatedOriginPullsArgs Empty => new AuthenticatedOriginPullsArgs();
    }

    public sealed class AuthenticatedOriginPullsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
        /// </summary>
        [Input("authenticatedOriginPullsCertificate")]
        public Input<string>? AuthenticatedOriginPullsCertificate { get; set; }

        /// <summary>
        /// Whether to enable Authenticated Origin Pulls on the given zone or hostname.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AuthenticatedOriginPullsState()
        {
        }
        public static new AuthenticatedOriginPullsState Empty => new AuthenticatedOriginPullsState();
    }
}

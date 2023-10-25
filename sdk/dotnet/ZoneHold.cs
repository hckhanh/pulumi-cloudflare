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
    /// Provides a Cloudflare Zone Hold resource that prevents adding
    /// the hostname to another account for use.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Cloudflare.ZoneHold("example", new()
    ///     {
    ///         Hold = true,
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/zoneHold:ZoneHold example &lt;zone_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/zoneHold:ZoneHold")]
    public partial class ZoneHold : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Enablement status of the zone hold.
        /// </summary>
        [Output("hold")]
        public Output<bool> Hold { get; private set; } = null!;

        /// <summary>
        /// The RFC3339 compatible timestamp when to automatically re-enable the zone hold.
        /// </summary>
        [Output("holdAfter")]
        public Output<string> HoldAfter { get; private set; } = null!;

        /// <summary>
        /// Whether to extend to block any subdomain of the given zone.
        /// </summary>
        [Output("includeSubdomains")]
        public Output<bool?> IncludeSubdomains { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a ZoneHold resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ZoneHold(string name, ZoneHoldArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/zoneHold:ZoneHold", name, args ?? new ZoneHoldArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ZoneHold(string name, Input<string> id, ZoneHoldState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/zoneHold:ZoneHold", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ZoneHold resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ZoneHold Get(string name, Input<string> id, ZoneHoldState? state = null, CustomResourceOptions? options = null)
        {
            return new ZoneHold(name, id, state, options);
        }
    }

    public sealed class ZoneHoldArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enablement status of the zone hold.
        /// </summary>
        [Input("hold", required: true)]
        public Input<bool> Hold { get; set; } = null!;

        /// <summary>
        /// The RFC3339 compatible timestamp when to automatically re-enable the zone hold.
        /// </summary>
        [Input("holdAfter")]
        public Input<string>? HoldAfter { get; set; }

        /// <summary>
        /// Whether to extend to block any subdomain of the given zone.
        /// </summary>
        [Input("includeSubdomains")]
        public Input<bool>? IncludeSubdomains { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public ZoneHoldArgs()
        {
        }
        public static new ZoneHoldArgs Empty => new ZoneHoldArgs();
    }

    public sealed class ZoneHoldState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enablement status of the zone hold.
        /// </summary>
        [Input("hold")]
        public Input<bool>? Hold { get; set; }

        /// <summary>
        /// The RFC3339 compatible timestamp when to automatically re-enable the zone hold.
        /// </summary>
        [Input("holdAfter")]
        public Input<string>? HoldAfter { get; set; }

        /// <summary>
        /// Whether to extend to block any subdomain of the given zone.
        /// </summary>
        [Input("includeSubdomains")]
        public Input<bool>? IncludeSubdomains { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ZoneHoldState()
        {
        }
        public static new ZoneHoldState Empty => new ZoneHoldState();
    }
}

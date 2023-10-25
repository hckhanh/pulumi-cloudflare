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
    ///     var wordpress = new Cloudflare.Filter("wordpress", new()
    ///     {
    ///         Description = "Wordpress break-in attempts that are outside of the office",
    ///         Expression = "(http.request.uri.path ~ \".*wp-login.php\" or http.request.uri.path ~ \".*xmlrpc.php\") and ip.src ne 192.0.2.1",
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/filter:Filter example &lt;zone_id&gt;/&lt;filter_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/filter:Filter")]
    public partial class Filter : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A note that you can use to describe the purpose of the filter.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The filter expression to be used.
        /// </summary>
        [Output("expression")]
        public Output<string> Expression { get; private set; } = null!;

        /// <summary>
        /// Whether this filter is currently paused.
        /// </summary>
        [Output("paused")]
        public Output<bool?> Paused { get; private set; } = null!;

        /// <summary>
        /// Short reference tag to quickly select related rules.
        /// </summary>
        [Output("ref")]
        public Output<string?> Ref { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a Filter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Filter(string name, FilterArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/filter:Filter", name, args ?? new FilterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Filter(string name, Input<string> id, FilterState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/filter:Filter", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Filter resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Filter Get(string name, Input<string> id, FilterState? state = null, CustomResourceOptions? options = null)
        {
            return new Filter(name, id, state, options);
        }
    }

    public sealed class FilterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A note that you can use to describe the purpose of the filter.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The filter expression to be used.
        /// </summary>
        [Input("expression", required: true)]
        public Input<string> Expression { get; set; } = null!;

        /// <summary>
        /// Whether this filter is currently paused.
        /// </summary>
        [Input("paused")]
        public Input<bool>? Paused { get; set; }

        /// <summary>
        /// Short reference tag to quickly select related rules.
        /// </summary>
        [Input("ref")]
        public Input<string>? Ref { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public FilterArgs()
        {
        }
        public static new FilterArgs Empty => new FilterArgs();
    }

    public sealed class FilterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A note that you can use to describe the purpose of the filter.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The filter expression to be used.
        /// </summary>
        [Input("expression")]
        public Input<string>? Expression { get; set; }

        /// <summary>
        /// Whether this filter is currently paused.
        /// </summary>
        [Input("paused")]
        public Input<bool>? Paused { get; set; }

        /// <summary>
        /// Short reference tag to quickly select related rules.
        /// </summary>
        [Input("ref")]
        public Input<string>? Ref { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public FilterState()
        {
        }
        public static new FilterState Empty => new FilterState();
    }
}

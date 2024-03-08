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
    /// Provides a Cloudflare page rule resource.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Add a page rule to the domain
    ///     var foobar = new Cloudflare.PageRule("foobar", new()
    ///     {
    ///         ZoneId = @var.Cloudflare_zone_id,
    ///         Target = $"sub.{@var.Cloudflare_zone}/page",
    ///         Priority = 1,
    ///         Actions = new Cloudflare.Inputs.PageRuleActionsArgs
    ///         {
    ///             Ssl = "flexible",
    ///             EmailObfuscation = "on",
    ///             Minifies = new[]
    ///             {
    ///                 new Cloudflare.Inputs.PageRuleActionsMinifyArgs
    ///                 {
    ///                     Html = "off",
    ///                     Css = "on",
    ///                     Js = "on",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Page rules can be imported using a composite ID formed of zone ID and page rule ID, e.g.
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/pageRule:PageRule default d41d8cd98f00b204e9800998ecf8427e/ch8374ftwdghsif43
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/pageRule:PageRule")]
    public partial class PageRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The actions taken by the page rule, options given below.
        /// </summary>
        [Output("actions")]
        public Output<Outputs.PageRuleActions> Actions { get; private set; } = null!;

        /// <summary>
        /// The priority of the page rule among others for this target, the higher the number the higher the priority as per [API documentation](https://api.cloudflare.com/#page-rules-for-a-zone-create-page-rule).
        /// </summary>
        [Output("priority")]
        public Output<int?> Priority { get; private set; } = null!;

        /// <summary>
        /// Whether the page rule is active or disabled.
        /// </summary>
        [Output("status")]
        public Output<string?> Status { get; private set; } = null!;

        /// <summary>
        /// The URL pattern to target with the page rule.
        /// </summary>
        [Output("target")]
        public Output<string> Target { get; private set; } = null!;

        /// <summary>
        /// The DNS zone ID to which the page rule should be added.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a PageRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PageRule(string name, PageRuleArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/pageRule:PageRule", name, args ?? new PageRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PageRule(string name, Input<string> id, PageRuleState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/pageRule:PageRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PageRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PageRule Get(string name, Input<string> id, PageRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new PageRule(name, id, state, options);
        }
    }

    public sealed class PageRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The actions taken by the page rule, options given below.
        /// </summary>
        [Input("actions", required: true)]
        public Input<Inputs.PageRuleActionsArgs> Actions { get; set; } = null!;

        /// <summary>
        /// The priority of the page rule among others for this target, the higher the number the higher the priority as per [API documentation](https://api.cloudflare.com/#page-rules-for-a-zone-create-page-rule).
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// Whether the page rule is active or disabled.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The URL pattern to target with the page rule.
        /// </summary>
        [Input("target", required: true)]
        public Input<string> Target { get; set; } = null!;

        /// <summary>
        /// The DNS zone ID to which the page rule should be added.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public PageRuleArgs()
        {
        }
        public static new PageRuleArgs Empty => new PageRuleArgs();
    }

    public sealed class PageRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The actions taken by the page rule, options given below.
        /// </summary>
        [Input("actions")]
        public Input<Inputs.PageRuleActionsGetArgs>? Actions { get; set; }

        /// <summary>
        /// The priority of the page rule among others for this target, the higher the number the higher the priority as per [API documentation](https://api.cloudflare.com/#page-rules-for-a-zone-create-page-rule).
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// Whether the page rule is active or disabled.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The URL pattern to target with the page rule.
        /// </summary>
        [Input("target")]
        public Input<string>? Target { get; set; }

        /// <summary>
        /// The DNS zone ID to which the page rule should be added.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public PageRuleState()
        {
        }
        public static new PageRuleState Empty => new PageRuleState();
    }
}

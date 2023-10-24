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
    /// Provides a resource to manage User Agent Blocking Rules.
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/userAgentBlockingRule:UserAgentBlockingRule example &lt;zone_id&gt;/&lt;user_agent_blocking_rule_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/userAgentBlockingRule:UserAgentBlockingRule")]
    public partial class UserAgentBlockingRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The configuration object for the current rule.
        /// </summary>
        [Output("configuration")]
        public Output<Outputs.UserAgentBlockingRuleConfiguration> Configuration { get; private set; } = null!;

        /// <summary>
        /// An informative summary of the rule.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The action to apply to a matched request. Available values: `block`, `challenge`, `js_challenge`, `managed_challenge`.
        /// </summary>
        [Output("mode")]
        public Output<string> Mode { get; private set; } = null!;

        /// <summary>
        /// When true, indicates that the rule is currently paused.
        /// </summary>
        [Output("paused")]
        public Output<bool> Paused { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a UserAgentBlockingRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserAgentBlockingRule(string name, UserAgentBlockingRuleArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/userAgentBlockingRule:UserAgentBlockingRule", name, args ?? new UserAgentBlockingRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserAgentBlockingRule(string name, Input<string> id, UserAgentBlockingRuleState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/userAgentBlockingRule:UserAgentBlockingRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UserAgentBlockingRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserAgentBlockingRule Get(string name, Input<string> id, UserAgentBlockingRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new UserAgentBlockingRule(name, id, state, options);
        }
    }

    public sealed class UserAgentBlockingRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The configuration object for the current rule.
        /// </summary>
        [Input("configuration", required: true)]
        public Input<Inputs.UserAgentBlockingRuleConfigurationArgs> Configuration { get; set; } = null!;

        /// <summary>
        /// An informative summary of the rule.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// The action to apply to a matched request. Available values: `block`, `challenge`, `js_challenge`, `managed_challenge`.
        /// </summary>
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        /// <summary>
        /// When true, indicates that the rule is currently paused.
        /// </summary>
        [Input("paused", required: true)]
        public Input<bool> Paused { get; set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public UserAgentBlockingRuleArgs()
        {
        }
        public static new UserAgentBlockingRuleArgs Empty => new UserAgentBlockingRuleArgs();
    }

    public sealed class UserAgentBlockingRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The configuration object for the current rule.
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.UserAgentBlockingRuleConfigurationGetArgs>? Configuration { get; set; }

        /// <summary>
        /// An informative summary of the rule.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The action to apply to a matched request. Available values: `block`, `challenge`, `js_challenge`, `managed_challenge`.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// When true, indicates that the rule is currently paused.
        /// </summary>
        [Input("paused")]
        public Input<bool>? Paused { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public UserAgentBlockingRuleState()
        {
        }
        public static new UserAgentBlockingRuleState Empty => new UserAgentBlockingRuleState();
    }
}

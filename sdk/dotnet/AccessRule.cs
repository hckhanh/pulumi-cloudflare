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
    /// Provides a Cloudflare IP Firewall Access Rule resource. Access
    /// control can be applied on basis of IP addresses, IP ranges, AS
    /// numbers or countries.
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
    ///     // Challenge requests coming from known Tor exit nodes.
    ///     var torExitNodes = new Cloudflare.AccessRule("torExitNodes", new()
    ///     {
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///         Notes = "Requests coming from known Tor exit nodes",
    ///         Mode = "challenge",
    ///         Configuration = new Cloudflare.Inputs.AccessRuleConfigurationArgs
    ///         {
    ///             Target = "country",
    ///             Value = "T1",
    ///         },
    ///     });
    /// 
    ///     // Allowlist requests coming from Antarctica, but only for single zone.
    ///     var antarctica = new Cloudflare.AccessRule("antarctica", new()
    ///     {
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///         Notes = "Requests coming from Antarctica",
    ///         Mode = "whitelist",
    ///         Configuration = new Cloudflare.Inputs.AccessRuleConfigurationArgs
    ///         {
    ///             Target = "country",
    ///             Value = "AQ",
    ///         },
    ///     });
    /// 
    ///     var config = new Config();
    ///     var myOffice = config.GetObject&lt;string[]&gt;("myOffice") ?? new[]
    ///     {
    ///         "192.0.2.0/24",
    ///         "198.51.100.0/24",
    ///         "2001:db8::/56",
    ///     };
    ///     var officeNetwork = new List&lt;Cloudflare.AccessRule&gt;();
    ///     for (var rangeIndex = 0; rangeIndex &lt; myOffice.Length; rangeIndex++)
    ///     {
    ///         var range = new { Value = rangeIndex };
    ///         officeNetwork.Add(new Cloudflare.AccessRule($"officeNetwork-{range.Value}", new()
    ///         {
    ///             AccountId = "f037e56e89293a057740de681ac9abbe",
    ///             Notes = "Requests coming from office network",
    ///             Mode = "whitelist",
    ///             Configuration = new Cloudflare.Inputs.AccessRuleConfigurationArgs
    ///             {
    ///                 Target = "ip_range",
    ///                 Value = myOffice[count.Index],
    ///             },
    ///         }));
    ///     }
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// User level access rule import.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/accessRule:AccessRule default user/&lt;user_id&gt;/&lt;rule_id&gt;
    /// ```
    /// 
    ///  Zone level access rule import.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/accessRule:AccessRule default zone/&lt;zone_id&gt;/&lt;rule_id&gt;
    /// ```
    /// 
    ///  Account level access rule import.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/accessRule:AccessRule default account/&lt;account_id&gt;/&lt;rule_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/accessRule:AccessRule")]
    public partial class AccessRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Rule configuration to apply to a matched request. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("configuration")]
        public Output<Outputs.AccessRuleConfiguration> Configuration { get; private set; } = null!;

        /// <summary>
        /// The action to apply to a matched request. Available values: `block`, `challenge`, `whitelist`, `js_challenge`, `managed_challenge`.
        /// </summary>
        [Output("mode")]
        public Output<string> Mode { get; private set; } = null!;

        /// <summary>
        /// A personal note about the rule. Typically used as a reminder or explanation for the rule.
        /// </summary>
        [Output("notes")]
        public Output<string?> Notes { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a AccessRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessRule(string name, AccessRuleArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessRule:AccessRule", name, args ?? new AccessRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessRule(string name, Input<string> id, AccessRuleState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessRule:AccessRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccessRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessRule Get(string name, Input<string> id, AccessRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessRule(name, id, state, options);
        }
    }

    public sealed class AccessRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Rule configuration to apply to a matched request. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("configuration", required: true)]
        public Input<Inputs.AccessRuleConfigurationArgs> Configuration { get; set; } = null!;

        /// <summary>
        /// The action to apply to a matched request. Available values: `block`, `challenge`, `whitelist`, `js_challenge`, `managed_challenge`.
        /// </summary>
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        /// <summary>
        /// A personal note about the rule. Typically used as a reminder or explanation for the rule.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessRuleArgs()
        {
        }
        public static new AccessRuleArgs Empty => new AccessRuleArgs();
    }

    public sealed class AccessRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Rule configuration to apply to a matched request. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.AccessRuleConfigurationGetArgs>? Configuration { get; set; }

        /// <summary>
        /// The action to apply to a matched request. Available values: `block`, `challenge`, `whitelist`, `js_challenge`, `managed_challenge`.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// A personal note about the rule. Typically used as a reminder or explanation for the rule.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessRuleState()
        {
        }
        public static new AccessRuleState Empty => new AccessRuleState();
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetRulesets
    {
        /// <summary>
        /// Use this datasource to lookup Rulesets in an account or zone.
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
        ///     var example = Cloudflare.GetRulesets.Invoke(new()
        ///     {
        ///         Filter = new Cloudflare.Inputs.GetRulesetsFilterInputArgs
        ///         {
        ///             Name = ".*OWASP.*",
        ///         },
        ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetRulesetsResult> InvokeAsync(GetRulesetsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRulesetsResult>("cloudflare:index/getRulesets:getRulesets", args ?? new GetRulesetsArgs(), options.WithDefaults());

        /// <summary>
        /// Use this datasource to lookup Rulesets in an account or zone.
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
        ///     var example = Cloudflare.GetRulesets.Invoke(new()
        ///     {
        ///         Filter = new Cloudflare.Inputs.GetRulesetsFilterInputArgs
        ///         {
        ///             Name = ".*OWASP.*",
        ///         },
        ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetRulesetsResult> Invoke(GetRulesetsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRulesetsResult>("cloudflare:index/getRulesets:getRulesets", args ?? new GetRulesetsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRulesetsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
        /// </summary>
        [Input("accountId")]
        public string? AccountId { get; set; }

        [Input("filter")]
        public Inputs.GetRulesetsFilterArgs? Filter { get; set; }

        /// <summary>
        /// Include rule data in response.
        /// </summary>
        [Input("includeRules")]
        public bool? IncludeRules { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
        /// </summary>
        [Input("zoneId")]
        public string? ZoneId { get; set; }

        public GetRulesetsArgs()
        {
        }
        public static new GetRulesetsArgs Empty => new GetRulesetsArgs();
    }

    public sealed class GetRulesetsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("filter")]
        public Input<Inputs.GetRulesetsFilterInputArgs>? Filter { get; set; }

        /// <summary>
        /// Include rule data in response.
        /// </summary>
        [Input("includeRules")]
        public Input<bool>? IncludeRules { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public GetRulesetsInvokeArgs()
        {
        }
        public static new GetRulesetsInvokeArgs Empty => new GetRulesetsInvokeArgs();
    }


    [OutputType]
    public sealed class GetRulesetsResult
    {
        /// <summary>
        /// The account identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
        /// </summary>
        public readonly string? AccountId;
        public readonly Outputs.GetRulesetsFilterResult? Filter;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Include rule data in response.
        /// </summary>
        public readonly bool? IncludeRules;
        public readonly ImmutableArray<Outputs.GetRulesetsRulesetResult> Rulesets;
        /// <summary>
        /// The zone identifier to target for the resource. Must provide only one of `zone_id`, `account_id`.
        /// </summary>
        public readonly string? ZoneId;

        [OutputConstructor]
        private GetRulesetsResult(
            string? accountId,

            Outputs.GetRulesetsFilterResult? filter,

            string id,

            bool? includeRules,

            ImmutableArray<Outputs.GetRulesetsRulesetResult> rulesets,

            string? zoneId)
        {
            AccountId = accountId;
            Filter = filter;
            Id = id;
            IncludeRules = includeRules;
            Rulesets = rulesets;
            ZoneId = zoneId;
        }
    }
}

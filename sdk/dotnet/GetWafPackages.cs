// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetWafPackages
    {
        /// <summary>
        /// Use this data source to look up [WAF Rule Packages](https://api.cloudflare.com/#waf-rule-packages-properties).
        /// 
        /// {{% examples %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetWafPackagesResult> InvokeAsync(GetWafPackagesArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetWafPackagesResult>("cloudflare:index/getWafPackages:getWafPackages", args ?? new GetWafPackagesArgs(), options.WithVersion());
    }


    public sealed class GetWafPackagesArgs : Pulumi.InvokeArgs
    {
        [Input("filter")]
        public Inputs.GetWafPackagesFilterArgs? Filter { get; set; }

        [Input("zoneId", required: true)]
        public string ZoneId { get; set; } = null!;

        public GetWafPackagesArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetWafPackagesResult
    {
        public readonly Outputs.GetWafPackagesFilterResult? Filter;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetWafPackagesPackageResult> Packages;
        public readonly string ZoneId;

        [OutputConstructor]
        private GetWafPackagesResult(
            Outputs.GetWafPackagesFilterResult? filter,

            string id,

            ImmutableArray<Outputs.GetWafPackagesPackageResult> packages,

            string zoneId)
        {
            Filter = filter;
            Id = id;
            Packages = packages;
            ZoneId = zoneId;
        }
    }
}

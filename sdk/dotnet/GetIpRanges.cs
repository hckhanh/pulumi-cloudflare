// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetIpRanges
    {
        /// <summary>
        /// Use this data source to get the [IP ranges](https://www.cloudflare.com/ips/) of Cloudflare network.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// using Example = Pulumi.Example;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var cloudflare = Cloudflare.GetIpRanges.Invoke();
        /// 
        ///     var example = new Example.Index.Example_firewall_resource("example", new()
        ///     {
        ///         Name = "from-cloudflare",
        ///         Network = "default",
        ///         SourceRanges = cloudflare.Apply(getIpRangesResult =&gt; getIpRangesResult.Ipv4CidrBlocks),
        ///         Allow = new[]
        ///         {
        ///             
        ///             {
        ///                 { "ports", "443" },
        ///                 { "protocol", "tcp" },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetIpRangesResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIpRangesResult>("cloudflare:index/getIpRanges:getIpRanges", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Use this data source to get the [IP ranges](https://www.cloudflare.com/ips/) of Cloudflare network.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// using Example = Pulumi.Example;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var cloudflare = Cloudflare.GetIpRanges.Invoke();
        /// 
        ///     var example = new Example.Index.Example_firewall_resource("example", new()
        ///     {
        ///         Name = "from-cloudflare",
        ///         Network = "default",
        ///         SourceRanges = cloudflare.Apply(getIpRangesResult =&gt; getIpRangesResult.Ipv4CidrBlocks),
        ///         Allow = new[]
        ///         {
        ///             
        ///             {
        ///                 { "ports", "443" },
        ///                 { "protocol", "tcp" },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetIpRangesResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIpRangesResult>("cloudflare:index/getIpRanges:getIpRanges", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetIpRangesResult
    {
        /// <summary>
        /// The lexically ordered list of only the IPv4 China CIDR blocks.
        /// </summary>
        public readonly ImmutableArray<string> ChinaIpv4CidrBlocks;
        /// <summary>
        /// The lexically ordered list of only the IPv6 China CIDR blocks.
        /// </summary>
        public readonly ImmutableArray<string> ChinaIpv6CidrBlocks;
        /// <summary>
        /// The lexically ordered list of all non-China CIDR blocks.
        /// </summary>
        public readonly ImmutableArray<string> CidrBlocks;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The lexically ordered list of only the IPv4 CIDR blocks.
        /// </summary>
        public readonly ImmutableArray<string> Ipv4CidrBlocks;
        /// <summary>
        /// The lexically ordered list of only the IPv6 CIDR blocks.
        /// </summary>
        public readonly ImmutableArray<string> Ipv6CidrBlocks;

        [OutputConstructor]
        private GetIpRangesResult(
            ImmutableArray<string> chinaIpv4CidrBlocks,

            ImmutableArray<string> chinaIpv6CidrBlocks,

            ImmutableArray<string> cidrBlocks,

            string id,

            ImmutableArray<string> ipv4CidrBlocks,

            ImmutableArray<string> ipv6CidrBlocks)
        {
            ChinaIpv4CidrBlocks = chinaIpv4CidrBlocks;
            ChinaIpv6CidrBlocks = chinaIpv6CidrBlocks;
            CidrBlocks = cidrBlocks;
            Id = id;
            Ipv4CidrBlocks = ipv4CidrBlocks;
            Ipv6CidrBlocks = ipv6CidrBlocks;
        }
    }
}

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
    /// Provides a resource, that manages GRE tunnels for Magic Transit.
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/greTunnel:GreTunnel example &lt;account_id&gt;/&lt;tunnel_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/greTunnel:GreTunnel")]
    public partial class GreTunnel : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        /// <summary>
        /// The IP address assigned to the Cloudflare side of the GRE tunnel.
        /// </summary>
        [Output("cloudflareGreEndpoint")]
        public Output<string> CloudflareGreEndpoint { get; private set; } = null!;

        /// <summary>
        /// The IP address assigned to the customer side of the GRE tunnel.
        /// </summary>
        [Output("customerGreEndpoint")]
        public Output<string> CustomerGreEndpoint { get; private set; } = null!;

        /// <summary>
        /// Description of the GRE tunnel intent.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Specifies if ICMP tunnel health checks are enabled.
        /// </summary>
        [Output("healthCheckEnabled")]
        public Output<bool> HealthCheckEnabled { get; private set; } = null!;

        /// <summary>
        /// The IP address of the customer endpoint that will receive tunnel health checks.
        /// </summary>
        [Output("healthCheckTarget")]
        public Output<string> HealthCheckTarget { get; private set; } = null!;

        /// <summary>
        /// Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
        /// </summary>
        [Output("healthCheckType")]
        public Output<string> HealthCheckType { get; private set; } = null!;

        /// <summary>
        /// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
        /// </summary>
        [Output("interfaceAddress")]
        public Output<string> InterfaceAddress { get; private set; } = null!;

        /// <summary>
        /// Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
        /// </summary>
        [Output("mtu")]
        public Output<int> Mtu { get; private set; } = null!;

        /// <summary>
        /// Name of the GRE tunnel.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Time To Live (TTL) in number of hops of the GRE tunnel.
        /// </summary>
        [Output("ttl")]
        public Output<int> Ttl { get; private set; } = null!;


        /// <summary>
        /// Create a GreTunnel resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GreTunnel(string name, GreTunnelArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/greTunnel:GreTunnel", name, args ?? new GreTunnelArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GreTunnel(string name, Input<string> id, GreTunnelState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/greTunnel:GreTunnel", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GreTunnel resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GreTunnel Get(string name, Input<string> id, GreTunnelState? state = null, CustomResourceOptions? options = null)
        {
            return new GreTunnel(name, id, state, options);
        }
    }

    public sealed class GreTunnelArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The IP address assigned to the Cloudflare side of the GRE tunnel.
        /// </summary>
        [Input("cloudflareGreEndpoint", required: true)]
        public Input<string> CloudflareGreEndpoint { get; set; } = null!;

        /// <summary>
        /// The IP address assigned to the customer side of the GRE tunnel.
        /// </summary>
        [Input("customerGreEndpoint", required: true)]
        public Input<string> CustomerGreEndpoint { get; set; } = null!;

        /// <summary>
        /// Description of the GRE tunnel intent.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Specifies if ICMP tunnel health checks are enabled.
        /// </summary>
        [Input("healthCheckEnabled")]
        public Input<bool>? HealthCheckEnabled { get; set; }

        /// <summary>
        /// The IP address of the customer endpoint that will receive tunnel health checks.
        /// </summary>
        [Input("healthCheckTarget")]
        public Input<string>? HealthCheckTarget { get; set; }

        /// <summary>
        /// Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
        /// </summary>
        [Input("healthCheckType")]
        public Input<string>? HealthCheckType { get; set; }

        /// <summary>
        /// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
        /// </summary>
        [Input("interfaceAddress", required: true)]
        public Input<string> InterfaceAddress { get; set; } = null!;

        /// <summary>
        /// Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
        /// </summary>
        [Input("mtu")]
        public Input<int>? Mtu { get; set; }

        /// <summary>
        /// Name of the GRE tunnel.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Time To Live (TTL) in number of hops of the GRE tunnel.
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        public GreTunnelArgs()
        {
        }
        public static new GreTunnelArgs Empty => new GreTunnelArgs();
    }

    public sealed class GreTunnelState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The IP address assigned to the Cloudflare side of the GRE tunnel.
        /// </summary>
        [Input("cloudflareGreEndpoint")]
        public Input<string>? CloudflareGreEndpoint { get; set; }

        /// <summary>
        /// The IP address assigned to the customer side of the GRE tunnel.
        /// </summary>
        [Input("customerGreEndpoint")]
        public Input<string>? CustomerGreEndpoint { get; set; }

        /// <summary>
        /// Description of the GRE tunnel intent.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Specifies if ICMP tunnel health checks are enabled.
        /// </summary>
        [Input("healthCheckEnabled")]
        public Input<bool>? HealthCheckEnabled { get; set; }

        /// <summary>
        /// The IP address of the customer endpoint that will receive tunnel health checks.
        /// </summary>
        [Input("healthCheckTarget")]
        public Input<string>? HealthCheckTarget { get; set; }

        /// <summary>
        /// Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
        /// </summary>
        [Input("healthCheckType")]
        public Input<string>? HealthCheckType { get; set; }

        /// <summary>
        /// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
        /// </summary>
        [Input("interfaceAddress")]
        public Input<string>? InterfaceAddress { get; set; }

        /// <summary>
        /// Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
        /// </summary>
        [Input("mtu")]
        public Input<int>? Mtu { get; set; }

        /// <summary>
        /// Name of the GRE tunnel.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Time To Live (TTL) in number of hops of the GRE tunnel.
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        public GreTunnelState()
        {
        }
        public static new GreTunnelState Empty => new GreTunnelState();
    }
}

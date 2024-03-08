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
    /// Provides a Cloudflare Spectrum Application. You can extend the power
    /// of Cloudflare's DDoS, TLS, and IP Firewall to your other TCP-based
    /// services.
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
    ///     var example = new Cloudflare.SpectrumApplication("example", new()
    ///     {
    ///         Dns = new Cloudflare.Inputs.SpectrumApplicationDnsArgs
    ///         {
    ///             Name = "ssh.example.com",
    ///             Type = "CNAME",
    ///         },
    ///         EdgeIps = new Cloudflare.Inputs.SpectrumApplicationEdgeIpsArgs
    ///         {
    ///             Ips = new[]
    ///             {
    ///                 "203.0.113.1",
    ///                 "203.0.113.2",
    ///             },
    ///             Type = "static",
    ///         },
    ///         OriginDirects = new[]
    ///         {
    ///             "tcp://192.0.2.1:22",
    ///         },
    ///         Protocol = "tcp/22",
    ///         TrafficType = "direct",
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/spectrumApplication:SpectrumApplication example &lt;zone_id&gt;/&lt;spectrum_application_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/spectrumApplication:SpectrumApplication")]
    public partial class SpectrumApplication : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Enables Argo Smart Routing.
        /// </summary>
        [Output("argoSmartRouting")]
        public Output<bool> ArgoSmartRouting { get; private set; } = null!;

        /// <summary>
        /// The name and type of DNS record for the Spectrum application.
        /// </summary>
        [Output("dns")]
        public Output<Outputs.SpectrumApplicationDns> Dns { get; private set; } = null!;

        /// <summary>
        /// The anycast edge IP configuration for the hostname of this application.
        /// </summary>
        [Output("edgeIps")]
        public Output<Outputs.SpectrumApplicationEdgeIps> EdgeIps { get; private set; } = null!;

        /// <summary>
        /// Enables the IP Firewall for this application.
        /// </summary>
        [Output("ipFirewall")]
        public Output<bool> IpFirewall { get; private set; } = null!;

        /// <summary>
        /// A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
        /// </summary>
        [Output("originDirects")]
        public Output<ImmutableArray<string>> OriginDirects { get; private set; } = null!;

        /// <summary>
        /// A destination DNS addresses to the origin.
        /// </summary>
        [Output("originDns")]
        public Output<Outputs.SpectrumApplicationOriginDns?> OriginDns { get; private set; } = null!;

        /// <summary>
        /// Origin port to proxy traffice to. Conflicts with `origin_port_range`.
        /// </summary>
        [Output("originPort")]
        public Output<int?> OriginPort { get; private set; } = null!;

        /// <summary>
        /// Origin port range to proxy traffice to. When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Conflicts with `origin_port`.
        /// </summary>
        [Output("originPortRange")]
        public Output<Outputs.SpectrumApplicationOriginPortRange?> OriginPortRange { get; private set; } = null!;

        /// <summary>
        /// The port configuration at Cloudflare's edge. e.g. `tcp/22`.
        /// </summary>
        [Output("protocol")]
        public Output<string> Protocol { get; private set; } = null!;

        /// <summary>
        /// Enables a proxy protocol to the origin. Available values: `off`, `v1`, `v2`, `simple`.
        /// </summary>
        [Output("proxyProtocol")]
        public Output<string> ProxyProtocol { get; private set; } = null!;

        /// <summary>
        /// TLS configuration option for Cloudflare to connect to your origin. Available values: `off`, `flexible`, `full`, `strict`.
        /// </summary>
        [Output("tls")]
        public Output<string> Tls { get; private set; } = null!;

        /// <summary>
        /// Sets application type. Available values: `direct`, `http`, `https`.
        /// </summary>
        [Output("trafficType")]
        public Output<string> TrafficType { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a SpectrumApplication resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SpectrumApplication(string name, SpectrumApplicationArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/spectrumApplication:SpectrumApplication", name, args ?? new SpectrumApplicationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SpectrumApplication(string name, Input<string> id, SpectrumApplicationState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/spectrumApplication:SpectrumApplication", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SpectrumApplication resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SpectrumApplication Get(string name, Input<string> id, SpectrumApplicationState? state = null, CustomResourceOptions? options = null)
        {
            return new SpectrumApplication(name, id, state, options);
        }
    }

    public sealed class SpectrumApplicationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enables Argo Smart Routing.
        /// </summary>
        [Input("argoSmartRouting")]
        public Input<bool>? ArgoSmartRouting { get; set; }

        /// <summary>
        /// The name and type of DNS record for the Spectrum application.
        /// </summary>
        [Input("dns", required: true)]
        public Input<Inputs.SpectrumApplicationDnsArgs> Dns { get; set; } = null!;

        /// <summary>
        /// The anycast edge IP configuration for the hostname of this application.
        /// </summary>
        [Input("edgeIps")]
        public Input<Inputs.SpectrumApplicationEdgeIpsArgs>? EdgeIps { get; set; }

        /// <summary>
        /// Enables the IP Firewall for this application.
        /// </summary>
        [Input("ipFirewall")]
        public Input<bool>? IpFirewall { get; set; }

        [Input("originDirects")]
        private InputList<string>? _originDirects;

        /// <summary>
        /// A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
        /// </summary>
        public InputList<string> OriginDirects
        {
            get => _originDirects ?? (_originDirects = new InputList<string>());
            set => _originDirects = value;
        }

        /// <summary>
        /// A destination DNS addresses to the origin.
        /// </summary>
        [Input("originDns")]
        public Input<Inputs.SpectrumApplicationOriginDnsArgs>? OriginDns { get; set; }

        /// <summary>
        /// Origin port to proxy traffice to. Conflicts with `origin_port_range`.
        /// </summary>
        [Input("originPort")]
        public Input<int>? OriginPort { get; set; }

        /// <summary>
        /// Origin port range to proxy traffice to. When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Conflicts with `origin_port`.
        /// </summary>
        [Input("originPortRange")]
        public Input<Inputs.SpectrumApplicationOriginPortRangeArgs>? OriginPortRange { get; set; }

        /// <summary>
        /// The port configuration at Cloudflare's edge. e.g. `tcp/22`.
        /// </summary>
        [Input("protocol", required: true)]
        public Input<string> Protocol { get; set; } = null!;

        /// <summary>
        /// Enables a proxy protocol to the origin. Available values: `off`, `v1`, `v2`, `simple`.
        /// </summary>
        [Input("proxyProtocol")]
        public Input<string>? ProxyProtocol { get; set; }

        /// <summary>
        /// TLS configuration option for Cloudflare to connect to your origin. Available values: `off`, `flexible`, `full`, `strict`.
        /// </summary>
        [Input("tls")]
        public Input<string>? Tls { get; set; }

        /// <summary>
        /// Sets application type. Available values: `direct`, `http`, `https`.
        /// </summary>
        [Input("trafficType")]
        public Input<string>? TrafficType { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public SpectrumApplicationArgs()
        {
        }
        public static new SpectrumApplicationArgs Empty => new SpectrumApplicationArgs();
    }

    public sealed class SpectrumApplicationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enables Argo Smart Routing.
        /// </summary>
        [Input("argoSmartRouting")]
        public Input<bool>? ArgoSmartRouting { get; set; }

        /// <summary>
        /// The name and type of DNS record for the Spectrum application.
        /// </summary>
        [Input("dns")]
        public Input<Inputs.SpectrumApplicationDnsGetArgs>? Dns { get; set; }

        /// <summary>
        /// The anycast edge IP configuration for the hostname of this application.
        /// </summary>
        [Input("edgeIps")]
        public Input<Inputs.SpectrumApplicationEdgeIpsGetArgs>? EdgeIps { get; set; }

        /// <summary>
        /// Enables the IP Firewall for this application.
        /// </summary>
        [Input("ipFirewall")]
        public Input<bool>? IpFirewall { get; set; }

        [Input("originDirects")]
        private InputList<string>? _originDirects;

        /// <summary>
        /// A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
        /// </summary>
        public InputList<string> OriginDirects
        {
            get => _originDirects ?? (_originDirects = new InputList<string>());
            set => _originDirects = value;
        }

        /// <summary>
        /// A destination DNS addresses to the origin.
        /// </summary>
        [Input("originDns")]
        public Input<Inputs.SpectrumApplicationOriginDnsGetArgs>? OriginDns { get; set; }

        /// <summary>
        /// Origin port to proxy traffice to. Conflicts with `origin_port_range`.
        /// </summary>
        [Input("originPort")]
        public Input<int>? OriginPort { get; set; }

        /// <summary>
        /// Origin port range to proxy traffice to. When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Conflicts with `origin_port`.
        /// </summary>
        [Input("originPortRange")]
        public Input<Inputs.SpectrumApplicationOriginPortRangeGetArgs>? OriginPortRange { get; set; }

        /// <summary>
        /// The port configuration at Cloudflare's edge. e.g. `tcp/22`.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// Enables a proxy protocol to the origin. Available values: `off`, `v1`, `v2`, `simple`.
        /// </summary>
        [Input("proxyProtocol")]
        public Input<string>? ProxyProtocol { get; set; }

        /// <summary>
        /// TLS configuration option for Cloudflare to connect to your origin. Available values: `off`, `flexible`, `full`, `strict`.
        /// </summary>
        [Input("tls")]
        public Input<string>? Tls { get; set; }

        /// <summary>
        /// Sets application type. Available values: `direct`, `http`, `https`.
        /// </summary>
        [Input("trafficType")]
        public Input<string>? TrafficType { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public SpectrumApplicationState()
        {
        }
        public static new SpectrumApplicationState Empty => new SpectrumApplicationState();
    }
}

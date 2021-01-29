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
    /// Provides a Cloudflare Spectrum Application. You can extend the power of Cloudflare's DDoS, TLS, and IP Firewall to your other TCP-based services.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Define a spectrum application proxies ssh traffic
    ///         var sshProxy = new Cloudflare.SpectrumApplication("sshProxy", new Cloudflare.SpectrumApplicationArgs
    ///         {
    ///             ZoneId = @var.Cloudflare_zone_id,
    ///             Protocol = "tcp/22",
    ///             TrafficType = "direct",
    ///             Dns = new Cloudflare.Inputs.SpectrumApplicationDnsArgs
    ///             {
    ///                 Type = "CNAME",
    ///                 Name = "ssh.example.com",
    ///             },
    ///             OriginDirects = 
    ///             {
    ///                 "tcp://109.151.40.129:22",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Spectrum resource can be imported using a zone ID and Application ID, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/spectrumApplication:SpectrumApplication example d41d8cd98f00b204e9800998ecf8427e/9a7806061c88ada191ed06f989cc3dac
    /// ```
    /// 
    ///  where* `d41d8cd98f00b204e9800998ecf8427e` - zone ID, as returned from [API](https://api.cloudflare.com/#zone-list-zones) * `9a7806061c88ada191ed06f989cc3dac` - Application ID
    /// </summary>
    [CloudflareResourceType("cloudflare:index/spectrumApplication:SpectrumApplication")]
    public partial class SpectrumApplication : Pulumi.CustomResource
    {
        /// <summary>
        /// . Enables Argo Smart Routing. Defaults to `false`.
        /// </summary>
        [Output("argoSmartRouting")]
        public Output<bool?> ArgoSmartRouting { get; private set; } = null!;

        /// <summary>
        /// The name and type of DNS record for the Spectrum application. Fields documented below.
        /// </summary>
        [Output("dns")]
        public Output<Outputs.SpectrumApplicationDns> Dns { get; private set; } = null!;

        /// <summary>
        /// . Choose which types of IP addresses will be provisioned for this subdomain. Valid values are: `all`, `ipv4`, `ipv6`. Defaults to `all`.
        /// </summary>
        [Output("edgeIpConnectivity")]
        public Output<string?> EdgeIpConnectivity { get; private set; } = null!;

        /// <summary>
        /// . A list of edge IPs (IPv4 and/or IPv6) to configure Spectrum application to. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
        /// </summary>
        [Output("edgeIps")]
        public Output<ImmutableArray<string>> EdgeIps { get; private set; } = null!;

        /// <summary>
        /// Enables the IP Firewall for this application. Defaults to `true`.
        /// </summary>
        [Output("ipFirewall")]
        public Output<bool?> IpFirewall { get; private set; } = null!;

        /// <summary>
        /// A list of destination addresses to the origin. e.g. `tcp://192.0.2.1:22`.
        /// </summary>
        [Output("originDirects")]
        public Output<ImmutableArray<string>> OriginDirects { get; private set; } = null!;

        /// <summary>
        /// A destination DNS addresses to the origin. Fields documented below.
        /// </summary>
        [Output("originDns")]
        public Output<Outputs.SpectrumApplicationOriginDns?> OriginDns { get; private set; } = null!;

        /// <summary>
        /// If using `origin_dns` and not `origin_port_range`, this is a required attribute. Origin port to proxy traffice to e.g. `22`.
        /// </summary>
        [Output("originPort")]
        public Output<int?> OriginPort { get; private set; } = null!;

        /// <summary>
        /// If using `origin_dns` and not `origin_port`, this is a required attribute. Origin port range to proxy traffice to.  When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Fields documented below.
        /// </summary>
        [Output("originPortRange")]
        public Output<Outputs.SpectrumApplicationOriginPortRange?> OriginPortRange { get; private set; } = null!;

        /// <summary>
        /// The port configuration at Cloudflare’s edge. e.g. `tcp/22`.
        /// </summary>
        [Output("protocol")]
        public Output<string> Protocol { get; private set; } = null!;

        /// <summary>
        /// Enables a proxy protocol to the origin. Valid values are: `off`, `v1`, `v2`, and `simple`. Defaults to `off`.
        /// </summary>
        [Output("proxyProtocol")]
        public Output<string?> ProxyProtocol { get; private set; } = null!;

        /// <summary>
        /// TLS configuration option for Cloudflare to connect to your origin. Valid values are: `off`, `flexible`, `full` and `strict`. Defaults to `off`.
        /// </summary>
        [Output("tls")]
        public Output<string?> Tls { get; private set; } = null!;

        /// <summary>
        /// Sets application type. Valid values are: `direct`, `http`, `https`.  Defaults to `direct`.
        /// </summary>
        [Output("trafficType")]
        public Output<string?> TrafficType { get; private set; } = null!;

        /// <summary>
        /// The DNS zone ID to add the application to
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

    public sealed class SpectrumApplicationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// . Enables Argo Smart Routing. Defaults to `false`.
        /// </summary>
        [Input("argoSmartRouting")]
        public Input<bool>? ArgoSmartRouting { get; set; }

        /// <summary>
        /// The name and type of DNS record for the Spectrum application. Fields documented below.
        /// </summary>
        [Input("dns", required: true)]
        public Input<Inputs.SpectrumApplicationDnsArgs> Dns { get; set; } = null!;

        /// <summary>
        /// . Choose which types of IP addresses will be provisioned for this subdomain. Valid values are: `all`, `ipv4`, `ipv6`. Defaults to `all`.
        /// </summary>
        [Input("edgeIpConnectivity")]
        public Input<string>? EdgeIpConnectivity { get; set; }

        [Input("edgeIps")]
        private InputList<string>? _edgeIps;

        /// <summary>
        /// . A list of edge IPs (IPv4 and/or IPv6) to configure Spectrum application to. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
        /// </summary>
        public InputList<string> EdgeIps
        {
            get => _edgeIps ?? (_edgeIps = new InputList<string>());
            set => _edgeIps = value;
        }

        /// <summary>
        /// Enables the IP Firewall for this application. Defaults to `true`.
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
        /// A destination DNS addresses to the origin. Fields documented below.
        /// </summary>
        [Input("originDns")]
        public Input<Inputs.SpectrumApplicationOriginDnsArgs>? OriginDns { get; set; }

        /// <summary>
        /// If using `origin_dns` and not `origin_port_range`, this is a required attribute. Origin port to proxy traffice to e.g. `22`.
        /// </summary>
        [Input("originPort")]
        public Input<int>? OriginPort { get; set; }

        /// <summary>
        /// If using `origin_dns` and not `origin_port`, this is a required attribute. Origin port range to proxy traffice to.  When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Fields documented below.
        /// </summary>
        [Input("originPortRange")]
        public Input<Inputs.SpectrumApplicationOriginPortRangeArgs>? OriginPortRange { get; set; }

        /// <summary>
        /// The port configuration at Cloudflare’s edge. e.g. `tcp/22`.
        /// </summary>
        [Input("protocol", required: true)]
        public Input<string> Protocol { get; set; } = null!;

        /// <summary>
        /// Enables a proxy protocol to the origin. Valid values are: `off`, `v1`, `v2`, and `simple`. Defaults to `off`.
        /// </summary>
        [Input("proxyProtocol")]
        public Input<string>? ProxyProtocol { get; set; }

        /// <summary>
        /// TLS configuration option for Cloudflare to connect to your origin. Valid values are: `off`, `flexible`, `full` and `strict`. Defaults to `off`.
        /// </summary>
        [Input("tls")]
        public Input<string>? Tls { get; set; }

        /// <summary>
        /// Sets application type. Valid values are: `direct`, `http`, `https`.  Defaults to `direct`.
        /// </summary>
        [Input("trafficType")]
        public Input<string>? TrafficType { get; set; }

        /// <summary>
        /// The DNS zone ID to add the application to
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public SpectrumApplicationArgs()
        {
        }
    }

    public sealed class SpectrumApplicationState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// . Enables Argo Smart Routing. Defaults to `false`.
        /// </summary>
        [Input("argoSmartRouting")]
        public Input<bool>? ArgoSmartRouting { get; set; }

        /// <summary>
        /// The name and type of DNS record for the Spectrum application. Fields documented below.
        /// </summary>
        [Input("dns")]
        public Input<Inputs.SpectrumApplicationDnsGetArgs>? Dns { get; set; }

        /// <summary>
        /// . Choose which types of IP addresses will be provisioned for this subdomain. Valid values are: `all`, `ipv4`, `ipv6`. Defaults to `all`.
        /// </summary>
        [Input("edgeIpConnectivity")]
        public Input<string>? EdgeIpConnectivity { get; set; }

        [Input("edgeIps")]
        private InputList<string>? _edgeIps;

        /// <summary>
        /// . A list of edge IPs (IPv4 and/or IPv6) to configure Spectrum application to. Requires [Bring Your Own IP](https://developers.cloudflare.com/spectrum/getting-started/byoip/) provisioned.
        /// </summary>
        public InputList<string> EdgeIps
        {
            get => _edgeIps ?? (_edgeIps = new InputList<string>());
            set => _edgeIps = value;
        }

        /// <summary>
        /// Enables the IP Firewall for this application. Defaults to `true`.
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
        /// A destination DNS addresses to the origin. Fields documented below.
        /// </summary>
        [Input("originDns")]
        public Input<Inputs.SpectrumApplicationOriginDnsGetArgs>? OriginDns { get; set; }

        /// <summary>
        /// If using `origin_dns` and not `origin_port_range`, this is a required attribute. Origin port to proxy traffice to e.g. `22`.
        /// </summary>
        [Input("originPort")]
        public Input<int>? OriginPort { get; set; }

        /// <summary>
        /// If using `origin_dns` and not `origin_port`, this is a required attribute. Origin port range to proxy traffice to.  When using a range, the protocol field must also specify a range, e.g. `tcp/22-23`. Fields documented below.
        /// </summary>
        [Input("originPortRange")]
        public Input<Inputs.SpectrumApplicationOriginPortRangeGetArgs>? OriginPortRange { get; set; }

        /// <summary>
        /// The port configuration at Cloudflare’s edge. e.g. `tcp/22`.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// Enables a proxy protocol to the origin. Valid values are: `off`, `v1`, `v2`, and `simple`. Defaults to `off`.
        /// </summary>
        [Input("proxyProtocol")]
        public Input<string>? ProxyProtocol { get; set; }

        /// <summary>
        /// TLS configuration option for Cloudflare to connect to your origin. Valid values are: `off`, `flexible`, `full` and `strict`. Defaults to `off`.
        /// </summary>
        [Input("tls")]
        public Input<string>? Tls { get; set; }

        /// <summary>
        /// Sets application type. Valid values are: `direct`, `http`, `https`.  Defaults to `direct`.
        /// </summary>
        [Input("trafficType")]
        public Input<string>? TrafficType { get; set; }

        /// <summary>
        /// The DNS zone ID to add the application to
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public SpectrumApplicationState()
        {
        }
    }
}

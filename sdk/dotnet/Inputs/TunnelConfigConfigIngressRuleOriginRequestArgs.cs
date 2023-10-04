// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class TunnelConfigConfigIngressRuleOriginRequestArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Access rules for the ingress service.
        /// </summary>
        [Input("access")]
        public Input<Inputs.TunnelConfigConfigIngressRuleOriginRequestAccessArgs>? Access { get; set; }

        /// <summary>
        /// Runs as jump host.
        /// </summary>
        [Input("bastionMode")]
        public Input<bool>? BastionMode { get; set; }

        /// <summary>
        /// Path to the certificate authority (CA) for the certificate of your origin. This option should be used only if your certificate is not signed by Cloudflare. Defaults to `""`.
        /// </summary>
        [Input("caPool")]
        public Input<string>? CaPool { get; set; }

        /// <summary>
        /// Timeout for establishing a new TCP connection to your origin server. This excludes the time taken to establish TLS, which is controlled by `tlsTimeout`. Defaults to `30s`.
        /// </summary>
        [Input("connectTimeout")]
        public Input<string>? ConnectTimeout { get; set; }

        /// <summary>
        /// Disables chunked transfer encoding. Useful if you are running a Web Server Gateway Interface (WSGI) server. Defaults to `false`.
        /// </summary>
        [Input("disableChunkedEncoding")]
        public Input<bool>? DisableChunkedEncoding { get; set; }

        /// <summary>
        /// Enables HTTP/2 support for the origin connection. Defaults to `false`.
        /// </summary>
        [Input("http2Origin")]
        public Input<bool>? Http2Origin { get; set; }

        /// <summary>
        /// Sets the HTTP Host header on requests sent to the local service. Defaults to `""`.
        /// </summary>
        [Input("httpHostHeader")]
        public Input<string>? HttpHostHeader { get; set; }

        [Input("ipRules")]
        private InputList<Inputs.TunnelConfigConfigIngressRuleOriginRequestIpRuleArgs>? _ipRules;

        /// <summary>
        /// IP rules for the proxy service.
        /// </summary>
        public InputList<Inputs.TunnelConfigConfigIngressRuleOriginRequestIpRuleArgs> IpRules
        {
            get => _ipRules ?? (_ipRules = new InputList<Inputs.TunnelConfigConfigIngressRuleOriginRequestIpRuleArgs>());
            set => _ipRules = value;
        }

        /// <summary>
        /// Maximum number of idle keepalive connections between Tunnel and your origin. This does not restrict the total number of concurrent connections. Defaults to `100`.
        /// </summary>
        [Input("keepAliveConnections")]
        public Input<int>? KeepAliveConnections { get; set; }

        /// <summary>
        /// Timeout after which an idle keepalive connection can be discarded. Defaults to `1m30s`.
        /// </summary>
        [Input("keepAliveTimeout")]
        public Input<string>? KeepAliveTimeout { get; set; }

        /// <summary>
        /// Disable the “happy eyeballs” algorithm for IPv4/IPv6 fallback if your local network has misconfigured one of the protocols. Defaults to `false`.
        /// </summary>
        [Input("noHappyEyeballs")]
        public Input<bool>? NoHappyEyeballs { get; set; }

        /// <summary>
        /// Disables TLS verification of the certificate presented by your origin. Will allow any certificate from the origin to be accepted. Defaults to `false`.
        /// </summary>
        [Input("noTlsVerify")]
        public Input<bool>? NoTlsVerify { get; set; }

        /// <summary>
        /// Hostname that cloudflared should expect from your origin server certificate. Defaults to `""`.
        /// </summary>
        [Input("originServerName")]
        public Input<string>? OriginServerName { get; set; }

        /// <summary>
        /// cloudflared starts a proxy server to translate HTTP traffic into TCP when proxying, for example, SSH or RDP. This configures the listen address for that proxy. Defaults to `127.0.0.1`.
        /// </summary>
        [Input("proxyAddress")]
        public Input<string>? ProxyAddress { get; set; }

        /// <summary>
        /// cloudflared starts a proxy server to translate HTTP traffic into TCP when proxying, for example, SSH or RDP. This configures the listen port for that proxy. If set to zero, an unused port will randomly be chosen. Defaults to `0`.
        /// </summary>
        [Input("proxyPort")]
        public Input<int>? ProxyPort { get; set; }

        /// <summary>
        /// cloudflared starts a proxy server to translate HTTP traffic into TCP when proxying, for example, SSH or RDP. This configures what type of proxy will be started. Available values: `""`, `socks`. Defaults to `""`.
        /// </summary>
        [Input("proxyType")]
        public Input<string>? ProxyType { get; set; }

        /// <summary>
        /// The timeout after which a TCP keepalive packet is sent on a connection between Tunnel and the origin server. Defaults to `30s`.
        /// </summary>
        [Input("tcpKeepAlive")]
        public Input<string>? TcpKeepAlive { get; set; }

        /// <summary>
        /// Timeout for completing a TLS handshake to your origin server, if you have chosen to connect Tunnel to an HTTPS server. Defaults to `10s`.
        /// </summary>
        [Input("tlsTimeout")]
        public Input<string>? TlsTimeout { get; set; }

        public TunnelConfigConfigIngressRuleOriginRequestArgs()
        {
        }
        public static new TunnelConfigConfigIngressRuleOriginRequestArgs Empty => new TunnelConfigConfigIngressRuleOriginRequestArgs();
    }
}

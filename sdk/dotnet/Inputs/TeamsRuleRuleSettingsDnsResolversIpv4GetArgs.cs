// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class TeamsRuleRuleSettingsDnsResolversIpv4GetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IPv4 or IPv6 address of the upstream resolver.
        /// </summary>
        [Input("ip", required: true)]
        public Input<string> Ip { get; set; } = null!;

        /// <summary>
        /// A port number to use for the upstream resolver. Defaults to `53`.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Whether to connect to this resolver over a private network. Must be set when `vnet_id` is set.
        /// </summary>
        [Input("routeThroughPrivateNetwork")]
        public Input<bool>? RouteThroughPrivateNetwork { get; set; }

        /// <summary>
        /// specify a virtual network for this resolver. Uses default virtual network id if omitted.
        /// </summary>
        [Input("vnetId")]
        public Input<string>? VnetId { get; set; }

        public TeamsRuleRuleSettingsDnsResolversIpv4GetArgs()
        {
        }
        public static new TeamsRuleRuleSettingsDnsResolversIpv4GetArgs Empty => new TeamsRuleRuleSettingsDnsResolversIpv4GetArgs();
    }
}

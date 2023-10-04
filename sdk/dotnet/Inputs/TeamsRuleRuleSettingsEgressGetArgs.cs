// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class TeamsRuleRuleSettingsEgressGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IPv4 address to be used for egress.
        /// </summary>
        [Input("ipv4", required: true)]
        public Input<string> Ipv4 { get; set; } = null!;

        /// <summary>
        /// The IPv4 address to be used for egress in the event of an error egressing with the primary IPv4. Can be '0.0.0.0' to indicate local egreass via Warp IPs.
        /// </summary>
        [Input("ipv4Fallback")]
        public Input<string>? Ipv4Fallback { get; set; }

        /// <summary>
        /// The IPv6 range to be used for egress.
        /// </summary>
        [Input("ipv6", required: true)]
        public Input<string> Ipv6 { get; set; } = null!;

        public TeamsRuleRuleSettingsEgressGetArgs()
        {
        }
        public static new TeamsRuleRuleSettingsEgressGetArgs Empty => new TeamsRuleRuleSettingsEgressGetArgs();
    }
}

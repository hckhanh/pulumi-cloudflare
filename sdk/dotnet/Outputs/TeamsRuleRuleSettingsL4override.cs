// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class TeamsRuleRuleSettingsL4override
    {
        /// <summary>
        /// The IPv4 or IPv6 address of the upstream resolver.
        /// </summary>
        public readonly string Ip;
        /// <summary>
        /// A port number to use for the upstream resolver. Defaults to `53`.
        /// </summary>
        public readonly int Port;

        [OutputConstructor]
        private TeamsRuleRuleSettingsL4override(
            string ip,

            int port)
        {
            Ip = ip;
            Port = port;
        }
    }
}

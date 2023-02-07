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
    public sealed class TeamsAccountProxy
    {
        /// <summary>
        /// Whether gateway proxy is enabled on gateway devices for TCP traffic.
        /// </summary>
        public readonly bool Tcp;
        /// <summary>
        /// Whether gateway proxy is enabled on gateway devices for UDP traffic.
        /// </summary>
        public readonly bool Udp;

        [OutputConstructor]
        private TeamsAccountProxy(
            bool tcp,

            bool udp)
        {
            Tcp = tcp;
            Udp = udp;
        }
    }
}

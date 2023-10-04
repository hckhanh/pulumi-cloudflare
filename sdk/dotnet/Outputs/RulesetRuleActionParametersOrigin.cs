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
    public sealed class RulesetRuleActionParametersOrigin
    {
        /// <summary>
        /// Host parameters for the custom key.
        /// </summary>
        public readonly string? Host;
        /// <summary>
        /// Origin Port where request is sent.
        /// </summary>
        public readonly int? Port;

        [OutputConstructor]
        private RulesetRuleActionParametersOrigin(
            string? host,

            int? port)
        {
            Host = host;
            Port = port;
        }
    }
}

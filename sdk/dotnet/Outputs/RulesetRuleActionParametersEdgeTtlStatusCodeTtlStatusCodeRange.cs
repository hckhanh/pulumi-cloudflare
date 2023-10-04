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
    public sealed class RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRange
    {
        /// <summary>
        /// From status code.
        /// </summary>
        public readonly int? From;
        /// <summary>
        /// To status code.
        /// </summary>
        public readonly int? To;

        [OutputConstructor]
        private RulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRange(
            int? from,

            int? to)
        {
            From = from;
            To = to;
        }
    }
}

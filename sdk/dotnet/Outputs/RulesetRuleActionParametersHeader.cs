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
    public sealed class RulesetRuleActionParametersHeader
    {
        /// <summary>
        /// Use a value dynamically determined by the Firewall Rules expression language based on Wireshark display filters. Refer to the [Firewall Rules language](https://developers.cloudflare.com/firewall/cf-firewall-language) documentation for all available fields, operators, and functions.
        /// </summary>
        public readonly string? Expression;
        /// <summary>
        /// Name of the compression algorithm to use. Available values: `gzip`, `brotli`, `auto`, `default`, `none`
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Action to perform on the HTTP request header. Available values: `remove`, `set`, `add`.
        /// </summary>
        public readonly string? Operation;
        /// <summary>
        /// Status code edge TTL value.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private RulesetRuleActionParametersHeader(
            string? expression,

            string? name,

            string? operation,

            string? value)
        {
            Expression = expression;
            Name = name;
            Operation = operation;
            Value = value;
        }
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleActionParametersMatchedDataArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Public key to use within WAF Ruleset payload logging to view the HTTP request parameters. You can generate a public key [using the `matched-data-cli` command-line tool](https://developers.cloudflare.com/waf/managed-rulesets/payload-logging/command-line/generate-key-pair) or [in the Cloudflare dashboard](https://developers.cloudflare.com/waf/managed-rulesets/payload-logging/configure).
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        public RulesetRuleActionParametersMatchedDataArgs()
        {
        }
        public static new RulesetRuleActionParametersMatchedDataArgs Empty => new RulesetRuleActionParametersMatchedDataArgs();
    }
}

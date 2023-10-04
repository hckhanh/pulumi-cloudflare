// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleActionParametersBrowserTtlGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Default browser TTL. This value is required when override_origin is set
        /// </summary>
        [Input("default")]
        public Input<int>? Default { get; set; }

        /// <summary>
        /// Mode of the browser TTL. Available values: `override_origin`, `respect_origin`, `bypass`
        /// </summary>
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        public RulesetRuleActionParametersBrowserTtlGetArgs()
        {
        }
        public static new RulesetRuleActionParametersBrowserTtlGetArgs Empty => new RulesetRuleActionParametersBrowserTtlGetArgs();
    }
}

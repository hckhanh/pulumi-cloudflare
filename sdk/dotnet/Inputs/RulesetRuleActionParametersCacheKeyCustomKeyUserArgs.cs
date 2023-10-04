// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleActionParametersCacheKeyCustomKeyUserArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Add device type to the custom key.
        /// </summary>
        [Input("deviceType")]
        public Input<bool>? DeviceType { get; set; }

        /// <summary>
        /// Add geo data to the custom key.
        /// </summary>
        [Input("geo")]
        public Input<bool>? Geo { get; set; }

        /// <summary>
        /// Add language data to the custom key.
        /// </summary>
        [Input("lang")]
        public Input<bool>? Lang { get; set; }

        public RulesetRuleActionParametersCacheKeyCustomKeyUserArgs()
        {
        }
        public static new RulesetRuleActionParametersCacheKeyCustomKeyUserArgs Empty => new RulesetRuleActionParametersCacheKeyCustomKeyUserArgs();
    }
}

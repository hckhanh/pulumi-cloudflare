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
    public sealed class GetRulesetsRulesetRuleActionParametersCacheKeyResult
    {
        /// <summary>
        /// Cache by device type. Conflicts with "custom_key.user.device_type".
        /// </summary>
        public readonly bool? CacheByDeviceType;
        /// <summary>
        /// Cache deception armor.
        /// </summary>
        public readonly bool? CacheDeceptionArmor;
        /// <summary>
        /// Custom key parameters for the request.
        /// </summary>
        public readonly Outputs.GetRulesetsRulesetRuleActionParametersCacheKeyCustomKeyResult? CustomKey;
        /// <summary>
        /// Ignore query strings order.
        /// </summary>
        public readonly bool? IgnoreQueryStringsOrder;

        [OutputConstructor]
        private GetRulesetsRulesetRuleActionParametersCacheKeyResult(
            bool? cacheByDeviceType,

            bool? cacheDeceptionArmor,

            Outputs.GetRulesetsRulesetRuleActionParametersCacheKeyCustomKeyResult? customKey,

            bool? ignoreQueryStringsOrder)
        {
            CacheByDeviceType = cacheByDeviceType;
            CacheDeceptionArmor = cacheDeceptionArmor;
            CustomKey = customKey;
            IgnoreQueryStringsOrder = ignoreQueryStringsOrder;
        }
    }
}

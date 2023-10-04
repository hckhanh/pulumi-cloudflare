// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ApiTokenConditionRequestIpGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("ins")]
        private InputList<string>? _ins;

        /// <summary>
        /// List of IP addresses or CIDR notation where the token may be used from. If not specified, the token will be valid for all IP addresses.
        /// </summary>
        public InputList<string> Ins
        {
            get => _ins ?? (_ins = new InputList<string>());
            set => _ins = value;
        }

        [Input("notIns")]
        private InputList<string>? _notIns;

        /// <summary>
        /// List of IP addresses or CIDR notation where the token should not be used from.
        /// </summary>
        public InputList<string> NotIns
        {
            get => _notIns ?? (_notIns = new InputList<string>());
            set => _notIns = value;
        }

        public ApiTokenConditionRequestIpGetArgs()
        {
        }
        public static new ApiTokenConditionRequestIpGetArgs Empty => new ApiTokenConditionRequestIpGetArgs();
    }
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class LoadBalancerPoolOriginHeaderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// HTTP request headers.
        /// </summary>
        [Input("header", required: true)]
        public Input<string> Header { get; set; } = null!;

        [Input("values", required: true)]
        private InputList<string>? _values;

        /// <summary>
        /// Values for the HTTP headers.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public LoadBalancerPoolOriginHeaderArgs()
        {
        }
        public static new LoadBalancerPoolOriginHeaderArgs Empty => new LoadBalancerPoolOriginHeaderArgs();
    }
}

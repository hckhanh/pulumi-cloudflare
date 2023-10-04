// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ListItemValueHostnameGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The FQDN to match on. Wildcard sub-domain matching is allowed. Eg. *.abc.com.
        /// </summary>
        [Input("urlHostname", required: true)]
        public Input<string> UrlHostname { get; set; } = null!;

        public ListItemValueHostnameGetArgs()
        {
        }
        public static new ListItemValueHostnameGetArgs Empty => new ListItemValueHostnameGetArgs();
    }
}

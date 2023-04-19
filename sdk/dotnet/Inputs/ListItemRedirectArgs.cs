// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ListItemRedirectArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the redirect also matches subdomains of the source url. Available values: `disabled`, `enabled`.
        /// </summary>
        [Input("includeSubdomains")]
        public Input<string>? IncludeSubdomains { get; set; }

        /// <summary>
        /// Whether to preserve the path suffix when doing subpath matching. Available values: `disabled`, `enabled`.
        /// </summary>
        [Input("preservePathSuffix")]
        public Input<string>? PreservePathSuffix { get; set; }

        /// <summary>
        /// Whether the redirect target url should keep the query string of the request's url. Available values: `disabled`, `enabled`.
        /// </summary>
        [Input("preserveQueryString")]
        public Input<string>? PreserveQueryString { get; set; }

        /// <summary>
        /// The source url of the redirect.
        /// </summary>
        [Input("sourceUrl", required: true)]
        public Input<string> SourceUrl { get; set; } = null!;

        /// <summary>
        /// The status code to be used when redirecting a request.
        /// </summary>
        [Input("statusCode")]
        public Input<int>? StatusCode { get; set; }

        /// <summary>
        /// Whether the redirect also matches subpaths of the source url. Available values: `disabled`, `enabled`.
        /// </summary>
        [Input("subpathMatching")]
        public Input<string>? SubpathMatching { get; set; }

        /// <summary>
        /// The target url of the redirect.
        /// </summary>
        [Input("targetUrl", required: true)]
        public Input<string> TargetUrl { get; set; } = null!;

        public ListItemRedirectArgs()
        {
        }
        public static new ListItemRedirectArgs Empty => new ListItemRedirectArgs();
    }
}

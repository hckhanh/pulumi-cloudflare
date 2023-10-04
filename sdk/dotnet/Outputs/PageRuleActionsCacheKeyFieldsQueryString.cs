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
    public sealed class PageRuleActionsCacheKeyFieldsQueryString
    {
        /// <summary>
        /// Exclude these query string parameters from Cache Key.
        /// </summary>
        public readonly ImmutableArray<string> Excludes;
        /// <summary>
        /// `false` (default) - all query string parameters are used for Cache Key, unless explicitly excluded; `true` - all query string parameters are ignored; value should be `false` if any of `exclude` or `include` is non-empty.
        /// </summary>
        public readonly bool? Ignore;
        /// <summary>
        /// Only use values of specified query string parameters in Cache Key.
        /// </summary>
        public readonly ImmutableArray<string> Includes;

        [OutputConstructor]
        private PageRuleActionsCacheKeyFieldsQueryString(
            ImmutableArray<string> excludes,

            bool? ignore,

            ImmutableArray<string> includes)
        {
            Excludes = excludes;
            Ignore = ignore;
            Includes = includes;
        }
    }
}

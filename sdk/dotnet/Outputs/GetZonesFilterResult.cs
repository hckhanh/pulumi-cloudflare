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
    public sealed class GetZonesFilterResult
    {
        /// <summary>
        /// A regular expression matching the zone to lookup.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Paused status of the zone to lookup. Valid values are `true` or `false`.
        /// </summary>
        public readonly bool? Paused;
        /// <summary>
        /// Status of the zone to lookup. Valid values: active, pending, initializing, moved, deleted, deactivated and read only.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private GetZonesFilterResult(
            string? name,

            bool? paused,

            string? status)
        {
            Name = name;
            Paused = paused;
            Status = status;
        }
    }
}

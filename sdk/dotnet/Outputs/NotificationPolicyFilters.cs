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
    public sealed class NotificationPolicyFilters
    {
        /// <summary>
        /// State of the pool to alert on. Example: `"true"`, `"false"`.
        /// </summary>
        public readonly ImmutableArray<string> Enableds;
        /// <summary>
        /// Identifier health check.
        /// </summary>
        public readonly ImmutableArray<string> HealthCheckIds;
        /// <summary>
        /// A numerical limit. Example: `"100"`
        /// </summary>
        public readonly ImmutableArray<string> Limits;
        /// <summary>
        /// Load balancer pool identifier.
        /// </summary>
        public readonly ImmutableArray<string> PoolIds;
        /// <summary>
        /// Product name. Available values: `"worker_requests"`, `"worker_durable_objects_requests"`, `"worker_durable_objects_duration"`, `"worker_durable_objects_data_transfer"`, `"worker_durable_objects_stored_data"`, `"worker_durable_objects_storage_deletes"`, `"worker_durable_objects_storage_writes"`, `"worker_durable_objects_storage_reads"`.
        /// </summary>
        public readonly ImmutableArray<string> Products;
        public readonly ImmutableArray<string> Services;
        /// <summary>
        /// A numerical limit. Example: `"99.9"`
        /// </summary>
        public readonly ImmutableArray<string> Slos;
        /// <summary>
        /// Status to alert on. Example: `"Unhealthy"`, `"Healthy"`.
        /// </summary>
        public readonly ImmutableArray<string> Statuses;
        /// <summary>
        /// A list of zone identifiers.
        /// </summary>
        public readonly ImmutableArray<string> Zones;

        [OutputConstructor]
        private NotificationPolicyFilters(
            ImmutableArray<string> enableds,

            ImmutableArray<string> healthCheckIds,

            ImmutableArray<string> limits,

            ImmutableArray<string> poolIds,

            ImmutableArray<string> products,

            ImmutableArray<string> services,

            ImmutableArray<string> slos,

            ImmutableArray<string> statuses,

            ImmutableArray<string> zones)
        {
            Enableds = enableds;
            HealthCheckIds = healthCheckIds;
            Limits = limits;
            PoolIds = poolIds;
            Products = products;
            Services = services;
            Slos = slos;
            Statuses = statuses;
            Zones = zones;
        }
    }
}

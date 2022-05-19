// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class NotificationPolicyFiltersGetArgs : Pulumi.ResourceArgs
    {
        [Input("enableds")]
        private InputList<string>? _enableds;

        /// <summary>
        /// State of the pool to alert on. Example: `"true"`, `"false"`.
        /// </summary>
        public InputList<string> Enableds
        {
            get => _enableds ?? (_enableds = new InputList<string>());
            set => _enableds = value;
        }

        [Input("healthCheckIds")]
        private InputList<string>? _healthCheckIds;

        /// <summary>
        /// Identifier health check.
        /// </summary>
        public InputList<string> HealthCheckIds
        {
            get => _healthCheckIds ?? (_healthCheckIds = new InputList<string>());
            set => _healthCheckIds = value;
        }

        [Input("limits")]
        private InputList<string>? _limits;

        /// <summary>
        /// A numerical limit. Example: `"100"`
        /// </summary>
        public InputList<string> Limits
        {
            get => _limits ?? (_limits = new InputList<string>());
            set => _limits = value;
        }

        [Input("poolIds")]
        private InputList<string>? _poolIds;

        /// <summary>
        /// Load balancer pool identifier.
        /// </summary>
        public InputList<string> PoolIds
        {
            get => _poolIds ?? (_poolIds = new InputList<string>());
            set => _poolIds = value;
        }

        [Input("products")]
        private InputList<string>? _products;

        /// <summary>
        /// Product name. Available values: `"worker_requests"`, `"worker_durable_objects_requests"`, `"worker_durable_objects_duration"`, `"worker_durable_objects_data_transfer"`, `"worker_durable_objects_stored_data"`, `"worker_durable_objects_storage_deletes"`, `"worker_durable_objects_storage_writes"`, `"worker_durable_objects_storage_reads"`.
        /// </summary>
        public InputList<string> Products
        {
            get => _products ?? (_products = new InputList<string>());
            set => _products = value;
        }

        [Input("services")]
        private InputList<string>? _services;
        public InputList<string> Services
        {
            get => _services ?? (_services = new InputList<string>());
            set => _services = value;
        }

        [Input("slos")]
        private InputList<string>? _slos;

        /// <summary>
        /// A numerical limit. Example: `"99.9"`
        /// </summary>
        public InputList<string> Slos
        {
            get => _slos ?? (_slos = new InputList<string>());
            set => _slos = value;
        }

        [Input("statuses")]
        private InputList<string>? _statuses;

        /// <summary>
        /// Status to alert on. Example: `"Unhealthy"`, `"Healthy"`.
        /// </summary>
        public InputList<string> Statuses
        {
            get => _statuses ?? (_statuses = new InputList<string>());
            set => _statuses = value;
        }

        [Input("zones")]
        private InputList<string>? _zones;

        /// <summary>
        /// A list of zone identifiers.
        /// </summary>
        public InputList<string> Zones
        {
            get => _zones ?? (_zones = new InputList<string>());
            set => _zones = value;
        }

        public NotificationPolicyFiltersGetArgs()
        {
        }
    }
}

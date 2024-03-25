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
        /// Targeted actions for alert.
        /// </summary>
        public readonly ImmutableArray<string> Actions;
        /// <summary>
        /// Affected components for alert. Available values: `API`, `API Shield`, `Access`, `Always Online`, `Analytics`, `Apps Marketplace`, `Argo Smart Routing`, `Audit Logs`, `Authoritative DNS`, `Billing`, `Bot Management`, `Bring Your Own IP (BYOIP)`, `Browser Isolation`, `CDN Cache Purge`, `CDN/Cache`, `Cache Reserve`, `Challenge Platform`, `Cloud Access Security Broker (CASB)`, `Community Site`, `DNS Root Servers`, `DNS Updates`, `Dashboard`, `Data Loss Prevention (DLP)`, `Developer's Site`, `Digital Experience Monitoring (DEX)`, `Distributed Web Gateway`, `Durable Objects`, `Email Routing`, `Ethereum Gateway`, `Firewall`, `Gateway`, `Geo-Key Manager`, `Image Resizing`, `Images`, `Infrastructure`, `Lists`, `Load Balancing and Monitoring`, `Logs`, `Magic Firewall`, `Magic Transit`, `Magic WAN`, `Magic WAN Connector`, `Marketing Site`, `Mirage`, `Network`, `Notifications`, `Observatory`, `Page Shield`, `Pages`, `R2`, `Radar`, `Randomness Beacon`, `Recursive DNS`, `Registrar`, `Registration Data Access Protocol (RDAP)`, `SSL Certificate Provisioning`, `SSL for SaaS Provisioning`, `Security Center`, `Snippets`, `Spectrum`, `Speed Optimizations`, `Stream`, `Support Site`, `Time Services`, `Trace`, `Tunnel`, `Turnstile`, `WARP`, `Waiting Room`, `Web Analytics`, `Workers`, `Workers KV`, `Workers Preview`, `Zaraz`, `Zero Trust`, `Zero Trust Dashboard`, `Zone Versioning`.
        /// </summary>
        public readonly ImmutableArray<string> AffectedComponents;
        /// <summary>
        /// Filter on Points of Presence.
        /// </summary>
        public readonly ImmutableArray<string> AirportCodes;
        /// <summary>
        /// Alert trigger preferences. Example: `slo`.
        /// </summary>
        public readonly ImmutableArray<string> AlertTriggerPreferences;
        /// <summary>
        /// State of the pool to alert on.
        /// </summary>
        public readonly ImmutableArray<string> Enableds;
        /// <summary>
        /// Environment of pages. Available values: `ENVIRONMENT_PREVIEW`, `ENVIRONMENT_PRODUCTION`.
        /// </summary>
        public readonly ImmutableArray<string> Environments;
        /// <summary>
        /// Source configuration to alert on for pool or origin.
        /// </summary>
        public readonly ImmutableArray<string> EventSources;
        /// <summary>
        /// Stream event type to alert on.
        /// </summary>
        public readonly ImmutableArray<string> EventTypes;
        /// <summary>
        /// Pages event to alert. Available values: `EVENT_DEPLOYMENT_STARTED`, `EVENT_DEPLOYMENT_FAILED`, `EVENT_DEPLOYMENT_SUCCESS`.
        /// </summary>
        public readonly ImmutableArray<string> Events;
        /// <summary>
        /// Alert grouping.
        /// </summary>
        public readonly ImmutableArray<string> GroupBies;
        /// <summary>
        /// Identifier health check. Required when using `filters.0.status`.
        /// </summary>
        public readonly ImmutableArray<string> HealthCheckIds;
        /// <summary>
        /// The incident impact level that will trigger the dispatch of a notification. Available values: `INCIDENT_IMPACT_NONE`, `INCIDENT_IMPACT_MINOR`, `INCIDENT_IMPACT_MAJOR`, `INCIDENT_IMPACT_CRITICAL`.
        /// </summary>
        public readonly ImmutableArray<string> IncidentImpacts;
        /// <summary>
        /// Stream input id to alert on.
        /// </summary>
        public readonly ImmutableArray<string> InputIds;
        /// <summary>
        /// A numerical limit. Example: `100`.
        /// </summary>
        public readonly ImmutableArray<string> Limits;
        /// <summary>
        /// Megabits per second threshold for dos alert.
        /// </summary>
        public readonly ImmutableArray<string> MegabitsPerSeconds;
        /// <summary>
        /// Health status to alert on for pool or origin.
        /// </summary>
        public readonly ImmutableArray<string> NewHealths;
        /// <summary>
        /// Tunnel health status to alert on.
        /// </summary>
        public readonly ImmutableArray<string> NewStatuses;
        /// <summary>
        /// Packets per second threshold for dos alert.
        /// </summary>
        public readonly ImmutableArray<string> PacketsPerSeconds;
        /// <summary>
        /// Load balancer pool identifier.
        /// </summary>
        public readonly ImmutableArray<string> PoolIds;
        /// <summary>
        /// Product name. Available values: `worker_requests`, `worker_durable_objects_requests`, `worker_durable_objects_duration`, `worker_durable_objects_data_transfer`, `worker_durable_objects_stored_data`, `worker_durable_objects_storage_deletes`, `worker_durable_objects_storage_writes`, `worker_durable_objects_storage_reads`.
        /// </summary>
        public readonly ImmutableArray<string> Products;
        /// <summary>
        /// Identifier of pages project.
        /// </summary>
        public readonly ImmutableArray<string> ProjectIds;
        /// <summary>
        /// Protocol to alert on for dos.
        /// </summary>
        public readonly ImmutableArray<string> Protocols;
        /// <summary>
        /// Requests per second threshold for dos alert.
        /// </summary>
        public readonly ImmutableArray<string> RequestsPerSeconds;
        /// <summary>
        /// Selectors for alert. Valid options depend on the alert type.
        /// </summary>
        public readonly ImmutableArray<string> Selectors;
        public readonly ImmutableArray<string> Services;
        /// <summary>
        /// A numerical limit. Example: `99.9`.
        /// </summary>
        public readonly ImmutableArray<string> Slos;
        /// <summary>
        /// Status to alert on.
        /// </summary>
        public readonly ImmutableArray<string> Statuses;
        /// <summary>
        /// Target host to alert on for dos.
        /// </summary>
        public readonly ImmutableArray<string> TargetHostnames;
        /// <summary>
        /// Target domain to alert on.
        /// </summary>
        public readonly ImmutableArray<string> TargetZoneNames;
        /// <summary>
        /// Tunnel IDs to alert on.
        /// </summary>
        public readonly ImmutableArray<string> TunnelIds;
        /// <summary>
        /// Filter for alert.
        /// </summary>
        public readonly ImmutableArray<string> Wheres;
        /// <summary>
        /// A list of zone identifiers.
        /// </summary>
        public readonly ImmutableArray<string> Zones;

        [OutputConstructor]
        private NotificationPolicyFilters(
            ImmutableArray<string> actions,

            ImmutableArray<string> affectedComponents,

            ImmutableArray<string> airportCodes,

            ImmutableArray<string> alertTriggerPreferences,

            ImmutableArray<string> enableds,

            ImmutableArray<string> environments,

            ImmutableArray<string> eventSources,

            ImmutableArray<string> eventTypes,

            ImmutableArray<string> events,

            ImmutableArray<string> groupBies,

            ImmutableArray<string> healthCheckIds,

            ImmutableArray<string> incidentImpacts,

            ImmutableArray<string> inputIds,

            ImmutableArray<string> limits,

            ImmutableArray<string> megabitsPerSeconds,

            ImmutableArray<string> newHealths,

            ImmutableArray<string> newStatuses,

            ImmutableArray<string> packetsPerSeconds,

            ImmutableArray<string> poolIds,

            ImmutableArray<string> products,

            ImmutableArray<string> projectIds,

            ImmutableArray<string> protocols,

            ImmutableArray<string> requestsPerSeconds,

            ImmutableArray<string> selectors,

            ImmutableArray<string> services,

            ImmutableArray<string> slos,

            ImmutableArray<string> statuses,

            ImmutableArray<string> targetHostnames,

            ImmutableArray<string> targetZoneNames,

            ImmutableArray<string> tunnelIds,

            ImmutableArray<string> wheres,

            ImmutableArray<string> zones)
        {
            Actions = actions;
            AffectedComponents = affectedComponents;
            AirportCodes = airportCodes;
            AlertTriggerPreferences = alertTriggerPreferences;
            Enableds = enableds;
            Environments = environments;
            EventSources = eventSources;
            EventTypes = eventTypes;
            Events = events;
            GroupBies = groupBies;
            HealthCheckIds = healthCheckIds;
            IncidentImpacts = incidentImpacts;
            InputIds = inputIds;
            Limits = limits;
            MegabitsPerSeconds = megabitsPerSeconds;
            NewHealths = newHealths;
            NewStatuses = newStatuses;
            PacketsPerSeconds = packetsPerSeconds;
            PoolIds = poolIds;
            Products = products;
            ProjectIds = projectIds;
            Protocols = protocols;
            RequestsPerSeconds = requestsPerSeconds;
            Selectors = selectors;
            Services = services;
            Slos = slos;
            Statuses = statuses;
            TargetHostnames = targetHostnames;
            TargetZoneNames = targetZoneNames;
            TunnelIds = tunnelIds;
            Wheres = wheres;
            Zones = zones;
        }
    }
}

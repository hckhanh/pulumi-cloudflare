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
    public sealed class TeamsRuleRuleSettings
    {
        /// <summary>
        /// Add custom headers to allowed requests in the form of key-value pairs.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? AddHeaders;
        /// <summary>
        /// Allow parent MSP accounts to enable bypass their children's rules.
        /// </summary>
        public readonly bool? AllowChildBypass;
        /// <summary>
        /// Settings for auditing SSH usage.
        /// </summary>
        public readonly Outputs.TeamsRuleRuleSettingsAuditSsh? AuditSsh;
        /// <summary>
        /// Configure how browser isolation behaves.
        /// </summary>
        public readonly Outputs.TeamsRuleRuleSettingsBisoAdminControls? BisoAdminControls;
        /// <summary>
        /// Indicator of block page enablement.
        /// </summary>
        public readonly bool? BlockPageEnabled;
        /// <summary>
        /// The displayed reason for a user being blocked.
        /// </summary>
        public readonly string? BlockPageReason;
        /// <summary>
        /// Allow child MSP accounts to bypass their parent's rule.
        /// </summary>
        public readonly bool? BypassParentRule;
        /// <summary>
        /// Configure how session check behaves.
        /// </summary>
        public readonly Outputs.TeamsRuleRuleSettingsCheckSession? CheckSession;
        /// <summary>
        /// Configure how Proxy traffic egresses. Can be set for rules with Egress action and Egress filter. Can be omitted to indicate local egress via Warp IPs.
        /// </summary>
        public readonly Outputs.TeamsRuleRuleSettingsEgress? Egress;
        /// <summary>
        /// Disable DNSSEC validation (must be Allow rule).
        /// </summary>
        public readonly bool? InsecureDisableDnssecValidation;
        /// <summary>
        /// Turns on IP category based filter on dns if the rule contains dns category checks.
        /// </summary>
        public readonly bool? IpCategories;
        /// <summary>
        /// Settings to forward layer 4 traffic.
        /// </summary>
        public readonly Outputs.TeamsRuleRuleSettingsL4override? L4override;
        /// <summary>
        /// The host to override matching DNS queries with.
        /// </summary>
        public readonly string? OverrideHost;
        /// <summary>
        /// The IPs to override matching DNS queries with.
        /// </summary>
        public readonly ImmutableArray<string> OverrideIps;
        /// <summary>
        /// Configure DLP Payload Logging settings for this rule.
        /// </summary>
        public readonly Outputs.TeamsRuleRuleSettingsPayloadLog? PayloadLog;
        /// <summary>
        /// Configure untrusted certificate settings for this rule.
        /// </summary>
        public readonly Outputs.TeamsRuleRuleSettingsUntrustedCert? UntrustedCert;

        [OutputConstructor]
        private TeamsRuleRuleSettings(
            ImmutableDictionary<string, string>? addHeaders,

            bool? allowChildBypass,

            Outputs.TeamsRuleRuleSettingsAuditSsh? auditSsh,

            Outputs.TeamsRuleRuleSettingsBisoAdminControls? bisoAdminControls,

            bool? blockPageEnabled,

            string? blockPageReason,

            bool? bypassParentRule,

            Outputs.TeamsRuleRuleSettingsCheckSession? checkSession,

            Outputs.TeamsRuleRuleSettingsEgress? egress,

            bool? insecureDisableDnssecValidation,

            bool? ipCategories,

            Outputs.TeamsRuleRuleSettingsL4override? l4override,

            string? overrideHost,

            ImmutableArray<string> overrideIps,

            Outputs.TeamsRuleRuleSettingsPayloadLog? payloadLog,

            Outputs.TeamsRuleRuleSettingsUntrustedCert? untrustedCert)
        {
            AddHeaders = addHeaders;
            AllowChildBypass = allowChildBypass;
            AuditSsh = auditSsh;
            BisoAdminControls = bisoAdminControls;
            BlockPageEnabled = blockPageEnabled;
            BlockPageReason = blockPageReason;
            BypassParentRule = bypassParentRule;
            CheckSession = checkSession;
            Egress = egress;
            InsecureDisableDnssecValidation = insecureDisableDnssecValidation;
            IpCategories = ipCategories;
            L4override = l4override;
            OverrideHost = overrideHost;
            OverrideIps = overrideIps;
            PayloadLog = payloadLog;
            UntrustedCert = untrustedCert;
        }
    }
}

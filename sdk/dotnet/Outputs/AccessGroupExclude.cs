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
    public sealed class AccessGroupExclude
    {
        public readonly bool? AnyValidServiceToken;
        public readonly string? AuthMethod;
        public readonly ImmutableArray<Outputs.AccessGroupExcludeAzure> Azures;
        public readonly bool? Certificate;
        public readonly string? CommonName;
        public readonly ImmutableArray<string> DevicePostures;
        public readonly ImmutableArray<string> EmailDomains;
        public readonly ImmutableArray<string> Emails;
        public readonly bool? Everyone;
        public readonly Outputs.AccessGroupExcludeExternalEvaluation? ExternalEvaluation;
        public readonly ImmutableArray<string> Geos;
        public readonly ImmutableArray<Outputs.AccessGroupExcludeGithub> Githubs;
        public readonly ImmutableArray<string> Groups;
        public readonly ImmutableArray<Outputs.AccessGroupExcludeGsuite> Gsuites;
        public readonly ImmutableArray<string> IpLists;
        public readonly ImmutableArray<string> Ips;
        public readonly ImmutableArray<string> LoginMethods;
        public readonly ImmutableArray<Outputs.AccessGroupExcludeOkta> Oktas;
        public readonly ImmutableArray<Outputs.AccessGroupExcludeSaml> Samls;
        public readonly ImmutableArray<string> ServiceTokens;

        [OutputConstructor]
        private AccessGroupExclude(
            bool? anyValidServiceToken,

            string? authMethod,

            ImmutableArray<Outputs.AccessGroupExcludeAzure> azures,

            bool? certificate,

            string? commonName,

            ImmutableArray<string> devicePostures,

            ImmutableArray<string> emailDomains,

            ImmutableArray<string> emails,

            bool? everyone,

            Outputs.AccessGroupExcludeExternalEvaluation? externalEvaluation,

            ImmutableArray<string> geos,

            ImmutableArray<Outputs.AccessGroupExcludeGithub> githubs,

            ImmutableArray<string> groups,

            ImmutableArray<Outputs.AccessGroupExcludeGsuite> gsuites,

            ImmutableArray<string> ipLists,

            ImmutableArray<string> ips,

            ImmutableArray<string> loginMethods,

            ImmutableArray<Outputs.AccessGroupExcludeOkta> oktas,

            ImmutableArray<Outputs.AccessGroupExcludeSaml> samls,

            ImmutableArray<string> serviceTokens)
        {
            AnyValidServiceToken = anyValidServiceToken;
            AuthMethod = authMethod;
            Azures = azures;
            Certificate = certificate;
            CommonName = commonName;
            DevicePostures = devicePostures;
            EmailDomains = emailDomains;
            Emails = emails;
            Everyone = everyone;
            ExternalEvaluation = externalEvaluation;
            Geos = geos;
            Githubs = githubs;
            Groups = groups;
            Gsuites = gsuites;
            IpLists = ipLists;
            Ips = ips;
            LoginMethods = loginMethods;
            Oktas = oktas;
            Samls = samls;
            ServiceTokens = serviceTokens;
        }
    }
}

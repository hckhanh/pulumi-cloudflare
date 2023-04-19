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
    public sealed class RulesetRuleActionParameterUri
    {
        public readonly bool Origin;
        public readonly ImmutableArray<Outputs.RulesetRuleActionParameterUriPath> Paths;
        public readonly ImmutableArray<Outputs.RulesetRuleActionParameterUriQuery> Queries;

        [OutputConstructor]
        private RulesetRuleActionParameterUri(
            bool origin,

            ImmutableArray<Outputs.RulesetRuleActionParameterUriPath> paths,

            ImmutableArray<Outputs.RulesetRuleActionParameterUriQuery> queries)
        {
            Origin = origin;
            Paths = paths;
            Queries = queries;
        }
    }
}

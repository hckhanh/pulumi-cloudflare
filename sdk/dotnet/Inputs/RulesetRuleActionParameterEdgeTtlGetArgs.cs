// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleActionParameterEdgeTtlGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("default", required: true)]
        public Input<int> Default { get; set; } = null!;

        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        [Input("statusCodeTtls", required: true)]
        private InputList<Inputs.RulesetRuleActionParameterEdgeTtlStatusCodeTtlGetArgs>? _statusCodeTtls;
        public InputList<Inputs.RulesetRuleActionParameterEdgeTtlStatusCodeTtlGetArgs> StatusCodeTtls
        {
            get => _statusCodeTtls ?? (_statusCodeTtls = new InputList<Inputs.RulesetRuleActionParameterEdgeTtlStatusCodeTtlGetArgs>());
            set => _statusCodeTtls = value;
        }

        public RulesetRuleActionParameterEdgeTtlGetArgs()
        {
        }
        public static new RulesetRuleActionParameterEdgeTtlGetArgs Empty => new RulesetRuleActionParameterEdgeTtlGetArgs();
    }
}

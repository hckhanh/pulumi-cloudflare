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
    public sealed class RulesetRuleExposedCredentialCheck
    {
        public readonly string PasswordExpression;
        public readonly string UsernameExpression;

        [OutputConstructor]
        private RulesetRuleExposedCredentialCheck(
            string passwordExpression,

            string usernameExpression)
        {
            PasswordExpression = passwordExpression;
            UsernameExpression = usernameExpression;
        }
    }
}

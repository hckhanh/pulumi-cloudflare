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
    public sealed class TeamsAccountExtendedEmailMatching
    {
        /// <summary>
        /// Whether e-mails should be matched on all variants of user emails (with + or . modifiers) in Firewall policies.
        /// </summary>
        public readonly bool Enabled;

        [OutputConstructor]
        private TeamsAccountExtendedEmailMatching(bool enabled)
        {
            Enabled = enabled;
        }
    }
}

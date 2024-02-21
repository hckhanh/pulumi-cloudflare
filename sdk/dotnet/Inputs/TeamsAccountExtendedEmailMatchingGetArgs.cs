// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class TeamsAccountExtendedEmailMatchingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether e-mails should be matched on all variants of user emails (with + or . modifiers) in Firewall policies.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public TeamsAccountExtendedEmailMatchingGetArgs()
        {
        }
        public static new TeamsAccountExtendedEmailMatchingGetArgs Empty => new TeamsAccountExtendedEmailMatchingGetArgs();
    }
}

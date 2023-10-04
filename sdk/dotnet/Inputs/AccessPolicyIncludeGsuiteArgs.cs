// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccessPolicyIncludeGsuiteArgs : global::Pulumi.ResourceArgs
    {
        [Input("emails")]
        private InputList<string>? _emails;
        public InputList<string> Emails
        {
            get => _emails ?? (_emails = new InputList<string>());
            set => _emails = value;
        }

        /// <summary>
        /// The ID of the Azure Identity provider.
        /// </summary>
        [Input("identityProviderId")]
        public Input<string>? IdentityProviderId { get; set; }

        public AccessPolicyIncludeGsuiteArgs()
        {
        }
        public static new AccessPolicyIncludeGsuiteArgs Empty => new AccessPolicyIncludeGsuiteArgs();
    }
}

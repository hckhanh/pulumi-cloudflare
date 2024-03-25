// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccessMutualTlsHostnameSettingsSettingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Request client certificates for this hostname in China. Can only be set to true if this zone is china network enabled.
        /// </summary>
        [Input("chinaNetwork")]
        public Input<bool>? ChinaNetwork { get; set; }

        /// <summary>
        /// Client Certificate Forwarding is a feature that takes the client cert provided by the eyeball to the edge, and forwards it to the origin as a HTTP header to allow logging on the origin.
        /// </summary>
        [Input("clientCertificateForwarding")]
        public Input<bool>? ClientCertificateForwarding { get; set; }

        /// <summary>
        /// The hostname that these settings apply to.
        /// </summary>
        [Input("hostname", required: true)]
        public Input<string> Hostname { get; set; } = null!;

        public AccessMutualTlsHostnameSettingsSettingArgs()
        {
        }
        public static new AccessMutualTlsHostnameSettingsSettingArgs Empty => new AccessMutualTlsHostnameSettingsSettingArgs();
    }
}

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
    public sealed class ZoneSettingsOverrideSettingsMobileRedirect
    {
        public readonly string MobileSubdomain;
        public readonly string Status;
        public readonly bool StripUri;

        [OutputConstructor]
        private ZoneSettingsOverrideSettingsMobileRedirect(
            string mobileSubdomain,

            string status,

            bool stripUri)
        {
            MobileSubdomain = mobileSubdomain;
            Status = status;
            StripUri = stripUri;
        }
    }
}

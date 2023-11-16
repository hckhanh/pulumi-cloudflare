// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// Provides a Cloudflare Zone resource. Zone is the basic resource for
    /// working with Cloudflare and is roughly equivalent to a domain name
    /// that the user purchases.
    /// 
    /// &gt; If you are attempting to sign up a subdomain of a zone you must first have Subdomain Support entitlement for your account.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Cloudflare.Zone("example", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         ZoneName = "example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/zone:Zone example &lt;zone_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/zone:Zone")]
    public partial class Zone : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Account ID to manage the zone resource in.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Whether to scan for DNS records on creation. Ignored after zone is created.
        /// </summary>
        [Output("jumpStart")]
        public Output<bool?> JumpStart { get; private set; } = null!;

        [Output("meta")]
        public Output<ImmutableDictionary<string, bool>> Meta { get; private set; } = null!;

        /// <summary>
        /// Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
        /// </summary>
        [Output("nameServers")]
        public Output<ImmutableArray<string>> NameServers { get; private set; } = null!;

        /// <summary>
        /// Whether this zone is paused (traffic bypasses Cloudflare). Defaults to `false`.
        /// </summary>
        [Output("paused")]
        public Output<bool?> Paused { get; private set; } = null!;

        /// <summary>
        /// The name of the commercial plan to apply to the zone. Available values: `free`, `lite`, `pro`, `pro_plus`, `business`, `enterprise`, `partners_free`, `partners_pro`, `partners_business`, `partners_enterprise`.
        /// </summary>
        [Output("plan")]
        public Output<string> Plan { get; private set; } = null!;

        /// <summary>
        /// Status of the zone. Available values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Available values: `full`, `partial`, `secondary`. Defaults to `full`.
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;

        /// <summary>
        /// List of Vanity Nameservers (if set).
        /// </summary>
        [Output("vanityNameServers")]
        public Output<ImmutableArray<string>> VanityNameServers { get; private set; } = null!;

        /// <summary>
        /// Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
        /// </summary>
        [Output("verificationKey")]
        public Output<string> VerificationKey { get; private set; } = null!;

        /// <summary>
        /// The DNS zone name which will be added. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zone")]
        public Output<string> ZoneName { get; private set; } = null!;


        /// <summary>
        /// Create a Zone resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Zone(string name, ZoneArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/zone:Zone", name, args ?? new ZoneArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Zone(string name, Input<string> id, ZoneState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/zone:Zone", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Zone resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Zone Get(string name, Input<string> id, ZoneState? state = null, CustomResourceOptions? options = null)
        {
            return new Zone(name, id, state, options);
        }
    }

    public sealed class ZoneArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account ID to manage the zone resource in.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Whether to scan for DNS records on creation. Ignored after zone is created.
        /// </summary>
        [Input("jumpStart")]
        public Input<bool>? JumpStart { get; set; }

        /// <summary>
        /// Whether this zone is paused (traffic bypasses Cloudflare). Defaults to `false`.
        /// </summary>
        [Input("paused")]
        public Input<bool>? Paused { get; set; }

        /// <summary>
        /// The name of the commercial plan to apply to the zone. Available values: `free`, `lite`, `pro`, `pro_plus`, `business`, `enterprise`, `partners_free`, `partners_pro`, `partners_business`, `partners_enterprise`.
        /// </summary>
        [Input("plan")]
        public Input<string>? Plan { get; set; }

        /// <summary>
        /// A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Available values: `full`, `partial`, `secondary`. Defaults to `full`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The DNS zone name which will be added. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zone", required: true)]
        public Input<string> ZoneName { get; set; } = null!;

        public ZoneArgs()
        {
        }
        public static new ZoneArgs Empty => new ZoneArgs();
    }

    public sealed class ZoneState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account ID to manage the zone resource in.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Whether to scan for DNS records on creation. Ignored after zone is created.
        /// </summary>
        [Input("jumpStart")]
        public Input<bool>? JumpStart { get; set; }

        [Input("meta")]
        private InputMap<bool>? _meta;
        public InputMap<bool> Meta
        {
            get => _meta ?? (_meta = new InputMap<bool>());
            set => _meta = value;
        }

        [Input("nameServers")]
        private InputList<string>? _nameServers;

        /// <summary>
        /// Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
        /// </summary>
        public InputList<string> NameServers
        {
            get => _nameServers ?? (_nameServers = new InputList<string>());
            set => _nameServers = value;
        }

        /// <summary>
        /// Whether this zone is paused (traffic bypasses Cloudflare). Defaults to `false`.
        /// </summary>
        [Input("paused")]
        public Input<bool>? Paused { get; set; }

        /// <summary>
        /// The name of the commercial plan to apply to the zone. Available values: `free`, `lite`, `pro`, `pro_plus`, `business`, `enterprise`, `partners_free`, `partners_pro`, `partners_business`, `partners_enterprise`.
        /// </summary>
        [Input("plan")]
        public Input<string>? Plan { get; set; }

        /// <summary>
        /// Status of the zone. Available values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Available values: `full`, `partial`, `secondary`. Defaults to `full`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("vanityNameServers")]
        private InputList<string>? _vanityNameServers;

        /// <summary>
        /// List of Vanity Nameservers (if set).
        /// </summary>
        public InputList<string> VanityNameServers
        {
            get => _vanityNameServers ?? (_vanityNameServers = new InputList<string>());
            set => _vanityNameServers = value;
        }

        /// <summary>
        /// Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
        /// </summary>
        [Input("verificationKey")]
        public Input<string>? VerificationKey { get; set; }

        /// <summary>
        /// The DNS zone name which will be added. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zone")]
        public Input<string>? ZoneName { get; set; }

        public ZoneState()
        {
        }
        public static new ZoneState Empty => new ZoneState();
    }
}

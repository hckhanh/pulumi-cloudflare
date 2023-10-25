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
    /// A Zero Trust organization defines the user login experience.
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/accessOrganization:AccessOrganization example &lt;account_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/accessOrganization:AccessOrganization")]
    public partial class AccessOrganization : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The unique subdomain assigned to your Zero Trust organization.
        /// </summary>
        [Output("authDomain")]
        public Output<string> AuthDomain { get; private set; } = null!;

        /// <summary>
        /// When set to true, users skip the identity provider selection step during login.
        /// </summary>
        [Output("autoRedirectToIdentity")]
        public Output<bool?> AutoRedirectToIdentity { get; private set; } = null!;

        /// <summary>
        /// Custom pages for your Zero Trust organization.
        /// </summary>
        [Output("customPages")]
        public Output<ImmutableArray<Outputs.AccessOrganizationCustomPage>> CustomPages { get; private set; } = null!;

        /// <summary>
        /// When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
        /// </summary>
        [Output("isUiReadOnly")]
        public Output<bool?> IsUiReadOnly { get; private set; } = null!;

        [Output("loginDesigns")]
        public Output<ImmutableArray<Outputs.AccessOrganizationLoginDesign>> LoginDesigns { get; private set; } = null!;

        /// <summary>
        /// The name of your Zero Trust organization.
        /// </summary>
        [Output("name")]
        public Output<string?> Name { get; private set; } = null!;

        /// <summary>
        /// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
        /// </summary>
        [Output("sessionDuration")]
        public Output<string?> SessionDuration { get; private set; } = null!;

        /// <summary>
        /// A description of the reason why the UI read only field is being toggled.
        /// </summary>
        [Output("uiReadOnlyToggleReason")]
        public Output<string?> UiReadOnlyToggleReason { get; private set; } = null!;

        /// <summary>
        /// The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
        /// </summary>
        [Output("userSeatExpirationInactiveTime")]
        public Output<string?> UserSeatExpirationInactiveTime { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a AccessOrganization resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessOrganization(string name, AccessOrganizationArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessOrganization:AccessOrganization", name, args ?? new AccessOrganizationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessOrganization(string name, Input<string> id, AccessOrganizationState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessOrganization:AccessOrganization", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccessOrganization resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessOrganization Get(string name, Input<string> id, AccessOrganizationState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessOrganization(name, id, state, options);
        }
    }

    public sealed class AccessOrganizationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The unique subdomain assigned to your Zero Trust organization.
        /// </summary>
        [Input("authDomain", required: true)]
        public Input<string> AuthDomain { get; set; } = null!;

        /// <summary>
        /// When set to true, users skip the identity provider selection step during login.
        /// </summary>
        [Input("autoRedirectToIdentity")]
        public Input<bool>? AutoRedirectToIdentity { get; set; }

        [Input("customPages")]
        private InputList<Inputs.AccessOrganizationCustomPageArgs>? _customPages;

        /// <summary>
        /// Custom pages for your Zero Trust organization.
        /// </summary>
        public InputList<Inputs.AccessOrganizationCustomPageArgs> CustomPages
        {
            get => _customPages ?? (_customPages = new InputList<Inputs.AccessOrganizationCustomPageArgs>());
            set => _customPages = value;
        }

        /// <summary>
        /// When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
        /// </summary>
        [Input("isUiReadOnly")]
        public Input<bool>? IsUiReadOnly { get; set; }

        [Input("loginDesigns")]
        private InputList<Inputs.AccessOrganizationLoginDesignArgs>? _loginDesigns;
        public InputList<Inputs.AccessOrganizationLoginDesignArgs> LoginDesigns
        {
            get => _loginDesigns ?? (_loginDesigns = new InputList<Inputs.AccessOrganizationLoginDesignArgs>());
            set => _loginDesigns = value;
        }

        /// <summary>
        /// The name of your Zero Trust organization.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
        /// </summary>
        [Input("sessionDuration")]
        public Input<string>? SessionDuration { get; set; }

        /// <summary>
        /// A description of the reason why the UI read only field is being toggled.
        /// </summary>
        [Input("uiReadOnlyToggleReason")]
        public Input<string>? UiReadOnlyToggleReason { get; set; }

        /// <summary>
        /// The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
        /// </summary>
        [Input("userSeatExpirationInactiveTime")]
        public Input<string>? UserSeatExpirationInactiveTime { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessOrganizationArgs()
        {
        }
        public static new AccessOrganizationArgs Empty => new AccessOrganizationArgs();
    }

    public sealed class AccessOrganizationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The unique subdomain assigned to your Zero Trust organization.
        /// </summary>
        [Input("authDomain")]
        public Input<string>? AuthDomain { get; set; }

        /// <summary>
        /// When set to true, users skip the identity provider selection step during login.
        /// </summary>
        [Input("autoRedirectToIdentity")]
        public Input<bool>? AutoRedirectToIdentity { get; set; }

        [Input("customPages")]
        private InputList<Inputs.AccessOrganizationCustomPageGetArgs>? _customPages;

        /// <summary>
        /// Custom pages for your Zero Trust organization.
        /// </summary>
        public InputList<Inputs.AccessOrganizationCustomPageGetArgs> CustomPages
        {
            get => _customPages ?? (_customPages = new InputList<Inputs.AccessOrganizationCustomPageGetArgs>());
            set => _customPages = value;
        }

        /// <summary>
        /// When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
        /// </summary>
        [Input("isUiReadOnly")]
        public Input<bool>? IsUiReadOnly { get; set; }

        [Input("loginDesigns")]
        private InputList<Inputs.AccessOrganizationLoginDesignGetArgs>? _loginDesigns;
        public InputList<Inputs.AccessOrganizationLoginDesignGetArgs> LoginDesigns
        {
            get => _loginDesigns ?? (_loginDesigns = new InputList<Inputs.AccessOrganizationLoginDesignGetArgs>());
            set => _loginDesigns = value;
        }

        /// <summary>
        /// The name of your Zero Trust organization.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
        /// </summary>
        [Input("sessionDuration")]
        public Input<string>? SessionDuration { get; set; }

        /// <summary>
        /// A description of the reason why the UI read only field is being toggled.
        /// </summary>
        [Input("uiReadOnlyToggleReason")]
        public Input<string>? UiReadOnlyToggleReason { get; set; }

        /// <summary>
        /// The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
        /// </summary>
        [Input("userSeatExpirationInactiveTime")]
        public Input<string>? UserSeatExpirationInactiveTime { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessOrganizationState()
        {
        }
        public static new AccessOrganizationState Empty => new AccessOrganizationState();
    }
}

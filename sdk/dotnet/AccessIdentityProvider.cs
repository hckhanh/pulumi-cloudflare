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
    /// Provides a Cloudflare Access Identity Provider resource. Identity
    /// Providers are used as an authentication or authorisation source
    /// within Access.
    /// 
    /// &gt; It's required that an `account_id` or `zone_id` is provided and in
    ///    most cases using either is fine. However, if you're using a scoped
    ///    access token, you must provide the argument that matches the token's
    ///    scope. For example, an access token that is scoped to the "example.com"
    ///    zone needs to use the `zone_id` argument.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // one time pin
    ///     var pinLogin = new Cloudflare.AccessIdentityProvider("pinLogin", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Name = "PIN login",
    ///         Type = "onetimepin",
    ///     });
    /// 
    ///     // oauth
    ///     var githubOauth = new Cloudflare.AccessIdentityProvider("githubOauth", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Configs = new[]
    ///         {
    ///             new Cloudflare.Inputs.AccessIdentityProviderConfigArgs
    ///             {
    ///                 ClientId = "example",
    ///                 ClientSecret = "secret_key",
    ///             },
    ///         },
    ///         Name = "GitHub OAuth",
    ///         Type = "github",
    ///     });
    /// 
    ///     // saml
    ///     var jumpcloudSaml = new Cloudflare.AccessIdentityProvider("jumpcloudSaml", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Configs = new[]
    ///         {
    ///             new Cloudflare.Inputs.AccessIdentityProviderConfigArgs
    ///             {
    ///                 Attributes = new[]
    ///                 {
    ///                     "email",
    ///                     "username",
    ///                 },
    ///                 IdpPublicCert = @"MIIDpDCCAoygAwIBAgIGAV2ka+55MA0GCSqGSIb3DQEBCwUAMIGSMQswCQ...GF/Q2/MHadws97cZg
    /// uTnQyuOqPuHbnN83d/2l1NSYKCbHt24o
    /// ",
    ///                 IssuerUrl = "jumpcloud",
    ///                 SignRequest = false,
    ///                 SsoTargetUrl = "https://sso.myexample.jumpcloud.com/saml2/cloudflareaccess",
    ///             },
    ///         },
    ///         Name = "JumpCloud SAML",
    ///         Type = "saml",
    ///     });
    /// 
    ///     // okta
    ///     var okta = new Cloudflare.AccessIdentityProvider("okta", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Configs = new[]
    ///         {
    ///             new Cloudflare.Inputs.AccessIdentityProviderConfigArgs
    ///             {
    ///                 ApiToken = "okta_api_token",
    ///                 ClientId = "example",
    ///                 ClientSecret = "secret_key",
    ///                 OktaAccount = "https://example.com",
    ///             },
    ///         },
    ///         Name = "Okta",
    ///         Type = "okta",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/accessIdentityProvider:AccessIdentityProvider example &lt;account_id&gt;/&lt;identity_provider_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/accessIdentityProvider:AccessIdentityProvider")]
    public partial class AccessIdentityProvider : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        /// <summary>
        /// Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
        /// </summary>
        [Output("configs")]
        public Output<ImmutableArray<Outputs.AccessIdentityProviderConfig>> Configs { get; private set; } = null!;

        /// <summary>
        /// Friendly name of the Access Identity Provider configuration.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Configuration for SCIM settings for a given IDP.
        /// </summary>
        [Output("scimConfigs")]
        public Output<ImmutableArray<Outputs.AccessIdentityProviderScimConfig>> ScimConfigs { get; private set; } = null!;

        /// <summary>
        /// The provider type to use. Available values: `azureAD`, `centrify`, `facebook`, `github`, `google`, `google-apps`, `linkedin`, `oidc`, `okta`, `onelogin`, `onetimepin`, `pingone`, `saml`, `yandex`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string?> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a AccessIdentityProvider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessIdentityProvider(string name, AccessIdentityProviderArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessIdentityProvider:AccessIdentityProvider", name, args ?? new AccessIdentityProviderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessIdentityProvider(string name, Input<string> id, AccessIdentityProviderState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessIdentityProvider:AccessIdentityProvider", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccessIdentityProvider resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessIdentityProvider Get(string name, Input<string> id, AccessIdentityProviderState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessIdentityProvider(name, id, state, options);
        }
    }

    public sealed class AccessIdentityProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("configs")]
        private InputList<Inputs.AccessIdentityProviderConfigArgs>? _configs;

        /// <summary>
        /// Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
        /// </summary>
        public InputList<Inputs.AccessIdentityProviderConfigArgs> Configs
        {
            get => _configs ?? (_configs = new InputList<Inputs.AccessIdentityProviderConfigArgs>());
            set => _configs = value;
        }

        /// <summary>
        /// Friendly name of the Access Identity Provider configuration.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("scimConfigs")]
        private InputList<Inputs.AccessIdentityProviderScimConfigArgs>? _scimConfigs;

        /// <summary>
        /// Configuration for SCIM settings for a given IDP.
        /// </summary>
        public InputList<Inputs.AccessIdentityProviderScimConfigArgs> ScimConfigs
        {
            get => _scimConfigs ?? (_scimConfigs = new InputList<Inputs.AccessIdentityProviderScimConfigArgs>());
            set => _scimConfigs = value;
        }

        /// <summary>
        /// The provider type to use. Available values: `azureAD`, `centrify`, `facebook`, `github`, `google`, `google-apps`, `linkedin`, `oidc`, `okta`, `onelogin`, `onetimepin`, `pingone`, `saml`, `yandex`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessIdentityProviderArgs()
        {
        }
        public static new AccessIdentityProviderArgs Empty => new AccessIdentityProviderArgs();
    }

    public sealed class AccessIdentityProviderState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("configs")]
        private InputList<Inputs.AccessIdentityProviderConfigGetArgs>? _configs;

        /// <summary>
        /// Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
        /// </summary>
        public InputList<Inputs.AccessIdentityProviderConfigGetArgs> Configs
        {
            get => _configs ?? (_configs = new InputList<Inputs.AccessIdentityProviderConfigGetArgs>());
            set => _configs = value;
        }

        /// <summary>
        /// Friendly name of the Access Identity Provider configuration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("scimConfigs")]
        private InputList<Inputs.AccessIdentityProviderScimConfigGetArgs>? _scimConfigs;

        /// <summary>
        /// Configuration for SCIM settings for a given IDP.
        /// </summary>
        public InputList<Inputs.AccessIdentityProviderScimConfigGetArgs> ScimConfigs
        {
            get => _scimConfigs ?? (_scimConfigs = new InputList<Inputs.AccessIdentityProviderScimConfigGetArgs>());
            set => _scimConfigs = value;
        }

        /// <summary>
        /// The provider type to use. Available values: `azureAD`, `centrify`, `facebook`, `github`, `google`, `google-apps`, `linkedin`, `oidc`, `okta`, `onelogin`, `onetimepin`, `pingone`, `saml`, `yandex`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessIdentityProviderState()
        {
        }
        public static new AccessIdentityProviderState Empty => new AccessIdentityProviderState();
    }
}

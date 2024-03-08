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
    /// Access Service Tokens are used for service-to-service communication
    /// when an application is behind Cloudflare Access.
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
    ///     // Generate a service token that will renew if terraform is ran within 30 days of expiration
    ///     var myApp = new Cloudflare.AccessServiceToken("myApp", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         MinDaysForRenewal = 30,
    ///         Name = "CI/CD app renewed",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// If you are importing an Access Service Token you will not have the
    /// 
    /// client_secret available in the state for use. The client_secret is only
    /// 
    /// available once, at creation. In most cases, it is better to just create a new
    /// 
    /// resource should you need to reference it in other resources.
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/accessServiceToken:AccessServiceToken example &lt;account_id&gt;/&lt;service_token_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/accessServiceToken:AccessServiceToken")]
    public partial class AccessServiceToken : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`.
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        /// <summary>
        /// Client ID associated with the Service Token. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("clientId")]
        public Output<string> ClientId { get; private set; } = null!;

        /// <summary>
        /// A secret for interacting with Access protocols. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("clientSecret")]
        public Output<string> ClientSecret { get; private set; } = null!;

        /// <summary>
        /// Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
        /// </summary>
        [Output("duration")]
        public Output<string> Duration { get; private set; } = null!;

        /// <summary>
        /// Date when the token expires.
        /// </summary>
        [Output("expiresAt")]
        public Output<string> ExpiresAt { get; private set; } = null!;

        /// <summary>
        /// Refresh the token if terraform is run within the specified amount of days before expiration.
        /// </summary>
        [Output("minDaysForRenewal")]
        public Output<int?> MinDaysForRenewal { get; private set; } = null!;

        /// <summary>
        /// Friendly name of the token's intent.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Output("zoneId")]
        public Output<string?> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a AccessServiceToken resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessServiceToken(string name, AccessServiceTokenArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessServiceToken:AccessServiceToken", name, args ?? new AccessServiceTokenArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessServiceToken(string name, Input<string> id, AccessServiceTokenState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessServiceToken:AccessServiceToken", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "clientSecret",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AccessServiceToken resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessServiceToken Get(string name, Input<string> id, AccessServiceTokenState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessServiceToken(name, id, state, options);
        }
    }

    public sealed class AccessServiceTokenArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
        /// </summary>
        [Input("duration")]
        public Input<string>? Duration { get; set; }

        /// <summary>
        /// Refresh the token if terraform is run within the specified amount of days before expiration.
        /// </summary>
        [Input("minDaysForRenewal")]
        public Input<int>? MinDaysForRenewal { get; set; }

        /// <summary>
        /// Friendly name of the token's intent.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessServiceTokenArgs()
        {
        }
        public static new AccessServiceTokenArgs Empty => new AccessServiceTokenArgs();
    }

    public sealed class AccessServiceTokenState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Client ID associated with the Service Token. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        [Input("clientSecret")]
        private Input<string>? _clientSecret;

        /// <summary>
        /// A secret for interacting with Access protocols. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        public Input<string>? ClientSecret
        {
            get => _clientSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clientSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
        /// </summary>
        [Input("duration")]
        public Input<string>? Duration { get; set; }

        /// <summary>
        /// Date when the token expires.
        /// </summary>
        [Input("expiresAt")]
        public Input<string>? ExpiresAt { get; set; }

        /// <summary>
        /// Refresh the token if terraform is run within the specified amount of days before expiration.
        /// </summary>
        [Input("minDaysForRenewal")]
        public Input<int>? MinDaysForRenewal { get; set; }

        /// <summary>
        /// Friendly name of the token's intent.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessServiceTokenState()
        {
        }
        public static new AccessServiceTokenState Empty => new AccessServiceTokenState();
    }
}

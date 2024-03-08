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
    /// Provides a Cloudflare Access Application resource. Access
    /// Applications are used to restrict access to a whole application using an
    /// authorisation gateway managed by Cloudflare.
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
    ///     // With CORS configuration
    ///     var stagingApp = new Cloudflare.AccessApplication("stagingApp", new()
    ///     {
    ///         CorsHeaders = new[]
    ///         {
    ///             new Cloudflare.Inputs.AccessApplicationCorsHeaderArgs
    ///             {
    ///                 AllowCredentials = true,
    ///                 AllowedMethods = new[]
    ///                 {
    ///                     "GET",
    ///                     "POST",
    ///                     "OPTIONS",
    ///                 },
    ///                 AllowedOrigins = new[]
    ///                 {
    ///                     "https://example.com",
    ///                 },
    ///                 MaxAge = 10,
    ///             },
    ///         },
    ///         Domain = "staging.example.com",
    ///         Name = "staging application",
    ///         SessionDuration = "24h",
    ///         Type = "self_hosted",
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/accessApplication:AccessApplication example &lt;account_id&gt;/&lt;application_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/accessApplication:AccessApplication")]
    public partial class AccessApplication : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// When set to true, users can authenticate to this application using their WARP session. When set to false this
        /// application will always require direct IdP authentication. This setting always overrides the organization setting for
        /// WARP authentication.
        /// </summary>
        [Output("allowAuthenticateViaWarp")]
        public Output<bool?> AllowAuthenticateViaWarp { get; private set; } = null!;

        /// <summary>
        /// The identity providers selected for the application.
        /// </summary>
        [Output("allowedIdps")]
        public Output<ImmutableArray<string>> AllowedIdps { get; private set; } = null!;

        /// <summary>
        /// The logo URL of the app launcher.
        /// </summary>
        [Output("appLauncherLogoUrl")]
        public Output<string?> AppLauncherLogoUrl { get; private set; } = null!;

        /// <summary>
        /// Option to show/hide applications in App Launcher. Defaults to `true`.
        /// </summary>
        [Output("appLauncherVisible")]
        public Output<bool?> AppLauncherVisible { get; private set; } = null!;

        /// <summary>
        /// Application Audience (AUD) Tag of the application.
        /// </summary>
        [Output("aud")]
        public Output<string> Aud { get; private set; } = null!;

        /// <summary>
        /// Option to skip identity provider selection if only one is configured in `allowed_idps`. Defaults to `false`.
        /// </summary>
        [Output("autoRedirectToIdentity")]
        public Output<bool?> AutoRedirectToIdentity { get; private set; } = null!;

        /// <summary>
        /// The background color of the app launcher.
        /// </summary>
        [Output("bgColor")]
        public Output<string?> BgColor { get; private set; } = null!;

        /// <summary>
        /// CORS configuration for the Access Application. See below for reference structure.
        /// </summary>
        [Output("corsHeaders")]
        public Output<ImmutableArray<Outputs.AccessApplicationCorsHeader>> CorsHeaders { get; private set; } = null!;

        /// <summary>
        /// Option that returns a custom error message when a user is denied access to the application.
        /// </summary>
        [Output("customDenyMessage")]
        public Output<string?> CustomDenyMessage { get; private set; } = null!;

        /// <summary>
        /// Option that redirects to a custom URL when a user is denied access to the application via identity based rules.
        /// </summary>
        [Output("customDenyUrl")]
        public Output<string?> CustomDenyUrl { get; private set; } = null!;

        /// <summary>
        /// Option that redirects to a custom URL when a user is denied access to the application via non identity rules.
        /// </summary>
        [Output("customNonIdentityDenyUrl")]
        public Output<string?> CustomNonIdentityDenyUrl { get; private set; } = null!;

        /// <summary>
        /// The custom pages selected for the application.
        /// </summary>
        [Output("customPages")]
        public Output<ImmutableArray<string>> CustomPages { get; private set; } = null!;

        /// <summary>
        /// The primary hostname and path that Access will secure. If the app is visible in the App Launcher dashboard, this is the domain that will be displayed.
        /// </summary>
        [Output("domain")]
        public Output<string> Domain { get; private set; } = null!;

        /// <summary>
        /// Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
        /// </summary>
        [Output("enableBindingCookie")]
        public Output<bool?> EnableBindingCookie { get; private set; } = null!;

        /// <summary>
        /// The footer links of the app launcher.
        /// </summary>
        [Output("footerLinks")]
        public Output<ImmutableArray<Outputs.AccessApplicationFooterLink>> FooterLinks { get; private set; } = null!;

        /// <summary>
        /// The background color of the header bar in the app launcher.
        /// </summary>
        [Output("headerBgColor")]
        public Output<string?> HeaderBgColor { get; private set; } = null!;

        /// <summary>
        /// Option to add the `HttpOnly` cookie flag to access tokens.
        /// </summary>
        [Output("httpOnlyCookieAttribute")]
        public Output<bool?> HttpOnlyCookieAttribute { get; private set; } = null!;

        /// <summary>
        /// The landing page design of the app launcher.
        /// </summary>
        [Output("landingPageDesign")]
        public Output<Outputs.AccessApplicationLandingPageDesign?> LandingPageDesign { get; private set; } = null!;

        /// <summary>
        /// Image URL for the logo shown in the app launcher dashboard.
        /// </summary>
        [Output("logoUrl")]
        public Output<string?> LogoUrl { get; private set; } = null!;

        /// <summary>
        /// The name of the footer link.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// SaaS configuration for the Access Application.
        /// </summary>
        [Output("saasApp")]
        public Output<Outputs.AccessApplicationSaasApp?> SaasApp { get; private set; } = null!;

        /// <summary>
        /// Defines the same-site cookie setting for access tokens. Available values: `none`, `lax`, `strict`.
        /// </summary>
        [Output("sameSiteCookieAttribute")]
        public Output<string?> SameSiteCookieAttribute { get; private set; } = null!;

        /// <summary>
        /// List of domains that access will secure. Only present for self_hosted, vnc, and ssh applications. Always includes the value set as `domain`.
        /// </summary>
        [Output("selfHostedDomains")]
        public Output<ImmutableArray<string>> SelfHostedDomains { get; private set; } = null!;

        /// <summary>
        /// Option to return a 401 status code in service authentication rules on failed requests. Defaults to `false`.
        /// </summary>
        [Output("serviceAuth401Redirect")]
        public Output<bool?> ServiceAuth401Redirect { get; private set; } = null!;

        /// <summary>
        /// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
        /// </summary>
        [Output("sessionDuration")]
        public Output<string?> SessionDuration { get; private set; } = null!;

        /// <summary>
        /// Option to skip the authorization interstitial when using the CLI. Defaults to `false`.
        /// </summary>
        [Output("skipInterstitial")]
        public Output<bool?> SkipInterstitial { get; private set; } = null!;

        /// <summary>
        /// The itags associated with the application.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// The application type. Available values: `app_launcher`, `bookmark`, `biso`, `dash_sso`, `saas`, `self_hosted`, `ssh`, `vnc`, `warp`. Defaults to `self_hosted`.
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a AccessApplication resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessApplication(string name, AccessApplicationArgs? args = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessApplication:AccessApplication", name, args ?? new AccessApplicationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessApplication(string name, Input<string> id, AccessApplicationState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessApplication:AccessApplication", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccessApplication resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessApplication Get(string name, Input<string> id, AccessApplicationState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessApplication(name, id, state, options);
        }
    }

    public sealed class AccessApplicationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// When set to true, users can authenticate to this application using their WARP session. When set to false this
        /// application will always require direct IdP authentication. This setting always overrides the organization setting for
        /// WARP authentication.
        /// </summary>
        [Input("allowAuthenticateViaWarp")]
        public Input<bool>? AllowAuthenticateViaWarp { get; set; }

        [Input("allowedIdps")]
        private InputList<string>? _allowedIdps;

        /// <summary>
        /// The identity providers selected for the application.
        /// </summary>
        public InputList<string> AllowedIdps
        {
            get => _allowedIdps ?? (_allowedIdps = new InputList<string>());
            set => _allowedIdps = value;
        }

        /// <summary>
        /// The logo URL of the app launcher.
        /// </summary>
        [Input("appLauncherLogoUrl")]
        public Input<string>? AppLauncherLogoUrl { get; set; }

        /// <summary>
        /// Option to show/hide applications in App Launcher. Defaults to `true`.
        /// </summary>
        [Input("appLauncherVisible")]
        public Input<bool>? AppLauncherVisible { get; set; }

        /// <summary>
        /// Option to skip identity provider selection if only one is configured in `allowed_idps`. Defaults to `false`.
        /// </summary>
        [Input("autoRedirectToIdentity")]
        public Input<bool>? AutoRedirectToIdentity { get; set; }

        /// <summary>
        /// The background color of the app launcher.
        /// </summary>
        [Input("bgColor")]
        public Input<string>? BgColor { get; set; }

        [Input("corsHeaders")]
        private InputList<Inputs.AccessApplicationCorsHeaderArgs>? _corsHeaders;

        /// <summary>
        /// CORS configuration for the Access Application. See below for reference structure.
        /// </summary>
        public InputList<Inputs.AccessApplicationCorsHeaderArgs> CorsHeaders
        {
            get => _corsHeaders ?? (_corsHeaders = new InputList<Inputs.AccessApplicationCorsHeaderArgs>());
            set => _corsHeaders = value;
        }

        /// <summary>
        /// Option that returns a custom error message when a user is denied access to the application.
        /// </summary>
        [Input("customDenyMessage")]
        public Input<string>? CustomDenyMessage { get; set; }

        /// <summary>
        /// Option that redirects to a custom URL when a user is denied access to the application via identity based rules.
        /// </summary>
        [Input("customDenyUrl")]
        public Input<string>? CustomDenyUrl { get; set; }

        /// <summary>
        /// Option that redirects to a custom URL when a user is denied access to the application via non identity rules.
        /// </summary>
        [Input("customNonIdentityDenyUrl")]
        public Input<string>? CustomNonIdentityDenyUrl { get; set; }

        [Input("customPages")]
        private InputList<string>? _customPages;

        /// <summary>
        /// The custom pages selected for the application.
        /// </summary>
        public InputList<string> CustomPages
        {
            get => _customPages ?? (_customPages = new InputList<string>());
            set => _customPages = value;
        }

        /// <summary>
        /// The primary hostname and path that Access will secure. If the app is visible in the App Launcher dashboard, this is the domain that will be displayed.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
        /// </summary>
        [Input("enableBindingCookie")]
        public Input<bool>? EnableBindingCookie { get; set; }

        [Input("footerLinks")]
        private InputList<Inputs.AccessApplicationFooterLinkArgs>? _footerLinks;

        /// <summary>
        /// The footer links of the app launcher.
        /// </summary>
        public InputList<Inputs.AccessApplicationFooterLinkArgs> FooterLinks
        {
            get => _footerLinks ?? (_footerLinks = new InputList<Inputs.AccessApplicationFooterLinkArgs>());
            set => _footerLinks = value;
        }

        /// <summary>
        /// The background color of the header bar in the app launcher.
        /// </summary>
        [Input("headerBgColor")]
        public Input<string>? HeaderBgColor { get; set; }

        /// <summary>
        /// Option to add the `HttpOnly` cookie flag to access tokens.
        /// </summary>
        [Input("httpOnlyCookieAttribute")]
        public Input<bool>? HttpOnlyCookieAttribute { get; set; }

        /// <summary>
        /// The landing page design of the app launcher.
        /// </summary>
        [Input("landingPageDesign")]
        public Input<Inputs.AccessApplicationLandingPageDesignArgs>? LandingPageDesign { get; set; }

        /// <summary>
        /// Image URL for the logo shown in the app launcher dashboard.
        /// </summary>
        [Input("logoUrl")]
        public Input<string>? LogoUrl { get; set; }

        /// <summary>
        /// The name of the footer link.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// SaaS configuration for the Access Application.
        /// </summary>
        [Input("saasApp")]
        public Input<Inputs.AccessApplicationSaasAppArgs>? SaasApp { get; set; }

        /// <summary>
        /// Defines the same-site cookie setting for access tokens. Available values: `none`, `lax`, `strict`.
        /// </summary>
        [Input("sameSiteCookieAttribute")]
        public Input<string>? SameSiteCookieAttribute { get; set; }

        [Input("selfHostedDomains")]
        private InputList<string>? _selfHostedDomains;

        /// <summary>
        /// List of domains that access will secure. Only present for self_hosted, vnc, and ssh applications. Always includes the value set as `domain`.
        /// </summary>
        public InputList<string> SelfHostedDomains
        {
            get => _selfHostedDomains ?? (_selfHostedDomains = new InputList<string>());
            set => _selfHostedDomains = value;
        }

        /// <summary>
        /// Option to return a 401 status code in service authentication rules on failed requests. Defaults to `false`.
        /// </summary>
        [Input("serviceAuth401Redirect")]
        public Input<bool>? ServiceAuth401Redirect { get; set; }

        /// <summary>
        /// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
        /// </summary>
        [Input("sessionDuration")]
        public Input<string>? SessionDuration { get; set; }

        /// <summary>
        /// Option to skip the authorization interstitial when using the CLI. Defaults to `false`.
        /// </summary>
        [Input("skipInterstitial")]
        public Input<bool>? SkipInterstitial { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The itags associated with the application.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The application type. Available values: `app_launcher`, `bookmark`, `biso`, `dash_sso`, `saas`, `self_hosted`, `ssh`, `vnc`, `warp`. Defaults to `self_hosted`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessApplicationArgs()
        {
        }
        public static new AccessApplicationArgs Empty => new AccessApplicationArgs();
    }

    public sealed class AccessApplicationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// When set to true, users can authenticate to this application using their WARP session. When set to false this
        /// application will always require direct IdP authentication. This setting always overrides the organization setting for
        /// WARP authentication.
        /// </summary>
        [Input("allowAuthenticateViaWarp")]
        public Input<bool>? AllowAuthenticateViaWarp { get; set; }

        [Input("allowedIdps")]
        private InputList<string>? _allowedIdps;

        /// <summary>
        /// The identity providers selected for the application.
        /// </summary>
        public InputList<string> AllowedIdps
        {
            get => _allowedIdps ?? (_allowedIdps = new InputList<string>());
            set => _allowedIdps = value;
        }

        /// <summary>
        /// The logo URL of the app launcher.
        /// </summary>
        [Input("appLauncherLogoUrl")]
        public Input<string>? AppLauncherLogoUrl { get; set; }

        /// <summary>
        /// Option to show/hide applications in App Launcher. Defaults to `true`.
        /// </summary>
        [Input("appLauncherVisible")]
        public Input<bool>? AppLauncherVisible { get; set; }

        /// <summary>
        /// Application Audience (AUD) Tag of the application.
        /// </summary>
        [Input("aud")]
        public Input<string>? Aud { get; set; }

        /// <summary>
        /// Option to skip identity provider selection if only one is configured in `allowed_idps`. Defaults to `false`.
        /// </summary>
        [Input("autoRedirectToIdentity")]
        public Input<bool>? AutoRedirectToIdentity { get; set; }

        /// <summary>
        /// The background color of the app launcher.
        /// </summary>
        [Input("bgColor")]
        public Input<string>? BgColor { get; set; }

        [Input("corsHeaders")]
        private InputList<Inputs.AccessApplicationCorsHeaderGetArgs>? _corsHeaders;

        /// <summary>
        /// CORS configuration for the Access Application. See below for reference structure.
        /// </summary>
        public InputList<Inputs.AccessApplicationCorsHeaderGetArgs> CorsHeaders
        {
            get => _corsHeaders ?? (_corsHeaders = new InputList<Inputs.AccessApplicationCorsHeaderGetArgs>());
            set => _corsHeaders = value;
        }

        /// <summary>
        /// Option that returns a custom error message when a user is denied access to the application.
        /// </summary>
        [Input("customDenyMessage")]
        public Input<string>? CustomDenyMessage { get; set; }

        /// <summary>
        /// Option that redirects to a custom URL when a user is denied access to the application via identity based rules.
        /// </summary>
        [Input("customDenyUrl")]
        public Input<string>? CustomDenyUrl { get; set; }

        /// <summary>
        /// Option that redirects to a custom URL when a user is denied access to the application via non identity rules.
        /// </summary>
        [Input("customNonIdentityDenyUrl")]
        public Input<string>? CustomNonIdentityDenyUrl { get; set; }

        [Input("customPages")]
        private InputList<string>? _customPages;

        /// <summary>
        /// The custom pages selected for the application.
        /// </summary>
        public InputList<string> CustomPages
        {
            get => _customPages ?? (_customPages = new InputList<string>());
            set => _customPages = value;
        }

        /// <summary>
        /// The primary hostname and path that Access will secure. If the app is visible in the App Launcher dashboard, this is the domain that will be displayed.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
        /// </summary>
        [Input("enableBindingCookie")]
        public Input<bool>? EnableBindingCookie { get; set; }

        [Input("footerLinks")]
        private InputList<Inputs.AccessApplicationFooterLinkGetArgs>? _footerLinks;

        /// <summary>
        /// The footer links of the app launcher.
        /// </summary>
        public InputList<Inputs.AccessApplicationFooterLinkGetArgs> FooterLinks
        {
            get => _footerLinks ?? (_footerLinks = new InputList<Inputs.AccessApplicationFooterLinkGetArgs>());
            set => _footerLinks = value;
        }

        /// <summary>
        /// The background color of the header bar in the app launcher.
        /// </summary>
        [Input("headerBgColor")]
        public Input<string>? HeaderBgColor { get; set; }

        /// <summary>
        /// Option to add the `HttpOnly` cookie flag to access tokens.
        /// </summary>
        [Input("httpOnlyCookieAttribute")]
        public Input<bool>? HttpOnlyCookieAttribute { get; set; }

        /// <summary>
        /// The landing page design of the app launcher.
        /// </summary>
        [Input("landingPageDesign")]
        public Input<Inputs.AccessApplicationLandingPageDesignGetArgs>? LandingPageDesign { get; set; }

        /// <summary>
        /// Image URL for the logo shown in the app launcher dashboard.
        /// </summary>
        [Input("logoUrl")]
        public Input<string>? LogoUrl { get; set; }

        /// <summary>
        /// The name of the footer link.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// SaaS configuration for the Access Application.
        /// </summary>
        [Input("saasApp")]
        public Input<Inputs.AccessApplicationSaasAppGetArgs>? SaasApp { get; set; }

        /// <summary>
        /// Defines the same-site cookie setting for access tokens. Available values: `none`, `lax`, `strict`.
        /// </summary>
        [Input("sameSiteCookieAttribute")]
        public Input<string>? SameSiteCookieAttribute { get; set; }

        [Input("selfHostedDomains")]
        private InputList<string>? _selfHostedDomains;

        /// <summary>
        /// List of domains that access will secure. Only present for self_hosted, vnc, and ssh applications. Always includes the value set as `domain`.
        /// </summary>
        public InputList<string> SelfHostedDomains
        {
            get => _selfHostedDomains ?? (_selfHostedDomains = new InputList<string>());
            set => _selfHostedDomains = value;
        }

        /// <summary>
        /// Option to return a 401 status code in service authentication rules on failed requests. Defaults to `false`.
        /// </summary>
        [Input("serviceAuth401Redirect")]
        public Input<bool>? ServiceAuth401Redirect { get; set; }

        /// <summary>
        /// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
        /// </summary>
        [Input("sessionDuration")]
        public Input<string>? SessionDuration { get; set; }

        /// <summary>
        /// Option to skip the authorization interstitial when using the CLI. Defaults to `false`.
        /// </summary>
        [Input("skipInterstitial")]
        public Input<bool>? SkipInterstitial { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The itags associated with the application.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The application type. Available values: `app_launcher`, `bookmark`, `biso`, `dash_sso`, `saas`, `self_hosted`, `ssh`, `vnc`, `warp`. Defaults to `self_hosted`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessApplicationState()
        {
        }
        public static new AccessApplicationState Empty => new AccessApplicationState();
    }
}

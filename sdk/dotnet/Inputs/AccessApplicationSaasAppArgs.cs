// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccessApplicationSaasAppArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The URL where this applications tile redirects users.
        /// </summary>
        [Input("appLauncherUrl")]
        public Input<string>? AppLauncherUrl { get; set; }

        [Input("authType")]
        public Input<string>? AuthType { get; set; }

        /// <summary>
        /// The application client id.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        [Input("clientSecret")]
        private Input<string>? _clientSecret;

        /// <summary>
        /// The application client secret, only returned on initial apply.
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
        /// The service provider's endpoint that is responsible for receiving and parsing a SAML assertion.
        /// </summary>
        [Input("consumerServiceUrl")]
        public Input<string>? ConsumerServiceUrl { get; set; }

        [Input("customAttributes")]
        private InputList<Inputs.AccessApplicationSaasAppCustomAttributeArgs>? _customAttributes;

        /// <summary>
        /// Custom attribute mapped from IDPs.
        /// </summary>
        public InputList<Inputs.AccessApplicationSaasAppCustomAttributeArgs> CustomAttributes
        {
            get => _customAttributes ?? (_customAttributes = new InputList<Inputs.AccessApplicationSaasAppCustomAttributeArgs>());
            set => _customAttributes = value;
        }

        /// <summary>
        /// The relay state used if not provided by the identity provider.
        /// </summary>
        [Input("defaultRelayState")]
        public Input<string>? DefaultRelayState { get; set; }

        [Input("grantTypes")]
        private InputList<string>? _grantTypes;

        /// <summary>
        /// The OIDC flows supported by this application.
        /// </summary>
        public InputList<string> GrantTypes
        {
            get => _grantTypes ?? (_grantTypes = new InputList<string>());
            set => _grantTypes = value;
        }

        /// <summary>
        /// A regex to filter Cloudflare groups returned in ID token and userinfo endpoint.
        /// </summary>
        [Input("groupFilterRegex")]
        public Input<string>? GroupFilterRegex { get; set; }

        /// <summary>
        /// The unique identifier for the SaaS application.
        /// </summary>
        [Input("idpEntityId")]
        public Input<string>? IdpEntityId { get; set; }

        /// <summary>
        /// The format of the name identifier sent to the SaaS application.
        /// </summary>
        [Input("nameIdFormat")]
        public Input<string>? NameIdFormat { get; set; }

        /// <summary>
        /// A [JSONata](https://jsonata.org/) expression that transforms an application's user identities into a NameID value for its SAML assertion. This expression should evaluate to a singular string. The output of this expression can override the `name_id_format` setting.
        /// </summary>
        [Input("nameIdTransformJsonata")]
        public Input<string>? NameIdTransformJsonata { get; set; }

        /// <summary>
        /// The public certificate that will be used to verify identities.
        /// </summary>
        [Input("publicKey")]
        public Input<string>? PublicKey { get; set; }

        [Input("redirectUris")]
        private InputList<string>? _redirectUris;

        /// <summary>
        /// The permitted URL's for Cloudflare to return Authorization codes and Access/ID tokens.
        /// </summary>
        public InputList<string> RedirectUris
        {
            get => _redirectUris ?? (_redirectUris = new InputList<string>());
            set => _redirectUris = value;
        }

        [Input("scopes")]
        private InputList<string>? _scopes;

        /// <summary>
        /// Define the user information shared with access.
        /// </summary>
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

        /// <summary>
        /// A globally unique name for an identity or service provider.
        /// </summary>
        [Input("spEntityId")]
        public Input<string>? SpEntityId { get; set; }

        /// <summary>
        /// The endpoint where the SaaS application will send login requests.
        /// </summary>
        [Input("ssoEndpoint")]
        public Input<string>? SsoEndpoint { get; set; }

        public AccessApplicationSaasAppArgs()
        {
        }
        public static new AccessApplicationSaasAppArgs Empty => new AccessApplicationSaasAppArgs();
    }
}

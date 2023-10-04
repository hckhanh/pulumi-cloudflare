// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class PagesProjectDeploymentConfigsPreviewGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Use latest compatibility date for Pages Functions. Defaults to `false`.
        /// </summary>
        [Input("alwaysUseLatestCompatibilityDate")]
        public Input<bool>? AlwaysUseLatestCompatibilityDate { get; set; }

        /// <summary>
        /// Compatibility date used for Pages Functions.
        /// </summary>
        [Input("compatibilityDate")]
        public Input<string>? CompatibilityDate { get; set; }

        [Input("compatibilityFlags")]
        private InputList<string>? _compatibilityFlags;

        /// <summary>
        /// Compatibility flags used for Pages Functions.
        /// </summary>
        public InputList<string> CompatibilityFlags
        {
            get => _compatibilityFlags ?? (_compatibilityFlags = new InputList<string>());
            set => _compatibilityFlags = value;
        }

        [Input("d1Databases")]
        private InputMap<object>? _d1Databases;

        /// <summary>
        /// D1 Databases used for Pages Functions. Defaults to `map[]`.
        /// </summary>
        public InputMap<object> D1Databases
        {
            get => _d1Databases ?? (_d1Databases = new InputMap<object>());
            set => _d1Databases = value;
        }

        [Input("durableObjectNamespaces")]
        private InputMap<object>? _durableObjectNamespaces;

        /// <summary>
        /// Durable Object namespaces used for Pages Functions. Defaults to `map[]`.
        /// </summary>
        public InputMap<object> DurableObjectNamespaces
        {
            get => _durableObjectNamespaces ?? (_durableObjectNamespaces = new InputMap<object>());
            set => _durableObjectNamespaces = value;
        }

        [Input("environmentVariables")]
        private InputMap<object>? _environmentVariables;

        /// <summary>
        /// Environment variables for Pages Functions. Defaults to `map[]`.
        /// </summary>
        public InputMap<object> EnvironmentVariables
        {
            get => _environmentVariables ?? (_environmentVariables = new InputMap<object>());
            set => _environmentVariables = value;
        }

        /// <summary>
        /// Fail open used for Pages Functions. Defaults to `false`.
        /// </summary>
        [Input("failOpen")]
        public Input<bool>? FailOpen { get; set; }

        [Input("kvNamespaces")]
        private InputMap<object>? _kvNamespaces;

        /// <summary>
        /// KV namespaces used for Pages Functions. Defaults to `map[]`.
        /// </summary>
        public InputMap<object> KvNamespaces
        {
            get => _kvNamespaces ?? (_kvNamespaces = new InputMap<object>());
            set => _kvNamespaces = value;
        }

        /// <summary>
        /// Configuration for placement in the Cloudflare Pages project.
        /// </summary>
        [Input("placement")]
        public Input<Inputs.PagesProjectDeploymentConfigsPreviewPlacementGetArgs>? Placement { get; set; }

        [Input("r2Buckets")]
        private InputMap<object>? _r2Buckets;

        /// <summary>
        /// R2 Buckets used for Pages Functions. Defaults to `map[]`.
        /// </summary>
        public InputMap<object> R2Buckets
        {
            get => _r2Buckets ?? (_r2Buckets = new InputMap<object>());
            set => _r2Buckets = value;
        }

        [Input("secrets")]
        private InputMap<object>? _secrets;

        /// <summary>
        /// Encrypted environment variables for Pages Functions. Defaults to `map[]`.
        /// </summary>
        public InputMap<object> Secrets
        {
            get => _secrets ?? (_secrets = new InputMap<object>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, object>());
                _secrets = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        [Input("serviceBindings")]
        private InputList<Inputs.PagesProjectDeploymentConfigsPreviewServiceBindingGetArgs>? _serviceBindings;

        /// <summary>
        /// Services used for Pages Functions.
        /// </summary>
        public InputList<Inputs.PagesProjectDeploymentConfigsPreviewServiceBindingGetArgs> ServiceBindings
        {
            get => _serviceBindings ?? (_serviceBindings = new InputList<Inputs.PagesProjectDeploymentConfigsPreviewServiceBindingGetArgs>());
            set => _serviceBindings = value;
        }

        /// <summary>
        /// Usage model used for Pages Functions. Defaults to `bundled`.
        /// </summary>
        [Input("usageModel")]
        public Input<string>? UsageModel { get; set; }

        public PagesProjectDeploymentConfigsPreviewGetArgs()
        {
        }
        public static new PagesProjectDeploymentConfigsPreviewGetArgs Empty => new PagesProjectDeploymentConfigsPreviewGetArgs();
    }
}

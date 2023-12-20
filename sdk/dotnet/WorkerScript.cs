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
    /// Provides a Cloudflare worker script resource. In order for a script to be active, you'll also need to setup a `cloudflare.WorkerRoute`.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System;
    /// using System.Collections.Generic;
    /// using System.IO;
    /// using System.Linq;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// 	
    /// string ReadFileBase64(string path) 
    /// {
    ///     return Convert.ToBase64String(Encoding.UTF8.GetBytes(File.ReadAllText(path)));
    /// }
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myNamespace = new Cloudflare.WorkersKvNamespace("myNamespace", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Title = "example",
    ///     });
    /// 
    ///     // Sets the script with the name "script_1"
    ///     var myScript = new Cloudflare.WorkerScript("myScript", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Name = "script_1",
    ///         Content = File.ReadAllText("script.js"),
    ///         KvNamespaceBindings = new[]
    ///         {
    ///             new Cloudflare.Inputs.WorkerScriptKvNamespaceBindingArgs
    ///             {
    ///                 Name = "MY_EXAMPLE_KV_NAMESPACE",
    ///                 NamespaceId = myNamespace.Id,
    ///             },
    ///         },
    ///         PlainTextBindings = new[]
    ///         {
    ///             new Cloudflare.Inputs.WorkerScriptPlainTextBindingArgs
    ///             {
    ///                 Name = "MY_EXAMPLE_PLAIN_TEXT",
    ///                 Text = "foobar",
    ///             },
    ///         },
    ///         SecretTextBindings = new[]
    ///         {
    ///             new Cloudflare.Inputs.WorkerScriptSecretTextBindingArgs
    ///             {
    ///                 Name = "MY_EXAMPLE_SECRET_TEXT",
    ///                 Text = @var.Secret_foo_value,
    ///             },
    ///         },
    ///         WebassemblyBindings = new[]
    ///         {
    ///             new Cloudflare.Inputs.WorkerScriptWebassemblyBindingArgs
    ///             {
    ///                 Name = "MY_EXAMPLE_WASM",
    ///                 Module = ReadFileBase64("example.wasm"),
    ///             },
    ///         },
    ///         ServiceBindings = new[]
    ///         {
    ///             new Cloudflare.Inputs.WorkerScriptServiceBindingArgs
    ///             {
    ///                 Name = "MY_SERVICE_BINDING",
    ///                 Service = "MY_SERVICE",
    ///                 Environment = "production",
    ///             },
    ///         },
    ///         R2BucketBindings = new[]
    ///         {
    ///             new Cloudflare.Inputs.WorkerScriptR2BucketBindingArgs
    ///             {
    ///                 Name = "MY_BUCKET",
    ///                 BucketName = "MY_BUCKET_NAME",
    ///             },
    ///         },
    ///         AnalyticsEngineBindings = new[]
    ///         {
    ///             new Cloudflare.Inputs.WorkerScriptAnalyticsEngineBindingArgs
    ///             {
    ///                 Name = "MY_DATASET",
    ///                 Dataset = "dataset1",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/workerScript:WorkerScript example &lt;account_id&gt;/&lt;script_name&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/workerScript:WorkerScript")]
    public partial class WorkerScript : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        [Output("analyticsEngineBindings")]
        public Output<ImmutableArray<Outputs.WorkerScriptAnalyticsEngineBinding>> AnalyticsEngineBindings { get; private set; } = null!;

        /// <summary>
        /// The date to use for the compatibility flag.
        /// </summary>
        [Output("compatibilityDate")]
        public Output<string?> CompatibilityDate { get; private set; } = null!;

        /// <summary>
        /// Compatibility flags used for Worker Scripts.
        /// </summary>
        [Output("compatibilityFlags")]
        public Output<ImmutableArray<string>> CompatibilityFlags { get; private set; } = null!;

        /// <summary>
        /// The script content.
        /// </summary>
        [Output("content")]
        public Output<string> Content { get; private set; } = null!;

        [Output("kvNamespaceBindings")]
        public Output<ImmutableArray<Outputs.WorkerScriptKvNamespaceBinding>> KvNamespaceBindings { get; private set; } = null!;

        /// <summary>
        /// Enabling allows Worker events to be sent to a defined Logpush destination.
        /// </summary>
        [Output("logpush")]
        public Output<bool?> Logpush { get; private set; } = null!;

        /// <summary>
        /// The base64 encoded wasm module you want to store.
        /// </summary>
        [Output("module")]
        public Output<bool?> Module { get; private set; } = null!;

        /// <summary>
        /// The global variable for the binding in your Worker code.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("placements")]
        public Output<ImmutableArray<Outputs.WorkerScriptPlacement>> Placements { get; private set; } = null!;

        [Output("plainTextBindings")]
        public Output<ImmutableArray<Outputs.WorkerScriptPlainTextBinding>> PlainTextBindings { get; private set; } = null!;

        [Output("queueBindings")]
        public Output<ImmutableArray<Outputs.WorkerScriptQueueBinding>> QueueBindings { get; private set; } = null!;

        [Output("r2BucketBindings")]
        public Output<ImmutableArray<Outputs.WorkerScriptR2BucketBinding>> R2BucketBindings { get; private set; } = null!;

        [Output("secretTextBindings")]
        public Output<ImmutableArray<Outputs.WorkerScriptSecretTextBinding>> SecretTextBindings { get; private set; } = null!;

        [Output("serviceBindings")]
        public Output<ImmutableArray<Outputs.WorkerScriptServiceBinding>> ServiceBindings { get; private set; } = null!;

        [Output("webassemblyBindings")]
        public Output<ImmutableArray<Outputs.WorkerScriptWebassemblyBinding>> WebassemblyBindings { get; private set; } = null!;


        /// <summary>
        /// Create a WorkerScript resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WorkerScript(string name, WorkerScriptArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/workerScript:WorkerScript", name, args ?? new WorkerScriptArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WorkerScript(string name, Input<string> id, WorkerScriptState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/workerScript:WorkerScript", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WorkerScript resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WorkerScript Get(string name, Input<string> id, WorkerScriptState? state = null, CustomResourceOptions? options = null)
        {
            return new WorkerScript(name, id, state, options);
        }
    }

    public sealed class WorkerScriptArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("analyticsEngineBindings")]
        private InputList<Inputs.WorkerScriptAnalyticsEngineBindingArgs>? _analyticsEngineBindings;
        public InputList<Inputs.WorkerScriptAnalyticsEngineBindingArgs> AnalyticsEngineBindings
        {
            get => _analyticsEngineBindings ?? (_analyticsEngineBindings = new InputList<Inputs.WorkerScriptAnalyticsEngineBindingArgs>());
            set => _analyticsEngineBindings = value;
        }

        /// <summary>
        /// The date to use for the compatibility flag.
        /// </summary>
        [Input("compatibilityDate")]
        public Input<string>? CompatibilityDate { get; set; }

        [Input("compatibilityFlags")]
        private InputList<string>? _compatibilityFlags;

        /// <summary>
        /// Compatibility flags used for Worker Scripts.
        /// </summary>
        public InputList<string> CompatibilityFlags
        {
            get => _compatibilityFlags ?? (_compatibilityFlags = new InputList<string>());
            set => _compatibilityFlags = value;
        }

        /// <summary>
        /// The script content.
        /// </summary>
        [Input("content", required: true)]
        public Input<string> Content { get; set; } = null!;

        [Input("kvNamespaceBindings")]
        private InputList<Inputs.WorkerScriptKvNamespaceBindingArgs>? _kvNamespaceBindings;
        public InputList<Inputs.WorkerScriptKvNamespaceBindingArgs> KvNamespaceBindings
        {
            get => _kvNamespaceBindings ?? (_kvNamespaceBindings = new InputList<Inputs.WorkerScriptKvNamespaceBindingArgs>());
            set => _kvNamespaceBindings = value;
        }

        /// <summary>
        /// Enabling allows Worker events to be sent to a defined Logpush destination.
        /// </summary>
        [Input("logpush")]
        public Input<bool>? Logpush { get; set; }

        /// <summary>
        /// The base64 encoded wasm module you want to store.
        /// </summary>
        [Input("module")]
        public Input<bool>? Module { get; set; }

        /// <summary>
        /// The global variable for the binding in your Worker code.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("placements")]
        private InputList<Inputs.WorkerScriptPlacementArgs>? _placements;
        public InputList<Inputs.WorkerScriptPlacementArgs> Placements
        {
            get => _placements ?? (_placements = new InputList<Inputs.WorkerScriptPlacementArgs>());
            set => _placements = value;
        }

        [Input("plainTextBindings")]
        private InputList<Inputs.WorkerScriptPlainTextBindingArgs>? _plainTextBindings;
        public InputList<Inputs.WorkerScriptPlainTextBindingArgs> PlainTextBindings
        {
            get => _plainTextBindings ?? (_plainTextBindings = new InputList<Inputs.WorkerScriptPlainTextBindingArgs>());
            set => _plainTextBindings = value;
        }

        [Input("queueBindings")]
        private InputList<Inputs.WorkerScriptQueueBindingArgs>? _queueBindings;
        public InputList<Inputs.WorkerScriptQueueBindingArgs> QueueBindings
        {
            get => _queueBindings ?? (_queueBindings = new InputList<Inputs.WorkerScriptQueueBindingArgs>());
            set => _queueBindings = value;
        }

        [Input("r2BucketBindings")]
        private InputList<Inputs.WorkerScriptR2BucketBindingArgs>? _r2BucketBindings;
        public InputList<Inputs.WorkerScriptR2BucketBindingArgs> R2BucketBindings
        {
            get => _r2BucketBindings ?? (_r2BucketBindings = new InputList<Inputs.WorkerScriptR2BucketBindingArgs>());
            set => _r2BucketBindings = value;
        }

        [Input("secretTextBindings")]
        private InputList<Inputs.WorkerScriptSecretTextBindingArgs>? _secretTextBindings;
        public InputList<Inputs.WorkerScriptSecretTextBindingArgs> SecretTextBindings
        {
            get => _secretTextBindings ?? (_secretTextBindings = new InputList<Inputs.WorkerScriptSecretTextBindingArgs>());
            set => _secretTextBindings = value;
        }

        [Input("serviceBindings")]
        private InputList<Inputs.WorkerScriptServiceBindingArgs>? _serviceBindings;
        public InputList<Inputs.WorkerScriptServiceBindingArgs> ServiceBindings
        {
            get => _serviceBindings ?? (_serviceBindings = new InputList<Inputs.WorkerScriptServiceBindingArgs>());
            set => _serviceBindings = value;
        }

        [Input("webassemblyBindings")]
        private InputList<Inputs.WorkerScriptWebassemblyBindingArgs>? _webassemblyBindings;
        public InputList<Inputs.WorkerScriptWebassemblyBindingArgs> WebassemblyBindings
        {
            get => _webassemblyBindings ?? (_webassemblyBindings = new InputList<Inputs.WorkerScriptWebassemblyBindingArgs>());
            set => _webassemblyBindings = value;
        }

        public WorkerScriptArgs()
        {
        }
        public static new WorkerScriptArgs Empty => new WorkerScriptArgs();
    }

    public sealed class WorkerScriptState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("analyticsEngineBindings")]
        private InputList<Inputs.WorkerScriptAnalyticsEngineBindingGetArgs>? _analyticsEngineBindings;
        public InputList<Inputs.WorkerScriptAnalyticsEngineBindingGetArgs> AnalyticsEngineBindings
        {
            get => _analyticsEngineBindings ?? (_analyticsEngineBindings = new InputList<Inputs.WorkerScriptAnalyticsEngineBindingGetArgs>());
            set => _analyticsEngineBindings = value;
        }

        /// <summary>
        /// The date to use for the compatibility flag.
        /// </summary>
        [Input("compatibilityDate")]
        public Input<string>? CompatibilityDate { get; set; }

        [Input("compatibilityFlags")]
        private InputList<string>? _compatibilityFlags;

        /// <summary>
        /// Compatibility flags used for Worker Scripts.
        /// </summary>
        public InputList<string> CompatibilityFlags
        {
            get => _compatibilityFlags ?? (_compatibilityFlags = new InputList<string>());
            set => _compatibilityFlags = value;
        }

        /// <summary>
        /// The script content.
        /// </summary>
        [Input("content")]
        public Input<string>? Content { get; set; }

        [Input("kvNamespaceBindings")]
        private InputList<Inputs.WorkerScriptKvNamespaceBindingGetArgs>? _kvNamespaceBindings;
        public InputList<Inputs.WorkerScriptKvNamespaceBindingGetArgs> KvNamespaceBindings
        {
            get => _kvNamespaceBindings ?? (_kvNamespaceBindings = new InputList<Inputs.WorkerScriptKvNamespaceBindingGetArgs>());
            set => _kvNamespaceBindings = value;
        }

        /// <summary>
        /// Enabling allows Worker events to be sent to a defined Logpush destination.
        /// </summary>
        [Input("logpush")]
        public Input<bool>? Logpush { get; set; }

        /// <summary>
        /// The base64 encoded wasm module you want to store.
        /// </summary>
        [Input("module")]
        public Input<bool>? Module { get; set; }

        /// <summary>
        /// The global variable for the binding in your Worker code.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("placements")]
        private InputList<Inputs.WorkerScriptPlacementGetArgs>? _placements;
        public InputList<Inputs.WorkerScriptPlacementGetArgs> Placements
        {
            get => _placements ?? (_placements = new InputList<Inputs.WorkerScriptPlacementGetArgs>());
            set => _placements = value;
        }

        [Input("plainTextBindings")]
        private InputList<Inputs.WorkerScriptPlainTextBindingGetArgs>? _plainTextBindings;
        public InputList<Inputs.WorkerScriptPlainTextBindingGetArgs> PlainTextBindings
        {
            get => _plainTextBindings ?? (_plainTextBindings = new InputList<Inputs.WorkerScriptPlainTextBindingGetArgs>());
            set => _plainTextBindings = value;
        }

        [Input("queueBindings")]
        private InputList<Inputs.WorkerScriptQueueBindingGetArgs>? _queueBindings;
        public InputList<Inputs.WorkerScriptQueueBindingGetArgs> QueueBindings
        {
            get => _queueBindings ?? (_queueBindings = new InputList<Inputs.WorkerScriptQueueBindingGetArgs>());
            set => _queueBindings = value;
        }

        [Input("r2BucketBindings")]
        private InputList<Inputs.WorkerScriptR2BucketBindingGetArgs>? _r2BucketBindings;
        public InputList<Inputs.WorkerScriptR2BucketBindingGetArgs> R2BucketBindings
        {
            get => _r2BucketBindings ?? (_r2BucketBindings = new InputList<Inputs.WorkerScriptR2BucketBindingGetArgs>());
            set => _r2BucketBindings = value;
        }

        [Input("secretTextBindings")]
        private InputList<Inputs.WorkerScriptSecretTextBindingGetArgs>? _secretTextBindings;
        public InputList<Inputs.WorkerScriptSecretTextBindingGetArgs> SecretTextBindings
        {
            get => _secretTextBindings ?? (_secretTextBindings = new InputList<Inputs.WorkerScriptSecretTextBindingGetArgs>());
            set => _secretTextBindings = value;
        }

        [Input("serviceBindings")]
        private InputList<Inputs.WorkerScriptServiceBindingGetArgs>? _serviceBindings;
        public InputList<Inputs.WorkerScriptServiceBindingGetArgs> ServiceBindings
        {
            get => _serviceBindings ?? (_serviceBindings = new InputList<Inputs.WorkerScriptServiceBindingGetArgs>());
            set => _serviceBindings = value;
        }

        [Input("webassemblyBindings")]
        private InputList<Inputs.WorkerScriptWebassemblyBindingGetArgs>? _webassemblyBindings;
        public InputList<Inputs.WorkerScriptWebassemblyBindingGetArgs> WebassemblyBindings
        {
            get => _webassemblyBindings ?? (_webassemblyBindings = new InputList<Inputs.WorkerScriptWebassemblyBindingGetArgs>());
            set => _webassemblyBindings = value;
        }

        public WorkerScriptState()
        {
        }
        public static new WorkerScriptState Empty => new WorkerScriptState();
    }
}

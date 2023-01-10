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
    /// Provides a resource to manage API Shield configurations.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Cloudflare.ApiShield("example", new()
    ///     {
    ///         AuthIdCharacteristics = new[]
    ///         {
    ///             new Cloudflare.Inputs.ApiShieldAuthIdCharacteristicArgs
    ///             {
    ///                 Name = "my-example-header",
    ///                 Type = "header",
    ///             },
    ///         },
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/apiShield:ApiShield")]
    public partial class ApiShield : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
        /// </summary>
        [Output("authIdCharacteristics")]
        public Output<ImmutableArray<Outputs.ApiShieldAuthIdCharacteristic>> AuthIdCharacteristics { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a ApiShield resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApiShield(string name, ApiShieldArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/apiShield:ApiShield", name, args ?? new ApiShieldArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApiShield(string name, Input<string> id, ApiShieldState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/apiShield:ApiShield", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ApiShield resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApiShield Get(string name, Input<string> id, ApiShieldState? state = null, CustomResourceOptions? options = null)
        {
            return new ApiShield(name, id, state, options);
        }
    }

    public sealed class ApiShieldArgs : global::Pulumi.ResourceArgs
    {
        [Input("authIdCharacteristics")]
        private InputList<Inputs.ApiShieldAuthIdCharacteristicArgs>? _authIdCharacteristics;

        /// <summary>
        /// Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
        /// </summary>
        public InputList<Inputs.ApiShieldAuthIdCharacteristicArgs> AuthIdCharacteristics
        {
            get => _authIdCharacteristics ?? (_authIdCharacteristics = new InputList<Inputs.ApiShieldAuthIdCharacteristicArgs>());
            set => _authIdCharacteristics = value;
        }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public ApiShieldArgs()
        {
        }
        public static new ApiShieldArgs Empty => new ApiShieldArgs();
    }

    public sealed class ApiShieldState : global::Pulumi.ResourceArgs
    {
        [Input("authIdCharacteristics")]
        private InputList<Inputs.ApiShieldAuthIdCharacteristicGetArgs>? _authIdCharacteristics;

        /// <summary>
        /// Characteristics define properties across which auth-ids can be computed in a privacy-preserving manner.
        /// </summary>
        public InputList<Inputs.ApiShieldAuthIdCharacteristicGetArgs> AuthIdCharacteristics
        {
            get => _authIdCharacteristics ?? (_authIdCharacteristics = new InputList<Inputs.ApiShieldAuthIdCharacteristicGetArgs>());
            set => _authIdCharacteristics = value;
        }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ApiShieldState()
        {
        }
        public static new ApiShieldState Empty => new ApiShieldState();
    }
}

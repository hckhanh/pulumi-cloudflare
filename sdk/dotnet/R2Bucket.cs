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
    ///     var example = new Cloudflare.R2Bucket("example", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Location = "enam",
    ///         Name = "terraform-bucket",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// &gt; Available location values can be found in the [R2 documentation](https://developers.cloudflare.com/r2/buckets/data-location/#available-hints).
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/r2Bucket:R2Bucket default &lt;account id&gt;/&lt;bucket name&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/r2Bucket:R2Bucket")]
    public partial class R2Bucket : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The location hint of the R2 bucket.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The name of the R2 bucket.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a R2Bucket resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public R2Bucket(string name, R2BucketArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/r2Bucket:R2Bucket", name, args ?? new R2BucketArgs(), MakeResourceOptions(options, ""))
        {
        }

        private R2Bucket(string name, Input<string> id, R2BucketState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/r2Bucket:R2Bucket", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing R2Bucket resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static R2Bucket Get(string name, Input<string> id, R2BucketState? state = null, CustomResourceOptions? options = null)
        {
            return new R2Bucket(name, id, state, options);
        }
    }

    public sealed class R2BucketArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// The location hint of the R2 bucket.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name of the R2 bucket.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public R2BucketArgs()
        {
        }
        public static new R2BucketArgs Empty => new R2BucketArgs();
    }

    public sealed class R2BucketState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The location hint of the R2 bucket.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The name of the R2 bucket.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public R2BucketState()
        {
        }
        public static new R2BucketState Empty => new R2BucketState();
    }
}

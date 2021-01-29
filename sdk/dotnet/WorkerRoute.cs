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
    /// Provides a Cloudflare worker route resource. A route will also require a `cloudflare.WorkerScript`. *NOTE:*  This resource uses the Cloudflare account APIs. This requires setting the `CLOUDFLARE_ACCOUNT_ID` environment variable or `account_id` provider argument.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var myScript = new Cloudflare.WorkerScript("myScript", new Cloudflare.WorkerScriptArgs
    ///         {
    ///         });
    ///         // see "cloudflare_worker_script" documentation ...
    ///         // Runs the specified worker script for all URLs that match `example.com/*`
    ///         var myRoute = new Cloudflare.WorkerRoute("myRoute", new Cloudflare.WorkerRouteArgs
    ///         {
    ///             ZoneId = "d41d8cd98f00b204e9800998ecf8427e",
    ///             Pattern = "example.com/*",
    ///             ScriptName = myScript.Name,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Records can be imported using a composite ID formed of zone ID and route ID, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/workerRoute:WorkerRoute default d41d8cd98f00b204e9800998ecf8427e/9a7806061c88ada191ed06f989cc3dac
    /// ```
    /// 
    ///  where* `d41d8cd98f00b204e9800998ecf8427e` - zone ID * `9a7806061c88ada191ed06f989cc3dac` - route ID as returned by [API](https://api.cloudflare.com/#worker-filters-list-filters)
    /// </summary>
    [CloudflareResourceType("cloudflare:index/workerRoute:WorkerRoute")]
    public partial class WorkerRoute : Pulumi.CustomResource
    {
        /// <summary>
        /// The [route pattern](https://developers.cloudflare.com/workers/about/routes/)
        /// </summary>
        [Output("pattern")]
        public Output<string> Pattern { get; private set; } = null!;

        /// <summary>
        /// Which worker script to run for requests that match the route pattern. If `script_name` is empty, workers will be skipped for matching requests.
        /// </summary>
        [Output("scriptName")]
        public Output<string?> ScriptName { get; private set; } = null!;

        /// <summary>
        /// The zone ID to add the route to.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a WorkerRoute resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WorkerRoute(string name, WorkerRouteArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/workerRoute:WorkerRoute", name, args ?? new WorkerRouteArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WorkerRoute(string name, Input<string> id, WorkerRouteState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/workerRoute:WorkerRoute", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WorkerRoute resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WorkerRoute Get(string name, Input<string> id, WorkerRouteState? state = null, CustomResourceOptions? options = null)
        {
            return new WorkerRoute(name, id, state, options);
        }
    }

    public sealed class WorkerRouteArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The [route pattern](https://developers.cloudflare.com/workers/about/routes/)
        /// </summary>
        [Input("pattern", required: true)]
        public Input<string> Pattern { get; set; } = null!;

        /// <summary>
        /// Which worker script to run for requests that match the route pattern. If `script_name` is empty, workers will be skipped for matching requests.
        /// </summary>
        [Input("scriptName")]
        public Input<string>? ScriptName { get; set; }

        /// <summary>
        /// The zone ID to add the route to.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public WorkerRouteArgs()
        {
        }
    }

    public sealed class WorkerRouteState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The [route pattern](https://developers.cloudflare.com/workers/about/routes/)
        /// </summary>
        [Input("pattern")]
        public Input<string>? Pattern { get; set; }

        /// <summary>
        /// Which worker script to run for requests that match the route pattern. If `script_name` is empty, workers will be skipped for matching requests.
        /// </summary>
        [Input("scriptName")]
        public Input<string>? ScriptName { get; set; }

        /// <summary>
        /// The zone ID to add the route to.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public WorkerRouteState()
        {
        }
    }
}

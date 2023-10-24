// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetList
    {
        /// <summary>
        /// Use this data source to lookup a [List](https://developers.cloudflare.com/api/operations/lists-get-lists).
        /// </summary>
        public static Task<GetListResult> InvokeAsync(GetListArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetListResult>("cloudflare:index/getList:getList", args ?? new GetListArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to lookup a [List](https://developers.cloudflare.com/api/operations/lists-get-lists).
        /// </summary>
        public static Output<GetListResult> Invoke(GetListInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetListResult>("cloudflare:index/getList:getList", args ?? new GetListInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetListArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        /// <summary>
        /// The list name to target for the resource.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetListArgs()
        {
        }
        public static new GetListArgs Empty => new GetListArgs();
    }

    public sealed class GetListInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// The list name to target for the resource.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetListInvokeArgs()
        {
        }
        public static new GetListInvokeArgs Empty => new GetListInvokeArgs();
    }


    [OutputType]
    public sealed class GetListResult
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// List description.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// List kind.
        /// </summary>
        public readonly string Kind;
        /// <summary>
        /// The list name to target for the resource.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Number of items in list.
        /// </summary>
        public readonly int Numitems;

        [OutputConstructor]
        private GetListResult(
            string accountId,

            string description,

            string id,

            string kind,

            string name,

            int numitems)
        {
            AccountId = accountId;
            Description = description;
            Id = id;
            Kind = kind;
            Name = name;
            Numitems = numitems;
        }
    }
}

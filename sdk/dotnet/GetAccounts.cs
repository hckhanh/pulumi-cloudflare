// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetAccounts
    {
        /// <summary>
        /// Data source for looking up Cloudflare Accounts.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Cloudflare.GetAccounts.Invoke(new()
        ///     {
        ///         Name = "example account",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAccountsResult> InvokeAsync(GetAccountsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccountsResult>("cloudflare:index/getAccounts:getAccounts", args ?? new GetAccountsArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for looking up Cloudflare Accounts.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Cloudflare = Pulumi.Cloudflare;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Cloudflare.GetAccounts.Invoke(new()
        ///     {
        ///         Name = "example account",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetAccountsResult> Invoke(GetAccountsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccountsResult>("cloudflare:index/getAccounts:getAccounts", args ?? new GetAccountsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAccountsArgs : global::Pulumi.InvokeArgs
    {
        [Input("name")]
        public string? Name { get; set; }

        public GetAccountsArgs()
        {
        }
        public static new GetAccountsArgs Empty => new GetAccountsArgs();
    }

    public sealed class GetAccountsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetAccountsInvokeArgs()
        {
        }
        public static new GetAccountsInvokeArgs Empty => new GetAccountsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAccountsResult
    {
        public readonly ImmutableArray<Outputs.GetAccountsAccountResult> Accounts;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The account name to target for the resource.
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private GetAccountsResult(
            ImmutableArray<Outputs.GetAccountsAccountResult> accounts,

            string id,

            string? name)
        {
            Accounts = accounts;
            Id = id;
            Name = name;
        }
    }
}

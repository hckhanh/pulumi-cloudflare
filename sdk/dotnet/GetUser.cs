// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetUser
    {
        /// <summary>
        /// Use this data source to retrieve information about the currently authenticated user.
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
        ///     var me = Cloudflare.GetUser.Invoke();
        /// 
        ///     var all = Cloudflare.GetApiTokenPermissionGroups.Invoke();
        /// 
        ///     var example = new Cloudflare.ApiToken("example", new()
        ///     {
        ///         Name = "Terraform Cloud (Terraform)",
        ///         Policies = new[]
        ///         {
        ///             new Cloudflare.Inputs.ApiTokenPolicyArgs
        ///             {
        ///                 PermissionGroups = new[]
        ///                 {
        ///                     all.Apply(getApiTokenPermissionGroupsResult =&gt; getApiTokenPermissionGroupsResult.User?.User_Details_Read),
        ///                 },
        ///                 Resources = 
        ///                 {
        ///                     { $"com.cloudflare.api.user.{me.Apply(getUserResult =&gt; getUserResult.Id)}", "*" },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetUserResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetUserResult>("cloudflare:index/getUser:getUser", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Use this data source to retrieve information about the currently authenticated user.
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
        ///     var me = Cloudflare.GetUser.Invoke();
        /// 
        ///     var all = Cloudflare.GetApiTokenPermissionGroups.Invoke();
        /// 
        ///     var example = new Cloudflare.ApiToken("example", new()
        ///     {
        ///         Name = "Terraform Cloud (Terraform)",
        ///         Policies = new[]
        ///         {
        ///             new Cloudflare.Inputs.ApiTokenPolicyArgs
        ///             {
        ///                 PermissionGroups = new[]
        ///                 {
        ///                     all.Apply(getApiTokenPermissionGroupsResult =&gt; getApiTokenPermissionGroupsResult.User?.User_Details_Read),
        ///                 },
        ///                 Resources = 
        ///                 {
        ///                     { $"com.cloudflare.api.user.{me.Apply(getUserResult =&gt; getUserResult.Id)}", "*" },
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetUserResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetUserResult>("cloudflare:index/getUser:getUser", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetUserResult
    {
        /// <summary>
        /// The user's email address.
        /// </summary>
        public readonly string Email;
        /// <summary>
        /// The user's unique identifier.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The user's username.
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private GetUserResult(
            string email,

            string id,

            string username)
        {
            Email = email;
            Id = id;
            Username = username;
        }
    }
}

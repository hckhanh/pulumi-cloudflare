// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Use this data source to retrieve information about the currently authenticated user.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// me, err := cloudflare.GetUser(ctx, nil, nil);
// if err != nil {
// return err
// }
// all, err := cloudflare.GetApiTokenPermissionGroups(ctx, nil, nil);
// if err != nil {
// return err
// }
// _, err = cloudflare.NewApiToken(ctx, "example", &cloudflare.ApiTokenArgs{
// Name: pulumi.String("Terraform Cloud (Terraform)"),
// Policies: cloudflare.ApiTokenPolicyArray{
// &cloudflare.ApiTokenPolicyArgs{
// PermissionGroups: pulumi.StringArray{
// *pulumi.String(all.User.User Details Read),
// },
// Resources: pulumi.StringMap{
// fmt.Sprintf("com.cloudflare.api.user.%v", me.Id): pulumi.String("*"),
// },
// },
// },
// })
// if err != nil {
// return err
// }
// return nil
// })
// }
// ```
func GetUser(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetUserResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetUserResult
	err := ctx.Invoke("cloudflare:index/getUser:getUser", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getUser.
type GetUserResult struct {
	// The user's email address.
	Email string `pulumi:"email"`
	// The user's unique identifier.
	Id string `pulumi:"id"`
	// The user's username.
	Username string `pulumi:"username"`
}

func GetUserOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetUserResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetUserResult, error) {
		r, err := GetUser(ctx, opts...)
		var s GetUserResult
		if r != nil {
			s = *r
		}
		return s, err
	}).(GetUserResultOutput)
}

// A collection of values returned by getUser.
type GetUserResultOutput struct{ *pulumi.OutputState }

func (GetUserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUserResult)(nil)).Elem()
}

func (o GetUserResultOutput) ToGetUserResultOutput() GetUserResultOutput {
	return o
}

func (o GetUserResultOutput) ToGetUserResultOutputWithContext(ctx context.Context) GetUserResultOutput {
	return o
}

func (o GetUserResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetUserResult] {
	return pulumix.Output[GetUserResult]{
		OutputState: o.OutputState,
	}
}

// The user's email address.
func (o GetUserResultOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v GetUserResult) string { return v.Email }).(pulumi.StringOutput)
}

// The user's unique identifier.
func (o GetUserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetUserResult) string { return v.Id }).(pulumi.StringOutput)
}

// The user's username.
func (o GetUserResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v GetUserResult) string { return v.Username }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetUserResultOutput{})
}

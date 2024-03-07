// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get the
// [Origin CA root certificate](https://developers.cloudflare.com/ssl/origin-configuration/origin-ca#4-required-for-some-add-cloudflare-origin-ca-root-certificates)
// for a given algorithm."
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudflare.GetOriginCaRootCertificate(ctx, &cloudflare.GetOriginCaRootCertificateArgs{
//				Algorithm: "rsa",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func GetOriginCaRootCertificate(ctx *pulumi.Context, args *GetOriginCaRootCertificateArgs, opts ...pulumi.InvokeOption) (*GetOriginCaRootCertificateResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetOriginCaRootCertificateResult
	err := ctx.Invoke("cloudflare:index/getOriginCaRootCertificate:getOriginCaRootCertificate", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOriginCaRootCertificate.
type GetOriginCaRootCertificateArgs struct {
	// The name of the algorithm used when creating an Origin CA certificate. Available values: `rsa`, `ecc`.
	Algorithm string `pulumi:"algorithm"`
}

// A collection of values returned by getOriginCaRootCertificate.
type GetOriginCaRootCertificateResult struct {
	// The name of the algorithm used when creating an Origin CA certificate. Available values: `rsa`, `ecc`.
	Algorithm string `pulumi:"algorithm"`
	// The Origin CA root certificate in PEM format.
	CertPem string `pulumi:"certPem"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetOriginCaRootCertificateOutput(ctx *pulumi.Context, args GetOriginCaRootCertificateOutputArgs, opts ...pulumi.InvokeOption) GetOriginCaRootCertificateResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetOriginCaRootCertificateResult, error) {
			args := v.(GetOriginCaRootCertificateArgs)
			r, err := GetOriginCaRootCertificate(ctx, &args, opts...)
			var s GetOriginCaRootCertificateResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetOriginCaRootCertificateResultOutput)
}

// A collection of arguments for invoking getOriginCaRootCertificate.
type GetOriginCaRootCertificateOutputArgs struct {
	// The name of the algorithm used when creating an Origin CA certificate. Available values: `rsa`, `ecc`.
	Algorithm pulumi.StringInput `pulumi:"algorithm"`
}

func (GetOriginCaRootCertificateOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetOriginCaRootCertificateArgs)(nil)).Elem()
}

// A collection of values returned by getOriginCaRootCertificate.
type GetOriginCaRootCertificateResultOutput struct{ *pulumi.OutputState }

func (GetOriginCaRootCertificateResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetOriginCaRootCertificateResult)(nil)).Elem()
}

func (o GetOriginCaRootCertificateResultOutput) ToGetOriginCaRootCertificateResultOutput() GetOriginCaRootCertificateResultOutput {
	return o
}

func (o GetOriginCaRootCertificateResultOutput) ToGetOriginCaRootCertificateResultOutputWithContext(ctx context.Context) GetOriginCaRootCertificateResultOutput {
	return o
}

// The name of the algorithm used when creating an Origin CA certificate. Available values: `rsa`, `ecc`.
func (o GetOriginCaRootCertificateResultOutput) Algorithm() pulumi.StringOutput {
	return o.ApplyT(func(v GetOriginCaRootCertificateResult) string { return v.Algorithm }).(pulumi.StringOutput)
}

// The Origin CA root certificate in PEM format.
func (o GetOriginCaRootCertificateResultOutput) CertPem() pulumi.StringOutput {
	return o.ApplyT(func(v GetOriginCaRootCertificateResult) string { return v.CertPem }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetOriginCaRootCertificateResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetOriginCaRootCertificateResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetOriginCaRootCertificateResultOutput{})
}

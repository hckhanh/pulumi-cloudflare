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

// Use this data source to look up [zone](https://api.cloudflare.com/#zone-properties)
// info. This is the singular alternative to `getZones`.
//
// > **Note** Cloudflare zone names **are not unique**. It is possible for multiple
// accounts to have the same zone created but in different states. If you are
// using this setup, it is advised to use the `accountId` attribute on this
// resource or swap to `getZones` to further filter the results.
func LookupZone(ctx *pulumi.Context, args *LookupZoneArgs, opts ...pulumi.InvokeOption) (*LookupZoneResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupZoneResult
	err := ctx.Invoke("cloudflare:index/getZone:getZone", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getZone.
type LookupZoneArgs struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// The name of the zone. Must provide only one of `zoneId`, `name`.
	Name *string `pulumi:"name"`
	// The zone identifier to target for the resource. Must provide only one of `zoneId`, `name`.
	ZoneId *string `pulumi:"zoneId"`
}

// A collection of values returned by getZone.
type LookupZoneResult struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The name of the zone. Must provide only one of `zoneId`, `name`.
	Name string `pulumi:"name"`
	// Cloudflare assigned name servers. This is only populated for zones that use Cloudflare DNS.
	NameServers []string `pulumi:"nameServers"`
	// Whether the zone is paused on Cloudflare.
	Paused bool `pulumi:"paused"`
	// The name of the plan associated with the zone.
	Plan string `pulumi:"plan"`
	// Status of the zone.
	Status string `pulumi:"status"`
	// List of Vanity Nameservers (if set).
	VanityNameServers []string `pulumi:"vanityNameServers"`
	// The zone identifier to target for the resource. Must provide only one of `zoneId`, `name`.
	ZoneId string `pulumi:"zoneId"`
}

func LookupZoneOutput(ctx *pulumi.Context, args LookupZoneOutputArgs, opts ...pulumi.InvokeOption) LookupZoneResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupZoneResult, error) {
			args := v.(LookupZoneArgs)
			r, err := LookupZone(ctx, &args, opts...)
			var s LookupZoneResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupZoneResultOutput)
}

// A collection of arguments for invoking getZone.
type LookupZoneOutputArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput `pulumi:"accountId"`
	// The name of the zone. Must provide only one of `zoneId`, `name`.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The zone identifier to target for the resource. Must provide only one of `zoneId`, `name`.
	ZoneId pulumi.StringPtrInput `pulumi:"zoneId"`
}

func (LookupZoneOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupZoneArgs)(nil)).Elem()
}

// A collection of values returned by getZone.
type LookupZoneResultOutput struct{ *pulumi.OutputState }

func (LookupZoneResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupZoneResult)(nil)).Elem()
}

func (o LookupZoneResultOutput) ToLookupZoneResultOutput() LookupZoneResultOutput {
	return o
}

func (o LookupZoneResultOutput) ToLookupZoneResultOutputWithContext(ctx context.Context) LookupZoneResultOutput {
	return o
}

func (o LookupZoneResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupZoneResult] {
	return pulumix.Output[LookupZoneResult]{
		OutputState: o.OutputState,
	}
}

// The account identifier to target for the resource.
func (o LookupZoneResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZoneResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupZoneResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZoneResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the zone. Must provide only one of `zoneId`, `name`.
func (o LookupZoneResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZoneResult) string { return v.Name }).(pulumi.StringOutput)
}

// Cloudflare assigned name servers. This is only populated for zones that use Cloudflare DNS.
func (o LookupZoneResultOutput) NameServers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupZoneResult) []string { return v.NameServers }).(pulumi.StringArrayOutput)
}

// Whether the zone is paused on Cloudflare.
func (o LookupZoneResultOutput) Paused() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupZoneResult) bool { return v.Paused }).(pulumi.BoolOutput)
}

// The name of the plan associated with the zone.
func (o LookupZoneResultOutput) Plan() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZoneResult) string { return v.Plan }).(pulumi.StringOutput)
}

// Status of the zone.
func (o LookupZoneResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZoneResult) string { return v.Status }).(pulumi.StringOutput)
}

// List of Vanity Nameservers (if set).
func (o LookupZoneResultOutput) VanityNameServers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupZoneResult) []string { return v.VanityNameServers }).(pulumi.StringArrayOutput)
}

// The zone identifier to target for the resource. Must provide only one of `zoneId`, `name`.
func (o LookupZoneResultOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZoneResult) string { return v.ZoneId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupZoneResultOutput{})
}

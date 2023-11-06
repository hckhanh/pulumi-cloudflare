// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Data Localization Suite Regional Hostname.
//
// ## Example Usage
//
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
//			_, err := cloudflare.NewRecord(ctx, "exampleRecord", &cloudflare.RecordArgs{
//				Name:   pulumi.String("example.com"),
//				Ttl:    pulumi.Int(3600),
//				Type:   pulumi.String("A"),
//				Value:  pulumi.String("192.0.2.1"),
//				ZoneId: pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewRegionalHostname(ctx, "exampleRegionalHostname", &cloudflare.RegionalHostnameArgs{
//				Hostname:  pulumi.String("example.com"),
//				RegionKey: pulumi.String("eu"),
//				ZoneId:    pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type RegionalHostname struct {
	pulumi.CustomResourceState

	// The RFC3339 timestamp of when the hostname was created.
	CreatedOn pulumi.StringOutput `pulumi:"createdOn"`
	// The hostname to regionalize.
	Hostname pulumi.StringOutput `pulumi:"hostname"`
	// The region key. See [the full region list](https://developers.cloudflare.com/data-localization/regional-services/get-started/).
	RegionKey pulumi.StringOutput `pulumi:"regionKey"`
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewRegionalHostname registers a new resource with the given unique name, arguments, and options.
func NewRegionalHostname(ctx *pulumi.Context,
	name string, args *RegionalHostnameArgs, opts ...pulumi.ResourceOption) (*RegionalHostname, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Hostname == nil {
		return nil, errors.New("invalid value for required argument 'Hostname'")
	}
	if args.RegionKey == nil {
		return nil, errors.New("invalid value for required argument 'RegionKey'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RegionalHostname
	err := ctx.RegisterResource("cloudflare:index/regionalHostname:RegionalHostname", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRegionalHostname gets an existing RegionalHostname resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRegionalHostname(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RegionalHostnameState, opts ...pulumi.ResourceOption) (*RegionalHostname, error) {
	var resource RegionalHostname
	err := ctx.ReadResource("cloudflare:index/regionalHostname:RegionalHostname", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RegionalHostname resources.
type regionalHostnameState struct {
	// The RFC3339 timestamp of when the hostname was created.
	CreatedOn *string `pulumi:"createdOn"`
	// The hostname to regionalize.
	Hostname *string `pulumi:"hostname"`
	// The region key. See [the full region list](https://developers.cloudflare.com/data-localization/regional-services/get-started/).
	RegionKey *string `pulumi:"regionKey"`
	// The zone identifier to target for the resource.
	ZoneId *string `pulumi:"zoneId"`
}

type RegionalHostnameState struct {
	// The RFC3339 timestamp of when the hostname was created.
	CreatedOn pulumi.StringPtrInput
	// The hostname to regionalize.
	Hostname pulumi.StringPtrInput
	// The region key. See [the full region list](https://developers.cloudflare.com/data-localization/regional-services/get-started/).
	RegionKey pulumi.StringPtrInput
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringPtrInput
}

func (RegionalHostnameState) ElementType() reflect.Type {
	return reflect.TypeOf((*regionalHostnameState)(nil)).Elem()
}

type regionalHostnameArgs struct {
	// The hostname to regionalize.
	Hostname string `pulumi:"hostname"`
	// The region key. See [the full region list](https://developers.cloudflare.com/data-localization/regional-services/get-started/).
	RegionKey string `pulumi:"regionKey"`
	// The zone identifier to target for the resource.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a RegionalHostname resource.
type RegionalHostnameArgs struct {
	// The hostname to regionalize.
	Hostname pulumi.StringInput
	// The region key. See [the full region list](https://developers.cloudflare.com/data-localization/regional-services/get-started/).
	RegionKey pulumi.StringInput
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringInput
}

func (RegionalHostnameArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*regionalHostnameArgs)(nil)).Elem()
}

type RegionalHostnameInput interface {
	pulumi.Input

	ToRegionalHostnameOutput() RegionalHostnameOutput
	ToRegionalHostnameOutputWithContext(ctx context.Context) RegionalHostnameOutput
}

func (*RegionalHostname) ElementType() reflect.Type {
	return reflect.TypeOf((**RegionalHostname)(nil)).Elem()
}

func (i *RegionalHostname) ToRegionalHostnameOutput() RegionalHostnameOutput {
	return i.ToRegionalHostnameOutputWithContext(context.Background())
}

func (i *RegionalHostname) ToRegionalHostnameOutputWithContext(ctx context.Context) RegionalHostnameOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegionalHostnameOutput)
}

// RegionalHostnameArrayInput is an input type that accepts RegionalHostnameArray and RegionalHostnameArrayOutput values.
// You can construct a concrete instance of `RegionalHostnameArrayInput` via:
//
//	RegionalHostnameArray{ RegionalHostnameArgs{...} }
type RegionalHostnameArrayInput interface {
	pulumi.Input

	ToRegionalHostnameArrayOutput() RegionalHostnameArrayOutput
	ToRegionalHostnameArrayOutputWithContext(context.Context) RegionalHostnameArrayOutput
}

type RegionalHostnameArray []RegionalHostnameInput

func (RegionalHostnameArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RegionalHostname)(nil)).Elem()
}

func (i RegionalHostnameArray) ToRegionalHostnameArrayOutput() RegionalHostnameArrayOutput {
	return i.ToRegionalHostnameArrayOutputWithContext(context.Background())
}

func (i RegionalHostnameArray) ToRegionalHostnameArrayOutputWithContext(ctx context.Context) RegionalHostnameArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegionalHostnameArrayOutput)
}

// RegionalHostnameMapInput is an input type that accepts RegionalHostnameMap and RegionalHostnameMapOutput values.
// You can construct a concrete instance of `RegionalHostnameMapInput` via:
//
//	RegionalHostnameMap{ "key": RegionalHostnameArgs{...} }
type RegionalHostnameMapInput interface {
	pulumi.Input

	ToRegionalHostnameMapOutput() RegionalHostnameMapOutput
	ToRegionalHostnameMapOutputWithContext(context.Context) RegionalHostnameMapOutput
}

type RegionalHostnameMap map[string]RegionalHostnameInput

func (RegionalHostnameMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RegionalHostname)(nil)).Elem()
}

func (i RegionalHostnameMap) ToRegionalHostnameMapOutput() RegionalHostnameMapOutput {
	return i.ToRegionalHostnameMapOutputWithContext(context.Background())
}

func (i RegionalHostnameMap) ToRegionalHostnameMapOutputWithContext(ctx context.Context) RegionalHostnameMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegionalHostnameMapOutput)
}

type RegionalHostnameOutput struct{ *pulumi.OutputState }

func (RegionalHostnameOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RegionalHostname)(nil)).Elem()
}

func (o RegionalHostnameOutput) ToRegionalHostnameOutput() RegionalHostnameOutput {
	return o
}

func (o RegionalHostnameOutput) ToRegionalHostnameOutputWithContext(ctx context.Context) RegionalHostnameOutput {
	return o
}

// The RFC3339 timestamp of when the hostname was created.
func (o RegionalHostnameOutput) CreatedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *RegionalHostname) pulumi.StringOutput { return v.CreatedOn }).(pulumi.StringOutput)
}

// The hostname to regionalize.
func (o RegionalHostnameOutput) Hostname() pulumi.StringOutput {
	return o.ApplyT(func(v *RegionalHostname) pulumi.StringOutput { return v.Hostname }).(pulumi.StringOutput)
}

// The region key. See [the full region list](https://developers.cloudflare.com/data-localization/regional-services/get-started/).
func (o RegionalHostnameOutput) RegionKey() pulumi.StringOutput {
	return o.ApplyT(func(v *RegionalHostname) pulumi.StringOutput { return v.RegionKey }).(pulumi.StringOutput)
}

// The zone identifier to target for the resource.
func (o RegionalHostnameOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *RegionalHostname) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type RegionalHostnameArrayOutput struct{ *pulumi.OutputState }

func (RegionalHostnameArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RegionalHostname)(nil)).Elem()
}

func (o RegionalHostnameArrayOutput) ToRegionalHostnameArrayOutput() RegionalHostnameArrayOutput {
	return o
}

func (o RegionalHostnameArrayOutput) ToRegionalHostnameArrayOutputWithContext(ctx context.Context) RegionalHostnameArrayOutput {
	return o
}

func (o RegionalHostnameArrayOutput) Index(i pulumi.IntInput) RegionalHostnameOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RegionalHostname {
		return vs[0].([]*RegionalHostname)[vs[1].(int)]
	}).(RegionalHostnameOutput)
}

type RegionalHostnameMapOutput struct{ *pulumi.OutputState }

func (RegionalHostnameMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RegionalHostname)(nil)).Elem()
}

func (o RegionalHostnameMapOutput) ToRegionalHostnameMapOutput() RegionalHostnameMapOutput {
	return o
}

func (o RegionalHostnameMapOutput) ToRegionalHostnameMapOutputWithContext(ctx context.Context) RegionalHostnameMapOutput {
	return o
}

func (o RegionalHostnameMapOutput) MapIndex(k pulumi.StringInput) RegionalHostnameOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RegionalHostname {
		return vs[0].(map[string]*RegionalHostname)[vs[1].(string)]
	}).(RegionalHostnameOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RegionalHostnameInput)(nil)).Elem(), &RegionalHostname{})
	pulumi.RegisterInputType(reflect.TypeOf((*RegionalHostnameArrayInput)(nil)).Elem(), RegionalHostnameArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RegionalHostnameMapInput)(nil)).Elem(), RegionalHostnameMap{})
	pulumi.RegisterOutputType(RegionalHostnameOutput{})
	pulumi.RegisterOutputType(RegionalHostnameArrayOutput{})
	pulumi.RegisterOutputType(RegionalHostnameMapOutput{})
}

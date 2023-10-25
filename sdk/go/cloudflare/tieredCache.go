// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a resource, that manages Cloudflare Tiered Cache settings.
// This allows you to adjust topologies for your zone.
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
//			_, err := cloudflare.NewTieredCache(ctx, "example", &cloudflare.TieredCacheArgs{
//				CacheType: pulumi.String("smart"),
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
type TieredCache struct {
	pulumi.CustomResourceState

	// The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
	CacheType pulumi.StringOutput `pulumi:"cacheType"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewTieredCache registers a new resource with the given unique name, arguments, and options.
func NewTieredCache(ctx *pulumi.Context,
	name string, args *TieredCacheArgs, opts ...pulumi.ResourceOption) (*TieredCache, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CacheType == nil {
		return nil, errors.New("invalid value for required argument 'CacheType'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TieredCache
	err := ctx.RegisterResource("cloudflare:index/tieredCache:TieredCache", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTieredCache gets an existing TieredCache resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTieredCache(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TieredCacheState, opts ...pulumi.ResourceOption) (*TieredCache, error) {
	var resource TieredCache
	err := ctx.ReadResource("cloudflare:index/tieredCache:TieredCache", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TieredCache resources.
type tieredCacheState struct {
	// The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
	CacheType *string `pulumi:"cacheType"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type TieredCacheState struct {
	// The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
	CacheType pulumi.StringPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (TieredCacheState) ElementType() reflect.Type {
	return reflect.TypeOf((*tieredCacheState)(nil)).Elem()
}

type tieredCacheArgs struct {
	// The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
	CacheType string `pulumi:"cacheType"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a TieredCache resource.
type TieredCacheArgs struct {
	// The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
	CacheType pulumi.StringInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (TieredCacheArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tieredCacheArgs)(nil)).Elem()
}

type TieredCacheInput interface {
	pulumi.Input

	ToTieredCacheOutput() TieredCacheOutput
	ToTieredCacheOutputWithContext(ctx context.Context) TieredCacheOutput
}

func (*TieredCache) ElementType() reflect.Type {
	return reflect.TypeOf((**TieredCache)(nil)).Elem()
}

func (i *TieredCache) ToTieredCacheOutput() TieredCacheOutput {
	return i.ToTieredCacheOutputWithContext(context.Background())
}

func (i *TieredCache) ToTieredCacheOutputWithContext(ctx context.Context) TieredCacheOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TieredCacheOutput)
}

func (i *TieredCache) ToOutput(ctx context.Context) pulumix.Output[*TieredCache] {
	return pulumix.Output[*TieredCache]{
		OutputState: i.ToTieredCacheOutputWithContext(ctx).OutputState,
	}
}

// TieredCacheArrayInput is an input type that accepts TieredCacheArray and TieredCacheArrayOutput values.
// You can construct a concrete instance of `TieredCacheArrayInput` via:
//
//	TieredCacheArray{ TieredCacheArgs{...} }
type TieredCacheArrayInput interface {
	pulumi.Input

	ToTieredCacheArrayOutput() TieredCacheArrayOutput
	ToTieredCacheArrayOutputWithContext(context.Context) TieredCacheArrayOutput
}

type TieredCacheArray []TieredCacheInput

func (TieredCacheArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TieredCache)(nil)).Elem()
}

func (i TieredCacheArray) ToTieredCacheArrayOutput() TieredCacheArrayOutput {
	return i.ToTieredCacheArrayOutputWithContext(context.Background())
}

func (i TieredCacheArray) ToTieredCacheArrayOutputWithContext(ctx context.Context) TieredCacheArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TieredCacheArrayOutput)
}

func (i TieredCacheArray) ToOutput(ctx context.Context) pulumix.Output[[]*TieredCache] {
	return pulumix.Output[[]*TieredCache]{
		OutputState: i.ToTieredCacheArrayOutputWithContext(ctx).OutputState,
	}
}

// TieredCacheMapInput is an input type that accepts TieredCacheMap and TieredCacheMapOutput values.
// You can construct a concrete instance of `TieredCacheMapInput` via:
//
//	TieredCacheMap{ "key": TieredCacheArgs{...} }
type TieredCacheMapInput interface {
	pulumi.Input

	ToTieredCacheMapOutput() TieredCacheMapOutput
	ToTieredCacheMapOutputWithContext(context.Context) TieredCacheMapOutput
}

type TieredCacheMap map[string]TieredCacheInput

func (TieredCacheMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TieredCache)(nil)).Elem()
}

func (i TieredCacheMap) ToTieredCacheMapOutput() TieredCacheMapOutput {
	return i.ToTieredCacheMapOutputWithContext(context.Background())
}

func (i TieredCacheMap) ToTieredCacheMapOutputWithContext(ctx context.Context) TieredCacheMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TieredCacheMapOutput)
}

func (i TieredCacheMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*TieredCache] {
	return pulumix.Output[map[string]*TieredCache]{
		OutputState: i.ToTieredCacheMapOutputWithContext(ctx).OutputState,
	}
}

type TieredCacheOutput struct{ *pulumi.OutputState }

func (TieredCacheOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TieredCache)(nil)).Elem()
}

func (o TieredCacheOutput) ToTieredCacheOutput() TieredCacheOutput {
	return o
}

func (o TieredCacheOutput) ToTieredCacheOutputWithContext(ctx context.Context) TieredCacheOutput {
	return o
}

func (o TieredCacheOutput) ToOutput(ctx context.Context) pulumix.Output[*TieredCache] {
	return pulumix.Output[*TieredCache]{
		OutputState: o.OutputState,
	}
}

// The typed of tiered cache to utilize on the zone. Available values: `generic`, `smart`, `off`.
func (o TieredCacheOutput) CacheType() pulumi.StringOutput {
	return o.ApplyT(func(v *TieredCache) pulumi.StringOutput { return v.CacheType }).(pulumi.StringOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o TieredCacheOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *TieredCache) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type TieredCacheArrayOutput struct{ *pulumi.OutputState }

func (TieredCacheArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TieredCache)(nil)).Elem()
}

func (o TieredCacheArrayOutput) ToTieredCacheArrayOutput() TieredCacheArrayOutput {
	return o
}

func (o TieredCacheArrayOutput) ToTieredCacheArrayOutputWithContext(ctx context.Context) TieredCacheArrayOutput {
	return o
}

func (o TieredCacheArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*TieredCache] {
	return pulumix.Output[[]*TieredCache]{
		OutputState: o.OutputState,
	}
}

func (o TieredCacheArrayOutput) Index(i pulumi.IntInput) TieredCacheOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TieredCache {
		return vs[0].([]*TieredCache)[vs[1].(int)]
	}).(TieredCacheOutput)
}

type TieredCacheMapOutput struct{ *pulumi.OutputState }

func (TieredCacheMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TieredCache)(nil)).Elem()
}

func (o TieredCacheMapOutput) ToTieredCacheMapOutput() TieredCacheMapOutput {
	return o
}

func (o TieredCacheMapOutput) ToTieredCacheMapOutputWithContext(ctx context.Context) TieredCacheMapOutput {
	return o
}

func (o TieredCacheMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*TieredCache] {
	return pulumix.Output[map[string]*TieredCache]{
		OutputState: o.OutputState,
	}
}

func (o TieredCacheMapOutput) MapIndex(k pulumi.StringInput) TieredCacheOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TieredCache {
		return vs[0].(map[string]*TieredCache)[vs[1].(string)]
	}).(TieredCacheOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TieredCacheInput)(nil)).Elem(), &TieredCache{})
	pulumi.RegisterInputType(reflect.TypeOf((*TieredCacheArrayInput)(nil)).Elem(), TieredCacheArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TieredCacheMapInput)(nil)).Elem(), TieredCacheMap{})
	pulumi.RegisterOutputType(TieredCacheOutput{})
	pulumi.RegisterOutputType(TieredCacheArrayOutput{})
	pulumi.RegisterOutputType(TieredCacheMapOutput{})
}

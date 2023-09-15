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

// Provides a resource for managing Email Routing Addresses catch all behaviour.
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
//			_, err := cloudflare.NewEmailRoutingCatchAll(ctx, "example", &cloudflare.EmailRoutingCatchAllArgs{
//				Actions: cloudflare.EmailRoutingCatchAllActionArray{
//					&cloudflare.EmailRoutingCatchAllActionArgs{
//						Type: pulumi.String("forward"),
//						Values: pulumi.StringArray{
//							pulumi.String("destinationaddress@example.net"),
//						},
//					},
//				},
//				Enabled: pulumi.Bool(true),
//				Matchers: cloudflare.EmailRoutingCatchAllMatcherArray{
//					&cloudflare.EmailRoutingCatchAllMatcherArgs{
//						Type: pulumi.String("all"),
//					},
//				},
//				Name:   pulumi.String("example catch all"),
//				ZoneId: pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type EmailRoutingCatchAll struct {
	pulumi.CustomResourceState

	// List actions patterns.
	Actions EmailRoutingCatchAllActionArrayOutput `pulumi:"actions"`
	// Routing rule status.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Matching patterns to forward to your actions.
	Matchers EmailRoutingCatchAllMatcherArrayOutput `pulumi:"matchers"`
	// Routing rule name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Routing rule identifier.
	Tag pulumi.StringOutput `pulumi:"tag"`
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewEmailRoutingCatchAll registers a new resource with the given unique name, arguments, and options.
func NewEmailRoutingCatchAll(ctx *pulumi.Context,
	name string, args *EmailRoutingCatchAllArgs, opts ...pulumi.ResourceOption) (*EmailRoutingCatchAll, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Actions == nil {
		return nil, errors.New("invalid value for required argument 'Actions'")
	}
	if args.Matchers == nil {
		return nil, errors.New("invalid value for required argument 'Matchers'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EmailRoutingCatchAll
	err := ctx.RegisterResource("cloudflare:index/emailRoutingCatchAll:EmailRoutingCatchAll", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEmailRoutingCatchAll gets an existing EmailRoutingCatchAll resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEmailRoutingCatchAll(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EmailRoutingCatchAllState, opts ...pulumi.ResourceOption) (*EmailRoutingCatchAll, error) {
	var resource EmailRoutingCatchAll
	err := ctx.ReadResource("cloudflare:index/emailRoutingCatchAll:EmailRoutingCatchAll", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EmailRoutingCatchAll resources.
type emailRoutingCatchAllState struct {
	// List actions patterns.
	Actions []EmailRoutingCatchAllAction `pulumi:"actions"`
	// Routing rule status.
	Enabled *bool `pulumi:"enabled"`
	// Matching patterns to forward to your actions.
	Matchers []EmailRoutingCatchAllMatcher `pulumi:"matchers"`
	// Routing rule name.
	Name *string `pulumi:"name"`
	// Routing rule identifier.
	Tag *string `pulumi:"tag"`
	// The zone identifier to target for the resource.
	ZoneId *string `pulumi:"zoneId"`
}

type EmailRoutingCatchAllState struct {
	// List actions patterns.
	Actions EmailRoutingCatchAllActionArrayInput
	// Routing rule status.
	Enabled pulumi.BoolPtrInput
	// Matching patterns to forward to your actions.
	Matchers EmailRoutingCatchAllMatcherArrayInput
	// Routing rule name.
	Name pulumi.StringPtrInput
	// Routing rule identifier.
	Tag pulumi.StringPtrInput
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringPtrInput
}

func (EmailRoutingCatchAllState) ElementType() reflect.Type {
	return reflect.TypeOf((*emailRoutingCatchAllState)(nil)).Elem()
}

type emailRoutingCatchAllArgs struct {
	// List actions patterns.
	Actions []EmailRoutingCatchAllAction `pulumi:"actions"`
	// Routing rule status.
	Enabled *bool `pulumi:"enabled"`
	// Matching patterns to forward to your actions.
	Matchers []EmailRoutingCatchAllMatcher `pulumi:"matchers"`
	// Routing rule name.
	Name string `pulumi:"name"`
	// The zone identifier to target for the resource.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a EmailRoutingCatchAll resource.
type EmailRoutingCatchAllArgs struct {
	// List actions patterns.
	Actions EmailRoutingCatchAllActionArrayInput
	// Routing rule status.
	Enabled pulumi.BoolPtrInput
	// Matching patterns to forward to your actions.
	Matchers EmailRoutingCatchAllMatcherArrayInput
	// Routing rule name.
	Name pulumi.StringInput
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringInput
}

func (EmailRoutingCatchAllArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*emailRoutingCatchAllArgs)(nil)).Elem()
}

type EmailRoutingCatchAllInput interface {
	pulumi.Input

	ToEmailRoutingCatchAllOutput() EmailRoutingCatchAllOutput
	ToEmailRoutingCatchAllOutputWithContext(ctx context.Context) EmailRoutingCatchAllOutput
}

func (*EmailRoutingCatchAll) ElementType() reflect.Type {
	return reflect.TypeOf((**EmailRoutingCatchAll)(nil)).Elem()
}

func (i *EmailRoutingCatchAll) ToEmailRoutingCatchAllOutput() EmailRoutingCatchAllOutput {
	return i.ToEmailRoutingCatchAllOutputWithContext(context.Background())
}

func (i *EmailRoutingCatchAll) ToEmailRoutingCatchAllOutputWithContext(ctx context.Context) EmailRoutingCatchAllOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailRoutingCatchAllOutput)
}

func (i *EmailRoutingCatchAll) ToOutput(ctx context.Context) pulumix.Output[*EmailRoutingCatchAll] {
	return pulumix.Output[*EmailRoutingCatchAll]{
		OutputState: i.ToEmailRoutingCatchAllOutputWithContext(ctx).OutputState,
	}
}

// EmailRoutingCatchAllArrayInput is an input type that accepts EmailRoutingCatchAllArray and EmailRoutingCatchAllArrayOutput values.
// You can construct a concrete instance of `EmailRoutingCatchAllArrayInput` via:
//
//	EmailRoutingCatchAllArray{ EmailRoutingCatchAllArgs{...} }
type EmailRoutingCatchAllArrayInput interface {
	pulumi.Input

	ToEmailRoutingCatchAllArrayOutput() EmailRoutingCatchAllArrayOutput
	ToEmailRoutingCatchAllArrayOutputWithContext(context.Context) EmailRoutingCatchAllArrayOutput
}

type EmailRoutingCatchAllArray []EmailRoutingCatchAllInput

func (EmailRoutingCatchAllArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EmailRoutingCatchAll)(nil)).Elem()
}

func (i EmailRoutingCatchAllArray) ToEmailRoutingCatchAllArrayOutput() EmailRoutingCatchAllArrayOutput {
	return i.ToEmailRoutingCatchAllArrayOutputWithContext(context.Background())
}

func (i EmailRoutingCatchAllArray) ToEmailRoutingCatchAllArrayOutputWithContext(ctx context.Context) EmailRoutingCatchAllArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailRoutingCatchAllArrayOutput)
}

func (i EmailRoutingCatchAllArray) ToOutput(ctx context.Context) pulumix.Output[[]*EmailRoutingCatchAll] {
	return pulumix.Output[[]*EmailRoutingCatchAll]{
		OutputState: i.ToEmailRoutingCatchAllArrayOutputWithContext(ctx).OutputState,
	}
}

// EmailRoutingCatchAllMapInput is an input type that accepts EmailRoutingCatchAllMap and EmailRoutingCatchAllMapOutput values.
// You can construct a concrete instance of `EmailRoutingCatchAllMapInput` via:
//
//	EmailRoutingCatchAllMap{ "key": EmailRoutingCatchAllArgs{...} }
type EmailRoutingCatchAllMapInput interface {
	pulumi.Input

	ToEmailRoutingCatchAllMapOutput() EmailRoutingCatchAllMapOutput
	ToEmailRoutingCatchAllMapOutputWithContext(context.Context) EmailRoutingCatchAllMapOutput
}

type EmailRoutingCatchAllMap map[string]EmailRoutingCatchAllInput

func (EmailRoutingCatchAllMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EmailRoutingCatchAll)(nil)).Elem()
}

func (i EmailRoutingCatchAllMap) ToEmailRoutingCatchAllMapOutput() EmailRoutingCatchAllMapOutput {
	return i.ToEmailRoutingCatchAllMapOutputWithContext(context.Background())
}

func (i EmailRoutingCatchAllMap) ToEmailRoutingCatchAllMapOutputWithContext(ctx context.Context) EmailRoutingCatchAllMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailRoutingCatchAllMapOutput)
}

func (i EmailRoutingCatchAllMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*EmailRoutingCatchAll] {
	return pulumix.Output[map[string]*EmailRoutingCatchAll]{
		OutputState: i.ToEmailRoutingCatchAllMapOutputWithContext(ctx).OutputState,
	}
}

type EmailRoutingCatchAllOutput struct{ *pulumi.OutputState }

func (EmailRoutingCatchAllOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EmailRoutingCatchAll)(nil)).Elem()
}

func (o EmailRoutingCatchAllOutput) ToEmailRoutingCatchAllOutput() EmailRoutingCatchAllOutput {
	return o
}

func (o EmailRoutingCatchAllOutput) ToEmailRoutingCatchAllOutputWithContext(ctx context.Context) EmailRoutingCatchAllOutput {
	return o
}

func (o EmailRoutingCatchAllOutput) ToOutput(ctx context.Context) pulumix.Output[*EmailRoutingCatchAll] {
	return pulumix.Output[*EmailRoutingCatchAll]{
		OutputState: o.OutputState,
	}
}

// List actions patterns.
func (o EmailRoutingCatchAllOutput) Actions() EmailRoutingCatchAllActionArrayOutput {
	return o.ApplyT(func(v *EmailRoutingCatchAll) EmailRoutingCatchAllActionArrayOutput { return v.Actions }).(EmailRoutingCatchAllActionArrayOutput)
}

// Routing rule status.
func (o EmailRoutingCatchAllOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EmailRoutingCatchAll) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Matching patterns to forward to your actions.
func (o EmailRoutingCatchAllOutput) Matchers() EmailRoutingCatchAllMatcherArrayOutput {
	return o.ApplyT(func(v *EmailRoutingCatchAll) EmailRoutingCatchAllMatcherArrayOutput { return v.Matchers }).(EmailRoutingCatchAllMatcherArrayOutput)
}

// Routing rule name.
func (o EmailRoutingCatchAllOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailRoutingCatchAll) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Routing rule identifier.
func (o EmailRoutingCatchAllOutput) Tag() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailRoutingCatchAll) pulumi.StringOutput { return v.Tag }).(pulumi.StringOutput)
}

// The zone identifier to target for the resource.
func (o EmailRoutingCatchAllOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailRoutingCatchAll) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type EmailRoutingCatchAllArrayOutput struct{ *pulumi.OutputState }

func (EmailRoutingCatchAllArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EmailRoutingCatchAll)(nil)).Elem()
}

func (o EmailRoutingCatchAllArrayOutput) ToEmailRoutingCatchAllArrayOutput() EmailRoutingCatchAllArrayOutput {
	return o
}

func (o EmailRoutingCatchAllArrayOutput) ToEmailRoutingCatchAllArrayOutputWithContext(ctx context.Context) EmailRoutingCatchAllArrayOutput {
	return o
}

func (o EmailRoutingCatchAllArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*EmailRoutingCatchAll] {
	return pulumix.Output[[]*EmailRoutingCatchAll]{
		OutputState: o.OutputState,
	}
}

func (o EmailRoutingCatchAllArrayOutput) Index(i pulumi.IntInput) EmailRoutingCatchAllOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EmailRoutingCatchAll {
		return vs[0].([]*EmailRoutingCatchAll)[vs[1].(int)]
	}).(EmailRoutingCatchAllOutput)
}

type EmailRoutingCatchAllMapOutput struct{ *pulumi.OutputState }

func (EmailRoutingCatchAllMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EmailRoutingCatchAll)(nil)).Elem()
}

func (o EmailRoutingCatchAllMapOutput) ToEmailRoutingCatchAllMapOutput() EmailRoutingCatchAllMapOutput {
	return o
}

func (o EmailRoutingCatchAllMapOutput) ToEmailRoutingCatchAllMapOutputWithContext(ctx context.Context) EmailRoutingCatchAllMapOutput {
	return o
}

func (o EmailRoutingCatchAllMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*EmailRoutingCatchAll] {
	return pulumix.Output[map[string]*EmailRoutingCatchAll]{
		OutputState: o.OutputState,
	}
}

func (o EmailRoutingCatchAllMapOutput) MapIndex(k pulumi.StringInput) EmailRoutingCatchAllOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EmailRoutingCatchAll {
		return vs[0].(map[string]*EmailRoutingCatchAll)[vs[1].(string)]
	}).(EmailRoutingCatchAllOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EmailRoutingCatchAllInput)(nil)).Elem(), &EmailRoutingCatchAll{})
	pulumi.RegisterInputType(reflect.TypeOf((*EmailRoutingCatchAllArrayInput)(nil)).Elem(), EmailRoutingCatchAllArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EmailRoutingCatchAllMapInput)(nil)).Elem(), EmailRoutingCatchAllMap{})
	pulumi.RegisterOutputType(EmailRoutingCatchAllOutput{})
	pulumi.RegisterOutputType(EmailRoutingCatchAllArrayOutput{})
	pulumi.RegisterOutputType(EmailRoutingCatchAllMapOutput{})
}

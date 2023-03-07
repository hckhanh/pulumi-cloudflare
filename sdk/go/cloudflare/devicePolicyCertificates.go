// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare device policy certificates resource. Device
// policy certificate resources enable client device certificate
// generation.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v4/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudflare.NewDevicePolicyCertificates(ctx, "example", &cloudflare.DevicePolicyCertificatesArgs{
//				Enabled: pulumi.Bool(true),
//				ZoneId:  pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
//
//	$ pulumi import cloudflare:index/devicePolicyCertificates:DevicePolicyCertificates example <zone_id>
//
// ```
type DevicePolicyCertificates struct {
	pulumi.CustomResourceState

	// `true` if certificate generation is enabled.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewDevicePolicyCertificates registers a new resource with the given unique name, arguments, and options.
func NewDevicePolicyCertificates(ctx *pulumi.Context,
	name string, args *DevicePolicyCertificatesArgs, opts ...pulumi.ResourceOption) (*DevicePolicyCertificates, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource DevicePolicyCertificates
	err := ctx.RegisterResource("cloudflare:index/devicePolicyCertificates:DevicePolicyCertificates", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDevicePolicyCertificates gets an existing DevicePolicyCertificates resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDevicePolicyCertificates(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DevicePolicyCertificatesState, opts ...pulumi.ResourceOption) (*DevicePolicyCertificates, error) {
	var resource DevicePolicyCertificates
	err := ctx.ReadResource("cloudflare:index/devicePolicyCertificates:DevicePolicyCertificates", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DevicePolicyCertificates resources.
type devicePolicyCertificatesState struct {
	// `true` if certificate generation is enabled.
	Enabled *bool `pulumi:"enabled"`
	// The zone identifier to target for the resource.
	ZoneId *string `pulumi:"zoneId"`
}

type DevicePolicyCertificatesState struct {
	// `true` if certificate generation is enabled.
	Enabled pulumi.BoolPtrInput
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringPtrInput
}

func (DevicePolicyCertificatesState) ElementType() reflect.Type {
	return reflect.TypeOf((*devicePolicyCertificatesState)(nil)).Elem()
}

type devicePolicyCertificatesArgs struct {
	// `true` if certificate generation is enabled.
	Enabled bool `pulumi:"enabled"`
	// The zone identifier to target for the resource.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a DevicePolicyCertificates resource.
type DevicePolicyCertificatesArgs struct {
	// `true` if certificate generation is enabled.
	Enabled pulumi.BoolInput
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringInput
}

func (DevicePolicyCertificatesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*devicePolicyCertificatesArgs)(nil)).Elem()
}

type DevicePolicyCertificatesInput interface {
	pulumi.Input

	ToDevicePolicyCertificatesOutput() DevicePolicyCertificatesOutput
	ToDevicePolicyCertificatesOutputWithContext(ctx context.Context) DevicePolicyCertificatesOutput
}

func (*DevicePolicyCertificates) ElementType() reflect.Type {
	return reflect.TypeOf((**DevicePolicyCertificates)(nil)).Elem()
}

func (i *DevicePolicyCertificates) ToDevicePolicyCertificatesOutput() DevicePolicyCertificatesOutput {
	return i.ToDevicePolicyCertificatesOutputWithContext(context.Background())
}

func (i *DevicePolicyCertificates) ToDevicePolicyCertificatesOutputWithContext(ctx context.Context) DevicePolicyCertificatesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevicePolicyCertificatesOutput)
}

// DevicePolicyCertificatesArrayInput is an input type that accepts DevicePolicyCertificatesArray and DevicePolicyCertificatesArrayOutput values.
// You can construct a concrete instance of `DevicePolicyCertificatesArrayInput` via:
//
//	DevicePolicyCertificatesArray{ DevicePolicyCertificatesArgs{...} }
type DevicePolicyCertificatesArrayInput interface {
	pulumi.Input

	ToDevicePolicyCertificatesArrayOutput() DevicePolicyCertificatesArrayOutput
	ToDevicePolicyCertificatesArrayOutputWithContext(context.Context) DevicePolicyCertificatesArrayOutput
}

type DevicePolicyCertificatesArray []DevicePolicyCertificatesInput

func (DevicePolicyCertificatesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DevicePolicyCertificates)(nil)).Elem()
}

func (i DevicePolicyCertificatesArray) ToDevicePolicyCertificatesArrayOutput() DevicePolicyCertificatesArrayOutput {
	return i.ToDevicePolicyCertificatesArrayOutputWithContext(context.Background())
}

func (i DevicePolicyCertificatesArray) ToDevicePolicyCertificatesArrayOutputWithContext(ctx context.Context) DevicePolicyCertificatesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevicePolicyCertificatesArrayOutput)
}

// DevicePolicyCertificatesMapInput is an input type that accepts DevicePolicyCertificatesMap and DevicePolicyCertificatesMapOutput values.
// You can construct a concrete instance of `DevicePolicyCertificatesMapInput` via:
//
//	DevicePolicyCertificatesMap{ "key": DevicePolicyCertificatesArgs{...} }
type DevicePolicyCertificatesMapInput interface {
	pulumi.Input

	ToDevicePolicyCertificatesMapOutput() DevicePolicyCertificatesMapOutput
	ToDevicePolicyCertificatesMapOutputWithContext(context.Context) DevicePolicyCertificatesMapOutput
}

type DevicePolicyCertificatesMap map[string]DevicePolicyCertificatesInput

func (DevicePolicyCertificatesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DevicePolicyCertificates)(nil)).Elem()
}

func (i DevicePolicyCertificatesMap) ToDevicePolicyCertificatesMapOutput() DevicePolicyCertificatesMapOutput {
	return i.ToDevicePolicyCertificatesMapOutputWithContext(context.Background())
}

func (i DevicePolicyCertificatesMap) ToDevicePolicyCertificatesMapOutputWithContext(ctx context.Context) DevicePolicyCertificatesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DevicePolicyCertificatesMapOutput)
}

type DevicePolicyCertificatesOutput struct{ *pulumi.OutputState }

func (DevicePolicyCertificatesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DevicePolicyCertificates)(nil)).Elem()
}

func (o DevicePolicyCertificatesOutput) ToDevicePolicyCertificatesOutput() DevicePolicyCertificatesOutput {
	return o
}

func (o DevicePolicyCertificatesOutput) ToDevicePolicyCertificatesOutputWithContext(ctx context.Context) DevicePolicyCertificatesOutput {
	return o
}

// `true` if certificate generation is enabled.
func (o DevicePolicyCertificatesOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *DevicePolicyCertificates) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// The zone identifier to target for the resource.
func (o DevicePolicyCertificatesOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *DevicePolicyCertificates) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type DevicePolicyCertificatesArrayOutput struct{ *pulumi.OutputState }

func (DevicePolicyCertificatesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DevicePolicyCertificates)(nil)).Elem()
}

func (o DevicePolicyCertificatesArrayOutput) ToDevicePolicyCertificatesArrayOutput() DevicePolicyCertificatesArrayOutput {
	return o
}

func (o DevicePolicyCertificatesArrayOutput) ToDevicePolicyCertificatesArrayOutputWithContext(ctx context.Context) DevicePolicyCertificatesArrayOutput {
	return o
}

func (o DevicePolicyCertificatesArrayOutput) Index(i pulumi.IntInput) DevicePolicyCertificatesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DevicePolicyCertificates {
		return vs[0].([]*DevicePolicyCertificates)[vs[1].(int)]
	}).(DevicePolicyCertificatesOutput)
}

type DevicePolicyCertificatesMapOutput struct{ *pulumi.OutputState }

func (DevicePolicyCertificatesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DevicePolicyCertificates)(nil)).Elem()
}

func (o DevicePolicyCertificatesMapOutput) ToDevicePolicyCertificatesMapOutput() DevicePolicyCertificatesMapOutput {
	return o
}

func (o DevicePolicyCertificatesMapOutput) ToDevicePolicyCertificatesMapOutputWithContext(ctx context.Context) DevicePolicyCertificatesMapOutput {
	return o
}

func (o DevicePolicyCertificatesMapOutput) MapIndex(k pulumi.StringInput) DevicePolicyCertificatesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DevicePolicyCertificates {
		return vs[0].(map[string]*DevicePolicyCertificates)[vs[1].(string)]
	}).(DevicePolicyCertificatesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DevicePolicyCertificatesInput)(nil)).Elem(), &DevicePolicyCertificates{})
	pulumi.RegisterInputType(reflect.TypeOf((*DevicePolicyCertificatesArrayInput)(nil)).Elem(), DevicePolicyCertificatesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DevicePolicyCertificatesMapInput)(nil)).Elem(), DevicePolicyCertificatesMap{})
	pulumi.RegisterOutputType(DevicePolicyCertificatesOutput{})
	pulumi.RegisterOutputType(DevicePolicyCertificatesArrayOutput{})
	pulumi.RegisterOutputType(DevicePolicyCertificatesMapOutput{})
}

// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare Device Dex Test resource. Device Dex Tests allow for building location-aware device settings policies.
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
//			_, err := cloudflare.NewDeviceDexTest(ctx, "example", &cloudflare.DeviceDexTestArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Data: &cloudflare.DeviceDexTestDataArgs{
//					Host:   pulumi.String("https://example.com/home"),
//					Kind:   pulumi.String("http"),
//					Method: pulumi.String("GET"),
//				},
//				Description: pulumi.String("Send a HTTP GET request to the home endpoint every half hour."),
//				Enabled:     pulumi.Bool(true),
//				Interval:    pulumi.String("0h30m0s"),
//				Name:        pulumi.String("GET homepage"),
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
//	$ pulumi import cloudflare:index/deviceDexTest:DeviceDexTest example <account_id>/<device_dex_test_id>
//
// ```
type DeviceDexTest struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Timestamp of when the Dex Test was created.
	Created pulumi.StringOutput `pulumi:"created"`
	// The configuration object which contains the details for the WARP client to conduct the test.
	Data DeviceDexTestDataOutput `pulumi:"data"`
	// Additional details about the test.
	Description pulumi.StringOutput `pulumi:"description"`
	// Determines whether or not the test is active.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// How often the test will run.
	Interval pulumi.StringOutput `pulumi:"interval"`
	// The name of the Device Dex Test. Must be unique.
	Name pulumi.StringOutput `pulumi:"name"`
	// Timestamp of when the Dex Test was last updated.
	Updated pulumi.StringOutput `pulumi:"updated"`
}

// NewDeviceDexTest registers a new resource with the given unique name, arguments, and options.
func NewDeviceDexTest(ctx *pulumi.Context,
	name string, args *DeviceDexTestArgs, opts ...pulumi.ResourceOption) (*DeviceDexTest, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Data == nil {
		return nil, errors.New("invalid value for required argument 'Data'")
	}
	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.Interval == nil {
		return nil, errors.New("invalid value for required argument 'Interval'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	var resource DeviceDexTest
	err := ctx.RegisterResource("cloudflare:index/deviceDexTest:DeviceDexTest", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDeviceDexTest gets an existing DeviceDexTest resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDeviceDexTest(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DeviceDexTestState, opts ...pulumi.ResourceOption) (*DeviceDexTest, error) {
	var resource DeviceDexTest
	err := ctx.ReadResource("cloudflare:index/deviceDexTest:DeviceDexTest", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DeviceDexTest resources.
type deviceDexTestState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// Timestamp of when the Dex Test was created.
	Created *string `pulumi:"created"`
	// The configuration object which contains the details for the WARP client to conduct the test.
	Data *DeviceDexTestData `pulumi:"data"`
	// Additional details about the test.
	Description *string `pulumi:"description"`
	// Determines whether or not the test is active.
	Enabled *bool `pulumi:"enabled"`
	// How often the test will run.
	Interval *string `pulumi:"interval"`
	// The name of the Device Dex Test. Must be unique.
	Name *string `pulumi:"name"`
	// Timestamp of when the Dex Test was last updated.
	Updated *string `pulumi:"updated"`
}

type DeviceDexTestState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// Timestamp of when the Dex Test was created.
	Created pulumi.StringPtrInput
	// The configuration object which contains the details for the WARP client to conduct the test.
	Data DeviceDexTestDataPtrInput
	// Additional details about the test.
	Description pulumi.StringPtrInput
	// Determines whether or not the test is active.
	Enabled pulumi.BoolPtrInput
	// How often the test will run.
	Interval pulumi.StringPtrInput
	// The name of the Device Dex Test. Must be unique.
	Name pulumi.StringPtrInput
	// Timestamp of when the Dex Test was last updated.
	Updated pulumi.StringPtrInput
}

func (DeviceDexTestState) ElementType() reflect.Type {
	return reflect.TypeOf((*deviceDexTestState)(nil)).Elem()
}

type deviceDexTestArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId string `pulumi:"accountId"`
	// The configuration object which contains the details for the WARP client to conduct the test.
	Data DeviceDexTestData `pulumi:"data"`
	// Additional details about the test.
	Description string `pulumi:"description"`
	// Determines whether or not the test is active.
	Enabled bool `pulumi:"enabled"`
	// How often the test will run.
	Interval string `pulumi:"interval"`
	// The name of the Device Dex Test. Must be unique.
	Name string `pulumi:"name"`
}

// The set of arguments for constructing a DeviceDexTest resource.
type DeviceDexTestArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringInput
	// The configuration object which contains the details for the WARP client to conduct the test.
	Data DeviceDexTestDataInput
	// Additional details about the test.
	Description pulumi.StringInput
	// Determines whether or not the test is active.
	Enabled pulumi.BoolInput
	// How often the test will run.
	Interval pulumi.StringInput
	// The name of the Device Dex Test. Must be unique.
	Name pulumi.StringInput
}

func (DeviceDexTestArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*deviceDexTestArgs)(nil)).Elem()
}

type DeviceDexTestInput interface {
	pulumi.Input

	ToDeviceDexTestOutput() DeviceDexTestOutput
	ToDeviceDexTestOutputWithContext(ctx context.Context) DeviceDexTestOutput
}

func (*DeviceDexTest) ElementType() reflect.Type {
	return reflect.TypeOf((**DeviceDexTest)(nil)).Elem()
}

func (i *DeviceDexTest) ToDeviceDexTestOutput() DeviceDexTestOutput {
	return i.ToDeviceDexTestOutputWithContext(context.Background())
}

func (i *DeviceDexTest) ToDeviceDexTestOutputWithContext(ctx context.Context) DeviceDexTestOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceDexTestOutput)
}

// DeviceDexTestArrayInput is an input type that accepts DeviceDexTestArray and DeviceDexTestArrayOutput values.
// You can construct a concrete instance of `DeviceDexTestArrayInput` via:
//
//	DeviceDexTestArray{ DeviceDexTestArgs{...} }
type DeviceDexTestArrayInput interface {
	pulumi.Input

	ToDeviceDexTestArrayOutput() DeviceDexTestArrayOutput
	ToDeviceDexTestArrayOutputWithContext(context.Context) DeviceDexTestArrayOutput
}

type DeviceDexTestArray []DeviceDexTestInput

func (DeviceDexTestArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeviceDexTest)(nil)).Elem()
}

func (i DeviceDexTestArray) ToDeviceDexTestArrayOutput() DeviceDexTestArrayOutput {
	return i.ToDeviceDexTestArrayOutputWithContext(context.Background())
}

func (i DeviceDexTestArray) ToDeviceDexTestArrayOutputWithContext(ctx context.Context) DeviceDexTestArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceDexTestArrayOutput)
}

// DeviceDexTestMapInput is an input type that accepts DeviceDexTestMap and DeviceDexTestMapOutput values.
// You can construct a concrete instance of `DeviceDexTestMapInput` via:
//
//	DeviceDexTestMap{ "key": DeviceDexTestArgs{...} }
type DeviceDexTestMapInput interface {
	pulumi.Input

	ToDeviceDexTestMapOutput() DeviceDexTestMapOutput
	ToDeviceDexTestMapOutputWithContext(context.Context) DeviceDexTestMapOutput
}

type DeviceDexTestMap map[string]DeviceDexTestInput

func (DeviceDexTestMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeviceDexTest)(nil)).Elem()
}

func (i DeviceDexTestMap) ToDeviceDexTestMapOutput() DeviceDexTestMapOutput {
	return i.ToDeviceDexTestMapOutputWithContext(context.Background())
}

func (i DeviceDexTestMap) ToDeviceDexTestMapOutputWithContext(ctx context.Context) DeviceDexTestMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceDexTestMapOutput)
}

type DeviceDexTestOutput struct{ *pulumi.OutputState }

func (DeviceDexTestOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DeviceDexTest)(nil)).Elem()
}

func (o DeviceDexTestOutput) ToDeviceDexTestOutput() DeviceDexTestOutput {
	return o
}

func (o DeviceDexTestOutput) ToDeviceDexTestOutputWithContext(ctx context.Context) DeviceDexTestOutput {
	return o
}

// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o DeviceDexTestOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *DeviceDexTest) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Timestamp of when the Dex Test was created.
func (o DeviceDexTestOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *DeviceDexTest) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// The configuration object which contains the details for the WARP client to conduct the test.
func (o DeviceDexTestOutput) Data() DeviceDexTestDataOutput {
	return o.ApplyT(func(v *DeviceDexTest) DeviceDexTestDataOutput { return v.Data }).(DeviceDexTestDataOutput)
}

// Additional details about the test.
func (o DeviceDexTestOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *DeviceDexTest) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Determines whether or not the test is active.
func (o DeviceDexTestOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *DeviceDexTest) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// How often the test will run.
func (o DeviceDexTestOutput) Interval() pulumi.StringOutput {
	return o.ApplyT(func(v *DeviceDexTest) pulumi.StringOutput { return v.Interval }).(pulumi.StringOutput)
}

// The name of the Device Dex Test. Must be unique.
func (o DeviceDexTestOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DeviceDexTest) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Timestamp of when the Dex Test was last updated.
func (o DeviceDexTestOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v *DeviceDexTest) pulumi.StringOutput { return v.Updated }).(pulumi.StringOutput)
}

type DeviceDexTestArrayOutput struct{ *pulumi.OutputState }

func (DeviceDexTestArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeviceDexTest)(nil)).Elem()
}

func (o DeviceDexTestArrayOutput) ToDeviceDexTestArrayOutput() DeviceDexTestArrayOutput {
	return o
}

func (o DeviceDexTestArrayOutput) ToDeviceDexTestArrayOutputWithContext(ctx context.Context) DeviceDexTestArrayOutput {
	return o
}

func (o DeviceDexTestArrayOutput) Index(i pulumi.IntInput) DeviceDexTestOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DeviceDexTest {
		return vs[0].([]*DeviceDexTest)[vs[1].(int)]
	}).(DeviceDexTestOutput)
}

type DeviceDexTestMapOutput struct{ *pulumi.OutputState }

func (DeviceDexTestMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeviceDexTest)(nil)).Elem()
}

func (o DeviceDexTestMapOutput) ToDeviceDexTestMapOutput() DeviceDexTestMapOutput {
	return o
}

func (o DeviceDexTestMapOutput) ToDeviceDexTestMapOutputWithContext(ctx context.Context) DeviceDexTestMapOutput {
	return o
}

func (o DeviceDexTestMapOutput) MapIndex(k pulumi.StringInput) DeviceDexTestOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DeviceDexTest {
		return vs[0].(map[string]*DeviceDexTest)[vs[1].(string)]
	}).(DeviceDexTestOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceDexTestInput)(nil)).Elem(), &DeviceDexTest{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceDexTestArrayInput)(nil)).Elem(), DeviceDexTestArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceDexTestMapInput)(nil)).Elem(), DeviceDexTestMap{})
	pulumi.RegisterOutputType(DeviceDexTestOutput{})
	pulumi.RegisterOutputType(DeviceDexTestArrayOutput{})
	pulumi.RegisterOutputType(DeviceDexTestMapOutput{})
}

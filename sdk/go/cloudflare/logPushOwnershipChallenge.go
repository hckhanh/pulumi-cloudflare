// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource which manages Cloudflare Logpush ownership challenges to use
// in a Logpush Job. On it's own, doesn't do much however this resource should
// be used in conjunction to create Logpush jobs.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v4/go/cloudflare"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudflare.NewLogPushOwnershipChallenge(ctx, "example", &cloudflare.LogPushOwnershipChallengeArgs{
// 			DestinationConf: pulumi.String("s3://my-bucket-path?region=us-west-2"),
// 			ZoneId:          pulumi.String("d41d8cd98f00b204e9800998ecf8427e"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v4/go/cloudflare"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudflare.NewLogPushOwnershipChallenge(ctx, "example", &cloudflare.LogPushOwnershipChallengeArgs{
// 			AccountId:       pulumi.String("1d5fdc9e88c8a8c4518b068cd94331fe"),
// 			DestinationConf: pulumi.String("s3://my-bucket-path?region=us-west-2"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type LogPushOwnershipChallenge struct {
	pulumi.CustomResourceState

	// The account ID where the logpush ownership challenge should be created. Either `accountId` or `zoneId` are required.
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination).
	DestinationConf pulumi.StringOutput `pulumi:"destinationConf"`
	// The filename of the ownership challenge which
	// contains the contents required for Logpush Job creation.
	OwnershipChallengeFilename pulumi.StringOutput `pulumi:"ownershipChallengeFilename"`
	// The zone ID where the logpush ownership challenge should be created. Either `accountId` or `zoneId` are required.
	ZoneId pulumi.StringPtrOutput `pulumi:"zoneId"`
}

// NewLogPushOwnershipChallenge registers a new resource with the given unique name, arguments, and options.
func NewLogPushOwnershipChallenge(ctx *pulumi.Context,
	name string, args *LogPushOwnershipChallengeArgs, opts ...pulumi.ResourceOption) (*LogPushOwnershipChallenge, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DestinationConf == nil {
		return nil, errors.New("invalid value for required argument 'DestinationConf'")
	}
	var resource LogPushOwnershipChallenge
	err := ctx.RegisterResource("cloudflare:index/logPushOwnershipChallenge:LogPushOwnershipChallenge", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLogPushOwnershipChallenge gets an existing LogPushOwnershipChallenge resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogPushOwnershipChallenge(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LogPushOwnershipChallengeState, opts ...pulumi.ResourceOption) (*LogPushOwnershipChallenge, error) {
	var resource LogPushOwnershipChallenge
	err := ctx.ReadResource("cloudflare:index/logPushOwnershipChallenge:LogPushOwnershipChallenge", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LogPushOwnershipChallenge resources.
type logPushOwnershipChallengeState struct {
	// The account ID where the logpush ownership challenge should be created. Either `accountId` or `zoneId` are required.
	AccountId *string `pulumi:"accountId"`
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination).
	DestinationConf *string `pulumi:"destinationConf"`
	// The filename of the ownership challenge which
	// contains the contents required for Logpush Job creation.
	OwnershipChallengeFilename *string `pulumi:"ownershipChallengeFilename"`
	// The zone ID where the logpush ownership challenge should be created. Either `accountId` or `zoneId` are required.
	ZoneId *string `pulumi:"zoneId"`
}

type LogPushOwnershipChallengeState struct {
	// The account ID where the logpush ownership challenge should be created. Either `accountId` or `zoneId` are required.
	AccountId pulumi.StringPtrInput
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination).
	DestinationConf pulumi.StringPtrInput
	// The filename of the ownership challenge which
	// contains the contents required for Logpush Job creation.
	OwnershipChallengeFilename pulumi.StringPtrInput
	// The zone ID where the logpush ownership challenge should be created. Either `accountId` or `zoneId` are required.
	ZoneId pulumi.StringPtrInput
}

func (LogPushOwnershipChallengeState) ElementType() reflect.Type {
	return reflect.TypeOf((*logPushOwnershipChallengeState)(nil)).Elem()
}

type logPushOwnershipChallengeArgs struct {
	// The account ID where the logpush ownership challenge should be created. Either `accountId` or `zoneId` are required.
	AccountId *string `pulumi:"accountId"`
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination).
	DestinationConf string `pulumi:"destinationConf"`
	// The zone ID where the logpush ownership challenge should be created. Either `accountId` or `zoneId` are required.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a LogPushOwnershipChallenge resource.
type LogPushOwnershipChallengeArgs struct {
	// The account ID where the logpush ownership challenge should be created. Either `accountId` or `zoneId` are required.
	AccountId pulumi.StringPtrInput
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination).
	DestinationConf pulumi.StringInput
	// The zone ID where the logpush ownership challenge should be created. Either `accountId` or `zoneId` are required.
	ZoneId pulumi.StringPtrInput
}

func (LogPushOwnershipChallengeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logPushOwnershipChallengeArgs)(nil)).Elem()
}

type LogPushOwnershipChallengeInput interface {
	pulumi.Input

	ToLogPushOwnershipChallengeOutput() LogPushOwnershipChallengeOutput
	ToLogPushOwnershipChallengeOutputWithContext(ctx context.Context) LogPushOwnershipChallengeOutput
}

func (*LogPushOwnershipChallenge) ElementType() reflect.Type {
	return reflect.TypeOf((**LogPushOwnershipChallenge)(nil)).Elem()
}

func (i *LogPushOwnershipChallenge) ToLogPushOwnershipChallengeOutput() LogPushOwnershipChallengeOutput {
	return i.ToLogPushOwnershipChallengeOutputWithContext(context.Background())
}

func (i *LogPushOwnershipChallenge) ToLogPushOwnershipChallengeOutputWithContext(ctx context.Context) LogPushOwnershipChallengeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogPushOwnershipChallengeOutput)
}

// LogPushOwnershipChallengeArrayInput is an input type that accepts LogPushOwnershipChallengeArray and LogPushOwnershipChallengeArrayOutput values.
// You can construct a concrete instance of `LogPushOwnershipChallengeArrayInput` via:
//
//          LogPushOwnershipChallengeArray{ LogPushOwnershipChallengeArgs{...} }
type LogPushOwnershipChallengeArrayInput interface {
	pulumi.Input

	ToLogPushOwnershipChallengeArrayOutput() LogPushOwnershipChallengeArrayOutput
	ToLogPushOwnershipChallengeArrayOutputWithContext(context.Context) LogPushOwnershipChallengeArrayOutput
}

type LogPushOwnershipChallengeArray []LogPushOwnershipChallengeInput

func (LogPushOwnershipChallengeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogPushOwnershipChallenge)(nil)).Elem()
}

func (i LogPushOwnershipChallengeArray) ToLogPushOwnershipChallengeArrayOutput() LogPushOwnershipChallengeArrayOutput {
	return i.ToLogPushOwnershipChallengeArrayOutputWithContext(context.Background())
}

func (i LogPushOwnershipChallengeArray) ToLogPushOwnershipChallengeArrayOutputWithContext(ctx context.Context) LogPushOwnershipChallengeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogPushOwnershipChallengeArrayOutput)
}

// LogPushOwnershipChallengeMapInput is an input type that accepts LogPushOwnershipChallengeMap and LogPushOwnershipChallengeMapOutput values.
// You can construct a concrete instance of `LogPushOwnershipChallengeMapInput` via:
//
//          LogPushOwnershipChallengeMap{ "key": LogPushOwnershipChallengeArgs{...} }
type LogPushOwnershipChallengeMapInput interface {
	pulumi.Input

	ToLogPushOwnershipChallengeMapOutput() LogPushOwnershipChallengeMapOutput
	ToLogPushOwnershipChallengeMapOutputWithContext(context.Context) LogPushOwnershipChallengeMapOutput
}

type LogPushOwnershipChallengeMap map[string]LogPushOwnershipChallengeInput

func (LogPushOwnershipChallengeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogPushOwnershipChallenge)(nil)).Elem()
}

func (i LogPushOwnershipChallengeMap) ToLogPushOwnershipChallengeMapOutput() LogPushOwnershipChallengeMapOutput {
	return i.ToLogPushOwnershipChallengeMapOutputWithContext(context.Background())
}

func (i LogPushOwnershipChallengeMap) ToLogPushOwnershipChallengeMapOutputWithContext(ctx context.Context) LogPushOwnershipChallengeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogPushOwnershipChallengeMapOutput)
}

type LogPushOwnershipChallengeOutput struct{ *pulumi.OutputState }

func (LogPushOwnershipChallengeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogPushOwnershipChallenge)(nil)).Elem()
}

func (o LogPushOwnershipChallengeOutput) ToLogPushOwnershipChallengeOutput() LogPushOwnershipChallengeOutput {
	return o
}

func (o LogPushOwnershipChallengeOutput) ToLogPushOwnershipChallengeOutputWithContext(ctx context.Context) LogPushOwnershipChallengeOutput {
	return o
}

// The account ID where the logpush ownership challenge should be created. Either `accountId` or `zoneId` are required.
func (o LogPushOwnershipChallengeOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogPushOwnershipChallenge) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination).
func (o LogPushOwnershipChallengeOutput) DestinationConf() pulumi.StringOutput {
	return o.ApplyT(func(v *LogPushOwnershipChallenge) pulumi.StringOutput { return v.DestinationConf }).(pulumi.StringOutput)
}

// The filename of the ownership challenge which
// contains the contents required for Logpush Job creation.
func (o LogPushOwnershipChallengeOutput) OwnershipChallengeFilename() pulumi.StringOutput {
	return o.ApplyT(func(v *LogPushOwnershipChallenge) pulumi.StringOutput { return v.OwnershipChallengeFilename }).(pulumi.StringOutput)
}

// The zone ID where the logpush ownership challenge should be created. Either `accountId` or `zoneId` are required.
func (o LogPushOwnershipChallengeOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogPushOwnershipChallenge) pulumi.StringPtrOutput { return v.ZoneId }).(pulumi.StringPtrOutput)
}

type LogPushOwnershipChallengeArrayOutput struct{ *pulumi.OutputState }

func (LogPushOwnershipChallengeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogPushOwnershipChallenge)(nil)).Elem()
}

func (o LogPushOwnershipChallengeArrayOutput) ToLogPushOwnershipChallengeArrayOutput() LogPushOwnershipChallengeArrayOutput {
	return o
}

func (o LogPushOwnershipChallengeArrayOutput) ToLogPushOwnershipChallengeArrayOutputWithContext(ctx context.Context) LogPushOwnershipChallengeArrayOutput {
	return o
}

func (o LogPushOwnershipChallengeArrayOutput) Index(i pulumi.IntInput) LogPushOwnershipChallengeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LogPushOwnershipChallenge {
		return vs[0].([]*LogPushOwnershipChallenge)[vs[1].(int)]
	}).(LogPushOwnershipChallengeOutput)
}

type LogPushOwnershipChallengeMapOutput struct{ *pulumi.OutputState }

func (LogPushOwnershipChallengeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogPushOwnershipChallenge)(nil)).Elem()
}

func (o LogPushOwnershipChallengeMapOutput) ToLogPushOwnershipChallengeMapOutput() LogPushOwnershipChallengeMapOutput {
	return o
}

func (o LogPushOwnershipChallengeMapOutput) ToLogPushOwnershipChallengeMapOutputWithContext(ctx context.Context) LogPushOwnershipChallengeMapOutput {
	return o
}

func (o LogPushOwnershipChallengeMapOutput) MapIndex(k pulumi.StringInput) LogPushOwnershipChallengeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LogPushOwnershipChallenge {
		return vs[0].(map[string]*LogPushOwnershipChallenge)[vs[1].(string)]
	}).(LogPushOwnershipChallengeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LogPushOwnershipChallengeInput)(nil)).Elem(), &LogPushOwnershipChallenge{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogPushOwnershipChallengeArrayInput)(nil)).Elem(), LogPushOwnershipChallengeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogPushOwnershipChallengeMapInput)(nil)).Elem(), LogPushOwnershipChallengeMap{})
	pulumi.RegisterOutputType(LogPushOwnershipChallengeOutput{})
	pulumi.RegisterOutputType(LogPushOwnershipChallengeArrayOutput{})
	pulumi.RegisterOutputType(LogPushOwnershipChallengeMapOutput{})
}

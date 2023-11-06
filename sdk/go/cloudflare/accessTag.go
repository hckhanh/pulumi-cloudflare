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

// Provides a resource to customize the pages your end users will see
// when trying to reach applications behind Cloudflare Access.
type AccessTag struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// Number of apps associated with the tag.
	AppCount pulumi.IntOutput `pulumi:"appCount"`
	// Friendly name of the Access Tag.
	Name pulumi.StringOutput `pulumi:"name"`
	// The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrOutput `pulumi:"zoneId"`
}

// NewAccessTag registers a new resource with the given unique name, arguments, and options.
func NewAccessTag(ctx *pulumi.Context,
	name string, args *AccessTagArgs, opts ...pulumi.ResourceOption) (*AccessTag, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AccessTag
	err := ctx.RegisterResource("cloudflare:index/accessTag:AccessTag", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessTag gets an existing AccessTag resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessTag(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessTagState, opts ...pulumi.ResourceOption) (*AccessTag, error) {
	var resource AccessTag
	err := ctx.ReadResource("cloudflare:index/accessTag:AccessTag", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessTag resources.
type accessTagState struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// Number of apps associated with the tag.
	AppCount *int `pulumi:"appCount"`
	// Friendly name of the Access Tag.
	Name *string `pulumi:"name"`
	// The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type AccessTagState struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// Number of apps associated with the tag.
	AppCount pulumi.IntPtrInput
	// Friendly name of the Access Tag.
	Name pulumi.StringPtrInput
	// The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (AccessTagState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessTagState)(nil)).Elem()
}

type accessTagArgs struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// Number of apps associated with the tag.
	AppCount *int `pulumi:"appCount"`
	// Friendly name of the Access Tag.
	Name string `pulumi:"name"`
	// The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a AccessTag resource.
type AccessTagArgs struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// Number of apps associated with the tag.
	AppCount pulumi.IntPtrInput
	// Friendly name of the Access Tag.
	Name pulumi.StringInput
	// The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (AccessTagArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessTagArgs)(nil)).Elem()
}

type AccessTagInput interface {
	pulumi.Input

	ToAccessTagOutput() AccessTagOutput
	ToAccessTagOutputWithContext(ctx context.Context) AccessTagOutput
}

func (*AccessTag) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessTag)(nil)).Elem()
}

func (i *AccessTag) ToAccessTagOutput() AccessTagOutput {
	return i.ToAccessTagOutputWithContext(context.Background())
}

func (i *AccessTag) ToAccessTagOutputWithContext(ctx context.Context) AccessTagOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessTagOutput)
}

// AccessTagArrayInput is an input type that accepts AccessTagArray and AccessTagArrayOutput values.
// You can construct a concrete instance of `AccessTagArrayInput` via:
//
//	AccessTagArray{ AccessTagArgs{...} }
type AccessTagArrayInput interface {
	pulumi.Input

	ToAccessTagArrayOutput() AccessTagArrayOutput
	ToAccessTagArrayOutputWithContext(context.Context) AccessTagArrayOutput
}

type AccessTagArray []AccessTagInput

func (AccessTagArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessTag)(nil)).Elem()
}

func (i AccessTagArray) ToAccessTagArrayOutput() AccessTagArrayOutput {
	return i.ToAccessTagArrayOutputWithContext(context.Background())
}

func (i AccessTagArray) ToAccessTagArrayOutputWithContext(ctx context.Context) AccessTagArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessTagArrayOutput)
}

// AccessTagMapInput is an input type that accepts AccessTagMap and AccessTagMapOutput values.
// You can construct a concrete instance of `AccessTagMapInput` via:
//
//	AccessTagMap{ "key": AccessTagArgs{...} }
type AccessTagMapInput interface {
	pulumi.Input

	ToAccessTagMapOutput() AccessTagMapOutput
	ToAccessTagMapOutputWithContext(context.Context) AccessTagMapOutput
}

type AccessTagMap map[string]AccessTagInput

func (AccessTagMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessTag)(nil)).Elem()
}

func (i AccessTagMap) ToAccessTagMapOutput() AccessTagMapOutput {
	return i.ToAccessTagMapOutputWithContext(context.Background())
}

func (i AccessTagMap) ToAccessTagMapOutputWithContext(ctx context.Context) AccessTagMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessTagMapOutput)
}

type AccessTagOutput struct{ *pulumi.OutputState }

func (AccessTagOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessTag)(nil)).Elem()
}

func (o AccessTagOutput) ToAccessTagOutput() AccessTagOutput {
	return o
}

func (o AccessTagOutput) ToAccessTagOutputWithContext(ctx context.Context) AccessTagOutput {
	return o
}

// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
func (o AccessTagOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessTag) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

// Number of apps associated with the tag.
func (o AccessTagOutput) AppCount() pulumi.IntOutput {
	return o.ApplyT(func(v *AccessTag) pulumi.IntOutput { return v.AppCount }).(pulumi.IntOutput)
}

// Friendly name of the Access Tag.
func (o AccessTagOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessTag) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
func (o AccessTagOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessTag) pulumi.StringPtrOutput { return v.ZoneId }).(pulumi.StringPtrOutput)
}

type AccessTagArrayOutput struct{ *pulumi.OutputState }

func (AccessTagArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessTag)(nil)).Elem()
}

func (o AccessTagArrayOutput) ToAccessTagArrayOutput() AccessTagArrayOutput {
	return o
}

func (o AccessTagArrayOutput) ToAccessTagArrayOutputWithContext(ctx context.Context) AccessTagArrayOutput {
	return o
}

func (o AccessTagArrayOutput) Index(i pulumi.IntInput) AccessTagOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessTag {
		return vs[0].([]*AccessTag)[vs[1].(int)]
	}).(AccessTagOutput)
}

type AccessTagMapOutput struct{ *pulumi.OutputState }

func (AccessTagMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessTag)(nil)).Elem()
}

func (o AccessTagMapOutput) ToAccessTagMapOutput() AccessTagMapOutput {
	return o
}

func (o AccessTagMapOutput) ToAccessTagMapOutputWithContext(ctx context.Context) AccessTagMapOutput {
	return o
}

func (o AccessTagMapOutput) MapIndex(k pulumi.StringInput) AccessTagOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessTag {
		return vs[0].(map[string]*AccessTag)[vs[1].(string)]
	}).(AccessTagOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessTagInput)(nil)).Elem(), &AccessTag{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessTagArrayInput)(nil)).Elem(), AccessTagArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessTagMapInput)(nil)).Elem(), AccessTagMap{})
	pulumi.RegisterOutputType(AccessTagOutput{})
	pulumi.RegisterOutputType(AccessTagArrayOutput{})
	pulumi.RegisterOutputType(AccessTagMapOutput{})
}

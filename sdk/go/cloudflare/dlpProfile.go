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

// Provides a Cloudflare DLP Profile resource. Data Loss Prevention profiles
// are a set of entries that can be matched in HTTP bodies or files.
// They are referenced in Zero Trust Gateway rules.
//
// ## Import
//
// ```sh
//
//	$ pulumi import cloudflare:index/dlpProfile:DlpProfile example <account_id>/<dlp_profile_id>
//
// ```
type DlpProfile struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Related DLP policies will trigger when the match count exceeds the number set.
	AllowedMatchCount pulumi.IntOutput `pulumi:"allowedMatchCount"`
	// Brief summary of the profile and its intended use.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// List of entries to apply to the profile.
	Entries DlpProfileEntryArrayOutput `pulumi:"entries"`
	// Name of the entry to deploy.
	Name pulumi.StringOutput `pulumi:"name"`
	// The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewDlpProfile registers a new resource with the given unique name, arguments, and options.
func NewDlpProfile(ctx *pulumi.Context,
	name string, args *DlpProfileArgs, opts ...pulumi.ResourceOption) (*DlpProfile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.AllowedMatchCount == nil {
		return nil, errors.New("invalid value for required argument 'AllowedMatchCount'")
	}
	if args.Entries == nil {
		return nil, errors.New("invalid value for required argument 'Entries'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DlpProfile
	err := ctx.RegisterResource("cloudflare:index/dlpProfile:DlpProfile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDlpProfile gets an existing DlpProfile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDlpProfile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DlpProfileState, opts ...pulumi.ResourceOption) (*DlpProfile, error) {
	var resource DlpProfile
	err := ctx.ReadResource("cloudflare:index/dlpProfile:DlpProfile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DlpProfile resources.
type dlpProfileState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// Related DLP policies will trigger when the match count exceeds the number set.
	AllowedMatchCount *int `pulumi:"allowedMatchCount"`
	// Brief summary of the profile and its intended use.
	Description *string `pulumi:"description"`
	// List of entries to apply to the profile.
	Entries []DlpProfileEntry `pulumi:"entries"`
	// Name of the entry to deploy.
	Name *string `pulumi:"name"`
	// The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
	Type *string `pulumi:"type"`
}

type DlpProfileState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// Related DLP policies will trigger when the match count exceeds the number set.
	AllowedMatchCount pulumi.IntPtrInput
	// Brief summary of the profile and its intended use.
	Description pulumi.StringPtrInput
	// List of entries to apply to the profile.
	Entries DlpProfileEntryArrayInput
	// Name of the entry to deploy.
	Name pulumi.StringPtrInput
	// The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
	Type pulumi.StringPtrInput
}

func (DlpProfileState) ElementType() reflect.Type {
	return reflect.TypeOf((*dlpProfileState)(nil)).Elem()
}

type dlpProfileArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId string `pulumi:"accountId"`
	// Related DLP policies will trigger when the match count exceeds the number set.
	AllowedMatchCount int `pulumi:"allowedMatchCount"`
	// Brief summary of the profile and its intended use.
	Description *string `pulumi:"description"`
	// List of entries to apply to the profile.
	Entries []DlpProfileEntry `pulumi:"entries"`
	// Name of the entry to deploy.
	Name string `pulumi:"name"`
	// The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a DlpProfile resource.
type DlpProfileArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringInput
	// Related DLP policies will trigger when the match count exceeds the number set.
	AllowedMatchCount pulumi.IntInput
	// Brief summary of the profile and its intended use.
	Description pulumi.StringPtrInput
	// List of entries to apply to the profile.
	Entries DlpProfileEntryArrayInput
	// Name of the entry to deploy.
	Name pulumi.StringInput
	// The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
	Type pulumi.StringInput
}

func (DlpProfileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dlpProfileArgs)(nil)).Elem()
}

type DlpProfileInput interface {
	pulumi.Input

	ToDlpProfileOutput() DlpProfileOutput
	ToDlpProfileOutputWithContext(ctx context.Context) DlpProfileOutput
}

func (*DlpProfile) ElementType() reflect.Type {
	return reflect.TypeOf((**DlpProfile)(nil)).Elem()
}

func (i *DlpProfile) ToDlpProfileOutput() DlpProfileOutput {
	return i.ToDlpProfileOutputWithContext(context.Background())
}

func (i *DlpProfile) ToDlpProfileOutputWithContext(ctx context.Context) DlpProfileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DlpProfileOutput)
}

func (i *DlpProfile) ToOutput(ctx context.Context) pulumix.Output[*DlpProfile] {
	return pulumix.Output[*DlpProfile]{
		OutputState: i.ToDlpProfileOutputWithContext(ctx).OutputState,
	}
}

// DlpProfileArrayInput is an input type that accepts DlpProfileArray and DlpProfileArrayOutput values.
// You can construct a concrete instance of `DlpProfileArrayInput` via:
//
//	DlpProfileArray{ DlpProfileArgs{...} }
type DlpProfileArrayInput interface {
	pulumi.Input

	ToDlpProfileArrayOutput() DlpProfileArrayOutput
	ToDlpProfileArrayOutputWithContext(context.Context) DlpProfileArrayOutput
}

type DlpProfileArray []DlpProfileInput

func (DlpProfileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DlpProfile)(nil)).Elem()
}

func (i DlpProfileArray) ToDlpProfileArrayOutput() DlpProfileArrayOutput {
	return i.ToDlpProfileArrayOutputWithContext(context.Background())
}

func (i DlpProfileArray) ToDlpProfileArrayOutputWithContext(ctx context.Context) DlpProfileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DlpProfileArrayOutput)
}

func (i DlpProfileArray) ToOutput(ctx context.Context) pulumix.Output[[]*DlpProfile] {
	return pulumix.Output[[]*DlpProfile]{
		OutputState: i.ToDlpProfileArrayOutputWithContext(ctx).OutputState,
	}
}

// DlpProfileMapInput is an input type that accepts DlpProfileMap and DlpProfileMapOutput values.
// You can construct a concrete instance of `DlpProfileMapInput` via:
//
//	DlpProfileMap{ "key": DlpProfileArgs{...} }
type DlpProfileMapInput interface {
	pulumi.Input

	ToDlpProfileMapOutput() DlpProfileMapOutput
	ToDlpProfileMapOutputWithContext(context.Context) DlpProfileMapOutput
}

type DlpProfileMap map[string]DlpProfileInput

func (DlpProfileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DlpProfile)(nil)).Elem()
}

func (i DlpProfileMap) ToDlpProfileMapOutput() DlpProfileMapOutput {
	return i.ToDlpProfileMapOutputWithContext(context.Background())
}

func (i DlpProfileMap) ToDlpProfileMapOutputWithContext(ctx context.Context) DlpProfileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DlpProfileMapOutput)
}

func (i DlpProfileMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*DlpProfile] {
	return pulumix.Output[map[string]*DlpProfile]{
		OutputState: i.ToDlpProfileMapOutputWithContext(ctx).OutputState,
	}
}

type DlpProfileOutput struct{ *pulumi.OutputState }

func (DlpProfileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DlpProfile)(nil)).Elem()
}

func (o DlpProfileOutput) ToDlpProfileOutput() DlpProfileOutput {
	return o
}

func (o DlpProfileOutput) ToDlpProfileOutputWithContext(ctx context.Context) DlpProfileOutput {
	return o
}

func (o DlpProfileOutput) ToOutput(ctx context.Context) pulumix.Output[*DlpProfile] {
	return pulumix.Output[*DlpProfile]{
		OutputState: o.OutputState,
	}
}

// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o DlpProfileOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *DlpProfile) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Related DLP policies will trigger when the match count exceeds the number set.
func (o DlpProfileOutput) AllowedMatchCount() pulumi.IntOutput {
	return o.ApplyT(func(v *DlpProfile) pulumi.IntOutput { return v.AllowedMatchCount }).(pulumi.IntOutput)
}

// Brief summary of the profile and its intended use.
func (o DlpProfileOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DlpProfile) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// List of entries to apply to the profile.
func (o DlpProfileOutput) Entries() DlpProfileEntryArrayOutput {
	return o.ApplyT(func(v *DlpProfile) DlpProfileEntryArrayOutput { return v.Entries }).(DlpProfileEntryArrayOutput)
}

// Name of the entry to deploy.
func (o DlpProfileOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DlpProfile) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
func (o DlpProfileOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *DlpProfile) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type DlpProfileArrayOutput struct{ *pulumi.OutputState }

func (DlpProfileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DlpProfile)(nil)).Elem()
}

func (o DlpProfileArrayOutput) ToDlpProfileArrayOutput() DlpProfileArrayOutput {
	return o
}

func (o DlpProfileArrayOutput) ToDlpProfileArrayOutputWithContext(ctx context.Context) DlpProfileArrayOutput {
	return o
}

func (o DlpProfileArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*DlpProfile] {
	return pulumix.Output[[]*DlpProfile]{
		OutputState: o.OutputState,
	}
}

func (o DlpProfileArrayOutput) Index(i pulumi.IntInput) DlpProfileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DlpProfile {
		return vs[0].([]*DlpProfile)[vs[1].(int)]
	}).(DlpProfileOutput)
}

type DlpProfileMapOutput struct{ *pulumi.OutputState }

func (DlpProfileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DlpProfile)(nil)).Elem()
}

func (o DlpProfileMapOutput) ToDlpProfileMapOutput() DlpProfileMapOutput {
	return o
}

func (o DlpProfileMapOutput) ToDlpProfileMapOutputWithContext(ctx context.Context) DlpProfileMapOutput {
	return o
}

func (o DlpProfileMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*DlpProfile] {
	return pulumix.Output[map[string]*DlpProfile]{
		OutputState: o.OutputState,
	}
}

func (o DlpProfileMapOutput) MapIndex(k pulumi.StringInput) DlpProfileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DlpProfile {
		return vs[0].(map[string]*DlpProfile)[vs[1].(string)]
	}).(DlpProfileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DlpProfileInput)(nil)).Elem(), &DlpProfile{})
	pulumi.RegisterInputType(reflect.TypeOf((*DlpProfileArrayInput)(nil)).Elem(), DlpProfileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DlpProfileMapInput)(nil)).Elem(), DlpProfileMap{})
	pulumi.RegisterOutputType(DlpProfileOutput{})
	pulumi.RegisterOutputType(DlpProfileArrayOutput{})
	pulumi.RegisterOutputType(DlpProfileMapOutput{})
}

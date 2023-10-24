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

// Provides a Cloudflare Teams Location resource. Teams Locations are
// referenced when creating secure web gateway policies.
//
// ## Import
//
// ```sh
//
//	$ pulumi import cloudflare:index/teamsLocation:TeamsLocation example <account_id>/<teams_location_id>
//
// ```
type TeamsLocation struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Indicator that anonymized logs are enabled.
	AnonymizedLogsEnabled pulumi.BoolOutput `pulumi:"anonymizedLogsEnabled"`
	// Indicator that this is the default location.
	ClientDefault pulumi.BoolPtrOutput `pulumi:"clientDefault"`
	// The FQDN that DoH clients should be pointed at.
	DohSubdomain pulumi.StringOutput `pulumi:"dohSubdomain"`
	// Client IP address.
	Ip pulumi.StringOutput `pulumi:"ip"`
	// IP to direct all IPv4 DNS queries to.
	Ipv4Destination pulumi.StringOutput `pulumi:"ipv4Destination"`
	// Name of the teams location.
	Name pulumi.StringOutput `pulumi:"name"`
	// The networks CIDRs that comprise the location.
	Networks  TeamsLocationNetworkArrayOutput `pulumi:"networks"`
	PolicyIds pulumi.StringArrayOutput        `pulumi:"policyIds"`
}

// NewTeamsLocation registers a new resource with the given unique name, arguments, and options.
func NewTeamsLocation(ctx *pulumi.Context,
	name string, args *TeamsLocationArgs, opts ...pulumi.ResourceOption) (*TeamsLocation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TeamsLocation
	err := ctx.RegisterResource("cloudflare:index/teamsLocation:TeamsLocation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTeamsLocation gets an existing TeamsLocation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTeamsLocation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TeamsLocationState, opts ...pulumi.ResourceOption) (*TeamsLocation, error) {
	var resource TeamsLocation
	err := ctx.ReadResource("cloudflare:index/teamsLocation:TeamsLocation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TeamsLocation resources.
type teamsLocationState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// Indicator that anonymized logs are enabled.
	AnonymizedLogsEnabled *bool `pulumi:"anonymizedLogsEnabled"`
	// Indicator that this is the default location.
	ClientDefault *bool `pulumi:"clientDefault"`
	// The FQDN that DoH clients should be pointed at.
	DohSubdomain *string `pulumi:"dohSubdomain"`
	// Client IP address.
	Ip *string `pulumi:"ip"`
	// IP to direct all IPv4 DNS queries to.
	Ipv4Destination *string `pulumi:"ipv4Destination"`
	// Name of the teams location.
	Name *string `pulumi:"name"`
	// The networks CIDRs that comprise the location.
	Networks  []TeamsLocationNetwork `pulumi:"networks"`
	PolicyIds []string               `pulumi:"policyIds"`
}

type TeamsLocationState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// Indicator that anonymized logs are enabled.
	AnonymizedLogsEnabled pulumi.BoolPtrInput
	// Indicator that this is the default location.
	ClientDefault pulumi.BoolPtrInput
	// The FQDN that DoH clients should be pointed at.
	DohSubdomain pulumi.StringPtrInput
	// Client IP address.
	Ip pulumi.StringPtrInput
	// IP to direct all IPv4 DNS queries to.
	Ipv4Destination pulumi.StringPtrInput
	// Name of the teams location.
	Name pulumi.StringPtrInput
	// The networks CIDRs that comprise the location.
	Networks  TeamsLocationNetworkArrayInput
	PolicyIds pulumi.StringArrayInput
}

func (TeamsLocationState) ElementType() reflect.Type {
	return reflect.TypeOf((*teamsLocationState)(nil)).Elem()
}

type teamsLocationArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// Indicator that this is the default location.
	ClientDefault *bool `pulumi:"clientDefault"`
	// Name of the teams location.
	Name string `pulumi:"name"`
	// The networks CIDRs that comprise the location.
	Networks []TeamsLocationNetwork `pulumi:"networks"`
}

// The set of arguments for constructing a TeamsLocation resource.
type TeamsLocationArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// Indicator that this is the default location.
	ClientDefault pulumi.BoolPtrInput
	// Name of the teams location.
	Name pulumi.StringInput
	// The networks CIDRs that comprise the location.
	Networks TeamsLocationNetworkArrayInput
}

func (TeamsLocationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*teamsLocationArgs)(nil)).Elem()
}

type TeamsLocationInput interface {
	pulumi.Input

	ToTeamsLocationOutput() TeamsLocationOutput
	ToTeamsLocationOutputWithContext(ctx context.Context) TeamsLocationOutput
}

func (*TeamsLocation) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamsLocation)(nil)).Elem()
}

func (i *TeamsLocation) ToTeamsLocationOutput() TeamsLocationOutput {
	return i.ToTeamsLocationOutputWithContext(context.Background())
}

func (i *TeamsLocation) ToTeamsLocationOutputWithContext(ctx context.Context) TeamsLocationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsLocationOutput)
}

func (i *TeamsLocation) ToOutput(ctx context.Context) pulumix.Output[*TeamsLocation] {
	return pulumix.Output[*TeamsLocation]{
		OutputState: i.ToTeamsLocationOutputWithContext(ctx).OutputState,
	}
}

// TeamsLocationArrayInput is an input type that accepts TeamsLocationArray and TeamsLocationArrayOutput values.
// You can construct a concrete instance of `TeamsLocationArrayInput` via:
//
//	TeamsLocationArray{ TeamsLocationArgs{...} }
type TeamsLocationArrayInput interface {
	pulumi.Input

	ToTeamsLocationArrayOutput() TeamsLocationArrayOutput
	ToTeamsLocationArrayOutputWithContext(context.Context) TeamsLocationArrayOutput
}

type TeamsLocationArray []TeamsLocationInput

func (TeamsLocationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TeamsLocation)(nil)).Elem()
}

func (i TeamsLocationArray) ToTeamsLocationArrayOutput() TeamsLocationArrayOutput {
	return i.ToTeamsLocationArrayOutputWithContext(context.Background())
}

func (i TeamsLocationArray) ToTeamsLocationArrayOutputWithContext(ctx context.Context) TeamsLocationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsLocationArrayOutput)
}

func (i TeamsLocationArray) ToOutput(ctx context.Context) pulumix.Output[[]*TeamsLocation] {
	return pulumix.Output[[]*TeamsLocation]{
		OutputState: i.ToTeamsLocationArrayOutputWithContext(ctx).OutputState,
	}
}

// TeamsLocationMapInput is an input type that accepts TeamsLocationMap and TeamsLocationMapOutput values.
// You can construct a concrete instance of `TeamsLocationMapInput` via:
//
//	TeamsLocationMap{ "key": TeamsLocationArgs{...} }
type TeamsLocationMapInput interface {
	pulumi.Input

	ToTeamsLocationMapOutput() TeamsLocationMapOutput
	ToTeamsLocationMapOutputWithContext(context.Context) TeamsLocationMapOutput
}

type TeamsLocationMap map[string]TeamsLocationInput

func (TeamsLocationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TeamsLocation)(nil)).Elem()
}

func (i TeamsLocationMap) ToTeamsLocationMapOutput() TeamsLocationMapOutput {
	return i.ToTeamsLocationMapOutputWithContext(context.Background())
}

func (i TeamsLocationMap) ToTeamsLocationMapOutputWithContext(ctx context.Context) TeamsLocationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsLocationMapOutput)
}

func (i TeamsLocationMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*TeamsLocation] {
	return pulumix.Output[map[string]*TeamsLocation]{
		OutputState: i.ToTeamsLocationMapOutputWithContext(ctx).OutputState,
	}
}

type TeamsLocationOutput struct{ *pulumi.OutputState }

func (TeamsLocationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamsLocation)(nil)).Elem()
}

func (o TeamsLocationOutput) ToTeamsLocationOutput() TeamsLocationOutput {
	return o
}

func (o TeamsLocationOutput) ToTeamsLocationOutputWithContext(ctx context.Context) TeamsLocationOutput {
	return o
}

func (o TeamsLocationOutput) ToOutput(ctx context.Context) pulumix.Output[*TeamsLocation] {
	return pulumix.Output[*TeamsLocation]{
		OutputState: o.OutputState,
	}
}

// The account identifier to target for the resource.
func (o TeamsLocationOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsLocation) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Indicator that anonymized logs are enabled.
func (o TeamsLocationOutput) AnonymizedLogsEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *TeamsLocation) pulumi.BoolOutput { return v.AnonymizedLogsEnabled }).(pulumi.BoolOutput)
}

// Indicator that this is the default location.
func (o TeamsLocationOutput) ClientDefault() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TeamsLocation) pulumi.BoolPtrOutput { return v.ClientDefault }).(pulumi.BoolPtrOutput)
}

// The FQDN that DoH clients should be pointed at.
func (o TeamsLocationOutput) DohSubdomain() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsLocation) pulumi.StringOutput { return v.DohSubdomain }).(pulumi.StringOutput)
}

// Client IP address.
func (o TeamsLocationOutput) Ip() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsLocation) pulumi.StringOutput { return v.Ip }).(pulumi.StringOutput)
}

// IP to direct all IPv4 DNS queries to.
func (o TeamsLocationOutput) Ipv4Destination() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsLocation) pulumi.StringOutput { return v.Ipv4Destination }).(pulumi.StringOutput)
}

// Name of the teams location.
func (o TeamsLocationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsLocation) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The networks CIDRs that comprise the location.
func (o TeamsLocationOutput) Networks() TeamsLocationNetworkArrayOutput {
	return o.ApplyT(func(v *TeamsLocation) TeamsLocationNetworkArrayOutput { return v.Networks }).(TeamsLocationNetworkArrayOutput)
}

func (o TeamsLocationOutput) PolicyIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *TeamsLocation) pulumi.StringArrayOutput { return v.PolicyIds }).(pulumi.StringArrayOutput)
}

type TeamsLocationArrayOutput struct{ *pulumi.OutputState }

func (TeamsLocationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TeamsLocation)(nil)).Elem()
}

func (o TeamsLocationArrayOutput) ToTeamsLocationArrayOutput() TeamsLocationArrayOutput {
	return o
}

func (o TeamsLocationArrayOutput) ToTeamsLocationArrayOutputWithContext(ctx context.Context) TeamsLocationArrayOutput {
	return o
}

func (o TeamsLocationArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*TeamsLocation] {
	return pulumix.Output[[]*TeamsLocation]{
		OutputState: o.OutputState,
	}
}

func (o TeamsLocationArrayOutput) Index(i pulumi.IntInput) TeamsLocationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TeamsLocation {
		return vs[0].([]*TeamsLocation)[vs[1].(int)]
	}).(TeamsLocationOutput)
}

type TeamsLocationMapOutput struct{ *pulumi.OutputState }

func (TeamsLocationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TeamsLocation)(nil)).Elem()
}

func (o TeamsLocationMapOutput) ToTeamsLocationMapOutput() TeamsLocationMapOutput {
	return o
}

func (o TeamsLocationMapOutput) ToTeamsLocationMapOutputWithContext(ctx context.Context) TeamsLocationMapOutput {
	return o
}

func (o TeamsLocationMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*TeamsLocation] {
	return pulumix.Output[map[string]*TeamsLocation]{
		OutputState: o.OutputState,
	}
}

func (o TeamsLocationMapOutput) MapIndex(k pulumi.StringInput) TeamsLocationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TeamsLocation {
		return vs[0].(map[string]*TeamsLocation)[vs[1].(string)]
	}).(TeamsLocationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsLocationInput)(nil)).Elem(), &TeamsLocation{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsLocationArrayInput)(nil)).Elem(), TeamsLocationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsLocationMapInput)(nil)).Elem(), TeamsLocationMap{})
	pulumi.RegisterOutputType(TeamsLocationOutput{})
	pulumi.RegisterOutputType(TeamsLocationArrayOutput{})
	pulumi.RegisterOutputType(TeamsLocationMapOutput{})
}

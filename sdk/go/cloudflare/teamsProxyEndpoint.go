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

// Provides a Cloudflare Teams Proxy Endpoint resource. Teams Proxy
// Endpoints are used for pointing proxy clients at Cloudflare Secure
// Gateway.
//
// ## Import
//
// ```sh
//
//	$ pulumi import cloudflare:index/teamsProxyEndpoint:TeamsProxyEndpoint example <account_id>/<proxy_endpoint_id>
//
// ```
type TeamsProxyEndpoint struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The networks CIDRs that will be allowed to initiate proxy connections.
	Ips pulumi.StringArrayOutput `pulumi:"ips"`
	// Name of the teams proxy endpoint.
	Name pulumi.StringOutput `pulumi:"name"`
	// The FQDN that proxy clients should be pointed at.
	Subdomain pulumi.StringOutput `pulumi:"subdomain"`
}

// NewTeamsProxyEndpoint registers a new resource with the given unique name, arguments, and options.
func NewTeamsProxyEndpoint(ctx *pulumi.Context,
	name string, args *TeamsProxyEndpointArgs, opts ...pulumi.ResourceOption) (*TeamsProxyEndpoint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Ips == nil {
		return nil, errors.New("invalid value for required argument 'Ips'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TeamsProxyEndpoint
	err := ctx.RegisterResource("cloudflare:index/teamsProxyEndpoint:TeamsProxyEndpoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTeamsProxyEndpoint gets an existing TeamsProxyEndpoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTeamsProxyEndpoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TeamsProxyEndpointState, opts ...pulumi.ResourceOption) (*TeamsProxyEndpoint, error) {
	var resource TeamsProxyEndpoint
	err := ctx.ReadResource("cloudflare:index/teamsProxyEndpoint:TeamsProxyEndpoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TeamsProxyEndpoint resources.
type teamsProxyEndpointState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// The networks CIDRs that will be allowed to initiate proxy connections.
	Ips []string `pulumi:"ips"`
	// Name of the teams proxy endpoint.
	Name *string `pulumi:"name"`
	// The FQDN that proxy clients should be pointed at.
	Subdomain *string `pulumi:"subdomain"`
}

type TeamsProxyEndpointState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// The networks CIDRs that will be allowed to initiate proxy connections.
	Ips pulumi.StringArrayInput
	// Name of the teams proxy endpoint.
	Name pulumi.StringPtrInput
	// The FQDN that proxy clients should be pointed at.
	Subdomain pulumi.StringPtrInput
}

func (TeamsProxyEndpointState) ElementType() reflect.Type {
	return reflect.TypeOf((*teamsProxyEndpointState)(nil)).Elem()
}

type teamsProxyEndpointArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// The networks CIDRs that will be allowed to initiate proxy connections.
	Ips []string `pulumi:"ips"`
	// Name of the teams proxy endpoint.
	Name string `pulumi:"name"`
}

// The set of arguments for constructing a TeamsProxyEndpoint resource.
type TeamsProxyEndpointArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// The networks CIDRs that will be allowed to initiate proxy connections.
	Ips pulumi.StringArrayInput
	// Name of the teams proxy endpoint.
	Name pulumi.StringInput
}

func (TeamsProxyEndpointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*teamsProxyEndpointArgs)(nil)).Elem()
}

type TeamsProxyEndpointInput interface {
	pulumi.Input

	ToTeamsProxyEndpointOutput() TeamsProxyEndpointOutput
	ToTeamsProxyEndpointOutputWithContext(ctx context.Context) TeamsProxyEndpointOutput
}

func (*TeamsProxyEndpoint) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamsProxyEndpoint)(nil)).Elem()
}

func (i *TeamsProxyEndpoint) ToTeamsProxyEndpointOutput() TeamsProxyEndpointOutput {
	return i.ToTeamsProxyEndpointOutputWithContext(context.Background())
}

func (i *TeamsProxyEndpoint) ToTeamsProxyEndpointOutputWithContext(ctx context.Context) TeamsProxyEndpointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsProxyEndpointOutput)
}

func (i *TeamsProxyEndpoint) ToOutput(ctx context.Context) pulumix.Output[*TeamsProxyEndpoint] {
	return pulumix.Output[*TeamsProxyEndpoint]{
		OutputState: i.ToTeamsProxyEndpointOutputWithContext(ctx).OutputState,
	}
}

// TeamsProxyEndpointArrayInput is an input type that accepts TeamsProxyEndpointArray and TeamsProxyEndpointArrayOutput values.
// You can construct a concrete instance of `TeamsProxyEndpointArrayInput` via:
//
//	TeamsProxyEndpointArray{ TeamsProxyEndpointArgs{...} }
type TeamsProxyEndpointArrayInput interface {
	pulumi.Input

	ToTeamsProxyEndpointArrayOutput() TeamsProxyEndpointArrayOutput
	ToTeamsProxyEndpointArrayOutputWithContext(context.Context) TeamsProxyEndpointArrayOutput
}

type TeamsProxyEndpointArray []TeamsProxyEndpointInput

func (TeamsProxyEndpointArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TeamsProxyEndpoint)(nil)).Elem()
}

func (i TeamsProxyEndpointArray) ToTeamsProxyEndpointArrayOutput() TeamsProxyEndpointArrayOutput {
	return i.ToTeamsProxyEndpointArrayOutputWithContext(context.Background())
}

func (i TeamsProxyEndpointArray) ToTeamsProxyEndpointArrayOutputWithContext(ctx context.Context) TeamsProxyEndpointArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsProxyEndpointArrayOutput)
}

func (i TeamsProxyEndpointArray) ToOutput(ctx context.Context) pulumix.Output[[]*TeamsProxyEndpoint] {
	return pulumix.Output[[]*TeamsProxyEndpoint]{
		OutputState: i.ToTeamsProxyEndpointArrayOutputWithContext(ctx).OutputState,
	}
}

// TeamsProxyEndpointMapInput is an input type that accepts TeamsProxyEndpointMap and TeamsProxyEndpointMapOutput values.
// You can construct a concrete instance of `TeamsProxyEndpointMapInput` via:
//
//	TeamsProxyEndpointMap{ "key": TeamsProxyEndpointArgs{...} }
type TeamsProxyEndpointMapInput interface {
	pulumi.Input

	ToTeamsProxyEndpointMapOutput() TeamsProxyEndpointMapOutput
	ToTeamsProxyEndpointMapOutputWithContext(context.Context) TeamsProxyEndpointMapOutput
}

type TeamsProxyEndpointMap map[string]TeamsProxyEndpointInput

func (TeamsProxyEndpointMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TeamsProxyEndpoint)(nil)).Elem()
}

func (i TeamsProxyEndpointMap) ToTeamsProxyEndpointMapOutput() TeamsProxyEndpointMapOutput {
	return i.ToTeamsProxyEndpointMapOutputWithContext(context.Background())
}

func (i TeamsProxyEndpointMap) ToTeamsProxyEndpointMapOutputWithContext(ctx context.Context) TeamsProxyEndpointMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsProxyEndpointMapOutput)
}

func (i TeamsProxyEndpointMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*TeamsProxyEndpoint] {
	return pulumix.Output[map[string]*TeamsProxyEndpoint]{
		OutputState: i.ToTeamsProxyEndpointMapOutputWithContext(ctx).OutputState,
	}
}

type TeamsProxyEndpointOutput struct{ *pulumi.OutputState }

func (TeamsProxyEndpointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamsProxyEndpoint)(nil)).Elem()
}

func (o TeamsProxyEndpointOutput) ToTeamsProxyEndpointOutput() TeamsProxyEndpointOutput {
	return o
}

func (o TeamsProxyEndpointOutput) ToTeamsProxyEndpointOutputWithContext(ctx context.Context) TeamsProxyEndpointOutput {
	return o
}

func (o TeamsProxyEndpointOutput) ToOutput(ctx context.Context) pulumix.Output[*TeamsProxyEndpoint] {
	return pulumix.Output[*TeamsProxyEndpoint]{
		OutputState: o.OutputState,
	}
}

// The account identifier to target for the resource.
func (o TeamsProxyEndpointOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsProxyEndpoint) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The networks CIDRs that will be allowed to initiate proxy connections.
func (o TeamsProxyEndpointOutput) Ips() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *TeamsProxyEndpoint) pulumi.StringArrayOutput { return v.Ips }).(pulumi.StringArrayOutput)
}

// Name of the teams proxy endpoint.
func (o TeamsProxyEndpointOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsProxyEndpoint) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The FQDN that proxy clients should be pointed at.
func (o TeamsProxyEndpointOutput) Subdomain() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsProxyEndpoint) pulumi.StringOutput { return v.Subdomain }).(pulumi.StringOutput)
}

type TeamsProxyEndpointArrayOutput struct{ *pulumi.OutputState }

func (TeamsProxyEndpointArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TeamsProxyEndpoint)(nil)).Elem()
}

func (o TeamsProxyEndpointArrayOutput) ToTeamsProxyEndpointArrayOutput() TeamsProxyEndpointArrayOutput {
	return o
}

func (o TeamsProxyEndpointArrayOutput) ToTeamsProxyEndpointArrayOutputWithContext(ctx context.Context) TeamsProxyEndpointArrayOutput {
	return o
}

func (o TeamsProxyEndpointArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*TeamsProxyEndpoint] {
	return pulumix.Output[[]*TeamsProxyEndpoint]{
		OutputState: o.OutputState,
	}
}

func (o TeamsProxyEndpointArrayOutput) Index(i pulumi.IntInput) TeamsProxyEndpointOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TeamsProxyEndpoint {
		return vs[0].([]*TeamsProxyEndpoint)[vs[1].(int)]
	}).(TeamsProxyEndpointOutput)
}

type TeamsProxyEndpointMapOutput struct{ *pulumi.OutputState }

func (TeamsProxyEndpointMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TeamsProxyEndpoint)(nil)).Elem()
}

func (o TeamsProxyEndpointMapOutput) ToTeamsProxyEndpointMapOutput() TeamsProxyEndpointMapOutput {
	return o
}

func (o TeamsProxyEndpointMapOutput) ToTeamsProxyEndpointMapOutputWithContext(ctx context.Context) TeamsProxyEndpointMapOutput {
	return o
}

func (o TeamsProxyEndpointMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*TeamsProxyEndpoint] {
	return pulumix.Output[map[string]*TeamsProxyEndpoint]{
		OutputState: o.OutputState,
	}
}

func (o TeamsProxyEndpointMapOutput) MapIndex(k pulumi.StringInput) TeamsProxyEndpointOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TeamsProxyEndpoint {
		return vs[0].(map[string]*TeamsProxyEndpoint)[vs[1].(string)]
	}).(TeamsProxyEndpointOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsProxyEndpointInput)(nil)).Elem(), &TeamsProxyEndpoint{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsProxyEndpointArrayInput)(nil)).Elem(), TeamsProxyEndpointArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsProxyEndpointMapInput)(nil)).Elem(), TeamsProxyEndpointMap{})
	pulumi.RegisterOutputType(TeamsProxyEndpointOutput{})
	pulumi.RegisterOutputType(TeamsProxyEndpointArrayOutput{})
	pulumi.RegisterOutputType(TeamsProxyEndpointMapOutput{})
}

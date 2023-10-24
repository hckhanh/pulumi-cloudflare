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

// Creates a Worker Custom Domain.
//
// ## Import
//
// ```sh
//
//	$ pulumi import cloudflare:index/workerDomain:WorkerDomain example <account_id>/<worker_domain_id>
//
// ```
type WorkerDomain struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The name of the Worker environment. Defaults to `production`.
	Environment pulumi.StringPtrOutput `pulumi:"environment"`
	// Hostname of the Worker Domain.
	Hostname pulumi.StringOutput `pulumi:"hostname"`
	// Name of worker script to attach the domain to.
	Service pulumi.StringOutput `pulumi:"service"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewWorkerDomain registers a new resource with the given unique name, arguments, and options.
func NewWorkerDomain(ctx *pulumi.Context,
	name string, args *WorkerDomainArgs, opts ...pulumi.ResourceOption) (*WorkerDomain, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Hostname == nil {
		return nil, errors.New("invalid value for required argument 'Hostname'")
	}
	if args.Service == nil {
		return nil, errors.New("invalid value for required argument 'Service'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WorkerDomain
	err := ctx.RegisterResource("cloudflare:index/workerDomain:WorkerDomain", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkerDomain gets an existing WorkerDomain resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkerDomain(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkerDomainState, opts ...pulumi.ResourceOption) (*WorkerDomain, error) {
	var resource WorkerDomain
	err := ctx.ReadResource("cloudflare:index/workerDomain:WorkerDomain", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkerDomain resources.
type workerDomainState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// The name of the Worker environment. Defaults to `production`.
	Environment *string `pulumi:"environment"`
	// Hostname of the Worker Domain.
	Hostname *string `pulumi:"hostname"`
	// Name of worker script to attach the domain to.
	Service *string `pulumi:"service"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type WorkerDomainState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// The name of the Worker environment. Defaults to `production`.
	Environment pulumi.StringPtrInput
	// Hostname of the Worker Domain.
	Hostname pulumi.StringPtrInput
	// Name of worker script to attach the domain to.
	Service pulumi.StringPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (WorkerDomainState) ElementType() reflect.Type {
	return reflect.TypeOf((*workerDomainState)(nil)).Elem()
}

type workerDomainArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId string `pulumi:"accountId"`
	// The name of the Worker environment. Defaults to `production`.
	Environment *string `pulumi:"environment"`
	// Hostname of the Worker Domain.
	Hostname string `pulumi:"hostname"`
	// Name of worker script to attach the domain to.
	Service string `pulumi:"service"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a WorkerDomain resource.
type WorkerDomainArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringInput
	// The name of the Worker environment. Defaults to `production`.
	Environment pulumi.StringPtrInput
	// Hostname of the Worker Domain.
	Hostname pulumi.StringInput
	// Name of worker script to attach the domain to.
	Service pulumi.StringInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (WorkerDomainArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workerDomainArgs)(nil)).Elem()
}

type WorkerDomainInput interface {
	pulumi.Input

	ToWorkerDomainOutput() WorkerDomainOutput
	ToWorkerDomainOutputWithContext(ctx context.Context) WorkerDomainOutput
}

func (*WorkerDomain) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkerDomain)(nil)).Elem()
}

func (i *WorkerDomain) ToWorkerDomainOutput() WorkerDomainOutput {
	return i.ToWorkerDomainOutputWithContext(context.Background())
}

func (i *WorkerDomain) ToWorkerDomainOutputWithContext(ctx context.Context) WorkerDomainOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkerDomainOutput)
}

func (i *WorkerDomain) ToOutput(ctx context.Context) pulumix.Output[*WorkerDomain] {
	return pulumix.Output[*WorkerDomain]{
		OutputState: i.ToWorkerDomainOutputWithContext(ctx).OutputState,
	}
}

// WorkerDomainArrayInput is an input type that accepts WorkerDomainArray and WorkerDomainArrayOutput values.
// You can construct a concrete instance of `WorkerDomainArrayInput` via:
//
//	WorkerDomainArray{ WorkerDomainArgs{...} }
type WorkerDomainArrayInput interface {
	pulumi.Input

	ToWorkerDomainArrayOutput() WorkerDomainArrayOutput
	ToWorkerDomainArrayOutputWithContext(context.Context) WorkerDomainArrayOutput
}

type WorkerDomainArray []WorkerDomainInput

func (WorkerDomainArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkerDomain)(nil)).Elem()
}

func (i WorkerDomainArray) ToWorkerDomainArrayOutput() WorkerDomainArrayOutput {
	return i.ToWorkerDomainArrayOutputWithContext(context.Background())
}

func (i WorkerDomainArray) ToWorkerDomainArrayOutputWithContext(ctx context.Context) WorkerDomainArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkerDomainArrayOutput)
}

func (i WorkerDomainArray) ToOutput(ctx context.Context) pulumix.Output[[]*WorkerDomain] {
	return pulumix.Output[[]*WorkerDomain]{
		OutputState: i.ToWorkerDomainArrayOutputWithContext(ctx).OutputState,
	}
}

// WorkerDomainMapInput is an input type that accepts WorkerDomainMap and WorkerDomainMapOutput values.
// You can construct a concrete instance of `WorkerDomainMapInput` via:
//
//	WorkerDomainMap{ "key": WorkerDomainArgs{...} }
type WorkerDomainMapInput interface {
	pulumi.Input

	ToWorkerDomainMapOutput() WorkerDomainMapOutput
	ToWorkerDomainMapOutputWithContext(context.Context) WorkerDomainMapOutput
}

type WorkerDomainMap map[string]WorkerDomainInput

func (WorkerDomainMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkerDomain)(nil)).Elem()
}

func (i WorkerDomainMap) ToWorkerDomainMapOutput() WorkerDomainMapOutput {
	return i.ToWorkerDomainMapOutputWithContext(context.Background())
}

func (i WorkerDomainMap) ToWorkerDomainMapOutputWithContext(ctx context.Context) WorkerDomainMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkerDomainMapOutput)
}

func (i WorkerDomainMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*WorkerDomain] {
	return pulumix.Output[map[string]*WorkerDomain]{
		OutputState: i.ToWorkerDomainMapOutputWithContext(ctx).OutputState,
	}
}

type WorkerDomainOutput struct{ *pulumi.OutputState }

func (WorkerDomainOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkerDomain)(nil)).Elem()
}

func (o WorkerDomainOutput) ToWorkerDomainOutput() WorkerDomainOutput {
	return o
}

func (o WorkerDomainOutput) ToWorkerDomainOutputWithContext(ctx context.Context) WorkerDomainOutput {
	return o
}

func (o WorkerDomainOutput) ToOutput(ctx context.Context) pulumix.Output[*WorkerDomain] {
	return pulumix.Output[*WorkerDomain]{
		OutputState: o.OutputState,
	}
}

// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o WorkerDomainOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkerDomain) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The name of the Worker environment. Defaults to `production`.
func (o WorkerDomainOutput) Environment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WorkerDomain) pulumi.StringPtrOutput { return v.Environment }).(pulumi.StringPtrOutput)
}

// Hostname of the Worker Domain.
func (o WorkerDomainOutput) Hostname() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkerDomain) pulumi.StringOutput { return v.Hostname }).(pulumi.StringOutput)
}

// Name of worker script to attach the domain to.
func (o WorkerDomainOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkerDomain) pulumi.StringOutput { return v.Service }).(pulumi.StringOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o WorkerDomainOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkerDomain) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type WorkerDomainArrayOutput struct{ *pulumi.OutputState }

func (WorkerDomainArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkerDomain)(nil)).Elem()
}

func (o WorkerDomainArrayOutput) ToWorkerDomainArrayOutput() WorkerDomainArrayOutput {
	return o
}

func (o WorkerDomainArrayOutput) ToWorkerDomainArrayOutputWithContext(ctx context.Context) WorkerDomainArrayOutput {
	return o
}

func (o WorkerDomainArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*WorkerDomain] {
	return pulumix.Output[[]*WorkerDomain]{
		OutputState: o.OutputState,
	}
}

func (o WorkerDomainArrayOutput) Index(i pulumi.IntInput) WorkerDomainOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WorkerDomain {
		return vs[0].([]*WorkerDomain)[vs[1].(int)]
	}).(WorkerDomainOutput)
}

type WorkerDomainMapOutput struct{ *pulumi.OutputState }

func (WorkerDomainMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkerDomain)(nil)).Elem()
}

func (o WorkerDomainMapOutput) ToWorkerDomainMapOutput() WorkerDomainMapOutput {
	return o
}

func (o WorkerDomainMapOutput) ToWorkerDomainMapOutputWithContext(ctx context.Context) WorkerDomainMapOutput {
	return o
}

func (o WorkerDomainMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*WorkerDomain] {
	return pulumix.Output[map[string]*WorkerDomain]{
		OutputState: o.OutputState,
	}
}

func (o WorkerDomainMapOutput) MapIndex(k pulumi.StringInput) WorkerDomainOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WorkerDomain {
		return vs[0].(map[string]*WorkerDomain)[vs[1].(string)]
	}).(WorkerDomainOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkerDomainInput)(nil)).Elem(), &WorkerDomain{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkerDomainArrayInput)(nil)).Elem(), WorkerDomainArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkerDomainMapInput)(nil)).Elem(), WorkerDomainMap{})
	pulumi.RegisterOutputType(WorkerDomainOutput{})
	pulumi.RegisterOutputType(WorkerDomainArrayOutput{})
	pulumi.RegisterOutputType(WorkerDomainMapOutput{})
}

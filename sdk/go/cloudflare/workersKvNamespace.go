// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides the ability to manage Cloudflare Workers KV Namespace features.
//
// > This resource uses the Cloudflare account APIs. This requires setting the
// `CLOUDFLARE_ACCOUNT_ID` environment variable or `accountId` provider argument.
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
//			_, err := cloudflare.NewWorkersKvNamespace(ctx, "example", &cloudflare.WorkersKvNamespaceArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Title:     pulumi.String("test-namespace"),
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
//	$ pulumi import cloudflare:index/workersKvNamespace:WorkersKvNamespace example <account_id>/<namespace_id>
//
// ```
type WorkersKvNamespace struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Title value of the Worker KV Namespace.
	Title pulumi.StringOutput `pulumi:"title"`
}

// NewWorkersKvNamespace registers a new resource with the given unique name, arguments, and options.
func NewWorkersKvNamespace(ctx *pulumi.Context,
	name string, args *WorkersKvNamespaceArgs, opts ...pulumi.ResourceOption) (*WorkersKvNamespace, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Title == nil {
		return nil, errors.New("invalid value for required argument 'Title'")
	}
	var resource WorkersKvNamespace
	err := ctx.RegisterResource("cloudflare:index/workersKvNamespace:WorkersKvNamespace", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkersKvNamespace gets an existing WorkersKvNamespace resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkersKvNamespace(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkersKvNamespaceState, opts ...pulumi.ResourceOption) (*WorkersKvNamespace, error) {
	var resource WorkersKvNamespace
	err := ctx.ReadResource("cloudflare:index/workersKvNamespace:WorkersKvNamespace", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkersKvNamespace resources.
type workersKvNamespaceState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// Title value of the Worker KV Namespace.
	Title *string `pulumi:"title"`
}

type WorkersKvNamespaceState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// Title value of the Worker KV Namespace.
	Title pulumi.StringPtrInput
}

func (WorkersKvNamespaceState) ElementType() reflect.Type {
	return reflect.TypeOf((*workersKvNamespaceState)(nil)).Elem()
}

type workersKvNamespaceArgs struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// Title value of the Worker KV Namespace.
	Title string `pulumi:"title"`
}

// The set of arguments for constructing a WorkersKvNamespace resource.
type WorkersKvNamespaceArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// Title value of the Worker KV Namespace.
	Title pulumi.StringInput
}

func (WorkersKvNamespaceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workersKvNamespaceArgs)(nil)).Elem()
}

type WorkersKvNamespaceInput interface {
	pulumi.Input

	ToWorkersKvNamespaceOutput() WorkersKvNamespaceOutput
	ToWorkersKvNamespaceOutputWithContext(ctx context.Context) WorkersKvNamespaceOutput
}

func (*WorkersKvNamespace) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkersKvNamespace)(nil)).Elem()
}

func (i *WorkersKvNamespace) ToWorkersKvNamespaceOutput() WorkersKvNamespaceOutput {
	return i.ToWorkersKvNamespaceOutputWithContext(context.Background())
}

func (i *WorkersKvNamespace) ToWorkersKvNamespaceOutputWithContext(ctx context.Context) WorkersKvNamespaceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkersKvNamespaceOutput)
}

// WorkersKvNamespaceArrayInput is an input type that accepts WorkersKvNamespaceArray and WorkersKvNamespaceArrayOutput values.
// You can construct a concrete instance of `WorkersKvNamespaceArrayInput` via:
//
//	WorkersKvNamespaceArray{ WorkersKvNamespaceArgs{...} }
type WorkersKvNamespaceArrayInput interface {
	pulumi.Input

	ToWorkersKvNamespaceArrayOutput() WorkersKvNamespaceArrayOutput
	ToWorkersKvNamespaceArrayOutputWithContext(context.Context) WorkersKvNamespaceArrayOutput
}

type WorkersKvNamespaceArray []WorkersKvNamespaceInput

func (WorkersKvNamespaceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkersKvNamespace)(nil)).Elem()
}

func (i WorkersKvNamespaceArray) ToWorkersKvNamespaceArrayOutput() WorkersKvNamespaceArrayOutput {
	return i.ToWorkersKvNamespaceArrayOutputWithContext(context.Background())
}

func (i WorkersKvNamespaceArray) ToWorkersKvNamespaceArrayOutputWithContext(ctx context.Context) WorkersKvNamespaceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkersKvNamespaceArrayOutput)
}

// WorkersKvNamespaceMapInput is an input type that accepts WorkersKvNamespaceMap and WorkersKvNamespaceMapOutput values.
// You can construct a concrete instance of `WorkersKvNamespaceMapInput` via:
//
//	WorkersKvNamespaceMap{ "key": WorkersKvNamespaceArgs{...} }
type WorkersKvNamespaceMapInput interface {
	pulumi.Input

	ToWorkersKvNamespaceMapOutput() WorkersKvNamespaceMapOutput
	ToWorkersKvNamespaceMapOutputWithContext(context.Context) WorkersKvNamespaceMapOutput
}

type WorkersKvNamespaceMap map[string]WorkersKvNamespaceInput

func (WorkersKvNamespaceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkersKvNamespace)(nil)).Elem()
}

func (i WorkersKvNamespaceMap) ToWorkersKvNamespaceMapOutput() WorkersKvNamespaceMapOutput {
	return i.ToWorkersKvNamespaceMapOutputWithContext(context.Background())
}

func (i WorkersKvNamespaceMap) ToWorkersKvNamespaceMapOutputWithContext(ctx context.Context) WorkersKvNamespaceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkersKvNamespaceMapOutput)
}

type WorkersKvNamespaceOutput struct{ *pulumi.OutputState }

func (WorkersKvNamespaceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkersKvNamespace)(nil)).Elem()
}

func (o WorkersKvNamespaceOutput) ToWorkersKvNamespaceOutput() WorkersKvNamespaceOutput {
	return o
}

func (o WorkersKvNamespaceOutput) ToWorkersKvNamespaceOutputWithContext(ctx context.Context) WorkersKvNamespaceOutput {
	return o
}

// The account identifier to target for the resource.
func (o WorkersKvNamespaceOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkersKvNamespace) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Title value of the Worker KV Namespace.
func (o WorkersKvNamespaceOutput) Title() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkersKvNamespace) pulumi.StringOutput { return v.Title }).(pulumi.StringOutput)
}

type WorkersKvNamespaceArrayOutput struct{ *pulumi.OutputState }

func (WorkersKvNamespaceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkersKvNamespace)(nil)).Elem()
}

func (o WorkersKvNamespaceArrayOutput) ToWorkersKvNamespaceArrayOutput() WorkersKvNamespaceArrayOutput {
	return o
}

func (o WorkersKvNamespaceArrayOutput) ToWorkersKvNamespaceArrayOutputWithContext(ctx context.Context) WorkersKvNamespaceArrayOutput {
	return o
}

func (o WorkersKvNamespaceArrayOutput) Index(i pulumi.IntInput) WorkersKvNamespaceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WorkersKvNamespace {
		return vs[0].([]*WorkersKvNamespace)[vs[1].(int)]
	}).(WorkersKvNamespaceOutput)
}

type WorkersKvNamespaceMapOutput struct{ *pulumi.OutputState }

func (WorkersKvNamespaceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkersKvNamespace)(nil)).Elem()
}

func (o WorkersKvNamespaceMapOutput) ToWorkersKvNamespaceMapOutput() WorkersKvNamespaceMapOutput {
	return o
}

func (o WorkersKvNamespaceMapOutput) ToWorkersKvNamespaceMapOutputWithContext(ctx context.Context) WorkersKvNamespaceMapOutput {
	return o
}

func (o WorkersKvNamespaceMapOutput) MapIndex(k pulumi.StringInput) WorkersKvNamespaceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WorkersKvNamespace {
		return vs[0].(map[string]*WorkersKvNamespace)[vs[1].(string)]
	}).(WorkersKvNamespaceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkersKvNamespaceInput)(nil)).Elem(), &WorkersKvNamespace{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkersKvNamespaceArrayInput)(nil)).Elem(), WorkersKvNamespaceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkersKvNamespaceMapInput)(nil)).Elem(), WorkersKvNamespaceMap{})
	pulumi.RegisterOutputType(WorkersKvNamespaceOutput{})
	pulumi.RegisterOutputType(WorkersKvNamespaceArrayOutput{})
	pulumi.RegisterOutputType(WorkersKvNamespaceMapOutput{})
}

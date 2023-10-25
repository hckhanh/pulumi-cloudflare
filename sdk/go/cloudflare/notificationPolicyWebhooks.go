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

// Provides a resource, that manages a webhook destination. These destinations can be tied to the notification policies created for Cloudflare's products.
//
// ## Import
//
// ```sh
//
//	$ pulumi import cloudflare:index/notificationPolicyWebhooks:NotificationPolicyWebhooks example <account_id>/<notification_webhook_id>
//
// ```
type NotificationPolicyWebhooks struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Timestamp of when the notification webhook was created.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Timestamp of when the notification webhook last faiuled.
	LastFailure pulumi.StringOutput `pulumi:"lastFailure"`
	// Timestamp of when the notification webhook was last successful.
	LastSuccess pulumi.StringOutput `pulumi:"lastSuccess"`
	// The name of the webhook destination.
	Name pulumi.StringOutput `pulumi:"name"`
	// An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
	Secret pulumi.StringPtrOutput `pulumi:"secret"`
	Type   pulumi.StringOutput    `pulumi:"type"`
	// The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
	Url pulumi.StringPtrOutput `pulumi:"url"`
}

// NewNotificationPolicyWebhooks registers a new resource with the given unique name, arguments, and options.
func NewNotificationPolicyWebhooks(ctx *pulumi.Context,
	name string, args *NotificationPolicyWebhooksArgs, opts ...pulumi.ResourceOption) (*NotificationPolicyWebhooks, error) {
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
	var resource NotificationPolicyWebhooks
	err := ctx.RegisterResource("cloudflare:index/notificationPolicyWebhooks:NotificationPolicyWebhooks", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNotificationPolicyWebhooks gets an existing NotificationPolicyWebhooks resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNotificationPolicyWebhooks(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NotificationPolicyWebhooksState, opts ...pulumi.ResourceOption) (*NotificationPolicyWebhooks, error) {
	var resource NotificationPolicyWebhooks
	err := ctx.ReadResource("cloudflare:index/notificationPolicyWebhooks:NotificationPolicyWebhooks", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NotificationPolicyWebhooks resources.
type notificationPolicyWebhooksState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// Timestamp of when the notification webhook was created.
	CreatedAt *string `pulumi:"createdAt"`
	// Timestamp of when the notification webhook last faiuled.
	LastFailure *string `pulumi:"lastFailure"`
	// Timestamp of when the notification webhook was last successful.
	LastSuccess *string `pulumi:"lastSuccess"`
	// The name of the webhook destination.
	Name *string `pulumi:"name"`
	// An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
	Secret *string `pulumi:"secret"`
	Type   *string `pulumi:"type"`
	// The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
	Url *string `pulumi:"url"`
}

type NotificationPolicyWebhooksState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// Timestamp of when the notification webhook was created.
	CreatedAt pulumi.StringPtrInput
	// Timestamp of when the notification webhook last faiuled.
	LastFailure pulumi.StringPtrInput
	// Timestamp of when the notification webhook was last successful.
	LastSuccess pulumi.StringPtrInput
	// The name of the webhook destination.
	Name pulumi.StringPtrInput
	// An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
	Secret pulumi.StringPtrInput
	Type   pulumi.StringPtrInput
	// The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
	Url pulumi.StringPtrInput
}

func (NotificationPolicyWebhooksState) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationPolicyWebhooksState)(nil)).Elem()
}

type notificationPolicyWebhooksArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// The name of the webhook destination.
	Name string `pulumi:"name"`
	// An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
	Secret *string `pulumi:"secret"`
	// The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
	Url *string `pulumi:"url"`
}

// The set of arguments for constructing a NotificationPolicyWebhooks resource.
type NotificationPolicyWebhooksArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// The name of the webhook destination.
	Name pulumi.StringInput
	// An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
	Secret pulumi.StringPtrInput
	// The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
	Url pulumi.StringPtrInput
}

func (NotificationPolicyWebhooksArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationPolicyWebhooksArgs)(nil)).Elem()
}

type NotificationPolicyWebhooksInput interface {
	pulumi.Input

	ToNotificationPolicyWebhooksOutput() NotificationPolicyWebhooksOutput
	ToNotificationPolicyWebhooksOutputWithContext(ctx context.Context) NotificationPolicyWebhooksOutput
}

func (*NotificationPolicyWebhooks) ElementType() reflect.Type {
	return reflect.TypeOf((**NotificationPolicyWebhooks)(nil)).Elem()
}

func (i *NotificationPolicyWebhooks) ToNotificationPolicyWebhooksOutput() NotificationPolicyWebhooksOutput {
	return i.ToNotificationPolicyWebhooksOutputWithContext(context.Background())
}

func (i *NotificationPolicyWebhooks) ToNotificationPolicyWebhooksOutputWithContext(ctx context.Context) NotificationPolicyWebhooksOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationPolicyWebhooksOutput)
}

func (i *NotificationPolicyWebhooks) ToOutput(ctx context.Context) pulumix.Output[*NotificationPolicyWebhooks] {
	return pulumix.Output[*NotificationPolicyWebhooks]{
		OutputState: i.ToNotificationPolicyWebhooksOutputWithContext(ctx).OutputState,
	}
}

// NotificationPolicyWebhooksArrayInput is an input type that accepts NotificationPolicyWebhooksArray and NotificationPolicyWebhooksArrayOutput values.
// You can construct a concrete instance of `NotificationPolicyWebhooksArrayInput` via:
//
//	NotificationPolicyWebhooksArray{ NotificationPolicyWebhooksArgs{...} }
type NotificationPolicyWebhooksArrayInput interface {
	pulumi.Input

	ToNotificationPolicyWebhooksArrayOutput() NotificationPolicyWebhooksArrayOutput
	ToNotificationPolicyWebhooksArrayOutputWithContext(context.Context) NotificationPolicyWebhooksArrayOutput
}

type NotificationPolicyWebhooksArray []NotificationPolicyWebhooksInput

func (NotificationPolicyWebhooksArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NotificationPolicyWebhooks)(nil)).Elem()
}

func (i NotificationPolicyWebhooksArray) ToNotificationPolicyWebhooksArrayOutput() NotificationPolicyWebhooksArrayOutput {
	return i.ToNotificationPolicyWebhooksArrayOutputWithContext(context.Background())
}

func (i NotificationPolicyWebhooksArray) ToNotificationPolicyWebhooksArrayOutputWithContext(ctx context.Context) NotificationPolicyWebhooksArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationPolicyWebhooksArrayOutput)
}

func (i NotificationPolicyWebhooksArray) ToOutput(ctx context.Context) pulumix.Output[[]*NotificationPolicyWebhooks] {
	return pulumix.Output[[]*NotificationPolicyWebhooks]{
		OutputState: i.ToNotificationPolicyWebhooksArrayOutputWithContext(ctx).OutputState,
	}
}

// NotificationPolicyWebhooksMapInput is an input type that accepts NotificationPolicyWebhooksMap and NotificationPolicyWebhooksMapOutput values.
// You can construct a concrete instance of `NotificationPolicyWebhooksMapInput` via:
//
//	NotificationPolicyWebhooksMap{ "key": NotificationPolicyWebhooksArgs{...} }
type NotificationPolicyWebhooksMapInput interface {
	pulumi.Input

	ToNotificationPolicyWebhooksMapOutput() NotificationPolicyWebhooksMapOutput
	ToNotificationPolicyWebhooksMapOutputWithContext(context.Context) NotificationPolicyWebhooksMapOutput
}

type NotificationPolicyWebhooksMap map[string]NotificationPolicyWebhooksInput

func (NotificationPolicyWebhooksMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NotificationPolicyWebhooks)(nil)).Elem()
}

func (i NotificationPolicyWebhooksMap) ToNotificationPolicyWebhooksMapOutput() NotificationPolicyWebhooksMapOutput {
	return i.ToNotificationPolicyWebhooksMapOutputWithContext(context.Background())
}

func (i NotificationPolicyWebhooksMap) ToNotificationPolicyWebhooksMapOutputWithContext(ctx context.Context) NotificationPolicyWebhooksMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationPolicyWebhooksMapOutput)
}

func (i NotificationPolicyWebhooksMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*NotificationPolicyWebhooks] {
	return pulumix.Output[map[string]*NotificationPolicyWebhooks]{
		OutputState: i.ToNotificationPolicyWebhooksMapOutputWithContext(ctx).OutputState,
	}
}

type NotificationPolicyWebhooksOutput struct{ *pulumi.OutputState }

func (NotificationPolicyWebhooksOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NotificationPolicyWebhooks)(nil)).Elem()
}

func (o NotificationPolicyWebhooksOutput) ToNotificationPolicyWebhooksOutput() NotificationPolicyWebhooksOutput {
	return o
}

func (o NotificationPolicyWebhooksOutput) ToNotificationPolicyWebhooksOutputWithContext(ctx context.Context) NotificationPolicyWebhooksOutput {
	return o
}

func (o NotificationPolicyWebhooksOutput) ToOutput(ctx context.Context) pulumix.Output[*NotificationPolicyWebhooks] {
	return pulumix.Output[*NotificationPolicyWebhooks]{
		OutputState: o.OutputState,
	}
}

// The account identifier to target for the resource.
func (o NotificationPolicyWebhooksOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationPolicyWebhooks) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Timestamp of when the notification webhook was created.
func (o NotificationPolicyWebhooksOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationPolicyWebhooks) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// Timestamp of when the notification webhook last faiuled.
func (o NotificationPolicyWebhooksOutput) LastFailure() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationPolicyWebhooks) pulumi.StringOutput { return v.LastFailure }).(pulumi.StringOutput)
}

// Timestamp of when the notification webhook was last successful.
func (o NotificationPolicyWebhooksOutput) LastSuccess() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationPolicyWebhooks) pulumi.StringOutput { return v.LastSuccess }).(pulumi.StringOutput)
}

// The name of the webhook destination.
func (o NotificationPolicyWebhooksOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationPolicyWebhooks) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// An optional secret can be provided that will be passed in the `cf-webhook-auth` header when dispatching a webhook notification. Secrets are not returned in any API response body. Refer to the [documentation](https://api.cloudflare.com/#notification-webhooks-create-webhook) for more details.
func (o NotificationPolicyWebhooksOutput) Secret() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationPolicyWebhooks) pulumi.StringPtrOutput { return v.Secret }).(pulumi.StringPtrOutput)
}

func (o NotificationPolicyWebhooksOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *NotificationPolicyWebhooks) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The URL of the webhook destinations. **Modifying this attribute will force creation of a new resource.**
func (o NotificationPolicyWebhooksOutput) Url() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NotificationPolicyWebhooks) pulumi.StringPtrOutput { return v.Url }).(pulumi.StringPtrOutput)
}

type NotificationPolicyWebhooksArrayOutput struct{ *pulumi.OutputState }

func (NotificationPolicyWebhooksArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NotificationPolicyWebhooks)(nil)).Elem()
}

func (o NotificationPolicyWebhooksArrayOutput) ToNotificationPolicyWebhooksArrayOutput() NotificationPolicyWebhooksArrayOutput {
	return o
}

func (o NotificationPolicyWebhooksArrayOutput) ToNotificationPolicyWebhooksArrayOutputWithContext(ctx context.Context) NotificationPolicyWebhooksArrayOutput {
	return o
}

func (o NotificationPolicyWebhooksArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*NotificationPolicyWebhooks] {
	return pulumix.Output[[]*NotificationPolicyWebhooks]{
		OutputState: o.OutputState,
	}
}

func (o NotificationPolicyWebhooksArrayOutput) Index(i pulumi.IntInput) NotificationPolicyWebhooksOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NotificationPolicyWebhooks {
		return vs[0].([]*NotificationPolicyWebhooks)[vs[1].(int)]
	}).(NotificationPolicyWebhooksOutput)
}

type NotificationPolicyWebhooksMapOutput struct{ *pulumi.OutputState }

func (NotificationPolicyWebhooksMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NotificationPolicyWebhooks)(nil)).Elem()
}

func (o NotificationPolicyWebhooksMapOutput) ToNotificationPolicyWebhooksMapOutput() NotificationPolicyWebhooksMapOutput {
	return o
}

func (o NotificationPolicyWebhooksMapOutput) ToNotificationPolicyWebhooksMapOutputWithContext(ctx context.Context) NotificationPolicyWebhooksMapOutput {
	return o
}

func (o NotificationPolicyWebhooksMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*NotificationPolicyWebhooks] {
	return pulumix.Output[map[string]*NotificationPolicyWebhooks]{
		OutputState: o.OutputState,
	}
}

func (o NotificationPolicyWebhooksMapOutput) MapIndex(k pulumi.StringInput) NotificationPolicyWebhooksOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NotificationPolicyWebhooks {
		return vs[0].(map[string]*NotificationPolicyWebhooks)[vs[1].(string)]
	}).(NotificationPolicyWebhooksOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationPolicyWebhooksInput)(nil)).Elem(), &NotificationPolicyWebhooks{})
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationPolicyWebhooksArrayInput)(nil)).Elem(), NotificationPolicyWebhooksArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NotificationPolicyWebhooksMapInput)(nil)).Elem(), NotificationPolicyWebhooksMap{})
	pulumi.RegisterOutputType(NotificationPolicyWebhooksOutput{})
	pulumi.RegisterOutputType(NotificationPolicyWebhooksArrayOutput{})
	pulumi.RegisterOutputType(NotificationPolicyWebhooksMapOutput{})
}

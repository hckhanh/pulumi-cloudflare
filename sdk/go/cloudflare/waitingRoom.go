// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare Waiting Room resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v3/go/cloudflare"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudflare.NewWaitingRoom(ctx, "example", &cloudflare.WaitingRoomArgs{
// 			Host:              pulumi.String("foo.example.com"),
// 			Name:              pulumi.String("foo"),
// 			NewUsersPerMinute: pulumi.Int(200),
// 			Path:              pulumi.String("/"),
// 			TotalActiveUsers:  pulumi.Int(200),
// 			ZoneId:            pulumi.String("ae36f999674d196762efcc5abb06b345"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Waiting rooms can be imported using a composite ID formed of zone ID and waiting room ID, e.g.
//
// ```sh
//  $ pulumi import cloudflare:index/waitingRoom:WaitingRoom default ae36f999674d196762efcc5abb06b345/d41d8cd98f00b204e9800998ecf8427e
// ```
//
//  where* `ae36f999674d196762efcc5abb06b345` - the zone ID * `d41d8cd98f00b204e9800998ecf8427e` - waiting room ID as returned by [API](https://api.cloudflare.com/#waiting-room-list-waiting-rooms)
type WaitingRoom struct {
	pulumi.CustomResourceState

	// This a templated html file that will be rendered at the edge.
	CustomPageHtml pulumi.StringPtrOutput `pulumi:"customPageHtml"`
	// A description to let users add more details about the waiting room.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Disables automatic renewal of session cookies. Default: false.
	DisableSessionRenewal pulumi.BoolPtrOutput `pulumi:"disableSessionRenewal"`
	// Host name for which the waiting room will be applied (no wildcards).
	Host pulumi.StringOutput `pulumi:"host"`
	// A unique name to identify the waiting room.
	Name pulumi.StringOutput `pulumi:"name"`
	// The number of new users that will be let into the route every minute.
	NewUsersPerMinute pulumi.IntOutput `pulumi:"newUsersPerMinute"`
	// The path within the host to enable the waiting room on. Default: "/".
	Path pulumi.StringPtrOutput `pulumi:"path"`
	// If queueAll is true all the traffic that is coming to a route will be sent to the waiting room. Default: false.
	QueueAll pulumi.BoolPtrOutput `pulumi:"queueAll"`
	// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the route. Default: 5
	SessionDuration pulumi.IntPtrOutput `pulumi:"sessionDuration"`
	// If suspended, the traffic doesn't go to the waiting room. Default: false.
	Suspended pulumi.BoolPtrOutput `pulumi:"suspended"`
	// The total number of active user sessions on the route at a point in time.
	TotalActiveUsers pulumi.IntOutput `pulumi:"totalActiveUsers"`
	// The DNS zone ID to apply to.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewWaitingRoom registers a new resource with the given unique name, arguments, and options.
func NewWaitingRoom(ctx *pulumi.Context,
	name string, args *WaitingRoomArgs, opts ...pulumi.ResourceOption) (*WaitingRoom, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Host == nil {
		return nil, errors.New("invalid value for required argument 'Host'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.NewUsersPerMinute == nil {
		return nil, errors.New("invalid value for required argument 'NewUsersPerMinute'")
	}
	if args.TotalActiveUsers == nil {
		return nil, errors.New("invalid value for required argument 'TotalActiveUsers'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource WaitingRoom
	err := ctx.RegisterResource("cloudflare:index/waitingRoom:WaitingRoom", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWaitingRoom gets an existing WaitingRoom resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWaitingRoom(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WaitingRoomState, opts ...pulumi.ResourceOption) (*WaitingRoom, error) {
	var resource WaitingRoom
	err := ctx.ReadResource("cloudflare:index/waitingRoom:WaitingRoom", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WaitingRoom resources.
type waitingRoomState struct {
	// This a templated html file that will be rendered at the edge.
	CustomPageHtml *string `pulumi:"customPageHtml"`
	// A description to let users add more details about the waiting room.
	Description *string `pulumi:"description"`
	// Disables automatic renewal of session cookies. Default: false.
	DisableSessionRenewal *bool `pulumi:"disableSessionRenewal"`
	// Host name for which the waiting room will be applied (no wildcards).
	Host *string `pulumi:"host"`
	// A unique name to identify the waiting room.
	Name *string `pulumi:"name"`
	// The number of new users that will be let into the route every minute.
	NewUsersPerMinute *int `pulumi:"newUsersPerMinute"`
	// The path within the host to enable the waiting room on. Default: "/".
	Path *string `pulumi:"path"`
	// If queueAll is true all the traffic that is coming to a route will be sent to the waiting room. Default: false.
	QueueAll *bool `pulumi:"queueAll"`
	// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the route. Default: 5
	SessionDuration *int `pulumi:"sessionDuration"`
	// If suspended, the traffic doesn't go to the waiting room. Default: false.
	Suspended *bool `pulumi:"suspended"`
	// The total number of active user sessions on the route at a point in time.
	TotalActiveUsers *int `pulumi:"totalActiveUsers"`
	// The DNS zone ID to apply to.
	ZoneId *string `pulumi:"zoneId"`
}

type WaitingRoomState struct {
	// This a templated html file that will be rendered at the edge.
	CustomPageHtml pulumi.StringPtrInput
	// A description to let users add more details about the waiting room.
	Description pulumi.StringPtrInput
	// Disables automatic renewal of session cookies. Default: false.
	DisableSessionRenewal pulumi.BoolPtrInput
	// Host name for which the waiting room will be applied (no wildcards).
	Host pulumi.StringPtrInput
	// A unique name to identify the waiting room.
	Name pulumi.StringPtrInput
	// The number of new users that will be let into the route every minute.
	NewUsersPerMinute pulumi.IntPtrInput
	// The path within the host to enable the waiting room on. Default: "/".
	Path pulumi.StringPtrInput
	// If queueAll is true all the traffic that is coming to a route will be sent to the waiting room. Default: false.
	QueueAll pulumi.BoolPtrInput
	// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the route. Default: 5
	SessionDuration pulumi.IntPtrInput
	// If suspended, the traffic doesn't go to the waiting room. Default: false.
	Suspended pulumi.BoolPtrInput
	// The total number of active user sessions on the route at a point in time.
	TotalActiveUsers pulumi.IntPtrInput
	// The DNS zone ID to apply to.
	ZoneId pulumi.StringPtrInput
}

func (WaitingRoomState) ElementType() reflect.Type {
	return reflect.TypeOf((*waitingRoomState)(nil)).Elem()
}

type waitingRoomArgs struct {
	// This a templated html file that will be rendered at the edge.
	CustomPageHtml *string `pulumi:"customPageHtml"`
	// A description to let users add more details about the waiting room.
	Description *string `pulumi:"description"`
	// Disables automatic renewal of session cookies. Default: false.
	DisableSessionRenewal *bool `pulumi:"disableSessionRenewal"`
	// Host name for which the waiting room will be applied (no wildcards).
	Host string `pulumi:"host"`
	// A unique name to identify the waiting room.
	Name string `pulumi:"name"`
	// The number of new users that will be let into the route every minute.
	NewUsersPerMinute int `pulumi:"newUsersPerMinute"`
	// The path within the host to enable the waiting room on. Default: "/".
	Path *string `pulumi:"path"`
	// If queueAll is true all the traffic that is coming to a route will be sent to the waiting room. Default: false.
	QueueAll *bool `pulumi:"queueAll"`
	// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the route. Default: 5
	SessionDuration *int `pulumi:"sessionDuration"`
	// If suspended, the traffic doesn't go to the waiting room. Default: false.
	Suspended *bool `pulumi:"suspended"`
	// The total number of active user sessions on the route at a point in time.
	TotalActiveUsers int `pulumi:"totalActiveUsers"`
	// The DNS zone ID to apply to.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a WaitingRoom resource.
type WaitingRoomArgs struct {
	// This a templated html file that will be rendered at the edge.
	CustomPageHtml pulumi.StringPtrInput
	// A description to let users add more details about the waiting room.
	Description pulumi.StringPtrInput
	// Disables automatic renewal of session cookies. Default: false.
	DisableSessionRenewal pulumi.BoolPtrInput
	// Host name for which the waiting room will be applied (no wildcards).
	Host pulumi.StringInput
	// A unique name to identify the waiting room.
	Name pulumi.StringInput
	// The number of new users that will be let into the route every minute.
	NewUsersPerMinute pulumi.IntInput
	// The path within the host to enable the waiting room on. Default: "/".
	Path pulumi.StringPtrInput
	// If queueAll is true all the traffic that is coming to a route will be sent to the waiting room. Default: false.
	QueueAll pulumi.BoolPtrInput
	// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the route. Default: 5
	SessionDuration pulumi.IntPtrInput
	// If suspended, the traffic doesn't go to the waiting room. Default: false.
	Suspended pulumi.BoolPtrInput
	// The total number of active user sessions on the route at a point in time.
	TotalActiveUsers pulumi.IntInput
	// The DNS zone ID to apply to.
	ZoneId pulumi.StringInput
}

func (WaitingRoomArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*waitingRoomArgs)(nil)).Elem()
}

type WaitingRoomInput interface {
	pulumi.Input

	ToWaitingRoomOutput() WaitingRoomOutput
	ToWaitingRoomOutputWithContext(ctx context.Context) WaitingRoomOutput
}

func (*WaitingRoom) ElementType() reflect.Type {
	return reflect.TypeOf((*WaitingRoom)(nil))
}

func (i *WaitingRoom) ToWaitingRoomOutput() WaitingRoomOutput {
	return i.ToWaitingRoomOutputWithContext(context.Background())
}

func (i *WaitingRoom) ToWaitingRoomOutputWithContext(ctx context.Context) WaitingRoomOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WaitingRoomOutput)
}

func (i *WaitingRoom) ToWaitingRoomPtrOutput() WaitingRoomPtrOutput {
	return i.ToWaitingRoomPtrOutputWithContext(context.Background())
}

func (i *WaitingRoom) ToWaitingRoomPtrOutputWithContext(ctx context.Context) WaitingRoomPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WaitingRoomPtrOutput)
}

type WaitingRoomPtrInput interface {
	pulumi.Input

	ToWaitingRoomPtrOutput() WaitingRoomPtrOutput
	ToWaitingRoomPtrOutputWithContext(ctx context.Context) WaitingRoomPtrOutput
}

type waitingRoomPtrType WaitingRoomArgs

func (*waitingRoomPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**WaitingRoom)(nil))
}

func (i *waitingRoomPtrType) ToWaitingRoomPtrOutput() WaitingRoomPtrOutput {
	return i.ToWaitingRoomPtrOutputWithContext(context.Background())
}

func (i *waitingRoomPtrType) ToWaitingRoomPtrOutputWithContext(ctx context.Context) WaitingRoomPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WaitingRoomPtrOutput)
}

// WaitingRoomArrayInput is an input type that accepts WaitingRoomArray and WaitingRoomArrayOutput values.
// You can construct a concrete instance of `WaitingRoomArrayInput` via:
//
//          WaitingRoomArray{ WaitingRoomArgs{...} }
type WaitingRoomArrayInput interface {
	pulumi.Input

	ToWaitingRoomArrayOutput() WaitingRoomArrayOutput
	ToWaitingRoomArrayOutputWithContext(context.Context) WaitingRoomArrayOutput
}

type WaitingRoomArray []WaitingRoomInput

func (WaitingRoomArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*WaitingRoom)(nil))
}

func (i WaitingRoomArray) ToWaitingRoomArrayOutput() WaitingRoomArrayOutput {
	return i.ToWaitingRoomArrayOutputWithContext(context.Background())
}

func (i WaitingRoomArray) ToWaitingRoomArrayOutputWithContext(ctx context.Context) WaitingRoomArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WaitingRoomArrayOutput)
}

// WaitingRoomMapInput is an input type that accepts WaitingRoomMap and WaitingRoomMapOutput values.
// You can construct a concrete instance of `WaitingRoomMapInput` via:
//
//          WaitingRoomMap{ "key": WaitingRoomArgs{...} }
type WaitingRoomMapInput interface {
	pulumi.Input

	ToWaitingRoomMapOutput() WaitingRoomMapOutput
	ToWaitingRoomMapOutputWithContext(context.Context) WaitingRoomMapOutput
}

type WaitingRoomMap map[string]WaitingRoomInput

func (WaitingRoomMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*WaitingRoom)(nil))
}

func (i WaitingRoomMap) ToWaitingRoomMapOutput() WaitingRoomMapOutput {
	return i.ToWaitingRoomMapOutputWithContext(context.Background())
}

func (i WaitingRoomMap) ToWaitingRoomMapOutputWithContext(ctx context.Context) WaitingRoomMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WaitingRoomMapOutput)
}

type WaitingRoomOutput struct {
	*pulumi.OutputState
}

func (WaitingRoomOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*WaitingRoom)(nil))
}

func (o WaitingRoomOutput) ToWaitingRoomOutput() WaitingRoomOutput {
	return o
}

func (o WaitingRoomOutput) ToWaitingRoomOutputWithContext(ctx context.Context) WaitingRoomOutput {
	return o
}

func (o WaitingRoomOutput) ToWaitingRoomPtrOutput() WaitingRoomPtrOutput {
	return o.ToWaitingRoomPtrOutputWithContext(context.Background())
}

func (o WaitingRoomOutput) ToWaitingRoomPtrOutputWithContext(ctx context.Context) WaitingRoomPtrOutput {
	return o.ApplyT(func(v WaitingRoom) *WaitingRoom {
		return &v
	}).(WaitingRoomPtrOutput)
}

type WaitingRoomPtrOutput struct {
	*pulumi.OutputState
}

func (WaitingRoomPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WaitingRoom)(nil))
}

func (o WaitingRoomPtrOutput) ToWaitingRoomPtrOutput() WaitingRoomPtrOutput {
	return o
}

func (o WaitingRoomPtrOutput) ToWaitingRoomPtrOutputWithContext(ctx context.Context) WaitingRoomPtrOutput {
	return o
}

type WaitingRoomArrayOutput struct{ *pulumi.OutputState }

func (WaitingRoomArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]WaitingRoom)(nil))
}

func (o WaitingRoomArrayOutput) ToWaitingRoomArrayOutput() WaitingRoomArrayOutput {
	return o
}

func (o WaitingRoomArrayOutput) ToWaitingRoomArrayOutputWithContext(ctx context.Context) WaitingRoomArrayOutput {
	return o
}

func (o WaitingRoomArrayOutput) Index(i pulumi.IntInput) WaitingRoomOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) WaitingRoom {
		return vs[0].([]WaitingRoom)[vs[1].(int)]
	}).(WaitingRoomOutput)
}

type WaitingRoomMapOutput struct{ *pulumi.OutputState }

func (WaitingRoomMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]WaitingRoom)(nil))
}

func (o WaitingRoomMapOutput) ToWaitingRoomMapOutput() WaitingRoomMapOutput {
	return o
}

func (o WaitingRoomMapOutput) ToWaitingRoomMapOutputWithContext(ctx context.Context) WaitingRoomMapOutput {
	return o
}

func (o WaitingRoomMapOutput) MapIndex(k pulumi.StringInput) WaitingRoomOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) WaitingRoom {
		return vs[0].(map[string]WaitingRoom)[vs[1].(string)]
	}).(WaitingRoomOutput)
}

func init() {
	pulumi.RegisterOutputType(WaitingRoomOutput{})
	pulumi.RegisterOutputType(WaitingRoomPtrOutput{})
	pulumi.RegisterOutputType(WaitingRoomArrayOutput{})
	pulumi.RegisterOutputType(WaitingRoomMapOutput{})
}

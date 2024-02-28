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

// If Cloudflare's Load Balancing to load-balance across multiple
// origin servers or data centers, you configure one of these Monitors
// to actively check the availability of those servers over HTTP(S) or
// TCP.
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
//			// TCP Monitor
//			_, err := cloudflare.NewLoadBalancerMonitor(ctx, "example", &cloudflare.LoadBalancerMonitorArgs{
//				AccountId:   pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Description: pulumi.String("example tcp load balancer"),
//				Interval:    pulumi.Int(60),
//				Method:      pulumi.String("connection_established"),
//				Port:        pulumi.Int(8080),
//				Retries:     pulumi.Int(5),
//				Timeout:     pulumi.Int(7),
//				Type:        pulumi.String("tcp"),
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
//	$ pulumi import cloudflare:index/loadBalancerMonitor:LoadBalancerMonitor example <account_id>/<load_balancer_monitor_id>
//
// ```
type LoadBalancerMonitor struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Do not validate the certificate when monitor use HTTPS.  Only valid if `type` is "http" or "https".
	AllowInsecure pulumi.BoolPtrOutput `pulumi:"allowInsecure"`
	// To be marked unhealthy the monitored origin must fail this healthcheck N consecutive times. Defaults to `0`.
	ConsecutiveDown pulumi.IntPtrOutput `pulumi:"consecutiveDown"`
	// To be marked healthy the monitored origin must pass this healthcheck N consecutive times. Defaults to `0`.
	ConsecutiveUp pulumi.IntPtrOutput `pulumi:"consecutiveUp"`
	// The RFC3339 timestamp of when the load balancer monitor was created.
	CreatedOn pulumi.StringOutput `pulumi:"createdOn"`
	// Free text description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is "http" or "https".
	ExpectedBody pulumi.StringPtrOutput `pulumi:"expectedBody"`
	// The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is "http" or "https".
	ExpectedCodes pulumi.StringPtrOutput `pulumi:"expectedCodes"`
	// Follow redirects if returned by the origin. Only valid if `type` is "http" or "https".
	FollowRedirects pulumi.BoolPtrOutput `pulumi:"followRedirects"`
	// The header name.
	Headers LoadBalancerMonitorHeaderArrayOutput `pulumi:"headers"`
	// The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Defaults to `60`.
	Interval pulumi.IntPtrOutput `pulumi:"interval"`
	// The method to use for the health check.
	Method pulumi.StringOutput `pulumi:"method"`
	// The RFC3339 timestamp of when the load balancer monitor was last modified.
	ModifiedOn pulumi.StringOutput `pulumi:"modifiedOn"`
	// The endpoint path to health check against.
	Path pulumi.StringOutput `pulumi:"path"`
	// The port number to use for the healthcheck, required when creating a TCP monitor.
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// Assign this monitor to emulate the specified zone while probing. Only valid if `type` is "http" or "https".
	ProbeZone pulumi.StringPtrOutput `pulumi:"probeZone"`
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
	Retries pulumi.IntPtrOutput `pulumi:"retries"`
	// The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
	Timeout pulumi.IntPtrOutput `pulumi:"timeout"`
	// The protocol to use for the healthcheck. Available values: `http`, `https`, `tcp`, `udpIcmp`, `icmpPing`, `smtp`. Defaults to `http`.
	Type pulumi.StringPtrOutput `pulumi:"type"`
}

// NewLoadBalancerMonitor registers a new resource with the given unique name, arguments, and options.
func NewLoadBalancerMonitor(ctx *pulumi.Context,
	name string, args *LoadBalancerMonitorArgs, opts ...pulumi.ResourceOption) (*LoadBalancerMonitor, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LoadBalancerMonitor
	err := ctx.RegisterResource("cloudflare:index/loadBalancerMonitor:LoadBalancerMonitor", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoadBalancerMonitor gets an existing LoadBalancerMonitor resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadBalancerMonitor(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoadBalancerMonitorState, opts ...pulumi.ResourceOption) (*LoadBalancerMonitor, error) {
	var resource LoadBalancerMonitor
	err := ctx.ReadResource("cloudflare:index/loadBalancerMonitor:LoadBalancerMonitor", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoadBalancerMonitor resources.
type loadBalancerMonitorState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// Do not validate the certificate when monitor use HTTPS.  Only valid if `type` is "http" or "https".
	AllowInsecure *bool `pulumi:"allowInsecure"`
	// To be marked unhealthy the monitored origin must fail this healthcheck N consecutive times. Defaults to `0`.
	ConsecutiveDown *int `pulumi:"consecutiveDown"`
	// To be marked healthy the monitored origin must pass this healthcheck N consecutive times. Defaults to `0`.
	ConsecutiveUp *int `pulumi:"consecutiveUp"`
	// The RFC3339 timestamp of when the load balancer monitor was created.
	CreatedOn *string `pulumi:"createdOn"`
	// Free text description.
	Description *string `pulumi:"description"`
	// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is "http" or "https".
	ExpectedBody *string `pulumi:"expectedBody"`
	// The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is "http" or "https".
	ExpectedCodes *string `pulumi:"expectedCodes"`
	// Follow redirects if returned by the origin. Only valid if `type` is "http" or "https".
	FollowRedirects *bool `pulumi:"followRedirects"`
	// The header name.
	Headers []LoadBalancerMonitorHeader `pulumi:"headers"`
	// The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Defaults to `60`.
	Interval *int `pulumi:"interval"`
	// The method to use for the health check.
	Method *string `pulumi:"method"`
	// The RFC3339 timestamp of when the load balancer monitor was last modified.
	ModifiedOn *string `pulumi:"modifiedOn"`
	// The endpoint path to health check against.
	Path *string `pulumi:"path"`
	// The port number to use for the healthcheck, required when creating a TCP monitor.
	Port *int `pulumi:"port"`
	// Assign this monitor to emulate the specified zone while probing. Only valid if `type` is "http" or "https".
	ProbeZone *string `pulumi:"probeZone"`
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
	Retries *int `pulumi:"retries"`
	// The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
	Timeout *int `pulumi:"timeout"`
	// The protocol to use for the healthcheck. Available values: `http`, `https`, `tcp`, `udpIcmp`, `icmpPing`, `smtp`. Defaults to `http`.
	Type *string `pulumi:"type"`
}

type LoadBalancerMonitorState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// Do not validate the certificate when monitor use HTTPS.  Only valid if `type` is "http" or "https".
	AllowInsecure pulumi.BoolPtrInput
	// To be marked unhealthy the monitored origin must fail this healthcheck N consecutive times. Defaults to `0`.
	ConsecutiveDown pulumi.IntPtrInput
	// To be marked healthy the monitored origin must pass this healthcheck N consecutive times. Defaults to `0`.
	ConsecutiveUp pulumi.IntPtrInput
	// The RFC3339 timestamp of when the load balancer monitor was created.
	CreatedOn pulumi.StringPtrInput
	// Free text description.
	Description pulumi.StringPtrInput
	// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is "http" or "https".
	ExpectedBody pulumi.StringPtrInput
	// The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is "http" or "https".
	ExpectedCodes pulumi.StringPtrInput
	// Follow redirects if returned by the origin. Only valid if `type` is "http" or "https".
	FollowRedirects pulumi.BoolPtrInput
	// The header name.
	Headers LoadBalancerMonitorHeaderArrayInput
	// The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Defaults to `60`.
	Interval pulumi.IntPtrInput
	// The method to use for the health check.
	Method pulumi.StringPtrInput
	// The RFC3339 timestamp of when the load balancer monitor was last modified.
	ModifiedOn pulumi.StringPtrInput
	// The endpoint path to health check against.
	Path pulumi.StringPtrInput
	// The port number to use for the healthcheck, required when creating a TCP monitor.
	Port pulumi.IntPtrInput
	// Assign this monitor to emulate the specified zone while probing. Only valid if `type` is "http" or "https".
	ProbeZone pulumi.StringPtrInput
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
	Retries pulumi.IntPtrInput
	// The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
	Timeout pulumi.IntPtrInput
	// The protocol to use for the healthcheck. Available values: `http`, `https`, `tcp`, `udpIcmp`, `icmpPing`, `smtp`. Defaults to `http`.
	Type pulumi.StringPtrInput
}

func (LoadBalancerMonitorState) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerMonitorState)(nil)).Elem()
}

type loadBalancerMonitorArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// Do not validate the certificate when monitor use HTTPS.  Only valid if `type` is "http" or "https".
	AllowInsecure *bool `pulumi:"allowInsecure"`
	// To be marked unhealthy the monitored origin must fail this healthcheck N consecutive times. Defaults to `0`.
	ConsecutiveDown *int `pulumi:"consecutiveDown"`
	// To be marked healthy the monitored origin must pass this healthcheck N consecutive times. Defaults to `0`.
	ConsecutiveUp *int `pulumi:"consecutiveUp"`
	// Free text description.
	Description *string `pulumi:"description"`
	// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is "http" or "https".
	ExpectedBody *string `pulumi:"expectedBody"`
	// The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is "http" or "https".
	ExpectedCodes *string `pulumi:"expectedCodes"`
	// Follow redirects if returned by the origin. Only valid if `type` is "http" or "https".
	FollowRedirects *bool `pulumi:"followRedirects"`
	// The header name.
	Headers []LoadBalancerMonitorHeader `pulumi:"headers"`
	// The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Defaults to `60`.
	Interval *int `pulumi:"interval"`
	// The method to use for the health check.
	Method *string `pulumi:"method"`
	// The endpoint path to health check against.
	Path *string `pulumi:"path"`
	// The port number to use for the healthcheck, required when creating a TCP monitor.
	Port *int `pulumi:"port"`
	// Assign this monitor to emulate the specified zone while probing. Only valid if `type` is "http" or "https".
	ProbeZone *string `pulumi:"probeZone"`
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
	Retries *int `pulumi:"retries"`
	// The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
	Timeout *int `pulumi:"timeout"`
	// The protocol to use for the healthcheck. Available values: `http`, `https`, `tcp`, `udpIcmp`, `icmpPing`, `smtp`. Defaults to `http`.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a LoadBalancerMonitor resource.
type LoadBalancerMonitorArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// Do not validate the certificate when monitor use HTTPS.  Only valid if `type` is "http" or "https".
	AllowInsecure pulumi.BoolPtrInput
	// To be marked unhealthy the monitored origin must fail this healthcheck N consecutive times. Defaults to `0`.
	ConsecutiveDown pulumi.IntPtrInput
	// To be marked healthy the monitored origin must pass this healthcheck N consecutive times. Defaults to `0`.
	ConsecutiveUp pulumi.IntPtrInput
	// Free text description.
	Description pulumi.StringPtrInput
	// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is "http" or "https".
	ExpectedBody pulumi.StringPtrInput
	// The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is "http" or "https".
	ExpectedCodes pulumi.StringPtrInput
	// Follow redirects if returned by the origin. Only valid if `type` is "http" or "https".
	FollowRedirects pulumi.BoolPtrInput
	// The header name.
	Headers LoadBalancerMonitorHeaderArrayInput
	// The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Defaults to `60`.
	Interval pulumi.IntPtrInput
	// The method to use for the health check.
	Method pulumi.StringPtrInput
	// The endpoint path to health check against.
	Path pulumi.StringPtrInput
	// The port number to use for the healthcheck, required when creating a TCP monitor.
	Port pulumi.IntPtrInput
	// Assign this monitor to emulate the specified zone while probing. Only valid if `type` is "http" or "https".
	ProbeZone pulumi.StringPtrInput
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
	Retries pulumi.IntPtrInput
	// The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
	Timeout pulumi.IntPtrInput
	// The protocol to use for the healthcheck. Available values: `http`, `https`, `tcp`, `udpIcmp`, `icmpPing`, `smtp`. Defaults to `http`.
	Type pulumi.StringPtrInput
}

func (LoadBalancerMonitorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerMonitorArgs)(nil)).Elem()
}

type LoadBalancerMonitorInput interface {
	pulumi.Input

	ToLoadBalancerMonitorOutput() LoadBalancerMonitorOutput
	ToLoadBalancerMonitorOutputWithContext(ctx context.Context) LoadBalancerMonitorOutput
}

func (*LoadBalancerMonitor) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadBalancerMonitor)(nil)).Elem()
}

func (i *LoadBalancerMonitor) ToLoadBalancerMonitorOutput() LoadBalancerMonitorOutput {
	return i.ToLoadBalancerMonitorOutputWithContext(context.Background())
}

func (i *LoadBalancerMonitor) ToLoadBalancerMonitorOutputWithContext(ctx context.Context) LoadBalancerMonitorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerMonitorOutput)
}

// LoadBalancerMonitorArrayInput is an input type that accepts LoadBalancerMonitorArray and LoadBalancerMonitorArrayOutput values.
// You can construct a concrete instance of `LoadBalancerMonitorArrayInput` via:
//
//	LoadBalancerMonitorArray{ LoadBalancerMonitorArgs{...} }
type LoadBalancerMonitorArrayInput interface {
	pulumi.Input

	ToLoadBalancerMonitorArrayOutput() LoadBalancerMonitorArrayOutput
	ToLoadBalancerMonitorArrayOutputWithContext(context.Context) LoadBalancerMonitorArrayOutput
}

type LoadBalancerMonitorArray []LoadBalancerMonitorInput

func (LoadBalancerMonitorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoadBalancerMonitor)(nil)).Elem()
}

func (i LoadBalancerMonitorArray) ToLoadBalancerMonitorArrayOutput() LoadBalancerMonitorArrayOutput {
	return i.ToLoadBalancerMonitorArrayOutputWithContext(context.Background())
}

func (i LoadBalancerMonitorArray) ToLoadBalancerMonitorArrayOutputWithContext(ctx context.Context) LoadBalancerMonitorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerMonitorArrayOutput)
}

// LoadBalancerMonitorMapInput is an input type that accepts LoadBalancerMonitorMap and LoadBalancerMonitorMapOutput values.
// You can construct a concrete instance of `LoadBalancerMonitorMapInput` via:
//
//	LoadBalancerMonitorMap{ "key": LoadBalancerMonitorArgs{...} }
type LoadBalancerMonitorMapInput interface {
	pulumi.Input

	ToLoadBalancerMonitorMapOutput() LoadBalancerMonitorMapOutput
	ToLoadBalancerMonitorMapOutputWithContext(context.Context) LoadBalancerMonitorMapOutput
}

type LoadBalancerMonitorMap map[string]LoadBalancerMonitorInput

func (LoadBalancerMonitorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoadBalancerMonitor)(nil)).Elem()
}

func (i LoadBalancerMonitorMap) ToLoadBalancerMonitorMapOutput() LoadBalancerMonitorMapOutput {
	return i.ToLoadBalancerMonitorMapOutputWithContext(context.Background())
}

func (i LoadBalancerMonitorMap) ToLoadBalancerMonitorMapOutputWithContext(ctx context.Context) LoadBalancerMonitorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerMonitorMapOutput)
}

type LoadBalancerMonitorOutput struct{ *pulumi.OutputState }

func (LoadBalancerMonitorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadBalancerMonitor)(nil)).Elem()
}

func (o LoadBalancerMonitorOutput) ToLoadBalancerMonitorOutput() LoadBalancerMonitorOutput {
	return o
}

func (o LoadBalancerMonitorOutput) ToLoadBalancerMonitorOutputWithContext(ctx context.Context) LoadBalancerMonitorOutput {
	return o
}

// The account identifier to target for the resource.
func (o LoadBalancerMonitorOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancerMonitor) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Do not validate the certificate when monitor use HTTPS.  Only valid if `type` is "http" or "https".
func (o LoadBalancerMonitorOutput) AllowInsecure() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LoadBalancerMonitor) pulumi.BoolPtrOutput { return v.AllowInsecure }).(pulumi.BoolPtrOutput)
}

// To be marked unhealthy the monitored origin must fail this healthcheck N consecutive times. Defaults to `0`.
func (o LoadBalancerMonitorOutput) ConsecutiveDown() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *LoadBalancerMonitor) pulumi.IntPtrOutput { return v.ConsecutiveDown }).(pulumi.IntPtrOutput)
}

// To be marked healthy the monitored origin must pass this healthcheck N consecutive times. Defaults to `0`.
func (o LoadBalancerMonitorOutput) ConsecutiveUp() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *LoadBalancerMonitor) pulumi.IntPtrOutput { return v.ConsecutiveUp }).(pulumi.IntPtrOutput)
}

// The RFC3339 timestamp of when the load balancer monitor was created.
func (o LoadBalancerMonitorOutput) CreatedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancerMonitor) pulumi.StringOutput { return v.CreatedOn }).(pulumi.StringOutput)
}

// Free text description.
func (o LoadBalancerMonitorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LoadBalancerMonitor) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is "http" or "https".
func (o LoadBalancerMonitorOutput) ExpectedBody() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LoadBalancerMonitor) pulumi.StringPtrOutput { return v.ExpectedBody }).(pulumi.StringPtrOutput)
}

// The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is "http" or "https".
func (o LoadBalancerMonitorOutput) ExpectedCodes() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LoadBalancerMonitor) pulumi.StringPtrOutput { return v.ExpectedCodes }).(pulumi.StringPtrOutput)
}

// Follow redirects if returned by the origin. Only valid if `type` is "http" or "https".
func (o LoadBalancerMonitorOutput) FollowRedirects() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LoadBalancerMonitor) pulumi.BoolPtrOutput { return v.FollowRedirects }).(pulumi.BoolPtrOutput)
}

// The header name.
func (o LoadBalancerMonitorOutput) Headers() LoadBalancerMonitorHeaderArrayOutput {
	return o.ApplyT(func(v *LoadBalancerMonitor) LoadBalancerMonitorHeaderArrayOutput { return v.Headers }).(LoadBalancerMonitorHeaderArrayOutput)
}

// The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Defaults to `60`.
func (o LoadBalancerMonitorOutput) Interval() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *LoadBalancerMonitor) pulumi.IntPtrOutput { return v.Interval }).(pulumi.IntPtrOutput)
}

// The method to use for the health check.
func (o LoadBalancerMonitorOutput) Method() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancerMonitor) pulumi.StringOutput { return v.Method }).(pulumi.StringOutput)
}

// The RFC3339 timestamp of when the load balancer monitor was last modified.
func (o LoadBalancerMonitorOutput) ModifiedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancerMonitor) pulumi.StringOutput { return v.ModifiedOn }).(pulumi.StringOutput)
}

// The endpoint path to health check against.
func (o LoadBalancerMonitorOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadBalancerMonitor) pulumi.StringOutput { return v.Path }).(pulumi.StringOutput)
}

// The port number to use for the healthcheck, required when creating a TCP monitor.
func (o LoadBalancerMonitorOutput) Port() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *LoadBalancerMonitor) pulumi.IntPtrOutput { return v.Port }).(pulumi.IntPtrOutput)
}

// Assign this monitor to emulate the specified zone while probing. Only valid if `type` is "http" or "https".
func (o LoadBalancerMonitorOutput) ProbeZone() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LoadBalancerMonitor) pulumi.StringPtrOutput { return v.ProbeZone }).(pulumi.StringPtrOutput)
}

// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
func (o LoadBalancerMonitorOutput) Retries() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *LoadBalancerMonitor) pulumi.IntPtrOutput { return v.Retries }).(pulumi.IntPtrOutput)
}

// The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
func (o LoadBalancerMonitorOutput) Timeout() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *LoadBalancerMonitor) pulumi.IntPtrOutput { return v.Timeout }).(pulumi.IntPtrOutput)
}

// The protocol to use for the healthcheck. Available values: `http`, `https`, `tcp`, `udpIcmp`, `icmpPing`, `smtp`. Defaults to `http`.
func (o LoadBalancerMonitorOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LoadBalancerMonitor) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

type LoadBalancerMonitorArrayOutput struct{ *pulumi.OutputState }

func (LoadBalancerMonitorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoadBalancerMonitor)(nil)).Elem()
}

func (o LoadBalancerMonitorArrayOutput) ToLoadBalancerMonitorArrayOutput() LoadBalancerMonitorArrayOutput {
	return o
}

func (o LoadBalancerMonitorArrayOutput) ToLoadBalancerMonitorArrayOutputWithContext(ctx context.Context) LoadBalancerMonitorArrayOutput {
	return o
}

func (o LoadBalancerMonitorArrayOutput) Index(i pulumi.IntInput) LoadBalancerMonitorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LoadBalancerMonitor {
		return vs[0].([]*LoadBalancerMonitor)[vs[1].(int)]
	}).(LoadBalancerMonitorOutput)
}

type LoadBalancerMonitorMapOutput struct{ *pulumi.OutputState }

func (LoadBalancerMonitorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoadBalancerMonitor)(nil)).Elem()
}

func (o LoadBalancerMonitorMapOutput) ToLoadBalancerMonitorMapOutput() LoadBalancerMonitorMapOutput {
	return o
}

func (o LoadBalancerMonitorMapOutput) ToLoadBalancerMonitorMapOutputWithContext(ctx context.Context) LoadBalancerMonitorMapOutput {
	return o
}

func (o LoadBalancerMonitorMapOutput) MapIndex(k pulumi.StringInput) LoadBalancerMonitorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LoadBalancerMonitor {
		return vs[0].(map[string]*LoadBalancerMonitor)[vs[1].(string)]
	}).(LoadBalancerMonitorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LoadBalancerMonitorInput)(nil)).Elem(), &LoadBalancerMonitor{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoadBalancerMonitorArrayInput)(nil)).Elem(), LoadBalancerMonitorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoadBalancerMonitorMapInput)(nil)).Elem(), LoadBalancerMonitorMap{})
	pulumi.RegisterOutputType(LoadBalancerMonitorOutput{})
	pulumi.RegisterOutputType(LoadBalancerMonitorArrayOutput{})
	pulumi.RegisterOutputType(LoadBalancerMonitorMapOutput{})
}

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

// Provides a Cloudflare Authenticated Origin Pulls resource. A `AuthenticatedOriginPulls`
// resource is required to use Per-Zone or Per-Hostname Authenticated
// Origin Pulls.
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
//			_, err := cloudflare.NewAuthenticatedOriginPulls(ctx, "myAop", &cloudflare.AuthenticatedOriginPullsArgs{
//				ZoneId:  pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				Enabled: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			myPerZoneAopCert, err := cloudflare.NewAuthenticatedOriginPullsCertificate(ctx, "myPerZoneAopCert", &cloudflare.AuthenticatedOriginPullsCertificateArgs{
//				ZoneId:      pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				Certificate: pulumi.String("-----INSERT CERTIFICATE-----"),
//				PrivateKey:  pulumi.String("-----INSERT PRIVATE KEY-----"),
//				Type:        pulumi.String("per-zone"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewAuthenticatedOriginPulls(ctx, "myPerZoneAop", &cloudflare.AuthenticatedOriginPullsArgs{
//				ZoneId:                              pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				AuthenticatedOriginPullsCertificate: myPerZoneAopCert.ID(),
//				Enabled:                             pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			myPerHostnameAopCert, err := cloudflare.NewAuthenticatedOriginPullsCertificate(ctx, "myPerHostnameAopCert", &cloudflare.AuthenticatedOriginPullsCertificateArgs{
//				ZoneId:      pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				Certificate: pulumi.String("-----INSERT CERTIFICATE-----"),
//				PrivateKey:  pulumi.String("-----INSERT PRIVATE KEY-----"),
//				Type:        pulumi.String("per-hostname"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewAuthenticatedOriginPulls(ctx, "myPerHostnameAop", &cloudflare.AuthenticatedOriginPullsArgs{
//				ZoneId:                              pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				AuthenticatedOriginPullsCertificate: myPerHostnameAopCert.ID(),
//				Hostname:                            pulumi.String("aop.example.com"),
//				Enabled:                             pulumi.Bool(true),
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
// global
//
// ```sh
//
//	$ pulumi import cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls example <zone_id>
//
// ```
//
//	per zone
//
// ```sh
//
//	$ pulumi import cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls example <zone_id>/<certificate_id>
//
// ```
//
//	per hostname
//
// ```sh
//
//	$ pulumi import cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls example <zone_id>/<certificate_id>/<hostname>
//
// ```
type AuthenticatedOriginPulls struct {
	pulumi.CustomResourceState

	// The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
	AuthenticatedOriginPullsCertificate pulumi.StringPtrOutput `pulumi:"authenticatedOriginPullsCertificate"`
	// Whether to enable Authenticated Origin Pulls on the given zone or hostname.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
	Hostname pulumi.StringPtrOutput `pulumi:"hostname"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewAuthenticatedOriginPulls registers a new resource with the given unique name, arguments, and options.
func NewAuthenticatedOriginPulls(ctx *pulumi.Context,
	name string, args *AuthenticatedOriginPullsArgs, opts ...pulumi.ResourceOption) (*AuthenticatedOriginPulls, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AuthenticatedOriginPulls
	err := ctx.RegisterResource("cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthenticatedOriginPulls gets an existing AuthenticatedOriginPulls resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthenticatedOriginPulls(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthenticatedOriginPullsState, opts ...pulumi.ResourceOption) (*AuthenticatedOriginPulls, error) {
	var resource AuthenticatedOriginPulls
	err := ctx.ReadResource("cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthenticatedOriginPulls resources.
type authenticatedOriginPullsState struct {
	// The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
	AuthenticatedOriginPullsCertificate *string `pulumi:"authenticatedOriginPullsCertificate"`
	// Whether to enable Authenticated Origin Pulls on the given zone or hostname.
	Enabled *bool `pulumi:"enabled"`
	// Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
	Hostname *string `pulumi:"hostname"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type AuthenticatedOriginPullsState struct {
	// The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
	AuthenticatedOriginPullsCertificate pulumi.StringPtrInput
	// Whether to enable Authenticated Origin Pulls on the given zone or hostname.
	Enabled pulumi.BoolPtrInput
	// Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
	Hostname pulumi.StringPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (AuthenticatedOriginPullsState) ElementType() reflect.Type {
	return reflect.TypeOf((*authenticatedOriginPullsState)(nil)).Elem()
}

type authenticatedOriginPullsArgs struct {
	// The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
	AuthenticatedOriginPullsCertificate *string `pulumi:"authenticatedOriginPullsCertificate"`
	// Whether to enable Authenticated Origin Pulls on the given zone or hostname.
	Enabled bool `pulumi:"enabled"`
	// Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
	Hostname *string `pulumi:"hostname"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a AuthenticatedOriginPulls resource.
type AuthenticatedOriginPullsArgs struct {
	// The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
	AuthenticatedOriginPullsCertificate pulumi.StringPtrInput
	// Whether to enable Authenticated Origin Pulls on the given zone or hostname.
	Enabled pulumi.BoolInput
	// Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
	Hostname pulumi.StringPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (AuthenticatedOriginPullsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authenticatedOriginPullsArgs)(nil)).Elem()
}

type AuthenticatedOriginPullsInput interface {
	pulumi.Input

	ToAuthenticatedOriginPullsOutput() AuthenticatedOriginPullsOutput
	ToAuthenticatedOriginPullsOutputWithContext(ctx context.Context) AuthenticatedOriginPullsOutput
}

func (*AuthenticatedOriginPulls) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthenticatedOriginPulls)(nil)).Elem()
}

func (i *AuthenticatedOriginPulls) ToAuthenticatedOriginPullsOutput() AuthenticatedOriginPullsOutput {
	return i.ToAuthenticatedOriginPullsOutputWithContext(context.Background())
}

func (i *AuthenticatedOriginPulls) ToAuthenticatedOriginPullsOutputWithContext(ctx context.Context) AuthenticatedOriginPullsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthenticatedOriginPullsOutput)
}

func (i *AuthenticatedOriginPulls) ToOutput(ctx context.Context) pulumix.Output[*AuthenticatedOriginPulls] {
	return pulumix.Output[*AuthenticatedOriginPulls]{
		OutputState: i.ToAuthenticatedOriginPullsOutputWithContext(ctx).OutputState,
	}
}

// AuthenticatedOriginPullsArrayInput is an input type that accepts AuthenticatedOriginPullsArray and AuthenticatedOriginPullsArrayOutput values.
// You can construct a concrete instance of `AuthenticatedOriginPullsArrayInput` via:
//
//	AuthenticatedOriginPullsArray{ AuthenticatedOriginPullsArgs{...} }
type AuthenticatedOriginPullsArrayInput interface {
	pulumi.Input

	ToAuthenticatedOriginPullsArrayOutput() AuthenticatedOriginPullsArrayOutput
	ToAuthenticatedOriginPullsArrayOutputWithContext(context.Context) AuthenticatedOriginPullsArrayOutput
}

type AuthenticatedOriginPullsArray []AuthenticatedOriginPullsInput

func (AuthenticatedOriginPullsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthenticatedOriginPulls)(nil)).Elem()
}

func (i AuthenticatedOriginPullsArray) ToAuthenticatedOriginPullsArrayOutput() AuthenticatedOriginPullsArrayOutput {
	return i.ToAuthenticatedOriginPullsArrayOutputWithContext(context.Background())
}

func (i AuthenticatedOriginPullsArray) ToAuthenticatedOriginPullsArrayOutputWithContext(ctx context.Context) AuthenticatedOriginPullsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthenticatedOriginPullsArrayOutput)
}

func (i AuthenticatedOriginPullsArray) ToOutput(ctx context.Context) pulumix.Output[[]*AuthenticatedOriginPulls] {
	return pulumix.Output[[]*AuthenticatedOriginPulls]{
		OutputState: i.ToAuthenticatedOriginPullsArrayOutputWithContext(ctx).OutputState,
	}
}

// AuthenticatedOriginPullsMapInput is an input type that accepts AuthenticatedOriginPullsMap and AuthenticatedOriginPullsMapOutput values.
// You can construct a concrete instance of `AuthenticatedOriginPullsMapInput` via:
//
//	AuthenticatedOriginPullsMap{ "key": AuthenticatedOriginPullsArgs{...} }
type AuthenticatedOriginPullsMapInput interface {
	pulumi.Input

	ToAuthenticatedOriginPullsMapOutput() AuthenticatedOriginPullsMapOutput
	ToAuthenticatedOriginPullsMapOutputWithContext(context.Context) AuthenticatedOriginPullsMapOutput
}

type AuthenticatedOriginPullsMap map[string]AuthenticatedOriginPullsInput

func (AuthenticatedOriginPullsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthenticatedOriginPulls)(nil)).Elem()
}

func (i AuthenticatedOriginPullsMap) ToAuthenticatedOriginPullsMapOutput() AuthenticatedOriginPullsMapOutput {
	return i.ToAuthenticatedOriginPullsMapOutputWithContext(context.Background())
}

func (i AuthenticatedOriginPullsMap) ToAuthenticatedOriginPullsMapOutputWithContext(ctx context.Context) AuthenticatedOriginPullsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthenticatedOriginPullsMapOutput)
}

func (i AuthenticatedOriginPullsMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*AuthenticatedOriginPulls] {
	return pulumix.Output[map[string]*AuthenticatedOriginPulls]{
		OutputState: i.ToAuthenticatedOriginPullsMapOutputWithContext(ctx).OutputState,
	}
}

type AuthenticatedOriginPullsOutput struct{ *pulumi.OutputState }

func (AuthenticatedOriginPullsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthenticatedOriginPulls)(nil)).Elem()
}

func (o AuthenticatedOriginPullsOutput) ToAuthenticatedOriginPullsOutput() AuthenticatedOriginPullsOutput {
	return o
}

func (o AuthenticatedOriginPullsOutput) ToAuthenticatedOriginPullsOutputWithContext(ctx context.Context) AuthenticatedOriginPullsOutput {
	return o
}

func (o AuthenticatedOriginPullsOutput) ToOutput(ctx context.Context) pulumix.Output[*AuthenticatedOriginPulls] {
	return pulumix.Output[*AuthenticatedOriginPulls]{
		OutputState: o.OutputState,
	}
}

// The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
func (o AuthenticatedOriginPullsOutput) AuthenticatedOriginPullsCertificate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthenticatedOriginPulls) pulumi.StringPtrOutput { return v.AuthenticatedOriginPullsCertificate }).(pulumi.StringPtrOutput)
}

// Whether to enable Authenticated Origin Pulls on the given zone or hostname.
func (o AuthenticatedOriginPullsOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *AuthenticatedOriginPulls) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
func (o AuthenticatedOriginPullsOutput) Hostname() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AuthenticatedOriginPulls) pulumi.StringPtrOutput { return v.Hostname }).(pulumi.StringPtrOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o AuthenticatedOriginPullsOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthenticatedOriginPulls) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type AuthenticatedOriginPullsArrayOutput struct{ *pulumi.OutputState }

func (AuthenticatedOriginPullsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthenticatedOriginPulls)(nil)).Elem()
}

func (o AuthenticatedOriginPullsArrayOutput) ToAuthenticatedOriginPullsArrayOutput() AuthenticatedOriginPullsArrayOutput {
	return o
}

func (o AuthenticatedOriginPullsArrayOutput) ToAuthenticatedOriginPullsArrayOutputWithContext(ctx context.Context) AuthenticatedOriginPullsArrayOutput {
	return o
}

func (o AuthenticatedOriginPullsArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*AuthenticatedOriginPulls] {
	return pulumix.Output[[]*AuthenticatedOriginPulls]{
		OutputState: o.OutputState,
	}
}

func (o AuthenticatedOriginPullsArrayOutput) Index(i pulumi.IntInput) AuthenticatedOriginPullsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuthenticatedOriginPulls {
		return vs[0].([]*AuthenticatedOriginPulls)[vs[1].(int)]
	}).(AuthenticatedOriginPullsOutput)
}

type AuthenticatedOriginPullsMapOutput struct{ *pulumi.OutputState }

func (AuthenticatedOriginPullsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthenticatedOriginPulls)(nil)).Elem()
}

func (o AuthenticatedOriginPullsMapOutput) ToAuthenticatedOriginPullsMapOutput() AuthenticatedOriginPullsMapOutput {
	return o
}

func (o AuthenticatedOriginPullsMapOutput) ToAuthenticatedOriginPullsMapOutputWithContext(ctx context.Context) AuthenticatedOriginPullsMapOutput {
	return o
}

func (o AuthenticatedOriginPullsMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*AuthenticatedOriginPulls] {
	return pulumix.Output[map[string]*AuthenticatedOriginPulls]{
		OutputState: o.OutputState,
	}
}

func (o AuthenticatedOriginPullsMapOutput) MapIndex(k pulumi.StringInput) AuthenticatedOriginPullsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuthenticatedOriginPulls {
		return vs[0].(map[string]*AuthenticatedOriginPulls)[vs[1].(string)]
	}).(AuthenticatedOriginPullsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthenticatedOriginPullsInput)(nil)).Elem(), &AuthenticatedOriginPulls{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthenticatedOriginPullsArrayInput)(nil)).Elem(), AuthenticatedOriginPullsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthenticatedOriginPullsMapInput)(nil)).Elem(), AuthenticatedOriginPullsMap{})
	pulumi.RegisterOutputType(AuthenticatedOriginPullsOutput{})
	pulumi.RegisterOutputType(AuthenticatedOriginPullsArrayOutput{})
	pulumi.RegisterOutputType(AuthenticatedOriginPullsMapOutput{})
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare Access Application resource. Access Applications
// are used to restrict access to a whole application using an
// authorisation gateway managed by Cloudflare.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v4/go/cloudflare"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudflare.NewAccessApplication(ctx, "stagingApp", &cloudflare.AccessApplicationArgs{
// 			CorsHeaders: AccessApplicationCorsHeaderArray{
// 				&AccessApplicationCorsHeaderArgs{
// 					AllowCredentials: pulumi.Bool(true),
// 					AllowedMethods: pulumi.StringArray{
// 						pulumi.String("GET"),
// 						pulumi.String("POST"),
// 						pulumi.String("OPTIONS"),
// 					},
// 					AllowedOrigins: pulumi.StringArray{
// 						pulumi.String("https://example.com"),
// 					},
// 					MaxAge: pulumi.Int(10),
// 				},
// 			},
// 			Domain:          pulumi.String("staging.example.com"),
// 			Name:            pulumi.String("staging application"),
// 			SessionDuration: pulumi.String("24h"),
// 			Type:            pulumi.String("self_hosted"),
// 			ZoneId:          pulumi.String("1d5fdc9e88c8a8c4518b068cd94331fe"),
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
// Access Applications can be imported using a composite ID formed of account ID and application ID.
//
// ```sh
//  $ pulumi import cloudflare:index/accessApplication:AccessApplication staging cb029e245cfdd66dc8d2e570d5dd3322/d41d8cd98f00b204e9800998ecf8427e
// ```
type AccessApplication struct {
	pulumi.CustomResourceState

	// The account to which the access application should be added. Conflicts with `zoneId`.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The identity providers selected for the application.
	AllowedIdps pulumi.StringArrayOutput `pulumi:"allowedIdps"`
	// Option to show/hide applications in App Launcher. Defaults to `true`.
	AppLauncherVisible pulumi.BoolPtrOutput `pulumi:"appLauncherVisible"`
	// Application Audience (AUD) Tag of the application
	Aud pulumi.StringOutput `pulumi:"aud"`
	// Option to skip identity provider
	// selection if only one is configured in allowed_idps. Defaults to `false`
	// (disabled).
	AutoRedirectToIdentity pulumi.BoolPtrOutput `pulumi:"autoRedirectToIdentity"`
	// CORS configuration for the Access Application. See
	// below for reference structure.
	CorsHeaders AccessApplicationCorsHeaderArrayOutput `pulumi:"corsHeaders"`
	// Option that returns a custom error message when a user is denied access to the application.
	CustomDenyMessage pulumi.StringPtrOutput `pulumi:"customDenyMessage"`
	// Option that redirects to a custom URL when a user is denied access to the application.
	CustomDenyUrl pulumi.StringPtrOutput `pulumi:"customDenyUrl"`
	// The complete URL of the asset you wish to put
	// Cloudflare Access in front of. Can include subdomains or paths. Or both.
	Domain pulumi.StringOutput `pulumi:"domain"`
	// Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
	EnableBindingCookie     pulumi.BoolPtrOutput   `pulumi:"enableBindingCookie"`
	HttpOnlyCookieAttribute pulumi.BoolPtrOutput   `pulumi:"httpOnlyCookieAttribute"`
	LogoUrl                 pulumi.StringPtrOutput `pulumi:"logoUrl"`
	// Friendly name of the Access Application.
	Name                    pulumi.StringOutput    `pulumi:"name"`
	SameSiteCookieAttribute pulumi.StringPtrOutput `pulumi:"sameSiteCookieAttribute"`
	// How often a user will be forced to
	// re-authorise. Must be in the format `"48h"` or `"2h45m"`.
	// Valid time units are `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`. Defaults to `24h`.
	SessionDuration  pulumi.StringPtrOutput `pulumi:"sessionDuration"`
	SkipInterstitial pulumi.BoolPtrOutput   `pulumi:"skipInterstitial"`
	// The application type. Defaults to `selfHosted`. Valid
	// values are `selfHosted`, `ssh`, `vnc`, `file` or `bookmark`.
	Type pulumi.StringPtrOutput `pulumi:"type"`
	// The DNS zone to which the access application should be added. Conflicts with `accountId`.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewAccessApplication registers a new resource with the given unique name, arguments, and options.
func NewAccessApplication(ctx *pulumi.Context,
	name string, args *AccessApplicationArgs, opts ...pulumi.ResourceOption) (*AccessApplication, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Domain == nil {
		return nil, errors.New("invalid value for required argument 'Domain'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	var resource AccessApplication
	err := ctx.RegisterResource("cloudflare:index/accessApplication:AccessApplication", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessApplication gets an existing AccessApplication resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessApplication(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessApplicationState, opts ...pulumi.ResourceOption) (*AccessApplication, error) {
	var resource AccessApplication
	err := ctx.ReadResource("cloudflare:index/accessApplication:AccessApplication", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessApplication resources.
type accessApplicationState struct {
	// The account to which the access application should be added. Conflicts with `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// The identity providers selected for the application.
	AllowedIdps []string `pulumi:"allowedIdps"`
	// Option to show/hide applications in App Launcher. Defaults to `true`.
	AppLauncherVisible *bool `pulumi:"appLauncherVisible"`
	// Application Audience (AUD) Tag of the application
	Aud *string `pulumi:"aud"`
	// Option to skip identity provider
	// selection if only one is configured in allowed_idps. Defaults to `false`
	// (disabled).
	AutoRedirectToIdentity *bool `pulumi:"autoRedirectToIdentity"`
	// CORS configuration for the Access Application. See
	// below for reference structure.
	CorsHeaders []AccessApplicationCorsHeader `pulumi:"corsHeaders"`
	// Option that returns a custom error message when a user is denied access to the application.
	CustomDenyMessage *string `pulumi:"customDenyMessage"`
	// Option that redirects to a custom URL when a user is denied access to the application.
	CustomDenyUrl *string `pulumi:"customDenyUrl"`
	// The complete URL of the asset you wish to put
	// Cloudflare Access in front of. Can include subdomains or paths. Or both.
	Domain *string `pulumi:"domain"`
	// Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
	EnableBindingCookie     *bool   `pulumi:"enableBindingCookie"`
	HttpOnlyCookieAttribute *bool   `pulumi:"httpOnlyCookieAttribute"`
	LogoUrl                 *string `pulumi:"logoUrl"`
	// Friendly name of the Access Application.
	Name                    *string `pulumi:"name"`
	SameSiteCookieAttribute *string `pulumi:"sameSiteCookieAttribute"`
	// How often a user will be forced to
	// re-authorise. Must be in the format `"48h"` or `"2h45m"`.
	// Valid time units are `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`. Defaults to `24h`.
	SessionDuration  *string `pulumi:"sessionDuration"`
	SkipInterstitial *bool   `pulumi:"skipInterstitial"`
	// The application type. Defaults to `selfHosted`. Valid
	// values are `selfHosted`, `ssh`, `vnc`, `file` or `bookmark`.
	Type *string `pulumi:"type"`
	// The DNS zone to which the access application should be added. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

type AccessApplicationState struct {
	// The account to which the access application should be added. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrInput
	// The identity providers selected for the application.
	AllowedIdps pulumi.StringArrayInput
	// Option to show/hide applications in App Launcher. Defaults to `true`.
	AppLauncherVisible pulumi.BoolPtrInput
	// Application Audience (AUD) Tag of the application
	Aud pulumi.StringPtrInput
	// Option to skip identity provider
	// selection if only one is configured in allowed_idps. Defaults to `false`
	// (disabled).
	AutoRedirectToIdentity pulumi.BoolPtrInput
	// CORS configuration for the Access Application. See
	// below for reference structure.
	CorsHeaders AccessApplicationCorsHeaderArrayInput
	// Option that returns a custom error message when a user is denied access to the application.
	CustomDenyMessage pulumi.StringPtrInput
	// Option that redirects to a custom URL when a user is denied access to the application.
	CustomDenyUrl pulumi.StringPtrInput
	// The complete URL of the asset you wish to put
	// Cloudflare Access in front of. Can include subdomains or paths. Or both.
	Domain pulumi.StringPtrInput
	// Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
	EnableBindingCookie     pulumi.BoolPtrInput
	HttpOnlyCookieAttribute pulumi.BoolPtrInput
	LogoUrl                 pulumi.StringPtrInput
	// Friendly name of the Access Application.
	Name                    pulumi.StringPtrInput
	SameSiteCookieAttribute pulumi.StringPtrInput
	// How often a user will be forced to
	// re-authorise. Must be in the format `"48h"` or `"2h45m"`.
	// Valid time units are `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`. Defaults to `24h`.
	SessionDuration  pulumi.StringPtrInput
	SkipInterstitial pulumi.BoolPtrInput
	// The application type. Defaults to `selfHosted`. Valid
	// values are `selfHosted`, `ssh`, `vnc`, `file` or `bookmark`.
	Type pulumi.StringPtrInput
	// The DNS zone to which the access application should be added. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (AccessApplicationState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessApplicationState)(nil)).Elem()
}

type accessApplicationArgs struct {
	// The account to which the access application should be added. Conflicts with `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// The identity providers selected for the application.
	AllowedIdps []string `pulumi:"allowedIdps"`
	// Option to show/hide applications in App Launcher. Defaults to `true`.
	AppLauncherVisible *bool `pulumi:"appLauncherVisible"`
	// Option to skip identity provider
	// selection if only one is configured in allowed_idps. Defaults to `false`
	// (disabled).
	AutoRedirectToIdentity *bool `pulumi:"autoRedirectToIdentity"`
	// CORS configuration for the Access Application. See
	// below for reference structure.
	CorsHeaders []AccessApplicationCorsHeader `pulumi:"corsHeaders"`
	// Option that returns a custom error message when a user is denied access to the application.
	CustomDenyMessage *string `pulumi:"customDenyMessage"`
	// Option that redirects to a custom URL when a user is denied access to the application.
	CustomDenyUrl *string `pulumi:"customDenyUrl"`
	// The complete URL of the asset you wish to put
	// Cloudflare Access in front of. Can include subdomains or paths. Or both.
	Domain string `pulumi:"domain"`
	// Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
	EnableBindingCookie     *bool   `pulumi:"enableBindingCookie"`
	HttpOnlyCookieAttribute *bool   `pulumi:"httpOnlyCookieAttribute"`
	LogoUrl                 *string `pulumi:"logoUrl"`
	// Friendly name of the Access Application.
	Name                    string  `pulumi:"name"`
	SameSiteCookieAttribute *string `pulumi:"sameSiteCookieAttribute"`
	// How often a user will be forced to
	// re-authorise. Must be in the format `"48h"` or `"2h45m"`.
	// Valid time units are `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`. Defaults to `24h`.
	SessionDuration  *string `pulumi:"sessionDuration"`
	SkipInterstitial *bool   `pulumi:"skipInterstitial"`
	// The application type. Defaults to `selfHosted`. Valid
	// values are `selfHosted`, `ssh`, `vnc`, `file` or `bookmark`.
	Type *string `pulumi:"type"`
	// The DNS zone to which the access application should be added. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a AccessApplication resource.
type AccessApplicationArgs struct {
	// The account to which the access application should be added. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrInput
	// The identity providers selected for the application.
	AllowedIdps pulumi.StringArrayInput
	// Option to show/hide applications in App Launcher. Defaults to `true`.
	AppLauncherVisible pulumi.BoolPtrInput
	// Option to skip identity provider
	// selection if only one is configured in allowed_idps. Defaults to `false`
	// (disabled).
	AutoRedirectToIdentity pulumi.BoolPtrInput
	// CORS configuration for the Access Application. See
	// below for reference structure.
	CorsHeaders AccessApplicationCorsHeaderArrayInput
	// Option that returns a custom error message when a user is denied access to the application.
	CustomDenyMessage pulumi.StringPtrInput
	// Option that redirects to a custom URL when a user is denied access to the application.
	CustomDenyUrl pulumi.StringPtrInput
	// The complete URL of the asset you wish to put
	// Cloudflare Access in front of. Can include subdomains or paths. Or both.
	Domain pulumi.StringInput
	// Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
	EnableBindingCookie     pulumi.BoolPtrInput
	HttpOnlyCookieAttribute pulumi.BoolPtrInput
	LogoUrl                 pulumi.StringPtrInput
	// Friendly name of the Access Application.
	Name                    pulumi.StringInput
	SameSiteCookieAttribute pulumi.StringPtrInput
	// How often a user will be forced to
	// re-authorise. Must be in the format `"48h"` or `"2h45m"`.
	// Valid time units are `ns`, `us` (or `µs`), `ms`, `s`, `m`, `h`. Defaults to `24h`.
	SessionDuration  pulumi.StringPtrInput
	SkipInterstitial pulumi.BoolPtrInput
	// The application type. Defaults to `selfHosted`. Valid
	// values are `selfHosted`, `ssh`, `vnc`, `file` or `bookmark`.
	Type pulumi.StringPtrInput
	// The DNS zone to which the access application should be added. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (AccessApplicationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessApplicationArgs)(nil)).Elem()
}

type AccessApplicationInput interface {
	pulumi.Input

	ToAccessApplicationOutput() AccessApplicationOutput
	ToAccessApplicationOutputWithContext(ctx context.Context) AccessApplicationOutput
}

func (*AccessApplication) ElementType() reflect.Type {
	return reflect.TypeOf((*AccessApplication)(nil))
}

func (i *AccessApplication) ToAccessApplicationOutput() AccessApplicationOutput {
	return i.ToAccessApplicationOutputWithContext(context.Background())
}

func (i *AccessApplication) ToAccessApplicationOutputWithContext(ctx context.Context) AccessApplicationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessApplicationOutput)
}

func (i *AccessApplication) ToAccessApplicationPtrOutput() AccessApplicationPtrOutput {
	return i.ToAccessApplicationPtrOutputWithContext(context.Background())
}

func (i *AccessApplication) ToAccessApplicationPtrOutputWithContext(ctx context.Context) AccessApplicationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessApplicationPtrOutput)
}

type AccessApplicationPtrInput interface {
	pulumi.Input

	ToAccessApplicationPtrOutput() AccessApplicationPtrOutput
	ToAccessApplicationPtrOutputWithContext(ctx context.Context) AccessApplicationPtrOutput
}

type accessApplicationPtrType AccessApplicationArgs

func (*accessApplicationPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessApplication)(nil))
}

func (i *accessApplicationPtrType) ToAccessApplicationPtrOutput() AccessApplicationPtrOutput {
	return i.ToAccessApplicationPtrOutputWithContext(context.Background())
}

func (i *accessApplicationPtrType) ToAccessApplicationPtrOutputWithContext(ctx context.Context) AccessApplicationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessApplicationPtrOutput)
}

// AccessApplicationArrayInput is an input type that accepts AccessApplicationArray and AccessApplicationArrayOutput values.
// You can construct a concrete instance of `AccessApplicationArrayInput` via:
//
//          AccessApplicationArray{ AccessApplicationArgs{...} }
type AccessApplicationArrayInput interface {
	pulumi.Input

	ToAccessApplicationArrayOutput() AccessApplicationArrayOutput
	ToAccessApplicationArrayOutputWithContext(context.Context) AccessApplicationArrayOutput
}

type AccessApplicationArray []AccessApplicationInput

func (AccessApplicationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessApplication)(nil)).Elem()
}

func (i AccessApplicationArray) ToAccessApplicationArrayOutput() AccessApplicationArrayOutput {
	return i.ToAccessApplicationArrayOutputWithContext(context.Background())
}

func (i AccessApplicationArray) ToAccessApplicationArrayOutputWithContext(ctx context.Context) AccessApplicationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessApplicationArrayOutput)
}

// AccessApplicationMapInput is an input type that accepts AccessApplicationMap and AccessApplicationMapOutput values.
// You can construct a concrete instance of `AccessApplicationMapInput` via:
//
//          AccessApplicationMap{ "key": AccessApplicationArgs{...} }
type AccessApplicationMapInput interface {
	pulumi.Input

	ToAccessApplicationMapOutput() AccessApplicationMapOutput
	ToAccessApplicationMapOutputWithContext(context.Context) AccessApplicationMapOutput
}

type AccessApplicationMap map[string]AccessApplicationInput

func (AccessApplicationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessApplication)(nil)).Elem()
}

func (i AccessApplicationMap) ToAccessApplicationMapOutput() AccessApplicationMapOutput {
	return i.ToAccessApplicationMapOutputWithContext(context.Background())
}

func (i AccessApplicationMap) ToAccessApplicationMapOutputWithContext(ctx context.Context) AccessApplicationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessApplicationMapOutput)
}

type AccessApplicationOutput struct{ *pulumi.OutputState }

func (AccessApplicationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AccessApplication)(nil))
}

func (o AccessApplicationOutput) ToAccessApplicationOutput() AccessApplicationOutput {
	return o
}

func (o AccessApplicationOutput) ToAccessApplicationOutputWithContext(ctx context.Context) AccessApplicationOutput {
	return o
}

func (o AccessApplicationOutput) ToAccessApplicationPtrOutput() AccessApplicationPtrOutput {
	return o.ToAccessApplicationPtrOutputWithContext(context.Background())
}

func (o AccessApplicationOutput) ToAccessApplicationPtrOutputWithContext(ctx context.Context) AccessApplicationPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v AccessApplication) *AccessApplication {
		return &v
	}).(AccessApplicationPtrOutput)
}

type AccessApplicationPtrOutput struct{ *pulumi.OutputState }

func (AccessApplicationPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessApplication)(nil))
}

func (o AccessApplicationPtrOutput) ToAccessApplicationPtrOutput() AccessApplicationPtrOutput {
	return o
}

func (o AccessApplicationPtrOutput) ToAccessApplicationPtrOutputWithContext(ctx context.Context) AccessApplicationPtrOutput {
	return o
}

func (o AccessApplicationPtrOutput) Elem() AccessApplicationOutput {
	return o.ApplyT(func(v *AccessApplication) AccessApplication {
		if v != nil {
			return *v
		}
		var ret AccessApplication
		return ret
	}).(AccessApplicationOutput)
}

type AccessApplicationArrayOutput struct{ *pulumi.OutputState }

func (AccessApplicationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AccessApplication)(nil))
}

func (o AccessApplicationArrayOutput) ToAccessApplicationArrayOutput() AccessApplicationArrayOutput {
	return o
}

func (o AccessApplicationArrayOutput) ToAccessApplicationArrayOutputWithContext(ctx context.Context) AccessApplicationArrayOutput {
	return o
}

func (o AccessApplicationArrayOutput) Index(i pulumi.IntInput) AccessApplicationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AccessApplication {
		return vs[0].([]AccessApplication)[vs[1].(int)]
	}).(AccessApplicationOutput)
}

type AccessApplicationMapOutput struct{ *pulumi.OutputState }

func (AccessApplicationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]AccessApplication)(nil))
}

func (o AccessApplicationMapOutput) ToAccessApplicationMapOutput() AccessApplicationMapOutput {
	return o
}

func (o AccessApplicationMapOutput) ToAccessApplicationMapOutputWithContext(ctx context.Context) AccessApplicationMapOutput {
	return o
}

func (o AccessApplicationMapOutput) MapIndex(k pulumi.StringInput) AccessApplicationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) AccessApplication {
		return vs[0].(map[string]AccessApplication)[vs[1].(string)]
	}).(AccessApplicationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessApplicationInput)(nil)).Elem(), &AccessApplication{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessApplicationPtrInput)(nil)).Elem(), &AccessApplication{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessApplicationArrayInput)(nil)).Elem(), AccessApplicationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessApplicationMapInput)(nil)).Elem(), AccessApplicationMap{})
	pulumi.RegisterOutputType(AccessApplicationOutput{})
	pulumi.RegisterOutputType(AccessApplicationPtrOutput{})
	pulumi.RegisterOutputType(AccessApplicationArrayOutput{})
	pulumi.RegisterOutputType(AccessApplicationMapOutput{})
}

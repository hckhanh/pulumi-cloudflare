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

// A Zero Trust organization defines the user login experience.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			_, err := cloudflare.NewAccessOrganization(ctx, "example", &cloudflare.AccessOrganizationArgs{
//				AccountId:              pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				AuthDomain:             pulumi.String("example.cloudflareaccess.com"),
//				AutoRedirectToIdentity: pulumi.Bool(false),
//				IsUiReadOnly:           pulumi.Bool(false),
//				LoginDesigns: cloudflare.AccessOrganizationLoginDesignArray{
//					&cloudflare.AccessOrganizationLoginDesignArgs{
//						BackgroundColor: pulumi.String("#ffffff"),
//						FooterText:      pulumi.String("My footer text"),
//						HeaderText:      pulumi.String("My header text"),
//						LogoPath:        pulumi.String("https://example.com/logo.png"),
//						TextColor:       pulumi.String("#000000"),
//					},
//				},
//				Name:                           pulumi.String("example.cloudflareaccess.com"),
//				UserSeatExpirationInactiveTime: pulumi.String("720h"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// ```sh
// $ pulumi import cloudflare:index/accessOrganization:AccessOrganization example <account_id>
// ```
type AccessOrganization struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
	AllowAuthenticateViaWarp pulumi.BoolPtrOutput `pulumi:"allowAuthenticateViaWarp"`
	// The unique subdomain assigned to your Zero Trust organization.
	AuthDomain pulumi.StringOutput `pulumi:"authDomain"`
	// When set to true, users skip the identity provider selection step during login.
	AutoRedirectToIdentity pulumi.BoolPtrOutput `pulumi:"autoRedirectToIdentity"`
	// Custom pages for your Zero Trust organization.
	CustomPages AccessOrganizationCustomPageArrayOutput `pulumi:"customPages"`
	// When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
	IsUiReadOnly pulumi.BoolPtrOutput                     `pulumi:"isUiReadOnly"`
	LoginDesigns AccessOrganizationLoginDesignArrayOutput `pulumi:"loginDesigns"`
	// The name of your Zero Trust organization.
	Name pulumi.StringPtrOutput `pulumi:"name"`
	// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
	SessionDuration pulumi.StringPtrOutput `pulumi:"sessionDuration"`
	// A description of the reason why the UI read only field is being toggled.
	UiReadOnlyToggleReason pulumi.StringPtrOutput `pulumi:"uiReadOnlyToggleReason"`
	// The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
	UserSeatExpirationInactiveTime pulumi.StringPtrOutput `pulumi:"userSeatExpirationInactiveTime"`
	// The amount of time that tokens issued for applications will be valid. Must be in the format 30m or 2h45m. Valid time units are: m, h.
	WarpAuthSessionDuration pulumi.StringPtrOutput `pulumi:"warpAuthSessionDuration"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewAccessOrganization registers a new resource with the given unique name, arguments, and options.
func NewAccessOrganization(ctx *pulumi.Context,
	name string, args *AccessOrganizationArgs, opts ...pulumi.ResourceOption) (*AccessOrganization, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AuthDomain == nil {
		return nil, errors.New("invalid value for required argument 'AuthDomain'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AccessOrganization
	err := ctx.RegisterResource("cloudflare:index/accessOrganization:AccessOrganization", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessOrganization gets an existing AccessOrganization resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessOrganization(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessOrganizationState, opts ...pulumi.ResourceOption) (*AccessOrganization, error) {
	var resource AccessOrganization
	err := ctx.ReadResource("cloudflare:index/accessOrganization:AccessOrganization", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessOrganization resources.
type accessOrganizationState struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
	AllowAuthenticateViaWarp *bool `pulumi:"allowAuthenticateViaWarp"`
	// The unique subdomain assigned to your Zero Trust organization.
	AuthDomain *string `pulumi:"authDomain"`
	// When set to true, users skip the identity provider selection step during login.
	AutoRedirectToIdentity *bool `pulumi:"autoRedirectToIdentity"`
	// Custom pages for your Zero Trust organization.
	CustomPages []AccessOrganizationCustomPage `pulumi:"customPages"`
	// When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
	IsUiReadOnly *bool                           `pulumi:"isUiReadOnly"`
	LoginDesigns []AccessOrganizationLoginDesign `pulumi:"loginDesigns"`
	// The name of your Zero Trust organization.
	Name *string `pulumi:"name"`
	// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
	SessionDuration *string `pulumi:"sessionDuration"`
	// A description of the reason why the UI read only field is being toggled.
	UiReadOnlyToggleReason *string `pulumi:"uiReadOnlyToggleReason"`
	// The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
	UserSeatExpirationInactiveTime *string `pulumi:"userSeatExpirationInactiveTime"`
	// The amount of time that tokens issued for applications will be valid. Must be in the format 30m or 2h45m. Valid time units are: m, h.
	WarpAuthSessionDuration *string `pulumi:"warpAuthSessionDuration"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

type AccessOrganizationState struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrInput
	// When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
	AllowAuthenticateViaWarp pulumi.BoolPtrInput
	// The unique subdomain assigned to your Zero Trust organization.
	AuthDomain pulumi.StringPtrInput
	// When set to true, users skip the identity provider selection step during login.
	AutoRedirectToIdentity pulumi.BoolPtrInput
	// Custom pages for your Zero Trust organization.
	CustomPages AccessOrganizationCustomPageArrayInput
	// When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
	IsUiReadOnly pulumi.BoolPtrInput
	LoginDesigns AccessOrganizationLoginDesignArrayInput
	// The name of your Zero Trust organization.
	Name pulumi.StringPtrInput
	// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
	SessionDuration pulumi.StringPtrInput
	// A description of the reason why the UI read only field is being toggled.
	UiReadOnlyToggleReason pulumi.StringPtrInput
	// The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
	UserSeatExpirationInactiveTime pulumi.StringPtrInput
	// The amount of time that tokens issued for applications will be valid. Must be in the format 30m or 2h45m. Valid time units are: m, h.
	WarpAuthSessionDuration pulumi.StringPtrInput
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (AccessOrganizationState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessOrganizationState)(nil)).Elem()
}

type accessOrganizationArgs struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
	AllowAuthenticateViaWarp *bool `pulumi:"allowAuthenticateViaWarp"`
	// The unique subdomain assigned to your Zero Trust organization.
	AuthDomain string `pulumi:"authDomain"`
	// When set to true, users skip the identity provider selection step during login.
	AutoRedirectToIdentity *bool `pulumi:"autoRedirectToIdentity"`
	// Custom pages for your Zero Trust organization.
	CustomPages []AccessOrganizationCustomPage `pulumi:"customPages"`
	// When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
	IsUiReadOnly *bool                           `pulumi:"isUiReadOnly"`
	LoginDesigns []AccessOrganizationLoginDesign `pulumi:"loginDesigns"`
	// The name of your Zero Trust organization.
	Name *string `pulumi:"name"`
	// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
	SessionDuration *string `pulumi:"sessionDuration"`
	// A description of the reason why the UI read only field is being toggled.
	UiReadOnlyToggleReason *string `pulumi:"uiReadOnlyToggleReason"`
	// The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
	UserSeatExpirationInactiveTime *string `pulumi:"userSeatExpirationInactiveTime"`
	// The amount of time that tokens issued for applications will be valid. Must be in the format 30m or 2h45m. Valid time units are: m, h.
	WarpAuthSessionDuration *string `pulumi:"warpAuthSessionDuration"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a AccessOrganization resource.
type AccessOrganizationArgs struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrInput
	// When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
	AllowAuthenticateViaWarp pulumi.BoolPtrInput
	// The unique subdomain assigned to your Zero Trust organization.
	AuthDomain pulumi.StringInput
	// When set to true, users skip the identity provider selection step during login.
	AutoRedirectToIdentity pulumi.BoolPtrInput
	// Custom pages for your Zero Trust organization.
	CustomPages AccessOrganizationCustomPageArrayInput
	// When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
	IsUiReadOnly pulumi.BoolPtrInput
	LoginDesigns AccessOrganizationLoginDesignArrayInput
	// The name of your Zero Trust organization.
	Name pulumi.StringPtrInput
	// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
	SessionDuration pulumi.StringPtrInput
	// A description of the reason why the UI read only field is being toggled.
	UiReadOnlyToggleReason pulumi.StringPtrInput
	// The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
	UserSeatExpirationInactiveTime pulumi.StringPtrInput
	// The amount of time that tokens issued for applications will be valid. Must be in the format 30m or 2h45m. Valid time units are: m, h.
	WarpAuthSessionDuration pulumi.StringPtrInput
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (AccessOrganizationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessOrganizationArgs)(nil)).Elem()
}

type AccessOrganizationInput interface {
	pulumi.Input

	ToAccessOrganizationOutput() AccessOrganizationOutput
	ToAccessOrganizationOutputWithContext(ctx context.Context) AccessOrganizationOutput
}

func (*AccessOrganization) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessOrganization)(nil)).Elem()
}

func (i *AccessOrganization) ToAccessOrganizationOutput() AccessOrganizationOutput {
	return i.ToAccessOrganizationOutputWithContext(context.Background())
}

func (i *AccessOrganization) ToAccessOrganizationOutputWithContext(ctx context.Context) AccessOrganizationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessOrganizationOutput)
}

// AccessOrganizationArrayInput is an input type that accepts AccessOrganizationArray and AccessOrganizationArrayOutput values.
// You can construct a concrete instance of `AccessOrganizationArrayInput` via:
//
//	AccessOrganizationArray{ AccessOrganizationArgs{...} }
type AccessOrganizationArrayInput interface {
	pulumi.Input

	ToAccessOrganizationArrayOutput() AccessOrganizationArrayOutput
	ToAccessOrganizationArrayOutputWithContext(context.Context) AccessOrganizationArrayOutput
}

type AccessOrganizationArray []AccessOrganizationInput

func (AccessOrganizationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessOrganization)(nil)).Elem()
}

func (i AccessOrganizationArray) ToAccessOrganizationArrayOutput() AccessOrganizationArrayOutput {
	return i.ToAccessOrganizationArrayOutputWithContext(context.Background())
}

func (i AccessOrganizationArray) ToAccessOrganizationArrayOutputWithContext(ctx context.Context) AccessOrganizationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessOrganizationArrayOutput)
}

// AccessOrganizationMapInput is an input type that accepts AccessOrganizationMap and AccessOrganizationMapOutput values.
// You can construct a concrete instance of `AccessOrganizationMapInput` via:
//
//	AccessOrganizationMap{ "key": AccessOrganizationArgs{...} }
type AccessOrganizationMapInput interface {
	pulumi.Input

	ToAccessOrganizationMapOutput() AccessOrganizationMapOutput
	ToAccessOrganizationMapOutputWithContext(context.Context) AccessOrganizationMapOutput
}

type AccessOrganizationMap map[string]AccessOrganizationInput

func (AccessOrganizationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessOrganization)(nil)).Elem()
}

func (i AccessOrganizationMap) ToAccessOrganizationMapOutput() AccessOrganizationMapOutput {
	return i.ToAccessOrganizationMapOutputWithContext(context.Background())
}

func (i AccessOrganizationMap) ToAccessOrganizationMapOutputWithContext(ctx context.Context) AccessOrganizationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessOrganizationMapOutput)
}

type AccessOrganizationOutput struct{ *pulumi.OutputState }

func (AccessOrganizationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessOrganization)(nil)).Elem()
}

func (o AccessOrganizationOutput) ToAccessOrganizationOutput() AccessOrganizationOutput {
	return o
}

func (o AccessOrganizationOutput) ToAccessOrganizationOutputWithContext(ctx context.Context) AccessOrganizationOutput {
	return o
}

// The account identifier to target for the resource. Conflicts with `zoneId`.
func (o AccessOrganizationOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessOrganization) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
func (o AccessOrganizationOutput) AllowAuthenticateViaWarp() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AccessOrganization) pulumi.BoolPtrOutput { return v.AllowAuthenticateViaWarp }).(pulumi.BoolPtrOutput)
}

// The unique subdomain assigned to your Zero Trust organization.
func (o AccessOrganizationOutput) AuthDomain() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessOrganization) pulumi.StringOutput { return v.AuthDomain }).(pulumi.StringOutput)
}

// When set to true, users skip the identity provider selection step during login.
func (o AccessOrganizationOutput) AutoRedirectToIdentity() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AccessOrganization) pulumi.BoolPtrOutput { return v.AutoRedirectToIdentity }).(pulumi.BoolPtrOutput)
}

// Custom pages for your Zero Trust organization.
func (o AccessOrganizationOutput) CustomPages() AccessOrganizationCustomPageArrayOutput {
	return o.ApplyT(func(v *AccessOrganization) AccessOrganizationCustomPageArrayOutput { return v.CustomPages }).(AccessOrganizationCustomPageArrayOutput)
}

// When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
func (o AccessOrganizationOutput) IsUiReadOnly() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AccessOrganization) pulumi.BoolPtrOutput { return v.IsUiReadOnly }).(pulumi.BoolPtrOutput)
}

func (o AccessOrganizationOutput) LoginDesigns() AccessOrganizationLoginDesignArrayOutput {
	return o.ApplyT(func(v *AccessOrganization) AccessOrganizationLoginDesignArrayOutput { return v.LoginDesigns }).(AccessOrganizationLoginDesignArrayOutput)
}

// The name of your Zero Trust organization.
func (o AccessOrganizationOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessOrganization) pulumi.StringPtrOutput { return v.Name }).(pulumi.StringPtrOutput)
}

// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
func (o AccessOrganizationOutput) SessionDuration() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessOrganization) pulumi.StringPtrOutput { return v.SessionDuration }).(pulumi.StringPtrOutput)
}

// A description of the reason why the UI read only field is being toggled.
func (o AccessOrganizationOutput) UiReadOnlyToggleReason() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessOrganization) pulumi.StringPtrOutput { return v.UiReadOnlyToggleReason }).(pulumi.StringPtrOutput)
}

// The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
func (o AccessOrganizationOutput) UserSeatExpirationInactiveTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessOrganization) pulumi.StringPtrOutput { return v.UserSeatExpirationInactiveTime }).(pulumi.StringPtrOutput)
}

// The amount of time that tokens issued for applications will be valid. Must be in the format 30m or 2h45m. Valid time units are: m, h.
func (o AccessOrganizationOutput) WarpAuthSessionDuration() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessOrganization) pulumi.StringPtrOutput { return v.WarpAuthSessionDuration }).(pulumi.StringPtrOutput)
}

// The zone identifier to target for the resource. Conflicts with `accountId`.
func (o AccessOrganizationOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessOrganization) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type AccessOrganizationArrayOutput struct{ *pulumi.OutputState }

func (AccessOrganizationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessOrganization)(nil)).Elem()
}

func (o AccessOrganizationArrayOutput) ToAccessOrganizationArrayOutput() AccessOrganizationArrayOutput {
	return o
}

func (o AccessOrganizationArrayOutput) ToAccessOrganizationArrayOutputWithContext(ctx context.Context) AccessOrganizationArrayOutput {
	return o
}

func (o AccessOrganizationArrayOutput) Index(i pulumi.IntInput) AccessOrganizationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessOrganization {
		return vs[0].([]*AccessOrganization)[vs[1].(int)]
	}).(AccessOrganizationOutput)
}

type AccessOrganizationMapOutput struct{ *pulumi.OutputState }

func (AccessOrganizationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessOrganization)(nil)).Elem()
}

func (o AccessOrganizationMapOutput) ToAccessOrganizationMapOutput() AccessOrganizationMapOutput {
	return o
}

func (o AccessOrganizationMapOutput) ToAccessOrganizationMapOutputWithContext(ctx context.Context) AccessOrganizationMapOutput {
	return o
}

func (o AccessOrganizationMapOutput) MapIndex(k pulumi.StringInput) AccessOrganizationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessOrganization {
		return vs[0].(map[string]*AccessOrganization)[vs[1].(string)]
	}).(AccessOrganizationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessOrganizationInput)(nil)).Elem(), &AccessOrganization{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessOrganizationArrayInput)(nil)).Elem(), AccessOrganizationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessOrganizationMapInput)(nil)).Elem(), AccessOrganizationMap{})
	pulumi.RegisterOutputType(AccessOrganizationOutput{})
	pulumi.RegisterOutputType(AccessOrganizationArrayOutput{})
	pulumi.RegisterOutputType(AccessOrganizationMapOutput{})
}

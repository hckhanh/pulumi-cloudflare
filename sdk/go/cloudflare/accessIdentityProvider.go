// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare Access Identity Provider resource. Identity
// Providers are used as an authentication or authorisation source
// within Access.
//
// > It's required that an `accountId` or `zoneId` is provided and in
// most cases using either is fine. However, if you're using a scoped
// access token, you must provide the argument that matches the token's
// scope. For example, an access token that is scoped to the "example.com"
// zone needs to use the `zoneId` argument.
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
//			_, err := cloudflare.NewAccessIdentityProvider(ctx, "pinLogin", &cloudflare.AccessIdentityProviderArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:      pulumi.String("PIN login"),
//				Type:      pulumi.String("onetimepin"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewAccessIdentityProvider(ctx, "githubOauth", &cloudflare.AccessIdentityProviderArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Configs: cloudflare.AccessIdentityProviderConfigArray{
//					&cloudflare.AccessIdentityProviderConfigArgs{
//						ClientId:     pulumi.String("example"),
//						ClientSecret: pulumi.String("secret_key"),
//					},
//				},
//				Name: pulumi.String("GitHub OAuth"),
//				Type: pulumi.String("github"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewAccessIdentityProvider(ctx, "jumpcloudSaml", &cloudflare.AccessIdentityProviderArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Configs: cloudflare.AccessIdentityProviderConfigArray{
//					&cloudflare.AccessIdentityProviderConfigArgs{
//						Attributes: pulumi.StringArray{
//							pulumi.String("email"),
//							pulumi.String("username"),
//						},
//						IdpPublicCert: pulumi.String("MIIDpDCCAoygAwIBAgIGAV2ka+55MA0GCSqGSIb3DQEBCwUAMIGSMQswCQ...GF/Q2/MHadws97cZg\nuTnQyuOqPuHbnN83d/2l1NSYKCbHt24o\n"),
//						IssuerUrl:     pulumi.String("jumpcloud"),
//						SignRequest:   pulumi.Bool(false),
//						SsoTargetUrl:  pulumi.String("https://sso.myexample.jumpcloud.com/saml2/cloudflareaccess"),
//					},
//				},
//				Name: pulumi.String("JumpCloud SAML"),
//				Type: pulumi.String("saml"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewAccessIdentityProvider(ctx, "okta", &cloudflare.AccessIdentityProviderArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Configs: cloudflare.AccessIdentityProviderConfigArray{
//					&cloudflare.AccessIdentityProviderConfigArgs{
//						ApiToken:     pulumi.String("okta_api_token"),
//						ClientId:     pulumi.String("example"),
//						ClientSecret: pulumi.String("secret_key"),
//						OktaAccount:  pulumi.String("https://example.com"),
//					},
//				},
//				Name: pulumi.String("Okta"),
//				Type: pulumi.String("okta"),
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
//	$ pulumi import cloudflare:index/accessIdentityProvider:AccessIdentityProvider example <account_id>/<identity_provider_id>
//
// ```
type AccessIdentityProvider struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
	Configs AccessIdentityProviderConfigArrayOutput `pulumi:"configs"`
	// Friendly name of the Access Identity Provider configuration.
	Name pulumi.StringOutput `pulumi:"name"`
	// The provider type to use. Available values: `centrify`, `facebook`, `google-apps`, `oidc`, `github`, `google`, `saml`, `linkedin`, `azureAD`, `okta`, `onetimepin`, `onelogin`, `yandex`.
	Type pulumi.StringOutput `pulumi:"type"`
	// The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrOutput `pulumi:"zoneId"`
}

// NewAccessIdentityProvider registers a new resource with the given unique name, arguments, and options.
func NewAccessIdentityProvider(ctx *pulumi.Context,
	name string, args *AccessIdentityProviderArgs, opts ...pulumi.ResourceOption) (*AccessIdentityProvider, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	var resource AccessIdentityProvider
	err := ctx.RegisterResource("cloudflare:index/accessIdentityProvider:AccessIdentityProvider", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessIdentityProvider gets an existing AccessIdentityProvider resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessIdentityProvider(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessIdentityProviderState, opts ...pulumi.ResourceOption) (*AccessIdentityProvider, error) {
	var resource AccessIdentityProvider
	err := ctx.ReadResource("cloudflare:index/accessIdentityProvider:AccessIdentityProvider", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessIdentityProvider resources.
type accessIdentityProviderState struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
	Configs []AccessIdentityProviderConfig `pulumi:"configs"`
	// Friendly name of the Access Identity Provider configuration.
	Name *string `pulumi:"name"`
	// The provider type to use. Available values: `centrify`, `facebook`, `google-apps`, `oidc`, `github`, `google`, `saml`, `linkedin`, `azureAD`, `okta`, `onetimepin`, `onelogin`, `yandex`.
	Type *string `pulumi:"type"`
	// The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type AccessIdentityProviderState struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
	Configs AccessIdentityProviderConfigArrayInput
	// Friendly name of the Access Identity Provider configuration.
	Name pulumi.StringPtrInput
	// The provider type to use. Available values: `centrify`, `facebook`, `google-apps`, `oidc`, `github`, `google`, `saml`, `linkedin`, `azureAD`, `okta`, `onetimepin`, `onelogin`, `yandex`.
	Type pulumi.StringPtrInput
	// The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (AccessIdentityProviderState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessIdentityProviderState)(nil)).Elem()
}

type accessIdentityProviderArgs struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
	Configs []AccessIdentityProviderConfig `pulumi:"configs"`
	// Friendly name of the Access Identity Provider configuration.
	Name string `pulumi:"name"`
	// The provider type to use. Available values: `centrify`, `facebook`, `google-apps`, `oidc`, `github`, `google`, `saml`, `linkedin`, `azureAD`, `okta`, `onetimepin`, `onelogin`, `yandex`.
	Type string `pulumi:"type"`
	// The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a AccessIdentityProvider resource.
type AccessIdentityProviderArgs struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
	Configs AccessIdentityProviderConfigArrayInput
	// Friendly name of the Access Identity Provider configuration.
	Name pulumi.StringInput
	// The provider type to use. Available values: `centrify`, `facebook`, `google-apps`, `oidc`, `github`, `google`, `saml`, `linkedin`, `azureAD`, `okta`, `onetimepin`, `onelogin`, `yandex`.
	Type pulumi.StringInput
	// The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (AccessIdentityProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessIdentityProviderArgs)(nil)).Elem()
}

type AccessIdentityProviderInput interface {
	pulumi.Input

	ToAccessIdentityProviderOutput() AccessIdentityProviderOutput
	ToAccessIdentityProviderOutputWithContext(ctx context.Context) AccessIdentityProviderOutput
}

func (*AccessIdentityProvider) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessIdentityProvider)(nil)).Elem()
}

func (i *AccessIdentityProvider) ToAccessIdentityProviderOutput() AccessIdentityProviderOutput {
	return i.ToAccessIdentityProviderOutputWithContext(context.Background())
}

func (i *AccessIdentityProvider) ToAccessIdentityProviderOutputWithContext(ctx context.Context) AccessIdentityProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessIdentityProviderOutput)
}

// AccessIdentityProviderArrayInput is an input type that accepts AccessIdentityProviderArray and AccessIdentityProviderArrayOutput values.
// You can construct a concrete instance of `AccessIdentityProviderArrayInput` via:
//
//	AccessIdentityProviderArray{ AccessIdentityProviderArgs{...} }
type AccessIdentityProviderArrayInput interface {
	pulumi.Input

	ToAccessIdentityProviderArrayOutput() AccessIdentityProviderArrayOutput
	ToAccessIdentityProviderArrayOutputWithContext(context.Context) AccessIdentityProviderArrayOutput
}

type AccessIdentityProviderArray []AccessIdentityProviderInput

func (AccessIdentityProviderArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessIdentityProvider)(nil)).Elem()
}

func (i AccessIdentityProviderArray) ToAccessIdentityProviderArrayOutput() AccessIdentityProviderArrayOutput {
	return i.ToAccessIdentityProviderArrayOutputWithContext(context.Background())
}

func (i AccessIdentityProviderArray) ToAccessIdentityProviderArrayOutputWithContext(ctx context.Context) AccessIdentityProviderArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessIdentityProviderArrayOutput)
}

// AccessIdentityProviderMapInput is an input type that accepts AccessIdentityProviderMap and AccessIdentityProviderMapOutput values.
// You can construct a concrete instance of `AccessIdentityProviderMapInput` via:
//
//	AccessIdentityProviderMap{ "key": AccessIdentityProviderArgs{...} }
type AccessIdentityProviderMapInput interface {
	pulumi.Input

	ToAccessIdentityProviderMapOutput() AccessIdentityProviderMapOutput
	ToAccessIdentityProviderMapOutputWithContext(context.Context) AccessIdentityProviderMapOutput
}

type AccessIdentityProviderMap map[string]AccessIdentityProviderInput

func (AccessIdentityProviderMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessIdentityProvider)(nil)).Elem()
}

func (i AccessIdentityProviderMap) ToAccessIdentityProviderMapOutput() AccessIdentityProviderMapOutput {
	return i.ToAccessIdentityProviderMapOutputWithContext(context.Background())
}

func (i AccessIdentityProviderMap) ToAccessIdentityProviderMapOutputWithContext(ctx context.Context) AccessIdentityProviderMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessIdentityProviderMapOutput)
}

type AccessIdentityProviderOutput struct{ *pulumi.OutputState }

func (AccessIdentityProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessIdentityProvider)(nil)).Elem()
}

func (o AccessIdentityProviderOutput) ToAccessIdentityProviderOutput() AccessIdentityProviderOutput {
	return o
}

func (o AccessIdentityProviderOutput) ToAccessIdentityProviderOutputWithContext(ctx context.Context) AccessIdentityProviderOutput {
	return o
}

// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
func (o AccessIdentityProviderOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessIdentityProvider) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

// Provider configuration from the [developer documentation](https://developers.cloudflare.com/access/configuring-identity-providers/).
func (o AccessIdentityProviderOutput) Configs() AccessIdentityProviderConfigArrayOutput {
	return o.ApplyT(func(v *AccessIdentityProvider) AccessIdentityProviderConfigArrayOutput { return v.Configs }).(AccessIdentityProviderConfigArrayOutput)
}

// Friendly name of the Access Identity Provider configuration.
func (o AccessIdentityProviderOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessIdentityProvider) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The provider type to use. Available values: `centrify`, `facebook`, `google-apps`, `oidc`, `github`, `google`, `saml`, `linkedin`, `azureAD`, `okta`, `onetimepin`, `onelogin`, `yandex`.
func (o AccessIdentityProviderOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessIdentityProvider) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The zone identifier to target for the resource. Conflicts with `accountId`. **Modifying this attribute will force creation of a new resource.**
func (o AccessIdentityProviderOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessIdentityProvider) pulumi.StringPtrOutput { return v.ZoneId }).(pulumi.StringPtrOutput)
}

type AccessIdentityProviderArrayOutput struct{ *pulumi.OutputState }

func (AccessIdentityProviderArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessIdentityProvider)(nil)).Elem()
}

func (o AccessIdentityProviderArrayOutput) ToAccessIdentityProviderArrayOutput() AccessIdentityProviderArrayOutput {
	return o
}

func (o AccessIdentityProviderArrayOutput) ToAccessIdentityProviderArrayOutputWithContext(ctx context.Context) AccessIdentityProviderArrayOutput {
	return o
}

func (o AccessIdentityProviderArrayOutput) Index(i pulumi.IntInput) AccessIdentityProviderOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessIdentityProvider {
		return vs[0].([]*AccessIdentityProvider)[vs[1].(int)]
	}).(AccessIdentityProviderOutput)
}

type AccessIdentityProviderMapOutput struct{ *pulumi.OutputState }

func (AccessIdentityProviderMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessIdentityProvider)(nil)).Elem()
}

func (o AccessIdentityProviderMapOutput) ToAccessIdentityProviderMapOutput() AccessIdentityProviderMapOutput {
	return o
}

func (o AccessIdentityProviderMapOutput) ToAccessIdentityProviderMapOutputWithContext(ctx context.Context) AccessIdentityProviderMapOutput {
	return o
}

func (o AccessIdentityProviderMapOutput) MapIndex(k pulumi.StringInput) AccessIdentityProviderOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessIdentityProvider {
		return vs[0].(map[string]*AccessIdentityProvider)[vs[1].(string)]
	}).(AccessIdentityProviderOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessIdentityProviderInput)(nil)).Elem(), &AccessIdentityProvider{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessIdentityProviderArrayInput)(nil)).Elem(), AccessIdentityProviderArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessIdentityProviderMapInput)(nil)).Elem(), AccessIdentityProviderMap{})
	pulumi.RegisterOutputType(AccessIdentityProviderOutput{})
	pulumi.RegisterOutputType(AccessIdentityProviderArrayOutput{})
	pulumi.RegisterOutputType(AccessIdentityProviderMapOutput{})
}

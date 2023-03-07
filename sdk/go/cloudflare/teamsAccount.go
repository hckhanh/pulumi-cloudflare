// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare Teams Account resource. The Teams Account
// resource defines configuration for secure web gateway.
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
//			_, err := cloudflare.NewTeamsAccount(ctx, "example", &cloudflare.TeamsAccountArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Antivirus: &cloudflare.TeamsAccountAntivirusArgs{
//					EnabledDownloadPhase: pulumi.Bool(true),
//					EnabledUploadPhase:   pulumi.Bool(false),
//					FailClosed:           pulumi.Bool(true),
//				},
//				BlockPage: &cloudflare.TeamsAccountBlockPageArgs{
//					BackgroundColor: pulumi.String("#000000"),
//					FooterText:      pulumi.String("hello"),
//					HeaderText:      pulumi.String("hello"),
//					LogoPath:        pulumi.String("https://example.com/logo.jpg"),
//				},
//				Fips: &cloudflare.TeamsAccountFipsArgs{
//					Tls: pulumi.Bool(true),
//				},
//				Logging: &cloudflare.TeamsAccountLoggingArgs{
//					RedactPii: pulumi.Bool(true),
//					SettingsByRuleType: &cloudflare.TeamsAccountLoggingSettingsByRuleTypeArgs{
//						Dns: &cloudflare.TeamsAccountLoggingSettingsByRuleTypeDnsArgs{
//							LogAll:    pulumi.Bool(false),
//							LogBlocks: pulumi.Bool(true),
//						},
//						Http: &cloudflare.TeamsAccountLoggingSettingsByRuleTypeHttpArgs{
//							LogAll:    pulumi.Bool(true),
//							LogBlocks: pulumi.Bool(true),
//						},
//						L4: &cloudflare.TeamsAccountLoggingSettingsByRuleTypeL4Args{
//							LogAll:    pulumi.Bool(false),
//							LogBlocks: pulumi.Bool(true),
//						},
//					},
//				},
//				Proxy: &cloudflare.TeamsAccountProxyArgs{
//					Tcp: pulumi.Bool(true),
//					Udp: pulumi.Bool(true),
//				},
//				TlsDecryptEnabled:          pulumi.Bool(true),
//				UrlBrowserIsolationEnabled: pulumi.Bool(true),
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
//	$ pulumi import cloudflare:index/teamsAccount:TeamsAccount example <account_id>
//
// ```
type TeamsAccount struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Whether to enable the activity log.
	ActivityLogEnabled pulumi.BoolPtrOutput `pulumi:"activityLogEnabled"`
	// Configuration block for antivirus traffic scanning.
	Antivirus TeamsAccountAntivirusPtrOutput `pulumi:"antivirus"`
	// Configuration for a custom block page.
	BlockPage TeamsAccountBlockPagePtrOutput `pulumi:"blockPage"`
	// Configure compliance with Federal Information Processing Standards.
	Fips    TeamsAccountFipsPtrOutput    `pulumi:"fips"`
	Logging TeamsAccountLoggingPtrOutput `pulumi:"logging"`
	// Configuration block for specifying which protocols are proxied.
	Proxy TeamsAccountProxyPtrOutput `pulumi:"proxy"`
	// Indicator that decryption of TLS traffic is enabled.
	TlsDecryptEnabled pulumi.BoolPtrOutput `pulumi:"tlsDecryptEnabled"`
	// Safely browse websites in Browser Isolation through a URL.
	UrlBrowserIsolationEnabled pulumi.BoolPtrOutput `pulumi:"urlBrowserIsolationEnabled"`
}

// NewTeamsAccount registers a new resource with the given unique name, arguments, and options.
func NewTeamsAccount(ctx *pulumi.Context,
	name string, args *TeamsAccountArgs, opts ...pulumi.ResourceOption) (*TeamsAccount, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	var resource TeamsAccount
	err := ctx.RegisterResource("cloudflare:index/teamsAccount:TeamsAccount", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTeamsAccount gets an existing TeamsAccount resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTeamsAccount(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TeamsAccountState, opts ...pulumi.ResourceOption) (*TeamsAccount, error) {
	var resource TeamsAccount
	err := ctx.ReadResource("cloudflare:index/teamsAccount:TeamsAccount", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TeamsAccount resources.
type teamsAccountState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// Whether to enable the activity log.
	ActivityLogEnabled *bool `pulumi:"activityLogEnabled"`
	// Configuration block for antivirus traffic scanning.
	Antivirus *TeamsAccountAntivirus `pulumi:"antivirus"`
	// Configuration for a custom block page.
	BlockPage *TeamsAccountBlockPage `pulumi:"blockPage"`
	// Configure compliance with Federal Information Processing Standards.
	Fips    *TeamsAccountFips    `pulumi:"fips"`
	Logging *TeamsAccountLogging `pulumi:"logging"`
	// Configuration block for specifying which protocols are proxied.
	Proxy *TeamsAccountProxy `pulumi:"proxy"`
	// Indicator that decryption of TLS traffic is enabled.
	TlsDecryptEnabled *bool `pulumi:"tlsDecryptEnabled"`
	// Safely browse websites in Browser Isolation through a URL.
	UrlBrowserIsolationEnabled *bool `pulumi:"urlBrowserIsolationEnabled"`
}

type TeamsAccountState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// Whether to enable the activity log.
	ActivityLogEnabled pulumi.BoolPtrInput
	// Configuration block for antivirus traffic scanning.
	Antivirus TeamsAccountAntivirusPtrInput
	// Configuration for a custom block page.
	BlockPage TeamsAccountBlockPagePtrInput
	// Configure compliance with Federal Information Processing Standards.
	Fips    TeamsAccountFipsPtrInput
	Logging TeamsAccountLoggingPtrInput
	// Configuration block for specifying which protocols are proxied.
	Proxy TeamsAccountProxyPtrInput
	// Indicator that decryption of TLS traffic is enabled.
	TlsDecryptEnabled pulumi.BoolPtrInput
	// Safely browse websites in Browser Isolation through a URL.
	UrlBrowserIsolationEnabled pulumi.BoolPtrInput
}

func (TeamsAccountState) ElementType() reflect.Type {
	return reflect.TypeOf((*teamsAccountState)(nil)).Elem()
}

type teamsAccountArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// Whether to enable the activity log.
	ActivityLogEnabled *bool `pulumi:"activityLogEnabled"`
	// Configuration block for antivirus traffic scanning.
	Antivirus *TeamsAccountAntivirus `pulumi:"antivirus"`
	// Configuration for a custom block page.
	BlockPage *TeamsAccountBlockPage `pulumi:"blockPage"`
	// Configure compliance with Federal Information Processing Standards.
	Fips    *TeamsAccountFips    `pulumi:"fips"`
	Logging *TeamsAccountLogging `pulumi:"logging"`
	// Configuration block for specifying which protocols are proxied.
	Proxy *TeamsAccountProxy `pulumi:"proxy"`
	// Indicator that decryption of TLS traffic is enabled.
	TlsDecryptEnabled *bool `pulumi:"tlsDecryptEnabled"`
	// Safely browse websites in Browser Isolation through a URL.
	UrlBrowserIsolationEnabled *bool `pulumi:"urlBrowserIsolationEnabled"`
}

// The set of arguments for constructing a TeamsAccount resource.
type TeamsAccountArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// Whether to enable the activity log.
	ActivityLogEnabled pulumi.BoolPtrInput
	// Configuration block for antivirus traffic scanning.
	Antivirus TeamsAccountAntivirusPtrInput
	// Configuration for a custom block page.
	BlockPage TeamsAccountBlockPagePtrInput
	// Configure compliance with Federal Information Processing Standards.
	Fips    TeamsAccountFipsPtrInput
	Logging TeamsAccountLoggingPtrInput
	// Configuration block for specifying which protocols are proxied.
	Proxy TeamsAccountProxyPtrInput
	// Indicator that decryption of TLS traffic is enabled.
	TlsDecryptEnabled pulumi.BoolPtrInput
	// Safely browse websites in Browser Isolation through a URL.
	UrlBrowserIsolationEnabled pulumi.BoolPtrInput
}

func (TeamsAccountArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*teamsAccountArgs)(nil)).Elem()
}

type TeamsAccountInput interface {
	pulumi.Input

	ToTeamsAccountOutput() TeamsAccountOutput
	ToTeamsAccountOutputWithContext(ctx context.Context) TeamsAccountOutput
}

func (*TeamsAccount) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamsAccount)(nil)).Elem()
}

func (i *TeamsAccount) ToTeamsAccountOutput() TeamsAccountOutput {
	return i.ToTeamsAccountOutputWithContext(context.Background())
}

func (i *TeamsAccount) ToTeamsAccountOutputWithContext(ctx context.Context) TeamsAccountOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsAccountOutput)
}

// TeamsAccountArrayInput is an input type that accepts TeamsAccountArray and TeamsAccountArrayOutput values.
// You can construct a concrete instance of `TeamsAccountArrayInput` via:
//
//	TeamsAccountArray{ TeamsAccountArgs{...} }
type TeamsAccountArrayInput interface {
	pulumi.Input

	ToTeamsAccountArrayOutput() TeamsAccountArrayOutput
	ToTeamsAccountArrayOutputWithContext(context.Context) TeamsAccountArrayOutput
}

type TeamsAccountArray []TeamsAccountInput

func (TeamsAccountArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TeamsAccount)(nil)).Elem()
}

func (i TeamsAccountArray) ToTeamsAccountArrayOutput() TeamsAccountArrayOutput {
	return i.ToTeamsAccountArrayOutputWithContext(context.Background())
}

func (i TeamsAccountArray) ToTeamsAccountArrayOutputWithContext(ctx context.Context) TeamsAccountArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsAccountArrayOutput)
}

// TeamsAccountMapInput is an input type that accepts TeamsAccountMap and TeamsAccountMapOutput values.
// You can construct a concrete instance of `TeamsAccountMapInput` via:
//
//	TeamsAccountMap{ "key": TeamsAccountArgs{...} }
type TeamsAccountMapInput interface {
	pulumi.Input

	ToTeamsAccountMapOutput() TeamsAccountMapOutput
	ToTeamsAccountMapOutputWithContext(context.Context) TeamsAccountMapOutput
}

type TeamsAccountMap map[string]TeamsAccountInput

func (TeamsAccountMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TeamsAccount)(nil)).Elem()
}

func (i TeamsAccountMap) ToTeamsAccountMapOutput() TeamsAccountMapOutput {
	return i.ToTeamsAccountMapOutputWithContext(context.Background())
}

func (i TeamsAccountMap) ToTeamsAccountMapOutputWithContext(ctx context.Context) TeamsAccountMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsAccountMapOutput)
}

type TeamsAccountOutput struct{ *pulumi.OutputState }

func (TeamsAccountOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamsAccount)(nil)).Elem()
}

func (o TeamsAccountOutput) ToTeamsAccountOutput() TeamsAccountOutput {
	return o
}

func (o TeamsAccountOutput) ToTeamsAccountOutputWithContext(ctx context.Context) TeamsAccountOutput {
	return o
}

// The account identifier to target for the resource.
func (o TeamsAccountOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsAccount) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Whether to enable the activity log.
func (o TeamsAccountOutput) ActivityLogEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TeamsAccount) pulumi.BoolPtrOutput { return v.ActivityLogEnabled }).(pulumi.BoolPtrOutput)
}

// Configuration block for antivirus traffic scanning.
func (o TeamsAccountOutput) Antivirus() TeamsAccountAntivirusPtrOutput {
	return o.ApplyT(func(v *TeamsAccount) TeamsAccountAntivirusPtrOutput { return v.Antivirus }).(TeamsAccountAntivirusPtrOutput)
}

// Configuration for a custom block page.
func (o TeamsAccountOutput) BlockPage() TeamsAccountBlockPagePtrOutput {
	return o.ApplyT(func(v *TeamsAccount) TeamsAccountBlockPagePtrOutput { return v.BlockPage }).(TeamsAccountBlockPagePtrOutput)
}

// Configure compliance with Federal Information Processing Standards.
func (o TeamsAccountOutput) Fips() TeamsAccountFipsPtrOutput {
	return o.ApplyT(func(v *TeamsAccount) TeamsAccountFipsPtrOutput { return v.Fips }).(TeamsAccountFipsPtrOutput)
}

func (o TeamsAccountOutput) Logging() TeamsAccountLoggingPtrOutput {
	return o.ApplyT(func(v *TeamsAccount) TeamsAccountLoggingPtrOutput { return v.Logging }).(TeamsAccountLoggingPtrOutput)
}

// Configuration block for specifying which protocols are proxied.
func (o TeamsAccountOutput) Proxy() TeamsAccountProxyPtrOutput {
	return o.ApplyT(func(v *TeamsAccount) TeamsAccountProxyPtrOutput { return v.Proxy }).(TeamsAccountProxyPtrOutput)
}

// Indicator that decryption of TLS traffic is enabled.
func (o TeamsAccountOutput) TlsDecryptEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TeamsAccount) pulumi.BoolPtrOutput { return v.TlsDecryptEnabled }).(pulumi.BoolPtrOutput)
}

// Safely browse websites in Browser Isolation through a URL.
func (o TeamsAccountOutput) UrlBrowserIsolationEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TeamsAccount) pulumi.BoolPtrOutput { return v.UrlBrowserIsolationEnabled }).(pulumi.BoolPtrOutput)
}

type TeamsAccountArrayOutput struct{ *pulumi.OutputState }

func (TeamsAccountArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TeamsAccount)(nil)).Elem()
}

func (o TeamsAccountArrayOutput) ToTeamsAccountArrayOutput() TeamsAccountArrayOutput {
	return o
}

func (o TeamsAccountArrayOutput) ToTeamsAccountArrayOutputWithContext(ctx context.Context) TeamsAccountArrayOutput {
	return o
}

func (o TeamsAccountArrayOutput) Index(i pulumi.IntInput) TeamsAccountOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TeamsAccount {
		return vs[0].([]*TeamsAccount)[vs[1].(int)]
	}).(TeamsAccountOutput)
}

type TeamsAccountMapOutput struct{ *pulumi.OutputState }

func (TeamsAccountMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TeamsAccount)(nil)).Elem()
}

func (o TeamsAccountMapOutput) ToTeamsAccountMapOutput() TeamsAccountMapOutput {
	return o
}

func (o TeamsAccountMapOutput) ToTeamsAccountMapOutputWithContext(ctx context.Context) TeamsAccountMapOutput {
	return o
}

func (o TeamsAccountMapOutput) MapIndex(k pulumi.StringInput) TeamsAccountOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TeamsAccount {
		return vs[0].(map[string]*TeamsAccount)[vs[1].(string)]
	}).(TeamsAccountOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsAccountInput)(nil)).Elem(), &TeamsAccount{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsAccountArrayInput)(nil)).Elem(), TeamsAccountArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsAccountMapInput)(nil)).Elem(), TeamsAccountMap{})
	pulumi.RegisterOutputType(TeamsAccountOutput{})
	pulumi.RegisterOutputType(TeamsAccountArrayOutput{})
	pulumi.RegisterOutputType(TeamsAccountMapOutput{})
}

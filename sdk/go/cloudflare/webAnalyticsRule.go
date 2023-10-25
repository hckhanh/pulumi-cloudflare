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

// Provides a Cloudflare Web Analytics Rule resource.
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
//			exampleWebAnalyticsSite, err := cloudflare.NewWebAnalyticsSite(ctx, "exampleWebAnalyticsSite", &cloudflare.WebAnalyticsSiteArgs{
//				AccountId:   pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				ZoneTag:     pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				AutoInstall: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewWebAnalyticsRule(ctx, "exampleWebAnalyticsRule", &cloudflare.WebAnalyticsRuleArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				RulesetId: exampleWebAnalyticsSite.RulesetId,
//				Host:      pulumi.String("*"),
//				Paths: pulumi.StringArray{
//					pulumi.String("/excluded"),
//				},
//				Inclusive: pulumi.Bool(false),
//				IsPaused:  pulumi.Bool(false),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				exampleWebAnalyticsSite,
//			}))
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
//	$ pulumi import cloudflare:index/webAnalyticsRule:WebAnalyticsRule example <account_id>/<ruleset_id>/<rule_id>
//
// ```
type WebAnalyticsRule struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The host to apply the rule to.
	Host pulumi.StringOutput `pulumi:"host"`
	// Whether the rule includes or excludes the matched traffic from being measured in Web Analytics.
	Inclusive pulumi.BoolOutput `pulumi:"inclusive"`
	// Whether the rule is paused or not.
	IsPaused pulumi.BoolOutput `pulumi:"isPaused"`
	// A list of paths to apply the rule to.
	Paths pulumi.StringArrayOutput `pulumi:"paths"`
	// The Web Analytics ruleset id. **Modifying this attribute will force creation of a new resource.**
	RulesetId pulumi.StringOutput `pulumi:"rulesetId"`
}

// NewWebAnalyticsRule registers a new resource with the given unique name, arguments, and options.
func NewWebAnalyticsRule(ctx *pulumi.Context,
	name string, args *WebAnalyticsRuleArgs, opts ...pulumi.ResourceOption) (*WebAnalyticsRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Host == nil {
		return nil, errors.New("invalid value for required argument 'Host'")
	}
	if args.Inclusive == nil {
		return nil, errors.New("invalid value for required argument 'Inclusive'")
	}
	if args.IsPaused == nil {
		return nil, errors.New("invalid value for required argument 'IsPaused'")
	}
	if args.Paths == nil {
		return nil, errors.New("invalid value for required argument 'Paths'")
	}
	if args.RulesetId == nil {
		return nil, errors.New("invalid value for required argument 'RulesetId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WebAnalyticsRule
	err := ctx.RegisterResource("cloudflare:index/webAnalyticsRule:WebAnalyticsRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWebAnalyticsRule gets an existing WebAnalyticsRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWebAnalyticsRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WebAnalyticsRuleState, opts ...pulumi.ResourceOption) (*WebAnalyticsRule, error) {
	var resource WebAnalyticsRule
	err := ctx.ReadResource("cloudflare:index/webAnalyticsRule:WebAnalyticsRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WebAnalyticsRule resources.
type webAnalyticsRuleState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// The host to apply the rule to.
	Host *string `pulumi:"host"`
	// Whether the rule includes or excludes the matched traffic from being measured in Web Analytics.
	Inclusive *bool `pulumi:"inclusive"`
	// Whether the rule is paused or not.
	IsPaused *bool `pulumi:"isPaused"`
	// A list of paths to apply the rule to.
	Paths []string `pulumi:"paths"`
	// The Web Analytics ruleset id. **Modifying this attribute will force creation of a new resource.**
	RulesetId *string `pulumi:"rulesetId"`
}

type WebAnalyticsRuleState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// The host to apply the rule to.
	Host pulumi.StringPtrInput
	// Whether the rule includes or excludes the matched traffic from being measured in Web Analytics.
	Inclusive pulumi.BoolPtrInput
	// Whether the rule is paused or not.
	IsPaused pulumi.BoolPtrInput
	// A list of paths to apply the rule to.
	Paths pulumi.StringArrayInput
	// The Web Analytics ruleset id. **Modifying this attribute will force creation of a new resource.**
	RulesetId pulumi.StringPtrInput
}

func (WebAnalyticsRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*webAnalyticsRuleState)(nil)).Elem()
}

type webAnalyticsRuleArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId string `pulumi:"accountId"`
	// The host to apply the rule to.
	Host string `pulumi:"host"`
	// Whether the rule includes or excludes the matched traffic from being measured in Web Analytics.
	Inclusive bool `pulumi:"inclusive"`
	// Whether the rule is paused or not.
	IsPaused bool `pulumi:"isPaused"`
	// A list of paths to apply the rule to.
	Paths []string `pulumi:"paths"`
	// The Web Analytics ruleset id. **Modifying this attribute will force creation of a new resource.**
	RulesetId string `pulumi:"rulesetId"`
}

// The set of arguments for constructing a WebAnalyticsRule resource.
type WebAnalyticsRuleArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringInput
	// The host to apply the rule to.
	Host pulumi.StringInput
	// Whether the rule includes or excludes the matched traffic from being measured in Web Analytics.
	Inclusive pulumi.BoolInput
	// Whether the rule is paused or not.
	IsPaused pulumi.BoolInput
	// A list of paths to apply the rule to.
	Paths pulumi.StringArrayInput
	// The Web Analytics ruleset id. **Modifying this attribute will force creation of a new resource.**
	RulesetId pulumi.StringInput
}

func (WebAnalyticsRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*webAnalyticsRuleArgs)(nil)).Elem()
}

type WebAnalyticsRuleInput interface {
	pulumi.Input

	ToWebAnalyticsRuleOutput() WebAnalyticsRuleOutput
	ToWebAnalyticsRuleOutputWithContext(ctx context.Context) WebAnalyticsRuleOutput
}

func (*WebAnalyticsRule) ElementType() reflect.Type {
	return reflect.TypeOf((**WebAnalyticsRule)(nil)).Elem()
}

func (i *WebAnalyticsRule) ToWebAnalyticsRuleOutput() WebAnalyticsRuleOutput {
	return i.ToWebAnalyticsRuleOutputWithContext(context.Background())
}

func (i *WebAnalyticsRule) ToWebAnalyticsRuleOutputWithContext(ctx context.Context) WebAnalyticsRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebAnalyticsRuleOutput)
}

func (i *WebAnalyticsRule) ToOutput(ctx context.Context) pulumix.Output[*WebAnalyticsRule] {
	return pulumix.Output[*WebAnalyticsRule]{
		OutputState: i.ToWebAnalyticsRuleOutputWithContext(ctx).OutputState,
	}
}

// WebAnalyticsRuleArrayInput is an input type that accepts WebAnalyticsRuleArray and WebAnalyticsRuleArrayOutput values.
// You can construct a concrete instance of `WebAnalyticsRuleArrayInput` via:
//
//	WebAnalyticsRuleArray{ WebAnalyticsRuleArgs{...} }
type WebAnalyticsRuleArrayInput interface {
	pulumi.Input

	ToWebAnalyticsRuleArrayOutput() WebAnalyticsRuleArrayOutput
	ToWebAnalyticsRuleArrayOutputWithContext(context.Context) WebAnalyticsRuleArrayOutput
}

type WebAnalyticsRuleArray []WebAnalyticsRuleInput

func (WebAnalyticsRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WebAnalyticsRule)(nil)).Elem()
}

func (i WebAnalyticsRuleArray) ToWebAnalyticsRuleArrayOutput() WebAnalyticsRuleArrayOutput {
	return i.ToWebAnalyticsRuleArrayOutputWithContext(context.Background())
}

func (i WebAnalyticsRuleArray) ToWebAnalyticsRuleArrayOutputWithContext(ctx context.Context) WebAnalyticsRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebAnalyticsRuleArrayOutput)
}

func (i WebAnalyticsRuleArray) ToOutput(ctx context.Context) pulumix.Output[[]*WebAnalyticsRule] {
	return pulumix.Output[[]*WebAnalyticsRule]{
		OutputState: i.ToWebAnalyticsRuleArrayOutputWithContext(ctx).OutputState,
	}
}

// WebAnalyticsRuleMapInput is an input type that accepts WebAnalyticsRuleMap and WebAnalyticsRuleMapOutput values.
// You can construct a concrete instance of `WebAnalyticsRuleMapInput` via:
//
//	WebAnalyticsRuleMap{ "key": WebAnalyticsRuleArgs{...} }
type WebAnalyticsRuleMapInput interface {
	pulumi.Input

	ToWebAnalyticsRuleMapOutput() WebAnalyticsRuleMapOutput
	ToWebAnalyticsRuleMapOutputWithContext(context.Context) WebAnalyticsRuleMapOutput
}

type WebAnalyticsRuleMap map[string]WebAnalyticsRuleInput

func (WebAnalyticsRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WebAnalyticsRule)(nil)).Elem()
}

func (i WebAnalyticsRuleMap) ToWebAnalyticsRuleMapOutput() WebAnalyticsRuleMapOutput {
	return i.ToWebAnalyticsRuleMapOutputWithContext(context.Background())
}

func (i WebAnalyticsRuleMap) ToWebAnalyticsRuleMapOutputWithContext(ctx context.Context) WebAnalyticsRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebAnalyticsRuleMapOutput)
}

func (i WebAnalyticsRuleMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*WebAnalyticsRule] {
	return pulumix.Output[map[string]*WebAnalyticsRule]{
		OutputState: i.ToWebAnalyticsRuleMapOutputWithContext(ctx).OutputState,
	}
}

type WebAnalyticsRuleOutput struct{ *pulumi.OutputState }

func (WebAnalyticsRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WebAnalyticsRule)(nil)).Elem()
}

func (o WebAnalyticsRuleOutput) ToWebAnalyticsRuleOutput() WebAnalyticsRuleOutput {
	return o
}

func (o WebAnalyticsRuleOutput) ToWebAnalyticsRuleOutputWithContext(ctx context.Context) WebAnalyticsRuleOutput {
	return o
}

func (o WebAnalyticsRuleOutput) ToOutput(ctx context.Context) pulumix.Output[*WebAnalyticsRule] {
	return pulumix.Output[*WebAnalyticsRule]{
		OutputState: o.OutputState,
	}
}

// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o WebAnalyticsRuleOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *WebAnalyticsRule) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The host to apply the rule to.
func (o WebAnalyticsRuleOutput) Host() pulumi.StringOutput {
	return o.ApplyT(func(v *WebAnalyticsRule) pulumi.StringOutput { return v.Host }).(pulumi.StringOutput)
}

// Whether the rule includes or excludes the matched traffic from being measured in Web Analytics.
func (o WebAnalyticsRuleOutput) Inclusive() pulumi.BoolOutput {
	return o.ApplyT(func(v *WebAnalyticsRule) pulumi.BoolOutput { return v.Inclusive }).(pulumi.BoolOutput)
}

// Whether the rule is paused or not.
func (o WebAnalyticsRuleOutput) IsPaused() pulumi.BoolOutput {
	return o.ApplyT(func(v *WebAnalyticsRule) pulumi.BoolOutput { return v.IsPaused }).(pulumi.BoolOutput)
}

// A list of paths to apply the rule to.
func (o WebAnalyticsRuleOutput) Paths() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *WebAnalyticsRule) pulumi.StringArrayOutput { return v.Paths }).(pulumi.StringArrayOutput)
}

// The Web Analytics ruleset id. **Modifying this attribute will force creation of a new resource.**
func (o WebAnalyticsRuleOutput) RulesetId() pulumi.StringOutput {
	return o.ApplyT(func(v *WebAnalyticsRule) pulumi.StringOutput { return v.RulesetId }).(pulumi.StringOutput)
}

type WebAnalyticsRuleArrayOutput struct{ *pulumi.OutputState }

func (WebAnalyticsRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WebAnalyticsRule)(nil)).Elem()
}

func (o WebAnalyticsRuleArrayOutput) ToWebAnalyticsRuleArrayOutput() WebAnalyticsRuleArrayOutput {
	return o
}

func (o WebAnalyticsRuleArrayOutput) ToWebAnalyticsRuleArrayOutputWithContext(ctx context.Context) WebAnalyticsRuleArrayOutput {
	return o
}

func (o WebAnalyticsRuleArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*WebAnalyticsRule] {
	return pulumix.Output[[]*WebAnalyticsRule]{
		OutputState: o.OutputState,
	}
}

func (o WebAnalyticsRuleArrayOutput) Index(i pulumi.IntInput) WebAnalyticsRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WebAnalyticsRule {
		return vs[0].([]*WebAnalyticsRule)[vs[1].(int)]
	}).(WebAnalyticsRuleOutput)
}

type WebAnalyticsRuleMapOutput struct{ *pulumi.OutputState }

func (WebAnalyticsRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WebAnalyticsRule)(nil)).Elem()
}

func (o WebAnalyticsRuleMapOutput) ToWebAnalyticsRuleMapOutput() WebAnalyticsRuleMapOutput {
	return o
}

func (o WebAnalyticsRuleMapOutput) ToWebAnalyticsRuleMapOutputWithContext(ctx context.Context) WebAnalyticsRuleMapOutput {
	return o
}

func (o WebAnalyticsRuleMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*WebAnalyticsRule] {
	return pulumix.Output[map[string]*WebAnalyticsRule]{
		OutputState: o.OutputState,
	}
}

func (o WebAnalyticsRuleMapOutput) MapIndex(k pulumi.StringInput) WebAnalyticsRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WebAnalyticsRule {
		return vs[0].(map[string]*WebAnalyticsRule)[vs[1].(string)]
	}).(WebAnalyticsRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WebAnalyticsRuleInput)(nil)).Elem(), &WebAnalyticsRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebAnalyticsRuleArrayInput)(nil)).Elem(), WebAnalyticsRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebAnalyticsRuleMapInput)(nil)).Elem(), WebAnalyticsRuleMap{})
	pulumi.RegisterOutputType(WebAnalyticsRuleOutput{})
	pulumi.RegisterOutputType(WebAnalyticsRuleArrayOutput{})
	pulumi.RegisterOutputType(WebAnalyticsRuleMapOutput{})
}

// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package cloudflare

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Cloudflare page rule resource.
// 
// > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/page_rule.html.markdown.
type PageRule struct {
	pulumi.CustomResourceState

	// The actions taken by the page rule, options given below.
	Actions PageRuleActionsOutput `pulumi:"actions"`
	// The priority of the page rule among others for this target, the higher the number the higher the priority as per [API documentation](https://api.cloudflare.com/#page-rules-for-a-zone-create-page-rule).
	Priority pulumi.IntPtrOutput `pulumi:"priority"`
	// Whether the page rule is active or disabled.
	Status pulumi.StringPtrOutput `pulumi:"status"`
	// The URL pattern to target with the page rule.
	Target pulumi.StringOutput `pulumi:"target"`
	// The DNS zone ID to which the page rule should be added.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewPageRule registers a new resource with the given unique name, arguments, and options.
func NewPageRule(ctx *pulumi.Context,
	name string, args *PageRuleArgs, opts ...pulumi.ResourceOption) (*PageRule, error) {
	if args == nil || args.Actions == nil {
		return nil, errors.New("missing required argument 'Actions'")
	}
	if args == nil || args.Target == nil {
		return nil, errors.New("missing required argument 'Target'")
	}
	if args == nil || args.ZoneId == nil {
		return nil, errors.New("missing required argument 'ZoneId'")
	}
	if args == nil {
		args = &PageRuleArgs{}
	}
	var resource PageRule
	err := ctx.RegisterResource("cloudflare:index/pageRule:PageRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPageRule gets an existing PageRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPageRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PageRuleState, opts ...pulumi.ResourceOption) (*PageRule, error) {
	var resource PageRule
	err := ctx.ReadResource("cloudflare:index/pageRule:PageRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PageRule resources.
type pageRuleState struct {
	// The actions taken by the page rule, options given below.
	Actions *PageRuleActions `pulumi:"actions"`
	// The priority of the page rule among others for this target, the higher the number the higher the priority as per [API documentation](https://api.cloudflare.com/#page-rules-for-a-zone-create-page-rule).
	Priority *int `pulumi:"priority"`
	// Whether the page rule is active or disabled.
	Status *string `pulumi:"status"`
	// The URL pattern to target with the page rule.
	Target *string `pulumi:"target"`
	// The DNS zone ID to which the page rule should be added.
	ZoneId *string `pulumi:"zoneId"`
}

type PageRuleState struct {
	// The actions taken by the page rule, options given below.
	Actions PageRuleActionsPtrInput
	// The priority of the page rule among others for this target, the higher the number the higher the priority as per [API documentation](https://api.cloudflare.com/#page-rules-for-a-zone-create-page-rule).
	Priority pulumi.IntPtrInput
	// Whether the page rule is active or disabled.
	Status pulumi.StringPtrInput
	// The URL pattern to target with the page rule.
	Target pulumi.StringPtrInput
	// The DNS zone ID to which the page rule should be added.
	ZoneId pulumi.StringPtrInput
}

func (PageRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*pageRuleState)(nil)).Elem()
}

type pageRuleArgs struct {
	// The actions taken by the page rule, options given below.
	Actions PageRuleActions `pulumi:"actions"`
	// The priority of the page rule among others for this target, the higher the number the higher the priority as per [API documentation](https://api.cloudflare.com/#page-rules-for-a-zone-create-page-rule).
	Priority *int `pulumi:"priority"`
	// Whether the page rule is active or disabled.
	Status *string `pulumi:"status"`
	// The URL pattern to target with the page rule.
	Target string `pulumi:"target"`
	// The DNS zone ID to which the page rule should be added.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a PageRule resource.
type PageRuleArgs struct {
	// The actions taken by the page rule, options given below.
	Actions PageRuleActionsInput
	// The priority of the page rule among others for this target, the higher the number the higher the priority as per [API documentation](https://api.cloudflare.com/#page-rules-for-a-zone-create-page-rule).
	Priority pulumi.IntPtrInput
	// Whether the page rule is active or disabled.
	Status pulumi.StringPtrInput
	// The URL pattern to target with the page rule.
	Target pulumi.StringInput
	// The DNS zone ID to which the page rule should be added.
	ZoneId pulumi.StringInput
}

func (PageRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pageRuleArgs)(nil)).Elem()
}


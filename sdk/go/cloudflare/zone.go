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

// Provides a Cloudflare Zone resource. Zone is the basic resource for
// working with Cloudflare and is roughly equivalent to a domain name
// that the user purchases.
//
// > If you are attempting to sign up a subdomain of a zone you must first have Subdomain Support entitlement for your account.
//
// ## Import
//
// ```sh
//
//	$ pulumi import cloudflare:index/zone:Zone example <zone_id>
//
// ```
type Zone struct {
	pulumi.CustomResourceState

	// Account ID to manage the zone resource in.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Whether to scan for DNS records on creation. Ignored after zone is created.
	JumpStart pulumi.BoolPtrOutput `pulumi:"jumpStart"`
	Meta      pulumi.BoolMapOutput `pulumi:"meta"`
	// Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
	NameServers pulumi.StringArrayOutput `pulumi:"nameServers"`
	// Whether this zone is paused (traffic bypasses Cloudflare). Defaults to `false`.
	Paused pulumi.BoolPtrOutput `pulumi:"paused"`
	// The name of the commercial plan to apply to the zone. Available values: `free`, `lite`, `pro`, `proPlus`, `business`, `enterprise`, `partnersFree`, `partnersPro`, `partnersBusiness`, `partnersEnterprise`.
	Plan pulumi.StringOutput `pulumi:"plan"`
	// Status of the zone. Available values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
	Status pulumi.StringOutput `pulumi:"status"`
	// A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Available values: `full`, `partial`. Defaults to `full`.
	Type pulumi.StringPtrOutput `pulumi:"type"`
	// List of Vanity Nameservers (if set).
	VanityNameServers pulumi.StringArrayOutput `pulumi:"vanityNameServers"`
	// Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
	VerificationKey pulumi.StringOutput `pulumi:"verificationKey"`
	// The DNS zone name which will be added. **Modifying this attribute will force creation of a new resource.**
	Zone pulumi.StringOutput `pulumi:"zone"`
}

// NewZone registers a new resource with the given unique name, arguments, and options.
func NewZone(ctx *pulumi.Context,
	name string, args *ZoneArgs, opts ...pulumi.ResourceOption) (*Zone, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Zone == nil {
		return nil, errors.New("invalid value for required argument 'Zone'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Zone
	err := ctx.RegisterResource("cloudflare:index/zone:Zone", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZone gets an existing Zone resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZone(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZoneState, opts ...pulumi.ResourceOption) (*Zone, error) {
	var resource Zone
	err := ctx.ReadResource("cloudflare:index/zone:Zone", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Zone resources.
type zoneState struct {
	// Account ID to manage the zone resource in.
	AccountId *string `pulumi:"accountId"`
	// Whether to scan for DNS records on creation. Ignored after zone is created.
	JumpStart *bool           `pulumi:"jumpStart"`
	Meta      map[string]bool `pulumi:"meta"`
	// Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
	NameServers []string `pulumi:"nameServers"`
	// Whether this zone is paused (traffic bypasses Cloudflare). Defaults to `false`.
	Paused *bool `pulumi:"paused"`
	// The name of the commercial plan to apply to the zone. Available values: `free`, `lite`, `pro`, `proPlus`, `business`, `enterprise`, `partnersFree`, `partnersPro`, `partnersBusiness`, `partnersEnterprise`.
	Plan *string `pulumi:"plan"`
	// Status of the zone. Available values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
	Status *string `pulumi:"status"`
	// A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Available values: `full`, `partial`. Defaults to `full`.
	Type *string `pulumi:"type"`
	// List of Vanity Nameservers (if set).
	VanityNameServers []string `pulumi:"vanityNameServers"`
	// Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
	VerificationKey *string `pulumi:"verificationKey"`
	// The DNS zone name which will be added. **Modifying this attribute will force creation of a new resource.**
	Zone *string `pulumi:"zone"`
}

type ZoneState struct {
	// Account ID to manage the zone resource in.
	AccountId pulumi.StringPtrInput
	// Whether to scan for DNS records on creation. Ignored after zone is created.
	JumpStart pulumi.BoolPtrInput
	Meta      pulumi.BoolMapInput
	// Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
	NameServers pulumi.StringArrayInput
	// Whether this zone is paused (traffic bypasses Cloudflare). Defaults to `false`.
	Paused pulumi.BoolPtrInput
	// The name of the commercial plan to apply to the zone. Available values: `free`, `lite`, `pro`, `proPlus`, `business`, `enterprise`, `partnersFree`, `partnersPro`, `partnersBusiness`, `partnersEnterprise`.
	Plan pulumi.StringPtrInput
	// Status of the zone. Available values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
	Status pulumi.StringPtrInput
	// A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Available values: `full`, `partial`. Defaults to `full`.
	Type pulumi.StringPtrInput
	// List of Vanity Nameservers (if set).
	VanityNameServers pulumi.StringArrayInput
	// Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
	VerificationKey pulumi.StringPtrInput
	// The DNS zone name which will be added. **Modifying this attribute will force creation of a new resource.**
	Zone pulumi.StringPtrInput
}

func (ZoneState) ElementType() reflect.Type {
	return reflect.TypeOf((*zoneState)(nil)).Elem()
}

type zoneArgs struct {
	// Account ID to manage the zone resource in.
	AccountId string `pulumi:"accountId"`
	// Whether to scan for DNS records on creation. Ignored after zone is created.
	JumpStart *bool `pulumi:"jumpStart"`
	// Whether this zone is paused (traffic bypasses Cloudflare). Defaults to `false`.
	Paused *bool `pulumi:"paused"`
	// The name of the commercial plan to apply to the zone. Available values: `free`, `lite`, `pro`, `proPlus`, `business`, `enterprise`, `partnersFree`, `partnersPro`, `partnersBusiness`, `partnersEnterprise`.
	Plan *string `pulumi:"plan"`
	// A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Available values: `full`, `partial`. Defaults to `full`.
	Type *string `pulumi:"type"`
	// The DNS zone name which will be added. **Modifying this attribute will force creation of a new resource.**
	Zone string `pulumi:"zone"`
}

// The set of arguments for constructing a Zone resource.
type ZoneArgs struct {
	// Account ID to manage the zone resource in.
	AccountId pulumi.StringInput
	// Whether to scan for DNS records on creation. Ignored after zone is created.
	JumpStart pulumi.BoolPtrInput
	// Whether this zone is paused (traffic bypasses Cloudflare). Defaults to `false`.
	Paused pulumi.BoolPtrInput
	// The name of the commercial plan to apply to the zone. Available values: `free`, `lite`, `pro`, `proPlus`, `business`, `enterprise`, `partnersFree`, `partnersPro`, `partnersBusiness`, `partnersEnterprise`.
	Plan pulumi.StringPtrInput
	// A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Available values: `full`, `partial`. Defaults to `full`.
	Type pulumi.StringPtrInput
	// The DNS zone name which will be added. **Modifying this attribute will force creation of a new resource.**
	Zone pulumi.StringInput
}

func (ZoneArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zoneArgs)(nil)).Elem()
}

type ZoneInput interface {
	pulumi.Input

	ToZoneOutput() ZoneOutput
	ToZoneOutputWithContext(ctx context.Context) ZoneOutput
}

func (*Zone) ElementType() reflect.Type {
	return reflect.TypeOf((**Zone)(nil)).Elem()
}

func (i *Zone) ToZoneOutput() ZoneOutput {
	return i.ToZoneOutputWithContext(context.Background())
}

func (i *Zone) ToZoneOutputWithContext(ctx context.Context) ZoneOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneOutput)
}

func (i *Zone) ToOutput(ctx context.Context) pulumix.Output[*Zone] {
	return pulumix.Output[*Zone]{
		OutputState: i.ToZoneOutputWithContext(ctx).OutputState,
	}
}

// ZoneArrayInput is an input type that accepts ZoneArray and ZoneArrayOutput values.
// You can construct a concrete instance of `ZoneArrayInput` via:
//
//	ZoneArray{ ZoneArgs{...} }
type ZoneArrayInput interface {
	pulumi.Input

	ToZoneArrayOutput() ZoneArrayOutput
	ToZoneArrayOutputWithContext(context.Context) ZoneArrayOutput
}

type ZoneArray []ZoneInput

func (ZoneArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Zone)(nil)).Elem()
}

func (i ZoneArray) ToZoneArrayOutput() ZoneArrayOutput {
	return i.ToZoneArrayOutputWithContext(context.Background())
}

func (i ZoneArray) ToZoneArrayOutputWithContext(ctx context.Context) ZoneArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneArrayOutput)
}

func (i ZoneArray) ToOutput(ctx context.Context) pulumix.Output[[]*Zone] {
	return pulumix.Output[[]*Zone]{
		OutputState: i.ToZoneArrayOutputWithContext(ctx).OutputState,
	}
}

// ZoneMapInput is an input type that accepts ZoneMap and ZoneMapOutput values.
// You can construct a concrete instance of `ZoneMapInput` via:
//
//	ZoneMap{ "key": ZoneArgs{...} }
type ZoneMapInput interface {
	pulumi.Input

	ToZoneMapOutput() ZoneMapOutput
	ToZoneMapOutputWithContext(context.Context) ZoneMapOutput
}

type ZoneMap map[string]ZoneInput

func (ZoneMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Zone)(nil)).Elem()
}

func (i ZoneMap) ToZoneMapOutput() ZoneMapOutput {
	return i.ToZoneMapOutputWithContext(context.Background())
}

func (i ZoneMap) ToZoneMapOutputWithContext(ctx context.Context) ZoneMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneMapOutput)
}

func (i ZoneMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Zone] {
	return pulumix.Output[map[string]*Zone]{
		OutputState: i.ToZoneMapOutputWithContext(ctx).OutputState,
	}
}

type ZoneOutput struct{ *pulumi.OutputState }

func (ZoneOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Zone)(nil)).Elem()
}

func (o ZoneOutput) ToZoneOutput() ZoneOutput {
	return o
}

func (o ZoneOutput) ToZoneOutputWithContext(ctx context.Context) ZoneOutput {
	return o
}

func (o ZoneOutput) ToOutput(ctx context.Context) pulumix.Output[*Zone] {
	return pulumix.Output[*Zone]{
		OutputState: o.OutputState,
	}
}

// Account ID to manage the zone resource in.
func (o ZoneOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Whether to scan for DNS records on creation. Ignored after zone is created.
func (o ZoneOutput) JumpStart() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Zone) pulumi.BoolPtrOutput { return v.JumpStart }).(pulumi.BoolPtrOutput)
}

func (o ZoneOutput) Meta() pulumi.BoolMapOutput {
	return o.ApplyT(func(v *Zone) pulumi.BoolMapOutput { return v.Meta }).(pulumi.BoolMapOutput)
}

// Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
func (o ZoneOutput) NameServers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringArrayOutput { return v.NameServers }).(pulumi.StringArrayOutput)
}

// Whether this zone is paused (traffic bypasses Cloudflare). Defaults to `false`.
func (o ZoneOutput) Paused() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Zone) pulumi.BoolPtrOutput { return v.Paused }).(pulumi.BoolPtrOutput)
}

// The name of the commercial plan to apply to the zone. Available values: `free`, `lite`, `pro`, `proPlus`, `business`, `enterprise`, `partnersFree`, `partnersPro`, `partnersBusiness`, `partnersEnterprise`.
func (o ZoneOutput) Plan() pulumi.StringOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringOutput { return v.Plan }).(pulumi.StringOutput)
}

// Status of the zone. Available values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
func (o ZoneOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Available values: `full`, `partial`. Defaults to `full`.
func (o ZoneOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

// List of Vanity Nameservers (if set).
func (o ZoneOutput) VanityNameServers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringArrayOutput { return v.VanityNameServers }).(pulumi.StringArrayOutput)
}

// Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
func (o ZoneOutput) VerificationKey() pulumi.StringOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringOutput { return v.VerificationKey }).(pulumi.StringOutput)
}

// The DNS zone name which will be added. **Modifying this attribute will force creation of a new resource.**
func (o ZoneOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringOutput { return v.Zone }).(pulumi.StringOutput)
}

type ZoneArrayOutput struct{ *pulumi.OutputState }

func (ZoneArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Zone)(nil)).Elem()
}

func (o ZoneArrayOutput) ToZoneArrayOutput() ZoneArrayOutput {
	return o
}

func (o ZoneArrayOutput) ToZoneArrayOutputWithContext(ctx context.Context) ZoneArrayOutput {
	return o
}

func (o ZoneArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Zone] {
	return pulumix.Output[[]*Zone]{
		OutputState: o.OutputState,
	}
}

func (o ZoneArrayOutput) Index(i pulumi.IntInput) ZoneOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Zone {
		return vs[0].([]*Zone)[vs[1].(int)]
	}).(ZoneOutput)
}

type ZoneMapOutput struct{ *pulumi.OutputState }

func (ZoneMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Zone)(nil)).Elem()
}

func (o ZoneMapOutput) ToZoneMapOutput() ZoneMapOutput {
	return o
}

func (o ZoneMapOutput) ToZoneMapOutputWithContext(ctx context.Context) ZoneMapOutput {
	return o
}

func (o ZoneMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Zone] {
	return pulumix.Output[map[string]*Zone]{
		OutputState: o.OutputState,
	}
}

func (o ZoneMapOutput) MapIndex(k pulumi.StringInput) ZoneOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Zone {
		return vs[0].(map[string]*Zone)[vs[1].(string)]
	}).(ZoneOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneInput)(nil)).Elem(), &Zone{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneArrayInput)(nil)).Elem(), ZoneArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneMapInput)(nil)).Elem(), ZoneMap{})
	pulumi.RegisterOutputType(ZoneOutput{})
	pulumi.RegisterOutputType(ZoneArrayOutput{})
	pulumi.RegisterOutputType(ZoneMapOutput{})
}

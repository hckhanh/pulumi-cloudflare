// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Zone resource can be imported using a zone ID, e.g.
//
// ```sh
//  $ pulumi import cloudflare:index/zone:Zone example d41d8cd98f00b204e9800998ecf8427e
// ```
//
//  where* `d41d8cd98f00b204e9800998ecf8427e` - zone ID, as returned from [API](https://api.cloudflare.com/#zone-list-zones)
type Zone struct {
	pulumi.CustomResourceState

	// Boolean of whether to scan for DNS records on creation. Ignored after zone is created. Default: false.
	JumpStart pulumi.BoolPtrOutput `pulumi:"jumpStart"`
	Meta      pulumi.BoolMapOutput `pulumi:"meta"`
	// Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
	NameServers pulumi.StringArrayOutput `pulumi:"nameServers"`
	// Boolean of whether this zone is paused (traffic bypasses Cloudflare). Default: false.
	Paused pulumi.BoolPtrOutput `pulumi:"paused"`
	// The name of the commercial plan to apply to the zone, can be updated once the zone is created; one of `free`, `pro`, `business`, `enterprise`.
	Plan pulumi.StringOutput `pulumi:"plan"`
	// Status of the zone. Valid values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
	Status pulumi.StringOutput `pulumi:"status"`
	// A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Valid values: `full`, `partial`. Default is `full`.
	Type pulumi.StringPtrOutput `pulumi:"type"`
	// List of Vanity Nameservers (if set).
	// * `meta.wildcard_proxiable` - Indicates whether wildcard DNS records can receive Cloudflare security and performance features.
	// * `meta.phishing_detected` - Indicates if URLs on the zone have been identified as hosting phishing content.
	VanityNameServers pulumi.StringArrayOutput `pulumi:"vanityNameServers"`
	// Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
	VerificationKey pulumi.StringOutput `pulumi:"verificationKey"`
	// The DNS zone name which will be added.
	Zone pulumi.StringOutput `pulumi:"zone"`
}

// NewZone registers a new resource with the given unique name, arguments, and options.
func NewZone(ctx *pulumi.Context,
	name string, args *ZoneArgs, opts ...pulumi.ResourceOption) (*Zone, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Zone == nil {
		return nil, errors.New("invalid value for required argument 'Zone'")
	}
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
	// Boolean of whether to scan for DNS records on creation. Ignored after zone is created. Default: false.
	JumpStart *bool           `pulumi:"jumpStart"`
	Meta      map[string]bool `pulumi:"meta"`
	// Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
	NameServers []string `pulumi:"nameServers"`
	// Boolean of whether this zone is paused (traffic bypasses Cloudflare). Default: false.
	Paused *bool `pulumi:"paused"`
	// The name of the commercial plan to apply to the zone, can be updated once the zone is created; one of `free`, `pro`, `business`, `enterprise`.
	Plan *string `pulumi:"plan"`
	// Status of the zone. Valid values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
	Status *string `pulumi:"status"`
	// A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Valid values: `full`, `partial`. Default is `full`.
	Type *string `pulumi:"type"`
	// List of Vanity Nameservers (if set).
	// * `meta.wildcard_proxiable` - Indicates whether wildcard DNS records can receive Cloudflare security and performance features.
	// * `meta.phishing_detected` - Indicates if URLs on the zone have been identified as hosting phishing content.
	VanityNameServers []string `pulumi:"vanityNameServers"`
	// Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
	VerificationKey *string `pulumi:"verificationKey"`
	// The DNS zone name which will be added.
	Zone *string `pulumi:"zone"`
}

type ZoneState struct {
	// Boolean of whether to scan for DNS records on creation. Ignored after zone is created. Default: false.
	JumpStart pulumi.BoolPtrInput
	Meta      pulumi.BoolMapInput
	// Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
	NameServers pulumi.StringArrayInput
	// Boolean of whether this zone is paused (traffic bypasses Cloudflare). Default: false.
	Paused pulumi.BoolPtrInput
	// The name of the commercial plan to apply to the zone, can be updated once the zone is created; one of `free`, `pro`, `business`, `enterprise`.
	Plan pulumi.StringPtrInput
	// Status of the zone. Valid values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
	Status pulumi.StringPtrInput
	// A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Valid values: `full`, `partial`. Default is `full`.
	Type pulumi.StringPtrInput
	// List of Vanity Nameservers (if set).
	// * `meta.wildcard_proxiable` - Indicates whether wildcard DNS records can receive Cloudflare security and performance features.
	// * `meta.phishing_detected` - Indicates if URLs on the zone have been identified as hosting phishing content.
	VanityNameServers pulumi.StringArrayInput
	// Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
	VerificationKey pulumi.StringPtrInput
	// The DNS zone name which will be added.
	Zone pulumi.StringPtrInput
}

func (ZoneState) ElementType() reflect.Type {
	return reflect.TypeOf((*zoneState)(nil)).Elem()
}

type zoneArgs struct {
	// Boolean of whether to scan for DNS records on creation. Ignored after zone is created. Default: false.
	JumpStart *bool `pulumi:"jumpStart"`
	// Boolean of whether this zone is paused (traffic bypasses Cloudflare). Default: false.
	Paused *bool `pulumi:"paused"`
	// The name of the commercial plan to apply to the zone, can be updated once the zone is created; one of `free`, `pro`, `business`, `enterprise`.
	Plan *string `pulumi:"plan"`
	// A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Valid values: `full`, `partial`. Default is `full`.
	Type *string `pulumi:"type"`
	// The DNS zone name which will be added.
	Zone string `pulumi:"zone"`
}

// The set of arguments for constructing a Zone resource.
type ZoneArgs struct {
	// Boolean of whether to scan for DNS records on creation. Ignored after zone is created. Default: false.
	JumpStart pulumi.BoolPtrInput
	// Boolean of whether this zone is paused (traffic bypasses Cloudflare). Default: false.
	Paused pulumi.BoolPtrInput
	// The name of the commercial plan to apply to the zone, can be updated once the zone is created; one of `free`, `pro`, `business`, `enterprise`.
	Plan pulumi.StringPtrInput
	// A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Valid values: `full`, `partial`. Default is `full`.
	Type pulumi.StringPtrInput
	// The DNS zone name which will be added.
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

// ZoneArrayInput is an input type that accepts ZoneArray and ZoneArrayOutput values.
// You can construct a concrete instance of `ZoneArrayInput` via:
//
//          ZoneArray{ ZoneArgs{...} }
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

// ZoneMapInput is an input type that accepts ZoneMap and ZoneMapOutput values.
// You can construct a concrete instance of `ZoneMapInput` via:
//
//          ZoneMap{ "key": ZoneArgs{...} }
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

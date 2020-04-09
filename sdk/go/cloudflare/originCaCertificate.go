// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package cloudflare

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Cloudflare Origin CA certificate used to protect traffic to your origin without involving a third party Certificate Authority.
//
// **This resource requires you use your Origin CA Key as the `apiUserServiceKey`.**
//
//
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/origin_ca_certificate.html.markdown.
type OriginCaCertificate struct {
	pulumi.CustomResourceState

	// The Origin CA certificate
	Certificate pulumi.StringOutput `pulumi:"certificate"`
	// The Certificate Signing Request. Must be newline-encoded.
	Csr pulumi.StringOutput `pulumi:"csr"`
	// The datetime when the certificate will expire.
	ExpiresOn pulumi.StringOutput `pulumi:"expiresOn"`
	// An array of hostnames or wildcard names bound to the certificate.
	Hostnames pulumi.StringArrayOutput `pulumi:"hostnames"`
	// The signature type desired on the certificate.
	RequestType pulumi.StringOutput `pulumi:"requestType"`
	// The number of days for which the certificate should be valid.
	RequestedValidity pulumi.IntPtrOutput `pulumi:"requestedValidity"`
}

// NewOriginCaCertificate registers a new resource with the given unique name, arguments, and options.
func NewOriginCaCertificate(ctx *pulumi.Context,
	name string, args *OriginCaCertificateArgs, opts ...pulumi.ResourceOption) (*OriginCaCertificate, error) {
	if args == nil || args.Csr == nil {
		return nil, errors.New("missing required argument 'Csr'")
	}
	if args == nil || args.Hostnames == nil {
		return nil, errors.New("missing required argument 'Hostnames'")
	}
	if args == nil || args.RequestType == nil {
		return nil, errors.New("missing required argument 'RequestType'")
	}
	if args == nil {
		args = &OriginCaCertificateArgs{}
	}
	var resource OriginCaCertificate
	err := ctx.RegisterResource("cloudflare:index/originCaCertificate:OriginCaCertificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOriginCaCertificate gets an existing OriginCaCertificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOriginCaCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OriginCaCertificateState, opts ...pulumi.ResourceOption) (*OriginCaCertificate, error) {
	var resource OriginCaCertificate
	err := ctx.ReadResource("cloudflare:index/originCaCertificate:OriginCaCertificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OriginCaCertificate resources.
type originCaCertificateState struct {
	// The Origin CA certificate
	Certificate *string `pulumi:"certificate"`
	// The Certificate Signing Request. Must be newline-encoded.
	Csr *string `pulumi:"csr"`
	// The datetime when the certificate will expire.
	ExpiresOn *string `pulumi:"expiresOn"`
	// An array of hostnames or wildcard names bound to the certificate.
	Hostnames []string `pulumi:"hostnames"`
	// The signature type desired on the certificate.
	RequestType *string `pulumi:"requestType"`
	// The number of days for which the certificate should be valid.
	RequestedValidity *int `pulumi:"requestedValidity"`
}

type OriginCaCertificateState struct {
	// The Origin CA certificate
	Certificate pulumi.StringPtrInput
	// The Certificate Signing Request. Must be newline-encoded.
	Csr pulumi.StringPtrInput
	// The datetime when the certificate will expire.
	ExpiresOn pulumi.StringPtrInput
	// An array of hostnames or wildcard names bound to the certificate.
	Hostnames pulumi.StringArrayInput
	// The signature type desired on the certificate.
	RequestType pulumi.StringPtrInput
	// The number of days for which the certificate should be valid.
	RequestedValidity pulumi.IntPtrInput
}

func (OriginCaCertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*originCaCertificateState)(nil)).Elem()
}

type originCaCertificateArgs struct {
	// The Certificate Signing Request. Must be newline-encoded.
	Csr string `pulumi:"csr"`
	// An array of hostnames or wildcard names bound to the certificate.
	Hostnames []string `pulumi:"hostnames"`
	// The signature type desired on the certificate.
	RequestType string `pulumi:"requestType"`
	// The number of days for which the certificate should be valid.
	RequestedValidity *int `pulumi:"requestedValidity"`
}

// The set of arguments for constructing a OriginCaCertificate resource.
type OriginCaCertificateArgs struct {
	// The Certificate Signing Request. Must be newline-encoded.
	Csr pulumi.StringInput
	// An array of hostnames or wildcard names bound to the certificate.
	Hostnames pulumi.StringArrayInput
	// The signature type desired on the certificate.
	RequestType pulumi.StringInput
	// The number of days for which the certificate should be valid.
	RequestedValidity pulumi.IntPtrInput
}

func (OriginCaCertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*originCaCertificateArgs)(nil)).Elem()
}

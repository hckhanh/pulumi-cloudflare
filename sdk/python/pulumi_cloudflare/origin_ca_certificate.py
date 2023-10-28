# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['OriginCaCertificateArgs', 'OriginCaCertificate']

@pulumi.input_type
class OriginCaCertificateArgs:
    def __init__(__self__, *,
                 csr: pulumi.Input[str],
                 hostnames: pulumi.Input[Sequence[pulumi.Input[str]]],
                 request_type: pulumi.Input[str],
                 min_days_for_renewal: Optional[pulumi.Input[int]] = None,
                 requested_validity: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a OriginCaCertificate resource.
        :param pulumi.Input[str] csr: The Certificate Signing Request. Must be newline-encoded. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hostnames: A list of hostnames or wildcard names bound to the certificate. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] request_type: The signature type desired on the certificate. Available values: `origin-rsa`, `origin-ecc`, `keyless-certificate`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[int] min_days_for_renewal: Number of days prior to the expiry to trigger a renewal of the certificate if a Terraform operation is run.
        :param pulumi.Input[int] requested_validity: The number of days for which the certificate should be valid. Available values: `7`, `30`, `90`, `365`, `730`, `1095`, `5475`. **Modifying this attribute will force creation of a new resource.**
        """
        pulumi.set(__self__, "csr", csr)
        pulumi.set(__self__, "hostnames", hostnames)
        pulumi.set(__self__, "request_type", request_type)
        if min_days_for_renewal is not None:
            pulumi.set(__self__, "min_days_for_renewal", min_days_for_renewal)
        if requested_validity is not None:
            pulumi.set(__self__, "requested_validity", requested_validity)

    @property
    @pulumi.getter
    def csr(self) -> pulumi.Input[str]:
        """
        The Certificate Signing Request. Must be newline-encoded. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "csr")

    @csr.setter
    def csr(self, value: pulumi.Input[str]):
        pulumi.set(self, "csr", value)

    @property
    @pulumi.getter
    def hostnames(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of hostnames or wildcard names bound to the certificate. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "hostnames")

    @hostnames.setter
    def hostnames(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "hostnames", value)

    @property
    @pulumi.getter(name="requestType")
    def request_type(self) -> pulumi.Input[str]:
        """
        The signature type desired on the certificate. Available values: `origin-rsa`, `origin-ecc`, `keyless-certificate`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "request_type")

    @request_type.setter
    def request_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "request_type", value)

    @property
    @pulumi.getter(name="minDaysForRenewal")
    def min_days_for_renewal(self) -> Optional[pulumi.Input[int]]:
        """
        Number of days prior to the expiry to trigger a renewal of the certificate if a Terraform operation is run.
        """
        return pulumi.get(self, "min_days_for_renewal")

    @min_days_for_renewal.setter
    def min_days_for_renewal(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "min_days_for_renewal", value)

    @property
    @pulumi.getter(name="requestedValidity")
    def requested_validity(self) -> Optional[pulumi.Input[int]]:
        """
        The number of days for which the certificate should be valid. Available values: `7`, `30`, `90`, `365`, `730`, `1095`, `5475`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "requested_validity")

    @requested_validity.setter
    def requested_validity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "requested_validity", value)


@pulumi.input_type
class _OriginCaCertificateState:
    def __init__(__self__, *,
                 certificate: Optional[pulumi.Input[str]] = None,
                 csr: Optional[pulumi.Input[str]] = None,
                 expires_on: Optional[pulumi.Input[str]] = None,
                 hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 min_days_for_renewal: Optional[pulumi.Input[int]] = None,
                 request_type: Optional[pulumi.Input[str]] = None,
                 requested_validity: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering OriginCaCertificate resources.
        :param pulumi.Input[str] certificate: The Origin CA certificate.
        :param pulumi.Input[str] csr: The Certificate Signing Request. Must be newline-encoded. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] expires_on: The datetime when the certificate will expire.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hostnames: A list of hostnames or wildcard names bound to the certificate. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[int] min_days_for_renewal: Number of days prior to the expiry to trigger a renewal of the certificate if a Terraform operation is run.
        :param pulumi.Input[str] request_type: The signature type desired on the certificate. Available values: `origin-rsa`, `origin-ecc`, `keyless-certificate`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[int] requested_validity: The number of days for which the certificate should be valid. Available values: `7`, `30`, `90`, `365`, `730`, `1095`, `5475`. **Modifying this attribute will force creation of a new resource.**
        """
        if certificate is not None:
            pulumi.set(__self__, "certificate", certificate)
        if csr is not None:
            pulumi.set(__self__, "csr", csr)
        if expires_on is not None:
            pulumi.set(__self__, "expires_on", expires_on)
        if hostnames is not None:
            pulumi.set(__self__, "hostnames", hostnames)
        if min_days_for_renewal is not None:
            pulumi.set(__self__, "min_days_for_renewal", min_days_for_renewal)
        if request_type is not None:
            pulumi.set(__self__, "request_type", request_type)
        if requested_validity is not None:
            pulumi.set(__self__, "requested_validity", requested_validity)

    @property
    @pulumi.getter
    def certificate(self) -> Optional[pulumi.Input[str]]:
        """
        The Origin CA certificate.
        """
        return pulumi.get(self, "certificate")

    @certificate.setter
    def certificate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate", value)

    @property
    @pulumi.getter
    def csr(self) -> Optional[pulumi.Input[str]]:
        """
        The Certificate Signing Request. Must be newline-encoded. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "csr")

    @csr.setter
    def csr(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "csr", value)

    @property
    @pulumi.getter(name="expiresOn")
    def expires_on(self) -> Optional[pulumi.Input[str]]:
        """
        The datetime when the certificate will expire.
        """
        return pulumi.get(self, "expires_on")

    @expires_on.setter
    def expires_on(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expires_on", value)

    @property
    @pulumi.getter
    def hostnames(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of hostnames or wildcard names bound to the certificate. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "hostnames")

    @hostnames.setter
    def hostnames(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "hostnames", value)

    @property
    @pulumi.getter(name="minDaysForRenewal")
    def min_days_for_renewal(self) -> Optional[pulumi.Input[int]]:
        """
        Number of days prior to the expiry to trigger a renewal of the certificate if a Terraform operation is run.
        """
        return pulumi.get(self, "min_days_for_renewal")

    @min_days_for_renewal.setter
    def min_days_for_renewal(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "min_days_for_renewal", value)

    @property
    @pulumi.getter(name="requestType")
    def request_type(self) -> Optional[pulumi.Input[str]]:
        """
        The signature type desired on the certificate. Available values: `origin-rsa`, `origin-ecc`, `keyless-certificate`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "request_type")

    @request_type.setter
    def request_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "request_type", value)

    @property
    @pulumi.getter(name="requestedValidity")
    def requested_validity(self) -> Optional[pulumi.Input[int]]:
        """
        The number of days for which the certificate should be valid. Available values: `7`, `30`, `90`, `365`, `730`, `1095`, `5475`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "requested_validity")

    @requested_validity.setter
    def requested_validity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "requested_validity", value)


class OriginCaCertificate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 csr: Optional[pulumi.Input[str]] = None,
                 hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 min_days_for_renewal: Optional[pulumi.Input[int]] = None,
                 request_type: Optional[pulumi.Input[str]] = None,
                 requested_validity: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare
        import pulumi_tls as tls

        example_private_key = tls.PrivateKey("examplePrivateKey", algorithm="RSA")
        example_cert_request = tls.CertRequest("exampleCertRequest",
            private_key_pem=example_private_key.private_key_pem,
            subjects=[tls.CertRequestSubjectArgs(
                common_name="",
                organization="Terraform Test",
            )])
        example_origin_ca_certificate = cloudflare.OriginCaCertificate("exampleOriginCaCertificate",
            csr=example_cert_request.cert_request_pem,
            hostnames=["example.com"],
            request_type="origin-rsa",
            requested_validity=7)
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/originCaCertificate:OriginCaCertificate example <certificate_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] csr: The Certificate Signing Request. Must be newline-encoded. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hostnames: A list of hostnames or wildcard names bound to the certificate. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[int] min_days_for_renewal: Number of days prior to the expiry to trigger a renewal of the certificate if a Terraform operation is run.
        :param pulumi.Input[str] request_type: The signature type desired on the certificate. Available values: `origin-rsa`, `origin-ecc`, `keyless-certificate`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[int] requested_validity: The number of days for which the certificate should be valid. Available values: `7`, `30`, `90`, `365`, `730`, `1095`, `5475`. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OriginCaCertificateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare
        import pulumi_tls as tls

        example_private_key = tls.PrivateKey("examplePrivateKey", algorithm="RSA")
        example_cert_request = tls.CertRequest("exampleCertRequest",
            private_key_pem=example_private_key.private_key_pem,
            subjects=[tls.CertRequestSubjectArgs(
                common_name="",
                organization="Terraform Test",
            )])
        example_origin_ca_certificate = cloudflare.OriginCaCertificate("exampleOriginCaCertificate",
            csr=example_cert_request.cert_request_pem,
            hostnames=["example.com"],
            request_type="origin-rsa",
            requested_validity=7)
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/originCaCertificate:OriginCaCertificate example <certificate_id>
        ```

        :param str resource_name: The name of the resource.
        :param OriginCaCertificateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OriginCaCertificateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 csr: Optional[pulumi.Input[str]] = None,
                 hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 min_days_for_renewal: Optional[pulumi.Input[int]] = None,
                 request_type: Optional[pulumi.Input[str]] = None,
                 requested_validity: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OriginCaCertificateArgs.__new__(OriginCaCertificateArgs)

            if csr is None and not opts.urn:
                raise TypeError("Missing required property 'csr'")
            __props__.__dict__["csr"] = csr
            if hostnames is None and not opts.urn:
                raise TypeError("Missing required property 'hostnames'")
            __props__.__dict__["hostnames"] = hostnames
            __props__.__dict__["min_days_for_renewal"] = min_days_for_renewal
            if request_type is None and not opts.urn:
                raise TypeError("Missing required property 'request_type'")
            __props__.__dict__["request_type"] = request_type
            __props__.__dict__["requested_validity"] = requested_validity
            __props__.__dict__["certificate"] = None
            __props__.__dict__["expires_on"] = None
        super(OriginCaCertificate, __self__).__init__(
            'cloudflare:index/originCaCertificate:OriginCaCertificate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            certificate: Optional[pulumi.Input[str]] = None,
            csr: Optional[pulumi.Input[str]] = None,
            expires_on: Optional[pulumi.Input[str]] = None,
            hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            min_days_for_renewal: Optional[pulumi.Input[int]] = None,
            request_type: Optional[pulumi.Input[str]] = None,
            requested_validity: Optional[pulumi.Input[int]] = None) -> 'OriginCaCertificate':
        """
        Get an existing OriginCaCertificate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate: The Origin CA certificate.
        :param pulumi.Input[str] csr: The Certificate Signing Request. Must be newline-encoded. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] expires_on: The datetime when the certificate will expire.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hostnames: A list of hostnames or wildcard names bound to the certificate. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[int] min_days_for_renewal: Number of days prior to the expiry to trigger a renewal of the certificate if a Terraform operation is run.
        :param pulumi.Input[str] request_type: The signature type desired on the certificate. Available values: `origin-rsa`, `origin-ecc`, `keyless-certificate`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[int] requested_validity: The number of days for which the certificate should be valid. Available values: `7`, `30`, `90`, `365`, `730`, `1095`, `5475`. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OriginCaCertificateState.__new__(_OriginCaCertificateState)

        __props__.__dict__["certificate"] = certificate
        __props__.__dict__["csr"] = csr
        __props__.__dict__["expires_on"] = expires_on
        __props__.__dict__["hostnames"] = hostnames
        __props__.__dict__["min_days_for_renewal"] = min_days_for_renewal
        __props__.__dict__["request_type"] = request_type
        __props__.__dict__["requested_validity"] = requested_validity
        return OriginCaCertificate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Output[str]:
        """
        The Origin CA certificate.
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter
    def csr(self) -> pulumi.Output[str]:
        """
        The Certificate Signing Request. Must be newline-encoded. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "csr")

    @property
    @pulumi.getter(name="expiresOn")
    def expires_on(self) -> pulumi.Output[str]:
        """
        The datetime when the certificate will expire.
        """
        return pulumi.get(self, "expires_on")

    @property
    @pulumi.getter
    def hostnames(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of hostnames or wildcard names bound to the certificate. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "hostnames")

    @property
    @pulumi.getter(name="minDaysForRenewal")
    def min_days_for_renewal(self) -> pulumi.Output[Optional[int]]:
        """
        Number of days prior to the expiry to trigger a renewal of the certificate if a Terraform operation is run.
        """
        return pulumi.get(self, "min_days_for_renewal")

    @property
    @pulumi.getter(name="requestType")
    def request_type(self) -> pulumi.Output[str]:
        """
        The signature type desired on the certificate. Available values: `origin-rsa`, `origin-ecc`, `keyless-certificate`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "request_type")

    @property
    @pulumi.getter(name="requestedValidity")
    def requested_validity(self) -> pulumi.Output[int]:
        """
        The number of days for which the certificate should be valid. Available values: `7`, `30`, `90`, `365`, `730`, `1095`, `5475`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "requested_validity")


# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AuthenticatedOriginPullsCertificateArgs', 'AuthenticatedOriginPullsCertificate']

@pulumi.input_type
class AuthenticatedOriginPullsCertificateArgs:
    def __init__(__self__, *,
                 certificate: pulumi.Input[str],
                 private_key: pulumi.Input[str],
                 type: pulumi.Input[str],
                 zone_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a AuthenticatedOriginPullsCertificate resource.
        :param pulumi.Input[str] certificate: The public client certificate. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] private_key: The private key of the client certificate. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] type: The form of Authenticated Origin Pulls to upload the certificate to. Available values: `per-zone`, `per-hostname`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        AuthenticatedOriginPullsCertificateArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            certificate=certificate,
            private_key=private_key,
            type=type,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             certificate: pulumi.Input[str],
             private_key: pulumi.Input[str],
             type: pulumi.Input[str],
             zone_id: pulumi.Input[str],
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("certificate", certificate)
        _setter("private_key", private_key)
        _setter("type", type)
        _setter("zone_id", zone_id)

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Input[str]:
        """
        The public client certificate. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "certificate")

    @certificate.setter
    def certificate(self, value: pulumi.Input[str]):
        pulumi.set(self, "certificate", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> pulumi.Input[str]:
        """
        The private key of the client certificate. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "private_key", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The form of Authenticated Origin Pulls to upload the certificate to. Available values: `per-zone`, `per-hostname`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)


@pulumi.input_type
class _AuthenticatedOriginPullsCertificateState:
    def __init__(__self__, *,
                 certificate: Optional[pulumi.Input[str]] = None,
                 expires_on: Optional[pulumi.Input[str]] = None,
                 issuer: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 serial_number: Optional[pulumi.Input[str]] = None,
                 signature: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 uploaded_on: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AuthenticatedOriginPullsCertificate resources.
        :param pulumi.Input[str] certificate: The public client certificate. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] expires_on: **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] issuer: **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] private_key: The private key of the client certificate. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] serial_number: **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] signature: **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] status: **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] type: The form of Authenticated Origin Pulls to upload the certificate to. Available values: `per-zone`, `per-hostname`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] uploaded_on: **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        _AuthenticatedOriginPullsCertificateState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            certificate=certificate,
            expires_on=expires_on,
            issuer=issuer,
            private_key=private_key,
            serial_number=serial_number,
            signature=signature,
            status=status,
            type=type,
            uploaded_on=uploaded_on,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             certificate: Optional[pulumi.Input[str]] = None,
             expires_on: Optional[pulumi.Input[str]] = None,
             issuer: Optional[pulumi.Input[str]] = None,
             private_key: Optional[pulumi.Input[str]] = None,
             serial_number: Optional[pulumi.Input[str]] = None,
             signature: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             uploaded_on: Optional[pulumi.Input[str]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if certificate is not None:
            _setter("certificate", certificate)
        if expires_on is not None:
            _setter("expires_on", expires_on)
        if issuer is not None:
            _setter("issuer", issuer)
        if private_key is not None:
            _setter("private_key", private_key)
        if serial_number is not None:
            _setter("serial_number", serial_number)
        if signature is not None:
            _setter("signature", signature)
        if status is not None:
            _setter("status", status)
        if type is not None:
            _setter("type", type)
        if uploaded_on is not None:
            _setter("uploaded_on", uploaded_on)
        if zone_id is not None:
            _setter("zone_id", zone_id)

    @property
    @pulumi.getter
    def certificate(self) -> Optional[pulumi.Input[str]]:
        """
        The public client certificate. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "certificate")

    @certificate.setter
    def certificate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate", value)

    @property
    @pulumi.getter(name="expiresOn")
    def expires_on(self) -> Optional[pulumi.Input[str]]:
        """
        **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "expires_on")

    @expires_on.setter
    def expires_on(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expires_on", value)

    @property
    @pulumi.getter
    def issuer(self) -> Optional[pulumi.Input[str]]:
        """
        **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "issuer")

    @issuer.setter
    def issuer(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "issuer", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> Optional[pulumi.Input[str]]:
        """
        The private key of the client certificate. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key", value)

    @property
    @pulumi.getter(name="serialNumber")
    def serial_number(self) -> Optional[pulumi.Input[str]]:
        """
        **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "serial_number")

    @serial_number.setter
    def serial_number(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "serial_number", value)

    @property
    @pulumi.getter
    def signature(self) -> Optional[pulumi.Input[str]]:
        """
        **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "signature")

    @signature.setter
    def signature(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "signature", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The form of Authenticated Origin Pulls to upload the certificate to. Available values: `per-zone`, `per-hostname`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="uploadedOn")
    def uploaded_on(self) -> Optional[pulumi.Input[str]]:
        """
        **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "uploaded_on")

    @uploaded_on.setter
    def uploaded_on(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uploaded_on", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class AuthenticatedOriginPullsCertificate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare Authenticated Origin Pulls certificate
        resource. An uploaded client certificate is required to use Per-Zone
         or Per-Hostname Authenticated Origin Pulls.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # Per-Zone Authenticated Origin Pulls certificate
        my_per_zone_aop_cert = cloudflare.AuthenticatedOriginPullsCertificate("myPerZoneAopCert",
            certificate="-----INSERT CERTIFICATE-----",
            private_key="-----INSERT PRIVATE KEY-----",
            type="per-zone",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        # Per-Hostname Authenticated Origin Pulls certificate
        my_per_hostname_aop_cert = cloudflare.AuthenticatedOriginPullsCertificate("myPerHostnameAopCert",
            certificate="-----INSERT CERTIFICATE-----",
            private_key="-----INSERT PRIVATE KEY-----",
            type="per-hostname",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate 2458ce5a-0c35-4c7f-82c7-8e9487d3ff60 <zone_id>/<certificate_type>/<certificate_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate: The public client certificate. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] private_key: The private key of the client certificate. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] type: The form of Authenticated Origin Pulls to upload the certificate to. Available values: `per-zone`, `per-hostname`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AuthenticatedOriginPullsCertificateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare Authenticated Origin Pulls certificate
        resource. An uploaded client certificate is required to use Per-Zone
         or Per-Hostname Authenticated Origin Pulls.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # Per-Zone Authenticated Origin Pulls certificate
        my_per_zone_aop_cert = cloudflare.AuthenticatedOriginPullsCertificate("myPerZoneAopCert",
            certificate="-----INSERT CERTIFICATE-----",
            private_key="-----INSERT PRIVATE KEY-----",
            type="per-zone",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        # Per-Hostname Authenticated Origin Pulls certificate
        my_per_hostname_aop_cert = cloudflare.AuthenticatedOriginPullsCertificate("myPerHostnameAopCert",
            certificate="-----INSERT CERTIFICATE-----",
            private_key="-----INSERT PRIVATE KEY-----",
            type="per-hostname",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate 2458ce5a-0c35-4c7f-82c7-8e9487d3ff60 <zone_id>/<certificate_type>/<certificate_id>
        ```

        :param str resource_name: The name of the resource.
        :param AuthenticatedOriginPullsCertificateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AuthenticatedOriginPullsCertificateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            AuthenticatedOriginPullsCertificateArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AuthenticatedOriginPullsCertificateArgs.__new__(AuthenticatedOriginPullsCertificateArgs)

            if certificate is None and not opts.urn:
                raise TypeError("Missing required property 'certificate'")
            __props__.__dict__["certificate"] = certificate
            if private_key is None and not opts.urn:
                raise TypeError("Missing required property 'private_key'")
            __props__.__dict__["private_key"] = None if private_key is None else pulumi.Output.secret(private_key)
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["expires_on"] = None
            __props__.__dict__["issuer"] = None
            __props__.__dict__["serial_number"] = None
            __props__.__dict__["signature"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["uploaded_on"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["privateKey"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(AuthenticatedOriginPullsCertificate, __self__).__init__(
            'cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            certificate: Optional[pulumi.Input[str]] = None,
            expires_on: Optional[pulumi.Input[str]] = None,
            issuer: Optional[pulumi.Input[str]] = None,
            private_key: Optional[pulumi.Input[str]] = None,
            serial_number: Optional[pulumi.Input[str]] = None,
            signature: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            uploaded_on: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'AuthenticatedOriginPullsCertificate':
        """
        Get an existing AuthenticatedOriginPullsCertificate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate: The public client certificate. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] expires_on: **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] issuer: **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] private_key: The private key of the client certificate. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] serial_number: **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] signature: **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] status: **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] type: The form of Authenticated Origin Pulls to upload the certificate to. Available values: `per-zone`, `per-hostname`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] uploaded_on: **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AuthenticatedOriginPullsCertificateState.__new__(_AuthenticatedOriginPullsCertificateState)

        __props__.__dict__["certificate"] = certificate
        __props__.__dict__["expires_on"] = expires_on
        __props__.__dict__["issuer"] = issuer
        __props__.__dict__["private_key"] = private_key
        __props__.__dict__["serial_number"] = serial_number
        __props__.__dict__["signature"] = signature
        __props__.__dict__["status"] = status
        __props__.__dict__["type"] = type
        __props__.__dict__["uploaded_on"] = uploaded_on
        __props__.__dict__["zone_id"] = zone_id
        return AuthenticatedOriginPullsCertificate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Output[str]:
        """
        The public client certificate. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter(name="expiresOn")
    def expires_on(self) -> pulumi.Output[str]:
        """
        **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "expires_on")

    @property
    @pulumi.getter
    def issuer(self) -> pulumi.Output[str]:
        """
        **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "issuer")

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> pulumi.Output[str]:
        """
        The private key of the client certificate. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "private_key")

    @property
    @pulumi.getter(name="serialNumber")
    def serial_number(self) -> pulumi.Output[str]:
        """
        **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "serial_number")

    @property
    @pulumi.getter
    def signature(self) -> pulumi.Output[str]:
        """
        **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "signature")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The form of Authenticated Origin Pulls to upload the certificate to. Available values: `per-zone`, `per-hostname`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="uploadedOn")
    def uploaded_on(self) -> pulumi.Output[str]:
        """
        **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "uploaded_on")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")


# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['MtlsCertificateArgs', 'MtlsCertificate']

@pulumi.input_type
class MtlsCertificateArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 ca: pulumi.Input[bool],
                 certificates: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a MtlsCertificate resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] ca: Whether this is a CA or leaf certificate. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] certificates: Certificate you intend to use with mTLS-enabled services. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] name: Optional unique name for the certificate. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] private_key: The certificate's private key. **Modifying this attribute will force creation of a new resource.**
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "ca", ca)
        pulumi.set(__self__, "certificates", certificates)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if private_key is not None:
            pulumi.set(__self__, "private_key", private_key)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def ca(self) -> pulumi.Input[bool]:
        """
        Whether this is a CA or leaf certificate. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "ca")

    @ca.setter
    def ca(self, value: pulumi.Input[bool]):
        pulumi.set(self, "ca", value)

    @property
    @pulumi.getter
    def certificates(self) -> pulumi.Input[str]:
        """
        Certificate you intend to use with mTLS-enabled services. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "certificates")

    @certificates.setter
    def certificates(self, value: pulumi.Input[str]):
        pulumi.set(self, "certificates", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Optional unique name for the certificate. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> Optional[pulumi.Input[str]]:
        """
        The certificate's private key. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key", value)


@pulumi.input_type
class _MtlsCertificateState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 ca: Optional[pulumi.Input[bool]] = None,
                 certificates: Optional[pulumi.Input[str]] = None,
                 expires_on: Optional[pulumi.Input[str]] = None,
                 issuer: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 serial_number: Optional[pulumi.Input[str]] = None,
                 signature: Optional[pulumi.Input[str]] = None,
                 uploaded_on: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering MtlsCertificate resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] ca: Whether this is a CA or leaf certificate. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] certificates: Certificate you intend to use with mTLS-enabled services. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] expires_on: **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] issuer: **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] name: Optional unique name for the certificate. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] private_key: The certificate's private key. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] serial_number: **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] signature: **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] uploaded_on: **Modifying this attribute will force creation of a new resource.**
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if ca is not None:
            pulumi.set(__self__, "ca", ca)
        if certificates is not None:
            pulumi.set(__self__, "certificates", certificates)
        if expires_on is not None:
            pulumi.set(__self__, "expires_on", expires_on)
        if issuer is not None:
            pulumi.set(__self__, "issuer", issuer)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if private_key is not None:
            pulumi.set(__self__, "private_key", private_key)
        if serial_number is not None:
            pulumi.set(__self__, "serial_number", serial_number)
        if signature is not None:
            pulumi.set(__self__, "signature", signature)
        if uploaded_on is not None:
            pulumi.set(__self__, "uploaded_on", uploaded_on)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def ca(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether this is a CA or leaf certificate. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "ca")

    @ca.setter
    def ca(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ca", value)

    @property
    @pulumi.getter
    def certificates(self) -> Optional[pulumi.Input[str]]:
        """
        Certificate you intend to use with mTLS-enabled services. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "certificates")

    @certificates.setter
    def certificates(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificates", value)

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
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Optional unique name for the certificate. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> Optional[pulumi.Input[str]]:
        """
        The certificate's private key. **Modifying this attribute will force creation of a new resource.**
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
    @pulumi.getter(name="uploadedOn")
    def uploaded_on(self) -> Optional[pulumi.Input[str]]:
        """
        **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "uploaded_on")

    @uploaded_on.setter
    def uploaded_on(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uploaded_on", value)


class MtlsCertificate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 ca: Optional[pulumi.Input[bool]] = None,
                 certificates: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare mTLS certificate resource. These certificates may be used with mTLS enabled Cloudflare services.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.MtlsCertificate("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            ca=True,
            certificates=\"\"\"-----BEGIN CERTIFICATE-----
        MIIDmDCCAoCgAwIBAgIUKTOAZNj...i4JhqeoTewsxndhDDE
        -----END CERTIFICATE-----
        \"\"\",
            name="example",
            private_key=\"\"\"-----BEGIN PRIVATE KEY-----
        MIIEvQIBADANBgkqhkiG9w0BAQE...1IS3EnQRrz6WMYA=
        -----END PRIVATE KEY-----
        \"\"\")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        ```sh
        $ pulumi import cloudflare:index/mtlsCertificate:MtlsCertificate example <account_id>/<mtls_certificate_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] ca: Whether this is a CA or leaf certificate. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] certificates: Certificate you intend to use with mTLS-enabled services. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] name: Optional unique name for the certificate. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] private_key: The certificate's private key. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MtlsCertificateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare mTLS certificate resource. These certificates may be used with mTLS enabled Cloudflare services.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.MtlsCertificate("example",
            account_id="f037e56e89293a057740de681ac9abbe",
            ca=True,
            certificates=\"\"\"-----BEGIN CERTIFICATE-----
        MIIDmDCCAoCgAwIBAgIUKTOAZNj...i4JhqeoTewsxndhDDE
        -----END CERTIFICATE-----
        \"\"\",
            name="example",
            private_key=\"\"\"-----BEGIN PRIVATE KEY-----
        MIIEvQIBADANBgkqhkiG9w0BAQE...1IS3EnQRrz6WMYA=
        -----END PRIVATE KEY-----
        \"\"\")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        ```sh
        $ pulumi import cloudflare:index/mtlsCertificate:MtlsCertificate example <account_id>/<mtls_certificate_id>
        ```

        :param str resource_name: The name of the resource.
        :param MtlsCertificateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MtlsCertificateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 ca: Optional[pulumi.Input[bool]] = None,
                 certificates: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MtlsCertificateArgs.__new__(MtlsCertificateArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if ca is None and not opts.urn:
                raise TypeError("Missing required property 'ca'")
            __props__.__dict__["ca"] = ca
            if certificates is None and not opts.urn:
                raise TypeError("Missing required property 'certificates'")
            __props__.__dict__["certificates"] = certificates
            __props__.__dict__["name"] = name
            __props__.__dict__["private_key"] = private_key
            __props__.__dict__["expires_on"] = None
            __props__.__dict__["issuer"] = None
            __props__.__dict__["serial_number"] = None
            __props__.__dict__["signature"] = None
            __props__.__dict__["uploaded_on"] = None
        super(MtlsCertificate, __self__).__init__(
            'cloudflare:index/mtlsCertificate:MtlsCertificate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            ca: Optional[pulumi.Input[bool]] = None,
            certificates: Optional[pulumi.Input[str]] = None,
            expires_on: Optional[pulumi.Input[str]] = None,
            issuer: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            private_key: Optional[pulumi.Input[str]] = None,
            serial_number: Optional[pulumi.Input[str]] = None,
            signature: Optional[pulumi.Input[str]] = None,
            uploaded_on: Optional[pulumi.Input[str]] = None) -> 'MtlsCertificate':
        """
        Get an existing MtlsCertificate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] ca: Whether this is a CA or leaf certificate. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] certificates: Certificate you intend to use with mTLS-enabled services. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] expires_on: **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] issuer: **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] name: Optional unique name for the certificate. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] private_key: The certificate's private key. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] serial_number: **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] signature: **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] uploaded_on: **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MtlsCertificateState.__new__(_MtlsCertificateState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["ca"] = ca
        __props__.__dict__["certificates"] = certificates
        __props__.__dict__["expires_on"] = expires_on
        __props__.__dict__["issuer"] = issuer
        __props__.__dict__["name"] = name
        __props__.__dict__["private_key"] = private_key
        __props__.__dict__["serial_number"] = serial_number
        __props__.__dict__["signature"] = signature
        __props__.__dict__["uploaded_on"] = uploaded_on
        return MtlsCertificate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def ca(self) -> pulumi.Output[bool]:
        """
        Whether this is a CA or leaf certificate. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "ca")

    @property
    @pulumi.getter
    def certificates(self) -> pulumi.Output[str]:
        """
        Certificate you intend to use with mTLS-enabled services. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "certificates")

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
    @pulumi.getter
    def name(self) -> pulumi.Output[Optional[str]]:
        """
        Optional unique name for the certificate. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> pulumi.Output[Optional[str]]:
        """
        The certificate's private key. **Modifying this attribute will force creation of a new resource.**
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
    @pulumi.getter(name="uploadedOn")
    def uploaded_on(self) -> pulumi.Output[str]:
        """
        **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "uploaded_on")


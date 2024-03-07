# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetOriginCaCertificateResult',
    'AwaitableGetOriginCaCertificateResult',
    'get_origin_ca_certificate',
    'get_origin_ca_certificate_output',
]

@pulumi.output_type
class GetOriginCaCertificateResult:
    """
    A collection of values returned by getOriginCaCertificate.
    """
    def __init__(__self__, certificate=None, expires_on=None, hostnames=None, id=None, request_type=None, revoked_at=None):
        if certificate and not isinstance(certificate, str):
            raise TypeError("Expected argument 'certificate' to be a str")
        pulumi.set(__self__, "certificate", certificate)
        if expires_on and not isinstance(expires_on, str):
            raise TypeError("Expected argument 'expires_on' to be a str")
        pulumi.set(__self__, "expires_on", expires_on)
        if hostnames and not isinstance(hostnames, list):
            raise TypeError("Expected argument 'hostnames' to be a list")
        pulumi.set(__self__, "hostnames", hostnames)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if request_type and not isinstance(request_type, str):
            raise TypeError("Expected argument 'request_type' to be a str")
        pulumi.set(__self__, "request_type", request_type)
        if revoked_at and not isinstance(revoked_at, str):
            raise TypeError("Expected argument 'revoked_at' to be a str")
        pulumi.set(__self__, "revoked_at", revoked_at)

    @property
    @pulumi.getter
    def certificate(self) -> str:
        """
        The Origin CA certificate.
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter(name="expiresOn")
    def expires_on(self) -> str:
        """
        The timestamp when the certificate will expire.
        """
        return pulumi.get(self, "expires_on")

    @property
    @pulumi.getter
    def hostnames(self) -> Sequence[str]:
        """
        A list of hostnames or wildcard names bound to the certificate.
        """
        return pulumi.get(self, "hostnames")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The Origin CA Certificate unique identifier.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="requestType")
    def request_type(self) -> str:
        """
        The signature type desired on the certificate. Available values: `origin-rsa`, `origin-ecc`, `keyless-certificate`
        """
        return pulumi.get(self, "request_type")

    @property
    @pulumi.getter(name="revokedAt")
    def revoked_at(self) -> str:
        """
        The timestamp when the certificate was revoked.
        """
        return pulumi.get(self, "revoked_at")


class AwaitableGetOriginCaCertificateResult(GetOriginCaCertificateResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOriginCaCertificateResult(
            certificate=self.certificate,
            expires_on=self.expires_on,
            hostnames=self.hostnames,
            id=self.id,
            request_type=self.request_type,
            revoked_at=self.revoked_at)


def get_origin_ca_certificate(id: Optional[str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOriginCaCertificateResult:
    """
    Use this data source to retrieve an existing origin ca certificate.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example = cloudflare.get_origin_ca_certificate(id="REPLACE_ME")
    ```
    <!--End PulumiCodeChooser -->


    :param str id: The Origin CA Certificate unique identifier.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getOriginCaCertificate:getOriginCaCertificate', __args__, opts=opts, typ=GetOriginCaCertificateResult).value

    return AwaitableGetOriginCaCertificateResult(
        certificate=pulumi.get(__ret__, 'certificate'),
        expires_on=pulumi.get(__ret__, 'expires_on'),
        hostnames=pulumi.get(__ret__, 'hostnames'),
        id=pulumi.get(__ret__, 'id'),
        request_type=pulumi.get(__ret__, 'request_type'),
        revoked_at=pulumi.get(__ret__, 'revoked_at'))


@_utilities.lift_output_func(get_origin_ca_certificate)
def get_origin_ca_certificate_output(id: Optional[pulumi.Input[str]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetOriginCaCertificateResult]:
    """
    Use this data source to retrieve an existing origin ca certificate.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example = cloudflare.get_origin_ca_certificate(id="REPLACE_ME")
    ```
    <!--End PulumiCodeChooser -->


    :param str id: The Origin CA Certificate unique identifier.
    """
    ...

# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetDevicesResult',
    'AwaitableGetDevicesResult',
    'get_devices',
    'get_devices_output',
]

@pulumi.output_type
class GetDevicesResult:
    """
    A collection of values returned by getDevices.
    """
    def __init__(__self__, account_id=None, devices=None, id=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if devices and not isinstance(devices, list):
            raise TypeError("Expected argument 'devices' to be a list")
        pulumi.set(__self__, "devices", devices)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def devices(self) -> Sequence['outputs.GetDevicesDeviceResult']:
        return pulumi.get(self, "devices")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetDevicesResult(GetDevicesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDevicesResult(
            account_id=self.account_id,
            devices=self.devices,
            id=self.id)


def get_devices(account_id: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDevicesResult:
    """
    Use this data source to lookup [Devices](https://api.cloudflare.com/#devices-list-devices).


    :param str account_id: The account identifier to target for the resource.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getDevices:getDevices', __args__, opts=opts, typ=GetDevicesResult).value

    return AwaitableGetDevicesResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        devices=pulumi.get(__ret__, 'devices'),
        id=pulumi.get(__ret__, 'id'))


@_utilities.lift_output_func(get_devices)
def get_devices_output(account_id: Optional[pulumi.Input[str]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDevicesResult]:
    """
    Use this data source to lookup [Devices](https://api.cloudflare.com/#devices-list-devices).


    :param str account_id: The account identifier to target for the resource.
    """
    ...

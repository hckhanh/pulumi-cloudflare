# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetListsResult',
    'AwaitableGetListsResult',
    'get_lists',
    'get_lists_output',
]

@pulumi.output_type
class GetListsResult:
    """
    A collection of values returned by getLists.
    """
    def __init__(__self__, account_id=None, id=None, lists=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if lists and not isinstance(lists, list):
            raise TypeError("Expected argument 'lists' to be a list")
        pulumi.set(__self__, "lists", lists)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def lists(self) -> Sequence['outputs.GetListsListResult']:
        return pulumi.get(self, "lists")


class AwaitableGetListsResult(GetListsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetListsResult(
            account_id=self.account_id,
            id=self.id,
            lists=self.lists)


def get_lists(account_id: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetListsResult:
    """
    Use this data source to lookup [Lists](https://developers.cloudflare.com/api/operations/lists-get-lists).

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example = cloudflare.get_lists(account_id="f037e56e89293a057740de681ac9abbe")
    ```
    <!--End PulumiCodeChooser -->


    :param str account_id: The account identifier to target for the resource.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getLists:getLists', __args__, opts=opts, typ=GetListsResult).value

    return AwaitableGetListsResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        id=pulumi.get(__ret__, 'id'),
        lists=pulumi.get(__ret__, 'lists'))


@_utilities.lift_output_func(get_lists)
def get_lists_output(account_id: Optional[pulumi.Input[str]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetListsResult]:
    """
    Use this data source to lookup [Lists](https://developers.cloudflare.com/api/operations/lists-get-lists).

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example = cloudflare.get_lists(account_id="f037e56e89293a057740de681ac9abbe")
    ```
    <!--End PulumiCodeChooser -->


    :param str account_id: The account identifier to target for the resource.
    """
    ...

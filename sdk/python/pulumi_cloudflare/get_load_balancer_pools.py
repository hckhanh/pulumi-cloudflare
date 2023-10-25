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
from ._inputs import *

__all__ = [
    'GetLoadBalancerPoolsResult',
    'AwaitableGetLoadBalancerPoolsResult',
    'get_load_balancer_pools',
    'get_load_balancer_pools_output',
]

@pulumi.output_type
class GetLoadBalancerPoolsResult:
    """
    A collection of values returned by getLoadBalancerPools.
    """
    def __init__(__self__, account_id=None, filter=None, id=None, pools=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if filter and not isinstance(filter, dict):
            raise TypeError("Expected argument 'filter' to be a dict")
        pulumi.set(__self__, "filter", filter)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if pools and not isinstance(pools, list):
            raise TypeError("Expected argument 'pools' to be a list")
        pulumi.set(__self__, "pools", pools)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        The account identifier to target for the datasource lookups.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def filter(self) -> Optional['outputs.GetLoadBalancerPoolsFilterResult']:
        """
        One or more values used to look up Load Balancer pools. If more than one value is given all values must match in order to be included.
        """
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def pools(self) -> Sequence['outputs.GetLoadBalancerPoolsPoolResult']:
        """
        A list of Load Balancer Pools details.
        """
        return pulumi.get(self, "pools")


class AwaitableGetLoadBalancerPoolsResult(GetLoadBalancerPoolsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLoadBalancerPoolsResult(
            account_id=self.account_id,
            filter=self.filter,
            id=self.id,
            pools=self.pools)


def get_load_balancer_pools(account_id: Optional[str] = None,
                            filter: Optional[pulumi.InputType['GetLoadBalancerPoolsFilterArgs']] = None,
                            pools: Optional[Sequence[pulumi.InputType['GetLoadBalancerPoolsPoolArgs']]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLoadBalancerPoolsResult:
    """
    A datasource to find Load Balancer Pools.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example = cloudflare.get_load_balancer_pools(account_id="f037e56e89293a057740de681ac9abbe",
        filter=cloudflare.GetLoadBalancerPoolsFilterArgs(
            name="example-lb-pool",
        ))
    ```


    :param str account_id: The account identifier to target for the datasource lookups.
    :param pulumi.InputType['GetLoadBalancerPoolsFilterArgs'] filter: One or more values used to look up Load Balancer pools. If more than one value is given all values must match in order to be included.
    :param Sequence[pulumi.InputType['GetLoadBalancerPoolsPoolArgs']] pools: A list of Load Balancer Pools details.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['filter'] = filter
    __args__['pools'] = pools
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getLoadBalancerPools:getLoadBalancerPools', __args__, opts=opts, typ=GetLoadBalancerPoolsResult).value

    return AwaitableGetLoadBalancerPoolsResult(
        account_id=pulumi.get(__ret__, 'account_id'),
        filter=pulumi.get(__ret__, 'filter'),
        id=pulumi.get(__ret__, 'id'),
        pools=pulumi.get(__ret__, 'pools'))


@_utilities.lift_output_func(get_load_balancer_pools)
def get_load_balancer_pools_output(account_id: Optional[pulumi.Input[str]] = None,
                                   filter: Optional[pulumi.Input[Optional[pulumi.InputType['GetLoadBalancerPoolsFilterArgs']]]] = None,
                                   pools: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetLoadBalancerPoolsPoolArgs']]]]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetLoadBalancerPoolsResult]:
    """
    A datasource to find Load Balancer Pools.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    example = cloudflare.get_load_balancer_pools(account_id="f037e56e89293a057740de681ac9abbe",
        filter=cloudflare.GetLoadBalancerPoolsFilterArgs(
            name="example-lb-pool",
        ))
    ```


    :param str account_id: The account identifier to target for the datasource lookups.
    :param pulumi.InputType['GetLoadBalancerPoolsFilterArgs'] filter: One or more values used to look up Load Balancer pools. If more than one value is given all values must match in order to be included.
    :param Sequence[pulumi.InputType['GetLoadBalancerPoolsPoolArgs']] pools: A list of Load Balancer Pools details.
    """
    ...

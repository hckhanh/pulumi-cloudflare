# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetUserResult',
    'AwaitableGetUserResult',
    'get_user',
    'get_user_output',
]

@pulumi.output_type
class GetUserResult:
    """
    A collection of values returned by getUser.
    """
    def __init__(__self__, email=None, id=None, username=None):
        if email and not isinstance(email, str):
            raise TypeError("Expected argument 'email' to be a str")
        pulumi.set(__self__, "email", email)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if username and not isinstance(username, str):
            raise TypeError("Expected argument 'username' to be a str")
        pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def email(self) -> str:
        """
        The user's email address.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The user's unique identifier.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def username(self) -> str:
        """
        The user's username.
        """
        return pulumi.get(self, "username")


class AwaitableGetUserResult(GetUserResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUserResult(
            email=self.email,
            id=self.id,
            username=self.username)


def get_user(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUserResult:
    """
    Use this data source to retrieve information about the currently authenticated user.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    me = cloudflare.get_user()
    all = cloudflare.get_api_token_permission_groups()
    example = cloudflare.ApiToken("example",
        name="Terraform Cloud (Terraform)",
        policies=[cloudflare.ApiTokenPolicyArgs(
            permission_groups=[all.user["User Details Read"]],
            resources={
                f"com.cloudflare.api.user.{me.id}": "*",
            },
        )])
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('cloudflare:index/getUser:getUser', __args__, opts=opts, typ=GetUserResult).value

    return AwaitableGetUserResult(
        email=pulumi.get(__ret__, 'email'),
        id=pulumi.get(__ret__, 'id'),
        username=pulumi.get(__ret__, 'username'))


@_utilities.lift_output_func(get_user)
def get_user_output(opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetUserResult]:
    """
    Use this data source to retrieve information about the currently authenticated user.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_cloudflare as cloudflare

    me = cloudflare.get_user()
    all = cloudflare.get_api_token_permission_groups()
    example = cloudflare.ApiToken("example",
        name="Terraform Cloud (Terraform)",
        policies=[cloudflare.ApiTokenPolicyArgs(
            permission_groups=[all.user["User Details Read"]],
            resources={
                f"com.cloudflare.api.user.{me.id}": "*",
            },
        )])
    ```
    """
    ...

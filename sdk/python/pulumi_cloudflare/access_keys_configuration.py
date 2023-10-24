# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AccessKeysConfigurationArgs', 'AccessKeysConfiguration']

@pulumi.input_type
class AccessKeysConfigurationArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 key_rotation_interval_days: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a AccessKeysConfiguration resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[int] key_rotation_interval_days: Number of days to trigger a rotation of the keys.
        """
        AccessKeysConfigurationArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_id=account_id,
            key_rotation_interval_days=key_rotation_interval_days,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_id: Optional[pulumi.Input[str]] = None,
             key_rotation_interval_days: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if account_id is None and 'accountId' in kwargs:
            account_id = kwargs['accountId']
        if account_id is None:
            raise TypeError("Missing 'account_id' argument")
        if key_rotation_interval_days is None and 'keyRotationIntervalDays' in kwargs:
            key_rotation_interval_days = kwargs['keyRotationIntervalDays']

        _setter("account_id", account_id)
        if key_rotation_interval_days is not None:
            _setter("key_rotation_interval_days", key_rotation_interval_days)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="keyRotationIntervalDays")
    def key_rotation_interval_days(self) -> Optional[pulumi.Input[int]]:
        """
        Number of days to trigger a rotation of the keys.
        """
        return pulumi.get(self, "key_rotation_interval_days")

    @key_rotation_interval_days.setter
    def key_rotation_interval_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "key_rotation_interval_days", value)


@pulumi.input_type
class _AccessKeysConfigurationState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 key_rotation_interval_days: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering AccessKeysConfiguration resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[int] key_rotation_interval_days: Number of days to trigger a rotation of the keys.
        """
        _AccessKeysConfigurationState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_id=account_id,
            key_rotation_interval_days=key_rotation_interval_days,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_id: Optional[pulumi.Input[str]] = None,
             key_rotation_interval_days: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if account_id is None and 'accountId' in kwargs:
            account_id = kwargs['accountId']
        if key_rotation_interval_days is None and 'keyRotationIntervalDays' in kwargs:
            key_rotation_interval_days = kwargs['keyRotationIntervalDays']

        if account_id is not None:
            _setter("account_id", account_id)
        if key_rotation_interval_days is not None:
            _setter("key_rotation_interval_days", key_rotation_interval_days)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="keyRotationIntervalDays")
    def key_rotation_interval_days(self) -> Optional[pulumi.Input[int]]:
        """
        Number of days to trigger a rotation of the keys.
        """
        return pulumi.get(self, "key_rotation_interval_days")

    @key_rotation_interval_days.setter
    def key_rotation_interval_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "key_rotation_interval_days", value)


class AccessKeysConfiguration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 key_rotation_interval_days: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Create a AccessKeysConfiguration resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[int] key_rotation_interval_days: Number of days to trigger a rotation of the keys.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccessKeysConfigurationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a AccessKeysConfiguration resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param AccessKeysConfigurationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccessKeysConfigurationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            AccessKeysConfigurationArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 key_rotation_interval_days: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccessKeysConfigurationArgs.__new__(AccessKeysConfigurationArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["key_rotation_interval_days"] = key_rotation_interval_days
        super(AccessKeysConfiguration, __self__).__init__(
            'cloudflare:index/accessKeysConfiguration:AccessKeysConfiguration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            key_rotation_interval_days: Optional[pulumi.Input[int]] = None) -> 'AccessKeysConfiguration':
        """
        Get an existing AccessKeysConfiguration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource.
        :param pulumi.Input[int] key_rotation_interval_days: Number of days to trigger a rotation of the keys.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccessKeysConfigurationState.__new__(_AccessKeysConfigurationState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["key_rotation_interval_days"] = key_rotation_interval_days
        return AccessKeysConfiguration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="keyRotationIntervalDays")
    def key_rotation_interval_days(self) -> pulumi.Output[int]:
        """
        Number of days to trigger a rotation of the keys.
        """
        return pulumi.get(self, "key_rotation_interval_days")


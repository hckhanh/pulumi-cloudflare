# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['LogpullRetentionArgs', 'LogpullRetention']

@pulumi.input_type
class LogpullRetentionArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[bool],
                 zone_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a LogpullRetention resource.
        :param pulumi.Input[bool] enabled: Whether you wish to retain logs or not.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        LogpullRetentionArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            enabled=enabled,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             enabled: pulumi.Input[bool],
             zone_id: pulumi.Input[str],
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("enabled", enabled)
        _setter("zone_id", zone_id)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        Whether you wish to retain logs or not.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

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
class _LogpullRetentionState:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LogpullRetention resources.
        :param pulumi.Input[bool] enabled: Whether you wish to retain logs or not.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        _LogpullRetentionState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            enabled=enabled,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             enabled: Optional[pulumi.Input[bool]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if enabled is not None:
            _setter("enabled", enabled)
        if zone_id is not None:
            _setter("zone_id", zone_id)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether you wish to retain logs or not.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

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


class LogpullRetention(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Allows management of the Logpull Retention settings used to control whether or not to retain HTTP request logs.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.LogpullRetention("example",
            enabled=True,
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/logpullRetention:LogpullRetention example <zone_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Whether you wish to retain logs or not.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LogpullRetentionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Allows management of the Logpull Retention settings used to control whether or not to retain HTTP request logs.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.LogpullRetention("example",
            enabled=True,
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/logpullRetention:LogpullRetention example <zone_id>
        ```

        :param str resource_name: The name of the resource.
        :param LogpullRetentionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LogpullRetentionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            LogpullRetentionArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LogpullRetentionArgs.__new__(LogpullRetentionArgs)

            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
        super(LogpullRetention, __self__).__init__(
            'cloudflare:index/logpullRetention:LogpullRetention',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'LogpullRetention':
        """
        Get an existing LogpullRetention resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Whether you wish to retain logs or not.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LogpullRetentionState.__new__(_LogpullRetentionState)

        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["zone_id"] = zone_id
        return LogpullRetention(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        Whether you wish to retain logs or not.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

